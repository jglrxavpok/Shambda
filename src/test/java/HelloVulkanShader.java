import jdk.internal.util.xml.impl.Input;
import org.jglr.sbm.*;
import org.jglr.sbm.decorations.Decoration;
import org.jglr.sbm.decorations.IntDecorationValue;
import org.jglr.sbm.instructions.MemberDecorationInstruction;
import org.jglr.sbm.instructions.ResultInstruction;
import org.jglr.sbm.sampler.*;
import org.jglr.sbm.types.*;
import org.jglr.sbm.utils.*;
import org.jglr.sbm.visitors.*;
import org.jglr.shambda.ShambdaCompiler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class HelloVulkanShader {
    public static byte[] createFragmentShader() {
        /*ModuleWriter writer = new ModuleWriter();
        try {
            writer.visitHeader().visitBound(30);
            CodeVisitor code = writer.visitCode();
            writeWhiteShader(code);
            // end of main function
            printContent(writer.toBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*ModuleGenerator writer = new ModuleGenerator();
        writeUsualShaderWithGenerator(writer);
        return writer.toBytes();*/
        ShambdaCompiler compiler = new ShambdaCompiler("uniform texture:sampler2D*(Input);;\n" +
                "fragment:vec4(float32) texCoords:vec2(float32) = vec4(1f 0f 1f 1f);;");
        compiler.compile();
        return compiler.toBytes();
    }

    private static void writeWhiteShaderWithGenerator(ModuleGenerator writer) {
        writer.addCapability(Capability.Shader)
                .addSetImport("GLSL.std.450");
        writer.setMemoryModel(AddressingModel.Logical, MemoryModel.GLSL450);
        Type voidType = Type.VOID;
        FloatType floatType = new FloatType(32);
        Type vec4Float32 = new VectorType(floatType, 4);
        Type vec4Pointer = new PointerType(StorageClass.Output, vec4Float32);
        FunctionType functionType = new FunctionType(voidType);
        ModuleFunction mainFunction = new ModuleFunction("main", functionType);
        writer.addEntryPoint(mainFunction, ExecutionModel.Fragment, new ModuleVariable[0]);
        writer.setExecutionMode(mainFunction, new BasicExecutionMode(ExecutionMode.Type.OriginLowerLeft));
        ModuleConstant float1 = writer.constantFloat("1f", floatType, 1f);
        ModuleConstant whiteColor = writer.constantComposite("vec4(1,1,1,1)", vec4Float32, float1, float1, float1, float1);
        ModuleVariable finalColor = writer.declareVariable("finalColor", vec4Pointer, StorageClass.Output);
        writer.createFunction(mainFunction)
                .label(new Label())
                .store(whiteColor, finalColor)
                .returnVoid()
                .end();
        writer.end();

        try {
            printContent(writer.toBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeUsualShaderWithGenerator(ModuleGenerator writer) {
        writer.addCapability(Capability.Shader)
                .addSetImport("GLSL.std.450");
        writer.setMemoryModel(AddressingModel.Logical, MemoryModel.GLSL450);
        Type voidType = Type.VOID;
        FloatType floatType = new FloatType(32);
        Type vec4Float32 = new VectorType(floatType, 4);
        Type vec4Pointer = new PointerType(StorageClass.Output, vec4Float32);

        Type vec2Float32 = new VectorType(floatType, 2);
        Type vec2Pointer = new PointerType(StorageClass.Input, vec2Float32);

        ImageType imageType = new ImageType(floatType, Dimensionality.Dim2D, ImageDepth.NO_DEPTH, false, false, Sampling.WITH_SAMPLER, ImageFormat.Unknown, null);
        SampledImageType sampledImageType = new SampledImageType(imageType);
        PointerType sampledImageTypePointer = new PointerType(StorageClass.UniformConstant, sampledImageType);

        FunctionType functionType = new FunctionType(voidType);
        ModuleFunction mainFunction = new ModuleFunction("main", functionType);
        writer.addEntryPoint(mainFunction, ExecutionModel.Fragment, new ModuleVariable[]{writer.reserveName("texture"), writer.reserveName("texCoords")});
        writer.setExecutionMode(mainFunction, new BasicExecutionMode(ExecutionMode.Type.OriginLowerLeft));

        writer.name("texture")
                .name("texCoords")
                .name("main")
                .name("finalColor")
                .name("position")
                .name("sample")
                .name("loadedTexture");

        writer.decorate(writer.reserveName("texture"), new IntDecorationValue(Decoration.DescriptorSet, 0));
        writer.decorate(writer.reserveName("texture"), new IntDecorationValue(Decoration.Binding, 0));
        writer.decorate(writer.reserveName("texCoords"), new IntDecorationValue(Decoration.Location, 0));
        writer.decorate(writer.reserveName("finalColor"), new IntDecorationValue(Decoration.Location, 0));

        ModuleVariable texture = writer.declareVariable("texture", sampledImageTypePointer, StorageClass.UniformConstant);
        ModuleVariable texCoords = writer.declareVariable("texCoords", vec2Pointer, StorageClass.Input);
        ModuleVariable finalColor = writer.declareVariable("finalColor", vec4Pointer, StorageClass.Output);
        FunctionGenerator functionWriter = writer.createFunction(mainFunction).label(new Label());

        ModuleVariable loadedTexture = new ModuleVariable("loadedTexture", sampledImageType);
        ModuleVariable position = new ModuleVariable("position", vec2Float32);
        functionWriter.load(position, texCoords).load(loadedTexture, texture);
        ModuleVariable sample = new ModuleVariable("sample", vec4Float32);
        functionWriter.sampleImageImplicitLOD(sample, loadedTexture, position)
                .store(sample, finalColor)
                .returnVoid()
                .end();
        writer.end();

        try {
            printContent(writer.toBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void writeWhiteShader(CodeVisitor code) {
        code.visitCapability(Capability.Shader);
        code.visitExtendedInstructionSetImport(1, "GLSL.std.450");
        code.visitMemoryModel(AddressingModel.Logical, MemoryModel.GLSL450);
        code.visitEntryPoint(ExecutionModel.Fragment, 4, "main", new long[] {2});
        code.visitExecutionMode(4, new ExecutionMode(ExecutionMode.Type.OriginLowerLeft) {
            @Override
            public int getOperandCount() {
                return 0;
            }
        });
        code.visitSource(SourceLanguage.GLSL, 400, -1, "fragColor = white");
        code.visitName(4, "main");
        code.visitName(2, "finalColor");
        code.visitVoidType(5);
        code.visitFloatType(6, 32);
        code.visitVectorType(7, 6, 4); // vec4(float32)
        code.visitPointerType(8, StorageClass.Output, 7);
        code.visitVariable(8, 2, StorageClass.Output, -1);
        code.visitConstant(6, 9, new long[]{Float.floatToRawIntBits(1f)});
        code.visitConstantComposite(7, 10, new long[]{9,9,9,9});

        code.visitFunctionType(3, 5, new long[0]);
        code.visitFunction(5, 4, new FunctionControl(0x0), 3);
        code.visitLabel(12);
        code.visitStore(2, 10, new MemoryAccess(0x0));
        code.visitReturn();
        code.visitFunctionEnd();
    }

    private static void writeUsualShader(CodeVisitor code) {
        code.visitCapability(Capability.Shader);
        code.visitExtendedInstructionSetImport(1, "GLSL.std.450");
        code.visitMemoryModel(AddressingModel.Logical, MemoryModel.GLSL450);
        code.visitEntryPoint(ExecutionModel.Fragment, 4, "main", new long[] {9,17});
        code.visitExecutionMode(4, new ExecutionMode(ExecutionMode.Type.OriginLowerLeft) {
            @Override
            public int getOperandCount() {
                return 0;
            }
        });
        code.visitSource(SourceLanguage.GLSL, 400, -1, "<test shader>");
        code.visitExtension("GL_ARB_separate_shader_objects");
        code.visitExtension("GL_ARB_shading_language_420pack");
        code.visitName(4, "main");
        code.visitName(9, "uFragColor");
        code.visitName(13, "tex");
        code.visitName(17, "texcoord");
        code.visitIntDecoration(Decoration.Index, 9, 0);
        code.visitIntDecoration(Decoration.XfbBuffer, 13, 0);
        code.visitIntDecoration(Decoration.Offset, 13, 0);
        code.visitIntDecoration(Decoration.Index, 17, 0);

        code.visitVoidType(2);
        code.visitFunctionType(3, 2, new long[0]); // ()void
        code.visitFloatType(6, 32); // float32
        code.visitVectorType(7, 6, 4); // vec4 of float32
        code.visitPointerType(8, StorageClass.Output, 7);

        code.visitVariable(8, 9, StorageClass.Output, -1);
        code.visitImageType(10, 6, Dimensionality.Dim2D, ImageDepth.NO_DEPTH, false, false, Sampling.WITH_SAMPLER, ImageFormat.Unknown, null);
        code.visitSampledImageType(11, 10);
        code.visitPointerType(12, StorageClass.UniformConstant, 11);

        code.visitVariable(12, 13, StorageClass.UniformConstant, -1);
        code.visitVectorType(15, 6, 2); // vec2 of float32
        code.visitPointerType(16, StorageClass.Input, 15);
        code.visitVariable(16, 17, StorageClass.Input, -1);

        // main function
        code.visitFunction(2, 4, new FunctionControl(0x0), 3);
        code.visitLabel(5);
        code.visitLoad(11, 14, 13, new MemoryAccess(0x0));
        code.visitLoad(15, 18, 17, new MemoryAccess(0x0));
        code.visitImageSampleImplicitLod(7, 19, 14, 18, new ImageOperands(0x0), new HashMap<>());
        code.visitStore(9, 19, new MemoryAccess(0x0));
        code.visitReturn();
        code.visitFunctionEnd();
    }

    private static void printContent(byte[] bytes) throws IOException {
        FileOutputStream out = new FileOutputStream(new File(".", "helloVk.frag.spv"));
        out.write(bytes);
        out.flush();
        out.close();

        ModuleReader reader = new ModuleReader(bytes);
        reader.visitHeader();
        CodeCollector codeCollector = (CodeCollector) reader.visitCode();
        codeCollector.getInstructions().forEach(i -> {
            System.out.print(i.getWordCount()+" words: ");
            if(i instanceof ResultInstruction)
                System.out.print("%"+((ResultInstruction)i).getResultID()+" = ");
            System.out.println(i.toString());
        });
    }
}
