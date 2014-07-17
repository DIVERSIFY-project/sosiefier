package fr.inria.diversify.sosie.compare.stackElement;

import java.util.Map;

/**
 * Created by Simon on 24/04/14.
 */
public class StackTraceCall extends StackTraceElement {
    protected String className;



    public StackTraceCall(int methodId, int deep, Map<Integer, String> idMap) {
        originalDeep = deep;
        this.methodId = methodId;
        if (!idMap.containsKey(methodId)) { this.method = "null"; } else { this.method = idMap.get(methodId); }
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
                methodId.equals(otherElem.methodId);
    }

    public int hashCode() {
        return methodId.hashCode() + 1;
    }

    public String toString() {
        return method + ";" + originalDeep;
    }
}
