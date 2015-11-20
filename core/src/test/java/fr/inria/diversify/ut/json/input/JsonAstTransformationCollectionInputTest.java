package fr.inria.diversify.ut.json.input;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.json.input.*;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.ut.MockInputProgram;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.UUID;

import static fr.inria.diversify.ut.json.SectionTestUtils.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstTransformationCollectionInputTest {

    /**
     * Test the proper raising and logging of errors when the JSON object is no good.
     */
    @Test
    public void testWrongJSON() {
        JsonAstTransformationCollectionInput input = new JsonAstTransformationCollectionInput(
                new MockInputProgram(), new JSONObject());
        try { input.read(new HashMap<UUID, Transformation>()); } catch (PersistenceException e) {}
        assertEquals(1, input.getLoadMessages().size());
        assertTrue(input.getLoadMessages().get(0).contains("Unable to obtain the transformations object"));
    }

    /**
     * Test that the collection propagate all errors from elements
     * @throws JSONException
     */
    @Test
    public void testPropagatesLogEvent() throws JSONException {
        //Create a valid json transformations object
        InputProgram p = new MockInputProgram();
        JSONObject jsonObject = createTransformationsJSONObjectWithErrors(p);

        //Read with errors
        JsonAstTransformationCollectionInput input = new JsonAstTransformationCollectionInput(p, jsonObject);
        HashMap<UUID, Transformation> r = new HashMap<>();
        input.read(r);

        assertEquals(2, r.size()); //Test that only two transformations where read out of three
        assertEquals(3, input.getLoadMessages().size());
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

        HashMap<UUID, Transformation> result = new HashMap<>();
        reader.read(result);

        ASTTransformation ast = (ASTTransformation) result.get(TEST_ID_1);
        assertEquals(TEST_ID_1, ast.getIndex());
        assertEquals(-1, ast.getStatus());
        assertEquals(1, result.size());
        assertEquals(p.getCodeFragments().get(0), ast.getTransplantationPoint());
        if (ast instanceof ASTAdd) assertEquals(p.getCodeFragments().get(1), ((ASTAdd) ast).getTransplant());
        if (ast instanceof ASTReplace) assertEquals(p.getCodeFragments().get(1), ((ASTReplace) ast).getTransplant());
    }
}
