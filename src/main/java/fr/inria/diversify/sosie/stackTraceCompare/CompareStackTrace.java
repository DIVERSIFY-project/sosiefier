package fr.inria.diversify.sosie.stackTraceCompare;

import fr.inria.diversify.sosie.stackTraceCompare.diff.*;
import fr.inria.diversify.sosie.stackTraceCompare.stackTraceOperation.StackTrace;
import fr.inria.diversify.sosie.stackTraceCompare.stackElement.StackTraceElement;

import java.util.*;

/**
 * Created by Simon on 17/04/14.
 */
public class CompareStackTrace {
    protected StackTrace stackTrace1;
    protected StackTrace stackTrace2;
    protected List<Diff> diffs;
    protected Map<StackTraceElement, Integer> callDiff;


    public CompareStackTrace(StackTrace st1, StackTrace st2, List<Diff> diffs) {
        stackTrace1 = st1;
        stackTrace2 = st2;
        this.diffs = new ArrayList<>();
        callDiff = new HashMap<>();
        for(Diff diff : diffs)
            if(diff instanceof CallDiff) {
                callDiff.put(diff.getDiffStart(), ((CallDiff) diff).getMaxStackDiff());
            }
        else
            diffs.add(diff);
    }

    public CompareStackTrace(StackTrace st1, StackTrace st2) {
        stackTrace1 = st1;
        stackTrace2 = st2;

        callDiff = new HashMap<>();
    }

    public List<Diff> findCallDiff() {
        List<Diff> diffs = new LinkedList<>();

        while(stackTrace1.hasNext() && stackTrace2.hasNext()) {
            stackTrace1.next();
            stackTrace2.next();

            if(!stackTrace1.getTop().equals(stackTrace2.getTop())
                    || !(stackTrace1.getDeep() == stackTrace2.getDeep())) {
                addCallDiff(stackTrace1.getTop2(), Math.abs(stackTrace1.getDeep() - stackTrace2.getDeep()));
            }
        }
        formatAndAddCallDiff(diffs);
        return diffs;
    }

    public List<Diff> findVariableDiff() {
        List<Diff> diffs = new LinkedList<>();

        while(stackTrace1.hasNext() && stackTrace2.hasNext()) {
            stackTrace1.next();
            stackTrace2.next();

            Set<VariableDiff> vd = varDiff(stackTrace1,stackTrace2);
            if(!vd.isEmpty()) {
                vd.removeAll(this.diffs);
                diffs.addAll(vd);
            }
        }
        return diffs;
    }

    protected Set<VariableDiff> varDiff(StackTrace st1, StackTrace st2) {
        Set<VariableDiff> diff = new HashSet<>();
        Map<String, String> v1 = st1.getVariable();
        Map<String, String> v2 = st2.getVariable();

        for(String key : v1.keySet()) {
            String value = v1.get(key);
            if(!v2.containsKey(key) || !valueEqual(value, v2.get(key)))
                diff.add(new VariableDiff(st1.getTop(),key));
        }
        for(String key : v2.keySet()) {
            String value = v2.get(key);
            if(!v1.containsKey(key) || !valueEqual(value, v1.get(key)))
                diff.add(new VariableDiff(st1.getTop(),key));
        }
        return diff;
    }

    public List<Diff> findDiff() {
        List<Diff> diffs = new LinkedList<>();

        while(stackTrace1.hasNext() && stackTrace2.hasNext()) {
            stackTrace1.next();
            stackTrace2.next();

            if(!stackTrace1.getTop().equals(stackTrace2.getTop())
                    || !(stackTrace1.getDeep() == stackTrace2.getDeep())) {
                addCallDiff(stackTrace1.getTop2(), Math.abs(stackTrace1.getDeep() - stackTrace2.getDeep()));
            }
            Set<VariableDiff> vd = varDiff(stackTrace1,stackTrace2);
            if(!vd.isEmpty()) {
                vd.removeAll(this.diffs);
                diffs.addAll(vd);
            }
        }
        formatAndAddCallDiff(diffs);
        return diffs;
    }

    protected void formatAndAddCallDiff(List<Diff> diffs) {
        for(StackTraceElement ste : callDiff.keySet()) {
            CallDiff tmp = new CallDiff(ste, callDiff.get(ste));
            diffs.add(tmp);
        }
    }


    protected void addCallDiff(StackTraceElement diffStart, int nbCallDiff) {
        if(callDiff.containsKey(diffStart))
            callDiff.put(diffStart,Math.max(callDiff.get(diffStart),nbCallDiff));
        else
            callDiff.put(diffStart,nbCallDiff);
    }

    protected void findNewSyncro(int maxOperation, int syncroRange, StackTrace st1, StackTrace st2) {
        for(int i = 0; i < maxOperation; i++) {
            for(int j = 0; j < maxOperation - i; j++) {
                st1.next();
                if(st1.getTop().equals(st2.getTop())) {
                    isSameForXOperation(syncroRange, st1, st2);
                }
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

//    public void setDiff(List<Diff> diff) {
//        this.diffs = diff;
//    }

    protected boolean valueEqual(String v1, String v2) {
        if(v1 == null || v2 == null) {
            return true;
        }
        Object o1;
        Object o2;
        if((v1.startsWith("{") && v1.endsWith("}")) ||
                v1.startsWith("[") && v1.endsWith("]")) {
            o1 = equalListString(v1);
        }
        else
            o1 = equalString(v1);

        if((v2.startsWith("{") && v2.endsWith("}")) ||
                v2.startsWith("[") && v2.endsWith("]")) {
            o2 = equalListString(v2);
        }
        else
            o2 = equalString(v2);

        return  o1.equals(o2);
    }

    protected String equalString(String var) {
        if(var.contains("@") && var.split("@").length != 0)
            return var.split("@")[0];
        return  var;
    }

    protected Collection<String> equalListString(String var) {
        Collection<String> collection;
        if(var.startsWith("{"))
            collection = new HashSet<>();
        else
            collection = new ArrayList<>();

        for(String s : var.substring(1,var.length()-1).split(", "))
            collection.add(equalString(s));

        return  collection;
    }
}
