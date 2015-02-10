package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
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
    public void read(HashMap<Integer, Transformation> transformations) {

        ASTReplace transf = null;
        try {
            transf = (ASTReplace) get(transformations); //add the transformation to the transformations map if not present

            JSONObject cfJson = getJsonObject().getJSONObject(TRANSPLANT_POINT);
            CodeFragment cf = getCodeFragment(cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE));
            logCfStatus(transf, cf, cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE));
            transf.setTransplantationPoint(cf);

            cfJson = getJsonObject().getJSONObject(TRANSPLANT);
            cf = getCodeFragment(cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE));
            logCfStatus(transf, cf, cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE));
            transf.setTransplant(cf);

            transf.setVarMapping(getVarMap(getJsonObject().getJSONObject(VARIABLE_MAP)));
            //Add transformation if all went OK
            addTransformation(transformations, transf);
        } catch (JSONException e) {
            String s = "JsonAstReplaceInput::read Unable to parse replace transformation from json object";
            throwError(getTransformationErrorString(transf, s), e, true);
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
        return  r[0].equals(TRANSFORMATIONS) && r[1].toLowerCase().contains("replace");
    }
}
