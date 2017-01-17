package fr.inria.diversify.util;

import spoon.reflect.declaration.CtType;
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

    public static CtTypeReference getTypeReference(String className, Factory f) {
        CtTypeReference type;
        try {
            if(className.endsWith("[]")) {
                CtTypeReference baseType = getTypeReference(className.substring(0,className.length()-2), f);
                type = f.Class().createArrayReference(baseType);
            } else {
                if (PrimitiveUtil.isPrimitive(className)) {
                    type = PrimitiveUtil.get(className, f);
                } else {
                    CtType t = f.Class().get(className);
                    if (t == null)
                        type = f.Code().createCtTypeReference(Class.forName(className));
                    else
                        type = f.Type().createReference(t);
                }
            }
            return type;
        } catch (Exception e) {
            System.out.println("Could not recreate type");
        }
        return null;
    }


}
