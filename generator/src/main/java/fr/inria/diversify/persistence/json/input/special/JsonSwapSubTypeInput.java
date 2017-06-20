package fr.inria.diversify.persistence.json.input.special;

import fr.inria.diversify.persistence.json.input.JsonAstReplaceInput;
import fr.inria.diversify.persistence.json.output.JsonSectionOutput;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.AddMethodInvocation;
import fr.inria.diversify.transformation.LoopFlip;
import fr.inria.diversify.transformation.SwapSubType;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.*;
import spoon.support.reflect.code.CtCodeSnippetExpressionImpl;

import java.util.Map;
import java.util.UUID;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.POSITION;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.SOURCE_CODE;

/**
 * Created by nharrand on 31/05/17.
 */
public class JsonSwapSubTypeInput extends JsonAstReplaceInput {

    public JsonSwapSubTypeInput(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    public void read(Map<UUID, Transformation> transformations) {
        SwapSubType transf = null;
        try {
            transf = (SwapSubType) get(transformations); //add the transformation to the transformations map if not present
            JSONObject cfJson = getJsonObject().getJSONObject(JsonSectionOutput.TRANSPLANT_POINT);


            CtStatement tp = getInputProgram().findElement(
                    Class.forName(cfJson.getString("type")),
                    cfJson.getString(POSITION),
                    cfJson.getString(SOURCE_CODE)
            );

            CtConstructorCall f = (CtConstructorCall) tp;

            CtExpression exp = f.getFactory().Code().createCodeSnippetExpression(getJsonObject().getString("newCall"));
            //CtConstructorCall newCall = (CtConstructorCall) ((CtCodeSnippetExpressionImpl) exp).compile();
            transf.setTpAndNewCall(f,(CtCodeSnippetExpression) exp);
            addTransformation(transformations, transf);
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            String s = "JsonAstReplaceInput::read Unable to parse replace transformation from json object";
            e.printStackTrace();
            throwError(getTransformationErrorString(transf, s), e, true);
        }

    }


    @Override
    protected Transformation build() {
        return new SwapSubType();
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
                && r[1].contains("swapSubType");
    }
}
