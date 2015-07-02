package fr.inria.diversify.logger.variable;

import fr.inria.diversify.logger.Diff;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
