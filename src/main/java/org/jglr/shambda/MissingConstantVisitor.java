package org.jglr.shambda;

import org.jglr.sbm.utils.ModuleConstant;
import org.jglr.shambda.grammar.ShambdaBaseVisitor;
import org.jglr.shambda.grammar.ShambdaParser;

public class MissingConstantVisitor extends ShambdaBaseVisitor<Void> {

    private ShambdaCompiler compiler;

    public MissingConstantVisitor(ShambdaCompiler compiler) {
        this.compiler = compiler;
    }

    @Override
    public Void visitMultExpr(ShambdaParser.MultExprContext ctx) {
        ctx.expression().forEach(compiler::handleMissingConstants);
        return null;
    }

    @Override
    public Void visitDivExpr(ShambdaParser.DivExprContext ctx) {
        ctx.expression().forEach(compiler::handleMissingConstants);
        return null;
    }

    @Override
    public Void visitPlusExpr(ShambdaParser.PlusExprContext ctx) {
        ctx.expression().forEach(compiler::handleMissingConstants);
        return null;
    }

    @Override
    public Void visitUnaryMinusExpr(ShambdaParser.UnaryMinusExprContext ctx) {
        compiler.handleMissingConstants(ctx.expression());
        return null;
    }

    @Override
    public Void visitMinusExpr(ShambdaParser.MinusExprContext ctx) {
        ctx.expression().forEach(compiler::handleMissingConstants);
        return null;
    }

    @Override
    public Void visitIdExpr(ShambdaParser.IdExprContext ctx) {
        return null;
    }

    @Override
    public Void visitConstantExpressionExpr(ShambdaParser.ConstantExpressionExprContext ctx) {
        ShambdaParser.ConstantExpressionContext constant = ctx.constantExpression();
        String id = compiler.getConstantID(constant);
        if( ! compiler.registeredConstants.containsKey(id)) {
            ModuleConstant constantComp = compiler.generateConstant(id, compiler.getTypeInferer().inferType(constant), constant);
            compiler.writeAndRegisterConstant(constantComp, id);
        }
        return null;
    }

    @Override
    public Void visitWrappedExpr(ShambdaParser.WrappedExprContext ctx) {
        compiler.handleMissingConstants(ctx.expression());
        return null;
    }

    @Override
    public Void visitFunctionCallExpr(ShambdaParser.FunctionCallExprContext ctx) {
        ShambdaParser.FunctionCallContext call = ctx.functionCall();
        call.expression().forEach(compiler::handleMissingConstants);
        return null;
    }

    @Override
    public Void visitDereferenceExpr(ShambdaParser.DereferenceExprContext ctx) {
        compiler.handleMissingConstants(ctx.expression());
        return null;
    }
}
