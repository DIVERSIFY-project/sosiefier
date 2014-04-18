package fr.inria.diversify.sosie.stackTraceCompare;

/**
 * Created by Simon on 17/04/14.
 */
public class StackTracePush extends StackTraceOperation {
    protected StackTraceElement elem;


    public StackTracePush(StackTraceElement elem) {
        this.elem = elem;
    }

    @Override
    public void apply(StackTrace stackTrace) {
        stackTrace.deep++;
        stackTrace.stackTrace.push(elem);
    }

    @Override
    public void restore(StackTrace stackTrace) {
        stackTrace.deep--;
        stackTrace.stackTrace.pop();
    }
}
