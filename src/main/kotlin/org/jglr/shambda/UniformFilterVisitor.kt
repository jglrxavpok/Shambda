package org.jglr.shambda

import org.jglr.shambda.grammar.ShambdaBaseVisitor
import org.jglr.shambda.grammar.ShambdaParser

object UniformFilterVisitor : ShambdaBaseVisitor<Boolean>() {

    override fun visitUniformExpr(ctx: ShambdaParser.UniformExprContext?): Boolean = true

    override fun defaultResult(): Boolean = false
}