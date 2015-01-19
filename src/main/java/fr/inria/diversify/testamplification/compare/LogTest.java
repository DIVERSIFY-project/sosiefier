package fr.inria.diversify.testamplification.compare;

import java.util.List;

/**
 * Created by Simon on 15/01/15.
 */
public class LogTest {

    protected List<Assert> asserts;
    protected int index;

    public LogTest(List<Assert> assertLogs) {
        this.asserts = assertLogs;
    }

    public Assert next() {
        Assert next = asserts.get(index);
        index++;
        return next;
    }

    public boolean hasNext() {
        return index < asserts.size();
    }

    public Assert peek() {
        return asserts.get(index);
    }

    public void previous(int nb) {
        index = index - nb;
    }

    public void reset() {
        index = 0;
    }
}
