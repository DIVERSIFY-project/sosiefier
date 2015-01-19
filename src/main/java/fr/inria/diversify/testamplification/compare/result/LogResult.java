package fr.inria.diversify.testamplification.compare.result;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Simon on 19/01/15.
 */
public class LogResult implements Comparator {
    List<AssertDiff> diff;

    public LogResult() {
        diff = new ArrayList<>();
    }

    public void add(AssertDiff assertDiff) {
        if(assertDiff != null) {
            diff.add(assertDiff);
        }
    }

    public boolean isEmpty() {
        return diff.isEmpty();
    }

    @Override
    public int compare(Object o1, Object o2) {
        return ((LogResult) o1).diff.size() - ((LogResult) o2).diff.size();
    }

    public List<AssertDiff> getDiff() {
        return diff;
    }
}
