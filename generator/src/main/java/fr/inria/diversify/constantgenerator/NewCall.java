package fr.inria.diversify.constantgenerator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * User: Simon
 * Date: 31/03/15
 * Time: 11:06
 */
public class NewCall extends ObjectCreation {
    protected Constructor constructor;


    public NewCall(Constructor constructor) {
        this.constructor = constructor;
        this.args = new ObjectCreation[0];
    }

    public NewCall(Constructor constructor, ObjectCreation[] args) {
        this.constructor = constructor;
        this.args = args;
    }

    @Override
    public Method[] getMethods() {
        return constructor.getDeclaringClass().getMethods();
    }




    protected Object pBuildObject() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object[] objects = new Object[args.length];
        for (int i = 0; i < args.length; i++) {
                objects[i] = args[i].getValue();
            }
        return constructor.newInstance(objects);
    }

    @Override
    public Class getDynamicType() {
        return constructor.getDeclaringClass();
    }

    @Override
    public int size() {
        int sum = 1;
        for(int i = 0; i < args.length; i++) {
            sum += args[i].size();
        }
        return sum;
    }


    public String toString() {
        String ret = "new " + constructor.getDeclaringClass().getSimpleName() +"(";
        if(args.length == 0) {
            return ret + ")";
        } else {
            for(int i = 0; i < args.length - 1; i++) {
                ret += args[i] + ",";
            }
        }
        return ret + args[args.length - 1] + ")";
    }

    public boolean equals(Object other) {
        if(!(other instanceof NewCall)) {
            return false;
        }

        NewCall mc = (NewCall) other;

        if(args.length != mc.args.length) {
            return false;
        }
        for(int i = 0; i < args.length; i++) {
            if(!args[i].equals(mc.args[i])) {
                return false;
            }
        }

        return constructor.equals(mc.constructor);
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

}
