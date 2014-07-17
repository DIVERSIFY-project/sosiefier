package fr.inria.diversify.sosie.compare.stackElement;

/**
 * Created by Simon on 17/04/14.
 */
public class StackTraceElement {

    //Depth in wich this stack element was logged
    protected int originalDeep;
    //Method where the stack element was logged
    protected String method;
    //Element id
    protected Integer methodId;

    public int getOriginalDeep() {
        return originalDeep;
    }

    public String getMethod() {
        return method;
    }

    public Integer getId() {
        return methodId;
    }
}
