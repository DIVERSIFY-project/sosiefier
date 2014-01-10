package fr.inria.diversify.sosie.pointSequence;

import fr.inria.diversify.util.Log;

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
        try {
            String[] array = string.split(";");
            className = idMap.get(array[0]);
            methodSignature = idMap.get(array[1]);
            nbPoint++;
        } catch (Exception e) {
            error++;
            Log.debug("error");
        }
    }

    @Override
    public String toDot(Set varDiff) {
        return null;
    }
}
