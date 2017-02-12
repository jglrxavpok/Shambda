package org.jglr.shambda;

import org.jglr.sbm.types.FunctionType;
import org.jglr.sbm.types.Type;
import org.jglr.shambda.grammar.ShambdaParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.jglr.shambda.ShambdaCompiler.*;

public class ShambdaTypeInferer {

    private ShambdaCompiler compiler;

    public ShambdaTypeInferer(ShambdaCompiler compiler) {
        this.compiler = compiler;
    }

    public Type inferType(ShambdaParser.ConstantExpressionContext expression) {
        if(expression.Integer() != null) {
            return INT_TYPE;
        }
        if(expression.LongNumber() != null) {
            return LONG_TYPE;
        }
        if(expression.FloatingPointNumber() != null) {
            return FLOAT_TYPE;
        }
        if(expression.DoubleNumber() != null) {
            return DOUBLE_TYPE;
        }
        if(expression.UnsignedInteger() != null) {
            return UNSIGNED_INT_TYPE;
        }
        if(expression.UnsignedLong() != null) {
            return UNSIGNED_LONG_TYPE;
        }
        if(expression.Boolean() != null) {
            return BOOL_TYPE;
        }
        return null;
    }

    public FunctionType inferFunctionType(ShambdaParser.FunctionDeclarationContext context, List<ShambdaParser.ParameterContext> parameters) {
        // TODO
        return null;
    }
}
