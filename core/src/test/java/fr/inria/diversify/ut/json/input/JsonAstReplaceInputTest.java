package fr.inria.diversify.ut.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.json.input.JsonAstReplaceInput;
import fr.inria.diversify.persistence.json.input.JsonSectionInput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.ut.MockInputProgram;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.*;
import static fr.inria.diversify.ut.json.SectionTestUtils.TEST_ID_1;
import static fr.inria.diversify.ut.json.SectionTestUtils.createReplaceASTTransformationJSON;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstReplaceInputTest {


    /**
     * Test the reading of a transformation
     */
    @Test
    public void testReadReplaceTransformation() throws JSONException {
        InputProgram p = new MockInputProgram();
        //Create json replace
        JSONObject o = createReplaceASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0);

        JsonAstReplaceInput reader = new JsonAstReplaceInput(p, o);
        HashMap<UUID, Transformation> result = new HashMap<>();
        reader.read(result);

        ASTReplace replace = (ASTReplace) result.get(TEST_ID_1);
        assertEquals(TEST_ID_1, replace.getIndex());
        assertEquals(-1, replace.getStatus());
        assertEquals(1, result.size());
        assertEquals(p.getCodeFragments().get(0), replace.getTransplantationPoint());
        assertEquals(p.getCodeFragments().get(1), replace.getTransplant());
    }

    public static List<String> testErrors(JsonSectionInput reader, JSONObject o,
                                          int errors, int resultSize) throws JSONException {
        InputProgram p = new MockInputProgram();
        reader.setInputProgram(p);
        //Create json replace
        HashMap<UUID, Transformation> r = new HashMap<>();
        try { reader.read(r);
        } catch (PersistenceException e) { // DO NOTHING, WE EXPECT THIS WHILE TESTING ERROR HANDLING
        }
        assertEquals(resultSize, r.size()); // Test that no
        assertEquals(errors, reader.getLoadMessages().size());
        return reader.getLoadMessages();
    }

    /**
     * Test that something goes wrong and it reports it right
     */
    @Test
    public void testWithErrors_UnableToFindCodeFragment() throws JSONException {
        String error1 = "ERROR  : Transf " + TEST_ID_1 +
                ". Unable to find code fragment \"return 0\" at \"org.MyClass:200\". ";
        JSONObject o = createReplaceASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0);
        o.getJSONObject(TRANSPLANT_POINT).put(POSITION, "org.MyClass:200");
        assertEquals(error1, testErrors(new JsonAstReplaceInput(null, o), o, 1, 0).get(0));

        error1 = "ERROR  : Transf " + TEST_ID_1 +
                ". Unable to find code fragment \"fullyDifferent()\" at \"org.MyClass:1\". ";
        o = createReplaceASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0);
        o.getJSONObject(TRANSPLANT_POINT).put(SOURCE_CODE, "fullyDifferent()");
        assertEquals(error1, testErrors(new JsonAstReplaceInput(null, o), o, 1, 0).get(0));
    }

    @Test
    public void testWithErrors_MismatchCF() throws JSONException {

        String error1 = "WARNING: Transf " + TEST_ID_1 + ". Position mismatch -> Storage: " +
                "\"org.MyClass:2\"; Found: \"org.MyClass:1\". ";
        String error2 = "WARNING: Transf " + TEST_ID_1 +
                ". Source mismatch -> Storage: \"return   0\"; Found: \"return 0\". ";

        JSONObject o = createReplaceASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0);
        o.getJSONObject(TRANSPLANT_POINT).put(POSITION, "org.MyClass:2");
        assertEquals(error1,testErrors(new JsonAstReplaceInput(null, o), o, 1, 1).get(0));

        o = createReplaceASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0);
        o.getJSONObject(TRANSPLANT_POINT).put(SOURCE_CODE, "return   0");
        assertEquals(error2, testErrors(new JsonAstReplaceInput(null, o), o, 1, 1).get(0));

        o = createReplaceASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0);
        o.getJSONObject(TRANSPLANT_POINT).put(SOURCE_CODE, "return   0");
        o.getJSONObject(TRANSPLANT_POINT).put(POSITION, "org.MyClass:2");
        List<String> errors = testErrors(new JsonAstReplaceInput(null, o), o, 2, 1);
        assertEquals(error1, errors.get(0));
        assertEquals(error2, errors.get(1));
    }

    @Test
    public void testCanHandleSection() {
        JsonAstReplaceInput reader = new JsonAstReplaceInput(new InputProgram(), new JSONObject());
        assertTrue(reader.canRead(TRANSFORMATIONS + ".replace"));
        assertTrue(reader.canRead(TRANSFORMATIONS + ".replaceWitgestein"));
        assertFalse(reader.canRead(TRANSFORMATIONS + ".delete"));
        assertFalse(reader.canRead(TRANSFORMATIONS + ".add"));
        assertFalse(reader.canRead(TRANSFORMATIONS + ".addWitgestein"));
    }

}
