package fr.inria.diversify.logger.stack.stackElement;

/**
 * Created by Simon on 24/04/14.
 */
public class StackTraceCatch extends StackTraceElement {

    public StackTraceCatch(int methodId, int deep, String value) {
        originalDeep = deep;
    }
}
