// Generated from F:/Programming/Java/Languages/Shambda/src/main/java/antlr/jambda\Shambda.g4 by ANTLR 4.6
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
	 * Visit a parse tree produced by {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ShambdaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShambdaParser#dereference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(ShambdaParser.DereferenceContext ctx);
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