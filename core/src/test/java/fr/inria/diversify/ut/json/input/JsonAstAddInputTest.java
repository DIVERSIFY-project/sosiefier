package fr.inria.diversify.ut.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.json.input.JsonAstAddInput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.ut.MockInputProgram;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSFORMATIONS;
import static fr.inria.diversify.ut.json.SectionTestUtils.createAddASTTransformationJSON;
import static org.junit.Assert.*;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstAddInputTest {

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
    public void testReadAddTransformation() throws JSONException {
        InputProgram p = new MockInputProgram();
        //Create a ASTAdd persisted as json
        JSONObject o = createAddASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0);
        JsonAstAddInput reader = new JsonAstAddInput(p, o);
        reader.setInputProgram(p);
        HashMap<Integer, Transformation> result = new HashMap<>();
        reader.read(result);

        ASTAdd add = (ASTAdd)result.get(1);
        assertEquals(1, add.getIndex());
        assertEquals(-1, add.getStatus());
        assertEquals(1, result.size());
        assertEquals(p.getCodeFragments().get(0), add.getTransplantationPoint());
        assertEquals(p.getCodeFragments().get(1), add.getTransplant());
    }

    @Test
    public void testCanHandleSection() {
        JsonAstAddInput reader = new JsonAstAddInput(new InputProgram(), new JSONObject());
        assertTrue(reader.canRead(TRANSFORMATIONS + ".add"));
        assertTrue(reader.canRead(TRANSFORMATIONS + ".addWitgestein"));
        assertFalse(reader.canRead(TRANSFORMATIONS + ".delete"));
        assertFalse(reader.canRead(TRANSFORMATIONS + ".replace"));
        assertFalse(reader.canRead(TRANSFORMATIONS + ".replaceWitgestein"));
    }

}
