// Generated from F:/Programming/Java/Languages/Shambda/src/main/java/antlr/jambda\Shambda.g4 by ANTLR 4.6
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
	 * Enter a parse tree produced by {@link ShambdaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(ShambdaParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(ShambdaParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#uniformDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUniformDeclaration(ShambdaParser.UniformDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#uniformDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUniformDeclaration(ShambdaParser.UniformDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ShambdaParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ShambdaParser.FunctionDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link ShambdaParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(ShambdaParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(ShambdaParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(ShambdaParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(ShambdaParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#unsignedLong}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedLong(ShambdaParser.UnsignedLongContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#unsignedLong}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedLong(ShambdaParser.UnsignedLongContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#longNumber}.
	 * @param ctx the parse tree
	 */
	void enterLongNumber(ShambdaParser.LongNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#longNumber}.
	 * @param ctx the parse tree
	 */
	void exitLongNumber(ShambdaParser.LongNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#doubleNumber}.
	 * @param ctx the parse tree
	 */
	void enterDoubleNumber(ShambdaParser.DoubleNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#doubleNumber}.
	 * @param ctx the parse tree
	 */
	void exitDoubleNumber(ShambdaParser.DoubleNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#floatingPointNumber}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointNumber(ShambdaParser.FloatingPointNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#floatingPointNumber}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointNumber(ShambdaParser.FloatingPointNumberContext ctx);
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
	 * Enter a parse tree produced by {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ShambdaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ShambdaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShambdaParser#dereference}.
	 * @param ctx the parse tree
	 */
	void enterDereference(ShambdaParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#dereference}.
	 * @param ctx the parse tree
	 */
	void exitDereference(ShambdaParser.DereferenceContext ctx);
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
	 * Enter a parse tree produced by {@link ShambdaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ShambdaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShambdaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ShambdaParser.TypeContext ctx);
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