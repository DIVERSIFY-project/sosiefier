package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by marodrig on 08/01/2015.
 */
public class JsonASTFailuresSectionOutput extends JsonASTSectionOutput {

    public static final String FAILURES = "failures";
    public static final String FAILURES_DICTIONARY = "failureDictionary";

    private Map<String, Integer> failuresIDs = new HashMap<>();

    private int id = 0;

    protected void put(JSONObject object, Transformation transformation, boolean isEmptyObject) throws JSONException {
        if (isEmptyObject) super.put(object, transformation, isEmptyObject);

        List<String> failures = transformation.getFailures();
        JSONArray array = new JSONArray();
        if (failures != null) {
            for (String failure : failures) {
                if (!failuresIDs.containsKey(failure)) {
                    failuresIDs.put(failure, id);
                    array.put(id);
                    id++;
                } else array.put(failuresIDs.get(failure));
            }
        }
        object.put(FAILURES, array);
    }

    @Override
    public void write(Collection<Transformation> transformations) {
        super.write(transformations);
        try {
            getOutputObject().put(FAILURES_DICTIONARY, failuresIDs);
        } catch (JSONException e) {
            throw new PersistenceException(e);
        }
    }
}