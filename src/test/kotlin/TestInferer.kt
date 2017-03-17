import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.jglr.inference.TypeInferer
import org.jglr.shambda.ShambdaCompiler
import org.jglr.shambda.grammar.ShambdaLexer
import org.jglr.shambda.grammar.ShambdaParser
import org.jglr.shambda.types.InferenceMapper
import org.junit.Test

class TestInferer {

    @Test
    fun simpleMapping() {
        val source = "0f +. 1f"
        val lexer = ShambdaLexer(ANTLRInputStream(source))
        val tokens = CommonTokenStream(lexer)
        val parser = ShambdaParser(tokens)
        val expression = parser.expression()
        val compiler = ShambdaCompiler(source)
        val mapper = InferenceMapper(compiler)
        val inferer = TypeInferer()
        val mapped = mapper.map(expression)
        inferer.infer(mapped)
        println(mapped)
    }
}