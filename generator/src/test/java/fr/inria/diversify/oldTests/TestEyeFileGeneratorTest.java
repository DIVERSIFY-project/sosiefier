package fr.inria.diversify.oldTests;

import fr.inria.diversify.TestEyeFileGenerator;
import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParser;
import org.junit.Test;

import java.io.File;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 *
 *
 * Created by marodrig on 27/11/2014.
 */
public class TestEyeFileGeneratorTest {

    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    private InputProgram getSosieInputProgram() throws Exception {
        InputProgram inputProgram = new InputProgram();
        inputProgram.setProgramDir(getResourcePath("easymock-light-3.2"));
        MavenDependencyResolver dr = MavenDependencyResolver.dependencyResolver();
        dr.resolveDependencies(inputProgram);
        inputProgram.setFactory(new SpoonMetaFactory().buildNewFactory(getResourcePath("easymock-light-3.2/src/main"), 5));
        inputProgram.setRelativeSourceCodeDir(getResourcePath("easymock-light-3.2"));
        return inputProgram;
    }

    @Test
    public void testSave() throws Exception {

        //Obtain a list of code fragments
        InputProgram inputProgram = getSosieInputProgram();
        CodeFragmentList fl = inputProgram.getCodeFragments();

        //This is what you really care:
        //Create the generator
        TestEyeFileGenerator generator = new TestEyeFileGenerator();
        //Put a pair <code to be replaced, replacement>
        generator.addPairs(fl.get(0).getCtCodeFragment(), fl.get(1).getCtCodeFragment());
        generator.addPairs(fl.get(2).getCtCodeFragment(), fl.get(3).getCtCodeFragment());
        generator.addPairs(fl.get(2).getCtCodeFragment(), null);
        //Save it to file
        generator.saveToFile("testGeneration.json");


        //Test that the Sosie reader can read them
        TransformationParser parser = new TransformationParser(false, inputProgram);
        Collection<Transformation> t = parser.parseFile(new File("testGeneration.json"));
        assertEquals(2, t.size());
    }
}
