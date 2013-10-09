package fr.inria.diversify.sosie.logger;

import fr.inria.diversify.codeFragment.CodeFragment;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtMethod;

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

    public boolean containsInto(CodeFragment cf) {
        if(bugPoint)
            return false;
        try {
            String cl = cf.getSourceClass().getQualifiedName().split("$")[0];
            String cl2 = className.split("$")[0];
            return cl2.equals(cl);
//                    && methodSignature.equals(cf.getCtCodeFragment().getParent(CtExecutable.class).getSignature()));
        }  catch (Exception e) {

        }
        return false;
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

