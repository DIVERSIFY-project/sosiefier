package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.InputContext;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtVariableReference;

import java.util.Map;

/**
 * Transformation that adds AST nodes
 *
 * User: Simon
 * Date: 7/11/13
 * Time: 4:33 PM
 */
public class ASTAdd extends ASTTransformation {
    protected CodeFragment transplant;
    protected Map<String, String> variableMapping;


    public ASTAdd() {
        name = "add";
        type = "adrStmt";
    }


    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();

        object.put("transplantationPoint", transplantationPoint.toJSONObject());
        object.put("transplant", transplant.toJSONObject());
        object.put("variableMapping", variableMapping);

        return object;
    }

    protected void applyInfo() {
        Log.debug("transformation: {}, {}", type, name);
        Log.debug("transplantation point:\n{}", transplantationPoint);
        Log.debug("{}", transplantationPoint.getCtCodeFragment().getPosition());
        Log.debug("{}", transplantationPoint.getCodeFragmentType());
        Log.debug("transplant: ({})\n{}", getTransplant().getCodeFragmentType(), getTransplant());
    }

    protected CtCodeElement buildCopyTransplant() throws BuildTransplantException {
        try {
            CodeFragment stmtToAdd = transplant.clone();
            if (withVarMapping()) {
                if (variableMapping == null) variableMapping = transplantationPoint.randomVariableMapping(getTransplant(), subType);

                Log.debug("random variable mapping: {}", variableMapping);
                stmtToAdd.replaceVar(transplantationPoint, variableMapping);
            }

            Factory factory = transplantationPoint.getCtCodeFragment().getFactory();

            CtIf stmtIf = factory.Core().createIf();
            stmtIf.setParent(transplantationPoint.getCtCodeFragment().getParent());

            stmtIf.setCondition(factory.Code().createLiteral(true));

            CtBlock body = factory.Core().createBlock();
            stmtIf.setThenStatement(body);
            CtStatement tmp = (CtStatement) factory.Core().clone(transplantationPoint.getCtCodeFragment());

            tmp.setParent(stmtIf);
            body.addStatement(tmp);

            stmtToAdd.getCtCodeFragment().setParent(stmtIf);
            body.addStatement((CtStatement) factory.Core().clone(stmtToAdd.getCtCodeFragment()));
            return stmtIf;
        } catch (Exception e) {
            throw new BuildTransplantException("", e);
        }
    }


    public  int hashCode() {
        return super.hashCode() * transplant.getCompilationUnit().hashCode() *
                transplant.getStartLine() * transplantationPoint.getCompilationUnit().hashCode() * transplantationPoint.getStartLine();
    }

    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;
        ASTAdd otherASTAdd = (ASTAdd)other;

        if(!equalParent(otherASTAdd.parent))
            return false;

        return status == otherASTAdd.status &&
                name.equals(otherASTAdd.name) &&
                ((failures == otherASTAdd.failures) || failures.equals(otherASTAdd.failures)) &&
                ((variableMapping == otherASTAdd.variableMapping) || variableMapping.equals(otherASTAdd.variableMapping)) &&
                transplantationPoint.getCtCodeFragment().equals(otherASTAdd.transplantationPoint.getCtCodeFragment()) &&
                transplant.getCtCodeFragment().getPosition().equals(otherASTAdd.transplant.getCtCodeFragment().getPosition());
    }

    @Override
    public String toString() {
        String ret = new String();

        ret = ret + "transplantationPoint: "+ transplantationPoint.toString()+"\n" +
                "varMapping: "+variableMapping+"\n";

        return ret;
    }

    public CodeFragment getTransplant() {
        return transplant;
    }

    public boolean usedOfSubType() {
        InputContext tpInputContext = transplant.getContext().getInputContext();
        InputContext tInputContext = transplantationPoint.getContext().getInputContext();
        for(Map.Entry<String, String> var : variableMapping.entrySet()) {
            CtVariableReference variable = tpInputContext.getVariableOrFieldNamed(var.getKey());
            CtVariableReference candidate = tInputContext.getVariableOrFieldNamed(var.getValue());

            if(!variable.getType().equals(candidate.getType())) {
                return true;
            }
        }
        return false;
    }

    public void updateStatementList() {}

    protected boolean withVarMapping() {
        return name.equals("add");
    }

    public void setVarMapping(Map<String, String> mapping) {
        variableMapping = mapping;
    }

    public Map<String, String> getVarMapping() {
        return variableMapping;
    }

    public void setTransplant(CodeFragment add) {
        this.transplant = add;
    }
}
