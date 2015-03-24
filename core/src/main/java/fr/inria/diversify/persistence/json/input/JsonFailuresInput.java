package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import static fr.inria.diversify.persistence.json.output.JsonFailuresOutput.FAILURES_DICTIONARY;

/**
 * Created by marodrig on 16/01/2015.
 */
public class JsonFailuresInput extends JsonSectionInput {

    private Map<Integer, String> failures;

    public JsonFailuresInput(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
    }

    @Override
    public void read(Map<UUID, Transformation> transformations) {

        failures = new HashMap<>();
        try {
            if ( getJsonObject().has(FAILURES_DICTIONARY) ) return;

            JSONObject failuresJson = getJsonObject().getJSONObject(FAILURES_DICTIONARY);
            Iterator<?> keys = failuresJson.keys();
            while( keys.hasNext() ){
                String n = (String)keys.next();
                failures.put(failuresJson.getInt(n), n);
            }
        } catch (JSONException e) {
            throwError("Unexpected JSON error ", e, true);
        }
    }

    public Map<Integer, String> getFailures() {
        return failures;
    }
}
