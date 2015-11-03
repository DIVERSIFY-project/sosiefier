package fr.inria.diversify.logger.transformationUsed;

import fr.inria.diversify.logger.Diff;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 20/08/15
 * Time: 16:48
 */
public class StaticDiff implements Diff {
    Map<String, Set<String>> methodDiffs;
    Map<String, Set<String>> branchesDiff;

    public StaticDiff() {
        this.branchesDiff = new HashMap<>();
        this.methodDiffs = new HashMap<>();
    }

    public StaticDiff(Map<String, Set<String>> branchesDiff, Map<String, Set<String>> methodDiffs) {
        this.branchesDiff = branchesDiff;
        this.methodDiffs = methodDiffs;
    }

    public StaticDiff(JSONObject diff) throws JSONException {
        this.branchesDiff = new HashMap<>();
        this.methodDiffs = new HashMap<>();
        parse(diff);
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", "staticDiff");

        if(!methodDiffs.isEmpty()) {
            object.put("methodsDiff", methodDiffs);
        }
        if(!branchesDiff.isEmpty()) {
            object.put("branchesDiff", branchesDiff);
        }
        return object;
    }

    @Override
    public void filter(Diff filter) {
    }


    @Override
    public int size() {
        return methodDiffs.size() + branchesDiff.size();
    }

    @Override
    public void parse(JSONObject jsonObject) throws JSONException {
        if(jsonObject.has("methodsDiff")) {
            JSONObject o = jsonObject.getJSONObject("methodsDiff");
            Iterator i = o.keys();
            while (i.hasNext()) {
                String key = (String) i.next();
                String value = o.getString(key);
                Set<String> set = Arrays.stream(value.substring(0, value.length() - 1).split(","))
                        .map(item -> item.substring(1, item.length() - 1))
                        .collect(Collectors.toSet());
                methodDiffs.put(key, set);
            }
        }
        if(jsonObject.has("branchesDiff")) {
            JSONObject o = jsonObject.getJSONObject("branchesDiff");
            Iterator i = o.keys();
            while (i.hasNext()) {
                String key = (String) i.next();
                String value = o.getString(key);
                Set<String> set = Arrays.stream(value.substring(1, value.length() - 1).split(","))
                        .map(item -> item.substring(1, item.length() - 1))
                        .collect(Collectors.toSet());
                branchesDiff.put(key, set);
            }
        }
    }

    @Override
    public void merge(Diff other) {

    }
}
