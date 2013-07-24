package fr.inria.diversify.sosie;

import fr.inria.diversify.sosie.processor.ConditionalLoggingInstrumenter;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.DefaultCoreFactory;
import spoon.support.JavaOutputProcessor;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;

import java.io.File;
import java.io.IOException;

/**
 * User: Simon
 * Date: 7/22/13
 * Time: 2:03 PM
 */
public class Main {
    public static void main(String[] args) throws Exception {
        new Main(args);
    }

    public Main(String[] args) throws Exception {
        initSpoon();

    }

    protected void initSpoon() {
        String srcDirectory = "/Users/Simon/Documents/code/junit2/src/main/java";

        StandardEnvironment env = new StandardEnvironment();
//        int javaVersion = Integer.parseInt(DiversifyProperties.getProperty("javaVersion"));
//        env.setComplianceLevel(javaVersion);
        env.setVerbose(true);
        env.setDebug(true);

        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new Factory(f, env);
        SpoonBuildingManager builder = new SpoonBuildingManager(factory);

        for (String dir : srcDirectory.split(System.getProperty("path.separator")))
            try {
                builder.addInputSource(new File(dir));
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            System.out.println("sourcepath " + factory.getEnvironment().getSourcePath());
            System.out.println(Thread.currentThread().getContextClassLoader().getClass());

            builder.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ProcessingManager pm = new QueueProcessingManager(factory);
        ConditionalLoggingInstrumenter processor = new ConditionalLoggingInstrumenter();
        pm.addProcessor(processor);
        pm.process();

        pm = new QueueProcessingManager(factory);
        JavaOutputProcessor p2 = new JavaOutputProcessor(new File("/Users/Simon/Documents/code/sacha-incubator/junit/src/main/java"));
        pm.addProcessor(p2);
        pm.process();


    }
}
