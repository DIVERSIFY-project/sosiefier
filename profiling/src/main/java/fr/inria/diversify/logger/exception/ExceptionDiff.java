package fr.inria.diversify.logger.exception;

import fr.inria.diversify.logger.Diff;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 26/06/15
 * Time: 16:12
 */
public class ExceptionDiff implements Diff {
    Map<String, Set<String>> throwsByTest;
    Map<String, Set<String>> catchByTest;

    public ExceptionDiff() {
        throwsByTest = new HashMap<>();
        catchByTest = new HashMap<>();
    }

    @Override
    public void filter(Diff filter) {
        ExceptionDiff eDiff = (ExceptionDiff) filter;

        for(String test : eDiff.throwsByTest.keySet()) {
            if(throwsByTest.containsKey(test)) {
                throwsByTest.get(test).removeAll(eDiff.throwsByTest.get(test));
                if(throwsByTest.get(test).isEmpty()) {
                    throwsByTest.remove(test);
                }
            }
        }
        for(String test : eDiff.catchByTest.keySet()) {
            if(catchByTest.containsKey(test)) {
                catchByTest.get(test).removeAll(eDiff.catchByTest.get(test));
                if(catchByTest.get(test).isEmpty()) {
                    catchByTest.remove(test);
                }
            }
        }
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("throws", throwsByTest);
        object.put("catchs", catchByTest);
        object.put("type","exception");
        return object;
    }

    @Override
    public int size() {
        return throwsByTest.size() + throwsByTest.size();
    }

    @Override
    public void parse(JSONObject jsonObject) {

    }

    @Override
    public void merge(Diff other) {
        ExceptionDiff eDiff = (ExceptionDiff) other;

        for(String test : eDiff.throwsByTest.keySet()) {
            if(throwsByTest.containsKey(test)) {
                throwsByTest.get(test).addAll(eDiff.throwsByTest.get(test));
            } else {
                throwsByTest.put(test, eDiff.throwsByTest.get(test));
            }
        }

        for(String test : eDiff.catchByTest.keySet()) {
            if(catchByTest.containsKey(test)) {
                catchByTest.get(test).addAll(eDiff.catchByTest.get(test));
            } else {
                catchByTest.put(test, eDiff.catchByTest.get(test));
            }
        }
    }

    public void addThrows(String key, String strings) {
        if(!throwsByTest.containsKey(key)) {
            throwsByTest.put(key, new HashSet<>());
        }
        throwsByTest.get(key).add(strings);
    }

    public void addCatchs(String key, String strings) {
        if(!catchByTest.containsKey(key)) {
            catchByTest.put(key, new HashSet<>());
        }
        catchByTest.get(key).add(strings);
    }
}
