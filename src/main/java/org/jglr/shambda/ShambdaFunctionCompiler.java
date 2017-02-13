package org.jglr.shambda;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.jglr.sbm.types.*;
import org.jglr.sbm.utils.*;
import org.jglr.shambda.grammar.ShambdaBaseVisitor;
import org.jglr.shambda.grammar.ShambdaParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShambdaFunctionCompiler {
    private ShambdaCompiler compiler;
    private final ExpressionCompiler expressionCompiler;

    public ShambdaFunctionCompiler(ShambdaCompiler compiler) {
        this.compiler = compiler;
        expressionCompiler = new ExpressionCompiler();
    }

    public void compile(FunctionGenerator generator, ShambdaParser.FunctionDeclarationContext context) {
        Map<String, ModuleVariable> parameters = new HashMap<>();
        for (int i = 1; i < context.parameter().size(); i++) {
            ShambdaParser.ParameterContext paramData = context.parameter().get(i);
            ModuleVariable parameter = new ModuleVariable(paramData.Identifier().getText(), compiler.buildType(paramData.type()));
            parameters.put(parameter.getName(), parameter);
            generator.parameter(parameter);
        }
        generator.label(new Label());
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
        expressionCompiler.setFunction(function);
        expressionCompiler.setGenerator(generator);
        expressionCompiler.setParameters(parameters);
        return context.accept(expressionCompiler);
    }

    private ModuleComponent compileDereference(ModuleFunction function, FunctionGenerator generator, ShambdaParser.DereferenceExprContext context, Map<String, ModuleVariable> parameters) {
        ModuleComponent pointer = compileExpression(function, generator, context.expression(), parameters);
        if(! (pointer.getType() instanceof PointerType)) {
            compiler.compileError("Derefencing a non-pointer type", context);
        }
        ModuleVariable result = new ModuleVariable("$tmp_compiledereference"+nextTmpID()+"$", ((PointerType)pointer.getType()).getType());
        generator.load(result, new ModuleVariable(pointer.getName(), pointer.getType()));
        return result;
    }

    private int nextTmpID() {
        return compiler.nextTmpID();
    }

    private class ExpressionCompiler extends ShambdaBaseVisitor<ModuleComponent> {

        private ModuleFunction function;
        private FunctionGenerator generator;
        private Map<String, ModuleVariable> parameters;

        @Override
        public ModuleComponent visitConstantExpressionExpr(ShambdaParser.ConstantExpressionExprContext ctx) {
            return compiler.getConstant(compiler.getConstantID(ctx.constantExpression()));
        }

        @Override
        public ModuleComponent visitFunctionCallExpr(ShambdaParser.FunctionCallExprContext ctx) {
            return compileFunctionCall(function, generator, ctx.functionCall(), parameters);
        }

        @Override
        public ModuleComponent visitWrappedExpr(ShambdaParser.WrappedExprContext ctx) {
            return compileExpression(function, generator, ctx.expression(), parameters);
        }

        @Override
        public ModuleComponent visitDereferenceExpr(ShambdaParser.DereferenceExprContext ctx) {
            return compileDereference(function, generator, ctx, parameters);
        }

        @Override
        public ModuleComponent visitIdExpr(ShambdaParser.IdExprContext ctx) {
            String id = ctx.Identifier().getText();
            if(parameters.containsKey(id)) {
                return parameters.get(id);
            }
            return compiler.getComponantWithName(id);
        }

        @Override
        public ModuleComponent visitUnaryMinusExpr(ShambdaParser.UnaryMinusExprContext ctx) {
            ModuleComponent toNegate = compileExpression(function, generator, ctx.expression(), parameters);
            Type type = toNegate.getType();
            Type scalarType = type;
            if(type instanceof VectorType) {
                scalarType = ((VectorType)type).getComponentType();
            }
            ModuleVariable result = new ModuleVariable("$negate"+nextTmpID(), type);
            if(scalarType instanceof IntType) {
                generator.negateInt(result, toNegate);
            } else if(scalarType instanceof FloatType) {
                generator.negateFloat(result, toNegate);
            } else {
                compiler.compileError("Cannot negate value of type: "+type+" (related scalar type was "+scalarType+")", ctx);
            }
            return result;
        }

        @Override
        public ModuleComponent visitDivExpr(ShambdaParser.DivExprContext ctx) {
            ModuleComponent left = compileExpression(function, generator, ctx.expression(0), parameters);
            ModuleComponent right = compileExpression(function, generator, ctx.expression(1), parameters);
            return visitArithmetic(left, right, ctx, generator::divInt, generator::divFloat);
        }

        @Override
        public ModuleComponent visitMultExpr(ShambdaParser.MultExprContext ctx) {
            ModuleComponent left = compileExpression(function, generator, ctx.expression(0), parameters);
            ModuleComponent right = compileExpression(function, generator, ctx.expression(1), parameters);
            return visitArithmetic(left, right, ctx, generator::mulInt, generator::mulFloat);
        }

        @Override
        public ModuleComponent visitMinusExpr(ShambdaParser.MinusExprContext ctx) {
            ModuleComponent left = compileExpression(function, generator, ctx.expression(0), parameters);
            ModuleComponent right = compileExpression(function, generator, ctx.expression(1), parameters);
            return visitArithmetic(left, right, ctx, generator::subInt, generator::subFloat);
        }

        @Override
        public ModuleComponent visitPlusExpr(ShambdaParser.PlusExprContext ctx) {
            ModuleComponent left = compileExpression(function, generator, ctx.expression(0), parameters);
            ModuleComponent right = compileExpression(function, generator, ctx.expression(1), parameters);
            return visitArithmetic(left, right, ctx, generator::addInt, generator::addFloat);
        }

        private ModuleComponent visitArithmetic(ModuleComponent left, ModuleComponent right, ParserRuleContext ctx, ArithmeticGeneration intVariant, ArithmeticGeneration floatVariant) {
            if( ! left.getType().equals(right.getType())) {
                compiler.compileError("Operands must have the same type, found "+left.getType()+" and "+right.getType(), ctx);
            }
            Type type = left.getType();
            Type scalarType = type;
            if(type instanceof VectorType) {
                scalarType = ((VectorType)type).getComponentType();
            }
            ModuleVariable result = new ModuleVariable("$negate"+nextTmpID(), type);
            if(scalarType instanceof IntType) {
                intVariant.apply(result, left, right);
            } else if(scalarType instanceof FloatType) {
                floatVariant.apply(result, left, right);
            } else {
                compiler.compileError("Cannot negate value of type: "+type+" (related scalar type was "+scalarType+")", ctx);
            }
            return result;
        }

        @Override
        public ModuleComponent visitAccessExpr(ShambdaParser.AccessExprContext ctx) {
            ModuleComponent toAccess = compileExpression(function, generator, ctx.expression(), parameters);
            String name = ctx.Identifier().getText();
            // TODO: handle structures

            if(toAccess.getType().isScalar())
                compiler.compileError("Cannot access member of scalar type", ctx);

            // TODO: Matrices
            if(toAccess.getType() instanceof VectorType) {
                VectorType vectorType = ((VectorType) toAccess.getType());
                long size = vectorType.getComponentCount();
                ModuleVariable[] members = extractMembers(vectorType, ctx, toAccess, size, name);
                if(members.length == 1) {
                    return members[0];
                } else {
                    VectorType type = new VectorType(vectorType.getComponentType(), members.length);
                    return generator.compositeConstruct(type, members);
                }
            }
            compiler.compileError("Cannot access member of type: "+toAccess.getType(), ctx);
            return super.visitAccessExpr(ctx);
        }

        private ModuleVariable[] extractMembers(VectorType vectorType, ShambdaParser.AccessExprContext ctx, ModuleComponent toAccess, long vectorSize, String memberList) {
            char[] memberNames = memberList.toCharArray();
            Map<Character, ModuleVariable> loaded = new HashMap<>();
            ModuleVariable[] members = new ModuleVariable[memberNames.length];
            for (int i = 0; i < memberNames.length; i++) {
                char name = memberNames[i];
                if( ! loaded.containsKey(name)) {
                    int index = -1;
                    switch (name) {
                        case 'x':
                        case 'r':
                            index = 0;
                            break;

                        case 'y':
                        case 'g':
                            index = 1;
                            break;

                        case 'z':
                        case 'b':
                            index = 2;
                            break;

                        case 'w':
                        case 'a':
                            index = 3;
                            break;
                    }

                    if(index == -1 || index >= vectorSize)
                        compiler.compileError("Unknown member '"+name+"' for vector of type "+vectorType, ctx);

                    ModuleVariable var = new ModuleVariable("$tmpaccess"+nextTmpID()+"$", vectorType.getComponentType());
                    generator.compositeExtract(var, toAccess, index);
                    loaded.put(name, var);
                }
                members[i] = loaded.get(name);
            }
            return members;
        }

        public void setFunction(ModuleFunction function) {
            this.function = function;
        }

        public ModuleFunction getFunction() {
            return function;
        }

        public void setGenerator(FunctionGenerator generator) {
            this.generator = generator;
        }

        public FunctionGenerator getGenerator() {
            return generator;
        }

        public void setParameters(Map<String,ModuleVariable> parameters) {
            this.parameters = parameters;
        }

        public Map<String, ModuleVariable> getParameters() {
            return parameters;
        }
    }

    @FunctionalInterface
    private interface ArithmeticGeneration {
        void apply(ModuleVariable result, ModuleComponent left, ModuleComponent right);
    }
}
