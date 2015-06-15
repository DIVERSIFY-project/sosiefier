package fr.inria.diversify.sosie.compare.diff;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

/**
 * Created by Simon on 03/07/14.
 */
@Deprecated
public class Report {
    Map<String,TestReport> testReports;

    public Report() {
        testReports = new HashMap();
    }

    public Report(Report other) {
        testReports = new HashMap();
        for(String key : other.testReports.keySet())
        testReports.put(key, new TestReport(other.testReports.get(key)));
    }

    public Report(JSONObject object) throws JSONException {
        testReports = new HashMap();
        Iterator it = object.keys();
        while (it.hasNext()) {
            String key = (String) it.next();
            JSONObject o = object.getJSONObject(key);
            testReports.put(key, new TestReport(o));
        }
    }

    public void putTestReport(String key, TestReport testReport) {
        TestReport tr = testReports.get(key);
        if(tr == null) {
            testReports.put(key, testReport);
        } else {
            tr.merge(testReport,true);
        }
    }


    public void filter(Report report) {
        for(String test : testReports.keySet()) {
            TestReport testReport = getTestReport(test);
            if(report.testReports.containsKey(test))
                testReport.removeDiff(report.getTestReport(test));
        }
    }

    public TestReport getTestReport(String key) {
        return testReports.get(key);
    }

    public String summary() {
        return buildAllTest().summary();
    }

    public TestReport buildAllTest() {
        TestReport allTest = null;
        for (TestReport report : testReports.values()) {
            if(allTest == null) {
                allTest = new TestReport(report);
            } else {
                allTest.merge(report,false);
            }
        }
        if(allTest == null) {
            allTest = new TestReport();
        }
       return allTest;
    }

    public String summary2() {
        return buildAllTest().summary2();
    }

    public void merge(Report other) {
        for(String key : other.testReports.keySet()) {
            if(testReports.containsKey(key)) {
                getTestReport(key).merge(other.getTestReport(key), true);
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

    public Map<String, Set<String>> getSameVarPerTest() {
        Map<String, Set<String>> map = new HashMap();

        for(String test: testReports.keySet()) {
            Map<String, String> pointType = testReports.get(test).pointReport();
            for(String point : pointType.keySet()) {
                String type = pointType.get(point);
                if(type.equals("FS") || type.equals("VS")) {
                    //
                    if(!map.containsKey(test)) {
                        map.put(test, new HashSet());
                    }
                    map.get(test).add(point);
                }
            }
        }
        return map;
    }

    public Map<String, Set<String>> getDiffVarPerTestFor(Map<String, Set<String>> sameVarPerTest) {
        Map<String, Set<String>> map = new HashMap();

        for(String test: sameVarPerTest.keySet()) {
            Map<String, String> pointType = testReports.get(test).pointReport();
            for(String point : sameVarPerTest.get(test)) {
                String type = pointType.get(point);
                if(type != null && (type.equals("FD") || type.equals("VD"))) {
                    if(!map.containsKey(test)) {
                        map.put(test, new HashSet());
                    }
                    map.get(test).add(point);
                }
            }
        }
        return map;
    }
}
