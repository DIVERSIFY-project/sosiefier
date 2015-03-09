package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;

/**
 * Parent class for all sections writing Transformations to JSON
 * <p/>
 * Created by marodrig on 08/01/2015.
 */
public abstract class JsonAstTransformationOutput extends JsonSectionOutput {

    private HashMap<String, Integer> failuresDict;

    @Override
    public void write(JSONObject outputObject) {
        super.write(outputObject);
        try {
            if (getOutputObject() == null) throw new PersistenceException("JSON Object not set");
            if (getTransformations() == null) throw new PersistenceException("Transformations unset");

            if (!getOutputObject().has(TRANSFORMATIONS)) getOutputObject().put(TRANSFORMATIONS, new JSONArray());
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
            object.put(TINDEX, astt.getIndex().toString());
            object.put(TRANSF_TYPE, astt.getType());
            object.put(STATUS, astt.getStatus());
            object.put(NAME, astt.getName());
            //Write failures
            List<String> failures = transformation.getFailures();

            JSONArray array = new JSONArray();

            if (failures == null) Log.warn("Unset persistence failures dictionary");
            else {
                for (String failure : failures) {
                    if (!getFailuresDictionary().containsKey(failure)) {
                        throw new PersistenceException("Unable to find failure index");
                    }
                    array.put(failuresDict.get(failure));
                }
            }
            object.put(JsonFailuresOutput.FAILURES, array);
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

    protected HashMap<String, Integer> getFailuresDictionary() {
        if ( failuresDict == null ) failuresDict = new HashMap<>();
        return failuresDict;
    }
}
