package org.jglr.shambda.types

import org.jglr.inference.expressions.TypeDefinition
import org.jglr.sbm.types.Type
import org.jglr.shambda.ShambdaCompiler

private fun prim(t: Type): TypeDefinition = object : TypeDefinition() { override fun toString(): String = t.name}

val Bool = prim(ShambdaCompiler.BOOL_TYPE)
val Integer = prim(ShambdaCompiler.INT_TYPE)
val Float = prim(ShambdaCompiler.FLOAT_TYPE)
val Double = prim(ShambdaCompiler.DOUBLE_TYPE)
val Long = prim(ShambdaCompiler.LONG_TYPE)
val Sampler2D = prim(ShambdaCompiler.SAMPLER2D_TYPE)
val UInteger = prim(ShambdaCompiler.UNSIGNED_INT_TYPE)
val ULong = prim(ShambdaCompiler.UNSIGNED_LONG_TYPE)

fun suffixType(operator: String): Type {
    return when(operator.substring(1)) {
        "." -> ShambdaCompiler.FLOAT_TYPE
        ".." -> ShambdaCompiler.DOUBLE_TYPE
        "l" -> ShambdaCompiler.LONG_TYPE
        "u" -> ShambdaCompiler.UNSIGNED_INT_TYPE
        "ul", "lu" -> ShambdaCompiler.UNSIGNED_LONG_TYPE
        else -> ShambdaCompiler.INT_TYPE
    }
}