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
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon on 03/12/14.
 */
public class Main {

    private String outputDirectory;
    private String projectDirectory;
    private String srcDirectory;
    private Factory sourceFactory;
    private String testDirectory;
    private int javaVersion;


    public Main(String propertiesFile) throws Exception {
        Log.DEBUG();
        InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);

        //Configuration
        projectDirectory = inputConfiguration.getProperty("project");
        srcDirectory = inputConfiguration.getProperty("src");
        testDirectory = inputConfiguration.getProperty("testSrc");
        outputDirectory = inputConfiguration.getProperty("outputDirectory");

        boolean dataMutator = Boolean.parseBoolean(inputConfiguration.getProperty("dataMutator", "false"));
        boolean removeAssert = Boolean.parseBoolean(inputConfiguration.getProperty("removeAssert", "false"));
        boolean methodCallAdder = Boolean.parseBoolean(inputConfiguration.getProperty("methodCallAdder", "false"));
        boolean methodCallRemover = Boolean.parseBoolean(inputConfiguration.getProperty("methodCallRemover", "false"));
        boolean removeNotClone = Boolean.parseBoolean(inputConfiguration.getProperty("removeNotClone", "false"));
        javaVersion = Integer.parseInt(inputConfiguration.getProperty("javaVersion", "5"));

        MavenDependencyResolver t = new MavenDependencyResolver();
        t.DependencyResolver(projectDirectory + "/pom.xml");

        initOutputDirectory();
        transform(removeAssert, dataMutator, methodCallAdder, methodCallRemover, removeNotClone);
    }

    public static void main(String[] args) throws Exception {
        new Main(args[0]);
    }

    protected void initOutputDirectory() throws IOException {
        File dir = new File(outputDirectory);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(projectDirectory), dir);
    }


    protected void transform(boolean removeAssert, boolean dataMutator, boolean methodCallAdder, boolean methodCallRemover, boolean removeNotClone) {
        String src = projectDirectory + "/" + srcDirectory;
        String test = projectDirectory + "/" + testDirectory;

        if ( sourceFactory == null ) {
            sourceFactory = initSpoon(src+":"+test);
        }

        if(dataMutator) {
            TestDataMutator m = new TestDataMutator();
            applyProcessor(sourceFactory, m);

        }
        if(methodCallAdder) {
            TestMethodCallAdder v = new TestMethodCallAdder();
            applyProcessor(sourceFactory, v);
        }
        if(methodCallRemover) {
            TestMethodCallRemover e = new TestMethodCallRemover();
            applyProcessor(sourceFactory, e);
        }

        if(removeNotClone) {
            RemoveNotCloneProcessor p = new RemoveNotCloneProcessor();
            applyProcessor(sourceFactory, p);
        }

        if(removeAssert) {
            TestCaseProcessor tc = new TestCaseProcessor();
            applyProcessor(sourceFactory, tc);
        }



        File fileFrom = new File(test);
        File out = new File(outputDirectory + "/" + testDirectory);
        writeJavaClass(sourceFactory, out, fileFrom);
        Log.info("number of new test: {}", TestProcessor.getCount());
    }

    protected void writeJavaClass(Factory factory, File out, File fileFrom) {
        Environment env = factory.getEnvironment();
        AbstractProcessor processor = new JavaOutputProcessorWithFilter(out, new DiversifyPrettyPrinter(env), allClassesName(fileFrom));
        applyProcessor(factory, processor);
    }

    protected Factory initSpoon(String srcDirectory) {
        try {
            return new SpoonMetaFactory().buildNewFactory(srcDirectory, javaVersion);
        } catch (ClassNotFoundException  | IllegalAccessException | InstantiationException e) {
            throw new java.lang.RuntimeException(e);
        }

    }

    protected void applyProcessor(Factory factory, AbstractProcessor processor) {
        ProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(processor);
        pm.process();
    }

    protected List<String> allClassesName(File dir) {
        List<String> list = new ArrayList<>();

        for(File file : dir.listFiles())
            if(file.isDirectory())
                list.addAll(allClassesName(file));
            else {
                String name = file.getName();
                if(name.endsWith(".java")) {
                    String[] tmp = name.substring(0, name.length() - 5).split("/");
                    list.add(tmp[tmp.length - 1]);
                }
            }
        return list;
    }

}
