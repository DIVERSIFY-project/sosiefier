package fr.inria.diversify.sosie.compare.diff;

import fr.inria.diversify.sosie.compare.stackElement.StackTraceCall;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

/**
 * Created by Simon on 26/06/14.
 */
public class Report {

    protected Set<String> methodCall;
    protected Set<String> diffCall;

    protected Map<String,String> variable;
    protected Set<String> variableDiff;
    protected Map<String,Boolean> variableChange;

    public Report() {
        init();
    }

    public Report(JSONObject object) throws JSONException {
        parseJSONObject(object);
    }

    public Report(Report report) {
        diffCall = new HashSet(report.diffCall);
        methodCall = new HashSet(report.methodCall);
        variable = new HashMap(report.variable);
        variableDiff = new HashSet(report.variableDiff);
        variableChange = new HashMap(report.variableChange);
    }

    public void updateVar(Map<String, Object> vars, StackTraceCall call) {
        for(String var: vars.keySet()) {
            String key = call.getMethod() + ":" + var;
            String newValue = vars.get(var).toString();
            String previousValue = variable.get(key);
            if (previousValue != null) {
                variableChange.put(key,variableChange.get(key) || !newValue.equals(previousValue));
            } else {
                variable.put(key,newValue);
                variableChange.put(key,false);
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

    public void merge(Report other){
        variable.putAll(other.variable);
        variableDiff.addAll(other.variableDiff);

        Set<String> keys = new HashSet(variableChange.keySet());
        keys.addAll(other.variableChange.keySet());
        for(String var : keys) {
            if(variableChange.containsKey(var)) {
                if(other.variableChange.containsKey(var)) {
                    variableChange.put(var, variableChange.get(var) || other.variableChange.get(var));
                }
            } else {
                variableChange.put(var,other.variableChange.get(var));
            }
        }

        methodCall.addAll(other.methodCall);
        diffCall.addAll(other.diffCall);
    }

    public void merge2(Report other) {
        for(String var : variable.keySet()) {
            if(!other.variable.containsKey(var)) {
                variableDiff.add(var);
            }
        }
        for(String var : other.variable.keySet()) {
            if(!variable.containsKey(var)) {
                variableDiff.add(var);
            }
        }

        variable.putAll(other.variable);
        variableDiff.addAll(other.variableDiff);

        Set<String> keys = new HashSet();
        keys.addAll(variableChange.keySet());
        keys.addAll(other.variableChange.keySet());
        for(String var : keys) {
            if(variableChange.containsKey(var)) {
                if(other.variableChange.containsKey(var)) {
                    variableChange.put(var, variableChange.get(var) || other.variableChange.get(var));
                }
            } else {
                variableChange.put(var,other.variableChange.get(var));
            }
        }
        methodCall.addAll(other.methodCall);
        diffCall.addAll(other.diffCall);
    }

    public void mergeAndRemoveDiff(Report other) {
        this.merge(other);

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
        variableChange = new HashMap(200);
    }

    public String summary() {
        Set<String> variableConst = new HashSet();
        Set<String> variableConstDiff = new HashSet();
        Set<String> variableEvol = new HashSet();
        Set<String> variableEvolDiff = new HashSet();

        for(String var : variable.keySet()) {
            if(variableDiff.contains(var)) {
                if (variableChange.get(var)) { variableEvolDiff.add(var);}
                else {variableConstDiff.add(var);}
            } else {
                if (variableChange.get(var)) { variableEvol.add(var);}
                else {variableConst.add(var);}
            }
        }
        HashSet sameCall = new HashSet();
        sameCall.addAll(methodCall);
        sameCall.removeAll(diffCall);

        String summary = "";
        summary += "variableConst: " + variableConst.size() + "\n";
        summary += "variableConstDiff: " + variableConstDiff.size() + "\n";//+ " "+variableConstDiff+ "\n";
        summary += "variableEvol: " + variableEvol.size() + "\n";
        summary += "variableEvolDiff: " + variableEvolDiff.size() + "\n";//+ " "+variableEvolDiff+ "\n";
        summary += "sameCall: " + sameCall.size() + "\n";
        summary += "diffCall: " + diffCall.size() + "\n";

        return summary;
    }

    public JSONObject buildReport() throws JSONException {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("methodCall",methodCall);
        jsonObject.put("diffCall",diffCall);
        jsonObject.put("variable",variable);
        jsonObject.put("variableChange",variableChange);
        jsonObject.put("variableDiff",variableDiff);

        return jsonObject;
    }

    public void parseJSONObject(JSONObject jsonObject) throws JSONException {
        diffCall = parseJSONArray(jsonObject.getJSONArray("diffCall"));
        methodCall = parseJSONArray(jsonObject.getJSONArray("methodCall"));

        variableDiff = parseJSONArray(jsonObject.getJSONArray("variableDiff"));
        variable = parseVariableValue(jsonObject.getJSONObject("variable"));
        variableChange = parseVariableChange(jsonObject.getJSONObject("variableChange"));
    }

    protected Set<String> parseJSONArray(JSONArray array) throws JSONException {
        HashSet<String> set = new HashSet(array.length());

        for(int i = 0; i < array.length(); i++) {
            set.add(array.getString(i));
        }
        return set;
    }

    protected Map<String,String> parseVariableValue(JSONObject map) throws JSONException {
        HashMap<String,String> variableValue = new HashMap();

        Iterator it = map.keys();
        while(it.hasNext()) {
            String o = (String) it.next();
            variableValue.put(o,map.getString(o));
        }
        return variableValue;
    }

    protected Map<String,Boolean> parseVariableChange(JSONObject map) throws JSONException {
        HashMap<String,Boolean> variableChange = new HashMap();

        Iterator it = map.keys();
        while(it.hasNext()) {
            String o = (String) it.next();
            variableChange.put(o,map.getBoolean(o));
        }
        return variableChange;
    }

    public boolean equals(Object other) {
        if(!(other instanceof  Report))
            return false;

        Report otherReport = (Report) other;

        return variable.equals(otherReport.variable)
                && variableDiff.equals(otherReport.variableDiff)
                && variableChange.equals(otherReport.variableChange)
                && methodCall.equals(otherReport.methodCall)
                && diffCall.equals(otherReport.diffCall);
    }

    public int size() {
        return variable.size() + methodCall.size();
    }
}
