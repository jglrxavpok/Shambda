package org.jglr.shambda

import org.jglr.shambda.grammar.ShambdaBaseVisitor
import org.jglr.shambda.grammar.ShambdaParser

object ConstantFilterVisitor : ShambdaBaseVisitor<Boolean>() {

    override fun visitConstantExpression(ctx: ShambdaParser.ConstantExpressionContext?): Boolean = true

    override fun visitDivExpr(ctx: ShambdaParser.DivExprContext?): Boolean {
        val left = ctx!!.expression(0)
        val right = ctx.expression(1)
        return left.accept(this) && right.accept(this)
    }

    override fun visitPlusExpr(ctx: ShambdaParser.PlusExprContext?): Boolean {
        val left = ctx!!.expression(0)
        val right = ctx.expression(1)
        return left.accept(this) && right.accept(this)
    }

    override fun visitMinusExpr(ctx: ShambdaParser.MinusExprContext?): Boolean {
        val left = ctx!!.expression(0)
        val right = ctx.expression(1)
        return left.accept(this) && right.accept(this)
    }

    override fun visitUnaryMinusExpr(ctx: ShambdaParser.UnaryMinusExprContext?): Boolean {
        return ctx!!.expression().accept(this)
    }

    override fun visitMultExpr(ctx: ShambdaParser.MultExprContext?): Boolean {
        val left = ctx!!.expression(0)
        val right = ctx.expression(1)
        return left.accept(this) && right.accept(this)
    }

    override fun visitWrappedExpr(ctx: ShambdaParser.WrappedExprContext?): Boolean {
        return ctx!!.expression().accept(this)
    }

    override fun visitConstantExpressionExpr(ctx: ShambdaParser.ConstantExpressionExprContext?): Boolean = true

    override fun defaultResult(): Boolean = false
}