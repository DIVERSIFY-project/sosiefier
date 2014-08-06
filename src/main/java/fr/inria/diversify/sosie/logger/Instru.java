package fr.inria.diversify.sosie.logger;

import fr.inria.diversify.sosie.logger.processor.*;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.JavaOutputProcessorWithFilter;
import org.apache.commons.io.FileUtils;
import spoon.compiler.Environment;
import spoon.compiler.SpoonCompiler;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.factory.Factory;
import spoon.reflect.factory.FactoryImpl;
import spoon.reflect.visitor.FragmentDrivenJavaPrettyPrinter;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;

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
    //Instrument new test
    private boolean intruNewTest;

    //Instrument call counts over transplantation points
    private boolean instruTransplantationPointCallCount;


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

        if(intruMethodCall || intruVariable || intruError)
            instruMainSrc(intruMethodCall, intruVariable, intruError);

        if(intruAssert || intruNewTest)
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
        Factory factory = initSpoon(src);

        if(intruMethodCall) {
            MethodLoggingInstrumenter m = new MethodLoggingInstrumenter(transformations);
            m.setUseCompactLog(compactLog);
            applyProcessor(factory, m);
        }
        if(intruVariable) {
            VariableLoggingInstrumenter v = new VariableLoggingInstrumenter(transformations);
            v.setUseCompactLog(compactLog);
            applyProcessor(factory, v);
        }
        if(intruError) {
            ErrorLoggingInstrumenter e = new ErrorLoggingInstrumenter(transformations);
            e.setUseCompactLog(compactLog);
            applyProcessor(factory, e);
        }
        if ( instruTransplantationPointCallCount ) {
            TransplantationPointCallCountInstrumenter tcp =
                    new TransplantationPointCallCountInstrumenter(transformations);
            tcp.setUseCompactLog(compactLog);
            applyProcessor(factory, tcp);
        }

        Environment env = factory.getEnvironment();
        env.useSourceCodeFragments(true);
        applyProcessor(factory,
                       new JavaOutputProcessorWithFilter(new File(out),
                                                         new FragmentDrivenJavaPrettyPrinter(env),
                                                         allClassesName(new File(src))));
    }

    protected void instruTestSrc(boolean intruNewTest, boolean intruAssert) {
        String src = projectDirectory + "/" + srcDirectory;
        String test = projectDirectory + "/" + testDirectory;
        String out = outputDirectory + "/" + testDirectory;

        Factory factory = initSpoon(src+System.getProperty("path.separator")+test);

        if(intruNewTest) {
            applyProcessor(factory, new TestLoggingInstrumenter());
        }
        if(intruAssert) {
            applyProcessor(factory, new AssertInstrumenter());
        }

        Environment env = factory.getEnvironment();
        env.useSourceCodeFragments(true);
        applyProcessor(factory,
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
        return factory;
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
}
