package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.*;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstDeleteInput extends JsonAstTransformationInput {


    public JsonAstDeleteInput() {
        super();
    }

    @Override
    protected ASTTransformation build() {
        return new ASTDelete();
    }

    /**
     * Read data into the given transformations. It may add new transformations as well.
     *
     * @param transformations Transformation to be modified by the reader. May increase size after method call.
     * @param metaData
     */
    @Override
    public void read(HashMap<Integer, Transformation> transformations, HashMap<String, Object> metaData) {
        try {
            ASTDelete transf = (ASTDelete)get(transformations, metaData); //add the transformation to the transformations map if not present
            JSONObject cfJson = getJsonObject().getJSONObject(TRANSPLANT_POINT);
            transf.setTransplantationPoint(getCodeFragment(cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE)));
        } catch (JSONException e) {
            throw new PersistenceException("Unable to parse delete transformation", e);
        }
    }

    /**
     * Read data into the given transformations. It may add new transformations as well.
     *
     * @param metaData Metadata to be read
     */
    @Override
    public void readMetaData(HashMap<String, Object> metaData) {}

    /**
     * Method that indicate if the meta data section can be handled or not
     *
     * @param s Unique name of the section
     * @return true if possible
     */
    @Override
    public boolean canHandleMetaDataSection(String s) {
        return false;
    }

    @Override
    public boolean canHandleSection(String s) {
        String[] r = s.split("\\.");
        if ( r.length != 2 ) return false;
        return  r[0].equals(TRANSFORMATIONS) && r[1].equals("delete");
    }
}
