package org.jglr.shambda;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.jglr.sbm.StorageClass;
import org.jglr.sbm.types.*;
import org.jglr.shambda.grammar.ShambdaBaseVisitor;
import org.jglr.shambda.grammar.ShambdaParser;

import static org.jglr.shambda.ShambdaCompiler.SAMPLER2D_TYPE;

public class TypeBuilder extends ShambdaBaseVisitor<Type> {
    private ShambdaCompiler compiler;

    public TypeBuilder(ShambdaCompiler compiler) {
        this.compiler = compiler;
    }

    @Override
    public Type visitBaseType(ShambdaParser.BaseTypeContext ctx) {
        TerminalNode identifier = ctx.Identifier();
        String raw = identifier.getText();
        if(raw.equals("sampler2D")) {
            return SAMPLER2D_TYPE;
        }
        if(raw.startsWith("float")) {
            String width = raw.substring("float".length());
            try {
                int bitWidth = Integer.parseInt(width);
                return new FloatType(bitWidth);
            } catch (Exception e) {
                compiler.compileError("Float types must be followed by their width written as in integer: float32, float64", ctx);
            }
        }
        if(raw.startsWith("uint")) {
            String width = raw.substring("uint".length());
            try {
                int bitWidth = Integer.parseInt(width);
                return new IntType(bitWidth, false);
            } catch (Exception e) {
                compiler.compileError("Unsigned integer types must be followed by their width written as in integer: uint32", ctx);
            }
        }
        if(raw.startsWith("int")) {
            String width = raw.substring("int".length());
            try {
                int bitWidth = Integer.parseInt(width);
                return new IntType(bitWidth, true);
            } catch (Exception e) {
                compiler.compileError("Integer types must be followed by their width written as in integer: int64", ctx);
            }
        }
        return new Type(raw);
    }

    @Override
    public Type visitArrayType(ShambdaParser.ArrayTypeContext ctx) {
        Type elementType = ctx.type().accept(this);
        int size = Integer.parseInt(ctx.Integer().getText());
        return new ArrayType(elementType, size);
    }

    @Override
    public Type visitCompositeType(ShambdaParser.CompositeTypeContext ctx) {
        String raw = ctx.Identifier().getText();
        Type subType = ctx.type().accept(this);
        if(raw.startsWith("vec")) {
            String width = raw.substring("vec".length());
            try {
                int size = Integer.parseInt(width);
                return new VectorType(subType, size);
            } catch (Exception e) {
                compiler.compileError("Vector types must be followed by their size written as in integer: vec2(<type>)", ctx);
            }
        }
        if(raw.startsWith("mat")) {
            String width = raw.substring("mat".length());
            try {
                int columnCount = Integer.parseInt(width);
                return new MatrixType(subType, columnCount);
            } catch (Exception e) {
                compiler.compileError("Matrix types must be followed by their size written as in integer: mat4(vec2(float32))", ctx);
            }
        }
        compiler.compileError("Unknown composite type: "+raw, ctx);
        return null;
    }

    @Override
    public Type visitPointerType(ShambdaParser.PointerTypeContext ctx) {
        String storageClassName = ctx.storageClass().getText();
        return new PointerType(StorageClass.valueOf(storageClassName), ctx.type().accept(this));
    }
}
