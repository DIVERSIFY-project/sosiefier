package fr.inria.diversify.it;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.Log;
import org.junit.Test;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.util.Collection;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by marodrig on 12/06/2014.
 */
public class TransformationJSONParserTest extends SosieGeneratorIntegrationTests {

    @Test
    public void testLoadAll() {
        int errors = 0;

        Collection<InputConfiguration> configurations = getConfigurations();
        for (InputConfiguration c : configurations) {
            try {
                if (c.validate()) testLoadTransformations(c);
                else {
                    Log.warn("Configuration invalid at {}", c.getRootPath());
                    errors++;
                    c.getValidationErrors().forEach(Log::warn);
                }
            } catch (RuntimeException e) {
                Log.error("Unable to test project {} at ", c.getProjectPath());
                errors++;
            }
        }

        assertEquals(0, errors);
    }

    private void testLoadTransformations(InputConfiguration c) {
        Factory factory = null;
        try {
            MavenDependencyResolver resolver = MavenDependencyResolver.dependencyResolver();
            resolver.resolveDependencies(InitUtils.initInputProgram(c));

            factory = new SpoonMetaFactory().buildNewFactory(c.getProjectPath() + "/" +c.getRelativeSourceCodeDir(), 7);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        InputProgram inputProgram = new InputProgram();
        inputProgram.setFactory(factory);
        inputProgram.setRelativeSourceCodeDir(c.getRelativeSourceCodeDir());
        inputProgram.setPreviousTransformationsPath(c.getPreviousTransformationPath());
        inputProgram.processCodeFragments();

        TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
        List<Transformation> transf = null;
        try {
            transf = parser.parseFile(new File(inputProgram.getPreviousTransformationsPath()));
        } catch (TransformationParserException e) {
            Log.error("Unable to load transformations in project {} ", c.getProjectPath());
        }
        assertTrue(0 < transf.size());
    }

}
