package fr.inria.diversify.persistence.json.input.special;

import fr.inria.diversify.persistence.json.input.JsonAstReplaceInput;
import fr.inria.diversify.persistence.json.output.JsonSectionOutput;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.AddMethodInvocation;
import fr.inria.diversify.transformation.RemoveInvocation;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONObject;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtStatement;

import java.util.Map;
import java.util.UUID;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.POSITION;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.SOURCE_CODE;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.STATUS;

/**
 * Created by nharrand on 09/08/17.
 */
public class JsonRemoveInvocationInput extends JsonAstReplaceInput {
    public JsonRemoveInvocationInput(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
    }

    public JsonRemoveInvocationInput(InputProgram inputProgram) {
        super(inputProgram);
    }


    @Override
    public void read(Map<UUID, Transformation> transformations) {
        RemoveInvocation transf = null;
        try {
            transf = (RemoveInvocation) get(transformations); //add the transformation to the transformations map if not present


            JSONObject cfJson = getJsonObject().getJSONObject(JsonSectionOutput.TRANSPLANT_POINT);


            CtStatement tp = getInputProgram().findElement(
                    CtInvocation.class,
                    cfJson.getString(POSITION),
                    cfJson.getString(SOURCE_CODE)
            );
            int status = Integer.parseInt(getJsonObject().getString(STATUS));
            if(status > -3) transf.setStatus(status);

            transf.setTp((CtInvocation)tp);


            addTransformation(transformations, transf);

        } catch (Exception e) {
            String s = "JsonAstReplaceInput::read Unable to parse removeInvocation transformation from json object";
            throwError(getTransformationErrorString(transf, s), e, true);
        }
    }


    @Override
    protected Transformation build() {
        return new RemoveInvocation();
    }

    @Override
    public boolean canRead(String s) {
        String[] r = s.split("\\.");
        if ( r.length != 2 ) return false;
        return  r[0].equals("del") && r[1].toLowerCase().contains("removeinvocation");
    }
}
