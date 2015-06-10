package harman;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.util.JavaOutputProcessorWithFilter;
import spoon.compiler.Environment;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.QueueProcessingManager;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Simon on 20/02/15.
 */
public class Harman {
    protected Result result;
    protected Map<CtClass, Set<CtMethod>> originalTests;
 //   protected Map<CtClass, Set<CtMethod>> newTests;
    protected String tmpDir;
    InputProgram inputProgram;
    protected AbstractBuilder builder;
    List<CtClass> applicationClasses;
    protected String resultDir;

    public Harman(InputConfiguration inputConfiguration) {
        this.resultDir = inputConfiguration.getResultPath();
        this.inputProgram = inputConfiguration.getInputProgram();
        result = new Result();
    }

    public void run() throws IOException, InterruptedException {
        Algo algo = new Algo(tmpDir, inputProgram, builder, applicationClasses, result);
        algo.initFitnessValue();
        for(CtClass testClass : originalTests.keySet()) {

            algo.testDataRegeneration(originalTests.get(testClass), testClass);
          //  newTests.put(testClass,newTest);


            builder.setGoals(new String[]{"clean", "test"});
            builder.runBuilder();
        }
        generateNewSource();
        writeJavaClass();

        File file = new File(resultDir);
        if(!file.exists()) {
            file.mkdirs();
        }
        result.printCSVSummary(resultDir+ "/csvSummary.csv");
        result.printSummary(resultDir+ "/summary");
    }

    public void init(String tmpDir) throws IOException, InterruptedException {
        this.tmpDir = tmpDir;
        originalTests = new HashMap<>();
      //  newTests = new HashMap<>();

        for(CtElement element : inputProgram.getAllElement(CtClass.class)) {
            CtClass cl = (CtClass) element;
            if(isTestClass(cl)) {
                originalTests.put(cl, new HashSet<>());
                for(Object o : cl.getMethods()) {
                    CtMethod method = (CtMethod) o;
                    if(isTestMethod(method)) {
                        originalTests.get(cl).add(method);
                    }
                }
            }
        }
//        initDirectory();
        initBuilder();
        initApplicationClasses();
    }

    protected void initApplicationClasses() throws IOException {
        String applicationSourceDir = (new File(tmpDir + "/" +inputProgram.getRelativeSourceCodeDir())).getCanonicalFile().getCanonicalPath();
        applicationClasses = inputProgram.getAllElement(CtClass.class).stream()
                .map(o -> (CtClass) o)
                .filter(cl -> cl.getPosition().getFile().getAbsolutePath().contains(applicationSourceDir))
                .collect(Collectors.toList());
    }

    protected boolean isTestClass(CtClass candidate) {
        return candidate.getSimpleName().contains("Test");
    }

    protected boolean isTestMethod(CtMethod candidate) {
        boolean isAnnotationTest = candidate.getAnnotations().stream()
                                             .map(annotation -> annotation.toString())
                                             .anyMatch(annotation -> annotation.startsWith("@org.junit.Test"));
        boolean isOldTest = candidate.getSimpleName().contains("test")
                && candidate.getParameters().isEmpty()
                && !candidate.getModifiers().contains(ModifierKind.PRIVATE);

        return isAnnotationTest || isOldTest;
    }


    protected void initBuilder() throws InterruptedException, IOException {
        String[] phases  = new String[]{"clean", "test" };
        builder = new MavenBuilder(tmpDir);

        builder.setGoals(phases);
        builder.initTimeOut();
    }

    protected void generateNewSource() {
        for(CtClass cl : result.getNewTestByClasses().keySet()) {
            for (CtMethod method : result.getNewTestByClasses().get(cl)) {
//            method.setDocComment(method.getDocComment()+ "\nsearchRadius: "+ testMethods.get(method));
                cl.addMethod(method);
            }
        }
        writeJavaClass();
    }

    protected void writeJavaClass() {
        File fileFrom = new File(inputProgram.getAbsoluteTestSourceCodeDir());
        File out = new File(tmpDir + "/" + inputProgram.getRelativeTestSourceCodeDir());
        Environment env = inputProgram.getFactory().getEnvironment();
        AbstractProcessor processor = new JavaOutputProcessorWithFilter(out, new DefaultJavaPrettyPrinter(env), allClassesName(fileFrom));
        applyProcessor(inputProgram.getFactory(), processor);
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
