// Generated from F:/Programming/Java/Languages/Shambda/src/main/java/antlr/shambda\Shambda.g4 by ANTLR 4.6
package org.jglr.shambda.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShambdaParser}.
 */
public interface ShambdaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ShambdaParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ShambdaParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#setImport}.
	 * @param ctx the parse tree
	 */
	void enterSetImport(ShambdaParser.SetImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#setImport}.
	 * @param ctx the parse tree
	 */
	void exitSetImport(ShambdaParser.SetImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(ShambdaParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(ShambdaParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(ShambdaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(ShambdaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(ShambdaParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(ShambdaParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(ShambdaParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(ShambdaParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code providedExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterProvidedExpr(ShambdaParser.ProvidedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code providedExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitProvidedExpr(ShambdaParser.ProvidedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereferenceExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDereferenceExpr(ShambdaParser.DereferenceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereferenceExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDereferenceExpr(ShambdaParser.DereferenceExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpressionExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpressionExpr(ShambdaParser.ConstantExpressionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpressionExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpressionExpr(ShambdaParser.ConstantExpressionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(ShambdaParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(ShambdaParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(ShambdaParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(ShambdaParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(ShambdaParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(ShambdaParser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wrappedExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterWrappedExpr(ShambdaParser.WrappedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wrappedExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitWrappedExpr(ShambdaParser.WrappedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniformExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUniformExpr(ShambdaParser.UniformExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniformExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUniformExpr(ShambdaParser.UniformExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(ShambdaParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(ShambdaParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(ShambdaParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(ShambdaParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(ShambdaParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(ShambdaParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementAccessExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterElementAccessExpr(ShambdaParser.ElementAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementAccessExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitElementAccessExpr(ShambdaParser.ElementAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accessExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAccessExpr(ShambdaParser.AccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accessExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAccessExpr(ShambdaParser.AccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(ShambdaParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(ShambdaParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ShambdaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ShambdaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(ShambdaParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(ShambdaParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ShambdaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ShambdaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ShambdaParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ShambdaParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link ShambdaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(ShambdaParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link ShambdaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(ShambdaParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pointerType}
	 * labeled alternative in {@link ShambdaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(ShambdaParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pointerType}
	 * labeled alternative in {@link ShambdaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(ShambdaParser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseType}
	 * labeled alternative in {@link ShambdaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(ShambdaParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseType}
	 * labeled alternative in {@link ShambdaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(ShambdaParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compositeType}
	 * labeled alternative in {@link ShambdaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterCompositeType(ShambdaParser.CompositeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compositeType}
	 * labeled alternative in {@link ShambdaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitCompositeType(ShambdaParser.CompositeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#storageClass}.
	 * @param ctx the parse tree
	 */
	void enterStorageClass(ShambdaParser.StorageClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#storageClass}.
	 * @param ctx the parse tree
	 */
	void exitStorageClass(ShambdaParser.StorageClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ShambdaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ShambdaParser.ParameterContext ctx);
}