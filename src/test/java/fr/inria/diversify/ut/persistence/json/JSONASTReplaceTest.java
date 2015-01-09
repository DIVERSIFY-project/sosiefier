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

    /**
     * Test that creates a "transformation" inside the global object
     */
    @Test
    public void testWriteEmpty() {
        SectionTestUtils.doTestWriteEmpty(new JsonASTReplaceSectionOutput());
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
        SectionTestUtils.writeAssertions(d);
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
        SectionTestUtils.writeOnlyAssertions(d);
    }
}
