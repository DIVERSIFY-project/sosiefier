package fr.inria.diversify.sosie.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 11:48 AM
 */
public class Point {
    String className;
    String methodSignature;
    int id;
    String thread;
    Map<String, String> vars;

    public Point(String string) {
        buildFrom(string);
    }

    public boolean sameLogPoint(Point point) {
        return className.equals(point.className) && methodSignature.equals(point.methodSignature) && id == point.id;
    }

    public boolean sameValue(Point point) {
        boolean ret = true;
        for(String varName : vars.keySet()) {
            String other = point.vars.get(varName);
            if(other == null || other.equals(vars.get(varName))) {
                ret = false;
                break;
            }
        }

        return ret;
    }

    protected void buildFrom(String string) {
        vars = new HashMap<String, String>();

        String[] array = string.split(":;:");
        id = Integer.parseInt(array[0]);
        thread = array[1];
        className = array[2];
        methodSignature = array[3];
        for (int i = 4; i< array.length; i = i+2) {
            vars.put(array[i], array[i+1]);
        }
    }


    public String getClassName() {
        return className;
    }

    public String getMethodSignature() {
        return methodSignature;
    }

    public int getId() {
        return id;
    }
}

