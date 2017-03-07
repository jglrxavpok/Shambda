package org.jglr.shambda

import org.jglr.sbm.types.Type
import org.jglr.sbm.utils.ModuleConstant
import org.jglr.shambda.grammar.ShambdaBaseVisitor
import org.jglr.shambda.grammar.ShambdaParser

class ConstantSimplifier(private val compiler: ShambdaCompiler) : ShambdaBaseVisitor<ModuleConstant>() {


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

        expression.accept(this)
    }

    override fun visitConstantExpression(ctx: ShambdaParser.ConstantExpressionContext?) = compiler.generateConstant(currentName, currentType, ctx)
}