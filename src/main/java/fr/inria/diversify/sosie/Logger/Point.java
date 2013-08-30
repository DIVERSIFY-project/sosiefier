package fr.inria.diversify.sosie.logger;

import java.util.*;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 11:48 AM
 */
public class Point {
    String className;
    String methodSignature;
    int id;
    Map<String, String> vars;
    boolean bugPoint = false;

    public Point(String string) {
        buildFrom(string);
    }

    public boolean sameLogPoint(Point point) {
        if(bugPoint || point.bugPoint)
            return bugPoint && point.bugPoint;
        return (className.equals(point.className) && methodSignature.equals(point.methodSignature) && id == point.id);
    }

    public boolean sameValue(Point point) {
        boolean ret = true;
        for(String varName : vars.keySet()) {
            String other = point.vars.get(varName);
            if(other == null || !valueEqual(other,vars.get(varName))) {
//                System.out.println("dif val: "+varName+ " -> "+vars.get(varName) +" ||| "+other);
                ret = false;
                break;
            }
        }

        return ret;
    }

    public Set<String> getDifVar(Point point) {
        Set<String> difVar = new HashSet<String>();
        for(String varName : vars.keySet()) {
            String other = point.vars.get(varName);
            if(other == null) {
                new Exception("pas les meme variables");
            }
            if(!valueEqual(other,vars.get(varName))) {
                difVar.add(className+":"+methodSignature+":"+varName);
            }
        }
        return difVar;
    }

    protected boolean valueEqual(String v1, String v2) {
        if((v1.startsWith("{") && v2.startsWith("{"))
                || (v1.startsWith("[") && v2.startsWith("["))) {
            return v1.split(", ").length == v2.split(", ").length;
        }
        if(v1.contains("@") && v2.contains("@"))
            return v1.split("@")[0].equals(v2.split("@")[0]);
        return  v1.equals(v2);

    }

    protected void buildFrom(String string) {
        vars = new HashMap<String, String>();
        String[] array = string.split(":;:");
        try {
        id = Integer.parseInt(array[0]);
        className = array[1];
        methodSignature = array[2];
            for (int i = 3; i< array.length; i = i+2) {
            vars.put(array[i], array[i+1]);
            }
        } catch (Exception e) {
            bugPoint = true;
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

