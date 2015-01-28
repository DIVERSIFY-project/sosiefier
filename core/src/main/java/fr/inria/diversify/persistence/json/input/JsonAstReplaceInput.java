package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.*;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstReplaceInput extends JsonAstTransformationInput {

    public JsonAstReplaceInput(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
    }

    public JsonAstReplaceInput(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    protected ASTTransformation build() {
        return new ASTReplace();
    }

    @Override
    public void read(HashMap<Integer, SingleTransformation> transformations) {

        try {
            ASTReplace transf = (ASTReplace) get(transformations); //add the transformation to the transformations map if not present

            JSONObject cfJson = getJsonObject().getJSONObject(TRANSPLANT_POINT);
            CodeFragment cf = getCodeFragment(cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE));
            if ( cf == null ) throw new PersistenceException("Unable to find code fragment");
            transf.setTransplantationPoint(cf);

            cfJson = getJsonObject().getJSONObject(TRANSPLANT);
            cf = getCodeFragment(cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE));
            if ( cf == null ) throw new PersistenceException("Unable to find code fragment");
            transf.setTransplant(cf);

            transf.setVarMapping(getVarMap(getJsonObject().getJSONObject(VARIABLE_MAP)));
        } catch (JSONException e) {
            throw new PersistenceException("Unable to parse replace transformation", e);
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
        return  r[0].equals(TRANSFORMATIONS) && r[1].contains("replace");
    }
}
