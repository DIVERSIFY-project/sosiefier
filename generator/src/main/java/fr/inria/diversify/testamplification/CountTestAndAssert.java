package fr.inria.diversify.testamplification;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.testamplification.processor.*;
import fr.inria.diversify.util.DiversifyPrettyPrinter;
import fr.inria.diversify.util.JavaOutputProcessorWithFilter;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import spoon.compiler.Environment;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.factory.Factory;
import spoon.support.QueueProcessingManager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon on 03/12/14.
 */
public class CountTestAndAssert {

    private String projectDirectory;
    private String srcDirectory;
    private String testDirectory;
    private int javaVersion;

    public CountTestAndAssert(String propertiesFile) throws Exception {
        Log.DEBUG();
        InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);

        //Configuration
        projectDirectory = inputConfiguration.getProperty("project");
        srcDirectory = inputConfiguration.getProperty("src");
        testDirectory = inputConfiguration.getProperty("testSrc");
        javaVersion = Integer.parseInt(inputConfiguration.getProperty("javaVersion", "5"));

        MavenDependencyResolver t = new MavenDependencyResolver();
        t.DependencyResolver(projectDirectory + "/pom.xml");

        count();
    }

    public static void main(String[] args) throws Exception {
        new CountTestAndAssert(args[0]);
    }




    protected void count() {
        String src = projectDirectory + "/" + srcDirectory;
        String test = projectDirectory + "/" + testDirectory;

        Factory factory = initSpoon(src+":"+test);

        CountProcessor processor = new CountProcessor();
        ProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(processor);
        pm.process();

        Log.info("number of test: {}", processor.getTestCount());
        Log.info("number of assert: {}", processor.getAssertCount());
        Log.info("number of monitoring point: {}", processor.getMonitoringPointCount());
    }


    protected Factory initSpoon(String srcDirectory) {
        try {
            return new SpoonMetaFactory().buildNewFactory(srcDirectory, javaVersion);
        } catch (ClassNotFoundException  | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
