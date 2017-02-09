package org.jglr.shambda;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jglr.sbm.StorageClass;
import org.jglr.sbm.types.*;
import org.jglr.sbm.utils.ModuleGenerator;
import org.jglr.shambda.grammar.ShambdaLexer;
import org.jglr.shambda.grammar.ShambdaParser;

import java.util.List;

public class ShambdaCompiler {

    private final String source;
    private final ModuleGenerator generator;

    public static final IntType INT_TYPE = new IntType(32, true);
    public static final IntType UNSIGNED_INT_TYPE = new IntType(32, false);
    public static final IntType LONG_TYPE = new IntType(64, true);
    public static final IntType UNSIGNED_LONG_TYPE = new IntType(64, false);
    public static final FloatType FLOAT_TYPE = new FloatType(32);
    public static final FloatType DOUBLE_TYPE = new FloatType(64);

    public ShambdaCompiler(String source) {
        this.source = source;
        generator = new ModuleGenerator();
    }

    public void compile() {
        ShambdaLexer lexer = new ShambdaLexer(new ANTLRInputStream(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ShambdaParser parser = new ShambdaParser(tokens);
        ShambdaParser.FileContext file = parser.file();
        createNames(file);
        for (ShambdaParser.ConstantDeclarationContext c : file.constantDeclaration()) {
            compileConstant(c);
        }

        for (ShambdaParser.UniformDeclarationContext u : file.uniformDeclaration()) {
            compileUniform(u);
        }

        for (ShambdaParser.FunctionDeclarationContext f : file.functionDeclaration()) {
            compileFunction(f);
        }

        generator.end();
    }

    private void compileFunction(ShambdaParser.FunctionDeclarationContext context) {
        ShambdaParser.ParameterContext signature = context.parameter().get(0);
        String name = signature.Identifier().getText();
        Type type = null;
        if(signature.type() != null) {
            type = buildType(signature.type());
        }
        List<ShambdaParser.ParameterContext> parameters = context.parameter().subList(1, context.parameter().size());
    }

    private void compileUniform(ShambdaParser.UniformDeclarationContext context) {
        String name = context.parameter().Identifier().getText();
        if(context.parameter().type() == null)
            compileError("Error while compiling uniform "+name+": uniform types cannot be inferred, the type of the uniform must follow its name");
        Type type = buildType(context.parameter().type());
        generator.declareVariable(name, type, StorageClass.UniformConstant);
    }

    private void createNames(ShambdaParser.FileContext file) {
        for (ShambdaParser.ConstantDeclarationContext c : file.constantDeclaration()) {
            generator.name(c.parameter().Identifier().getText());
        }

        for (ShambdaParser.UniformDeclarationContext u : file.uniformDeclaration()) {
            generator.name(u.parameter().Identifier().getText());
        }

        for (ShambdaParser.FunctionDeclarationContext f : file.functionDeclaration()) {
            generator.name(f.parameter().get(0).Identifier().getText());
        }
    }

    private void compileConstant(ShambdaParser.ConstantDeclarationContext context) {
        ShambdaParser.ParameterContext parameter = context.parameter();
        String name = parameter.Identifier().getText();
        Type type = null;
        if(parameter.type() != null) {
            type = buildType(parameter.type());
        }

        ShambdaParser.ConstantExpressionContext expression = context.constantExpression();
        long[] bitPattern = new long[0];
        Type inferredType = inferType(expression);
        if(expression.integer() != null) {
            int value = Integer.parseInt(expression.integer().getText());
            bitPattern = new long[]{value & 0x00000000FFFFFFFFL};
        }
        if(expression.longNumber() != null) {
            long value = Long.parseLong(expression.longNumber().integer().getText());
            bitPattern = new long[]{value & 0x00000000FFFFFFFFL, (value >> 32) & 0x00000000FFFFFFFFL};
        }
        if(expression.floatingPointNumber() != null) {
            float value = Float.parseFloat(expression.floatingPointNumber().getText().replace("f", ""));
            bitPattern = new long[]{Float.floatToRawIntBits(value) & 0x00000000FFFFFFFFL};
        }
        if(expression.doubleNumber() != null) {
            double v = Double.parseDouble(expression.doubleNumber().getText().replace("d", ""));
            long value = Double.doubleToRawLongBits(v);
            bitPattern = new long[]{value & 0x00000000FFFFFFFFL, (value >> 32) & 0x00000000FFFFFFFFL};
        }

        if(expression.unsignedInteger() != null) {
            int value = Integer.parseInt(expression.unsignedInteger().integer().getText());
            bitPattern = new long[]{value & 0x00000000FFFFFFFFL};
        }
        if(expression.unsignedLong() != null) {
            long value = Long.parseLong(expression.unsignedLong().longNumber().integer().getText());
            bitPattern = new long[]{value & 0x00000000FFFFFFFFL, (value >> 32) & 0x00000000FFFFFFFFL};
        }

        if(type != null && !type.equals(inferredType)) {
            compileError("Explicit and inferred types differ, explicit: "+type+" / inferred: "+inferredType);
        }

        generator.constant(name, inferredType, bitPattern);
    }

    private Type inferType(ShambdaParser.ConstantExpressionContext expression) {
        if(expression.integer() != null) {
            return INT_TYPE;
        }
        if(expression.longNumber() != null) {
            return LONG_TYPE;
        }
        if(expression.floatingPointNumber() != null) {
            return FLOAT_TYPE;
        }
        if(expression.doubleNumber() != null) {
            return DOUBLE_TYPE;
        }
        if(expression.unsignedInteger() != null) {
            return UNSIGNED_INT_TYPE;
        }
        if(expression.unsignedLong() != null) {
            return UNSIGNED_LONG_TYPE;
        }
        return null; // TODO
    }

    private Type buildType(ShambdaParser.TypeContext context) {
        if(context.storageClass() != null) { // is a pointer type
            String storageClassName = context.storageClass().getText();
            return new PointerType(StorageClass.valueOf(storageClassName), buildType(context.type()));
        } else if(context.type() != null) { // has a sub-type
            String raw = context.Identifier().getText();
            Type subType = buildType(context.type());
            if(raw.startsWith("vec")) {
                String width = raw.substring("vec".length());
                try {
                    int size = Integer.parseInt(width);
                    return new VectorType(subType, size);
                } catch (Exception e) {
                    compileError("Vector types must be followed by their size written as in integer: vec2(<type>)");
                }
            }
            if(raw.startsWith("mat")) {
                String width = raw.substring("mat".length());
                try {
                    int columnCount = Integer.parseInt(width);
                    return new MatrixType(subType, columnCount);
                } catch (Exception e) {
                    compileError("Matrix types must be followed by their size written as in integer: mat4(vec2(float32))");
                }
            }
        }
        return buildPrimitiveType(context.Identifier());
    }

    private Type buildPrimitiveType(TerminalNode identifier) {
        String raw = identifier.getText();
        if(raw.startsWith("float")) {
            String width = raw.substring("float".length());
            try {
                int bitWidth = Integer.parseInt(width);
                return new FloatType(bitWidth);
            } catch (Exception e) {
                compileError("Float types must be followed by their width written as in integer: float32, float64");
            }
        }
        if(raw.startsWith("uint")) {
            String width = raw.substring("uint".length());
            try {
                int bitWidth = Integer.parseInt(width);
                return new IntType(bitWidth, false);
            } catch (Exception e) {
                compileError("Unsigned integer types must be followed by their width written as in integer: uint32");
            }
        }
        if(raw.startsWith("int")) {
            String width = raw.substring("int".length());
            try {
                int bitWidth = Integer.parseInt(width);
                return new IntType(bitWidth, true);
            } catch (Exception e) {
                compileError("Integer types must be followed by their width written as in integer: int64");
            }
        }
        return new Type(raw);
    }

    private void compileError(String message) {
        throw new ShamdaCompileError(message);
    }

    public byte[] toBytes() {
        return generator.toBytes();
    }
}
