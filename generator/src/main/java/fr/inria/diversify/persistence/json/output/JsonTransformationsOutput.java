package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * User: Simon
 * Date: 23/03/15
 * Time: 16:16
 */
public class JsonTransformationsOutput extends JsonSectionOutput {


    protected HashMap<String, Integer> failuresDict;

    @Override
    public void write(JSONObject outputObject) {
        super.write(outputObject);
        try {
            if (getOutputObject() == null) {
                throw new PersistenceException("JSON Object not set");
            }
            if (getTransformations() == null) {
                throw new PersistenceException("Transformations unset");
            }

            if (!getOutputObject().has(TRANSFORMATIONS)) {
                getOutputObject().put(TRANSFORMATIONS, new JSONArray());
            }
            JSONArray array = getOutputObject().getJSONArray(TRANSFORMATIONS);
            for (Transformation t : getTransformations()) {
                t.setFailuresDico(failuresDict);
                array.put(t.toJSONObject());
                try {
                    t.toJSONObject().toString();
                }                               catch (Exception e) {
                    t.toJSONObject();
                }
            }

    } catch (JSONException e) {
            throw new PersistenceException(e);
        }
    }

    /**
     * Sets the failure dictionary
     * @param failuresDict
     */
    public void setFailuresDict(HashMap<String, Integer> failuresDict) {
        this.failuresDict = failuresDict;
    }

}
