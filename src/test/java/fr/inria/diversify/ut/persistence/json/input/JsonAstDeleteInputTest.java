package fr.inria.diversify.ut.persistence.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.json.input.JsonAstAddInput;
import fr.inria.diversify.persistence.json.input.JsonAstDeleteInput;
import fr.inria.diversify.persistence.json.output.JsonASTSectionOutput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.ut.MockInputProgram;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSFORMATIONS;
import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.createDeleteASTTransformationJSON;
import static org.junit.Assert.*;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstDeleteInputTest {

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
    public void testReadDeleteTransformation() throws JSONException {
        JsonAstDeleteInput reader = new JsonAstDeleteInput();

        InputProgram p = new MockInputProgram();
        reader.setInputProgram(p);

        //The json data is created with JsonAstDeleteOutput class.
        reader.setJsonObject(createDeleteASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0));

        HashMap<Integer, Transformation> result = new HashMap<>();
        reader.read(result);

        ASTDelete delete = (ASTDelete)result.get(1);
        assertEquals(1, delete.getIndex());
        assertEquals(-1, delete.getStatus());
        assertEquals(1, result.size());
        assertEquals(p.getCodeFragments().get(0), delete.getTransplantationPoint());
    }
    @Test
    public void testCanHandleSection() {
        JsonAstDeleteInput reader = new JsonAstDeleteInput();
        assertTrue(reader.canHandleSection(TRANSFORMATIONS + ".delete"));
        assertFalse(reader.canHandleSection(TRANSFORMATIONS + ".addWitgestein"));
        assertFalse(reader.canHandleSection(TRANSFORMATIONS + ".replaceWitgestein"));
    }

}
