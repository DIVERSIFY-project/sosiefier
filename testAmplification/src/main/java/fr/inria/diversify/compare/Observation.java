package fr.inria.diversify.compare;

import java.util.*;

/**
 * User: Simon
 * Date: 23/10/15
 * Time: 15:36
 */
public  class Observation {
    protected Set<String> notDeterministValues;
    protected Map<String, Object> observations;

    public Observation() {
        this.observations = new HashMap<String, Object>();
        this.notDeterministValues = new HashSet<String>();
    }

    public boolean add(String stringObject, Object value) {
        if (!notDeterministValues.contains(stringObject)) {
            if (observations.containsKey(stringObject)) {
                Object oldValue = observations.get(stringObject);
                if(oldValue != value) {
                    notDeterministValues.add(stringObject);
                    return false;
                }
            } else {
                observations.put(stringObject, value);
            }
            return true;
        } else {
            return false;
        }
    }

    public List<String> buildAssert() {
        List<String> asserts = new ArrayList<String>(observations.size());
        for (Map.Entry<String, Object> entry : observations.entrySet()) {
            if(!notDeterministValues.contains(entry.getKey())) {
                Object value = entry.getValue();
                if (isBoolean(value)) {
                    if ((Boolean) value) {
                        asserts.add("assertTrue(" + entry.getKey() + ")");
                    } else {
                        asserts.add("assertFalse(" + entry.getKey() + ")");
                    }
                } else if (value.getClass().isArray()) {
                    asserts.add("assertEquals(" + entry.getKey() + "," + primitiveArrayToString(value) + ")");
                } else {
                    asserts.add("assertEquals(" + entry.getKey() + ", " + value + ")");
                }
            }
        }
        return asserts;
    }

    protected boolean isBoolean(Object value) {
        return value instanceof Boolean;
    }

    protected String primitiveArrayToString(Object array) {
        String type = array.getClass().getCanonicalName();

        String tmp;
        if(type.equals("int[]")) {
            tmp = Arrays.toString((int[]) array);
            return "new int[]{" + tmp.substring(1, tmp.length() - 1) + "}";
        }
        if(type.equals("short[]")) {
            tmp = Arrays.toString((short[]) array);
            return "new short[]{" + tmp.substring(1, tmp.length() - 1) + "}";
        }
        if(type.equals("byte[]")) {
            tmp = Arrays.toString((byte[]) array);
            return "new byte[]{" + tmp.substring(1, tmp.length() - 1) + "}";
        }
        if(type.equals("long[]")) {
            tmp = Arrays.toString((long[]) array);
            return "new long[]{" + tmp.substring(1, tmp.length() - 1) + "}";
        }
        if(type.equals("float[]")) {
            tmp = Arrays.toString((float[]) array);
            return "new float[]{" + tmp.substring(1, tmp.length() - 1) + "}";
        }
        if(type.equals("double[]")) {
            tmp = Arrays.toString((double[]) array);
            return "new double[]{" + tmp.substring(1, tmp.length() - 1) + "}";
        }
        if(type.equals("boolean[]")) {
            tmp = Arrays.toString((boolean[]) array);
            return "new boolean[]{" + tmp.substring(1, tmp.length() - 1) + "}";
        }
        if(type.equals("char[]")) {
            tmp = Arrays.toString((char[]) array);
            return "new char[]{" + tmp.substring(1, tmp.length() - 1) + "}";
        }
        return null;
    }
}
