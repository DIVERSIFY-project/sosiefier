package fr.inria.diversify.sosie.pointSequence;

import fr.inria.diversify.sosie.compare.CatchDiff;
import fr.inria.diversify.sosie.compare.VariableDiff;
import fr.inria.diversify.sosie.pointSequence.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * User: Simon
 * Date: 9/16/13
 * Time: 2:21 PM
 */
public class CatchPoint extends Point {

    private List<String> stackTrace;

    public CatchPoint(String string) {
        super(string);
    }

    @Override
    protected void buildFrom(String string) {
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
                dot += "\\n"+((CatchDiff)vf).toDot();
            dot += "\"\n,color=\"red\",";
        }
        dot += "\n];";
        return dot;
    }

//    public boolean sameLogPoint(Point point) {
//        return super.sameLogPoint(point) && sameValue(point);
//    }

    public boolean sameCatchTrace(Point sPoint) {
        CatchPoint cPoint = (CatchPoint)sPoint;
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
}
