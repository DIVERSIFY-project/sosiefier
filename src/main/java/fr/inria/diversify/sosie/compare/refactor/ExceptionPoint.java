package fr.inria.diversify.sosie.compare.refactor;


import java.util.*;

/**
 * User: Simon
 * Date: 9/16/13
 * Time: 2:21 PM
 */
public class ExceptionPoint extends Point {
    protected boolean isCatch = false;
    protected List<String> stackTrace;

    public ExceptionPoint(String string, Map<String, String> idMap) {
        super(string, idMap);
    }

    public ExceptionPoint(String string, Map<String, String> idMap, boolean isCatch) {
        super(string, idMap);
        this.isCatch = isCatch;
    }

    @Override
    protected void buildFrom(String string, Map<String,String> idMap) {
        stackTrace = new ArrayList<String>();
        String[] array = string.split(":;:");
        try {
            className = array[1];

            methodSignature = array[2];
            for (int i = 1; i< array.length; i++) {
                stackTrace.add(array[i]);
            }
        } catch (Exception e) {
            error++;
            bugPoint = true;
        }
    }

    @Override
    public Set<Diff> getDiff(Point p) {
        ExceptionDiff e = new ExceptionDiff(className,methodSignature, isCatch, stackTrace, ((ExceptionPoint)p).stackTrace);
        Set<Diff> set = new HashSet<Diff>();
        set.add(e);
        return set;
    }

    public boolean sameValue(Point sPoint) {
        ExceptionPoint cPoint = (ExceptionPoint)sPoint;
        return sameStackTrace(cPoint.stackTrace);
    }

    protected boolean sameStackTrace(List<String> otherStackTrace) {
        if(stackTrace.size() != otherStackTrace.size())
            return false;

        for(int i = 0; i < stackTrace.size(); i++) {
            String exception1 = stackTrace.get(i).split(":")[0];
            String exception2 = otherStackTrace.get(i).split(":")[0];

            if(!exception1.equals(exception2))
                return false;
        }
        return true;
    }

    public List<String> getStackTrace() {
        return stackTrace;
    }
}
