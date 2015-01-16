package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by marodrig on 15/01/2015.
 */
public class JsonFailuresOutput extends JsonSectionOutput {

    public static final String FAILURES = "failures";
    public static final String FAILURES_DICTIONARY = "failureDictionary";
    private HashMap<String, Integer> failuresDict;

    public HashMap<String, Integer> getFailuresDict() {
        if (failuresDict == null) failuresDict = new HashMap<>();
        return failuresDict;
    }

    @Override
    public void write(JSONObject object) {
        super.write(object);
        failuresDict = new HashMap<>();
        int id = 0;
        for (Transformation t : getTransformations()) {
            if (t.getFailures() != null && t.getFailures().size() > 0) {
                for (String s : t.getFailures())
                    if (!failuresDict.containsKey(s)) failuresDict.put(s, id++);
            }
        }
        try {
            object.put(FAILURES_DICTIONARY, failuresDict);
        } catch (JSONException e) {
            throw new PersistenceException(e);
        }
    }
}
