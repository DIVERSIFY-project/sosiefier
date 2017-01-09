package fr.inria.diversify.processor;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.util.InitUtils;

/**
 * Created by Simon on 03/12/14.
 */
public class ProfilingMain {

    public static void main(String[] args) throws InvalidSdkException, Exception {
        InputConfiguration inputConfiguration = new InputConfiguration(args[0]);
        InitUtils.initLogLevel(inputConfiguration);
        InputProgram inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);

        String outputDirectory = inputConfiguration.getProperty("outputDirectory");
        String logger = inputConfiguration.getProperty("logger", "fr.inria.diversify.logger");
        Profiling p = new Profiling(inputProgram, outputDirectory, logger, inputConfiguration.getProperties());
        p.apply();
    }
}
