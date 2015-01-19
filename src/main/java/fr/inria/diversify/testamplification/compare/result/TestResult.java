package fr.inria.diversify.testamplification.compare.result;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon on 19/01/15.
 */
public class TestResult {
    List<LogResult> diff;
    String signature;

    public TestResult(String signature) {
        this.signature = signature;
        diff = new ArrayList<>();
    }

    public void add(LogResult logResult) {
        if(logResult != null) {
            diff.add(logResult);
        }
    }

    public List<LogResult> getDiff() {
        return diff;
    }
}
