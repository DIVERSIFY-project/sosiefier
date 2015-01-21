package fr.inria.diversify.testamplification.compare.diff;

import fr.inria.diversify.testamplification.compare.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Simon on 19/01/15.
 */
public class LogDiff implements Comparable {
    List<AssertDiff> assertDiffs;
    Set<Assert> notSyncro;
    int  allDiff = -1;

    public LogDiff() {
        assertDiffs = new ArrayList<>();
        notSyncro = new HashSet<>();
    }

    public void add(AssertDiff assertDiff) {
        if(assertDiff != null) {
            assertDiffs.add(assertDiff);
        }
    }

    public boolean isEmpty() {
        return assertDiffs.isEmpty();
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

    public void addAll(Set<Assert> notSyncro) {
        this.notSyncro.addAll(notSyncro);
    }

    public JSONObject toJson() throws JSONException {
        JSONObject object = new JSONObject();

        JSONArray diff = new JSONArray();
        object.put("assertDiff", diff);
        for(AssertDiff d : assertDiffs) {
            diff.put(d.toJson());
        }

        JSONArray notS = new JSONArray();
        object.put("notSyncro",notS);

        notSyncro.stream()
                .map(a -> a.getAssertId())
                .distinct()
                .forEach(i ->  notS.put(i));

        return object;
    }
}
