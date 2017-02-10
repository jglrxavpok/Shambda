package org.jglr.shambda;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jglr.sbm.StorageClass;
import org.jglr.sbm.types.*;
import org.jglr.sbm.utils.*;
import org.jglr.shambda.grammar.ShambdaLexer;
import org.jglr.shambda.grammar.ShambdaParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShambdaCompiler {

    private final String source;
    private final ModuleGenerator generator;

    public static final IntType INT_TYPE = new IntType(32, true);
    public static final IntType UNSIGNED_INT_TYPE = new IntType(32, false);
    public static final IntType LONG_TYPE = new IntType(64, true);
    public static final IntType UNSIGNED_LONG_TYPE = new IntType(64, false);
    public static final FloatType FLOAT_TYPE = new FloatType(32);
    public static final FloatType DOUBLE_TYPE = new FloatType(64);
    private final Map<String, ModuleConstant> registeredConstants;
    private final ShamdaFunctionCompiler functionCompiler;
    private String filename;

    public ShambdaCompiler(String source) {
        registeredConstants = new HashMap<>();
        this.source = source;
        functionCompiler = new ShamdaFunctionCompiler(this);
        generator = new ModuleGenerator();
        filename = "<unknown>";
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void compile() {
        ShambdaLexer lexer = new ShambdaLexer(new ANTLRInputStream(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ShambdaParser parser = new ShambdaParser(tokens);
        ShambdaParser.FileContext file = parser.file();
        createNames(file);

        for (ShambdaParser.SetImportContext s : file.setImport()) {
            String name = s.children.subList(1, s.children.size()-1).stream()
                    .map(ParseTree::getText)
                    .filter(str -> !str.isEmpty())
                    .collect(Collectors.joining());
            generator.addSetImport(name);
        }

        for (ShambdaParser.ConstantDeclarationContext c : file.constantDeclaration()) {
            compileConstant(c);
        }

        for (ShambdaParser.UniformDeclarationContext u : file.uniformDeclaration()) {
            compileUniform(u);
        }

        for (ShambdaParser.FunctionDeclarationContext f : file.functionDeclaration()) {
            createMissingConstants(f);
        }

        for (ShambdaParser.FunctionDeclarationContext f : file.functionDeclaration()) {
            compileFunction(f);
        }

        generator.end();
    }

    private void createMissingConstants(ShambdaParser.FunctionDeclarationContext context) {
        ShambdaParser.FunctionBodyContext body = context.functionBody();
        for(ShambdaParser.StatementContext s : body.statement()) {
            ShambdaParser.ExpressionContext expressionToCheck;
            if(s.variableDeclaration() != null) {
                expressionToCheck = s.variableDeclaration().variableAssignment().expression();
            } else if(s.variableAssignment() != null) {
                expressionToCheck = s.variableAssignment().expression();
            } else {
                expressionToCheck = s.expression();
            }
            handleMissingConstants(expressionToCheck);
        }
    }

    private void handleMissingConstants(ShambdaParser.ExpressionContext expression) {
        if(expression.constantExpression() != null) {
            ShambdaParser.ConstantExpressionContext constant = expression.constantExpression();
            String id = getConstantID(constant);
            if( ! registeredConstants.containsKey(id)) {
                generateConstant(id, inferType(constant), constant);
            }
        } else if(expression.expression() != null) {
            handleMissingConstants(expression.expression());
        } else if(expression.functionCall() != null) {
            ShambdaParser.FunctionCallContext call = expression.functionCall();
            call.expression().forEach(this::handleMissingConstants);
        } else if(expression.dereference() != null) {
            handleMissingConstants(expression.dereference().expression());
        }
    }

    public String getConstantID(ShambdaParser.ConstantExpressionContext expression) {
        if(expression.Integer() != null) {
            return expression.Integer().getText()+":int32";
        }
        if(expression.LongNumber() != null) {
            return expression.LongNumber().getText().replace("L", "")+":int64";
        }
        if(expression.FloatingPointNumber() != null) {
            return expression.FloatingPointNumber().getText().replace("f", "")+":float32";
        }
        if(expression.DoubleNumber() != null) {
            return expression.DoubleNumber().getText().replace("d", "")+":float64";
        }

        if(expression.UnsignedInteger() != null) {
            return expression.UnsignedInteger().getText().replace("u", "")+":uint32";
        }
        if(expression.UnsignedLong() != null) {
            return expression.UnsignedLong().getText().replace("u", "")+":uint64";
        }
        return null;
    }

    private void compileFunction(ShambdaParser.FunctionDeclarationContext context) {
        ShambdaParser.ParameterContext signature = context.parameter().get(0);
        String name = signature.Identifier().getText();
        Type type = null;
        //if(signature.type() != null) {
            type = buildType(signature.type());
        //}
        // TODO: type inference
        List<ShambdaParser.ParameterContext> parameters = context.parameter();
        Type[] paramTypes = new Type[parameters.size()-1];
        for(int i = 1;i<parameters.size();i++) { // start at 1 because first one is the function signature
            ShambdaParser.ParameterContext param = parameters.get(i);
            paramTypes[i] = buildType(param.type());
        }
        ModuleFunction function = new ModuleFunction(name, new FunctionType(type, paramTypes));
        Label startLabel = new Label();
        int line = context.getStart().getLine();
        generator.lineNumber(getFilename(), line, context.getStart().getCharPositionInLine());
        functionCompiler.compile(generator.createFunction(function, startLabel), context);
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
        generateConstant(name, type, expression);
    }

    private void generateConstant(String name, Type type, ShambdaParser.ConstantExpressionContext expression) {
        long[] bitPattern = new long[0];
        Type inferredType = inferType(expression);
        if(expression.Integer() != null) {
            int value = Integer.parseInt(expression.Integer().getText());
            bitPattern = new long[]{value & 0x00000000FFFFFFFFL};
        }
        if(expression.LongNumber() != null) {
            long value = Long.parseLong(expression.LongNumber().getText().replace("L", ""));
            bitPattern = new long[]{value & 0x00000000FFFFFFFFL, (value >> 32) & 0x00000000FFFFFFFFL};
        }
        if(expression.FloatingPointNumber() != null) {
            float value = Float.parseFloat(expression.FloatingPointNumber().getText().replace("f", ""));
            bitPattern = new long[]{Float.floatToRawIntBits(value) & 0x00000000FFFFFFFFL};
        }
        if(expression.DoubleNumber() != null) {
            double v = Double.parseDouble(expression.DoubleNumber().getText().replace("d", ""));
            long value = Double.doubleToRawLongBits(v);
            bitPattern = new long[]{value & 0x00000000FFFFFFFFL, (value >> 32) & 0x00000000FFFFFFFFL};
        }

        if(expression.UnsignedInteger() != null) {
            int value = Integer.parseInt(expression.UnsignedInteger().getText().replace("u", ""));
            bitPattern = new long[]{value & 0x00000000FFFFFFFFL};
        }
        if(expression.UnsignedLong() != null) {
            long value = Long.parseLong(expression.UnsignedLong().getText().replace("u", "").replace("L", ""));
            bitPattern = new long[]{value & 0x00000000FFFFFFFFL, (value >> 32) & 0x00000000FFFFFFFFL};
        }

        if(type != null && !type.equals(inferredType)) {
            compileError("Explicit and inferred types differ, explicit: "+type+" / inferred: "+inferredType);
        }

        generator.constant(name, inferredType, bitPattern);

        // register constant id
        String constantID = getConstantID(expression);
        registeredConstants.put(constantID, new ModuleConstant(name, inferredType, bitPattern));
    }

    private Type inferType(ShambdaParser.ConstantExpressionContext expression) {
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

    public ModuleConstant getConstant(String constantID) {
        return registeredConstants.get(constantID);
    }

    protected void compileError(String message) {
        throw new ShamdaCompileError(message);
    }

    public byte[] toBytes() {
        return generator.toBytes();
    }
}
