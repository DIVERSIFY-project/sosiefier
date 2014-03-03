package fr.inria.diversify.sosie.compare.refactor;

import java.util.Map;

/**
 * User: Simon
 * Date: 03/03/14
 * Time: 14:31
 */
public class ExceptionPointSequence extends AbstractPointSequence {
    @Override
    protected void addPoint(String stringPoint, Map<String, String> idMap) {
        if(stringPoint.startsWith("E"))
            points.add(new ExceptionPoint(stringPoint, idMap));
        if(stringPoint.startsWith("Ca"))
            points.add(new ExceptionPoint(stringPoint, idMap, true));
    }

}
