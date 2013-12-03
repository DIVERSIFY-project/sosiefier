package fr.inria.diversify.sosie;

import fr.inria.diversify.sosie.logger.processor.ConditionalLoggingInstrumenter;
import fr.inria.diversify.sosie.logger.processor.TestLoggingInstrumenter;
import spoon.compiler.SpoonCompiler;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.JavaOutputProcessor;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.JDTCompiler;

import java.io.File;
import java.io.IOException;

/**
 * User: Simon
 * Date: 7/22/13
 * Time: 2:03 PM
 */
public class MainInstru {
    public static void main(String[] args) throws Exception {
        new MainInstru(args[0], args[1]);
    }

    public MainInstru(String srcDirectory, String outputDir) throws Exception {
        initSpoon(srcDirectory, outputDir);
    }

    protected void initSpoon(String srcDirectory, String outputDir) {

        StandardEnvironment env = new StandardEnvironment();
//        int javaVersion = Integer.parseInt(DiversifyProperties.getProperty("javaVersion"));
//        env.setComplianceLevel(javaVersion);
        env.setVerbose(true);
        env.setDebug(true);

        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new Factory(f, env);
        SpoonCompiler c = new JDTCompiler(factory);
        for (String dir : srcDirectory.split(System.getProperty("path.separator")))
            try {
                c.addInputSource(new File(dir));
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            c.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ProcessingManager pm = new QueueProcessingManager(factory);
        ConditionalLoggingInstrumenter processor = new ConditionalLoggingInstrumenter();
        pm.addProcessor(processor);
        pm.process();

        pm = new QueueProcessingManager(factory);
        JavaOutputProcessor p2 = new JavaOutputProcessor(new File(outputDir));
        env.useSourceCodeFragments(true);
        pm.addProcessor(p2);
        pm.process();
    }
}
