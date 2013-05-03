package fr.inria.diversify.replace;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 11:05 AM
 */
public class Transformation {
    protected JSONObject stmtToReplace;
    protected JSONObject stmtReplacedBy;
    protected Map<String,String> variableMapping;
    protected Result junitResult;



    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("StatementToReplace", stmtToReplace);
        object.put("StatementReplacedBy", stmtReplacedBy);
        object.put("VariableMapping", variableMapping);

        List<String> failures = new ArrayList<String>();
        for(Failure failure: junitResult.getFailures())
            failures.add(failure.getDescription().getTestClass().getName()+":"+failure.getDescription().getMethodName());

        object.put("Failures", failures);

        return object;
    }

    public void setStatementToReplace(JSONObject jsonObject) {
        stmtToReplace = jsonObject;
    }

    public void setStatementReplacedBy(JSONObject jsonObject) {
        stmtReplacedBy = jsonObject;
    }

    public void setVariableMapping(Map<String, String> varMapping) {
        variableMapping = varMapping;
    }

    public void setJUnitResult(Result result) {
        junitResult = result;
    }
}
