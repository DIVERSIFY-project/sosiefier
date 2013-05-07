package fr.inria.diversify.replace;

import fr.inria.diversify.codeFragment.CodeFragment;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import spoon.reflect.declaration.CtSimpleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 11:05 AM
 */
public class Transformation {
    protected CodeFragment stmtToReplace;
    protected CodeFragment stmtReplacedBy;
    protected Map<String,String> variableMapping;
    protected List<String> failures;



    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("StatementToReplace", stmtToReplace.toJSONObject());
        object.put("StatementReplacedBy", stmtReplacedBy.toJSONObject());
        object.put("VariableMapping", variableMapping);

        object.put("Failures", failures);

        return object;
    }

    public void setStatementToReplace(CodeFragment jsonObject) {
        stmtToReplace = jsonObject;
    }

    public void setStatementReplacedBy(CodeFragment jsonObject) {
        stmtReplacedBy = jsonObject;
    }

    public void setVariableMapping(Map<String, String> varMapping) {
        variableMapping = varMapping;
    }

    public void setJUnitResult(Result result) {
         failures = new ArrayList<String>();
         for(Failure failure: result.getFailures())
            failures.add(failure.getDescription().getTestClass().getName()+":"+failure.getDescription().getMethodName());
    }

    public CtSimpleType getSourceClass() {
        return stmtToReplace.getSourceClass();
    }

    public Class geCodeFragmentType() {
        return stmtToReplace.getCodeFragmentType();
    }

    public int numberOfFailure() {
        return failures.size();
    }
}
