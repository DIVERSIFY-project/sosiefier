package fr.inria.diversify.sosie.pointSequence;

import fr.inria.diversify.sosie.compare.ExceptionDiff;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 9/16/13
 * Time: 2:21 PM
 */
public class ExceptionPoint extends Point {

    private List<String> stackTrace;

    public ExceptionPoint(String string, Map<String,String> idMap) {
        super(string, idMap);
    }

    @Override
    protected void buildFrom(String string, Map<String,String> idMap) {
        stackTrace = new ArrayList<String>();
        String[] array = string.split(";");
        try {
//            id = Integer.parseInt(array[1]);
            className = array[0];

            methodSignature = array[1];
            for (int i = 2; i< array.length; i++) {
                stackTrace.add(array[i]);
            }
            nbPoint++;
        } catch (Exception e) {
            error++;
            bugPoint = true;
        }
    }

    @Override
    public String toDot(Set catchDiff) {
        String dot = hashCode() + "     ";
        dot += "[\n label =";
        if(catchDiff.isEmpty())
            dot += "\"" + toString() + "\"";

        else {
            dot += "\"" + toString();
            for(Object vf : catchDiff)
                dot += "\\n"+((ExceptionDiff)vf).toDot();
            dot += "\"\n,color=\"red\",";
        }
        dot += "\n];";
        return dot;
    }

//    public boolean sameLogPoint(Point point) {
//        return super.sameLogPoint(point) && sameValue(point);
//    }

    public boolean sameCatchTrace(Point sPoint) {
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
