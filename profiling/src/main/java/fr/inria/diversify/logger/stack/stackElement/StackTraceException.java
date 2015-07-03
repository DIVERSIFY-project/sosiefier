package fr.inria.diversify.logger.stack.stackElement;

/**
 * Created by Simon on 24/04/14.
 */
public class StackTraceException extends StackTraceElement {
    public StackTraceException(int methodId, int deep, String value) {
        originalDeep = deep;
    }
}
