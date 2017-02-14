import org.jglr.sbm.StorageClass;
import org.jglr.sbm.instructions.*;
import org.jglr.sbm.types.MatrixType;
import org.jglr.sbm.types.PointerType;
import org.jglr.sbm.types.Type;
import org.jglr.sbm.types.VectorType;
import org.jglr.sbm.visitors.CodeCollector;
import org.jglr.sbm.visitors.ModuleReader;
import org.jglr.shambda.ShambdaCompileError;
import org.jglr.shambda.ShambdaCompiler;
import org.junit.Test;

import java.io.*;
import java.util.Optional;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestCompiler {

    @Test
    public void testNegate() throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler("test:vec2(float32) = -vec2(-1f 5f);;");
        compiler.compile();
        printContent("testNegate", compiler.toBytes());
    }

    @Test
    public void testMatrixMemberAccessing() throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler("accessColumn:vec3(float32) matrix:mat4(vec3(float32)) = matrix.m2;;\n" +
                "accessValue:uint32 matrix:mat4(vec4(uint32)) = matrix.m23;;");
        compiler.compile();
        printContent("testMatrixMemberAccessing", compiler.toBytes());
    }

    @Test
    public void testVectorMemberAccessing() throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler("myfunction:float64 v:vec4(float64) = " +
                "v.xyzw ; v.zyxyw; v.z; v.w; v.r; v.g; v.b; v.a;;");
        compiler.compile();
        printContent("testVectorMemberAccessing", compiler.toBytes());
    }

    @Test(expected = ShambdaCompileError.class)
    public void testArithmeticDifferentVectorTypes() throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler("myfunction:vec4(float64) = " +
                "vec4(45.5d 45.5d 45.5d 45.5d) + vec4(1 2 3 4) - vec4 $ 45.0d 45.0d 45.0d 45.0d;;");
        compiler.compile();
        printContent("testPlusMinusFloatVec", compiler.toBytes());
    }

    @Test(expected = ShambdaCompileError.class)
    public void testArithmeticDifferentType() throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler("myfunction:float64 = 45.5d + 90 / 45.0f;;");
        compiler.compile();
    }

    @Test
    public void testPlusMinusVectors() throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler("myfunction:vec4(float64) = " +
                "vec4(45.5d 45.5d 45.5d 45.5d) + vec4(90.5d 90.5d 90.5d 90.5d) - vec4 $ 45.0d 45.0d 45.0d 45.0d;;");
        compiler.compile();
        printContent("testPlusMinusFloatVec", compiler.toBytes());
    }

    @Test
    public void testPlusMinusFloat() throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler("myfunction:float64 = 45.5d + 90.5d - 45.0d;;");
        compiler.compile();
        ModuleReader reader = new ModuleReader(compiler.toBytes());
        CodeCollector collector = (CodeCollector) reader.visitCode();

        printContent("testPlusMinusFloat", compiler.toBytes());
    }

    @Test
    public void testPlusMinusInt() throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler("myfunction:int32 = 45 + 90 - 45;;");
        compiler.compile();
        ModuleReader reader = new ModuleReader(compiler.toBytes());
        CodeCollector collector = (CodeCollector) reader.visitCode();

        printContent("testPlusMinusInt", compiler.toBytes());
    }

    @Test
    public void testNegateShader() throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler("uniform texture:sampler2D*(Input);;\n" +
                "fragment:vec4(float32) texCoords:vec2(float32) = -vec4 $ -1f 0f (-1f) (-1f);;");
        compiler.compile();
        printContent("testNegateShader", compiler.toBytes());
    }

    @Test
    public void testFragmentShader() throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler("uniform texture:sampler2D*(Input);;\n" +
                "fragment:vec4(float32) texCoords:vec2(float32) = sample(!texture texCoords);;");
        compiler.compile();
        printContent("testFragmentShader", compiler.toBytes());
    }

    @Test
    public void testUseMultipleConstants() throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler("constant ac = 2;;\n" +
                "constant ad = 45;;\n" +
                "func:vec2(int32) = vec2(ac ad);;");
        compiler.compile();
        printContent("testUseMultipleConstants", compiler.toBytes());
    }

    @Test
    public void testUseUniform() throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler("uniform myuniform:vec4(uint32);;\n" +
                "myfunction:vec4(uint32) = myuniform;;");
        compiler.compile();
        ModuleReader reader = new ModuleReader(compiler.toBytes());
        CodeCollector collector = (CodeCollector) reader.visitCode();
        assertTrue("Return value was not the uniform", collector.getInstructions().stream()
                .filter(i -> i instanceof ReturnValueInstruction)
                .map(i -> (ReturnValueInstruction)i)
                .allMatch(i -> i.getValueName().equals("myuniform")));
        printContent("testUseUniform", compiler.toBytes());
    }

    @Test
    public void testUseConstant() throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler("constant myconstant = 42f;;\n" +
                "myfunction:float32 = myconstant;;");
        compiler.compile();
        ModuleReader reader = new ModuleReader(compiler.toBytes());
        CodeCollector collector = (CodeCollector) reader.visitCode();
        assertTrue("Return value was not the constant", collector.getInstructions().stream()
                .filter(i -> i instanceof ReturnValueInstruction)
                .map(i -> (ReturnValueInstruction)i)
                .allMatch(i -> i.getValueName().equals("myconstant")));
        printContent("testUseConstant", compiler.toBytes());
    }

    @Test
    public void testSetImport() throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler("#import GLSL.std.450;;");
        compiler.compile();
        ModuleReader reader = new ModuleReader(compiler.toBytes());
        CodeCollector collector = (CodeCollector) reader.visitCode();
        boolean match = collector.getInstructions().stream()
                .filter(i -> i instanceof ExtendedInstructionSetImportInstruction)
                .map(i -> (ExtendedInstructionSetImportInstruction) i)
                .allMatch(i -> {
                    System.out.println("> "+i.getName());
                    return i.getName().equals("GLSL.std.450");
                });
        assertTrue(match);
    }

    @Test
    public void testCompiles() {
        ShambdaCompiler compiler = new ShambdaCompiler(readFile("test.shambda"));
        compiler.setFilename("test.shambda");
        compiler.compile();
        try {
            printContent("test", compiler.toBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readFile(String s) {
        InputStream input = getClass().getResourceAsStream("/" + s);
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        StringBuilder builder = new StringBuilder();
        reader.lines().forEach(l ->builder.append(l).append('\n'));
        return builder.toString();
    }

    @Test
    public void testDefineMissingConstants() {
        ShambdaCompiler compiler = new ShambdaCompiler("myfunc:vec3(float32) = vec3(1f 0f 65f);;");
        compiler.setFilename("missingConstants.shambda");
        compiler.compile();
        try {
            printContent("missingConstants", compiler.toBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConstantTypes() throws IOException {
        checkConstantType("constant float:float32 = 42f;;", ShambdaCompiler.FLOAT_TYPE);
        checkConstantType("constant unsigned:uint64 = u45648705464L;;", ShambdaCompiler.UNSIGNED_LONG_TYPE);
        checkConstantType("constant double:float64 = 5689.265d;;", ShambdaCompiler.DOUBLE_TYPE);
        checkConstantType("constant true_boolean:bool = true;;", ShambdaCompiler.BOOL_TYPE);
        checkConstantType("constant false_boolean:bool = false;;", ShambdaCompiler.BOOL_TYPE);

        checkConstantType("constant float_inferred = 42f;;", ShambdaCompiler.FLOAT_TYPE);
        checkConstantType("constant unsigned_inferred = u45648705464L;;", ShambdaCompiler.UNSIGNED_LONG_TYPE);
        checkConstantType("constant double_inferred = 5689.265d;;", ShambdaCompiler.DOUBLE_TYPE);
        checkConstantType("constant true_boolean_inferred = true;;", ShambdaCompiler.BOOL_TYPE);
        checkConstantType("constant false_boolean_inferred = false;;", ShambdaCompiler.BOOL_TYPE);
    }

    @Test
    public void testUniformTypes() throws IOException {
        checkUniformType("uniform color:vec4(float32);;", new VectorType(ShambdaCompiler.FLOAT_TYPE, 4));
        checkUniformType("uniform time:float64;;", ShambdaCompiler.DOUBLE_TYPE);
        checkUniformType("uniform texture:int32*(Input);;", new PointerType(StorageClass.Input, ShambdaCompiler.INT_TYPE));
        checkUniformType("uniform projection:mat4(vec4(float64));;", new MatrixType(new VectorType(ShambdaCompiler.DOUBLE_TYPE, 4), 4));
    }

    private void checkConstantType(String source, Type expected) throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler(source);
        compiler.setFilename(source);
        compiler.compile();
        ModuleReader reader = new ModuleReader(compiler.toBytes());
        CodeCollector codeCollector = (CodeCollector) reader.visitCode();
        if(expected.equals(ShambdaCompiler.BOOL_TYPE)) {
            Optional<SpvInstruction> constantInstruction = codeCollector.getInstructions().stream()
                    .filter(i -> i instanceof BooleanConstantInstruction)
                    .findFirst();
            if( ! constantInstruction.isPresent())
                throw new RuntimeException("No constant instruction found");
            BooleanConstantInstruction c = (BooleanConstantInstruction) constantInstruction.get();
            assertEquals(expected, c.getType());
        } else {
            Optional<SpvInstruction> constantInstruction = codeCollector.getInstructions().stream()
                    .filter(i -> i instanceof ConstantInstruction)
                    .findFirst();
            if( ! constantInstruction.isPresent())
                throw new RuntimeException("No constant instruction found");
            ConstantInstruction c = (ConstantInstruction) constantInstruction.get();
            assertEquals(expected, c.getType());
        }
        printContent("Test constant "+expected.getName(), compiler.toBytes());
    }

    private void checkUniformType(String source, Type expected) throws IOException {
        ShambdaCompiler compiler = new ShambdaCompiler(source);
        compiler.setFilename(source);
        compiler.compile();
        ModuleReader reader = new ModuleReader(compiler.toBytes());
        CodeCollector codeCollector = (CodeCollector) reader.visitCode();
        Optional<SpvInstruction> constantInstruction = codeCollector.getInstructions().stream()
                .filter(i -> i instanceof VariableInstruction)
                .findFirst();
        if( ! constantInstruction.isPresent())
            throw new RuntimeException("No variable instruction found");
        VariableInstruction c = (VariableInstruction) constantInstruction.get();
        assertEquals(expected, c.getResultType());
        assertEquals(StorageClass.UniformConstant, c.getStorageClass());
        printContent("Test uniform "+expected.getName().replace("*", "(Pointer)"), compiler.toBytes());
    }

    private static void printContent(String filename, byte[] bytes) throws IOException {
        File file = new File("tests/", filename + ".shambda.spv");
        if(!file.getParentFile().exists())
            file.getParentFile().mkdirs();
        FileOutputStream out = new FileOutputStream(file);
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
