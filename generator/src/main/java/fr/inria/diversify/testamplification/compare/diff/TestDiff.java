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
    List<MonitoringPointDiff> diff;
    String signature;
    boolean excludeThisTest = false;

    public TestDiff(String signature) {
        this.signature = signature;
        diff = new ArrayList<>();
    }

    public TestDiff(JSONObject object) throws JSONException {
        buildFrom(object);
    }

    public void add(MonitoringPointDiff logResult) {
            diff.add(logResult);
    }

    public List<MonitoringPointDiff> getDiff() {
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
            object.put("monitoringPoints", array);

            for (MonitoringPointDiff d : diff) {
                array.put(d.toJson());
            }
        }
        return object;
    }

    protected void buildFrom(JSONObject object) throws JSONException {
        this.signature = object.getString("test");
        diff = new ArrayList<>();

        if(object.has("exclude")) {
            excludeThisTest = true;
        } else {
            JSONArray logDiff;
            if( object.has("logDiff")) { //old version
                logDiff = object.getJSONArray("logDiff");
            } else {
                logDiff = object.getJSONArray("monitoringPoints");
            }

            for (int i = 0; i < logDiff.length(); i++) {
                diff.add(new MonitoringPointDiff(logDiff.getJSONObject(i)));
            }
        }
    }




    public void filter(Filter filter) {

        if(filter.excludeThisTest(signature)) {
            excludeThisTest = true;
        } else {
            diff = diff.stream()
                    .filter(d -> !filter.getMonitorPoint().contains(d.id))
                    .collect(Collectors.toList());
            diff.stream()
                    .filter(d -> filter.get(signature) != null)
                    .forEach(d -> d.filter(filter.get(signature)));

            diff = diff.stream()
                    .filter(d -> d.size() != 0)
                    .collect(Collectors.toList());
        }
    }

    public Set<String> buildFilter() {
        Set<String> filter = new HashSet<>();
        if(excludeThisTest) {
            filter.add("exclude");
        } else {
            for (MonitoringPointDiff d : diff) {
                filter.add(d.buildFilter());
            }
        }
        return filter.stream()
                .map(f -> signature + " " + f).collect(Collectors.toSet());
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

    public void merge(TestDiff other) {
        if(excludeThisTest || other.excludeThisTest) {
            excludeThisTest = true;
        } else {
            for(MonitoringPointDiff diffOther : other.diff) {
                MonitoringPointDiff diffThis = diff.stream()
                        .filter(d -> d.id == diffOther.id)
                        .findAny()
                        .orElse(null);
                if(diffThis != null) {
                    diffThis.merge(diffOther);
                } else {
                    diff.add(diffOther.clone());
                }
            }
        }
    }

    public int mergeSize(TestDiff other) {
        if(excludeThisTest || other.excludeThisTest) {
            return 0;
        } else {
            int size = 0;
            for(MonitoringPointDiff diffOther : other.diff) {
                MonitoringPointDiff diffThis = diff.stream()
                        .filter(d -> d.id == diffOther.id)
                        .findAny()
                        .orElse(null);
                if(diffThis != null) {
                    size += diffThis.mergeSize(diffOther);
                } else {
                    size += diffOther.size();
                }
            }
            return size;
        }
    }

    public TestDiff clone() {
        TestDiff td = new TestDiff(signature);
        td.excludeThisTest = excludeThisTest;
        for(MonitoringPointDiff md : diff) {
            td.add(md.clone());
        }
        return td;
    }
}


