package fr.inria.diversify.statistic;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.codeFragmentProcessor.AbstractCodeFragmentProcessor;
import fr.inria.diversify.sosie.logger.processor.ConditionalLoggingInstrumenter;
import fr.inria.diversify.sosie.logger.processor.MethodLoggingInstrumenter;
import fr.inria.diversify.sosie.logger.processor.TestLoggingInstrumenter;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.JavaOutputProcessorWithFilter;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.maven.MavenDependencyResolver;
import org.apache.commons.io.FileUtils;
import spoon.compiler.SpoonCompiler;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.JDTCompiler;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 7/22/13
 * Time: 2:03 PM
 */
public class SamplingMain {
    protected CodeFragmentList codeFragments;

    public static void main(String[] args) throws Exception {
        new DiversifyProperties(args[0]);
        new SamplingMain();
    }

    public SamplingMain() throws Exception {
        initLogLevel();

        if(DiversifyProperties.getProperty("builder").equals("maven")) {
            MavenDependencyResolver t = new MavenDependencyResolver();
            t.DependencyResolver(DiversifyProperties.getProperty("project") + "/pom.xml");
        }

        initSpoon();
        TransformationParser tf = new TransformationParser(codeFragments);
        List<Transformation> transformations = tf.parseDir(DiversifyProperties.getProperty("transformation.directory"));
        Set<Transformation> set = new HashSet<Transformation>(transformations);

        LinkedList<Transformation> goodTransformation = new LinkedList<Transformation>();
        for(Transformation t : set) {
            if(t.getCompile() == true && t.numberOfFailure() == 0)
                goodTransformation.add(t);
        }

        Sampling s = new Sampling(goodTransformation, 1000);


        s.splitAndWrite(200, DiversifyProperties.getProperty("result"));
    }

    protected void initSpoon() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String srcDirectory = DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("src");

        StandardEnvironment env = new StandardEnvironment();
        int javaVersion = Integer.parseInt(DiversifyProperties.getProperty("javaVersion"));
        env.setComplianceLevel(javaVersion);
        env.setVerbose(true);
        env.setDebug(true);

        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new Factory(f, env);
        SpoonCompiler c = new JDTCompiler(factory);
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
        Class classz = Class.forName(DiversifyProperties.getProperty("processor"));
        AbstractCodeFragmentProcessor processor =  (AbstractCodeFragmentProcessor)classz.newInstance();
        pm.addProcessor(processor);
        pm.process();

        codeFragments = processor.getCodeFragments();
    }
    protected void initLogLevel() {
        int level = Integer.parseInt(DiversifyProperties.getProperty("logLevel"));
        Log.set(level);
    }
}
