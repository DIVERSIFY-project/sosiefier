package fr.inria.diversify.oldTests;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by marodrig on 19/06/2014.
 */
public class InputProgramTest {

    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    @Test
    public void testGetCodeFragments() throws Exception {


        InputProgram inputProgram = new InputProgram();
        inputProgram.setProgramDir(getResourcePath("easymock-light-3.2"));
        MavenDependencyResolver dr = MavenDependencyResolver.dependencyResolver();
        dr.resolveDependencies(inputProgram);
        inputProgram.setFactory(new SpoonMetaFactory().buildNewFactory(getResourcePath("easymock-light-3.2/src/main"), 5));
        inputProgram.setRelativeSourceCodeDir(getResourcePath("easymock-light-3.2"));
        Assert.assertTrue(inputProgram.getCodeFragments().size() > 0);
    }

    @Test
    @Ignore
    public void testGetCodeFragmentsJunit() throws Exception {


        InputProgram inputProgram = new InputProgram();
        inputProgram.setProgramDir(getResourcePath("junit"));
        MavenDependencyResolver dr = MavenDependencyResolver.dependencyResolver();
        dr.resolveDependencies(inputProgram);
        inputProgram.setFactory(new SpoonMetaFactory().buildNewFactory(getResourcePath("junit/src/main/java"), 5));
        //inputProgram.setSourceCodeDir(getResourcePath("easymock-light-3.2"));

        Assert.assertTrue(inputProgram.getCodeFragments().size() > 0);
    }

//    @Test
//    @Ignore
//    public void testGetCodeFragmentsCollection() throws Exception {
//
//        MavenDependencyResolver dr = new MavenDependencyResolver();
//        dr.resolveDependencies("C:\\MarcelStuff\\projects\\DIVERSE\\programs\\input-programs\\commons-collections-trunk\\pom.xml");
//        InputProgram inputProgram = new InputProgram();
//        inputProgram.setFactory(new SpoonMetaFactory().buildNewFactory("C:\\MarcelStuff\\projects\\DIVERSE\\programs\\input-programs\\commons-collections-trunk\\src", 5));
//        //inputProgram.setSourceCodeDir(getResourcePath("easymock-light-3.2"));
//
//        Assert.assertTrue(inputProgram.getCodeFragments().size() > 0);
//    }
}
