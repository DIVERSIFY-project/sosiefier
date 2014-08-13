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

    protected Map<String,Set<Object>> variable;
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
        nbOfExec = new HashMap(testReport.nbOfExec);
    }

    public void updateVar(Map<String, Object> vars, StackTraceCall call) {
        for(String var: vars.keySet()) {
            String key = call.getClassName() + ":" + var;
            Object newValue = vars.get(var);
            Set<Object> values = variable.get(key);
            if (values != null) {
                nbOfExec.put(key, nbOfExec.get(key) + 1);
                values.add(newValue);
            } else {
                nbOfExec.put(key,1);
                values = new HashSet();
                values.add(newValue);
                variable.put(key,values);
            }
        }
    }

    public void updateVarDiff(Set<VariableDiff> diffs) {
        for (VariableDiff diff: diffs) {
            String key = diff.getDiffStart().getClassName() + ":" + diff.getVarDiff();
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
                nbOfExec.put(key,nbOfExec.get(key) + other.nbOfExec.get(key));
                variable.get(key).addAll(other.variable.get(key));
            }
        }
        for(String key : other.variable.keySet()) {
            if(!variable.containsKey(key)) {
                if(withSameTest) {
                    variableDiff.add(key);
                }
                Set<Object> values = new HashSet();
                values.addAll(other.variable.get(key));
                nbOfExec.put(key,other.nbOfExec.get(key));
                variable.put(key,values);
            }
        }
        variableDiff.addAll(other.variableDiff);

        methodCall.addAll(other.methodCall);
        diffCall.addAll(other.diffCall);

        for(String method : methodCall) {
            Integer i1 = 0;
            Integer i2 = 0;
            if(nbOfExec.containsKey(method)) {
                i1 = nbOfExec.get(method);
            }
            if(other.nbOfExec.containsKey(method)) {
                i2 = other.nbOfExec.get(method);
            }
            nbOfExec.put(method,i1+i2);
        }
    }


    public void removeDiff(TestReport other) {
        variableDiff.removeAll(other.variableDiff);
        diffCall.removeAll(other.diffCall);
    }

    public void addSameMethodCall(StackTraceCall top) {
        String method = top.getMethod();

        methodCall.add(method);
        Integer nb = nbOfExec.get(method);
        if(nb != null)
            nbOfExec.put(method,nb+1);
        else
            nbOfExec.put(method,1);
    }

    public void addDiffMethodCall(StackTraceCall top) {
        String method = top.getMethod();

        diffCall.add(top.getMethod());
        Integer nb = nbOfExec.get(method);
        if(nb != null)
            nbOfExec.put(method,nb+1);
        else
            nbOfExec.put(method,1);
    }

    public void addAllDiffMethodCall(Collection<StackTraceCall> collection) {
        for(StackTraceCall stc : collection) {
            addDiffMethodCall(stc);
        }
    }

    protected void init() {
        diffCall = new HashSet();
        methodCall = new HashSet(100);
        variable = new HashMap(2000);
        variableDiff = new HashSet(100);
        nbOfExec = new HashMap(2000);
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
        summary += "allVariable: " + variable.size() + "\n";
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
        summary += "allVariable: " + variable.size() + "\n";
        summary += "variableConst: " + variableConst.size() + "\n";
        summary += "variableConstDiff: " + variableConstDiff.size() + " "+variableConstDiff+ "\n";
        summary += "variableEvol: " + variableEvol.size() + "\n";
        summary += "variableEvolDiff: " + variableEvolDiff.size() + " "+variableEvolDiff+ "\n";
        summary += "sameCall: " + sameCall.size() + "\n";
        summary += "diffCall: " + diffCall.size() + "\n";

        return summary;
    }

    public Map<String,String> pointReport() {
        Map<String,String> point = new HashMap();
        //"point: type;
        for(String var: variable.keySet()) {
            point.put(var, type(var));
        }
        for(String method: methodCall) {
            if(diffCall.contains(method)) {
                point.put(method, "D");
            } else {
                point.put(method, "S");
            }
        }
        return point;
    }

    protected String type(String var) {
        if(variableDiff.contains(var)) {
            if (variable.get(var).size() != 1) {
                return "VD"; //vari diff
            } else {
                return "FD"; // fix diff
            }
        } else {
            if (variable.get(var).size() != 1) {
                return "VS";
            } else {
                return "FS";
            }
        }
    }

    public JSONObject buildReport() throws JSONException {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("methodCall",methodCall);
        jsonObject.put("diffCall",diffCall);
        jsonObject.put("variable",variable);
        jsonObject.put("variableDiff",variableDiff);
        jsonObject.put("exec",nbOfExec);

        return jsonObject;
    }

    public void parseJSONObject(JSONObject jsonObject) throws JSONException {
        diffCall = parseJSONArray(jsonObject.getJSONArray("diffCall"));
        methodCall = parseJSONArray(jsonObject.getJSONArray("methodCall"));

        variableDiff = parseJSONArray(jsonObject.getJSONArray("variableDiff"));
        variable = parseVariableValue(jsonObject.getJSONObject("variable"));
        nbOfExec = parseNbExec(jsonObject.getJSONObject("exec"));
    }

    protected Set<String> parseJSONArray(JSONArray array) throws JSONException {
        HashSet<String> set = new HashSet(array.length());

        for(int i = 0; i < array.length(); i++) {
            set.add(array.getString(i));
        }
        return set;
    }

    protected Map<String,Set<Object>> parseVariableValue(JSONObject map) throws JSONException {
        HashMap<String,Set<Object>> variableValue = new HashMap();

        Iterator it = map.keys();
        while(it.hasNext()) {
            String o = (String) it.next();

            Set<Object> objects = new HashSet();
            for(String object :parseJSONArray(map.getJSONArray(o))) {
                objects.add(parseValue(object));
            }
            variableValue.put(o,objects);
        }
        return variableValue;
    }

    protected Map<String,Integer> parseNbExec(JSONObject map) throws JSONException {
        HashMap<String,Integer> variableValue = new HashMap();

        Iterator it = map.keys();
        while(it.hasNext()) {
            String o = (String) it.next();
            variableValue.put(o,map.getInt(o));
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

    public Map<String, Integer> getNbOfExec() {
        return nbOfExec;
    }

    protected Object parseValue(String valueString) {
        if(valueString.startsWith("{") && valueString.endsWith("}")) {
            Set<Object> set = new HashSet<>();
            for(String s : valueString.substring(1,valueString.length()-1).split(", "))
                set.add(parseValue(s));
            return set;
        }

        if(valueString.startsWith("[") && valueString.endsWith("]")) {
            List<Object> list = new ArrayList<>();
            for(String s : valueString.substring(1,valueString.length()-1).split(", "))
                list.add(parseValue(s));
            return list;
        }

        if(valueString.split("@").length > 1)
            return parseValue(valueString.split("@")[0]);


        if( valueString.split("\\$\\$").length > 1) {
            return parseValue(valueString.split("\\$\\$")[0]);
        }
        return valueString;
    }
}
