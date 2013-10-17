package fr.inria.diversify.sosie.pointSequence;

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
    public String toDot(int x, int y, Set<VariableDiff> varDiff) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean sameValue(Point sPoint) {
        return true;
    }
}
