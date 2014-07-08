package fr.inria.diversify.sosie.compare.diff;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Simon on 03/07/14.
 */
public class Report {
    Map<String,TestReport> testReports;

    public Report() {
        testReports = new HashMap();
        testReports.put("allTest", new TestReport());
    }

    public Report(Report other) {
        testReports = new HashMap();
        for(String key : other.testReports.keySet())
        testReports.put(key, new TestReport(other.testReports.get(key)));

        if(!testReports.containsKey("allTest"))
            testReports.put("allTest", new TestReport());
    }

    public Report(JSONObject object) throws JSONException {
        testReports = new HashMap();
        Iterator it = object.keys();
        while (it.hasNext()) {
            String key = (String) it.next();
            JSONObject o = object.getJSONObject(key);
            testReports.put(key, new TestReport(o));
        }
        if(!testReports.containsKey("allTest"))
            testReports.put("allTest", new TestReport());
    }

    public void putTestReport(String key, TestReport testReport) {
        testReports.put(key, testReport);
        testReports.get("allTest").merge(testReport);
    }


    public void filter(Report report) {
        for(String test : testReports.keySet()) {
            TestReport testReport = getTestReport(test);
            if(report.testReports.containsKey(test))
                testReport.mergeAndRemoveDiff(report.getTestReport(test));
        }
    }

    public TestReport getTestReport(String key) {
        return testReports.get(key);
    }

    public String summary() {
        return testReports.get("allTest").summary();
    }

    public String summary2() {
        return testReports.get("allTest").summary2();
    }

    public void merge(Report other) {
        for(String key : other.testReports.keySet()) {
            if(testReports.containsKey(key)) {
                getTestReport(key).merge(other.getTestReport(key));
            } else {
                testReports.put(key,other.getTestReport(key));
            }
        }
    }

    public void merge2(Report other) {
        for(String key : other.testReports.keySet()) {
            if(testReports.containsKey(key)) {
                getTestReport(key).merge(other.getTestReport(key));
            } else {
                testReports.put(key,other.getTestReport(key));
            }
        }
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject object = new JSONObject();

        for(String test: testReports.keySet()) {
            object.put(test,testReports.get(test).buildReport());
        }
        return object;
    }

    public int size() {
        return testReports.entrySet().stream()
                     .mapToInt(entry -> entry.getValue().size())
                     .sum();
    }


}
