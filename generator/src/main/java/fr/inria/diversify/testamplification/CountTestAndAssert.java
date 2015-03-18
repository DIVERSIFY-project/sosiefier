package fr.inria.diversify.testamplification;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.testamplification.processor.*;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.LoggerUtils;
import spoon.processing.ProcessingManager;
import spoon.reflect.factory.Factory;
import spoon.support.QueueProcessingManager;

import java.io.File;

/**
 * Created by Simon on 03/12/14.
 */
public class CountTestAndAssert {

    private String outputDirectory;
    private InputProgram inputProgram;

    public CountTestAndAssert(String propertiesFile) throws Exception, InvalidSdkException {
        Log.DEBUG();
        InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        outputDirectory = inputConfiguration.getProperty("outputDirectory");

        if(Boolean.parseBoolean(inputConfiguration.getProperty("staticCount","true"))) {
            staticCount();
        } else {
            dynamicCount();
        }
    }

    public static void main(String[] args) throws Exception, InvalidSdkException {
        new CountTestAndAssert(args[0]);
    }

    protected void staticCount() {
        Factory factory = InitUtils.initSpoon(inputProgram);

        CountProcessor processor = new CountProcessor();
        ProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(processor);
        pm.process();

        Log.info("number of test: {}", processor.getTestCount());
        Log.info("number of assert: {}", processor.getAssertCount());
        Log.info("number of monitoring point: {}", processor.getMonitoringPointCount());
    }

    protected void dynamicCount()  {
        String test = inputProgram.getAbsoluteTestSourceCodeDir();

        Factory factory = InitUtils.initSpoon(inputProgram);

        AssertCountInstrumenter a = new AssertCountInstrumenter();
        ProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(a);
        pm.process();

        File fileFrom = new File(test);
        File out = new File(outputDirectory + "/" + inputProgram.getRelativeTestSourceCodeDir());
        LoggerUtils.writeJavaClass(factory, out, fileFrom);
    }
}
