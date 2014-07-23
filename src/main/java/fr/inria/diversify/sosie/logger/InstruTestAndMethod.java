package fr.inria.diversify.sosie.logger;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;

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

        if(project.equals(out)) {
            throw new Exception();
        }

//        MavenDependencyResolver t = new MavenDependencyResolver();
//        t.DependencyResolver(project + "/pom.xml");

        boolean intruMethodCall = Boolean.parseBoolean(inputConfiguration.getProperty("intruMethodCall"));
        boolean intruVariable = Boolean.parseBoolean(inputConfiguration.getProperty("intruVariable"));
        boolean intruError = Boolean.parseBoolean(inputConfiguration.getProperty("intruError"));
        boolean intruAssert = Boolean.parseBoolean(inputConfiguration.getProperty("intruAssert"));
        boolean intruNewTest = Boolean.parseBoolean(inputConfiguration.getProperty("intruNewTest"));


        Instru instru = new Instru(project, src, test, out, null);
        instru.instru(intruMethodCall, intruVariable, intruError, intruNewTest, intruAssert);
    }

    public static void main(String[] args) throws Exception {
        new InstruTestAndMethod(args[0]);
    }
}
