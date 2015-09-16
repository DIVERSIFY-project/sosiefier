package fr.inria.diversify.logger.transformationUsed;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 20/08/15
 * Time: 16:48
 */
public class StaticDiff {
    Map<String, Set<String>> methodDiffs;
    Map<String, Set<String>> branchesDiff;

    public StaticDiff(Map<String, Set<String>> branchesDiff, Map<String, Set<String>> methodDiffs) {
        this.branchesDiff = branchesDiff;
        this.methodDiffs = methodDiffs;
    }

    public JSONObject toJson() throws JSONException {
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
}
