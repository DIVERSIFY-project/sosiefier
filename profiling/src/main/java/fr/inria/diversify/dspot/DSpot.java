package fr.inria.diversify.dspot;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.processor.ProcessorUtil;
import fr.inria.diversify.processor.main.BranchCoverageProcessor;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 08/06/15
 * Time: 17:36
 */
public class DSpot {

    protected InputProgram inputProgram;
    protected MavenBuilder builder;
    protected String outputDirectory;

    protected String logger = "fr.inria.diversify.logger.logger";

    public DSpot(String propertiesFile) throws InvalidSdkException, Exception {
        InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);
        InitUtils.initLogLevel(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);

        outputDirectory = inputConfiguration.getProperty("outputDirectory");
    }

    protected void generateTest() throws IOException, InterruptedException {
        init();
        TestAmplification testAmplification = new TestAmplification(inputProgram, builder, outputDirectory);

        for (CtClass cl : getAllTestClasses()) {

            testAmplification.amplification(cl, 10);
        }
    }

    protected Collection<CtClass> getAllTestClasses() {
        String testDir = inputProgram.getRelativeTestSourceCodeDir();

        return inputProgram.getAllElement(CtClass.class).stream()
                .map(elem -> (CtClass) elem)
                .filter(cl -> cl.getSimpleName().contains("Test"))
                .filter(cl -> cl.getPosition().getFile().toString().contains(testDir))
                .collect(Collectors.toSet());
    }

    protected void init() throws IOException, InterruptedException {
        File dir = new File(outputDirectory);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(inputProgram.getProgramDir()), dir);

        addBranchLogger();

        InitUtils.initSpoon(inputProgram, true);
        initBuilder();
    }

    protected void initBuilder() throws InterruptedException, IOException {
        String[] phases  = new String[]{"clean", "test"};
        builder = new MavenBuilder(outputDirectory);

        builder.setGoals(phases);
        builder.initTimeOut();
    }

    protected void addBranchLogger() throws IOException {
        String mainSrc = inputProgram.getRelativeSourceCodeDir();

        Factory factory = InitUtils.initSpoon(inputProgram, false);

        BranchCoverageProcessor m = new BranchCoverageProcessor(outputDirectory);
        m.setLogger(logger+".Logger");
        LoggerUtils.applyProcessor(factory, m);

        File fileFrom = new File(inputProgram.getAbsoluteSourceCodeDir());
        File out = new File(outputDirectory + "/" + mainSrc);
        LoggerUtils.writeJavaClass(factory, out, fileFrom);

        LoggerUtils.copyLoggerFile(inputProgram, outputDirectory, logger);
        ProcessorUtil.writeInfoFile(outputDirectory);
    }

        public static void main(String[] args) throws Exception, InvalidSdkException {
        DSpot sbse = new DSpot(args[0]);
        sbse.generateTest();
    }
}
