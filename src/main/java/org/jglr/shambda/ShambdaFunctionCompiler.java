package org.jglr.shambda;

import org.jglr.sbm.types.FunctionType;
import org.jglr.sbm.types.PointerType;
import org.jglr.sbm.types.Type;
import org.jglr.sbm.types.VectorType;
import org.jglr.sbm.utils.FunctionGenerator;
import org.jglr.sbm.utils.ModuleComponent;
import org.jglr.sbm.utils.ModuleFunction;
import org.jglr.sbm.utils.ModuleVariable;
import org.jglr.shambda.grammar.ShambdaParser;

import java.util.List;

public class ShambdaFunctionCompiler {
    private ShambdaCompiler compiler;

    public ShambdaFunctionCompiler(ShambdaCompiler compiler) {
        this.compiler = compiler;
    }

    public void compile(FunctionGenerator generator, ShambdaParser.FunctionDeclarationContext context) {
        ModuleFunction function = generator.getFunction();
        ShambdaParser.FunctionBodyContext body = context.functionBody();
        List<ShambdaParser.StatementContext> statements = body.statement();
        ModuleComponent lastValue = null;
        for (int i = 0; i < statements.size(); i++) {
            ShambdaParser.StatementContext statement = statements.get(i);
            if(statement.expression() != null) {
                ShambdaParser.ExpressionContext expression = statement.expression();
                if(expression.functionCall() != null) {
                    lastValue = compileFunctionCall(function, generator, expression.functionCall());
                }
            }
            // TODO: variable assignment
        }
        if(lastValue != null && lastValue.getType().equals(function.getReturnType())) {
            generator.returnValue(lastValue);
        } else {
            if(function.getReturnType().equals(Type.VOID))
                generator.returnVoid();
            else {
                compiler.compileError("Returned value and return type do not match in function "+function.getName());
            }
        }
        generator.end();
    }

    private ModuleComponent compileFunctionCall(ModuleFunction function, FunctionGenerator generator, ShambdaParser.FunctionCallContext context) {
        String name = function.getName();
        String calledName = context.Identifier().getText();
        List<ShambdaParser.ExpressionContext> parameters = context.expression();
        ModuleComponent[] arguments = new ModuleComponent[parameters.size()];
        for(int i = 0;i<parameters.size();i++) {
            arguments[i] = compileExpression(function, generator, parameters.get(i));
        }
        if(isStandardFunction(calledName)) {
            return handleStandardFunction(calledName, arguments, generator);
        } else {
            ModuleComponent component = compiler.getComponantWithName(calledName);
            if(component == null)
                compiler.compileError("Unknown symbol", context);
            if (component.getType() instanceof FunctionType) {
                // TODO: function call
                throw new UnsupportedOperationException("not implemented yet");
            } else {

                return component;
            }
        }
    }

    private boolean isStandardFunction(String calledName) {
        if(calledName.startsWith("vec")) {
            String width = calledName.substring("vec".length());
            try {
                Integer.parseInt(width);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        }
        return false;
    }

    private ModuleComponent handleStandardFunction(String calledName, ModuleComponent[] arguments, FunctionGenerator generator) {
        if(calledName.startsWith("vec")) {
            String width = calledName.substring("vec".length());
            // TODO: All arguments must be of the same type
            int size = Integer.parseInt(width);
            VectorType type = new VectorType(arguments[0].getType(), size);
            return generator.compositeConstruct(type, arguments);
        }
        return null;
    }

    private ModuleComponent compileExpression(ModuleFunction function, FunctionGenerator generator, ShambdaParser.ExpressionContext context) {
        if(context.constantExpression() != null) {
            return compiler.getConstant(compiler.getConstantID(context.constantExpression()));
        }
        if(context.functionCall() != null) {
            return compileFunctionCall(function, generator, context.functionCall());
        }
        if(context.expression() != null) { // has a sub-expression
            return compileExpression(function, generator, context.expression());
        }
        if(context.dereference() != null) {
            return compileDereference(function, generator, context.dereference());
        }
        return null;
    }

    private ModuleComponent compileDereference(ModuleFunction function, FunctionGenerator generator, ShambdaParser.DereferenceContext context) {
        ModuleComponent pointer = compileExpression(function, generator, context.expression());
        if(! (pointer.getType() instanceof PointerType)) {
            compiler.compileError("Derefencing a non-pointer type", context);
        }
        ModuleVariable result = new ModuleVariable("$tmp_compiledereference$", ((PointerType)pointer.getType()).getType());
        generator.load(result, new ModuleVariable(pointer.getName(), pointer.getType()));
        return result;
    }
}
