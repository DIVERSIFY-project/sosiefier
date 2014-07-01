package fr.inria.diversify.sosie.compare.stackElement;

import java.util.Map;

/**
 * Created by Simon on 24/04/14.
 */
public class StackTraceCall extends StackTraceElement {
    protected String className;



    public StackTraceCall(int id, int deep, Map<Integer, String> idMap) {
        originalDeep = deep;
        this.id = id;
        if (!idMap.containsKey(id)) { this.method = "null"; } else { this.method = idMap.get(id); }
    }

    //only for parseDiff
    public StackTraceCall(String methodName, int deep) {
        originalDeep = deep;
        this.method = methodName;
    }

    public boolean equals(Object other) {
        if (!(other instanceof StackTraceCall)) { return false; }

        StackTraceCall otherElem = (StackTraceCall) other;

        return //className.equals(otherElem.className) &&
                method.equals(otherElem.method);
    }

    public int hashCode() {
        return method.hashCode() + 1;
    }

    public String toString() {
        return method + ";" + originalDeep;
    }
}
