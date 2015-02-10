package fr.inria.diversify.ut.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.json.input.JsonAstAddInput;
import fr.inria.diversify.persistence.json.input.JsonAstDeleteInput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.ut.MockInputProgram;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.*;
import static fr.inria.diversify.ut.json.SectionTestUtils.createAddASTTransformationJSON;
import static fr.inria.diversify.ut.json.SectionTestUtils.createDeleteASTTransformationJSON;
import static fr.inria.diversify.ut.json.input.JsonAstReplaceInputTest.testErrors;
import static org.junit.Assert.*;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstDeleteInputTest {

    /**
     * Test that something goes wrong and it reports it right
     */
    @Test
    public void testWithErrors_UnableToFindCodeFragment() throws JSONException {
        String error1 = "ERROR  : Transf 1. Unable to find code fragment \"return 0\" at \"org.MyClass:200\". ";
        JSONObject o = createDeleteASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0);
        o.getJSONObject(TRANSPLANT_POINT).put(POSITION, "org.MyClass:200");
        assertEquals(error1, testErrors(new JsonAstDeleteInput(null, o), o, 1, 0).get(0));

        error1 = "ERROR  : Transf 1. Unable to find code fragment \"fullyDifferent()\" at \"org.MyClass:1\". ";
        o = createDeleteASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0);
        o.getJSONObject(TRANSPLANT_POINT).put(SOURCE_CODE, "fullyDifferent()");
        assertEquals(error1, testErrors(new JsonAstDeleteInput(null, o), o, 1, 0).get(0));
    }

    @Test
    public void testWithErrors_MismatchCF() throws JSONException {

        String error1 = "WARNING: Transf 1. Position mismatch -> Storage: " +
                "\"org.MyClass:2\"; Found: \"org.MyClass:1\". ";
        String error2 = "WARNING: Transf 1. Source mismatch -> Storage: \"return   0\"; Found: \"return 0\". ";

        JSONObject o = createDeleteASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0);
        o.getJSONObject(TRANSPLANT_POINT).put(POSITION, "org.MyClass:2");
        assertEquals(error1,testErrors(new JsonAstDeleteInput(null, o), o, 1, 1).get(0));

        o = createDeleteASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0);
        o.getJSONObject(TRANSPLANT_POINT).put(SOURCE_CODE, "return   0");
        assertEquals(error2, testErrors(new JsonAstDeleteInput(null, o), o, 1, 1).get(0));

        o = createDeleteASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0);
        o.getJSONObject(TRANSPLANT_POINT).put(SOURCE_CODE, "return   0");
        o.getJSONObject(TRANSPLANT_POINT).put(POSITION, "org.MyClass:2");
        List<String> errors = testErrors(new JsonAstDeleteInput(null, o), o, 2, 1);
        assertEquals(error1, errors.get(0));
        assertEquals(error2, errors.get(1));
    }

    /**
     * Test the reading of a transformation
     */
    @Test
    public void testReadDeleteTransformation() throws JSONException {
        InputProgram p = new MockInputProgram();
        JSONObject o = createDeleteASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0);
        HashMap<Integer, Transformation> result = new HashMap<>();

        JsonAstDeleteInput reader = new JsonAstDeleteInput(p, o);
        reader.read(result);

        ASTDelete delete = (ASTDelete)result.get(1);
        assertEquals(1, delete.getIndex());
        assertEquals(-1, delete.getStatus());
        assertEquals(1, result.size());
        assertEquals(p.getCodeFragments().get(0), delete.getTransplantationPoint());
    }
    @Test
    public void testCanHandleSection() {
        JsonAstDeleteInput reader = new JsonAstDeleteInput(new InputProgram(), new JSONObject());
        assertTrue(reader.canRead(TRANSFORMATIONS + ".delete"));
        assertFalse(reader.canRead(TRANSFORMATIONS + ".addWitgestein"));
        assertFalse(reader.canRead(TRANSFORMATIONS + ".replaceWitgestein"));
    }

}
