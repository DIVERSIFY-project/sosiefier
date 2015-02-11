package fr.inria.diversify.testamplification.compare.diff;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Simon on 19/01/15.
 */
public class TestDiff {
    List<LogDiff> diff;
    String signature;
     boolean excludeThisTest = false;

    public TestDiff(String signature) {
        this.signature = signature;
        diff = new ArrayList<>();
    }

    public TestDiff(JSONObject object) throws JSONException {
        buildFrom(object);
    }

    public void add(LogDiff logResult) {
        if(logResult != null) {
            diff.add(logResult);
        }
    }

    public List<LogDiff> getDiff() {
        return diff;
    }

    public String getSignature() {
        return signature;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject object = new JSONObject();

        object.put("test", signature);

        if(excludeThisTest) {
            object.put("excludeThisTest", true);
        } else {
            JSONArray array = new JSONArray();
            object.put("logDiff", array);

            for (LogDiff d : diff) {
                array.put(d.toJson());
            }
        }
        return object;
    }

    protected void buildFrom(JSONObject object) throws JSONException {
        this.signature = object.getString("test");
        diff = new ArrayList<>();

        if(object.has("excludeThisTest")) {
            excludeThisTest = true;
        } else {
            JSONArray logDiff = object.getJSONArray("logDiff");
            for (int i = 0; i < logDiff.length(); i++) {
                diff.add(new LogDiff(logDiff.getJSONObject(i)));
            }
        }
    }

    public void filter(Set<String> filter) {
        if(filter.contains("excludeThisTest")) {
            excludeThisTest = true;
        } else {
            diff.stream().forEach(d -> d.filter(filter));
            diff = diff.stream().filter(d -> !d.isEmpty()).collect(Collectors.toList());
        }
    }

    public Set<String> buildFilter() {
        Set<String> filter = new HashSet<>();
        if(excludeThisTest) {
            filter.add("excludeThisTest");
        } else {
            for (LogDiff d : diff) {
                filter.addAll(d.buildFilter());
            }
        }
        return filter.stream().map(f -> signature + " " + f).collect(Collectors.toSet());
    }

    public void excludeThisTest() {
        excludeThisTest = true;
        diff.clear();
    }

    public int size() {
        if(excludeThisTest) {
            return 0;
        } else {
            return diff.stream()
                       .mapToInt(d -> d.size())
                       .sum();

        }
    }

    public String toString() {
        try {
            return toJSON().toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "";
    }


}


