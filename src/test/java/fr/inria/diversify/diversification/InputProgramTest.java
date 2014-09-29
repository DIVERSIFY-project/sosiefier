package fr.inria.diversify.diversification;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.factories.SpoonMetaFactory;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import spoon.reflect.factory.Factory;

/**
 * Created by marodrig on 19/06/2014.
 */
public class InputProgramTest {

    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    @Test
    public void testGetCodeFragments() throws Exception {

        MavenDependencyResolver dr = new MavenDependencyResolver();
        dr.DependencyResolver(getResourcePath("easymock-light-3.2/pom.xml"));
        InputProgram inputProgram = new InputProgram();
        inputProgram.setFactory(new SpoonMetaFactory().buildNewFactory(getResourcePath("easymock-light-3.2/src/main"), 5));
        inputProgram.setSourceCodeDir(getResourcePath("easymock-light-3.2"));

        Assert.assertTrue(inputProgram.getCodeFragments().size() > 0);
    }

    @Test
    @Ignore
    public void testGetCodeFragmentsJunit() throws Exception {

        MavenDependencyResolver dr = new MavenDependencyResolver();
        dr.DependencyResolver(getResourcePath("junit/pom.xml"));
        InputProgram inputProgram = new InputProgram();
        inputProgram.setFactory(new SpoonMetaFactory().buildNewFactory(getResourcePath("junit/src/main/java"), 5));
        //inputProgram.setSourceCodeDir(getResourcePath("easymock-light-3.2"));

        Assert.assertTrue(inputProgram.getCodeFragments().size() > 0);
    }

    @Test
    @Ignore
    public void testGetCodeFragmentsCollection() throws Exception {

        MavenDependencyResolver dr = new MavenDependencyResolver();
        dr.DependencyResolver("C:\\MarcelStuff\\projects\\DIVERSE\\programs\\input-programs\\commons-collections-trunk\\pom.xml");
        InputProgram inputProgram = new InputProgram();
        inputProgram.setFactory(new SpoonMetaFactory().buildNewFactory("C:\\MarcelStuff\\projects\\DIVERSE\\programs\\input-programs\\commons-collections-trunk\\src", 5));
        //inputProgram.setSourceCodeDir(getResourcePath("easymock-light-3.2"));

        Assert.assertTrue(inputProgram.getCodeFragments().size() > 0);
    }
}
