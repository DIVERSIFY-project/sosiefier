package fr.inria.diversify.ut.persistence.json.output;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.json.output.JsonASTAddOutput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.ut.FakeCodeFragment;
import fr.inria.diversify.ut.persistence.json.SectionTestUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;

import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.list;


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
        SectionTestUtils.doTestWriteEmpty(new JsonASTAddOutput(), new ASTAdd());
    }

    /**
     * Write Replace
     *
     * @throws org.json.JSONException
     */
    @Test
    public void testWrite() throws JSONException {
        JsonASTAddOutput d = new JsonASTAddOutput();
        d.setOutputObject(new JSONObject());
        ASTAdd r = new ASTAdd();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        r.setTransplant(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        d.before(new ArrayList<>());
        d.store(r);
        SectionTestUtils.writeAssertions(d);
    }

    /**
     * Write Replace transformations only
     *
     * @throws org.json.JSONException
     */
    @Test
    public void testWriteAddOnly() throws JSONException {
        JsonASTAddOutput d = new JsonASTAddOutput();
        d.setOutputObject(new JSONObject());
        ASTAdd r = new ASTAdd();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        r.setTransplant(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        d.before(new ArrayList<>());
        for (Transformation t : list(new ASTDelete(), r, new ASTReplace())) d.store(t);
        SectionTestUtils.writeOnlyAssertions(d);
    }
}
