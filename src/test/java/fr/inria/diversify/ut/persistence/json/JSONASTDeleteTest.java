package fr.inria.diversify.ut.persistence.json;

import fr.inria.diversify.persistence.json.output.JsonASTDeleteSectionOutput;
import fr.inria.diversify.persistence.json.JsonASTSectionOutput;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by marodrig on 08/01/2015.
 */
public class JSONASTDeleteTest {

    /**
     * Test that creates a "transformation" inside the global object
     */
    @Test
    public void testWriteEmpty() {
        SectionTestUtils.doTestWriteEmpty(new JsonASTDeleteSectionOutput());
    }

    /**
     * Write Delete
     *
     * @throws JSONException
     */
    @Test
    public void testWrite() throws JSONException {
        JsonASTDeleteSectionOutput d = new JsonASTDeleteSectionOutput();
        d.setOutputObject(new JSONObject());
        ASTDelete r = new ASTDelete();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        d.write(Arrays.asList(new ASTTransformation[]{r}));

        JSONObject tr = d.getOutputObject().getJSONArray(
                JsonASTSectionOutput.TRANSFORMATIONS).getJSONObject(0).getJSONObject("transplantationPoint");

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
        JsonASTDeleteSectionOutput d = new JsonASTDeleteSectionOutput();
        d.setOutputObject(new JSONObject());
        ASTDelete r = new ASTDelete();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        d.write(Arrays.asList(new ASTTransformation[]{new ASTReplace(), r, new ASTAdd()}));
        JSONArray array = d.getOutputObject().getJSONArray(JsonASTSectionOutput.TRANSFORMATIONS);
        assertEquals(3, array.length());
        assertTrue(array.getJSONObject(1).has("transplantationPoint"));
        assertFalse(array.getJSONObject(2).has("transplantationPoint"));
        assertFalse(array.getJSONObject(0).has("transplantationPoint"));
    }
}
