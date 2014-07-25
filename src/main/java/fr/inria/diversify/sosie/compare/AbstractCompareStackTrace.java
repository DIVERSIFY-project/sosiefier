package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.compare.diff.CallDiff;
import fr.inria.diversify.sosie.compare.diff.Diff;
import fr.inria.diversify.sosie.compare.diff.TestReport;
import fr.inria.diversify.sosie.compare.diff.VariableDiff;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceCall;
import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTrace;

import java.util.*;

/**
 * Created by Simon on 23/07/14.
 */
public abstract class  AbstractCompareStackTrace {
    protected StackTrace originalStackTrace;
    protected StackTrace sosieStackTrace;
    protected List<Diff> diffs;
    protected TestReport testReport;

    //used for ComparePartialStackTrace
    public static int maxPop = 0;

    public AbstractCompareStackTrace(StackTrace st1, StackTrace st2) {
        originalStackTrace = st1;
        sosieStackTrace = st2;
        diffs = new LinkedList();
        testReport = new TestReport();
    }


    public abstract List<Diff> findDiff();

    protected Set<VariableDiff> varDiff(StackTrace st1, StackTrace st2) {
        Set<VariableDiff> diff = new HashSet();
        Map<String, Object> v1 = st1.getVariable();
        Map<String, Object> v2 = st2.getVariable();


        for(String key : v1.keySet()) {
            Object value = v1.get(key);
            Object value2 = v2.get(key);
            if(value2 == null || !value.equals(value2))
                diff.add(new VariableDiff(st1.getTop(),key));
        }
        for(String key : v2.keySet()) {
            Object value = v2.get(key);
            Object value1 = v1.get(key);
            if(value1 == null || !value.equals(value1))
                diff.add(new VariableDiff(st1.getTop(),key));
        }

        testReport.updateVar(v1, st1.getTop());
        testReport.updateVarDiff(diff);
        return diff;
    }

    protected CallDiff findNewSyncro(int maxOperation, int syncroRange, StackTrace st1, StackTrace st2) {
        int count1 = 0;
        int count2 = 0;
        int maxDiff = 1;

        List<StackTraceCall> callDiff1 = new ArrayList<>();
        List<StackTraceCall> callDiff2 = new ArrayList<>();

        CallDiff diff = new CallDiff(originalStackTrace.getTop2(),1);
        for(int i = 0; i < maxOperation; i++) {
            for(int j = 0; j < maxOperation - i; j++) {
                maxDiff = Math.max(maxDiff,Math.abs(count1 - count2));
                if(st1.getTop().equals(st2.getTop()) &&  isSameForXOperation(syncroRange, st1, st2)) {
                    diff.setMaxStackDiff(maxDiff);
                    testReport.addAllDiffMethodCall(callDiff1);
                    testReport.addAllDiffMethodCall(callDiff2);
                    return diff;
                }
                if(st1.hasNext()) {
                    count1++;
                    callDiff1.add(st1.getTop());
                    st1.next();
                }
            }
            st1.previous(count1);
            callDiff1.clear();
            count1 = 0;
            if(st2.hasNext()) {
                count2++;
                callDiff2.add(st2.getTop());
                st2.next();

            }
        }
        maxDiff = Math.max(maxDiff,Math.abs(count1 - count2));
        diff.setMaxStackDiff(maxDiff);
        st2.previous(count2);
        return diff;
    }

    protected boolean isSameForXOperation(int x, StackTrace st1, StackTrace st2) {
        if(st1.getDeep() != st2.getDeep())
            return false;

        int undo = 0;
        boolean same = true;
        for (int count = 0; count < x; count++) {
            if (st1.hasNext() && st2.hasNext()) {
                undo++;
                st1.next();
                st2.next();
                if (!originalStackTrace.getTop().equals(sosieStackTrace.getTop())) {
                    same = false;
                    break;
                }
            }
        }
        st1.previous(undo);
        st2.previous(undo);
        return same;
    }

    protected void nextVar(StackTrace stackTrace, Set<Integer> methods) {
        if(methods.contains(stackTrace.getTop().getId())) {
            //we do not log the varibles of a sosified method
            Map<String, Object> vars = new HashMap(stackTrace.getVariable());
            stackTrace.next();
            stackTrace.getVariable().clear();
            stackTrace.getVariable().putAll(vars);

        } else {
            stackTrace.next();
        }

    }

    public TestReport getTestReport() {
        return testReport;
    }

}
