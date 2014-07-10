package fr.inria.diversify.sosie.compare.diff;

import fr.inria.diversify.sosie.compare.stackElement.StackTraceCall;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

/**
 * Created by Simon on 26/06/14.
 */
public class TestReport {

    protected Set<String> methodCall;
    protected Set<String> diffCall;

    protected Map<String,Set<String>> variable;
    protected Set<String> variableDiff;
    protected Map<String,Integer> nbOfExec;


    public TestReport() {
        init();
    }

    public TestReport(JSONObject object) throws JSONException {
        parseJSONObject(object);
    }

    public TestReport(TestReport testReport) {
        diffCall = new HashSet(testReport.diffCall);
        methodCall = new HashSet(testReport.methodCall);
        variable = new HashMap(testReport.variable);
        variableDiff = new HashSet(testReport.variableDiff);
    }

    public void updateVar(Map<String, Object> vars, StackTraceCall call) {
        for(String var: vars.keySet()) {
            String key = call.getMethod() + ":" + var;
            String newValue = vars.get(var).toString();
            Set<String> values = variable.get(key);
            if (values != null) {
                values.add(newValue);
            } else {
                values = new HashSet();
                values.add(newValue);
                variable.put(key,values);
            }
        }
    }

    public void updateVarDiff(Set<VariableDiff> diffs) {
        for (VariableDiff diff: diffs) {
            String key = diff.getDiffStart().getMethod() + ":" + diff.getVarDiff();
            if(variable.containsKey(key))
                variableDiff.add(key);
        }
    }

    public void merge(TestReport other, boolean withSameTest){
        for(String key : variable.keySet()) {
            if(!other.variable.containsKey(key)) {
                if(withSameTest) {
                    variableDiff.add(key);
                }
            } else {
                variable.get(key).addAll(other.variable.get(key));
            }
        }
        for(String key : other.variable.keySet()) {
            if(!variable.containsKey(key)) {
                if(withSameTest) {
                    variableDiff.add(key);
                }
                Set<String> values = new HashSet();
                values.addAll(other.variable.get(key));
                variable.put(key,values);
            }
        }
        variableDiff.addAll(other.variableDiff);

        methodCall.addAll(other.methodCall);
        diffCall.addAll(other.diffCall);
    }

    public void removeDiff(TestReport other) {
        variableDiff.removeAll(other.variableDiff);
        diffCall.removeAll(other.diffCall);
    }

    public void addSameMethodCall(StackTraceCall top) {
        methodCall.add(top.getMethod());
    }

    public void addDiffMethodCall(StackTraceCall top) {
        diffCall.add(top.getMethod());
    }

    protected void init() {
        diffCall = new HashSet();
        methodCall = new HashSet(100);
        variable = new HashMap(2000);
        variableDiff = new HashSet(100);
    }

    public String summary() {
        Set<String> variableConst = new HashSet();
        Set<String> variableConstDiff = new HashSet();
        Set<String> variableEvol = new HashSet();
        Set<String> variableEvolDiff = new HashSet();

        for(String var : variable.keySet()) {
            if(variableDiff.contains(var)) {
                if (variable.get(var).size() != 1) { variableEvolDiff.add(var);}
                else {variableConstDiff.add(var);}
            } else {
                if (variable.get(var).size() != 1) { variableEvol.add(var);}
                else {variableConst.add(var);}
            }
        }
        HashSet sameCall = new HashSet();
        sameCall.addAll(methodCall);
        sameCall.removeAll(diffCall);

        String summary = "";
        summary += "variableConst: " + variableConst.size() + "\n";
        summary += "variableConstDiff: " + variableConstDiff.size() + "\n";
        summary += "variableEvol: " + variableEvol.size() + "\n";
        summary += "variableEvolDiff: " + variableEvolDiff.size() + "\n";
        summary += "sameCall: " + sameCall.size() + "\n";
        summary += "diffCall: " + diffCall.size() + "\n";

        return summary;
    }


    public String summary2() {
        Set<String> variableConst = new HashSet();
        Set<String> variableConstDiff = new HashSet();
        Set<String> variableEvol = new HashSet();
        Set<String> variableEvolDiff = new HashSet();

        for(String var : variable.keySet()) {
            if(variableDiff.contains(var)) {
                if (variable.get(var).size() != 1) { variableEvolDiff.add(var);}
                else {variableConstDiff.add(var);}
            } else {
                if (variable.get(var).size() != 1) { variableEvol.add(var);}
                else {variableConst.add(var);}
            }
        }
        HashSet sameCall = new HashSet();
        sameCall.addAll(methodCall);
        sameCall.removeAll(diffCall);

        String summary = "";
        summary += "variableConst: " + variableConst.size() + "\n";
        summary += "variableConstDiff: " + variableConstDiff.size() + " "+variableConstDiff+ "\n";
        summary += "variableEvol: " + variableEvol.size() + "\n";
        summary += "variableEvolDiff: " + variableEvolDiff.size() + " "+variableEvolDiff+ "\n";
        summary += "sameCall: " + sameCall.size() + "\n";
        summary += "diffCall: " + diffCall.size() + "\n";

        return summary;
    }

    public JSONObject buildReport() throws JSONException {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("methodCall",methodCall);
        jsonObject.put("diffCall",diffCall);
        jsonObject.put("variable",variable);
        jsonObject.put("variableDiff",variableDiff);

        return jsonObject;
    }

    public void parseJSONObject(JSONObject jsonObject) throws JSONException {
        diffCall = parseJSONArray(jsonObject.getJSONArray("diffCall"));
        methodCall = parseJSONArray(jsonObject.getJSONArray("methodCall"));

        variableDiff = parseJSONArray(jsonObject.getJSONArray("variableDiff"));
        variable = parseVariableValue(jsonObject.getJSONObject("variable"));
    }

    protected Set<String> parseJSONArray(JSONArray array) throws JSONException {
        HashSet<String> set = new HashSet(array.length());

        for(int i = 0; i < array.length(); i++) {
            set.add(array.getString(i));
        }
        return set;
    }

    protected Map<String,Set<String>> parseVariableValue(JSONObject map) throws JSONException {
        HashMap<String,Set<String>> variableValue = new HashMap();

        Iterator it = map.keys();
        while(it.hasNext()) {
            String o = (String) it.next();
            variableValue.put(o,parseJSONArray(map.getJSONArray(o)));
        }
        return variableValue;
    }

    public boolean equals(Object other) {
        if(!(other instanceof TestReport))
            return false;

        TestReport otherTestReport = (TestReport) other;

        return variable.equals(otherTestReport.variable)
                && variableDiff.equals(otherTestReport.variableDiff)
                && methodCall.equals(otherTestReport.methodCall)
                && diffCall.equals(otherTestReport.diffCall);
    }

    public int size() {
        return variable.size() + methodCall.size();
    }
}
