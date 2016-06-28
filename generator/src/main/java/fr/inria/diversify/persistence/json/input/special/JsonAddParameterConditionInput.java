package fr.inria.diversify.persistence.json.input.special;

import fr.inria.diversify.codeFragment.Method;
import fr.inria.diversify.persistence.json.input.JsonAstReplaceInput;
import fr.inria.diversify.persistence.json.output.JsonSectionOutput;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.AddParameterCondition;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtMethod;

import java.util.Map;
import java.util.UUID;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.*;

/**
 * User: Simon
 * Date: 06/06/16
 * Time: 11:07
 */
public class JsonAddParameterConditionInput extends JsonAstReplaceInput {

    public JsonAddParameterConditionInput(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    public void read(Map<UUID, Transformation> transformations) {
        AddParameterCondition transf = null;
        try {
            transf = (AddParameterCondition) get(transformations); //add the transformation to the transformations map if not present

            JSONObject cfJson = getJsonObject().getJSONObject("method");
            Method cf = new Method(getInputProgram().findElement(CtMethod.class,
                    cfJson.getString(JsonSectionOutput.POSITION),
                    null));


            transf.setMethod(cf);

            JSONObject conditionJson = getJsonObject().getJSONObject("condition");
            CtExpression<Boolean> condition = getInputProgram().findElement(CtExpression.class,
                    conditionJson.getString(JsonSectionOutput.POSITION),
                    null);

            transf.setCondition(condition);
            transf.setException(getJsonObject().getString("exception"));
            transf.setReturnInThen(getJsonObject().getBoolean("returnInThen"));
            transf.setThrowBranchCoverage(getJsonObject().getBoolean("throwBranchCoverage"));

            if(getJsonObject().has(VARIABLE_MAP)) {
                transf.setVariableMapping(getVarMap(getJsonObject().getJSONObject(VARIABLE_MAP)));
                addFailuresToTransformation(transf);
                transf.setWithVariableMapping(true);
            } else {
                transf.setWithVariableMapping(false);
            }

            if(condition != null) {
                //Add transformation if all went OK
                addTransformation(transformations, transf);
            }
        } catch (JSONException e) {
            String s = "JsonAstReplaceInput::read Unable to parse replace transformation from json object";
            throwError(getTransformationErrorString(transf, s), e, true);
        }
    }


    @Override
    protected Transformation build() {
        return new AddParameterCondition();
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
        return   r[0].equals("special")
        && r[1].contains("addParameterCondition");
    }
}
