package fr.inria.diversify.it.persistence;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.it.SosieGeneratorIntegrationTests;
import fr.inria.diversify.persistence.json.input.JsonSosiesInput;
import fr.inria.diversify.persistence.json.output.JsonSosiesOutput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import org.junit.Test;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
     * @throws IOException
     * @throws TransformationParserException
     */
    @Test
    public void commonCollections() throws IOException, TransformationParserException {
        //Gets the input program described in common-collections.properties
        //file in the <getDataDir()>/input_configurations
        InputProgram inputProgram = getInputProgram("common-collections-small-test");

        TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);

        String transfPath = inputProgram.getPreviousTransformationsPath();
        File f = new File(transfPath);
        assertTrue(f.exists() && !f.isDirectory());
        Collection<Transformation> oldLoad = parser.parseFile(f);
        assertEquals(0, parser.getErrors().size());

        //Write with the new system
        transfPath = transfPath.substring(0, transfPath.lastIndexOf('.')) + "_new.json";
        JsonSosiesOutput newOut = new JsonSosiesOutput(oldLoad, transfPath);
        newOut.write();

        //Loads wiht the new System
        JsonSosiesInput newIn = new JsonSosiesInput(transfPath, inputProgram);

        Collection<Transformation> newLoad = newIn.read();
        assertEquals(0, newIn.getErrors().size());

        //Test that old and new gives same result
        assertEquals(newLoad.size(), oldLoad.size());
    }



}
