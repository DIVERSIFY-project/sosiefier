package fr.inria.diversify.sosie.logger;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.util.Log;
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
        Log.DEBUG();
        InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);

        //Configuration
        String project = inputConfiguration.getProperty("project");
        String src = inputConfiguration.getProperty("src");
        String test = inputConfiguration.getProperty("testSrc");
        String out = inputConfiguration.getProperty("outputDirectory");
        String prevTransfPath = inputConfiguration.getPreviousTransformationPath();

        boolean intruMethodCall = Boolean.parseBoolean(inputConfiguration.getProperty("intruMethodCall", "false"));
        boolean intruVariable = Boolean.parseBoolean(inputConfiguration.getProperty("intruVariable", "false"));
        boolean intruError = Boolean.parseBoolean(inputConfiguration.getProperty("intruError", "false"));
        boolean intruCountTest = Boolean.parseBoolean(inputConfiguration.getProperty("intruCountTest", "false"));
        boolean intruCountAssert = Boolean.parseBoolean(inputConfiguration.getProperty("intruCountAssert", "false"));
        boolean intruNewTest = Boolean.parseBoolean(inputConfiguration.getProperty("intruNewTest", "false"));
        boolean intruTransplantPoint = Boolean.parseBoolean(inputConfiguration.getProperty("intruTransplantPointCount", "false"));
        String logger = inputConfiguration.getProperty("logger", "verbose");
        boolean onlyUpdateLoggerCode = Boolean.parseBoolean(inputConfiguration.getProperty("only.copy.logger", "false"));
        int javaVersion = Integer.parseInt(inputConfiguration.getProperty("javaVersion", "5"));
        boolean useSourceCodeFragments = Boolean.parseBoolean(inputConfiguration.getProperty("useSourceCodeFragments", "false"));


        MavenDependencyResolver t = new MavenDependencyResolver();
        t.DependencyResolver(project + "/pom.xml");

        Instru instru;
        if ( onlyUpdateLoggerCode ) {
            instru = new Instru(project, src, test, javaVersion, out, null);
            instru.copyLogger();
            return;
        } else if ( intruTransplantPoint ) {

            Factory factory = new SpoonMetaFactory().buildNewFactory(project, javaVersion);

            InputProgram inputProgram = new InputProgram();
            inputProgram.setFactory(factory);
            inputProgram.setRelativeSourceCodeDir(src);
            inputProgram.setPreviousTransformationsPath(prevTransfPath);
            inputProgram.processCodeFragments();

            TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
            List<Transformation> transf = parser.parseFile(new File(inputProgram.getPreviousTransformationsPath()));
            instru = new Instru(project, src, test, javaVersion, out, transf);
            instru.setSourceFactory(factory);
        } else {
            instru = new Instru(project, src, test, javaVersion, out, null);
        }
        instru.setLogger(logger);
        instru.setMethodCall(intruMethodCall);
        instru.setVariable(intruVariable);
        instru.setError(intruError);
        instru.setNewTest(intruNewTest);
        instru.setAssertCount(intruCountAssert);
        instru.setTestCount(intruCountTest);
        instru.setOnlyCopyLoggerCode(onlyUpdateLoggerCode);
        instru.setUseSourceCodeFragments(useSourceCodeFragments);

        instru.instru();
    }

    public static void main(String[] args) throws Exception {
        new InstruTestAndMethod(args[0]);
    }
}
