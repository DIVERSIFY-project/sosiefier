package fr.inria.diversify.ut.persistence.json;

import fr.inria.diversify.persistence.json.output.JsonASTFailuresSectionOutput;
import fr.inria.diversify.persistence.json.JsonASTSectionOutput;
import fr.inria.diversify.transformation.ast.ASTReplace;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.doTestWriteEmpty;
import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.list;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by marodrig on 09/01/2015.
 */
public class JSONASTFailuresTests {

    @Test
    public void testWriteEmpty() {
        doTestWriteEmpty(new JsonASTFailuresSectionOutput());
    }

    @Test
    public void testFailureWrite() throws JSONException {
        JsonASTFailuresSectionOutput sectionOutput = new JsonASTFailuresSectionOutput();
        sectionOutput.setOutputObject(new JSONObject());

        ASTReplace r = new ASTReplace();
        r.setFailures(list("Failure 1", "Failure 2"));
        ASTReplace r2 = new ASTReplace();
        r2.setFailures(list("Failure 3", "Failure 2"));

        sectionOutput.write(list(r, r2));

        JSONObject d = sectionOutput.getOutputObject();
        assertTrue(d.has(JsonASTFailuresSectionOutput.FAILURES_DICTIONARY));

        JSONObject fails = d.getJSONObject(JsonASTFailuresSectionOutput.FAILURES_DICTIONARY);
        assertEquals(fails.get("Failure 1"), 0);
        assertEquals(fails.get("Failure 2"), 1);
        assertEquals(fails.get("Failure 3"), 2);
        assertEquals(fails.length(), 3);

        JSONArray array = d.getJSONArray(JsonASTSectionOutput.TRANSFORMATIONS);
        assertEquals(array.getJSONObject(0).getJSONArray(JsonASTFailuresSectionOutput.FAILURES).get(0), 0);
        assertEquals(array.getJSONObject(0).getJSONArray(JsonASTFailuresSectionOutput.FAILURES).get(1), 1);
        assertEquals(array.getJSONObject(1).getJSONArray(JsonASTFailuresSectionOutput.FAILURES).get(0), 2);
        assertEquals(array.getJSONObject(1).getJSONArray(JsonASTFailuresSectionOutput.FAILURES).get(1), 1);

    }

}
