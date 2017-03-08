import com.sun.org.apache.xalan.internal.xsltc.compiler.util.TypeCheckError
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.jglr.sbm.instructions.ResultInstruction
import org.jglr.sbm.visitors.CodeCollector
import org.jglr.sbm.visitors.ModuleReader
import org.jglr.shambda.ShambdaCompiler
import org.jglr.shambda.ShambdaTypeError
import org.jglr.shambda.grammar.ShambdaLexer
import org.jglr.shambda.grammar.ShambdaParser
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import java.io.File
import java.io.FileOutputStream
import java.io.IOException


class TestConstantSimplifier {

    fun compile(source: String): ByteArray {
        val compiler = ShambdaCompiler(source)
        compiler.compile()
        return compiler.toBytes()
    }

    @Rule
    @JvmField
    val thrown = ExpectedException.none()

    @Test
    fun correctOperatorTypes() {
        printContent("correctOperatorTypes0", compile("a = u455 /u u4;;"))
        printContent("correctOperatorTypes1", compile("b = 4.5D *.. 45680D;;"))
        printContent("correctOperatorTypes2", compile("c = u45L +ul u4876L;;"))
        printContent("correctOperatorTypes3", compile("d = 45 - 1;;"))
        printContent("correctOperatorTypes4", compile("e = 45.4f -. 876f;;"))
        printContent("correctOperatorTypes5", compile("f0 = 45.4f *. (0f-.876f);;"))
    }

    @Test
    fun mismatchedOperatorTypeDiv() {
        thrown.expect(ShambdaTypeError::class.java)
        thrown.expectMessage("<uint32> /u <uint32>: <uint64> /u <int64>")
        printContent("mismatchedOperatorTypeDiv", compile("a = u455L /u 4L;;"))
    }

    @Test
    fun mismatchedOperatorTypePlus() {
        thrown.expect(ShambdaTypeError::class.java)
        thrown.expectMessage("<float32> +. <float32>: <float32> +. <int32>")
        compile("a = 0f +. 4;;")
    }

    @Throws(IOException::class)
    private fun printContent(filename: String, bytes: ByteArray) {
        val file = File("tests/", filename + ".shambda.spv")
        if (!file.parentFile.exists())
            file.parentFile.mkdirs()
        val out = FileOutputStream(file)
        out.write(bytes)
        out.flush()
        out.close()

        print("=== START ===")
        val reader = ModuleReader(bytes)
        reader.visitHeader()
        val codeCollector = reader.visitCode() as CodeCollector
        codeCollector.instructions.forEach { i ->
            print(i.wordCount.toString() + " words: ")
            if (i is ResultInstruction)
                print("%" + i.resultID + " = ")
            println(i.toString())
        }
        print("=== END ===")
    }
}