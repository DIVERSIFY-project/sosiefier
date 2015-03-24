package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.MultiTransformation;
import fr.inria.diversify.transformation.Transformation;
import jdk.nashorn.api.scripting.JSObject;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * User: Simon
 * Date: 23/03/15
 * Time: 13:40
 */
public class JsonMultiTransformationInput extends JsonTransformationInput {
    protected JsonAstTransformationCollectionInput jsonTransformationCollectionInput;

    public JsonMultiTransformationInput(InputProgram inputProgram) {
        super(inputProgram);
        jsonTransformationCollectionInput = new JsonAstTransformationCollectionInput(inputProgram, null);
    }

    @Override
    protected Transformation build() {
        return new MultiTransformation();
    }

    @Override
    public void read(Map<UUID, Transformation> transformations) {

        try {
            if ( getJsonObject() == null ) throw new PersistenceException("JSON object unset");

            MultiTransformation trans = (MultiTransformation) get(transformations); //add the transformation to the transformations map if not present

            jsonTransformationCollectionInput.setJsonObject(getJsonObject());

            Map<UUID, Transformation> tmp = new HashMap<>();
            jsonTransformationCollectionInput.read(tmp);

            trans.addAll(tmp.values());

            //Add transformation if all went OK
            addTransformation(transformations, trans);
        } catch (JSONException e) {
            throw new PersistenceException("Unable to parse add transformation", e);
        }
    }

    @Override
    public boolean canRead(String s) {
        return s.equals("multi.multi");
    }
}
