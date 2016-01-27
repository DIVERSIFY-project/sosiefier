package fr.inria.diversify.dspot;

import fr.inria.diversify.buildSystem.DiversifyClassLoader;
import fr.inria.diversify.dspot.processor.*;
import fr.inria.diversify.factories.DiversityCompiler;
import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.processor.ProcessorUtil;
import fr.inria.diversify.processor.main.AbstractLoggingInstrumenter;
import fr.inria.diversify.processor.main.BranchCoverageProcessor;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 08/06/15
 * Time: 17:36
 */
public class DSpot {
    protected  Set<String> filter;
    protected DiversityCompiler compiler;
    protected InputProgram inputProgram;

    protected static DiversifyClassLoader regressionClassLoader;

    public DSpot(String propertiesFile) throws InvalidSdkException, Exception {
        this(new InputConfiguration(propertiesFile));
    }


    public DSpot(InputConfiguration inputConfiguration) throws InvalidSdkException, Exception {
        InitUtils.initLogLevel(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);

        initClassLoaderFilter(inputConfiguration);
        String outputDirectory = inputConfiguration.getProperty("tmpDir") + "/tmp_" + System.currentTimeMillis();

        FileUtils.copyDirectory(new File(inputProgram.getProgramDir()), new File(outputDirectory));
        inputProgram.setProgramDir(outputDirectory);

        InitUtils.initDependency(inputConfiguration);

        init();
    }

    public DSpot(InputConfiguration inputConfiguration, DiversifyClassLoader classLoader) throws Exception, InvalidSdkException {
        regressionClassLoader = classLoader;
        InitUtils.initLogLevel(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);

        initClassLoaderFilter(inputConfiguration);
        String outputDirectory = inputConfiguration.getProperty("tmpDir") + "/tmp_" + System.currentTimeMillis();

        FileUtils.copyDirectory(new File(inputProgram.getProgramDir()), new File(outputDirectory));
        inputProgram.setProgramDir(outputDirectory);

        InitUtils.initDependency(inputConfiguration);

        init();
    }

    public void generateTest() throws IOException, InterruptedException, ClassNotFoundException {
        Amplification testAmplification = new Amplification(inputProgram, compiler, filter, initAmplifiers());

        for (CtClass cl : getAllTestClasses()) {
            testAmplification.amplification(cl, 5);
        }
    }


    public CtClass generateTest(List<CtMethod> tests, CtClass testClass) throws IOException, InterruptedException, ClassNotFoundException {
        Amplification testAmplification = new Amplification(inputProgram, compiler, filter, initAmplifiers());

        return testAmplification.amplification(testClass, tests, 3);
    }


    public void generateTest(CtClass cl) throws IOException, InterruptedException, ClassNotFoundException {
        init();
        Amplification testAmplification = new Amplification(inputProgram, compiler, filter, initAmplifiers());

        testAmplification.amplification(cl, 5);
    }

    protected void initClassLoaderFilter(InputConfiguration inputConfiguration) {
        filter = new HashSet<>();
        for(String s : inputConfiguration.getProperty("filter").split(";") ) {
            filter.add(s);
        }
    }

    protected List<AbstractAmp> initAmplifiers() {
        List<AbstractAmp> amplifiers = new ArrayList<>();

        amplifiers.add(new TestDataMutator());
        amplifiers.add(new TestMethodCallAdder());
        amplifiers.add(new TestMethodCallRemover());
        amplifiers.add(new StatementAdder());

        return amplifiers;
    }

    protected Collection<CtClass> getAllTestClasses() {
        String testDir = inputProgram.getRelativeTestSourceCodeDir();
        List<CtClass> allClasses = inputProgram.getAllElement(CtClass.class);
        return allClasses.stream()
                .filter(cl -> cl.getSimpleName().contains("Test"))
                .filter(cl -> cl.getPosition().getFile().toString().contains(testDir))
                .collect(Collectors.toSet());
    }

    protected void init() throws IOException, InterruptedException {
        addBranchLogger();
        compiler = InitUtils.initSpoonCompiler(inputProgram, true);
    initBuilder();
}

    protected void initBuilder() throws InterruptedException, IOException {
        String[] phases  = new String[]{"clean", "test"};
        MavenBuilder builder = new MavenBuilder(inputProgram.getProgramDir());

        builder.setGoals(phases);
        builder.initTimeOut();
        InitUtils.addApplicationClassesToClassPath(inputProgram);
    }

    protected void addBranchLogger() throws IOException {
        Factory factory = InitUtils.initSpoon(inputProgram, false);

        BranchCoverageProcessor m = new BranchCoverageProcessor(inputProgram, inputProgram.getProgramDir() ,true);
        m.setLogger("fr.inria.diversify.logger.logger.Logger");
        AbstractLoggingInstrumenter.reset();
        LoggerUtils.applyProcessor(factory, m);

        File fileFrom = new File(inputProgram.getAbsoluteSourceCodeDir());
        LoggerUtils.printAllClasses(factory, fileFrom, fileFrom);

        LoggerUtils.copyLoggerPackage(inputProgram, inputProgram.getProgramDir(), "fr.inria.diversify.logger.logger");
        ProcessorUtil.writeInfoFile(inputProgram.getProgramDir());
    }

        public static void main(String[] args) throws Exception, InvalidSdkException {
        DSpot sbse = new DSpot(args[0]);
        sbse.generateTest();
    }

    public void clean() throws IOException {
//        FileUtils.forceDelete(compiler.getDestinationDirectory());
//        FileUtils.forceDelete(compiler.getOutputDirectory());
        FileUtils.forceDelete(new File(inputProgram.getProgramDir()));
    }

    public InputProgram getInputProgram() {
        return inputProgram;
    }
}
