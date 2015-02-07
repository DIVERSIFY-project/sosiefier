package fr.inria.diversify.ut.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.json.input.*;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.ut.MockInputProgram;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.*;
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
        try { input.read(new HashMap<Integer, Transformation>()); } catch (PersistenceException e) {}
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
        JSONObject jsonObject = createTransformationsJSONObject(p);

        //Introduce some errors
        JSONArray o = jsonObject.getJSONArray(TRANSFORMATIONS);
        o.getJSONObject(0).getJSONObject(TRANSPLANT).put(POSITION, "my.NonExistingClass:90"); //<-error
        o.getJSONObject(1).getJSONObject(TRANSPLANT_POINT).put(SOURCE_CODE, "return   0"); //<- warning

        //Read with errors
        JsonAstTransformationCollectionInput input = new JsonAstTransformationCollectionInput(p, jsonObject);
        input.read(new HashMap<Integer, Transformation>());

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
