package fr.inria.diversify.constantgenerator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * User: Simon
 * Date: 31/03/15
 * Time: 11:01
 */
public class MethodCall extends  ObjectCreation {
    protected ObjectCreation target;
    protected Method method;

    public MethodCall(ObjectCreation target, Method method, ObjectCreation[] args) {
        this.target = target;
        this.method = method;
        this.args = args;
    }

    public Method[] getMethods() {
        return getDynamicType().getMethods();
    }

    public Object pBuildObject() throws IllegalAccessException, InstantiationException, InvocationTargetException {

            Object[] objects = new Object[args.length];
            for(int i = 0; i < args.length; i++) {
                objects[i] = args[i].getValue();
            }

            return method.invoke(target.getValue(), objects);
    }

    @Override
    public Class getDynamicType() {
        return method.getReturnType();
    }

    public String toString() {
        String ret = "(" + target.toString() +")." + method.getName() + "(";
        if(args.length == 0) {
            return ret + ")";
        } else {
            for(int i = 0; i < args.length - 1; i++) {
                ret += args[i] + ",";
            }
        }
        return ret + args[args.length - 1] + ")";
    }

    @Override
    public int size() {
        int sum = target.size() + 1;
        for(int i = 0; i < args.length; i++) {
            sum += args[i].size();
        }
        return sum;
    }

    public boolean equals(Object other) {
        if(!(other instanceof MethodCall)) {
            return false;
        }

        MethodCall mc = (MethodCall) other;

        if(args.length != mc.args.length) {
            return false;
        }
        for(int i = 0; i < args.length; i++) {
            if(!args[i].equals(mc.args[i])) {
                return false;
            }
        }

        return target.equals(mc.target) && method.equals(mc.method);
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}
