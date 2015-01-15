package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parent class for all sections writing Transformations to JSON
 * <p>
 * Created by marodrig on 08/01/2015.
 */
public abstract class JsonASTSectionOutput extends JsonSectionOutput {

    public static final String FAILURES = "failures";

    public static final String FAILURES_DICTIONARY = "failureDictionary";

    private Map<String, Integer> failuresIDs = new HashMap<>();

    private int failureId = 0;

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
     * Ensures that the Transformation sections exists
     *
     * @throws JSONException
     */
    @Override
    public void before(Collection<Transformation> t) {
        try {
            if (getOutputObject() == null) throw new PersistenceException("JSON Object not set");
            if (!getOutputObject().has(TRANSFORMATIONS)) getOutputObject().put(TRANSFORMATIONS, new JSONArray());
        } catch (JSONException e) {
            throw new PersistenceException(e);
        }
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
            if (failures != null) {
                for (String failure : failures) {
                    if (!failuresIDs.containsKey(failure)) {
                        failuresIDs.put(failure, failureId);
                        array.put(failureId);
                        failureId++;
                    } else array.put(failuresIDs.get(failure));
                }
            }
            object.put(FAILURES, array);
        }
    }


    @Override
    public void write(Transformation transformation) {
        try {
            if (canStore(transformation)) {
                //Ensure the before phase in case our caller hasn't called
                if (getOutputObject() == null || !getOutputObject().has(TRANSFORMATIONS)) before(null);
                //Obtain the array containing the transformations
                JSONArray array = getOutputObject().getJSONArray(TRANSFORMATIONS);
                JSONObject o = new JSONObject();
                putDataToJSON(o, transformation);
                array.put(o);
            }
        } catch (JSONException e) {
            throw new PersistenceException(e);
        }
    }

    public abstract boolean canStore(Transformation t);

    @Override
    public void after() {
        try {
            getOutputObject().put(FAILURES_DICTIONARY, failuresIDs);
        } catch (JSONException e) {
            throw new PersistenceException(e);
        }
    }
}
