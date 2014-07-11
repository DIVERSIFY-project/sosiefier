package fr.inria.diversify.sosie.compare.stackTraceOperation;

import fr.inria.diversify.sosie.compare.stackElement.StackTraceCall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Created by Simon on 17/04/14.
 */
public class StackTracePop implements StackTraceOperation {
    protected int pop;
    protected Stack<StackTraceCall> callsPop;

    public StackTracePop(int pop) {
        this.pop = pop;
        callsPop = new Stack<>();
    }

    public void apply(StackTrace stackTrace) {
        for(int i = 0; i < pop; i++) {
            stackTrace.deep--;
            callsPop.add(stackTrace.stackTraceCalls.pop());
        }
    }

    @Override
    public void restore(StackTrace stackTrace) {
//        List<StackTraceOperation> operation = stackTrace.stackTraceOperations;
//        List<StackTraceOperation> toApply = new ArrayList<>();
//        int index = stackTrace.position;
//        for(int i = 0; i < pop; i++) {
//            while(!(operation.get(index) instanceof StackTracePush))
//                index--;
//            toApply.add(operation.get(index)); //.apply(stackTrace);
//            index--;
//        }
//        Collections.reverse(toApply);
//        for(StackTraceOperation op : toApply) {
//            op.apply(stackTrace);
//        }
            for(int i = 0; i < pop ; i++) {
                stackTrace.stackTraceCalls.push(callsPop.pop());
                stackTrace.deep++;
            }

    }
}
