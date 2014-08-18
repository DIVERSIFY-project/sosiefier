package fr.inria.diversify.sosie.logger;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.util.List;

/**
 * User: Simon
 * Date: 7/22/13
 * Time: 2:03 PM
 *
 * TODO: Move this to Test folder
 */
public class InstruTestAndMethod {


    public InstruTestAndMethod(String propertiesFile) throws Exception {
        InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);

        String project = inputConfiguration.getProperty("project");
        String src = inputConfiguration.getProperty("src");
        String test = inputConfiguration.getProperty("testSrc");
        String out = inputConfiguration.getProperty("outputDirectory");
        boolean compact = Boolean.parseBoolean(inputConfiguration.getProperty("compact.log", "false"));

        MavenDependencyResolver t = new MavenDependencyResolver();
        t.DependencyResolver(project + "/pom.xml");

        boolean intruMethodCall = Boolean.parseBoolean(inputConfiguration.getProperty("intruMethodCall"));
        boolean intruVariable = Boolean.parseBoolean(inputConfiguration.getProperty("intruVariable"));
        boolean intruError = Boolean.parseBoolean(inputConfiguration.getProperty("intruError"));
        boolean intruAssert = Boolean.parseBoolean(inputConfiguration.getProperty("intruAssert"));
        boolean intruNewTest = Boolean.parseBoolean(inputConfiguration.getProperty("intruNewTest"));
        boolean intruTransplantPoint = Boolean.parseBoolean(inputConfiguration.getProperty("intruTransplantPointCount"));


        String prevTransfPath = inputConfiguration.getPreviousTransformationDir();

        Instru instru;

        if ( intruTransplantPoint ) {
            Factory factory = new SpoonMetaFactory().buildNewFactory(project + "/" + src, 5);

            InputProgram inputProgram = new InputProgram();
            inputProgram.setFactory(factory);
            inputProgram.setSourceCodeDir(src);
            inputProgram.setPreviousTransformationsPath(prevTransfPath);

            TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
            List<Transformation> transf = parser.parseFile(new File(inputProgram.getPreviousTransformationsPath()));
            instru = new Instru(project, src, test, out, transf);
        }
        else {
            instru = new Instru(project, src, test, out, null);
        }
        instru.setCompactLog(compact);
        instru.setInstruTransplantationPointCallCount(intruTransplantPoint);
        instru.instru(intruMethodCall, intruVariable, intruError, intruNewTest, intruAssert);
    }

    public static void main(String[] args) throws Exception {
        new InstruTestAndMethod(args[0]);
    }
}
