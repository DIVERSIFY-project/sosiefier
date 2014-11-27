package fr.inria.diversify;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParser;
import org.junit.Assert;
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

    @Test
    public void testSave() throws Exception {

        //All this is to load the program
        MavenDependencyResolver dr = new MavenDependencyResolver();
        dr.DependencyResolver(getResourcePath("easymock-light-3.2/pom.xml"));
        InputProgram inputProgram = new InputProgram();
        inputProgram.setFactory(new SpoonMetaFactory().buildNewFactory(getResourcePath("easymock-light-3.2/src/main"), 5));
        inputProgram.setSourceCodeDir(getResourcePath("easymock-light-3.2"));


        CodeFragmentList fl = inputProgram.getCodeFragments();

        //What you really care is this
        TestEyeFileGenerator generator = new TestEyeFileGenerator();
        //Put a pair <code to be replaced, replacement>
        generator.addPairs(fl.get(0).getCtCodeFragment(), fl.get(1).getCtCodeFragment());
        generator.addPairs(fl.get(2).getCtCodeFragment(), fl.get(3).getCtCodeFragment());
        generator.saveToFile("testGeneration.json");


        //Test that the Reader can read them
        TransformationParser parser = new TransformationParser(false, inputProgram);
        Collection<Transformation> t = parser.parseFile(new File("testGeneration.json"));
        assertEquals(2, t.size());
    }
}
