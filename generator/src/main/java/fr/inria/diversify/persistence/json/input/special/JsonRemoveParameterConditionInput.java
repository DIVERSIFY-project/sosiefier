package fr.inria.diversify.persistence.json.input.special;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.json.input.JsonTransformationInput;
import fr.inria.diversify.persistence.json.output.JsonSectionOutput;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.RemoveParameterCondition;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.factory.Factory;

import java.util.Map;
import java.util.UUID;

/**
 * User: Simon
 * Date: 06/06/16
 * Time: 11:16
 */
public class JsonRemoveParameterConditionInput extends JsonTransformationInput {

    public JsonRemoveParameterConditionInput(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    protected Transformation build() {
        return new RemoveParameterCondition();
    }

    @Override
    public void read(Map<UUID, Transformation> transformations) {
        RemoveParameterCondition transf = null;
        try {
            transf = (RemoveParameterCondition) get(transformations); //add the transformation to the transformations map if not present

            JSONObject tpJson = getJsonObject().getJSONObject(JsonSectionOutput.TRANSPLANT_POINT);

            CtIf tp = getInputProgram().findElement(CtIf.class,
                    tpJson.getString(JsonSectionOutput.POSITION),
                    tpJson.getString(JsonSectionOutput.SOURCE_CODE));
            transf.setTransplantationPoint(tp);
            transf.setTransplant(getReplaceStmt(tp));

            addFailuresToTransformation(transf);

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
        return  r[0].equals("special")
                && r[1].contains("removeParameterCondition");
    }

    protected CtIf getReplaceStmt(CtIf stmt) {
        Factory factory = getInputProgram().getFactory();
        CtIf clone = factory.Core().clone(stmt);

        if(stmt.getElseStatement() == null) {
            clone.setCondition(factory.Code().createLiteral(false));
        } else {
            if(containsOnlyReturn(stmt.getThenStatement())) {
                clone.setCondition(factory.Code().createLiteral(false));
            } else {
                clone.setCondition(factory.Code().createLiteral(true));
            }
        }
        return clone;
    }

    protected boolean containsOnlyReturn(CtStatement stmt) {
        if(stmt instanceof CtStatementList) {
            CtStatementList list = (CtStatementList) stmt;
            return list.getStatements().size() == 1 && list.getStatements().get(0) instanceof CtReturn;
        } else {
            return stmt instanceof CtReturn;
        }
    }

}
