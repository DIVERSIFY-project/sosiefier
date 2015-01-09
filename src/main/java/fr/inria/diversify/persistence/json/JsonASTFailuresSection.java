package fr.inria.diversify.persistence.json;

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
 * Created by marodrig on 08/01/2015.
 */
public class JsonASTFailuresSection extends JsonASTSectionOutput {

    private Map<String, Integer> failuresIDs = new HashMap<>();

    private int id = 0;

    public void put(JSONObject object, Transformation transformation) throws JSONException {

    }

    @Override
    public void write(Collection<Transformation> transformations) {
        super.write(transformations);
        try {
            JSONObject to = getOutputObject().getJSONObject(TRANSFORMATIONS);
            for (Transformation t : transformations) {
                if (t instanceof ASTTransformation) {
                    List<String> failures = t.getFailures();
                    JSONArray array = new JSONArray();
                    if (failures != null) {
                        for (String failure : failures) {
                            if (!failuresIDs.containsKey(failure)) {
                                failuresIDs.put(failure, id);
                                id++;
                            }
                            array.put(failuresIDs.get(failure));
                        }
                    }
                    to.put("failures", array);
                }
            }
            getOutputObject().put("failures", failuresIDs);
        } catch (JSONException e) {
            throw new PersistenceException(e);
        }
    }
}