package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.json.output.JsonSectionOutput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collection;

/**
 * Created by marodrig on 08/01/2015.
 */
public class JsonASTSectionOutput extends JsonSectionOutput {

    /**
     * Writes a CodeFragment to JSON
     *
     * @param fragment CodeFragment to write to JSON
     * @return A JSON object
     * @throws JSONException
     */
    protected JSONObject codeFragmentToJSON(CodeFragment fragment) throws JSONException {
        JSONObject object = new JSONObject();
        object.put("position", fragment.positionString());
        object.put("type", fragment.getCodeFragmentTypeSimpleName());
        object.put("sourcecode", fragment.equalString());
        //object.put("inputContext", new JSONArray(getInputContext().inputContextToString()));
        //object.put("outputContext", getOutputContext().toString());
        return object;
    }

    /**
     * Ensures that the Transformation sections exists
     * @throws JSONException
     */
    protected void initializeSection() throws JSONException {
        if (getOutputObject() == null) throw new PersistenceException("JSON Object not set");
        if (!getOutputObject().has(TRANSFORMATIONS)) getOutputObject().put(TRANSFORMATIONS, new JSONArray());
    }

    /**
     * Puts the transformation data into the JSON Object.
     * @param object Objecto to put data
     * @param transformation Transformation to obtain data from
     * @param isEmptyObject Indicate if the JSON object is empty
     */
    protected void put(JSONObject object, Transformation transformation, boolean isEmptyObject) throws JSONException {
        if (transformation instanceof ASTTransformation) {
            ASTTransformation astt = (ASTTransformation) transformation;
            object.put("tindex", astt.getIndex());
            object.put("type", astt.getType());
            object.put("status", astt.getStatus());
            object.put("name", astt.getName());
        }
    }


    @Override
    public void write(Collection<Transformation> transformations) {
        try {
            initializeSection();
            JSONArray array = getOutputObject().getJSONArray(TRANSFORMATIONS);

            boolean isEmptyArray = array.length() == 0;
            if ( !isEmptyArray && array.length() != transformations.size() )
                throw new PersistenceException("Unable to find JSON Object to append data");
            int i = 0;
            for (Transformation t : transformations) {
                if ( isEmptyArray ) { array.put(new JSONObject()); }
                put(array.getJSONObject(i), t, isEmptyArray);
                i++;
            }
        } catch (JSONException e) {
            throw new PersistenceException(e);
        }
    }
}
