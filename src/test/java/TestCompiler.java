import org.jglr.sbm.StorageClass;
import org.jglr.sbm.instructions.*;
import org.jglr.sbm.types.MatrixType;
import org.jglr.sbm.types.PointerType;
import org.jglr.sbm.types.Type;
import org.jglr.sbm.types.VectorType;
import org.jglr.sbm.visitors.AbstractCodeVisitor;
import org.jglr.sbm.visitors.CodeCollector;
import org.jglr.sbm.visitors.CodeVisitor;
import org.jglr.sbm.visitors.ModuleReader;
import org.jglr.shambda.ShambdaCompiler;
import org.junit.Test;
import sun.security.provider.SHA;

import java.io.*;
import java.util.Optional;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestCompiler {

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
        ShambdaCompiler compiler = new ShambdaCompiler("myfunc:vec3(float32) = vec3 1f 0f 65f;;");
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

        checkConstantType("constant float_inferred = 42f;;", ShambdaCompiler.FLOAT_TYPE);
        checkConstantType("constant unsigned_inferred = u45648705464L;;", ShambdaCompiler.UNSIGNED_LONG_TYPE);
        checkConstantType("constant double_inferred = 5689.265d;;", ShambdaCompiler.DOUBLE_TYPE);
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
        Optional<SpvInstruction> constantInstruction = codeCollector.getInstructions().stream()
                .filter(i -> i instanceof ConstantInstruction)
                .findFirst();
        if( ! constantInstruction.isPresent())
            throw new RuntimeException("No constant instruction found");
        ConstantInstruction c = (ConstantInstruction) constantInstruction.get();
        assertEquals(expected, c.getType());
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
    }

    private static void printContent(String filename, byte[] bytes) throws IOException {
        FileOutputStream out = new FileOutputStream(new File(".", filename+".shambda.spv"));
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
