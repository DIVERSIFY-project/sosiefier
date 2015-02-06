package fr.inria.diversify.it.persistence;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.it.SosieGeneratorIntegrationTests;
import fr.inria.diversify.persistence.json.input.JsonSosiesInput;
import fr.inria.diversify.persistence.json.output.JsonSosiesOutput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by marodrig on 13/01/2015.
 */
public class PersistenceSubsystem extends SosieGeneratorIntegrationTests {

    /**
     * Turning the OLD persistence system into the new one:
     * 1. Load Transf with the Old JSON parser
     * 2. Save those transformations with the new system.
     * 3. Load the transformations with the new system
     * 4. Compare with the results of the old JSON.
     *
     * This test will be deprecated eventually.
     *
     * @throws java.io.IOException
     * @throws TransformationParserException
     */
    @Test
    public void commonCollections() throws IOException, TransformationParserException {
        //Gets the input program described in common-collections.properties
        //file in the <getDataDir()>/input_configurations
        InputProgram inputProgram = getInputProgram("common-collections-small-test");
        String transfPath = inputProgram.getPreviousTransformationsPath();
        File f = new File(transfPath);
        assertTrue(f.exists() && !f.isDirectory());

        //Load using the old system
        TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
        List<Transformation> oldLoad = new ArrayList<>(parser.parseFile(f));
        assertEquals(0, parser.getErrors().size());

        //Write with the new system
        transfPath = transfPath.substring(0, transfPath.lastIndexOf('.')) + "_new.json";
        JsonSosiesOutput newOut = new JsonSosiesOutput(oldLoad, transfPath);
        newOut.write();

        //Loads wiht the new System
        JsonSosiesInput newIn = new JsonSosiesInput(transfPath, inputProgram);
        List<Transformation> newLoad = new ArrayList<>(newIn.read());

        //Let's trust there are no repeated indexes
        oldLoad.sort((o1, o2) -> o1.getIndex() - o2.getIndex());
        newLoad.sort((o1, o2) -> o1.getIndex() - o2.getIndex());

        //Test that old and new gives same result
        assertEquals(oldLoad.size(), newLoad.size());
        assertEquals(0, newIn.getErrors().size());
        for ( int i = 0; i < newLoad.size(); i++ ) {
            assertEqualsTransformation(oldLoad.get(i), newLoad.get(i));
        }
    }

    public static void assertEqualsTransformation(Transformation tt, Transformation tt2) {
        ASTTransformation t1 = (ASTTransformation) tt;
        ASTTransformation t2 = (ASTTransformation) tt2;

        assertEquals(t1.getStatus(), t2.getStatus());
        assertEquals(t1.getIndex(), t2.getIndex());
        assertEquals(t1.getTransplantationPoint().equalString(), t2.getTransplantationPoint().equalString());
        assertEquals(t1.getClass(), t2.getClass());
        if ( t1 instanceof ASTAdd) {
            assertEquals(
                    ((ASTAdd)t1).getTransplant().equalString(),
                    ((ASTAdd)t2).getTransplant().equalString());
            assertEquals(
                    ((ASTAdd)t1).getTransplant(),
                    ((ASTAdd)t2).getTransplant());

        } else if ( t1 instanceof ASTReplace) {
            assertEquals(
                    ((ASTReplace)t1).getTransplant().equalString(),
                    ((ASTReplace)t2).getTransplant().equalString());
            assertEquals(
                    ((ASTReplace)t1).getTransplant(),
                    ((ASTReplace)t2).getTransplant());
        }
    }

}
