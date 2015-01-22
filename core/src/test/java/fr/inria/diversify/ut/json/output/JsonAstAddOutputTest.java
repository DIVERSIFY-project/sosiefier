package fr.inria.diversify.ut.json.output;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.json.output.JsonAstAddOutput;
import fr.inria.diversify.persistence.json.output.JsonAstReplaceOutput;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.ut.FakeCodeFragment;
import fr.inria.diversify.ut.json.SectionTestUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import static fr.inria.diversify.ut.json.SectionTestUtils.list;


/**
 * Created by marodrig on 08/01/2015.
 */
public class JsonAstAddOutputTest {

    private static final String TRANSFORMATIONS = "transformations";

    /**
     * Test that creates a "transformation" inside the global object
     */
    @Test(expected = PersistenceException.class)
    public void testWriteEmpty() {
        SectionTestUtils.doTestWriteEmpty(new JsonAstAddOutput(), new ASTAdd());
    }

    /**
     * Write Replace
     *
     * @throws org.json.JSONException
     */
    @Test
    public void testWrite() throws JSONException {
        ASTAdd r = new ASTAdd();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        r.setTransplant(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));

        JsonAstAddOutput d = new JsonAstAddOutput();
        d.setTransformations(list(r));
        d.write(new JSONObject());
        SectionTestUtils.writeAssertions(d);
    }

    /**
     * Write Replace transformations only
     *
     * @throws org.json.JSONException
     */
    @Test
    public void testWriteAddOnly() throws JSONException {
        ASTAdd r = new ASTAdd();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        r.setTransplant(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));

        JsonAstAddOutput d = new JsonAstAddOutput();
        d.setTransformations(list(new ASTDelete(), r, new ASTReplace()));
        d.write(new JSONObject());
        SectionTestUtils.writeOnlyAssertions(d);
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
