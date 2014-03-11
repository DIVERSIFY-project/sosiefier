package fr.inria.diversify.sosie.compare;


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
            id = Integer.parseInt(array[1]);
            className = array[2];
            methodSignature = array[3];

            for (int i = 4; i< array.length; i++) {
                stackTrace.add(array[i]);
            }
        } catch (Exception e) {
            error++;
            bugPoint = true;
        }
    }

    @Override
    public Diff getDiff(Point p) {
        if(this.samePosition(p))
            return new ExceptionDiff(className,methodSignature, isCatch, stackTrace, ((ExceptionPoint)p).stackTrace);
        else {
            ExceptionPoint ep = (ExceptionPoint)p;
            return new ExceptionDiff(className,methodSignature, isCatch, ep.className, ep.methodSignature, ep.isCatch);
        }
    }

    public boolean samePosition(Point point) {
        if(bugPoint || point.bugPoint)
            return bugPoint || point.bugPoint;

        return (className.equals(point.className)
                && methodSignature.equals(point.methodSignature));
    }

    public boolean sameValue(Point sPoint) {
        ExceptionPoint cPoint = (ExceptionPoint)sPoint;

        return isCatch == cPoint.isCatch && sameStackTrace(cPoint.stackTrace);
    }

    protected boolean sameStackTrace(List<String> otherStackTrace) {
        if(stackTrace.size() != otherStackTrace.size())
            return false;

        for(int i = 0; i < stackTrace.size(); i++) {
//            String exception1 = stackTrace.get(i).split(":")[0];
//            String exception2 = otherStackTrace.get(i).split(":")[0];
            String exception1 = stackTrace.get(i);
            String exception2 = otherStackTrace.get(i);
            if(!exception1.equals(exception2))
                return false;
        }
        return true;
    }

    public List<String> getStackTrace() {
        return stackTrace;
    }
}
