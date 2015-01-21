package fr.inria.diversify.testamplification.compare;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon on 15/01/15.
 */
public class Test {
    protected String signature;
    protected List<LogTest> logs;
    protected int index;


    public Test(String signature) {
        this.signature = signature;
        logs = new ArrayList<>();
    }

    public String getSignature() {
        return signature;
    }


    public void addLog(LogTest logTest) {
        logs.add(logTest);
    }

    public int size() {
        return logs.size();
    }

    public LogTest getLog(int i) {
        return logs.get(i);
    }
}
