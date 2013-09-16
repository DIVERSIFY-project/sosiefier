package fr.inria.diversify.sosie.logger;

import java.util.ArrayList;
import java.util.List;

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

    public boolean sameValue(Point sPoint) {
        return true;
    }
}
