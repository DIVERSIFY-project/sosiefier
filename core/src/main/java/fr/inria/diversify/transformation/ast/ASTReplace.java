package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.InputContext;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.reference.CtVariableReference;

import java.util.Map;

/**
 * AST transform to perform a replace
 * <p/>
 * User: Simon
 * Date: 7/11/13
 * Time: 4:42 PM
 */
public class ASTReplace extends ASTTransformation {

    /**
     * Transplant code fragment, i.e. the code that is going to be inserted
     */
    private CodeFragment transplant;

    /**
     * Map to perform variable mapping. See article:
     */
    protected Map<String, String> variableMapping;

    /**
     * Transplant code fragment, i.e. the code that is going to be inserted
     */
    public CodeFragment getTransplant() {
        return transplant;
    }

    public void setTransplant(CodeFragment transplant) {
        this.transplant = transplant;
    }

    public boolean setCodeFragmentToReplace(CodeFragment replace) {
        this.setTransplant(replace);
        return true;
    }

    public void setVarMapping(Map<String, String> mapping) {
        variableMapping = mapping;
    }

    public Map<String, String> getVarMapping() {
        return variableMapping;
    }

    public ASTReplace() {
        name = "replace";
        type = "adrStmt";
    }

    protected void applyInfo() {
        Log.debug("transformation: {}, {}", type, name);
        Log.debug("transplantation point:\n{}", transplantationPoint);
        Log.debug("{}", transplantationPoint.getCtCodeFragment().getPosition());
        Log.debug("{}", transplantationPoint.getCodeFragmentType());
        Log.debug("replace by: ({})\n{}", getTransplant().getCodeFragmentType(), getTransplant());
    }

    protected CtCodeElement buildReplacementElement() {
        try {
            CodeFragment stmt = transplant.clone();
            if (withVarMapping()) {
                if (variableMapping == null) {
                    variableMapping = transplantationPoint.randomVariableMapping(getTransplant(), subType);
                }
                Log.debug("random variable mapping: {}", variableMapping);
                stmt.replaceVar(transplantationPoint, variableMapping);
                if (stmt.codeFragmentString().equals(transplantationPoint.codeFragmentString())) {
                    throw new BuildTransplantException("same statment");
                }
            }
            return stmt.getCtCodeFragment();
        } catch (Exception e) {
            throw new RuntimeException(new BuildTransplantException("", e));
        }
    }

    protected boolean withVarMapping() {
        //todo a remplacer par un attribut
        return name.equals("replace");
    }


    public int hashCode() {
        return super.hashCode() * getTransplant().getCompilationUnit().hashCode() *
                getTransplant().getStartLine() * transplantationPoint.getCompilationUnit().hashCode() * transplantationPoint.getStartLine();
    }


    public boolean equals(Object other) {
        if (other == null)
            return false;
        if (!this.getClass().isAssignableFrom(other.getClass()))
            return false;
        ASTReplace otherReplace = (ASTReplace) other;
        if (!equalParent(otherReplace.parent))
            return false;

        return status == otherReplace.status &&
                failures.equals(otherReplace.failures) &&
                (variableMapping == null || variableMapping.equals(otherReplace.variableMapping)) &&
                transplantationPoint.getCtCodeFragment().getPosition().equals(otherReplace.transplantationPoint.getCtCodeFragment().getPosition()) &&
                getTransplant().getCtCodeFragment().getPosition().equals(otherReplace.getTransplant().getCtCodeFragment().getPosition());
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();

        object.put("transplantationPoint", transplantationPoint.toJSONObject());
        object.put("transplant", getTransplant().toJSONObject());
        object.put("variableMapping", variableMapping);

        return object;
    }

    @Override
    public String toString() {
        String ret = new String();

        ret = ret + "transplantationPoint: " + transplantationPoint.toString() + "\n" +
                type + ": " + getTransplant().toString() + "\n" +
                "varMapping: " + variableMapping + "\n";

        return ret;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean usedOfSubType() {
        //return variableMapping.entrySet().stream()
        //        .anyMatch(var -> {
        //            CtVariableReference variable = tpInputContext.getVariableOrFieldNamed(var.getKey());
        //           CtVariableReference candidate = tInputContext.getVariableOrFieldNamed(var.getValue());
        //            return !variable.getType().equals(candidate.getType());
        //        });
        InputContext tpInputContext = transplant.getContext().getInputContext();
        InputContext tInputContext = transplantationPoint.getContext().getInputContext();
        for (Map.Entry<String, String> var : variableMapping.entrySet()) {
            CtVariableReference variable = tpInputContext.getVariableOrFieldNamed(var.getKey());
            CtVariableReference candidate = tInputContext.getVariableOrFieldNamed(var.getValue());
            if (!variable.getType().equals(candidate.getType())) return true;
        }
        return false;
    }

    public void updateStatementList() {
        getInputProgram().getCodeFragments().remove(transplantationPoint);
    }
}
