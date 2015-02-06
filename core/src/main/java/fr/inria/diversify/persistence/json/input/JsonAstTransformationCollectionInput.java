package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.NAME;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSFORMATIONS;

/**
 * Class to read the transformations object in the JSONArray
 * <p/>
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstTransformationCollectionInput extends JsonSectionInput {

    private HashMap<Integer, String> failures;

    public JsonAstTransformationCollectionInput(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
    }

    @Override
    public void read(HashMap<Integer, Transformation> transformations) {

        JSONArray tr = null;
        try {
            tr = getJsonObject().getJSONArray(TRANSFORMATIONS);
        } catch (JSONException e) {
            throwError("Unable to obtain the transformations object", e, true);
        }
        Collection<JsonAstTransformationInput> sections = buildSections();

        for (int i = 0; i < tr.length(); i++) {
            try {
                JSONObject obj = tr.getJSONObject(i);
                for (JsonAstTransformationInput si : sections) {
                    if (si.canRead(TRANSFORMATIONS + "." + obj.getString(NAME))) {
                        si.setJsonObject(obj);
                        si.setFailures(getFailures());
                        si.read(transformations);
                    }
                }
            } catch (PersistenceException pe) {
                throwError("Unable to parse Transformation  " + i, pe, false);
            } catch (JSONException e) {
                throwError("Unable to parse Transformation " + i, e, false);
            }
        }


    }


    private Collection<JsonAstTransformationInput> buildSections() {
        ArrayList<JsonAstTransformationInput> sections = new ArrayList<>();
        sections.add(new JsonAstAddInput(getInputProgram()));
        sections.add(new JsonAstReplaceInput(getInputProgram()));
        sections.add(new JsonAstDeleteInput(getInputProgram()));
        return sections;
    }

    public HashMap<Integer, String> getFailures() {
        return failures;
    }

    public void setFailures(HashMap<Integer, String> failures) {
        this.failures = failures;
    }
}
