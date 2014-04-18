package fr.inria.diversify.sosie.stackTraceCompare;

/**
 * Created by Simon on 17/04/14.
 */
public abstract class StackTraceOperation {

    public abstract void apply(StackTrace stackTrace);

    public abstract void restore(StackTrace stackTrace);
}
