package fr.inria.diversify.sosie.pointSequence;

import java.util.Map;

/**
 * User: Simon
 * Date: 28/02/14
 * Time: 15:34
 */
public class ExceptionSequence extends AbstractPointSequence<ExceptionPoint> {

    @Override
    protected void addPoint(String stringPoint, Map<String, String> idMap) {
        if(stringPoint.startsWith("T"))
            points.add(new ExceptionPoint(stringPoint, idMap));
    }
}
