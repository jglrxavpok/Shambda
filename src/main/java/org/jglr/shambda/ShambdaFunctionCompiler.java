package org.jglr.shambda;

import org.jglr.sbm.types.*;
import org.jglr.sbm.utils.FunctionGenerator;
import org.jglr.sbm.utils.ModuleComponent;
import org.jglr.sbm.utils.ModuleFunction;
import org.jglr.sbm.utils.ModuleVariable;
import org.jglr.shambda.grammar.ShambdaParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShambdaFunctionCompiler {
    private ShambdaCompiler compiler;
    private int tmpID;

    public ShambdaFunctionCompiler(ShambdaCompiler compiler) {
        this.compiler = compiler;
    }

    public void compile(FunctionGenerator generator, ShambdaParser.FunctionDeclarationContext context) {
        Map<String, ModuleVariable> parameters = new HashMap<>();
        for (int i = 1; i < context.parameter().size(); i++) {
            ShambdaParser.ParameterContext paramData = context.parameter().get(i);
            ModuleVariable parameter = new ModuleVariable(paramData.Identifier().getText(), compiler.buildType(paramData.type()));
            parameters.put(parameter.getName(), parameter);
            generator.parameter(parameter);
        }
        ModuleFunction function = generator.getFunction();
        ShambdaParser.FunctionBodyContext body = context.functionBody();
        List<ShambdaParser.StatementContext> statements = body.statement();
        ModuleComponent lastValue = null;
        for (int i = 0; i < statements.size(); i++) {
            ShambdaParser.StatementContext statement = statements.get(i);
            if(statement.expression() != null) {
                ShambdaParser.ExpressionContext expression = statement.expression();
                lastValue = compileExpression(function, generator, expression, parameters);
            }
            // TODO: variable assignment
        }
        if(lastValue != null && lastValue.getType().equals(function.getReturnType())) {
            generator.returnValue(lastValue);
        } else {
            if(function.getReturnType().equals(Type.VOID))
                generator.returnVoid();
            else {
                compiler.compileError("Returned value and return type do not match in function "+function.getName()+": " +
                        "Returned value type is "+lastValue.getType()+" and return type is "+function.getReturnType(), context);
            }
        }
        generator.end();
    }

    private ModuleComponent compileFunctionCall(ModuleFunction function, FunctionGenerator generator, ShambdaParser.FunctionCallContext context, Map<String, ModuleVariable> parameterVars) {
        String name = function.getName();
        String calledName = context.Identifier().getText();
        List<ShambdaParser.ExpressionContext> parameters = context.expression();
        ModuleComponent[] arguments = new ModuleComponent[parameters.size()];
        for(int i = 0;i<parameters.size();i++) {
            arguments[i] = compileExpression(function, generator, parameters.get(i), parameterVars);
        }
        if(isStandardFunction(calledName)) {
            return handleStandardFunction(calledName, arguments, generator, context);
        } else {
            ModuleComponent component = compiler.getComponantWithName(calledName);
            if(component == null)
                compiler.compileError("Unknown symbol", context);
            if (component.getType() instanceof FunctionType) {
                return generator.callFunction((ModuleFunction) component, arguments);
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
        if(calledName.equals("sample")) {
            return true;
        }
        return false;
    }

    private ModuleComponent handleStandardFunction(String calledName, ModuleComponent[] arguments, FunctionGenerator generator, ShambdaParser.FunctionCallContext context) {
        if(calledName.startsWith("vec")) {
            String width = calledName.substring("vec".length());
            Type firstType = arguments[0].getType();
            for (ModuleComponent c : arguments) {
                if( ! c.getType().equals(firstType))
                    compiler.compileError("Arguments must all have the same type", context);

                if( ! c.getType().isScalar()) {
                    compiler.compileError("Vectors can only be created with scalar components, use arrays otherwise", context);
                }
            }
            int size = Integer.parseInt(width);
            VectorType type = new VectorType(firstType, size);
            return generator.compositeConstruct(type, arguments);
        }
        if(calledName.equals("sample")) {
            if( ! (arguments[0].getType() instanceof SampledImageType)) {
                compiler.compileError("First argument of sample must be a sampled image type", context);
            }
            if( ! (arguments[1].getType() instanceof VectorType)) {
                compiler.compileError("Second argument of sample must be a vector type", context);
            }
            SampledImageType sampledType = (SampledImageType) arguments[0].getType();
            ModuleVariable var = new ModuleVariable("$tmp_sample"+nextTmpID()+"$", new VectorType(sampledType.getImageType().getSampledType(), 4));
            generator.sampleImageImplicitLOD(var, arguments[0], arguments[1]);
            return var;
        }
        return null;
    }

    private ModuleComponent compileExpression(ModuleFunction function, FunctionGenerator generator, ShambdaParser.ExpressionContext context, Map<String, ModuleVariable> parameters) {
        if(context.constantExpression() != null) {
            return compiler.getConstant(compiler.getConstantID(context.constantExpression()));
        }
        if(context.functionCall() != null) {
            return compileFunctionCall(function, generator, context.functionCall(), parameters);
        }
        if(context.expression() != null) { // has a sub-expression
            return compileExpression(function, generator, context.expression(), parameters);
        }
        if(context.dereference() != null) {
            return compileDereference(function, generator, context.dereference(), parameters);
        }
        if(context.Identifier() != null) {
            String id = context.Identifier().getText();
            if(parameters.containsKey(id)) {
                return parameters.get(id);
            }
            return compiler.getComponantWithName(id);
        }
        return null;
    }

    private ModuleComponent compileDereference(ModuleFunction function, FunctionGenerator generator, ShambdaParser.DereferenceContext context, Map<String, ModuleVariable> parameters) {
        ModuleComponent pointer = compileExpression(function, generator, context.expression(), parameters);
        if(! (pointer.getType() instanceof PointerType)) {
            compiler.compileError("Derefencing a non-pointer type", context);
        }
        ModuleVariable result = new ModuleVariable("$tmp_compiledereference"+nextTmpID()+"$", ((PointerType)pointer.getType()).getType());
        generator.load(result, new ModuleVariable(pointer.getName(), pointer.getType()));
        return result;
    }

    private int nextTmpID() {
        return tmpID++;
    }
}
