package fr.inria.diversify.sosie.compare;

import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 11:48 AM
 */
public abstract class Point {
    public static int error = 0;
    protected static String prefix;
    protected String className;
    protected String methodSignature;

    protected int id;
    protected boolean bugPoint = false;

    public Point() {}

    public Point(String string, Map<String, String> idMap) {
        buildFrom(string, idMap);
    }

    public static String getPrefix() {
        return prefix;
    }

    public boolean samePosition(Point point) {
        if(bugPoint || point.bugPoint)
            return bugPoint || point.bugPoint;

        return id == point.id
                && (className.equals(point.className)
                && methodSignature.equals(point.methodSignature));
    }

    public abstract boolean sameValue(Point p);

    protected abstract void buildFrom(String string, Map<String,String> idMap);

    public String getClassName() {
        return className;
    }

    public String getMethodSignature() {
        return methodSignature;
    }

    public int getId() {
        return id;
    }

    public abstract Diff getDiff(Point p);
}

