package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

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
    protected ASTTransformation get(HashMap<Integer, Transformation> t) throws JSONException {
        int index = getJsonObject().getInt(TINDEX);
        ASTTransformation astt;
        if (t.containsKey(index)) astt = (ASTTransformation) t.get(index);
        else {
            astt = build();
            t.put(index, astt);
        }
        astt.setIndex(index);
        astt.setStatus(getJsonObject().getInt(STATUS));
        return astt;
    }

    @Override
    public void read(HashMap<Integer, Transformation> transformations) {
        try {
            get(transformations);
        } catch (JSONException e) {
            throw new PersistenceException("Unable to map JSON into transformation", e);
        }
    }
}
