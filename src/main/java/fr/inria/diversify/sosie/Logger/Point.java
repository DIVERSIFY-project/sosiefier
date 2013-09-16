package fr.inria.diversify.sosie.logger;

import java.util.*;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 11:48 AM
 */
public abstract class Point {
    String className;
    String methodSignature;
    int id;
    boolean bugPoint = false;

    public Point(String string) {
        buildFrom(string);
    }

    public boolean sameLogPoint(Point point) {
        if(bugPoint || point.bugPoint)
            return bugPoint && point.bugPoint;
        return (className.equals(point.className) && methodSignature.equals(point.methodSignature) && id == point.id);
    }

    protected abstract void buildFrom(String string);

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

