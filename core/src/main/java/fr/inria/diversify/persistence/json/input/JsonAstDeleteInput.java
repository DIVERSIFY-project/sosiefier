package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.UUID;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.*;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstDeleteInput extends JsonAstTransformationInput {

    public JsonAstDeleteInput(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
    }

    public JsonAstDeleteInput(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    protected ASTTransformation build() {
        return new ASTDelete();
    }

    /**
     * Read data into the given transformations. It may add new transformations as well.
     *
     * @param transformations Transformation to be modified by the reader. May increase size after method call.
     */
    @Override
    public void read(HashMap<UUID, Transformation> transformations) {
        try {
            ASTDelete transf = (ASTDelete)get(transformations); //add the transformation to the transformations map if not present
            JSONObject cfJson = getJsonObject().getJSONObject(TRANSPLANT_POINT);
            CodeFragment cf = getCodeFragment(cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE));
            logCfStatus(transf, cf, cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE));
            transf.setTransplantationPoint(cf);
            //Add transformation if all went OK
            addTransformation(transformations, transf);
        } catch (JSONException e) {
            throw new PersistenceException("Unable to parse delete transformation", e);
        }
    }

    /**
     * Indicate if can handle a section within the file
     *
     * @param s Section name
     * @return True if can handle
     */
    @Override
    public boolean canRead(String s) {
        String[] r = s.split("\\.");
        if ( r.length != 2 ) return false;
        return  r[0].equals(TRANSFORMATIONS) && r[1].toLowerCase().equals("delete");
    }
}
