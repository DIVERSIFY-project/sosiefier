package fr.inria.diversify.testamplification;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.testamplification.compare.diff.Filter;
import fr.inria.diversify.testamplification.logger.AssertLogWriter;
import fr.inria.diversify.testamplification.processor.*;
import fr.inria.diversify.testamplification.processor.TestLoggingInstrumenter;
import fr.inria.diversify.testamplification.processor.TestProcessor;
import fr.inria.diversify.util.*;
import org.apache.commons.io.FileUtils;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;


import java.io.*;
import java.lang.String;

/**
 * Created by Simon on 03/12/14.
 */
public class MakeAmpliTest {
    private final boolean guavaTestlib;
    protected InputProgram inputProgram;

    private final boolean makeHarmanFilter;
    private final String filterFile;
    private String outputDirectory;

    boolean dataMutator;
    boolean removeAssert;
    boolean methodCallAdder;
    boolean methodCallRemover;
    boolean removeNotClone;
    boolean logNewTest;


    public MakeAmpliTest(String propertiesFile) throws Exception, InvalidSdkException {
        InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);
        InitUtils.initLogLevel(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);

        outputDirectory = inputConfiguration.getProperty("outputDirectory");

        dataMutator = Boolean.parseBoolean(inputConfiguration.getProperty("dataMutator", "false"));
        removeAssert = Boolean.parseBoolean(inputConfiguration.getProperty("removeAssert", "false"));
        methodCallAdder = Boolean.parseBoolean(inputConfiguration.getProperty("methodCallAdder", "false"));
        methodCallRemover = Boolean.parseBoolean(inputConfiguration.getProperty("methodCallRemover", "false"));
        removeNotClone = Boolean.parseBoolean(inputConfiguration.getProperty("removeNotClone", "false"));
        logNewTest  = Boolean.parseBoolean(inputConfiguration.getProperty("logNewTest", "false"));
        makeHarmanFilter = Boolean.parseBoolean(inputConfiguration.getProperty("makeHarmanFilter", "false"));
        filterFile = inputConfiguration.getProperty("compare.filter", "'");
        guavaTestlib =  Boolean.parseBoolean(inputConfiguration.getProperty("guavaTestlib", "false"));

        if(!makeHarmanFilter) {
            initOutputDirectory();
            LoggerUtils.copyLogger(inputProgram, outputDirectory, AssertLogWriter.class);
            LoggerUtils.writeId(outputDirectory);
        }


        if(guavaTestlib) {
            transform();
        } else {
            transformGuava();
        }

    }



    protected void initOutputDirectory() throws IOException {
        File dir = new File(outputDirectory);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(inputProgram.getProgramDir()), dir);
    }


    protected void transform() throws IOException {
        String test = inputProgram.getAbsoluteTestSourceCodeDir();

        Factory factory = InitUtils.initSpoon(inputProgram, false);

        if(dataMutator) {
            TestDataMutator m = new TestDataMutator();
            m.setGuavaTestlib(guavaTestlib);
            LoggerUtils.applyProcessor(factory, m);
        }
        if(methodCallAdder) {
            TestMethodCallAdder v = new TestMethodCallAdder();
            v.setGuavaTestlib(guavaTestlib);
            LoggerUtils.applyProcessor(factory, v);
        }
        if(methodCallRemover) {
            TestMethodCallRemover e = new TestMethodCallRemover();
            e.setGuavaTestlib(guavaTestlib);
            LoggerUtils.applyProcessor(factory, e);
        }
        if(removeNotClone) {
            RemoveOriginalTestProcessor p = new RemoveOriginalTestProcessor();
            LoggerUtils.applyProcessor(factory, p);
        }
        if(logNewTest) {
            TestLoggingInstrumenter m = new TestLoggingInstrumenter();
            m.setLogName("fr.inria.diversify.testamplification.branchcoverage.logger.Logger");
            LoggerUtils.applyProcessor(factory, m);
        }
        if(removeAssert) {
            TestCaseProcessor tc = null;
            if(guavaTestlib) {
                tc = new TestCaseProcessor(inputProgram.getRelativeTestSourceCodeDir(), false);
            } else {
                tc = new TestCaseProcessor(inputProgram.getRelativeTestSourceCodeDir(), true);
            }
            LoggerUtils.applyProcessor(factory, tc);
        }

        if(makeHarmanFilter) {
            makeHarmanFilter();
        } else {
            File out = new File(outputDirectory + "/" + inputProgram.getRelativeTestSourceCodeDir());
            for(CtSimpleType cl : TestCaseProcessor.ampclasses) {
                LoggerUtils.printJavaFile(out, cl);
            }

//            File fileFrom = new File(test);
//            File out = new File(outputDirectory + "/" + inputProgram.getRelativeTestSourceCodeDir());
//            LoggerUtils.writeJavaClass(factory, out, fileFrom);
        }
        Log.info("number of new test: {}", TestProcessor.getCount());
        Log.info("number of data test: {}", TestDataMutator.dataCount);
        Log.info("number of monitoring point {}:",TestCaseProcessor.monitorPointCount);
    }

    protected void transformGuava() throws IOException {
        String test = inputProgram.getAbsoluteTestSourceCodeDir();

        Factory factory = InitUtils.initSpoon(inputProgram, false);

        if(dataMutator) {
            TestDataMutator m = new TestDataMutator();
            LoggerUtils.applyProcessor(factory, m);
        }
        if(methodCallAdder) {
            TestMethodCallAdder v = new TestMethodCallAdder();
            LoggerUtils.applyProcessor(factory, v);
        }
        if(methodCallRemover) {
            TestMethodCallRemover e = new TestMethodCallRemover();
            LoggerUtils.applyProcessor(factory, e);
        }
        if(removeNotClone) {
           GuavaProcessor p = new GuavaProcessor(test);
            LoggerUtils.applyProcessor(factory, p);
        }
        if(logNewTest) {
            TestLoggingInstrumenter m = new TestLoggingInstrumenter();
            m.setLogName("fr.inria.diversify.testamplification.branchcoverage.logger.Logger");
            LoggerUtils.applyProcessor(factory, m);
        }
        if(removeAssert) {
            TestCaseProcessor tc = new TestCaseProcessor(inputProgram.getRelativeTestSourceCodeDir(), false);
            LoggerUtils.applyProcessor(factory, tc);
        }
        GuavaProcessor p = new GuavaProcessor(test);
        LoggerUtils.applyProcessor(factory, p);

        File out = new File(outputDirectory + "/" + inputProgram.getRelativeTestSourceCodeDir());
        for(CtClass cl : GuavaProcessor.ampclasses) {
            LoggerUtils.printJavaFile(out, cl);
        }

        Log.info("number of new test: {}", TestProcessor.getCount());
        Log.info("number of data test: {}", TestDataMutator.dataCount);
        Log.info("number of monitoring point {}:",TestCaseProcessor.monitorPointCount);
    }

    protected void makeHarmanFilter() throws IOException {
        Filter filter = new Filter(filterFile);
        filter.print(outputDirectory +"/filterOriginal");

        Filter harmanTestAllMonitor = new Filter(filter);
        for(CtMethod test: TestDataMutator.notHarmanTest) {
            harmanTestAllMonitor.addTest(test.getSimpleName());
        }
        harmanTestAllMonitor.print(outputDirectory + "/filterHarmanTestAllMonitor");

        Filter allTestHarmanMonitor = new Filter(filter);
        for(String monitorPoint: TestCaseProcessor.NotHarmanMonitorPoint) {
            allTestHarmanMonitor.addMonitorPoint(Integer.parseInt(monitorPoint));
        }
        allTestHarmanMonitor.print(outputDirectory + "/filterAllTestHarmanMonitor");

        Filter harmanTestHarmanMonitor = new Filter(allTestHarmanMonitor);
        for(CtMethod test: TestDataMutator.notHarmanTest) {
            harmanTestHarmanMonitor.addTest(test.getSimpleName());
        }
        harmanTestHarmanMonitor.print(outputDirectory + "/filterHarmanTestHarmanMonitor");
    }

    public static void main(String[] args) throws InvalidSdkException, Exception {
        new MakeAmpliTest(args[0]);
    }
}
