package fr.inria.diversify.sosie.pointSequence;

import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 08/01/14
 * Time: 16:16
 */
public class CallPoint extends Point {
    public CallPoint(String stringPoint, Map<String, String> idMap) {
        super(stringPoint, idMap);
    }

    @Override
    protected void buildFrom(String string, Map<String, String> idMap) {
        String[] array = string.split(";");
        id = Integer.parseInt(array[0]);
        className = idMap.get(array[1]).toString();
        methodSignature = idMap.get(array[2]).toString();
    }

    @Override
    public String toDot(Set varDiff) {
        return null;
    }
}
