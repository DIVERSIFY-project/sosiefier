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
        String methodName = idMap.get(methodId);
        if (methodName == null) {
            dico.put(methodId,"null");
        } else {
            dico.put(methodId,methodName);
            className = parseClassName(methodName);
        }
    }

    //only for parseDiff
    public StackTraceCall(String methodName, int deep) {
        originalDeep = deep;
//        this.method = methodName;
//        className = parseClassName(this.method);
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
        return getMethod() + ";" + originalDeep;
    }

    protected String parseClassName(String methodSignature) {
        String[] tmp = methodSignature.split(" ");
        int i = 0;
        while(tmp[i].length() == 0) {
            i++;
        }
        return tmp[i];
    }

    public String getClassName() {
        return className;
    }
}
