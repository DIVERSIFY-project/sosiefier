package fr.inria.diversify.clone;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.dspot.TestAmplification;
import fr.inria.diversify.processor.ProcessorUtil;
import fr.inria.diversify.processor.main.BranchCoverageProcessor;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 24/09/15
 * Time: 10:30
 */
public class CloneMain {
    protected InputProgram inputProgram;
    protected MavenBuilder builder;
    protected String outputDirectory;

    protected String logger = "fr.inria.diversify.logger.logger";

    public CloneMain(String propertiesFile) throws InvalidSdkException, Exception {
        InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);
        InitUtils.initLogLevel(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);

        outputDirectory = inputConfiguration.getProperty("tmpDir") + "/tmp" + System.currentTimeMillis();
    }

    protected void generateTest() throws IOException, InterruptedException {
        init();
        CloneTestBuilder builder = new CloneTestBuilder();

        addCompareFile(inputProgram.getRelativeTestSourceCodeDir(), outputDirectory);
        File output = new File(outputDirectory + "/" + inputProgram.getRelativeTestSourceCodeDir());

        for (CtClass cl : getAllTestClasses()) {
            Set<CtMethod> methods = new HashSet<>(cl.getMethods());
            for(CtMethod test : methods) {
                if(test.getSimpleName().contains("test")) {
                    try {
                        builder.builder(test);
                    } catch (Exception e) {
                        Log.error("error {}", test.getSignature());
                    }
                }
            }
            LoggerUtils.printJavaFile(output, cl);
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
//
//        addBranchLogger();

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

        BranchCoverageProcessor m = new BranchCoverageProcessor(inputProgram, outputDirectory ,true);
        m.setLogger(logger+".Logger");
        LoggerUtils.applyProcessor(factory, m);

        File fileFrom = new File(inputProgram.getAbsoluteSourceCodeDir());
        File out = new File(outputDirectory + "/" + mainSrc);
        LoggerUtils.writeJavaClass(factory, out, fileFrom);

        LoggerUtils.copyLoggerFile(inputProgram, outputDirectory, logger);
        ProcessorUtil.writeInfoFile(outputDirectory);
    }

    public void addCompareFile(String mainSrc, String outputDirectory) throws IOException {
        File srcDir = new File(System.getProperty("user.dir") + "/testAmplification/src/main/java/fr/inria/diversify/clone/compare/");

        File destDir = new File(outputDirectory + "/" + mainSrc + "/fr/inria/diversify/clone/compare/");
        FileUtils.forceMkdir(destDir);

        FileUtils.copyDirectory(srcDir, destDir);
    }

    public static void main(String[] args) throws Exception, InvalidSdkException {
        CloneMain clone = new CloneMain(args[0]);
        clone.generateTest();
    }


}
