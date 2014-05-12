package fr.inria.diversify.sosie.stackTraceCompare.stackTraceOperation;

import java.util.List;

/**
 * Created by Simon on 17/04/14.
 */
public class StackTracePop implements StackTraceOperation {
    protected int pop;

    public StackTracePop(int pop) {
        this.pop = pop;
    }

    public void apply(StackTrace stackTrace) {
        for(int i = 0; i < pop; i++) {
            stackTrace.deep--;
            stackTrace.stackTraceCalls.pop();
        }
    }

    @Override
    public void restore(StackTrace stackTrace) {
        List<StackTraceOperation> operation = stackTrace.stackTraceOperations;
        int index = stackTrace.position;
        for(int i = 0; i < pop; i++) {
            while(!(operation.get(index) instanceof StackTracePush))
                index--;
            operation.get(index).apply(stackTrace);
            index--;
        }
    }
}
