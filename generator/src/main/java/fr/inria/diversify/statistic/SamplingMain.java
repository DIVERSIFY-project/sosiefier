package fr.inria.diversify.statistic;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragmentProcessor.AbstractCodeFragmentProcessor;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import spoon.compiler.SpoonCompiler;
import spoon.processing.ProcessingManager;
import spoon.reflect.factory.Factory;
import spoon.reflect.factory.FactoryImpl;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 7/22/13
 * Time: 2:03 PM
 */
public class SamplingMain {
    private InputConfiguration inputConfiguration;

    protected CodeFragmentList codeFragments;

    InputProgram inputProgram;

    public static void main(String[] args) throws Exception {
        new SamplingMain(args);
    }

    public SamplingMain(String[] args) throws Exception {
        initLogLevel();

        inputConfiguration = new InputConfiguration(args[0]);

        if(inputConfiguration.getProperty("builder").equals("maven")) {
            MavenDependencyResolver t = new MavenDependencyResolver();
            t.DependencyResolver(inputConfiguration.getProperty("project") + "/pom.xml");
        }

        initSpoon();
        TransformationParser tf = new TransformationParser(true, inputProgram);
        Collection<Transformation> transformations = tf.parseDir(inputConfiguration.getProperty("transformation.directory"));
        Set<Transformation> set = new HashSet<Transformation>(transformations);

        Sampling s = new Sampling(set, 500);

        s.splitAndWrite(500, inputConfiguration.getProperty("result"));
    }

    protected void initSpoon() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String srcDirectory = inputConfiguration.getProperty("project") + "/" + inputConfiguration.getProperty("src");

        StandardEnvironment env = new StandardEnvironment();
        int javaVersion = Integer.parseInt(inputConfiguration.getProperty("javaVersion"));
        env.setComplianceLevel(javaVersion);
        env.setVerbose(true);
        env.setDebug(true);
        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new FactoryImpl(f, env);
        SpoonCompiler c = new JDTBasedSpoonCompiler(factory);
        for (String dir : srcDirectory.split(System.getProperty("path.separator")))
            try {
                Log.debug("add {} to classpath",dir);
                c.addInputSource(new File(dir));
            } catch (IOException e) {
                Log.error("error in initSpoon", e);
            }
        try {
            c.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ProcessingManager pm = new QueueProcessingManager(factory);
        Class classz = Class.forName(inputConfiguration.getProperty("processor"));
        AbstractCodeFragmentProcessor processor =  (AbstractCodeFragmentProcessor)classz.newInstance();
        pm.addProcessor(processor);
        pm.process();

        codeFragments = processor.getCodeFragments();

        initInputProgram(factory);
    }

    /**
     * Initializes the InputProgram dataset
     */
    protected void initInputProgram(Factory factory) {
        inputProgram = new InputProgram();
        inputProgram.setFactory(factory);

        //inputProgram.setCoverageReport(initCoverageReport());

        //TODO: See how get rid of the Environment static

        //TODO: See hot to get rid of the Properties static
        inputProgram.setTransformationPerRun(
                Integer.parseInt(inputConfiguration.getProperty("transformation.nb", "1")));

        //Path to pervious transformations made to this input program
        inputProgram.setPreviousTransformationsPath(
                inputConfiguration.getProperty("transformation.directory"));

        inputProgram.setClassesDir(inputConfiguration.getProperty("project") + "/" +
                inputConfiguration.getProperty("classes"));

        inputProgram.setCoverageDir(inputConfiguration.getProperty("jacoco"));
    }

    protected void initLogLevel() {
        int level = Integer.parseInt(inputConfiguration.getProperty("logLevel"));
        Log.set(level);
    }
}
