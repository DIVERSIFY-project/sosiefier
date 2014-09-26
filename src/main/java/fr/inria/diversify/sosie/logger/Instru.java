package fr.inria.diversify.sosie.logger;

import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.sosie.logger.processor.*;
import fr.inria.diversify.transformation.Transformation;
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

    private boolean compactLog;

    //What to instrument?

    //Instrument method calls
    private boolean intruMethodCall;
    //Instrument variables
    private boolean intruVariable;
    //Instrument errors
    private boolean intruError;
    //Instrument asserts
    private boolean intruAssert;
    //Instrument count assertions a simpler, faster processor to count assertions
    private boolean instruCountAssertions;
    //Instrument new test
    private boolean intruNewTest;

    //Instrument call counts over transplantation points
    private boolean instruTransplantationPointCallCount;

    private TransplantationPointCallCountInstrumenter tpcInstrumenter = null;
    private Factory sourceFactory = null;

    private Factory testFactorty = null;


    public Instru(String projectDirectory, String srcDirectory, String testDirectory ,String outputDirectory,
                  List<Transformation> transformations) {
        this.projectDirectory = projectDirectory;
        this.srcDirectory = srcDirectory;
        this.testDirectory = testDirectory;
        this.outputDirectory = outputDirectory;
        this.transformations = transformations;
    }

    public void instru(boolean intruMethodCall, boolean intruVariable, boolean intruError, boolean intruNewTest, boolean intruAssert) throws IOException {

        initOutputDirectory();

        if(intruMethodCall || intruVariable || intruError || getInstruTransplantationPointCallCount())
            instruMainSrc(intruMethodCall, intruVariable, intruError);

        if(intruAssert || intruNewTest || instruCountAssertions)
            instruTestSrc(intruNewTest, intruAssert);

        writeId();
    }

    public void instru() throws IOException {
        initOutputDirectory();

        if(getIntruMethodCall() || getIntruVariable() || getIntruError() || getInstruTransplantationPointCallCount())
            instruMainSrc(getIntruMethodCall(), getIntruVariable(), getIntruError());

        if(getIntruAssert() || getIntruNewTest())
            instruTestSrc(getIntruNewTest(), getIntruAssert());

        writeId();
    }

    protected void initOutputDirectory() throws IOException {
        File dir = new File(outputDirectory);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(projectDirectory), dir);
    }

    protected void writeId() throws IOException {

        TestLoggingInstrumenter.writeIdFile(outputDirectory);
        SimpleAssertInvocationCounter.writeIdFile(outputDirectory);
        TransplantationPointCallCountInstrumenter.writeIdFile(outputDirectory);

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

    protected void instruMainSrc(boolean intruMethodCall, boolean intruVariable, boolean intruError) {
        String src = projectDirectory + "/" + srcDirectory;
        String out = outputDirectory + "/" + srcDirectory;

        if ( sourceFactory == null ) {
            sourceFactory = initSpoon(src);
        }

        if(intruMethodCall) {
            MethodLoggingInstrumenter m = new MethodLoggingInstrumenter(transformations);
            m.setUseCompactLog(compactLog);
            applyProcessor(sourceFactory, m);
        }
        if(intruVariable) {
            VariableLoggingInstrumenter v = new VariableLoggingInstrumenter(transformations);
            v.setUseCompactLog(compactLog);
            applyProcessor(sourceFactory, v);
        }
        if(intruError) {
            ErrorLoggingInstrumenter e = new ErrorLoggingInstrumenter(transformations);
            e.setUseCompactLog(compactLog);
            applyProcessor(sourceFactory, e);
        }
        if ( instruTransplantationPointCallCount ) {
            tpcInstrumenter =
                    new TransplantationPointCallCountInstrumenter(transformations);
            tpcInstrumenter.setUseCompactLog(compactLog);
            applyProcessor(sourceFactory, tpcInstrumenter);
        }

        Environment env = sourceFactory.getEnvironment();
        env.useSourceCodeFragments(true);
        applyProcessor(sourceFactory,
                       new JavaOutputProcessorWithFilter(new File(out),
                                                         new FragmentDrivenJavaPrettyPrinter(env),
                                                         allClassesName(new File(src))));
    }

    protected void instruTestSrc(boolean intruNewTest, boolean intruAssert) {

        String test = projectDirectory + "/" + testDirectory;
        String out = outputDirectory + "/" + testDirectory;

        if ( testFactorty == null ) {
            //testFactorty = initSpoon(src + System.getProperty("path.separator") + test);
            testFactorty = initSpoon(test);
        }

        if(intruAssert) {
            applyProcessor(testFactorty, new AssertInstrumenter());
        } else if ( instruCountAssertions ) {
            applyProcessor(testFactorty, new SimpleAssertInvocationCounter());
            applyProcessor(testFactorty, new SimpleAssertCounter());
        }
        if(intruNewTest) {
            applyProcessor(testFactorty, new TestLoggingInstrumenter());
        }

        Environment env = testFactorty.getEnvironment();
        env.useSourceCodeFragments(true);
        applyProcessor(testFactorty,
                       new JavaOutputProcessorWithFilter(new File(out),
                                                         new FragmentDrivenJavaPrettyPrinter(env),
                                                         allClassesName(new File(test))));
    }


    protected void copyLogger(String tmpDir, String src) throws IOException {
        File dir = new File(tmpDir+"/"+src+"/fr/inria/diversify/sosie/logger");
        FileUtils.forceMkdir(dir);
        String packagePath = System.getProperty("user.dir")+"/src/main/java/fr/inria/diversify/sosie/logger/";
        FileUtils.copyFileToDirectory(new File(packagePath + LogWriter.class.getSimpleName() + ".java"), dir);
        FileUtils.copyFileToDirectory(new File(packagePath + ShutdownHookLog.class.getSimpleName() + ".java"), dir);
        FileUtils.copyFileToDirectory(new File(packagePath + BinLogWriter.class.getSimpleName() + ".java"),dir);
        FileUtils.copyFileToDirectory(new File(packagePath + InstruLogWriter.class.getSimpleName() + ".java"),dir);
        FileUtils.copyFileToDirectory(new File(packagePath + InstruVerboseLog.class.getSimpleName() + ".java"),dir);
        FileUtils.copyFileToDirectory(new File(packagePath + InstruBinaryLog.class.getSimpleName() + ".java"),dir);
    }

    protected Factory initSpoon(String srcDirectory) {

        try {
            return new SpoonMetaFactory().buildNewFactory(srcDirectory, 5);
        } catch (ClassNotFoundException  | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }

        /*
        StandardEnvironment env = new StandardEnvironment();
//        int javaVersion = Integer.parseInt(DiversifyProperties.getProperty("javaVersion"));
//        env.setComplianceLevel(javaVersion);
        env.setVerbose(true);
        env.setDebug(true);

        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new FactoryImpl(f, env);
        SpoonCompiler c = new JDTBasedSpoonCompiler(factory);
        for (String dir : srcDirectory.split(System.getProperty("path.separator")))
            try {
                c.addInputSource(new File(dir));
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            c.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;*/
    }

    protected void applyProcessor(Factory factory, AbstractProcessor processor) {
        ProcessingManager pm = new QueueProcessingManager(factory);
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

    public void setCompactLog(boolean compactLog) {
        this.compactLog = compactLog;
    }

    public boolean getCompactLog() {
        return compactLog;
    }

    public boolean getIntruMethodCall() {
        return intruMethodCall;
    }

    public void setIntruMethodCall(boolean intruMethodCall) {
        this.intruMethodCall = intruMethodCall;
    }

    public boolean getIntruVariable() {
        return intruVariable;
    }

    public void setIntruVariable(boolean intruVariable) {
        this.intruVariable = intruVariable;
    }

    public boolean getIntruError() {
        return intruError;
    }

    public void setIntruError(boolean intruError) {
        this.intruError = intruError;
    }

    public boolean getIntruAssert() {
        return intruAssert;
    }

    public void setIntruAssert(boolean intruAssert) {
        this.intruAssert = intruAssert;
    }

    public boolean getIntruNewTest() {
        return intruNewTest;
    }

    public void setIntruNewTest(boolean intruNewTest) {
        this.intruNewTest = intruNewTest;
    }

    public boolean getInstruTransplantationPointCallCount() {
        return instruTransplantationPointCallCount;
    }

    public void setInstruTransplantationPointCallCount(boolean instruTransplantationPointCallCount) {
        this.instruTransplantationPointCallCount = instruTransplantationPointCallCount;
    }

    public void setSourceFactory(Factory sourceFactory) {
        this.sourceFactory = sourceFactory;
    }

    public Factory getSourceFactory() {
        return sourceFactory;
    }

    public Factory getTestFactorty() {
        return testFactorty;
    }

    public void setTestFactorty(Factory testFactorty) {
        this.testFactorty = testFactorty;
    }

    public boolean isInstruCountAssertions() {
        return instruCountAssertions;
    }

    public void setInstruCountAssertions(boolean instruCountAssertions) {
        this.instruCountAssertions = instruCountAssertions;
    }
}
