package fr.inria.diversify.ut.persistence.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.InputSectionLocator;
import fr.inria.diversify.persistence.json.input.*;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.ut.MockInputProgram;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.HashMap;

import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.createAddASTTransformationJSON;
import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.createDeleteASTTransformationJSON;
import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.createReplaceASTTransformationJSON;
import static org.junit.Assert.assertEquals;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSFORMATIONS;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstTransformationCollectionInputTest {

    private void testReadTransformation(JsonAstTransformationInput input, JSONObject object) throws JSONException {
        InputSectionLocator locator = new InputSectionLocator();
        locator.addSection(input);

        JsonAstTransformationCollectionInput reader = new JsonAstTransformationCollectionInput();
        InputProgram p = new MockInputProgram();
        reader.setLocator(locator);
        reader.setInputProgram(p);
        //The json data is created with JsonAstDeleteOutput class.
        reader.setJsonObject(object);

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

    /**
     * Test the reading of a ASTDelete transformation
     */
    @Test
    public void testReadDeleteTransformation() throws JSONException {
        testReadTransformation(new JsonAstDeleteInput(), createDeleteASTTransformationJSON());
    }

    /**
     * Test the reading of a ASTAdd transformation
     */
    @Test
    public void testReadAddTransformation() throws JSONException {
        testReadTransformation(new JsonAstAddInput(), createAddASTTransformationJSON());
    }

    /**
     * Test the reading of a ASTAdd transformation
     */
    @Test
    public void testReadReplaceTransformation() throws JSONException {
        testReadTransformation(new JsonAstReplaceInput(), createReplaceASTTransformationJSON());
    }
}
