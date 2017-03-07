package org.jglr.shambda;

import org.jglr.sbm.types.Type;
import org.jglr.sbm.utils.ModuleConstant;

public class ModuleBoolConstant extends ModuleConstant {
    private final boolean value;

    public ModuleBoolConstant(String name, boolean value) {
        super(name, Type.BOOL, new long[] {value ? 1 : 0});
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }
}
