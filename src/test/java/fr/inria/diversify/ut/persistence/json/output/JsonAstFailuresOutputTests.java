package fr.inria.diversify.ut.persistence.json.output;

import fr.inria.diversify.persistence.json.output.JsonASTReplaceOutput;
import fr.inria.diversify.persistence.json.output.JsonASTSectionOutput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.ut.FakeCodeFragment;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.list;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by marodrig on 09/01/2015.
 */
public class JsonAstFailuresOutputTests {

    private ASTReplace getExample(String param1, String param2) {
        ASTReplace r = new ASTReplace();
        r.setTransplant(new FakeCodeFragment("myOrg.pos:1", "CtTest", "test"));
        r.setTransplantationPoint(new FakeCodeFragment("myOrg.pos:1", "CtTest", "test"));
        r.setFailures(list(param1, param2));
        return r;
    }

    @Test
    public void testFailureWrite() throws JSONException {
        JsonASTReplaceOutput sectionOutput = new JsonASTReplaceOutput();
        sectionOutput.setOutputObject(new JSONObject());

        ASTReplace r = getExample("Failure 1", "Failure 2");
        ASTReplace r2 = getExample("Failure 3", "Failure 2");
        for (Transformation t : list(r, r2)) sectionOutput.store(t);
        sectionOutput.storeMetaData();

        JSONObject d = sectionOutput.getOutputObject();
        assertTrue(d.has(JsonASTSectionOutput.FAILURES_DICTIONARY));

        JSONObject fails = d.getJSONObject(JsonASTSectionOutput.FAILURES_DICTIONARY);
        assertEquals(fails.get("Failure 1"), 0);
        assertEquals(fails.get("Failure 2"), 1);
        assertEquals(fails.get("Failure 3"), 2);
        assertEquals(fails.length(), 3);

        JSONArray array = d.getJSONArray(JsonASTSectionOutput.TRANSFORMATIONS);
        assertEquals(array.getJSONObject(0).getJSONArray(JsonASTSectionOutput.FAILURES).get(0), 0);
        assertEquals(array.getJSONObject(0).getJSONArray(JsonASTSectionOutput.FAILURES).get(1), 1);
        assertEquals(array.getJSONObject(1).getJSONArray(JsonASTSectionOutput.FAILURES).get(0), 2);
        assertEquals(array.getJSONObject(1).getJSONArray(JsonASTSectionOutput.FAILURES).get(1), 1);
    }
}
