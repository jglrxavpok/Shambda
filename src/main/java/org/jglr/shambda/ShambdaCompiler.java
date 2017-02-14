package org.jglr.shambda;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.jglr.sbm.*;
import org.jglr.sbm.sampler.Dimensionality;
import org.jglr.sbm.sampler.ImageDepth;
import org.jglr.sbm.sampler.ImageFormat;
import org.jglr.sbm.sampler.Sampling;
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

    public static final Type BOOL_TYPE = Type.BOOL;
    public static final IntType INT_TYPE = new IntType(32, true);
    public static final IntType UNSIGNED_INT_TYPE = new IntType(32, false);
    public static final IntType LONG_TYPE = new IntType(64, true);
    public static final IntType UNSIGNED_LONG_TYPE = new IntType(64, false);
    public static final FloatType FLOAT_TYPE = new FloatType(32);
    public static final FloatType DOUBLE_TYPE = new FloatType(64);
    public static final ImageType TEXTURE_IMAGE_TYPE = new ImageType(FLOAT_TYPE, Dimensionality.Dim2D, ImageDepth.NO_DEPTH, false, false, Sampling.WITH_SAMPLER, ImageFormat.Unknown, null);
    public static final Type SAMPLER2D_TYPE = new SampledImageType(TEXTURE_IMAGE_TYPE);
    protected final Map<String, ModuleConstant> registeredConstants;
    private final Map<String, ModuleComponent> registeredComponents;
    private final ShambdaFunctionCompiler functionCompiler;
    private final ShambdaTypeInferer typeInferer;
    private String filename;
    private final ParseTreeVisitor<Void> missingConstantsVisitor;
    private final TypeBuilder typeBuilder;

    public ShambdaCompiler(String source) {
        registeredConstants = new HashMap<>();
        registeredComponents = new HashMap<>();
        this.source = source;
        functionCompiler = new ShambdaFunctionCompiler(this);
        generator = new ModuleGenerator(new StructuredModuleWriter());
        filename = "<unknown>";
        typeInferer = new ShambdaTypeInferer(this);
        typeBuilder = new TypeBuilder(this);
        missingConstantsVisitor = new MissingConstantVisitor(this);
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void compile() {
        generator.addCapability(Capability.Shader)
                .setMemoryModel(AddressingModel.Logical, MemoryModel.GLSL450);
        generator.addSourceExtension("GL_ARB_separate_shader_objects");
        generator.addSourceExtension("GL_ARB_shading_language_420pack");


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
            registerFunction(f);
        }

        generateEntryPoints(file.functionDeclaration());

        for (ShambdaParser.FunctionDeclarationContext f : file.functionDeclaration()) {
            compileFunction(f);
        }

        generator.end();
    }

    private void generateEntryPoints(List<ShambdaParser.FunctionDeclarationContext> contexts) {
        for(ShambdaParser.FunctionDeclarationContext c : contexts) {
            String name = c.parameter(0).Identifier().getText();
            if(name.equals("fragment")) {
                ModuleFunction function = (ModuleFunction) getComponantWithName("fragment");
                createEntryPoint(ExecutionModel.Fragment, function);
            }
            // TODO: other stages
        }
    }

    private void createEntryPoint(ExecutionModel model, ModuleFunction function) {
        // Assumptions for the moment: everything input is a pointer and there are no discontinuities in layout locations
        FunctionType funcType = (FunctionType) function.getFunctionType();
        Type[] paramTypes = funcType.getParameters();
        ModuleVariable[] interfaces = new ModuleVariable[paramTypes.length+1];
        for (int i = 0; i < paramTypes.length; i++) {
            Type interfaceType = new PointerType(StorageClass.Input, paramTypes[i]);
            interfaces[i] = generator.declareVariable("layout"+i, interfaceType, StorageClass.Input);
        }
        interfaces[interfaces.length-1] = generator.declareVariable("output", new PointerType(StorageClass.Output, funcType.getReturnType()), StorageClass.Output);
        FunctionType functionType = new FunctionType(Type.VOID);
        ModuleFunction mainFunction = new ModuleFunction("$mainFragment", functionType);
        generator.addNamedEntryPoint("main", mainFunction, model, interfaces);
        FunctionGenerator func = generator.createFunction(mainFunction);
        func.label(new Label());

        ModuleVariable[] interfaceValues = new ModuleVariable[interfaces.length-1];
        for (int i = 0; i < interfaceValues.length; i++) {
            interfaceValues[i] = new ModuleVariable("$interfaceValue"+i, paramTypes[i]);
            func.load(interfaceValues[i], interfaces[i]);
        }
        ModuleVariable funcResult = func.callFunction(function, interfaceValues);
        func.store(funcResult, interfaces[interfaces.length-1]);
        func.returnVoid();
        func.end();
    }

    private void registerFunction(ShambdaParser.FunctionDeclarationContext context) {
        ShambdaParser.ParameterContext signature = context.parameter().get(0);
        String name = signature.Identifier().getText();
        Type returnType = null;
        if(signature.type() != null) {
            returnType = buildType(signature.type());
        }
        List<ShambdaParser.ParameterContext> parameters = context.parameter();
        Type[] paramTypes = new Type[parameters.size()-1];
        for(int i = 1;i<parameters.size();i++) { // start at 1 because first one is the function signature
            ShambdaParser.ParameterContext param = parameters.get(i);
            paramTypes[i-1] = buildType(param.type());
        }

        FunctionType functionType = new FunctionType(returnType, paramTypes);
/* TODO
        FunctionType inferredType = typeInferer.inferFunctionType(context, parameters.subList(1, parameters.size()));
        if( ! inferredType.equals(functionType)) {
            compileError("Function type and inferred type do not match", context);
        }*/
        ModuleFunction function = new ModuleFunction(name, functionType);
        registeredComponents.put(name, function);
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

    protected void handleMissingConstants(ShambdaParser.ExpressionContext expression) {
        expression.accept(missingConstantsVisitor);
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
        if(expression.Boolean() != null) {
            return expression.Boolean().getText()+":bool";
        }
        return null;
    }

    private void compileFunction(ShambdaParser.FunctionDeclarationContext context) {
        ShambdaParser.ParameterContext signature = context.parameter().get(0);
        String name = signature.Identifier().getText();
        ModuleFunction function = (ModuleFunction) registeredComponents.get(name);
        int line = context.getStart().getLine();
        generator.lineNumber(getFilename(), line, context.getStart().getCharPositionInLine());
        functionCompiler.compile(generator.createFunction(function), context);
    }

    private void compileUniform(ShambdaParser.UniformDeclarationContext context) {
        String name = context.parameter().Identifier().getText();
        if(context.parameter().type() == null)
            compileError("Error while compiling uniform "+name+": uniform types cannot be inferred, the type of the uniform must follow its name");
        Type type = buildType(context.parameter().type());
        ModuleVariable result = generator.declareVariable(name, type, StorageClass.UniformConstant);

        registeredComponents.put(name, result);
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

    protected void generateConstant(String name, Type type, ShambdaParser.ConstantExpressionContext expression) {
        long[] bitPattern = new long[0];
        Type inferredType = typeInferer.inferType(expression);
        if(type != null && !type.equals(inferredType)) {
            compileError("Explicit and inferred types differ, explicit: "+type+" / inferred: "+inferredType);
        }
        if(inferredType != null && inferredType.equals(BOOL_TYPE)) {
            String constantID = getConstantID(expression);
            ModuleConstant constant = generator.constantBool(name, expression.Boolean().getText().equals("true"));
            registeredConstants.put(constantID, constant);

            registeredComponents.put(name, constant);
            return;
        }
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
        // register constant id
        String constantID = getConstantID(expression);
        ModuleConstant constant = generator.constant(name, inferredType, bitPattern);
        registeredConstants.put(constantID, constant);

        registeredComponents.put(name, constant);
    }

    protected Type buildType(ShambdaParser.TypeContext context) {
        return context.accept(typeBuilder);
    }

    public ModuleConstant getConstant(String constantID) {
        return registeredConstants.get(constantID);
    }

    protected void compileError(String message) {
        throw new ShambdaCompileError(message);
    }

    public byte[] toBytes() {
        return generator.toBytes();
    }

    public void compileError(String message, ParserRuleContext context) {
        throw new ShambdaCompileError(message+" in "+filename+" at line "+context.getStart().getLine()+";"+context.getStart().getCharPositionInLine());
    }

    public ModuleComponent getComponantWithName(String name) {
        return registeredComponents.get(name);
    }

    public ShambdaTypeInferer getTypeInferer() {
        return typeInferer;
    }

    public int nextTmpID() {
        return generator.nextTmpID();
    }

}
