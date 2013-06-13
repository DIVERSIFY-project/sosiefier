package fr.inria.diversify.replace;

import fr.inria.diversify.codeFragment.CodeFragment;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.declaration.CtSimpleType;

import java.util.Map;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 11:05 AM
 */
public class Transformation {
    protected CodeFragment toReplace;
    protected CodeFragment replacedBy;
    protected Map<String, String> variableMapping;
    protected Integer failures;


    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("StatementToReplace", toReplace.toJSONObject());
        object.put("StatementReplacedBy", replacedBy.toJSONObject());
        object.put("VariableMapping", variableMapping);
        object.put("allTestRun", (failures != null));
        object.put("Failures", failures);

        return object;
    }

    public void setStatementToReplace(CodeFragment jsonObject) {
        toReplace = jsonObject;
    }

    public void setStatementReplacedBy(CodeFragment jsonObject) {
        replacedBy = jsonObject;
    }

    public void setVariableMapping(Map<String, String> varMapping) {
        variableMapping = varMapping;
    }

    public void setJUnitResult(Integer result) {
        failures = result;
    }

    public CtSimpleType getSourceClass() {
        return toReplace.getSourceClass();
    }

    public Class geCodeFragmentType() {
        return toReplace.getCodeFragmentType();
    }

    public int numberOfFailure() {
        return failures;
    }

    public CodeFragment getToReplace() {
        return toReplace;
    }
    public CodeFragment getReplaceBy() {
        return replacedBy;
    }

    @Override
    public boolean equals(Object o) {
        if(o.getClass() != this.getClass())
            return false;
        Transformation t = (Transformation)o;

        return toReplace.getCtCodeFragment().getPosition().equals(t.toReplace.getCtCodeFragment().getPosition())
                && replacedBy.id() == t.replacedBy.id() && variableMapping.equals(t.variableMapping);
    }

    @Override
    public int hashCode() {
        return toReplace.id() * toReplace.getCtCodeFragment().getPosition().hashCode() +replacedBy.id() + variableMapping.hashCode();
    }
}
