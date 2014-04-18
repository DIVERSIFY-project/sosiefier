package fr.inria.diversify.sosie.stackTraceCompare;

/**
 * Created by Simon on 17/04/14.
 */
public class StackTraceElement {
    protected String className;
    protected String methodName;
    protected int originalDeep;

    public StackTraceElement(String methodName, int deep) {
        originalDeep = deep;
        this.methodName = methodName;
    }


    public boolean equals(Object other) {
        if(other.getClass() != this.getClass())
            return false;

        StackTraceElement otherElem = (StackTraceElement) other;

        return //className.equals(otherElem.className) &&
                methodName.equals(otherElem.methodName);
    }

    public String toString() {
        return methodName;
    }
}
