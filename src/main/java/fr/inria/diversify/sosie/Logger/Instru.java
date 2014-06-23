package fr.inria.diversify.sosie.logger;

import fr.inria.diversify.sosie.logger.processor.*;
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


    public Instru(String projectDirectory, String srcDirectory, String testDirectory ,String outputDirectory) {
        this.projectDirectory = projectDirectory;
        this.srcDirectory = srcDirectory;
        this.testDirectory = testDirectory;
        this.outputDirectory = outputDirectory;
    }

    public void instru(boolean intruMethodCall, boolean intruVariable, boolean intruError, boolean intruNewTest, boolean intruAssert) throws IOException {
        initOutputDirectory();

        if(intruMethodCall || intruVariable || intruError)
            instruMainSrc(intruMethodCall, intruVariable, intruError);

        if(intruAssert || intruNewTest)
            instruTestSrc(intruNewTest, intruAssert);

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
    }

    protected void instruMainSrc(boolean intruMethodCall, boolean intruVariable, boolean intruError) {
        String src = projectDirectory + "/" + srcDirectory;
        String out = outputDirectory + "/" + srcDirectory;
        Factory factory = initSpoon(src);

        if(intruMethodCall) {
            applyProcessor(factory, new MethodLoggingInstrumenter());
        }
        if(intruVariable) {
            applyProcessor(factory, new VariableLoggingInstrumenter());
        }
        if(intruError) {
            applyProcessor(factory, new ErrorLoggingInstrumenter());
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
        FileUtils.copyFileToDirectory(new File(System.getProperty("user.dir")+"/src/main/java/fr/inria/diversify/sosie/logger/LogWriter.java"),dir);
        FileUtils.copyFileToDirectory(new File(System.getProperty("user.dir")+"/src/main/java/fr/inria/diversify/sosie/logger/ShutdownHookLog.java"),dir);
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
}
