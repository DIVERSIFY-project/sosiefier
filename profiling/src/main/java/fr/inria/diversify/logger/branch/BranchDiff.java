package fr.inria.diversify.logger.branch;

import fr.inria.diversify.logger.Diff;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

/**
 * User: Simon
 * Date: 26/06/15
 * Time: 11:17
 */
public class BranchDiff implements Diff {
    Map<String, Set<String>> diff;

    public BranchDiff() {
        diff = new HashMap<>();
    }

    public BranchDiff(JSONObject object) throws JSONException {
        diff = new HashMap<>();
        parse(object);
    }

    @Override
    public void filter(Diff filter) {
        BranchDiff bDiff = (BranchDiff) filter;

        for(String testName : bDiff.diff.keySet()) {
            if(diff.containsKey(testName)) {
                diff.get(testName).removeAll(bDiff.diff.get(testName));
                if(diff.get(testName).isEmpty()) {
                    diff.remove(testName);
                }
            }
        }
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("branches", diff);
        object.put("type","branch");
        return object;
    }

    @Override
    public int size() {
        return diff.size();
    }

    @Override
    public void parse(JSONObject jsonObject) throws JSONException {
        JSONObject branches = jsonObject.getJSONObject("branches");
        Iterator it = branches.keys();
        while (it.hasNext()) {
            String key = (String) it.next();
            JSONArray array = branches.getJSONArray(key);
            Set<String> set = new HashSet<>();
            for(int i = 0; i < array.length(); i++) {
                set.add(array.getString(i));
            }
            diff.put(key, set);
        }
    }

    @Override
    public void merge(Diff other) {
        BranchDiff bDiff = (BranchDiff) other;

        for(String testName : bDiff.diff.keySet()) {
            if(diff.containsKey(testName)) {
                diff.get(testName).addAll(bDiff.diff.get(testName));
            } else {
                diff.put(testName, bDiff.diff.get(testName));
            }
        }
    }

    public void addBranchDiff(String testName, Set<String> branches) {
        if(diff.containsKey(testName)) {
            diff.get(testName).addAll(branches);
        } else {
            diff.put(testName, branches);
        }
    }
}
