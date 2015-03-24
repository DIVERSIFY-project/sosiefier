package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.NAME;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TINDEX;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSFORMATIONS;

/**
 * Class to read the transformations object in the JSONArray
 * <p/>
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstTransformationCollectionInput extends JsonSectionInput {

    private Map<Integer, String> failures;

    public JsonAstTransformationCollectionInput(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
    }

    @Override
    public void read(Map<UUID, Transformation> transformations) {

        JSONArray tr = null;
        try {
            tr = getJsonObject().getJSONArray(TRANSFORMATIONS);
        } catch (JSONException e) {
            throwError("Unable to obtain the transformations object", e, true);
        }
        Collection<JsonTransformationInput> sections = buildSections();

        for (int i = 0; i < tr.length(); i++) {
            checkToManyErrors();
            UUID index = null;
            try {
                JSONObject obj = tr.getJSONObject(i);
                try {
                    index = UUID.fromString(obj.getString(TINDEX));
                } catch (IllegalArgumentException e) {
                    throwWarning("Invalid index. ", e, false);
                }
                for (JsonTransformationInput si : sections) {
                    if (si.canRead(TRANSFORMATIONS + "." + obj.getString(NAME))) {
                        si.setJsonObject(obj);
                        si.setFailures(getFailures());
                        si.setLoadMessages(getLoadMessages());
                        si.read(transformations);
                    }
                }
            } catch (PersistenceException pe) {
                if (index == null) throwError("Cannot load. Invalid transformation index", pe, false);
                else {
                    //Don't report twice the cause in case it has been already reported
                    String s = "Transf " + index + " cannot load.";
                    if (getLoadMessages().size() > 0 &&
                            getLoadMessages().get(getLoadMessages().size() - 1).contains(pe.getMessage()))
                        throwError(s, null, false);
                    else throwError(s, pe, false);
                }
            } catch (JSONException e) {
                if (index == null) throwError("Cannot load. Invalid transformation index", e, false);
                throwError("Transf " + index + ". Unable to parse from JSON ", e, false);
            } catch (Exception e) {
                if (index == null) throwError("Cannot load. Invalid transformation index", e, false);
                throwError("Transf " + index + ". Unexpected error. ", e, false);
            }
        }
    }

    /**
     * Builds the sub sections that will read the transformation section
     *
     * @return
     */
    protected Collection<JsonTransformationInput> buildSections() {
        ArrayList<JsonTransformationInput> sections = new ArrayList<>();
        sections.add(new JsonAstAddInput(getInputProgram()));
        sections.add(new JsonAstReplaceInput(getInputProgram()));
        sections.add(new JsonAstDeleteInput(getInputProgram()));
        sections.add(new JsonMultiTransformationInput(getInputProgram()));
        return sections;
    }

    public Map<Integer, String> getFailures() {
        return failures;
    }

    public void setFailures(Map<Integer, String> failures) {
        this.failures = failures;
    }
}
