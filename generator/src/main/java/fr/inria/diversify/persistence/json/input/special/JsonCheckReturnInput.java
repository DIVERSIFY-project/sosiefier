package fr.inria.diversify.persistence.json.input.special;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.persistence.json.input.JsonAstReplaceInput;
import fr.inria.diversify.persistence.json.output.JsonSectionOutput;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.CheckReturnTransformation;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtExpression;

import java.util.Map;
import java.util.UUID;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.POSITION;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.SOURCE_CODE;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.VARIABLE_MAP;

/**
 * User: Simon
 * Date: 06/06/16
 * Time: 11:07
 */
public class JsonCheckReturnInput extends JsonAstReplaceInput {

    public JsonCheckReturnInput(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    public void read(Map<UUID, Transformation> transformations) {
        CheckReturnTransformation transf = null;
        try {
            transf = (CheckReturnTransformation) get(transformations); //add the transformation to the transformations map if not present

            JSONObject cfJson = getJsonObject().getJSONObject(JsonSectionOutput.TRANSPLANT_POINT);

            CodeFragment cf = getCodeFragment(cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE));
            transf.setTransplantationPoint(cf);

            JSONObject conditionJson = getJsonObject().getJSONObject("condition");
            CtExpression<Boolean> condition = getInputProgram().findElement(CtExpression.class,
                    conditionJson.getString(JsonSectionOutput.POSITION),
                    conditionJson.getString(JsonSectionOutput.SOURCE_CODE));

            transf.setCondition(condition);
            transf.setException(getJsonObject().getString("exception"));
            transf.setReturnInThen((getJsonObject().getBoolean("returnInThen")));

            if(getJsonObject().has(VARIABLE_MAP)) {
                transf.setVarMapping(getVarMap(getJsonObject().getJSONObject(VARIABLE_MAP)));
                addFailuresToTransformation(transf);
                transf.setWithVariableMapping(true);
            } else {
                transf.setWithVariableMapping(false);
            }

            //Add transformation if all went OK
            addTransformation(transformations, transf);
        } catch (JSONException e) {
            String s = "JsonAstReplaceInput::read Unable to parse replace transformation from json object";
            throwError(getTransformationErrorString(transf, s), e, true);
        }
    }


    @Override
    protected Transformation build() {
        return new CheckReturnTransformation();
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
        return  (r[0].equals("insertion") || r[0].equals("special"))
        && r[1].contains("checkReturn");
    }
}
