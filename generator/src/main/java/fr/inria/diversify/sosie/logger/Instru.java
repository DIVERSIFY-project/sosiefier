package fr.inria.diversify.sosie.logger;

import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.sosie.logger.processor.*;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.DiversifyPrettyPrinter;
import fr.inria.diversify.util.JavaOutputProcessorWithFilter;
import org.apache.commons.io.FileUtils;
import spoon.compiler.Environment;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.factory.Factory;

import spoon.reflect.visitor.FragmentDrivenJavaPrettyPrinter;

import spoon.support.QueueProcessingManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon on 20/06/14.
 */
public class Instru {
    protected String outputDirectory;
    protected String projectDirectory;
    protected String srcDirectory;
    protected String testDirectory;
    protected List<Transformation> transformations;

    private  int javaVersion;

    private String logger;

    //What to instrument?

    //Instrument method calls
    private boolean methodCall;
    //Instrument variables
    private boolean variable;
    //Instrument errors
    private boolean error;
    //Instrument asserts count
    private boolean assertCount;
    //Instrument test count
    private boolean testCount;

    //Instrument new test
    private boolean newTest;


    private boolean useSourceCodeFragments;

    //Instrument call counts over transplantation points
    private boolean transplantationPointCallCount;

    private TransplantationPointCallCountInstrumenter tpcInstrumenter = null;

    private Factory sourceFactory = null;
    private Factory testFactory = null;
    private boolean onlyCopyLoggerCode;


    public Instru(String projectDirectory, String srcDirectory, String testDirectory, int javaVersion, String outputDirectory,
                  List<Transformation> transformations) {
        this.projectDirectory = projectDirectory;
        this.srcDirectory = srcDirectory;
        this.testDirectory = testDirectory;
        this.outputDirectory = outputDirectory;
        this.transformations = transformations;
        this.javaVersion = javaVersion;
    }

    public void copyLogger() throws IOException {
        copyLogger(outputDirectory, srcDirectory);
    }

    public void instru() throws IOException {
        if ( onlyCopyLoggerCode ) {
            copyLogger(outputDirectory, srcDirectory);
        }

        initOutputDirectory();

        if(methodCall || variable || error || getTransplantationPointCallCount())
            instruMainSrc();

        if(assertCount || newTest || testCount)
            instruTestSrc();

        writeId();
    }

    protected void initOutputDirectory() throws IOException {
        File dir = new File(outputDirectory);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(projectDirectory), dir);
    }

    protected void writeId() throws IOException {

        TestLoggingInstrumenter.writeIdFile(outputDirectory);
        TransplantationPointCallCountInstrumenter.writeIdFile(outputDirectory);

        if(tpcInstrumenter != null)
            tpcInstrumenter.writeIdMapToFile(outputDirectory + "/tpcid.json");

        VariableLoggingInstrumenter.writeIdFile(outputDirectory);
        copyLogger(outputDirectory, srcDirectory);


        FileWriter partialLogging = new FileWriter(outputDirectory + "/log/partialLogging");
        if(transformations != null) {
            partialLogging.write("true");
        } else {
            partialLogging.write("false");
        }
        partialLogging.close();
    }

    protected void instruMainSrc() {
        String src = projectDirectory + "/" + srcDirectory;

        if ( sourceFactory == null ) {
            sourceFactory = initSpoon(src);
        }

        if(methodCall) {
            MethodLoggingInstrumenter m = new MethodLoggingInstrumenter(transformations);
            m.setLogger(logger);
            applyProcessor(sourceFactory, m);
        }
        if(variable) {
//            VariableLoggingInstrumenter v = new VariableLoggingInstrumenter(transformations);
            FieldUsedInstrumenter v = new FieldUsedInstrumenter(transformations);
            v.setLogger(logger);
            applyProcessor(sourceFactory, v);
        }
        if(error) {
            ErrorLoggingInstrumenter e = new ErrorLoggingInstrumenter(transformations);
            e.setLogger(logger);
            applyProcessor(sourceFactory, e);
        }
        if (transplantationPointCallCount) {
            tpcInstrumenter =
                    new TransplantationPointCallCountInstrumenter(transformations);
            tpcInstrumenter.setLogger(logger);
            applyProcessor(sourceFactory, tpcInstrumenter);
        }

        File fileFrom = new File(src);
        File out = new File(outputDirectory + "/" + srcDirectory);
        writeJavaClass(sourceFactory, out, fileFrom);
    }

    protected void instruTestSrc() {

        String test = projectDirectory + "/" + testDirectory;
        String main = projectDirectory + "/" + srcDirectory;

        if ( testFactory == null ) {
            testFactory = initSpoon(test+":"+main);
        }

        if(assertCount) {
            applyProcessor(testFactory, new AssertCountInstrumenter());
        }

        if(testCount) {
            applyProcessor(testFactory, new TestCountInstrumenter());
        }

        if(newTest) {
            applyProcessor(testFactory, new TestLoggingInstrumenter());
        }

        File fileFrom = new File(test);
        File out = new File(outputDirectory + "/" + testDirectory);
        writeJavaClass(testFactory, out, fileFrom);
    }

    protected void writeJavaClass(Factory factory, File out, File fileFrom) {
        Environment env = factory.getEnvironment();
        AbstractProcessor processor;
        if(useSourceCodeFragments) {
            env.useSourceCodeFragments(true);
            processor = new JavaOutputProcessorWithFilter(out, new FragmentDrivenJavaPrettyPrinter(env), allClassesName(fileFrom));

        } else {
            processor = new JavaOutputProcessorWithFilter(out, new DiversifyPrettyPrinter(env), allClassesName(fileFrom));
        }
        applyProcessor(factory, processor);
    }


    protected void copyLogger(String tmpDir, String src) throws IOException {
        File dir = new File(tmpDir+"/"+src+ "/fr/inria/diversify/sosie/logger");
        FileUtils.forceMkdir(dir);
        String packagePath = System.getProperty("user.dir")+"/src/main/java/fr/inria/diversify/sosie/logger/";
        FileUtils.copyFileToDirectory(new File(packagePath + LogWriter.class.getSimpleName() + ".java"), dir);
        FileUtils.copyFileToDirectory(new File(packagePath + ShutdownHookLog.class.getSimpleName() + ".java"), dir);
        FileUtils.copyFileToDirectory(new File(packagePath + BinLogWriter.class.getSimpleName() + ".java"),dir);
        FileUtils.copyFileToDirectory(new File(packagePath + InstruLogWriter.class.getSimpleName() + ".java"),dir);
        FileUtils.copyFileToDirectory(new File(packagePath + InstruVerboseLog.class.getSimpleName() + ".java"),dir);
        FileUtils.copyFileToDirectory(new File(packagePath + InstruBinaryLog.class.getSimpleName() + ".java"),dir);


        dir = new File(tmpDir+"/"+src+ "/fr/inria/diversify/testamplification/logger");
        FileUtils.forceMkdir(dir);
        packagePath = System.getProperty("user.dir")+"/src/main/java/fr/inria/diversify/testamplification/logger/";
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.Logger.class.getSimpleName() + ".java"), dir);
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.ShutdownHookLog.class.getSimpleName() + ".java"), dir);
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.LogWriter.class.getSimpleName() + ".java"),dir);
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.VerboseLogWriter.class.getSimpleName() + ".java"),dir);
        FileUtils.copyFileToDirectory(new File(packagePath + fr.inria.diversify.testamplification.logger.DeepLogWriter.class.getSimpleName() + ".java"),dir);
    }

    protected Factory initSpoon(String srcDirectory) {
        try {
            return new SpoonMetaFactory().buildNewFactory(srcDirectory, javaVersion);
        } catch (ClassNotFoundException  | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    protected void applyProcessor(Factory factory, AbstractProcessor processor) {
        ProcessingManager pm = new QueueProcessingManager(factory);
        processor.setFactory(factory);
        pm.addProcessor(processor);
        pm.process();
    }

    protected List<String> allClassesName(File dir) {
        List<String> list = new ArrayList<>();

        for(File file : dir.listFiles())
            if(file.isDirectory())
                list.addAll(allClassesName(file));
            else {
                String name = file.getName();
                if(name.endsWith(".java")) {
                    String[] tmp = name.substring(0, name.length() - 5).split("/");
                    list.add(tmp[tmp.length - 1]);
                }
            }
        return list;
    }

    public void setLogger(String logger) {
        this.logger = logger;
    }

    public boolean getMethodCall() {
        return methodCall;
    }

    public void setMethodCall(boolean methodCall) {
        this.methodCall = methodCall;
    }

    public boolean getVariable() {
        return variable;
    }

    public void setVariable(boolean variable) {
        this.variable = variable;
    }

    public boolean getError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public boolean getNewTest() {
        return newTest;
    }

    public void setNewTest(boolean newTest) {
        this.newTest = newTest;
    }

    public boolean getTransplantationPointCallCount() {
        return transplantationPointCallCount;
    }

    public void setTransplantationPointCallCount(boolean transplantationPointCallCount) {
        this.transplantationPointCallCount = transplantationPointCallCount;
    }

    public void setSourceFactory(Factory sourceFactory) {
        this.sourceFactory = sourceFactory;
    }

    public Factory getSourceFactory() {
        return sourceFactory;
    }

    public Factory getTestFactory() {
        return testFactory;
    }

    public void setTestFactory(Factory testFactorty) {
        this.testFactory = testFactorty;
    }

    public void setOnlyCopyLoggerCode(boolean onlyCopyLoggerCode) {
        this.onlyCopyLoggerCode = onlyCopyLoggerCode;
    }

    public boolean isOnlyCopyLoggerCode() {
        return onlyCopyLoggerCode;
    }

    public void setAssertCount(boolean assertCount) {
        this.assertCount = assertCount;
    }

    public void setTestCount(boolean testCount) {
        this.testCount = testCount;
    }

    public void setUseSourceCodeFragments(boolean useSourceCodeFragments) {
        this.useSourceCodeFragments = useSourceCodeFragments;
    }
}
