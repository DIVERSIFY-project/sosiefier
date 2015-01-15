package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parent class for all sections writing Transformations to JSON
 * <p/>
 * Created by marodrig on 08/01/2015.
 */
public abstract class JsonAstTransformationOutput extends JsonSectionOutput {

    public static final String FAILURES = "failures";

    public static final String FAILURES_DICTIONARY = "failureDictionary";

    private HashMap<String, Integer> failuresDict;

    @Override
    public void write(JSONObject outputObject) {
        try {
            if (getOutputObject() == null) throw new PersistenceException("JSON Object not set");
            if (!getOutputObject().has(TRANSFORMATIONS)) getOutputObject().put(TRANSFORMATIONS, new JSONArray());

            this.outputObject = outputObject;
            for (Transformation t : getTransformations()) {
                if (canStore(t)) {
                    JSONArray array = getOutputObject().getJSONArray(TRANSFORMATIONS);
                    JSONObject o = new JSONObject();
                    putDataToJSON(o, t);
                    array.put(o);
                }
            }
        } catch (JSONException e) {
            throw new PersistenceException(e);
        }
    }

    /**
     * Writes a CodeFragment to JSON
     *
     * @param fragment CodeFragment to write to JSON
     * @return A JSON object
     * @throws JSONException
     */
    protected JSONObject codeFragmentToJSON(CodeFragment fragment) throws JSONException {
        if (fragment == null) throw new PersistenceException("Invalid null fragment");
        JSONObject object = new JSONObject();
        object.put(POSITION, fragment.positionString());
        object.put(TRANSF_TYPE, fragment.getCodeFragmentTypeSimpleName());
        object.put(SOURCE_CODE, fragment.equalString());
        return object;
    }

    /**
     * Puts the transformation data into the JSON Object.
     *
     * @param object         Objecto to put data
     * @param transformation Transformation to obtain data from
     */
    protected void putDataToJSON(JSONObject object, Transformation transformation) throws JSONException {
        if (transformation instanceof ASTTransformation) {
            ASTTransformation astt = (ASTTransformation) transformation;
            object.put(TINDEX, astt.getIndex());
            object.put(TRANSF_TYPE, astt.getType());
            object.put(STATUS, astt.getStatus());
            object.put(NAME, astt.getName());
            //Write failures
            List<String> failures = transformation.getFailures();
            JSONArray array = new JSONArray();

            if (failures == null) Log.warn("Unset persistence failures dictionary");
            else {
                for (String failure : failures) {
                    if (!failuresDict.containsKey(failure)) {
                        throw new PersistenceException("Unable to find failure index");
                    }
                    array.put(failuresDict.get(failure));

                }
                object.put(FAILURES, array);
            }
        }
    }

    public abstract boolean canStore(Transformation t);

    /**
     * Sets the failure dictionary
     * @param failuresDict
     */
    public void setFailuresDict(HashMap<String, Integer> failuresDict) {
        this.failuresDict = failuresDict;
    }
}
