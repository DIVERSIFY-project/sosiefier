package fr.inria.diversify.sosie.compare.diff;

import fr.inria.diversify.sosie.compare.stackElement.StackTraceCall;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public void updateVar(Map<String, Object> vars, StackTraceCall call) {
        for(String var: vars.keySet()) {
            String key = call.getId() + ":" + var;
            String newValue = vars.get(var).toString();
            if (variable.containsKey(key)) {
                String previousValue = variable.get(key);
                variableChange.put(key,variableChange.get(key) || !newValue.equals(previousValue));
            } else {
                variable.put(key,newValue);
                variableChange.put(key,false);
            }
        }
    }

    public void updateVarDiff(Set<VariableDiff> diffs) {
        for (VariableDiff diff: diffs) {
            String key = diff.getDiffStart().getId() + ":" + diff.getVarDiff();
            if(variable.containsKey(key))
                variableDiff.add(key);
        }
    }

    public JSONObject buildReport() throws JSONException {
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
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("variableConst",variableConst);
        jsonObject.put("variableConstDiff",variableConstDiff);
        jsonObject.put("variableEvol",variableEvol);
        jsonObject.put("variableEvolDiff",variableEvolDiff);

        HashSet sameCall = new HashSet();
        sameCall.addAll(methodCall);
        sameCall.removeAll(diffCall);
        jsonObject.put("sameCall",sameCall);
        jsonObject.put("diffCall",diffCall);
        Log.info("----------------------------");
        Log.info("variableConst: {}", variableConst.size());
        Log.info("variableConstDiff: {}", variableConstDiff.size());
        Log.info("variableEvol: {}", variableEvol.size());
        Log.info("variableEvolDiff: {}", variableEvolDiff.size());
        Log.info("sameCall: {}", sameCall.size());
        Log.info("diffCall: {}", diffCall.size());

        return jsonObject;
    }

    public void merge(Report other){
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

    public void addSameMethodCall(StackTraceCall top) {
        methodCall.add(top.getId());
    }

    public void addDiffMethodCall(StackTraceCall top) {
        diffCall.add(top.getId());
    }

    protected void init() {
        diffCall = new HashSet();
        methodCall = new HashSet();
        variable = new HashMap();
        variableDiff = new HashSet();
        variableChange = new HashMap();
    }

    public JSONObject buildReport(JSONObject otherReport) throws JSONException {
        Set<String> otherVariableConst = parseJSONArray(otherReport.getJSONArray("variableConst"));
        Set<String> otherVariableConstDiff = parseJSONArray(otherReport.getJSONArray("variableConstDiff"));
        Set<String> otherVariableEvol = parseJSONArray(otherReport.getJSONArray("variableEvol"));

        Set<String> otherSameCall = parseJSONArray(otherReport.getJSONArray("sameCall"));
        Set<String> otherDiffCall = parseJSONArray(otherReport.getJSONArray("diffCall"));

        Set<String> variableConst = new HashSet();
        Set<String> variableConstDiff = new HashSet();
        Set<String> variableEvol = new HashSet();
        Set<String> variableEvolDiff = new HashSet();

        for(String var : variable.keySet()) {
            if(!variableDiff.contains(var) && (otherVariableConst.contains(var) || otherVariableEvol.contains(var))) {
                if (!variableChange.get(var) && otherVariableConst.contains(var)) { variableConst.add(var);}
                else {variableEvol.add(var);}
            } else {
                if (!variableChange.get(var) && otherVariableConstDiff.contains(var)) { variableConstDiff.add(var);}
                else {variableEvolDiff.add(var);}
            }
        }

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("variableConst",variableConst);
        jsonObject.put("variableConstDiff",variableConstDiff);
        jsonObject.put("variableEvol",variableEvol);
        jsonObject.put("variableEvolDiff",variableEvolDiff);

        HashSet tmpDiffCall = new HashSet();
        tmpDiffCall.addAll(diffCall); tmpDiffCall.addAll(otherDiffCall);

        HashSet sameCall = new HashSet();
        sameCall.addAll(methodCall); sameCall.addAll(otherSameCall); sameCall.addAll(otherDiffCall);
        sameCall.removeAll(tmpDiffCall);
        jsonObject.put("sameCall",sameCall);
        jsonObject.put("diffCall",tmpDiffCall);

        Log.info("----------------------------");
        Log.info("variableConst: {}", variableConst.size());
        Log.info("variableConstDiff: {}", variableConstDiff.size());
        Log.info("variableEvol: {}", variableEvol.size());
        Log.info("variableEvolDiff: {}", variableEvolDiff.size());
        Log.info("sameCall: {}", sameCall.size());
        Log.info("diffCall: {}", diffCall.size());

        return jsonObject;
    }

    protected Set<String> parseJSONArray(JSONArray array) throws JSONException {
        HashSet<String> set = new HashSet();

        for(int i = 0; i < array.length(); i++) {
            set.add(array.getString(i));
        }

        return set;
    }
}
