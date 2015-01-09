package fr.inria.diversify.ut.persistence.json;

import fr.inria.diversify.persistence.json.JsonASTAddSectionOutput;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


/**
 * Created by marodrig on 08/01/2015.
 */
public class JSONASTAddTest {

    private static final String TRANSFORMATIONS = "transformations";

    /**
     * Test that creates a "transformation" inside the global object
     */
    @Test
    public void testWriteEmpty() {
        SectionTestUtils.doTestWriteEmpty(new JsonASTAddSectionOutput());
    }

    /**
     * Write Replace
     *
     * @throws org.json.JSONException
     */
    @Test
    public void testWrite() throws JSONException {
        JsonASTAddSectionOutput d = new JsonASTAddSectionOutput();
        d.setOutputObject(new JSONObject());
        ASTAdd r = new ASTAdd();
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
    public void testWriteAddOnly() throws JSONException {
        JsonASTAddSectionOutput d = new JsonASTAddSectionOutput();
        d.setOutputObject(new JSONObject());
        ASTAdd r = new ASTAdd();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        r.setTransplant(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        d.write(Arrays.asList(new ASTTransformation[]{new ASTDelete(), r, new ASTReplace()}));
        SectionTestUtils.writeOnlyAssertions(d);
    }
}
