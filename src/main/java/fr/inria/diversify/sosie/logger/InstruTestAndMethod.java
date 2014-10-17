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
 */
public class InstruTestAndMethod {


    public InstruTestAndMethod(String propertiesFile) throws Exception {
        InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);

        //Configuration
        String project = inputConfiguration.getProperty("project");
        String src = inputConfiguration.getProperty("src");
        String test = inputConfiguration.getProperty("testSrc");
        String out = inputConfiguration.getProperty("outputDirectory");
        String prevTransfPath = inputConfiguration.getPreviousTransformationPath();

        boolean intruMethodCall = Boolean.parseBoolean(inputConfiguration.getProperty("intruMethodCall"));
        boolean intruVariable = Boolean.parseBoolean(inputConfiguration.getProperty("intruVariable"));
        boolean intruError = Boolean.parseBoolean(inputConfiguration.getProperty("intruError"));
        boolean intruAssert = Boolean.parseBoolean(inputConfiguration.getProperty("intruAssert"));
        boolean intruCountAssert = Boolean.parseBoolean(inputConfiguration.getProperty("intruCountAssert"));
        boolean intruNewTest = Boolean.parseBoolean(inputConfiguration.getProperty("intruNewTest"));
        boolean intruTransplantPoint = Boolean.parseBoolean(inputConfiguration.getProperty("intruTransplantPointCount"));
        boolean compact = Boolean.parseBoolean(inputConfiguration.getProperty("compact.log", "false"));
        boolean onlyUpdateLoggerCode = Boolean.parseBoolean(inputConfiguration.getProperty("only.copy.logger", "false"));
        int javaVersion = Integer.parseInt(inputConfiguration.getProperty("javaVersion"));


        MavenDependencyResolver t = new MavenDependencyResolver();
        t.DependencyResolver(project + "/pom.xml");

        Instru instru;
        if ( onlyUpdateLoggerCode ) {
            instru = new Instru(project, src, test, javaVersion, out, null);
            instru.copyLogger();
            return;
        } else if ( intruTransplantPoint ) {

            Factory factory = new SpoonMetaFactory().buildNewFactory(project, 7);

            InputProgram inputProgram = new InputProgram();
            inputProgram.setFactory(factory);
            inputProgram.setSourceCodeDir(src);
            inputProgram.setPreviousTransformationsPath(prevTransfPath);
            inputProgram.processCodeFragments();

            TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
            List<Transformation> transf = parser.parseFile(new File(inputProgram.getPreviousTransformationsPath()));
            instru = new Instru(project, src, test, javaVersion, out, transf);
            instru.setSourceFactory(factory);
        } else {
            instru = new Instru(project, src, test, javaVersion, out, null);
        }
        instru.setCompactLog(compact);
        instru.setInstruTransplantationPointCallCount(intruTransplantPoint);
        instru.setInstruCountAssertions(intruCountAssert);
        instru.setOnlyCopyLoggerCode(onlyUpdateLoggerCode);

        instru.instru(intruMethodCall, intruVariable, intruError, intruNewTest, intruAssert);
    }

    public static void main(String[] args) throws Exception {
        new InstruTestAndMethod(args[0]);
    }
}
