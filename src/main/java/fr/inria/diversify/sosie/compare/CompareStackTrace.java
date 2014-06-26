package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.compare.diff.*;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceCall;
import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTrace;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;

import java.util.*;

/**
 * Created by Simon on 17/04/14.
 */
public class CompareStackTrace {
    protected StackTrace stackTrace1;
    protected StackTrace stackTrace2;
    protected List<Diff> diffs;
    protected Report report;

    public CompareStackTrace(StackTrace st1, StackTrace st2) {
        stackTrace1 = st1;
        stackTrace2 = st2;
        diffs = new LinkedList<>();
        report = new Report();
    }

    public List<Diff> findCallDiff() {
        List<Diff> diffs = new LinkedList<>();
        //reset stackTrace1 and stackTrace2
        while(stackTrace1.hasNext() && stackTrace2.hasNext()) {
            stackTrace1.next();
            stackTrace2.next();

            if(!stackTrace1.getTop().equals(stackTrace2.getTop())
                    || !(stackTrace1.getDeep() == stackTrace2.getDeep())) {
//                addCallDiff(stackTrace1.getTop2(), Math.abs(stackTrace1.getDeep() - stackTrace2.getDeep()));
                CallDiff tmp = new CallDiff(stackTrace1.getTop2(), Math.abs(stackTrace1.getDeep() - stackTrace2.getDeep()));
                diffs.add(tmp);
            }
        }
        return diffs;
    }

    public List<Diff> findVariableDiff() {
        List<Diff> diffs = new LinkedList<>();
        //reset stackTrace1 and stackTrace2
        while(stackTrace1.hasNext() && stackTrace2.hasNext()) {
            stackTrace1.next();
            stackTrace2.next();

            Set<VariableDiff> vd = varDiff(stackTrace1,stackTrace2);
            if(!vd.isEmpty()) {
                diffs.addAll(vd);
            }
        }
        return diffs;
    }

    public List<Diff> findDiff() {
        List<Diff> diffs = new LinkedList<>();
        //reset stackTrace1 and stackTrace2

        boolean st1Lower = false, st2Lower = false;
        while(stackTrace1.hasNext() && stackTrace2.hasNext()) {
            if(!st1Lower) {
                stackTrace1.next();
            }
            if(!st2Lower) {
                stackTrace2.next();
            }
            StackTraceCall top1 = stackTrace1.getTop();
            StackTraceCall top2 = stackTrace2.getTop();
            int deep1 = stackTrace1.getDeep();
            int deep2 = stackTrace2.getDeep();

            if(!st1Lower && deep1 < deep2) {
                st1Lower = true;
            }
            if(!st2Lower &&  deep1 > deep2) {
                st1Lower = true;
            }
            if(st1Lower || st2Lower) {
                report.addDiffMethodCall(top1);
                report.addDiffMethodCall(top2);
                diffs.add(new CallDiff(stackTrace1.getTop2(), Math.abs(deep1 - deep2)));
            }

            boolean sameTop = top1.equals(top2);
            if(st1Lower && st2Lower || !sameTop) {
                diffs.add(findNewSyncro(20, 2, stackTrace1, stackTrace2));

                if(stackTrace1.getDeep() == stackTrace2.getDeep()) {
                    st1Lower = false; st2Lower = false;
                }
            }
            if(sameTop && !(st1Lower && st2Lower)){ //same stack trace
                report.addSameMethodCall(top1);
            }

            if(st1Lower == st2Lower && (stackTrace1.getVariablesValueChange() || stackTrace2.getVariablesValueChange())) {
                Set<VariableDiff> vd = varDiff(stackTrace1, stackTrace2);
                if (!vd.isEmpty()) {
                    diffs.addAll(vd);
                }
            }
        }
        return diffs;
    }

    protected Set<VariableDiff> varDiff(StackTrace st1, StackTrace st2) {
        Set<VariableDiff> diff = new HashSet<>();
        Map<String, Object> v1 = st1.getVariable();
        Map<String, Object> v2 = st2.getVariable();



        for(String key : v1.keySet()) {
            Object value = v1.get(key);
            Object value2 = v2.get(key);
            if(!v2.containsKey(key) || !value.equals(value2)) //!valueEqual(value, v2.get(key)))
                diff.add(new VariableDiff(st1.getTop(),key));
        }
        for(String key : v2.keySet()) {
            Object value = v2.get(key);
            Object value1 = v1.get(key);
            if(!v1.containsKey(key) || !value.equals(value1)) //!valueEqual(value, v1.get(key)))
                diff.add(new VariableDiff(st1.getTop(),key));
        }

        report.updateVar(v1, st1.getTop());
        report.updateVarDiff(diff);
        return diff;
    }




    protected CallDiff findNewSyncro(int maxOperation, int syncroRange, StackTrace st1, StackTrace st2) {
        int count1 = 0;
        int count2 = 0;
        int maxDiff = 1;
        CallDiff diff = new CallDiff(stackTrace1.getTop2(),1);
        for(int i = 0; i < maxOperation; i++) {
            for(int j = 0; j < maxOperation - i; j++) {
                maxDiff = Math.max(maxDiff,Math.abs(count1 - count2));
                if(st1.getTop().equals(st2.getTop()) &&  isSameForXOperation(syncroRange, st1, st2)) {
                    diff.setMaxStackDiff(maxDiff);
                    return diff;
                } else {
                    report.addDiffMethodCall(st1.getTop());
                    report.addDiffMethodCall(st2.getTop());
                }
                if(st1.hasNext()) {
                    count1++;
                    st1.next();
                }
            }
            st1.previous(count1);
            count1 = 0;
            if(st2.hasNext()) {
                count2++;
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
                if (!stackTrace1.getTop().equals(stackTrace2.getTop())) {
                    same = false;
                    break;
                }
            }
        }
        st1.previous(undo);
        st2.previous(undo);
        return same;
    }


    public Report getReport() {
        return report;
    }
}
