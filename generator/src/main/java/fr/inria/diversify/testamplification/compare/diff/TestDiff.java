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

    public TestDiff(String signature) {
        this.signature = signature;
        diff = new ArrayList<>();
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
        JSONArray array = new JSONArray();
        object.put("logDiff", array);

        for(LogDiff d : diff) {
            array.put(d.toJson());
        }

        return object;
    }

    public void filter(Set<String> filter) {
        diff.stream()
                .forEach(d -> d.filter(filter));
        diff = diff.stream()
                .filter(d -> !d.isEmpty())
                .collect(Collectors.toList());
    }

    public Set<String> buildFilter() {
        Set<String> filter = new HashSet<>();
        for(LogDiff d : diff) {
            filter.addAll(d.buildFilter());
        }
        return filter.stream().map(f -> signature + " " + f).collect(Collectors.toSet());
    }
}
