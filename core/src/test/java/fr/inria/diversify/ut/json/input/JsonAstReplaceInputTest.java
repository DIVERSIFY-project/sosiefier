package fr.inria.diversify.ut.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.json.input.JsonAstReplaceInput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.ut.MockInputProgram;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSFORMATIONS;
import static fr.inria.diversify.ut.json.SectionTestUtils.createReplaceASTTransformationJSON;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstReplaceInputTest {

    /**
     * Test that something goes wrong and it reports it right
     */
    @Test
    @Ignore
    public void testWithErrors_UnableToFindCodeFragment() {
        fail("Not implemented yet");
    }

    /**
     * Test the reading of a transformation
     */
    @Test
    public void testReadReplaceTransformation() throws JSONException {
        InputProgram p = new MockInputProgram();
        //Create json replace
        JSONObject o = createReplaceASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0);

        JsonAstReplaceInput reader = new JsonAstReplaceInput(p, o);
        HashMap<Integer, Transformation> result = new HashMap<>();
        reader.read(result);

        ASTReplace add = (ASTReplace)result.get(1);
        assertEquals(1, add.getIndex());
        assertEquals(-1, add.getStatus());
        assertEquals(1, result.size());
        assertEquals(p.getCodeFragments().get(0), add.getTransplantationPoint());
        assertEquals(p.getCodeFragments().get(1), add.getTransplant());
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
