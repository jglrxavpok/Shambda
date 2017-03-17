package org.jglr.shambda.types

import org.antlr.v4.runtime.tree.ParseTreeVisitor
import org.jglr.inference.expressions.Expression
import org.jglr.inference.expressions.Literal
import org.jglr.inference.expressions.TypeDefinition
import org.jglr.inference.types.FunctionType
import org.jglr.inference.types.TupleType
import org.jglr.sbm.types.FunctionType as SBMFunctionType
import org.jglr.sbm.types.Type
import org.jglr.shambda.ShambdaCompiler
import org.jglr.shambda.ShambdaTypeInferer
import org.jglr.shambda.grammar.ShambdaBaseVisitor
import org.jglr.shambda.grammar.ShambdaParser

class InferenceMapper(val compiler: ShambdaCompiler) : ShambdaBaseVisitor<Expression>() {

    fun map(expression: ShambdaParser.ExpressionContext): Expression {
        return expression.accept(this)
    }

    override fun visitPlusExpr(ctx: ShambdaParser.PlusExprContext): Expression = (map(ctx.expression(0)) + map(ctx.expression(1))).apply { type = mapType(suffixType(ctx.AddOperator().text)) }
    override fun visitMinusExpr(ctx: ShambdaParser.MinusExprContext): Expression = (map(ctx.expression(0)) - map(ctx.expression(1))).apply { type = mapType(suffixType(ctx.SubOperator().text)) }
    override fun visitMultExpr(ctx: ShambdaParser.MultExprContext): Expression = (map(ctx.expression(0)) * map(ctx.expression(1))).apply { type = mapType(suffixType(ctx.MultOperator().text)) }
    override fun visitDivExpr(ctx: ShambdaParser.DivExprContext): Expression = (map(ctx.expression(0)) / map(ctx.expression(1))).apply { type = mapType(suffixType(ctx.DivOperator().text)) }

    override fun visitConstantExpression(ctx: ShambdaParser.ConstantExpressionContext): Expression {
        return Literal(ctx.text, mapType(compiler.typeInferer.inferType(ctx)))
    }

    private fun mapType(type: Type): TypeDefinition {
        return when(type) {
            is SBMFunctionType -> {
                val arg = TupleType(type.parameters.map(this::mapType).toTypedArray())
                FunctionType(arg, mapType(type.returnType))
            } ShambdaCompiler.DOUBLE_TYPE -> {
                Double
            } ShambdaCompiler.LONG_TYPE -> {
                Long
            } ShambdaCompiler.FLOAT_TYPE -> {
                Float
            } ShambdaCompiler.INT_TYPE -> {
                Integer
            } ShambdaCompiler.UNSIGNED_LONG_TYPE -> {
                ULong
            } ShambdaCompiler.UNSIGNED_INT_TYPE -> {
                UInteger
            } ShambdaCompiler.BOOL_TYPE -> {
                Bool
            } ShambdaCompiler.SAMPLER2D_TYPE -> {
                Sampler2D
            } else -> {
                null!!
            }
        }
    }
}