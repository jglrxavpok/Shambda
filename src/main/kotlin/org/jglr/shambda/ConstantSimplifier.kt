package org.jglr.shambda

import org.antlr.v4.runtime.ParserRuleContext
import org.jglr.sbm.types.Type
import org.jglr.sbm.utils.ModuleConstant
import org.jglr.shambda.grammar.ShambdaBaseVisitor
import org.jglr.shambda.grammar.ShambdaParser
import org.jglr.shambda.types.suffixType
import java.math.BigInteger

class ConstantSimplifier(private val compiler: ShambdaCompiler) : ShambdaBaseVisitor<ModuleConstant>() {

    private val INT2LONG_MASK = 0x00000000FFFFFFFFL
    private val SIGNEDLONG2UNSIGNED = BigInteger("FFFFFFFFFFFFFFFF", 16)
    private var currentName: String = ""
    private var currentType: Type? = null

    /**
     * The context must only have constant expressions and computations
     */
    fun simplify(context: ShambdaParser.MemberDeclarationContext) {
        // TODO: Handle multi-statements (situation impossible up when writing of this function)
        currentName = context.parameter(0).Identifier().text
        currentType = null
        if (context.parameter(0).type() != null) {
            currentType = compiler.buildType(context.parameter(0).type())
        }

        val lastStatement = context.functionBody().statement().last()
        val expression = lastStatement.expression()

        val constant = expression.accept(this)
        compiler.writeAndRegisterConstant(constant, null) // TODO: Generate constantID
    }

    override fun visitDivExpr(ctx: ShambdaParser.DivExprContext?): ModuleConstant {
        val left = ctx!!.expression(0).accept(this)
        val right = ctx.expression(1).accept(this)
        checkTypeAndSuffix(ctx.DivOperator().text, left, right, ctx)
        return handleOperation(left, right, ctx.DivOperator().text, Long::div, BigInteger::div, Double::div, Float::div)
    }

    override fun visitMultExpr(ctx: ShambdaParser.MultExprContext?): ModuleConstant {
        val left = ctx!!.expression(0).accept(this)
        val right = ctx.expression(1).accept(this)
        checkTypeAndSuffix(ctx.MultOperator().text, left, right, ctx)
        return handleOperation(left, right, ctx.MultOperator().text, Long::times, BigInteger::times, Double::times, Float::times)
    }

    override fun visitPlusExpr(ctx: ShambdaParser.PlusExprContext?): ModuleConstant {
        val left = ctx!!.expression(0).accept(this)
        val right = ctx.expression(1).accept(this)
        checkTypeAndSuffix(ctx.AddOperator().text, left, right, ctx)
        return handleOperation(left, right, ctx.AddOperator().text, Long::plus, BigInteger::plus, Double::plus, Float::plus)
    }

    override fun visitMinusExpr(ctx: ShambdaParser.MinusExprContext?): ModuleConstant {
        val left = ctx!!.expression(0).accept(this)
        val right = ctx.expression(1).accept(this)
        checkTypeAndSuffix(ctx.SubOperator().text, left, right, ctx)
        return handleOperation(left, right, ctx.SubOperator().text, Long::minus, BigInteger::minus, Double::minus, Float::minus)
    }

    override fun visitUnaryMinusExpr(ctx: ShambdaParser.UnaryMinusExprContext?): ModuleConstant {
        val value = ctx!!.expression().accept(this)
        val expectedType = suffixType(ctx.SubOperator().text)
        if(expectedType != value.type)
            compiler.typeError("Invalid use of unary operator ${ctx.SubOperator().text} <$expectedType> with type <${value.type}>", ctx)
        val name = "\$constant_neg(${value.name})"
        return when(expectedType) {
            ShambdaCompiler.FLOAT_TYPE -> ModuleConstant(name, expectedType, longArrayOf(value.bitPattern[0] xor (1L shl 31))) // invert sign bit
            ShambdaCompiler.UNSIGNED_INT_TYPE, ShambdaCompiler.UNSIGNED_LONG_TYPE -> {
                compiler.typeError("Cannot negate unsigned value of type <${expectedType}>", ctx)
                value // Added just so the Kotlin compiler is not sad
            }
            ShambdaCompiler.INT_TYPE -> ModuleConstant(name, expectedType, longArrayOf((-value.bitPattern[0].toInt()).toLong() and INT2LONG_MASK))
            ShambdaCompiler.LONG_TYPE -> {
                val result = -(value.bitPattern[0] + (value.bitPattern[1] shl 32))
                ModuleConstant(name, expectedType, longArrayOf(result and INT2LONG_MASK, (result shr 32) and INT2LONG_MASK))
            }
            ShambdaCompiler.DOUBLE_TYPE -> ModuleConstant(name, expectedType, longArrayOf(value.bitPattern[0], value.bitPattern[1] xor (1L shl 31))) // invert sign bit
            else -> TODO("Not implemented for type $expectedType")
        }
    }

    private fun handleOperation(left: ModuleConstant, right: ModuleConstant, opname: String, opLongs: (Long, Long) -> Long,
                                opBigInteger: (BigInteger, BigInteger) -> BigInteger, opDouble: (Double, Double) -> Double,
                                opFloat: (Float, Float) -> Float): ModuleConstant {
        if(left.type == ShambdaCompiler.INT_TYPE || left.type == ShambdaCompiler.UNSIGNED_INT_TYPE) {
            return performOperation(left, right, opname, {a, b -> longArrayOf(opLongs(a[0], b[0]) and INT2LONG_MASK)})
        } else if(left.type == ShambdaCompiler.FLOAT_TYPE) {
            return performOperation(left, right, opname, {a, b ->
                val result = opFloat(java.lang.Float.intBitsToFloat(a[0].toInt()), java.lang.Float.intBitsToFloat(b[0].toInt()))
                return@performOperation longArrayOf(java.lang.Float.floatToRawIntBits(result).toLong() and INT2LONG_MASK)
            })
        } else if(left.type == ShambdaCompiler.LONG_TYPE) {
            return performOperation(left, right, opname, {a, b ->
                val result = opLongs(a[0] + (a[1] shl 32), (b[0] + (b[1] shl 32)))
                return@performOperation longArrayOf(result and INT2LONG_MASK, (result shr 32) and INT2LONG_MASK) // FIXME: two fields
            })
        } else if(left.type == ShambdaCompiler.UNSIGNED_LONG_TYPE) {
            return performOperation(left, right, opname, {a: LongArray, b: LongArray ->
                val leftLong = opBigInteger(BigInteger.valueOf(a[1] shl 32).and(SIGNEDLONG2UNSIGNED), BigInteger.valueOf(a[0]).and(SIGNEDLONG2UNSIGNED))
                val rightLong = opBigInteger(BigInteger.valueOf(b[1] shl 32).and(SIGNEDLONG2UNSIGNED), BigInteger.valueOf(b[0]).and(SIGNEDLONG2UNSIGNED))
                val result = opBigInteger(leftLong, rightLong)
                return@performOperation longArrayOf(result.toLong() and INT2LONG_MASK, result.shiftRight(32).toLong() and INT2LONG_MASK)
            })
        } else /*if(left.type == ShambdaCompiler.DOUBLE_TYPE) THIS IS THE ONLY POSSIBLE TYPE NOW*/ {
            return performOperation(left, right, opname, {a, b ->
                val result = opDouble(java.lang.Double.longBitsToDouble(a[0] + (a[1] shl 32)), java.lang.Double.longBitsToDouble(b[0] + (b[1] shl 32)))
                val resultBits = java.lang.Double.doubleToRawLongBits(result)
                return@performOperation longArrayOf(resultBits and INT2LONG_MASK, (resultBits shr 32) and INT2LONG_MASK)
            })
        }
    }

    private fun performOperation(left: ModuleConstant, right: ModuleConstant, opName: String, operation: (LongArray, LongArray) -> LongArray): ModuleConstant {
        val operationResult = operation(left.bitPattern, right.bitPattern)
        return ModuleConstant("\$constant_$left$opName$right", left.type, operationResult)
    }

    private fun checkTypeAndSuffix(operator: String, left: ModuleConstant, right: ModuleConstant, location: ParserRuleContext) {
        val expectedType = suffixType(operator)
        if(left.type != expectedType || right.type != expectedType) {
            compiler.typeError("Invalid use of operator <$expectedType> $operator <$expectedType>: <${left.type}> $operator <${right.type}>", location)
        }
    }

    override fun visitFunctionCall(ctx: ShambdaParser.FunctionCallContext?): ModuleConstant {
        TODO()
    }

    override fun visitFunctionCallExpr(ctx: ShambdaParser.FunctionCallExprContext?): ModuleConstant = ctx!!.functionCall().accept(this)

    override fun visitConstantExpressionExpr(ctx: ShambdaParser.ConstantExpressionExprContext?): ModuleConstant  = ctx!!.constantExpression().accept(this)

    override fun visitWrappedExpr(ctx: ShambdaParser.WrappedExprContext?): ModuleConstant = ctx!!.expression().accept(this)

    override fun visitConstantExpression(ctx: ShambdaParser.ConstantExpressionContext?) = compiler.generateConstant(currentName, currentType, ctx)
}