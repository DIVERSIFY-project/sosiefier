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
    int nb;
    public CallPoint(String stringPoint, Map<String, String> idMap) {
        super(stringPoint, idMap);
        nb = 0;
    }

    @Override
    protected void buildFrom(String string, Map<String, String> idMap) {
        try {
            String[] array = string.split(";");
            className = idMap.get(array[1]);
            idClass = array[1];
            methodSignature = idMap.get(array[2]);
            idMethod  = array[2];
            nbPoint++;
        } catch (Exception e) {
            bugPoint = true;
            error++;
        }
        if(className == null || methodSignature == null)
            bugPoint = true;
    }

    protected String idClass;
    protected String idMethod;

    @Override
    public String toDot(Set varDiff) {
        return null;
    }

    public void incNb() {
        nb++;
    }
}
