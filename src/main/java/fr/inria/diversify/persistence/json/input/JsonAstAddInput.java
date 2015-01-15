package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.*;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstAddInput extends JsonAstTransformationInput {

    public JsonAstAddInput() {
        super();
    }

    @Override
    protected ASTTransformation build() {
        return new ASTAdd();
    }

    @Override
    public void read(HashMap<Integer, Transformation> transformations, HashMap<String, Object> metadata) {

        try {
            ASTAdd transf = (ASTAdd) get(transformations, metadata); //add the transformation to the transformations map if not present

            transf.setVarMapping(getVarMap(getJsonObject().getJSONObject(VARIABLE_MAP)));

            JSONObject cfJson = getJsonObject().getJSONObject(TRANSPLANT_POINT);
            CodeFragment cf = getCodeFragment(cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE));
            if ( cf == null ) throw new PersistenceException("Unable to find code fragment");
            transf.setTransplantationPoint(cf);

            cfJson = getJsonObject().getJSONObject(TRANSPLANT);
            cf = getCodeFragment(cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE));
            if ( cf == null ) throw new PersistenceException("Unable to find code fragment");
            transf.setTransplant(cf);
        } catch (JSONException e) {
            throw new PersistenceException("Unable to parse delete transformation", e);
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
        return false;
    }

    @Override
    public boolean canHandleSection(String s) {
        String[] r = s.split("\\.");
        if ( r.length != 2 ) return false;
        return  r[0].equals(TRANSFORMATIONS) && r[1].contains("add");
    }
}
