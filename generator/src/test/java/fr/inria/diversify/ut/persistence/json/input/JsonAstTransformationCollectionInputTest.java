package fr.inria.diversify.ut.persistence.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.json.input.*;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.ut.MockInputProgram;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;

import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.*;
import static org.junit.Assert.assertEquals;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSFORMATIONS;
import static org.junit.Assert.fail;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstTransformationCollectionInputTest {

    /**
     * Test that something goes wrong and it reports it right
     */
    @Test
    @Ignore
    public void testWithErrors_UnableToFindCodeFragment() {
        fail("Not implemented yet");
    }



    /**
     * Test the reading of a ASTDelete transformation
     */
    @Test
    public void testReadDeleteTransformation() throws JSONException {
        testReadTransformation(createDeleteASTTransformationJSON());
    }

    /**
     * Test the reading of a ASTAdd transformation
     */
    @Test
    public void testReadAddTransformation() throws JSONException {
        testReadTransformation(createAddASTTransformationJSON());
    }

    /**
     * Test the reading of a ASTAdd transformation
     */
    @Test
    public void testReadReplaceTransformation() throws JSONException {
        testReadTransformation(createReplaceASTTransformationJSON());
    }

    private void testReadTransformation(JSONObject data) throws JSONException {
        InputProgram p = new MockInputProgram();
        JsonAstTransformationCollectionInput reader = new JsonAstTransformationCollectionInput(p, data);

        HashMap<Integer, Transformation> result = new HashMap<>();
        reader.read(result);

        ASTTransformation ast = (ASTTransformation) result.get(1);
        assertEquals(1, ast.getIndex());
        assertEquals(-1, ast.getStatus());
        assertEquals(1, result.size());
        assertEquals(p.getCodeFragments().get(0), ast.getTransplantationPoint());
        if (ast instanceof ASTAdd) assertEquals(p.getCodeFragments().get(1), ((ASTAdd) ast).getTransplant());
        if (ast instanceof ASTReplace) assertEquals(p.getCodeFragments().get(1), ((ASTReplace) ast).getTransplant());
    }
}
