package fr.inria.diversify.logger.stack.stackTraceOperation;

import fr.inria.diversify.logger.stack.stackElement.StackTraceCall;

import java.util.LinkedList;

/**
 * Created by Simon on 17/04/14.
 */
public class StackTracePop implements StackTraceOperation {
    protected int pop;
    protected LinkedList<StackTraceCall> callsPop;

    public StackTracePop(int pop) {
        this.pop = pop;
    }

    public void apply(StackTrace stackTrace) {
        callsPop = new LinkedList<>();
        for(int i = 0; i < pop; i++) {
            if(!stackTrace.stackTraceCalls.isEmpty()) {
                stackTrace.deep--;
                callsPop.add(stackTrace.stackTraceCalls.pop());
            }
        }
    }

    @Override
    public void restore(StackTrace stackTrace) {
        int size = callsPop.size();
        for(int i = 0; i < size ; i++) {
            stackTrace.stackTraceCalls.push(callsPop.pop());
            stackTrace.deep++;
        }

    }
}
