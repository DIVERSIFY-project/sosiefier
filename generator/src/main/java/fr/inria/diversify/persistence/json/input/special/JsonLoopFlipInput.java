package fr.inria.diversify.persistence.json.input.special;

import fr.inria.diversify.persistence.json.input.JsonAstReplaceInput;
import fr.inria.diversify.persistence.json.output.JsonSectionOutput;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.LoopFlip;
import fr.inria.diversify.transformation.SwapSubType;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtFor;
import spoon.reflect.code.CtStatement;
import spoon.support.reflect.code.CtForImpl;

import java.util.Map;
import java.util.UUID;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.POSITION;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.SOURCE_CODE;

/**
 * Created by nharrand on 31/05/17.
 */
public class JsonLoopFlipInput extends JsonAstReplaceInput {

    public JsonLoopFlipInput(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    public void read(Map<UUID, Transformation> transformations) {
        LoopFlip transf = null;
        try {
            transf = (LoopFlip) get(transformations); //add the transformation to the transformations map if not present
            JSONObject cfJson = getJsonObject().getJSONObject("save");


            CtStatement tp = getInputProgram().findElement(
                    CtFor.class,
                    getJsonObject().getString(POSITION),
                    cfJson.getString("oldFor")
            );

            if(tp == null) {
                tp = getInputProgram().findElement(
                        CtFor.class,
                        getJsonObject().getString(POSITION),
                        null
                );
            }

            if(tp == null) {
                tp = getInputProgram().findElement(
                        CtForImpl.class,
                        getJsonObject().getString(POSITION),
                        cfJson.getString("oldFor")
                );
            }

            if(tp == null) {
                tp = getInputProgram().findElement(
                        CtForImpl.class,
                        getJsonObject().getString(POSITION),
                        null
                );
            }

            CtFor f = (CtFor) tp;
            transf.setTp(f);
            transf.setPosition(getJsonObject().getString(POSITION));
            addTransformation(transformations, transf);
        //} catch (JSONException e) {
        } catch (Exception e) {
            String s = "JsonAstReplaceInput::read Unable to parse replace transformation from json object";
            e.printStackTrace();
            throwError(getTransformationErrorString(transf, s), e, true);
        }

    }


    @Override
    protected Transformation build() {
        return new LoopFlip();
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
        return  (r[0].equals("replace") || r[0].equals("special"))
                && r[1].contains("loopflip");
    }
}