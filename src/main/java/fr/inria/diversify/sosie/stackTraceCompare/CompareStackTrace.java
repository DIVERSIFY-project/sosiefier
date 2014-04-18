package fr.inria.diversify.sosie.stackTraceCompare;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Simon on 17/04/14.
 */
public class CompareStackTrace {
    protected StackTrace stackTrace1;
    protected StackTrace stackTrace2;


    public CompareStackTrace(StackTrace st1, StackTrace st2) {
        stackTrace1 = st1;
        stackTrace2 = st2;
    }

    public boolean isSame() {
        while(stackTrace1.hasNext() && stackTrace2.hasNext()) {
            stackTrace1.next();
            stackTrace2.next();

            if(!stackTrace1.getTop().equals(stackTrace2.getTop())
                    || !(stackTrace1.getDeep() == stackTrace2.getDeep())) {
                return false;
            }
        }

        return stackTrace1.hasNext() == stackTrace2.hasNext();
    }

    public List<Integer> findDiff() {
        int maxCurrentDiff = 0;
        List<Integer> diff = new LinkedList<>();
        while(stackTrace1.hasNext() && stackTrace2.hasNext()) {
            stackTrace1.next();
            stackTrace2.next();

            if(!stackTrace1.getTop().equals(stackTrace2.getTop())
                    || !(stackTrace1.getDeep() == stackTrace2.getDeep())) {
                maxCurrentDiff = Math.max(maxCurrentDiff, Math.abs(stackTrace1.getDeep() - stackTrace2.getDeep()));
            } else {
                if(maxCurrentDiff != 0) {
                    diff.add(maxCurrentDiff);
                    maxCurrentDiff = 0;
                }
            }
        }

        return diff;
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
}
