package fr.inria.diversify.testamplification.compare.diff;

import fr.inria.diversify.testamplification.compare.Assert;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Simon on 19/01/15.
 */
public class LogDiff implements Comparable {
    List<AssertDiff> assertDiffs;
    Set<Integer> notSyncro;
    int allDiff = -1;

    public LogDiff() {
        assertDiffs = new ArrayList<>();
        notSyncro = new HashSet<>();
    }

    public LogDiff(JSONObject jsonObject) throws JSONException {
        buildFrom(jsonObject);
    }

    public void add(AssertDiff assertDiff) {
        if (assertDiff != null) {
            assertDiffs.add(assertDiff);
        }
    }

    public boolean isEmpty() {
        return assertDiffs.isEmpty() && notSyncro.isEmpty();
    }


    public List<AssertDiff> getAssertDiffs() {
        return assertDiffs;
    }

    @Override
    public int compareTo(Object o) {
        return assertDiffs.size() - ((LogDiff) o).assertDiffs.size();
    }

    public boolean isAllDiff() {
        return allDiff != -1;
    }

    public int getAllDiff() {
        return allDiff;
    }

    public void setAllDiff(int allDiff) {
        this.allDiff = allDiff;
    }

    public void addAll(Set<Integer> notSyncro) {
        this.notSyncro.addAll(notSyncro);
    }

    public JSONObject toJson() throws JSONException {
        JSONObject object = new JSONObject();

        JSONArray diff = new JSONArray();
        object.put("assertDiff", diff);
        for (AssertDiff d : assertDiffs) {
            diff.put(d.toJson());
        }

        JSONArray notS = new JSONArray();

        notSyncro.stream().forEach(i -> notS.put(i));

        if (notS.length() != 0) {
            object.put("notSyncro", notS);
        }

        return object;
    }

    private void buildFrom(JSONObject jsonObject) throws JSONException {
        assertDiffs = new ArrayList<>();
        notSyncro = new HashSet<>();

        if(jsonObject.has("notSyncro")) {
            JSONArray array = jsonObject.getJSONArray("notSyncro");
            for(int i = 0; i < array.length(); i++) {
                notSyncro.add(array.getInt(i));
            }
        }
        JSONArray diff = jsonObject.getJSONArray("assertDiff");
        for(int i = 0; i < diff.length(); i++) {
            assertDiffs.add(new AssertDiff(diff.getJSONObject(i)));
        }
    }

    public void filter(Set<String> filter) {
        Map<Integer, String> map = new HashMap<>();

        for(String f : filter) {
            if(f.startsWith("[")) {
                Set<Integer> toRemove = Arrays.stream(f.substring(1, f.length() - 1).split(", "))
                                              .map(a -> Integer.parseInt(a)).collect(Collectors.toSet());
                notSyncro = notSyncro.stream()
                                     .filter(nS -> !toRemove.contains(nS)).collect(Collectors.toSet());
            } else {
                String[] tmp = f.split(";");
                map.put(Integer.parseInt(tmp[0]), f.substring(tmp[0].length() + 1,f.length()));
            }
        }

        for (AssertDiff a : assertDiffs) {
            if(map.containsKey(a.getAssertId())) {
                a.filter(map.get(a.getAssertId()));
            }
        }

        assertDiffs = assertDiffs.stream()
                .filter(a -> a.nbOfDiff() != 0)
                .collect(Collectors.toList());
    }

    public Set<String> buildFilter() {
        Set<String> filter = new HashSet<>();

        if(notSyncro != null && !notSyncro.isEmpty()) {
            filter.add(notSyncro.toString());
        }
        for(AssertDiff a : assertDiffs) {
            filter.add(a.buildFilter());
        }
        return  filter;
    }
}

