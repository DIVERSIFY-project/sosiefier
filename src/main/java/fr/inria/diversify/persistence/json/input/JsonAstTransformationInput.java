package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static fr.inria.diversify.persistence.json.output.JsonASTSectionOutput.FAILURES;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.STATUS;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TINDEX;

/**
 * Created by marodrig on 12/01/2015.
 */
public abstract class JsonAstTransformationInput extends JsonSectionInput {

    protected abstract ASTTransformation build();

    /**
     * gets data from the JSON  object into the transformation object
     */
    protected ASTTransformation get(HashMap<Integer, Transformation> t, HashMap<String, Object> metadata) throws JSONException {

        HashMap<Integer, String> failures = (HashMap<Integer, String>)metadata.get(FAILURES);

        int index = getJsonObject().getInt(TINDEX);
        ASTTransformation astt;
        if (t.containsKey(index)) astt = (ASTTransformation) t.get(index);
        else {
            astt = build();
            t.put(index, astt);
            astt.setIndex(index);
            astt.setStatus(getJsonObject().getInt(STATUS));
        }
        return astt;
    }

    @Override
    public void read(HashMap<Integer, Transformation> transformations, HashMap<String, Object> metadata) {
        try {
            get(transformations, metadata);
        } catch (JSONException e) {
            throw new PersistenceException("Unable to map JSON into transformation", e);
        }
    }

    /**
     * Read data into the given transformations. It may add new transformations as well.
     * @param metaData Metadata to be read
     */
    @Override
    public void readMetaData(HashMap<String, Object> metaData) {  }

    protected Map<String, String> getVarMap(JSONObject jsonObject) throws JSONException {
        Map<String, String> varMap = new HashMap<>();
        Iterator<String> nameItr = jsonObject.keys();
        while(nameItr.hasNext()) {
            String name = nameItr.next();
            varMap.put(name, jsonObject.getString(name));
        }
        return varMap;
    }
}
