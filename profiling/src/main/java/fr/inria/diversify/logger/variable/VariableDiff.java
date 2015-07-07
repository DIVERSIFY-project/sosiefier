package fr.inria.diversify.logger.variable;

import fr.inria.diversify.logger.Diff;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

/**
 * User: Simon
 * Date: 29/06/15
 * Time: 13:48
 */
public class VariableDiff implements Diff {
    Map<String, Set<String>> diffs;

    public VariableDiff() {
        diffs = new HashMap<>();
    }

    public VariableDiff(JSONObject diff) throws JSONException {
        diffs = new HashMap<>();
        parse(diff);
    }

    @Override
    public void filter(Diff filter) {
        VariableDiff vDiff = (VariableDiff) filter;

        for(String testName : vDiff.diffs.keySet()) {
            if(diffs.containsKey(testName)) {
                diffs.get(testName).removeAll(vDiff.diffs.get(testName));
                if(diffs.get(testName).isEmpty()) {
                    diffs.remove(testName);
                }
            }
        }
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("variables", diffs);
        object.put("type","variable");

        return object;
    }

    @Override
    public int size() {
        return diffs.size();
    }

    @Override
    public void parse(JSONObject jsonObject) throws JSONException {
        JSONObject vars = jsonObject.getJSONObject("variables");
        Iterator it = vars.keys();
        while (it.hasNext()) {
            String key = (String) it.next();
            JSONArray array = vars.getJSONArray(key);
            Set<String> set = new HashSet<>();
            for(int i = 0; i < array.length(); i++) {
                set.add(array.getString(i));
            }
            diffs.put(key, set);
        }
    }

    @Override
    public void merge(Diff other) {
        VariableDiff vDiff = (VariableDiff) other;

        for(String testName : vDiff.diffs.keySet()) {
            if(diffs.containsKey(testName)) {
                diffs.get(testName).addAll(vDiff.diffs.get(testName));
            } else {
                diffs.put(testName, vDiff.diffs.get(testName));
            }
        }
    }

    public void add(String name, Set<String> diff) {
        if(!diffs.containsKey(name)) {
            diffs.put(name, new HashSet<>());
        }
        diffs.get(name).addAll(diff);
    }
}
