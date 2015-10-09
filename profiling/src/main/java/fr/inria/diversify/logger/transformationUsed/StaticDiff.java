package fr.inria.diversify.logger.transformationUsed;

import fr.inria.diversify.logger.Diff;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    }

    @Override
    public void merge(Diff other) {

    }
}
