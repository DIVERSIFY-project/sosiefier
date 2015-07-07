package fr.inria.diversify.logger;

import fr.inria.diversify.logger.branch.BranchDiff;
import fr.inria.diversify.logger.exception.ExceptionDiff;
import fr.inria.diversify.logger.graph.GraphsDiff;
import fr.inria.diversify.logger.variable.VariableDiff;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.json.input.JsonSectionInput;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

/**
 * User: Simon
 * Date: 06/07/15
 * Time: 17:13
 */
public class JsonDiffInput extends JsonSectionInput {
    Map<Transformation, Set<Diff>> transToDiffs;

    public JsonDiffInput() {
        transToDiffs = new HashMap<>();
    }

    @Override
    public void read(Map<UUID, Transformation> transformations) {

        try {
            if ( getJsonObject() == null ) throw new PersistenceException("JSON object unset");

           if(getJsonObject().has(JsonDiffOutput.DIFFS)) {
               JSONArray diffs = getJsonObject().getJSONArray(JsonDiffOutput.DIFFS);

               for(int i = 0; i < diffs.length(); i++) {
                   JSONObject diff = diffs.getJSONObject(i);
                   UUID uuid = UUID.fromString(diff.getString(JsonDiffOutput.TRANSFORMATION));
                   Transformation transformation = transformations.get(uuid);

                   Set<Diff> set = readDiff(diff.getJSONArray(JsonDiffOutput.DIFFS));
                   transToDiffs.put(transformation, set);
               }

           }
        } catch (JSONException e) {
            throw new PersistenceException("Unable to parse add transformation", e);
        }
    }

    protected Set<Diff> readDiff(JSONArray jsonArray) throws JSONException {
        Set<Diff> diffs = new HashSet<>();

        for(int i = 0; i < jsonArray.length(); i++) {
            JSONObject diff = jsonArray.getJSONObject(i);
            String type;
            if (diff.has("type")) {
                type = diff.getString("type");
            } else{
                type = "graph";
            }
            switch (type) {
                case "graph":
                    diffs.add(new GraphsDiff(diff));
                    break;
                case "branch":
                    diffs.add(new BranchDiff(diff));
                    break;
                case "variable":
                    diffs.add(new VariableDiff(diff));
                    break;
                case "exception":
                    diffs.add(new ExceptionDiff(diff));
            }
        }
        return diffs;
    }

    public Map<Transformation, Set<Diff>> getTransToDiffs() {
        return transToDiffs;
    }
}
