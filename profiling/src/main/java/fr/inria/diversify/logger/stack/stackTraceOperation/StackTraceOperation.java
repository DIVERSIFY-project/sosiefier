package fr.inria.diversify.logger.stack.stackTraceOperation;

/**
 * Created by Simon on 17/04/14.
 */
public interface StackTraceOperation {

    public abstract void apply(StackTrace stackTrace);

    public abstract void restore(StackTrace stackTrace);
}
