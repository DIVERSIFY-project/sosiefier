package fr.inria.diversify.constantgenerator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * User: Simon
 * Date: 03/04/15
 * Time: 14:20
 */
public class ArithmeticObject extends ObjectCreation {
    String type;


    public ArithmeticObject(ObjectCreation o1, ObjectCreation o2, String type) {
        this.type = type;
        args = new ObjectCreation[2];
        args[0] = o1;
        args[1] = o2;
    }

    @Override
    public Method[] getMethods() {
        return int.class.getMethods();
    }

    @Override
    protected Object pBuildObject() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        switch (type) {
            case "multi":
                return (Integer) args[0].getValue() * (Integer) args[1].getValue();
            case "minus":
                return (Integer) args[0].getValue() - (Integer) args[1].getValue();
            case "pow":
                return Math.pow((Integer) args[0].getValue(), (Integer) args[1].getValue());
        }
        return null;
    }

    @Override
    public Class getDynamicType() {
        return int.class;
    }

    public String toString() {
        switch (type) {
            case "multi":
                return "(" + args[0].toString() + " * " +args[1].toString() + ")";
            case "minus":
                return "(" + args[0].toString() + " - " +args[1].toString() + ")";
            case "pow":
                return "(Math.pow((Integer) " + args[0].toString() + ", (Integer) " +args[1].toString() + "))";
        }
        return "";
    }

    @Override
    public int size() {
        return args[0].size() + args[1].size() + 1;
    }
}
