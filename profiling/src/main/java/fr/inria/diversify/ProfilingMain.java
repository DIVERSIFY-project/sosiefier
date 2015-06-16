package fr.inria.diversify;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.processor.ProcessorUtil;
import fr.inria.diversify.processor.main.*;
import fr.inria.diversify.processor.test.*;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import spoon.processing.Processor;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.io.IOException;

/**
 * Created by Simon on 03/12/14.
 */
public class ProfilingMain {
    protected InputConfiguration inputConfiguration;
    protected InputProgram inputProgram;
    protected String outputDirectory;
    protected String logger;



    public ProfilingMain(String propertiesFile) throws Exception, InvalidSdkException {
        inputConfiguration = new InputConfiguration(propertiesFile);
        InitUtils.initLogLevel(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);

        outputDirectory = inputConfiguration.getProperty("outputDirectory");
        logger = inputConfiguration.getProperty("logger");

        initOutputDirectory();

        transformMain();
        transformTest();

        if(logger != null) {
            LoggerUtils.copyLoggerFile(inputProgram, outputDirectory, logger);
        }

        ProcessorUtil.writeInfoFile(outputDirectory);
    }


    protected void initOutputDirectory() throws IOException {
        File dir = new File(outputDirectory);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(inputProgram.getProgramDir()), dir);
    }


    protected void transformMain() throws IOException {
        boolean transform = false;
        String mainSrc = inputProgram.getRelativeSourceCodeDir();

        Factory factory = InitUtils.initSpoon(inputProgram, false);

        Boolean condition = Boolean.parseBoolean(inputConfiguration.getProperty("profiling.main.branch", "false"));
        transform = transform || condition;
        if(condition) {
            BranchCoverageProcessor m = new BranchCoverageProcessor(inputProgram, outputDirectory);
            m.setLogger(logger+".Logger");
            LoggerUtils.applyProcessor(factory, m);
        }

        condition = Boolean.parseBoolean(inputConfiguration.getProperty("profiling.main.field", "false"));
        transform = transform || condition;
        if(condition) {
            FieldUsedInstrumenter m = new FieldUsedInstrumenter(inputProgram, outputDirectory);
            m.setLogger(logger+".Logger");
            LoggerUtils.applyProcessor(factory, m);
        }

        condition = Boolean.parseBoolean(inputConfiguration.getProperty("profiling.main.methodCall", "false"));
        transform = transform || condition;
        if(condition) {
            MethodCallInstrumenter m = new MethodCallInstrumenter(inputProgram);
            m.setLogger(logger+".Logger");
            LoggerUtils.applyProcessor(factory, m);
        }

        if(transform) {
            File fileFrom = new File(inputProgram.getAbsoluteSourceCodeDir());
            File out = new File(outputDirectory + "/" + mainSrc);
            LoggerUtils.writeJavaClass(factory, out, fileFrom);
        }
    }

    protected void transformTest() throws IOException {
        boolean transform = false;
        String testSrc = inputProgram.getRelativeTestSourceCodeDir();

        Factory factory = InitUtils.initSpoon(inputProgram, true);

        Boolean condition = Boolean.parseBoolean(inputConfiguration.getProperty("profiling.test.dataMutator", "false"));
        transform = transform || condition;
        if(condition) {
            TestDataMutator m = new TestDataMutator();
            LoggerUtils.applyProcessor(factory, m);
        }

        condition = Boolean.parseBoolean(inputConfiguration.getProperty("profiling.test.addCall", "false"));
        transform = transform || condition;
        if(condition) {
            TestMethodCallAdder v = new TestMethodCallAdder();
            LoggerUtils.applyProcessor(factory, v);
        }

        condition = Boolean.parseBoolean(inputConfiguration.getProperty("profiling.test.removeCall", "false"));
        transform = transform || condition;
        if(condition) {
            TestMethodCallRemover e = new TestMethodCallRemover();
            LoggerUtils.applyProcessor(factory, e);
        }

        condition = Boolean.parseBoolean(inputConfiguration.getProperty("profiling.test.removeOriginalTest", "false"));
        transform = transform || condition;
        if(condition) {
            RemoveOriginalTestProcessor p = new RemoveOriginalTestProcessor();
            p.setLogger(logger+".Logger");
            LoggerUtils.applyProcessor(factory, p);
        }

        condition = Boolean.parseBoolean(inputConfiguration.getProperty("profiling.test.logTest", "false"));
        transform = transform || condition;
        if(condition) {
            TestLoggingInstrumenter m = new TestLoggingInstrumenter();
            m.setLogger(logger+".Logger");
            LoggerUtils.applyProcessor(factory, m);
        }

        condition = Boolean.parseBoolean(inputConfiguration.getProperty("profiling.test.removeAssert", "false"));
        transform = transform || condition;
        if(condition) {
            TestCaseProcessor tc = new TestCaseProcessor(testSrc, true);
            tc.setLogger(logger+".Logger");
            LoggerUtils.applyProcessor(factory, tc);
        }

        condition = Boolean.parseBoolean(inputConfiguration.getProperty("profiling.test.evosuite", "false"));
        transform = transform || condition;
        if(condition) {
            Processor tc = new EvosuiteMethodProcessor();
            LoggerUtils.applyProcessor(factory, tc);

            tc = new EvosuiteClassProcessor();
            LoggerUtils.applyProcessor(factory, tc);
        }

        if(transform) {
            File fileFrom = new File(inputProgram.getAbsoluteTestSourceCodeDir());
            File out = new File(outputDirectory + "/" + testSrc);
            LoggerUtils.writeJavaClass(factory, out, fileFrom);
        }
    }



    public static void main(String[] args) throws InvalidSdkException, Exception {
        new ProfilingMain(args[0]);
    }
}
