package fr.inria.diversify.ut.persistence.json;

import fr.inria.diversify.persistence.json.JsonASTReplaceSectionOutput;
import fr.inria.diversify.persistence.json.JsonASTSectionOutput;
import fr.inria.diversify.persistence.json.JsonSectionOutput;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


/**
 * Created by marodrig on 08/01/2015.
 */
public class JSONASTReplaceTest {

    private static final String TRANSFORMATIONS = "transformations";

    protected void writeAssertions(JsonSectionOutput d) throws JSONException {
        JSONObject tr = d.getOutputObject().getJSONArray(
                JsonASTSectionOutput.TRANSFORMATIONS).getJSONObject(0).getJSONObject("transplantationPoint");

        assertEquals(tr.get("position"), "org.class:1");
        assertEquals(tr.get("type"), "CtReturn");
        assertEquals(tr.get("sourcecode"), "return 0");

        tr = d.getOutputObject().getJSONArray(
                JsonASTSectionOutput.TRANSFORMATIONS).getJSONObject(0).getJSONObject("transplant");
        assertEquals(tr.get("position"), "org.class:1");
        assertEquals(tr.get("type"), "CtReturn");
        assertEquals(tr.get("sourcecode"), "return 0");
    }

    protected void writeOnlyAssertions(JsonSectionOutput d) throws JSONException {
        JSONArray array = d.getOutputObject().getJSONArray(JsonASTSectionOutput.TRANSFORMATIONS);
        assertEquals(3, array.length());
        assertTrue(array.getJSONObject(1).has("transplantationPoint"));
        assertFalse(array.getJSONObject(2).has("transplantationPoint"));
        assertFalse(array.getJSONObject(0).has("transplantationPoint"));
        assertTrue(array.getJSONObject(1).has("transplant"));
        assertFalse(array.getJSONObject(2).has("transplant"));
        assertFalse(array.getJSONObject(0).has("transplant"));
    }


    /**
     * Write Replace
     *
     * @throws org.json.JSONException
     */
    @Test
    public void testWrite() throws JSONException {
        JsonASTReplaceSectionOutput d = new JsonASTReplaceSectionOutput();
        d.setOutputObject(new JSONObject());
        ASTReplace r = new ASTReplace();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        r.setTransplant(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        d.write(Arrays.asList(new ASTTransformation[]{r}));
        writeAssertions(d);
    }

    /**
     * Write Replace transformations only
     *
     * @throws org.json.JSONException
     */
    @Test
    public void testWriteReplaceOnly() throws JSONException {
        JsonASTReplaceSectionOutput d = new JsonASTReplaceSectionOutput();
        d.setOutputObject(new JSONObject());
        ASTReplace r = new ASTReplace();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        r.setTransplant(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        d.write(Arrays.asList(new ASTTransformation[]{new ASTDelete(), r, new ASTAdd()}));
        writeOnlyAssertions(d);
    }
}
