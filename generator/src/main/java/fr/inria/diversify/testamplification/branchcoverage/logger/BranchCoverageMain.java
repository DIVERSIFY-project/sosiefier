package fr.inria.diversify.testamplification.branchcoverage.logger;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.testamplification.branchcoverage.processor.BranchCoverageProcessor;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.io.IOException;

/**
 * User: Simon
 * Date: 15/04/15
 */
public class BranchCoverageMain {
    private final InputProgram inputProgram;
    private final String outputDirectory;

    public BranchCoverageMain(String propertiesFile) throws Exception, InvalidSdkException {
        InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);
        InitUtils.initLogLevel(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        outputDirectory = inputConfiguration.getProperty("outputDirectory");

        initOutputDirectory();
        copyLogger();
        transform();
    }


    protected void initOutputDirectory() throws IOException {
        File dir = new File(outputDirectory);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(inputProgram.getProgramDir()), dir);
    }

    protected void transform() throws IOException {
        String test = inputProgram.getAbsoluteSourceCodeDir();

        Factory factory = InitUtils.initSpoon(inputProgram);

        BranchCoverageProcessor m = new BranchCoverageProcessor(outputDirectory);
        LoggerUtils.applyProcessor(factory, m);

        File fileFrom = new File(test);
        File out = new File(outputDirectory + "/" + inputProgram.getRelativeSourceCodeDir());
        LoggerUtils.writeJavaClass(factory, out, fileFrom);
    }

    public void copyLogger() throws IOException {
        File dir = new File(outputDirectory + "/" + inputProgram.getRelativeSourceCodeDir() + "/fr/inria/diversify/testamplification/branchcoverage.logger");

        String packagePath = System.getProperty("user.dir") + "/generator/src/main/java/fr/inria/diversify/testamplification/branchcoverage/logger/";
        FileUtils.copyFileToDirectory(new File(packagePath + Logger.class.getSimpleName() + ".java"), dir);
        FileUtils.copyFileToDirectory(new File(packagePath + ShutdownHookLog.class.getSimpleName() + ".java"), dir);
        FileUtils.copyFileToDirectory(new File(packagePath + LogWriter.class.getSimpleName() + ".java"),dir);
        FileUtils.copyFileToDirectory(new File(packagePath + Logger.class.getSimpleName() + ".java"),dir);
    }

    public static void main(String[] args) throws Exception, InvalidSdkException {
        new BranchCoverageMain(args[0]);
    }

}
