package fr.inria.diversify.logger;

import fr.inria.diversify.persistence.json.output.JsonSectionOutput;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 01/07/15
 * Time: 10:05
 */
public class JsonDiffOutput extends JsonSectionOutput {
    protected static final String TRANSFORMATION = "transformation";
    protected static final String DIFFS = "diffs";


    Map<Transformation, Set<Diff>> diffs;

    public JsonDiffOutput(Map<Transformation, Set<Diff>> diffs) {
        this.diffs = diffs;
    }

    public void write(JSONObject outputObject) {
        if(!diffs.isEmpty()) {
            try {
                JSONArray array = new JSONArray();
                outputObject.put(DIFFS, array);

                for(Transformation transformation : diffs.keySet()) {
                    JSONObject diffsForTrans = new JSONObject();
                    diffsForTrans.put(TRANSFORMATION, transformation.getIndex());

                    JSONArray diffArray = new JSONArray();
                    for (Diff diff : diffs.get(transformation)) {
                        diffArray.put(diff.toJSON());
                    }
                    diffsForTrans.put(DIFFS, diffArray);
                    array.put(diffsForTrans);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

}
