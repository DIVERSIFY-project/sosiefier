package fr.inria.diversify.sosie.pointSequence;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.sosie.compare.VariableDiff;

import java.util.Map;
import java.util.Set;

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

    public Point() {}

    public Point(String string, Map<String,String> idMap) {
        buildFrom(string, idMap);
    }

    public boolean sameLogPoint(Point point) {
        if(bugPoint || point.bugPoint)
            return bugPoint && point.bugPoint;

        return (className.equals(point.className) && methodSignature.equals(point.methodSignature)); //&& id == point.id);
    }

    public boolean containsInto(CodeFragment cf) {
//        if(bugPoint)
//            return false;
        try {
            String cl = cf.getSourceClass().getQualifiedName().split("\\$")[0];
            String cl2 = className.split("\\$")[0];
            return cl2.equals(cl);
//                    && methodSignature.equals(cf.getCtCodeFragment().getParent(CtExecutable.class).getSignature()));
        }  catch (Exception e) {

        }
        return false;
    }

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

    public abstract String toDot(Set varDiff);
}

