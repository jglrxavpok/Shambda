// Generated from F:/Programming/Java/Languages/Shambda/src/main/java/antlr/shambda\Shambda.g4 by ANTLR 4.6
package org.jglr.shambda.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShambdaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShambdaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(ShambdaParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#setImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetImport(ShambdaParser.SetImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(ShambdaParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#uniformDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniformDeclaration(ShambdaParser.UniformDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ShambdaParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(ShambdaParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(ShambdaParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wrappedExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrappedExpr(ShambdaParser.WrappedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereferenceExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereferenceExpr(ShambdaParser.DereferenceExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(ShambdaParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpressionExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpressionExpr(ShambdaParser.ConstantExpressionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(ShambdaParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(ShambdaParser.DivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(ShambdaParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(ShambdaParser.MinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpr(ShambdaParser.PlusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(ShambdaParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ShambdaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(ShambdaParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ShambdaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ShambdaParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ShambdaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#storageClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClass(ShambdaParser.StorageClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ShambdaParser.ParameterContext ctx);
}