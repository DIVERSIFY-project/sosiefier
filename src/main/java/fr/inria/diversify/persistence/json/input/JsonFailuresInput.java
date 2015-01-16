package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;

import static fr.inria.diversify.persistence.json.output.JsonFailuresOutput.FAILURES_DICTIONARY;

/**
 * Created by marodrig on 16/01/2015.
 */
public class JsonFailuresInput extends JsonSectionInput {

    private HashMap<Integer, String> failures;

    public JsonFailuresInput(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
    }

    @Override
    public void read(HashMap<Integer, Transformation> transformations) {

        failures = new HashMap<>();
        try {
            JSONObject failuresJson = getJsonObject().getJSONObject(FAILURES_DICTIONARY);
            Iterator<?> keys = failuresJson.keys();
            while( keys.hasNext() ){
                String n = (String)keys.next();
                failures.put(failuresJson.getInt(n), n);
            }
        } catch (JSONException e) {
            throw new PersistenceException(e);
        }
    }

    public HashMap<Integer, String> getFailures() {
        return failures;
    }
}
