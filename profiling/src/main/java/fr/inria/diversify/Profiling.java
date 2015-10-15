package fr.inria.diversify;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.processor.ProcessorUtil;
import fr.inria.diversify.processor.main.*;
import fr.inria.diversify.processor.test.*;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import spoon.processing.Processor;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * User: Simon
 * Date: 19/06/15
 * Time: 13:06
 */
public class Profiling {
    protected String logger;
    protected InputProgram inputProgram;
    protected Properties properties;
    protected Transformation transformation;


    public Profiling(InputProgram originalProgram, String outputDirectory, String logger, Properties properties) {
        this.inputProgram = originalProgram.clone();
        this.inputProgram.setProgramDir(outputDirectory);
        this.properties = properties;
        this.logger = logger;
    }

    public Profiling(InputProgram originalProgram, String outputDirectory, String logger, Properties properties, Transformation transformation) {
        this.inputProgram = originalProgram.clone();
        this.inputProgram.setProgramDir(outputDirectory);
        this.properties = properties;
        this.logger = logger;
        this.transformation = transformation;
    }

    public void apply() throws Exception {
        MavenDependencyResolver t = new MavenDependencyResolver();
        t.resolveDependencies(inputProgram);

        transformTest();
        transformMain();
        if(logger != null) {
            LoggerUtils.copyLoggerFile(inputProgram, inputProgram.getProgramDir(), logger);
        }



        ProcessorUtil.writeInfoFile(inputProgram.getProgramDir());
    }

    protected void initOutputDirectory() throws IOException {
        File dir = new File(inputProgram.getProgramDir());
        dir.mkdirs();
        FileUtils.copyDirectory(new File(inputProgram.getProgramDir()), dir);
    }

    protected void transformMain() throws IOException {
        AbstractLoggingInstrumenter.reset();
        boolean transform = false;
        String mainSrc = inputProgram.getRelativeSourceCodeDir();

        Factory factory = InitUtils.initSpoon(inputProgram, false);

        Boolean  condition = Boolean.parseBoolean(properties.getProperty("profiling.main.transformationUsed", "false"));
        transform = transform || condition;
        if(condition && transformation != null) {
            TransformationUsedProcessor transformationUsedProcessor = new TransformationUsedProcessor(inputProgram, transformation);
            transformationUsedProcessor.setLogger(logger + ".Logger");
            LoggerUtils.applyProcessor(factory, transformationUsedProcessor);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.main.field", "false"));
        transform = transform || condition;
        if(condition) {
            FieldUsedInstrumenter m = new FieldUsedInstrumenter(inputProgram, inputProgram.getProgramDir());
            m.setLogger(logger+".Logger");
            LoggerUtils.applyProcessor(factory, m);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.main.branch", "false"));
        transform = transform || condition;
        if(condition) {
            boolean addBodyBranch =  Boolean.parseBoolean(properties.getProperty("profiling.main.branch.addBodyBranch", "true"));
            BranchCoverageProcessor m = new BranchCoverageProcessor(inputProgram, inputProgram.getProgramDir(), addBodyBranch);
            m.setLogger(logger+".Logger");
            LoggerUtils.applyProcessor(factory, m);
        }



        condition = Boolean.parseBoolean(properties.getProperty("profiling.main.methodCall", "false"));
        transform = transform || condition;
        if(condition) {
            MethodCallInstrumenter m = new MethodCallInstrumenter(inputProgram);
            m.setLogger(logger+".Logger");
            LoggerUtils.applyProcessor(factory, m);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.main.catch", "false"));
        transform = transform || condition;
        if(condition) {
            CatchProcessor m = new CatchProcessor(inputProgram);
            m.setLogger(logger+".Logger");
            LoggerUtils.applyProcessor(factory, m);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.main.throw", "false"));
        transform = transform || condition;
        if(condition) {
            ThrowProcessor m = new ThrowProcessor(inputProgram);
            m.setLogger(logger+".Logger");
            LoggerUtils.applyProcessor(factory, m);
        }

        if(transform) {
            File fileFrom = new File(inputProgram.getAbsoluteSourceCodeDir());
            File out = new File(inputProgram.getProgramDir() + "/" + mainSrc);
            LoggerUtils.writeJavaClass(factory, out, fileFrom);
        }
    }

    protected void transformTest() throws IOException {
        boolean transform = false;
        String testSrc = inputProgram.getRelativeTestSourceCodeDir();

        Factory factory = InitUtils.initSpoon(inputProgram, true);

        Boolean condition = Boolean.parseBoolean(properties.getProperty("profiling.test.dataMutator", "false"));
        transform = transform || condition;
        if(condition) {
            TestDataMutator m = new TestDataMutator();
            LoggerUtils.applyProcessor(factory, m);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.test.addCall", "false"));
        transform = transform || condition;
        if(condition) {
            TestMethodCallAdder v = new TestMethodCallAdder();
            LoggerUtils.applyProcessor(factory, v);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.test.removeCall", "false"));
        transform = transform || condition;
        if(condition) {
            TestMethodCallRemover e = new TestMethodCallRemover();
            LoggerUtils.applyProcessor(factory, e);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.test.removeOriginalTest", "false"));
        transform = transform || condition;
        if(condition) {
            RemoveOriginalTestProcessor p = new RemoveOriginalTestProcessor();
            p.setLogger(logger+".Logger");
            LoggerUtils.applyProcessor(factory, p);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.test.logTest", "false"));
        transform = transform || condition;
        if(condition) {
            TestLoggingInstrumenter m = new TestLoggingInstrumenter();
            m.setLogger(logger+".Logger");
            LoggerUtils.applyProcessor(factory, m);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.test.removeAssert", "false"));
        transform = transform || condition;
        if(condition) {
            TestCaseProcessor tc = new TestCaseProcessor(testSrc, true);
            tc.setLogger(logger+".Logger");
            LoggerUtils.applyProcessor(factory, tc);
        }

        condition = Boolean.parseBoolean(properties.getProperty("profiling.test.evosuite", "false"));
        transform = transform || condition;
        if(condition) {
            Processor tc = new EvosuiteMethodProcessor();
            LoggerUtils.applyProcessor(factory, tc);

            tc = new EvosuiteClassProcessor();
            LoggerUtils.applyProcessor(factory, tc);
        }

        if(transform) {
            File fileFrom = new File(inputProgram.getAbsoluteTestSourceCodeDir());
            File out = new File(inputProgram.getProgramDir() + "/" + testSrc);
            LoggerUtils.writeJavaClass(factory, out, fileFrom);
        }
    }

}
