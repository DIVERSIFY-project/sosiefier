package fr.inria.diversify.logger.branch;

import fr.inria.diversify.logger.Diff;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 26/06/15
 * Time: 11:17
 */
public class BranchDiff implements Diff {
    Map<String, Set<String>> diff = new HashMap<>();

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
    public void parse(JSONObject jsonObject) {

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
