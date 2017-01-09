package fr.inria.diversify.processor;

import fr.inria.diversify.processor.main.*;
import fr.inria.diversify.processor.test.AssertLogProcessor;
import fr.inria.diversify.processor.test.TestLogProcessor;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.PrintClassUtils;
import org.apache.commons.io.FileUtils;
import spoon.processing.Processor;
import spoon.reflect.factory.Factory;
import spoon.support.QueueProcessingManager;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * User: Simon
 * Date: 19/06/15
 * Time: 13:06
 */
public class Profiling {
    protected String outputDirectory;
    protected String logger;
    protected InputProgram inputProgram;
    protected Properties properties;


    public Profiling(InputProgram originalProgram, String outputDirectory, String logger, Properties properties) {
        this.inputProgram = originalProgram.clone();
        this.outputDirectory = outputDirectory;
        this.properties = properties;
        this.logger = logger;
    }


    public void apply() throws Exception {
        initOutputDirectory();

        transformTest();
        transformMain();
        if(logger != null) {
            copyLoggerPackage();
        }
        ProcessorUtil.writeInfoFile(inputProgram.getProgramDir());
    }

    protected void initOutputDirectory() throws IOException {
        File dir = new File(outputDirectory);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(inputProgram.getProgramDir()), dir);
        this.inputProgram.setProgramDir(outputDirectory);

    }

    protected void transformMain() throws IOException {
        AbstractLoggingInstrumenter.reset();
        boolean transform = false;
        String mainSrc = inputProgram.getRelativeSourceCodeDir();

        Factory factory = InitUtils.initSpoon(inputProgram, false);

        applyProcessor(factory, new AddBlockEverywhereProcessor(inputProgram));

        Boolean condition = Boolean.parseBoolean(properties.getProperty("profiling.main.stmtUsedCount", "false"));
        transform = transform || condition;
        if(condition) {
            StatementLogProcessor m = new StatementLogProcessor(inputProgram);
            m.setLogger(logger+".Logger");
            applyProcessor(factory, m);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.main.branch", "false"));
        transform = transform || condition;
        if(condition) {
            boolean addBodyBranch =  Boolean.parseBoolean(properties.getProperty("profiling.main.branch.addBodyBranch", "true"));
            BranchCoverageProcessor m = new BranchCoverageProcessor(inputProgram, inputProgram.getProgramDir(), addBodyBranch);
            m.setLogger(logger+".Logger");
            applyProcessor(factory, m);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.main.methodCall", "false"));
        transform = transform || condition;
        if(condition) {
            MethodCallInstrumenter m = new MethodCallInstrumenter(inputProgram);
            m.setLogger(logger+".Logger");
            applyProcessor(factory, m);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.main.catch", "false"));
        transform = transform || condition;
        if(condition) {
            CatchProcessor m = new CatchProcessor(inputProgram);
            m.setLogger(logger+".Logger");
            applyProcessor(factory, m);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.main.throw", "false"));
        transform = transform || condition;
        if(condition) {
            ThrowProcessor m = new ThrowProcessor(inputProgram);
            m.setLogger(logger+".Logger");
            applyProcessor(factory, m);
        }

        if(transform) {
            File fileFrom = new File(inputProgram.getAbsoluteSourceCodeDir());
            File out = new File(inputProgram.getProgramDir() + "/" + mainSrc);
            PrintClassUtils.printAllClasses(factory, out, fileFrom);
        }
    }

    protected void transformTest() throws IOException {
        boolean transform = false;
        String testSrc = inputProgram.getRelativeTestSourceCodeDir();

        Factory factory = InitUtils.initSpoon(inputProgram, true);

        Boolean condition = Boolean.parseBoolean(properties.getProperty("profiling.test.logTest", "false"));
        transform = transform || condition;
        if(condition) {
            TestLogProcessor m = new TestLogProcessor();
            m.setLogger(logger+".Logger");
            applyProcessor(factory, m);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.test.logAssert", "false"));
        transform = transform || condition;
        if(condition) {
            AssertLogProcessor m = new AssertLogProcessor();
            m.setLogger(logger+".Logger");
            applyProcessor(factory, m);
        }

        if(transform) {
            File fileFrom = new File(inputProgram.getAbsoluteTestSourceCodeDir());
            File out = new File(inputProgram.getProgramDir() + "/" + testSrc);
            PrintClassUtils.printAllClasses(factory, out, fileFrom);
        }
    }

    public void copyLoggerPackage() throws IOException {
        File srcDir = new File(System.getProperty("user.dir") + "/src/main/java/" + logger.replace(".", "/"));
        File destDir = new File(outputDirectory + "/" + inputProgram.getRelativeSourceCodeDir() + "/" + logger.replace(".", "/"));
        FileUtils.forceMkdir(destDir);
        FileUtils.copyDirectory(srcDir, destDir);
    }

    public void applyProcessor(Factory factory, Processor processor) {
        QueueProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(processor);
        pm.process(factory.Package().getRootPackage());
    }
}
