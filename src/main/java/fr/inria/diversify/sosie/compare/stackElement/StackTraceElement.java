package fr.inria.diversify.sosie.compare.stackElement;

/**
 * Created by Simon on 17/04/14.
 */
public class StackTraceElement {
    protected int originalDeep;
    protected String method;
    protected String id;

    public int getOriginalDeep() {
        return originalDeep;
    }

    public String getMethod() {
        return method;
    }

    public String getId() {
        return id;
    }
}
