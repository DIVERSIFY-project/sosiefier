package fr.inria.diversify.sosie.compare.stackTraceOperation;

/**
 * Created by Simon on 17/04/14.
 */
@Deprecated
public interface StackTraceOperation {

    public abstract void apply(StackTrace stackTrace);

    public abstract void restore(StackTrace stackTrace);
}
