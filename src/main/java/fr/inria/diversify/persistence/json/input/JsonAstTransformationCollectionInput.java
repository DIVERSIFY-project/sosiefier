package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.SectionInput;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;

import static fr.inria.diversify.persistence.json.output.JsonAstTransformationOutput.FAILURES;
import static fr.inria.diversify.persistence.json.output.JsonAstTransformationOutput.FAILURES_DICTIONARY;
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
    public void read(HashMap<Integer, Transformation> transformations, HashMap<String, Object> metaData) {
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
                            si.read(transformations, metaData);
                        }
                    }
                }
            }
        } catch (JSONException e) {
            throw new PersistenceException("Unable to obtain the transformations object", e);
        }
    }

    /**
     * Read data into the given transformations. It may add new transformations as well.
     *
     * @param metaData Metadata to be read
     */
    @Override
    public void readMetaData(HashMap<String, Object> metaData) {
        try {
            HashMap<Integer, String> failures = new HashMap<>();
            JSONObject failuresJson = getJsonObject().getJSONObject(FAILURES_DICTIONARY);
            Iterator<?> keys = failuresJson.keys();
            while( keys.hasNext() ){
                String n = (String)keys.next();
                failures.put(failuresJson.getInt(n), n);
            }
            metaData.put(FAILURES, failures);
        } catch (JSONException e) {
            throw new PersistenceException(e);
        }
    }

    /**
     * Method that indicate if the meta data section can be handled or not
     *
     * @param s Unique name of the section
     * @return true if possible
     */
    @Override
    public boolean canHandleMetaDataSection(String s) {
        return s.equals(FAILURES_DICTIONARY);
    }
}
