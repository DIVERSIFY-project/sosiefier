package fr.inria.diversify.ut.json.output;

import fr.inria.diversify.persistence.json.output.JsonFailuresOutput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.ut.json.SectionTestUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;

import static fr.inria.diversify.ut.json.SectionTestUtils.list;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by marodrig on 09/01/2015.
 */
public class JsonAstFailuresOutputTests {

    @Test
    public void testEmptyFailureWrite() throws JSONException {
        JsonFailuresOutput sectionOutput = new JsonFailuresOutput();
        sectionOutput.setTransformations(new ArrayList<Transformation>());
        sectionOutput.write(new JSONObject());

        JSONObject d = sectionOutput.getOutputObject();
        assertTrue(d.has(JsonFailuresOutput.FAILURES_DICTIONARY));
    }

    /**
     * Test the proper creation of the failure dictionary
     * @throws JSONException
     */
    @Test
    public void testFailureWrite() throws JSONException {
        ASTReplace r = SectionTestUtils.getExample("Failure 1", "Failure 2");
        ASTReplace r2 = SectionTestUtils.getExample("Failure 3", "Failure 2");

        JsonFailuresOutput sectionOutput = new JsonFailuresOutput();
        sectionOutput.setTransformations(list(r, r2));
        sectionOutput.write(new JSONObject());

        JSONObject d = sectionOutput.getOutputObject();
        assertTrue(d.has(JsonFailuresOutput.FAILURES_DICTIONARY));

        JSONObject fails = d.getJSONObject(JsonFailuresOutput.FAILURES_DICTIONARY);
        assertEquals(fails.get("Failure 1"), 0);
        assertEquals(fails.get("Failure 2"), 1);
        assertEquals(fails.get("Failure 3"), 2);
        assertEquals(fails.length(), 3);
    }
}
