package fr.inria.diversify.ut.persistence.json.output;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.json.output.JsonAstReplaceOutput;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.ut.FakeCodeFragment;
import fr.inria.diversify.ut.persistence.json.SectionTestUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.list;
import static org.junit.Assert.assertEquals;


/**
 * Created by marodrig on 08/01/2015.
 */
public class JsonAstReplaceOutputTest {

    private static final String TRANSFORMATIONS = "transformations";

    /**
     * Test that creates a "transformation" inside the global object
     */
    @Test(expected = PersistenceException.class)
    public void testWriteEmpty() {
        SectionTestUtils.doTestWriteEmpty(new JsonAstReplaceOutput(), new ASTReplace());
    }


    /**
     * Write Replace
     *
     * @throws org.json.JSONException
     */
    @Test
    public void testWrite() throws JSONException {
        ASTReplace r = new ASTReplace();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        r.setTransplant(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));

        JsonAstReplaceOutput d = new JsonAstReplaceOutput();
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
    public void testWriteReplaceOnly() throws JSONException {
        ASTReplace r = new ASTReplace();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        r.setTransplant(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));

        JsonAstReplaceOutput d = new JsonAstReplaceOutput();
        d.setTransformations(list(new ASTDelete(), r, new ASTAdd()));
        d.write(new JSONObject());

        SectionTestUtils.writeOnlyAssertions(d);
    }
}
