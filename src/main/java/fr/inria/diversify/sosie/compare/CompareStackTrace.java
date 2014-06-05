package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.compare.diff.*;
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
//    protected Map<StackTraceElement, Integer> callDiff;

//    public CompareStackTrace(StackTrace st1, StackTrace st2, List<Diff> diffs) {
//        stackTrace1 = st1;
//        stackTrace2 = st2;
//        this.diffs = new LinkedList<>();
//        callDiff = new HashMap<>();
//        for(Diff diff : diffs) {
//            if (diff instanceof CallDiff) {
//                callDiff.put(diff.getDiffStart(), ((CallDiff) diff).getMaxStackDiff());
//            } else { this.diffs.add(diff); }
//        }
//    }

    public CompareStackTrace(StackTrace st1, StackTrace st2) {
        stackTrace1 = st1;
        stackTrace2 = st2;
        diffs = new LinkedList<>();
//        callDiff = new HashMap<>();
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
//        formatAndAddCallDiff(diffs);
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

            int deep1 = stackTrace1.getDeep();
            int deep2 = stackTrace2.getDeep();

            if(!st1Lower && deep1 < deep2) {
                st1Lower = true;
//                stackTrace1.previous();
            }
            if(!st2Lower &&  deep1 > deep2) {
                st1Lower = true;
//                stackTrace2.previous();
            }
            if(deep1 == deep2) {
                st1Lower = false; st2Lower = false;
            }
            if(st1Lower || st2Lower) {
                diffs.add(new CallDiff(stackTrace1.getTop2(), Math.abs(deep1 - deep2)));
            }
            if(st1Lower && st2Lower || !stackTrace1.getTop().equals(stackTrace2.getTop())) {
                findNewSyncro(8, 2,stackTrace1,stackTrace2);
            }

//            if(!stackTrace1.getTop().equals(stackTrace2.getTop())
//                    || !(stackTrace1.getDeep() == stackTrace2.getDeep())) {
//                CallDiff tmp = new CallDiff(stackTrace1.getTop2(), Math.abs(stackTrace1.getDeep() - stackTrace2.getDeep()));
//                diffs.add(tmp);
//            }
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
        return diff;
    }

//    protected void formatAndAddCallDiff(List<Diff> diffs) {
//        for(StackTraceElement ste : callDiff.keySet()) {
//            CallDiff tmp = new CallDiff(ste, callDiff.get(ste));
//            diffs.add(tmp);
//        }
//    }
//
//
//    protected void addCallDiff(StackTraceElement diffStart, int nbCallDiff) {
//        if(callDiff.containsKey(diffStart))
//            callDiff.put(diffStart,Math.max(callDiff.get(diffStart),nbCallDiff));
//        else
//            callDiff.put(diffStart,nbCallDiff);
//    }

    protected void findNewSyncro(int maxOperation, int syncroRange, StackTrace st1, StackTrace st2) {
        for(int i = 0; i < maxOperation; i++) {
            for(int j = 0; j < maxOperation - i; j++) {

                if(st1.getTop().equals(st2.getTop()) &&  isSameForXOperation(syncroRange, st1, st2)) {
                    return;
                }
                st1.next();
            }
            st1.previous(maxOperation - i);
            st2.next();
        }
    }

    protected boolean isSameForXOperation(int x, StackTrace st1, StackTrace st2) {
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


//    protected boolean valueEqual(String v1, String v2) {
//        if(v1 == null || v2 == null) {
//            return true;
//        }
//        Object o1;
//        Object o2;
//        if((v1.startsWith("{") && v1.endsWith("}")) ||
//                v1.startsWith("[") && v1.endsWith("]")) {
//            o1 = equalListString(v1);
//        }
//        else
//            o1 = equalString(v1);
//
//        if((v2.startsWith("{") && v2.endsWith("}")) ||
//                v2.startsWith("[") && v2.endsWith("]")) {
//            o2 = equalListString(v2);
//        }
//        else
//            o2 = equalString(v2);
//
//        return  o1.equals(o2);
//    }
//
//    protected String equalString(String var) {
//        if(var.contains("@") && var.split("@").length != 0)
//            return var.split("@")[0];
//        return  var;
//    }
//
//    protected Collection<String> equalListString(String var) {
//        Collection<String> collection;
//        if(var.startsWith("{"))
//            collection = new HashSet<>();
//        else
//            collection = new ArrayList<>();
//
//        for(String s : var.substring(1,var.length()-1).split(", "))
//            collection.add(equalString(s));
//
//        return  collection;
//    }
}
