package fr.inria.diversify.ut.persistence.json.output;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.json.output.JsonAstDeleteOutput;
import fr.inria.diversify.persistence.json.output.JsonAstReplaceOutput;
import fr.inria.diversify.persistence.json.output.JsonAstTransformationOutput;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.ut.FakeCodeFragment;
import fr.inria.diversify.ut.persistence.json.SectionTestUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSPLANT;
import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.list;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSPLANT_POINT;

/**
 * Created by marodrig on 08/01/2015.
 */
public class JsonAstDeleteOutputTest {

    /**
     * Test that creates a "transformation" inside the global object
     */
    @Test(expected = PersistenceException.class)
    public void testWriteEmpty() {
        SectionTestUtils.doTestWriteEmpty(new JsonAstDeleteOutput(), new ASTDelete());
    }

    /**
     * Write Delete
     *
     * @throws JSONException
     */
    @Test
    public void testWrite() throws JSONException {
        ASTDelete r = new ASTDelete();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));

        JsonAstDeleteOutput d = new JsonAstDeleteOutput();
        d.setTransformations(list(r));
        d.write(new JSONObject());
        JSONObject tr = d.getOutputObject().getJSONArray(
                JsonAstTransformationOutput.TRANSFORMATIONS).getJSONObject(0).getJSONObject(TRANSPLANT_POINT);

        assertEquals(tr.get("position"), "org.class:1");
        assertEquals(tr.get("type"), "CtReturn");
        assertEquals(tr.get("sourcecode"), "return 0");
    }

    /**
     * Write Delete transformations only
     *
     * @throws JSONException
     */
    @Test
    public void testWriteDeleteOnly() throws JSONException {
        ASTDelete r = new ASTDelete();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));

        JsonAstDeleteOutput d = new JsonAstDeleteOutput();
        d.setTransformations(list(new ASTReplace(), r, new ASTAdd()));
        d.write(new JSONObject());

        JSONArray array = d.getOutputObject().getJSONArray(JsonAstTransformationOutput.TRANSFORMATIONS);
        assertEquals(1, array.length());
        assertTrue(array.getJSONObject(0).has(TRANSPLANT_POINT));
        assertFalse(array.getJSONObject(0).has(TRANSPLANT));
    }

    /**
     * Test failure writing
     * @throws JSONException
     */
    @Test
    public void testFailureWrite() throws JSONException {
        SectionTestUtils.testFailureWrite(new JsonAstReplaceOutput());
    }
}
