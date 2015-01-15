package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.SectionInput;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collection;
import java.util.HashMap;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.NAME;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSFORMATIONS;

/**
 * Class to read the transformations object in the JSONArray
 * <p>
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstTransformationCollectionInput extends JsonSectionInput {

    @Override
    public boolean canHandleSection(String s) {
        return s.equals(TRANSFORMATIONS);
    }

    @Override
    public void read(HashMap<Integer, Transformation> transformations) {
        try {
            if (getJsonObject().has(TRANSFORMATIONS)) {
                JSONArray tr = getJsonObject().getJSONArray(TRANSFORMATIONS);
                for ( int i = 0; i < tr.length(); i++ ) {
                    JSONObject obj = tr.getJSONObject(i);
                    for ( SectionInput si : getSections() ) {
                        if ( si.canHandleSection(TRANSFORMATIONS + "." + obj.getString(NAME)) ) {
                            si.setSections(getSections());
                            ((JsonSectionInput) si).setInputProgram(getInputProgram());
                            ((JsonSectionInput) si).setJsonObject(obj);
                            si.read(transformations);
                        }
                    }
                }
            }
        } catch (JSONException e) {
            throw new PersistenceException("Unable to obtain the transformations object", e);
        }
    }
}
