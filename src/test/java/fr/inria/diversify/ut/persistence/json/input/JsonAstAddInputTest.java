package fr.inria.diversify.ut.persistence.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.json.input.JsonAstAddInput;
import fr.inria.diversify.persistence.json.input.JsonAstDeleteInput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.ut.MockInputProgram;
import org.json.JSONException;
import org.junit.Test;

import java.util.HashMap;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSFORMATIONS;
import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.createAddASTTransformationJSON;
import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.createDeleteASTTransformationJSON;
import static org.junit.Assert.assertEquals;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstAddInputTest {

    /**
     * Test the reading of a transformation
     */
    @Test
    public void testReadAddTransformation() throws JSONException {
        JsonAstAddInput reader = new JsonAstAddInput();

        InputProgram p = new MockInputProgram();
        reader.setInputProgram(p);

        //The json data is created with JsonAstAddOutput class.
        reader.setJsonObject(createAddASTTransformationJSON().getJSONArray(TRANSFORMATIONS).getJSONObject(0));

        HashMap<Integer, Transformation> result = new HashMap<>();
        reader.read(result);

        ASTAdd add = (ASTAdd)result.get(1);
        assertEquals(1, add.getIndex());
        assertEquals(-1, add.getStatus());
        assertEquals(1, result.size());
        assertEquals(p.getCodeFragments().get(0), add.getTransplantationPoint());
        assertEquals(p.getCodeFragments().get(1), add.getTransplant());
    }

}
