package fr.inria.diversify.util;

import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;


/**
 * Created by nharrand on 09/01/17.
 */
public class PrimitiveUtil {
    public static String[] primitives = {"boolean", "long", "int", "short", "byte", "char", "float", "double"};

    public static boolean isPrimitive(String className) {
        for(String str : primitives) {
            if(className.equals(str)) return true;
        }
        return false;
    }

    public static CtTypeReference get(String className, Factory f) {
        switch (className) {
            case "boolean":
                return f.Class().BOOLEAN_PRIMITIVE;
            case "long":
                return f.Class().LONG_PRIMITIVE;
            case "int":
                return f.Class().INTEGER_PRIMITIVE;
            case "short":
                return f.Class().SHORT_PRIMITIVE;
            case "byte":
                return f.Class().BYTE_PRIMITIVE;
            case "char":
                return f.Class().CHARACTER_PRIMITIVE;
            case "float":
                return f.Class().FLOAT_PRIMITIVE;
            case "double":
                return f.Class().DOUBLE_PRIMITIVE;
            default:
                return null;
        }
    }
}
