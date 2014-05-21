package fr.inria.diversify.sosie.compare.stackElement;

import java.util.Map;

/**
 * Created by Simon on 24/04/14.
 */
public class StackTraceCall extends StackTraceElement {
    protected String className;
    protected String methodName;


    public StackTraceCall(String value, int deep, Map<String, String> idMap) {
        originalDeep = deep;
        if(!idMap.containsKey(value))
            this.methodName = "null";
        else
            this.methodName = idMap.get(value);
    }

    //only for parseDiff
    public StackTraceCall(String methodName, int deep) {
        originalDeep = deep;
        this.methodName = methodName;
    }

    public boolean equals(Object other) {
        if(other.getClass() != this.getClass())
            return false;

        StackTraceCall otherElem = (StackTraceCall) other;

        return //className.equals(otherElem.className) &&
                methodName.equals(otherElem.methodName);
    }

    public int hashCode() {
        return methodName.hashCode() + 1;
    }

    public String toString() {
        return methodName + ";" + originalDeep;
    }
}
