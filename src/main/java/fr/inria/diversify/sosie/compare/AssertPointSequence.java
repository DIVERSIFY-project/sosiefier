package fr.inria.diversify.sosie.compare;

import java.util.Map;

/**
 * User: Simon
 * Date: 03/03/14
 * Time: 16:11
 */
public class AssertPointSequence extends AbstractPointSequence {
    @Override
    protected void addPoint(String stringPoint, Map<String, String> idMap) {
        if(stringPoint.startsWith("A"))
            points.add(new AssertPoint(stringPoint, idMap));
    }


}
