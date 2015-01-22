package fr.inria.diversify.sosie.compare.stackElement;

/**
 * Created by Simon on 24/04/14.
 */
public class StackTraceException extends StackTraceElement {
    public StackTraceException(String value, int deep) {
        originalDeep = deep;
    }
}
