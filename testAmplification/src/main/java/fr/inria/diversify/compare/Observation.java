package fr.inria.diversify.compare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Simon
 * Date: 23/10/15
 * Time: 15:36
 */
public  class Observation {
    protected Map<String, Object> observations;

    public Observation() {
        this.observations = new HashMap<String, Object>();
    }

    public void add(String stringObject, Object value) {
        observations.put(stringObject, value);
    }

    public List<String> buildAssert() {
        List<String> asserts = new ArrayList<String>(observations.size());
        for (Map.Entry<String, Object> entry : observations.entrySet()) {
            if(isBoolean(entry.getValue())) {
                if((Boolean)entry.getValue()) {
                    asserts.add("assertTrue(" + entry.getKey() + ")");
                } else {
                    asserts.add("assertFalse(" + entry.getKey() + ")");
                }
            } else {
                asserts.add("assertEquals(" + entry.getKey() + ", " + entry.getValue() + ")");
            }
        }
        return asserts;
    }

    protected boolean isBoolean(Object value) {
        return value instanceof Boolean;
    }
}
