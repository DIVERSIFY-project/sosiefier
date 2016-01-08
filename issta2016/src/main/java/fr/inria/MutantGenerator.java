package fr.inria;

import fr.inria.diversify.buildSystem.DiversifyClassLoader;
import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.dspot.JunitRunner;
import fr.inria.diversify.factories.DiversityCompiler;
import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.mutation.MutationTransformation;
import fr.inria.diversify.transformation.query.MutationQuery;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import spoon.compiler.Environment;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 08/01/16
 * Time: 10:04
 */
public class MutantGenerator {
    protected final InputProgram inputProgram;
    protected InputConfiguration inputConfiguration;
    protected DiversityCompiler compiler;
//    protected DiversifyClassLoader applicationClassLoader;
    protected Set<String> filter;

    public MutantGenerator(String propertiesFile) throws Exception, InvalidSdkException {
        inputConfiguration = new InputConfiguration(propertiesFile);
        InitUtils.initLogLevel(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);

        String outputDirectory = inputConfiguration.getProperty("tmpDir") + "/tmp_" + System.currentTimeMillis();

        FileUtils.copyDirectory(new File(inputProgram.getProgramDir()), new File(outputDirectory));
        inputProgram.setProgramDir(outputDirectory);

        InitUtils.initDependency(inputConfiguration);
        initFilter();
        initCompiler(outputDirectory);
    }


    protected CtClass original;
    public void generateMutant(String className) throws Exception {
        List<CtClass> classes = inputProgram.getAllElement(CtClass.class);
        CtClass cl = classes.stream()
                .filter(c -> c.getQualifiedName().equals(className))
                .findFirst()
                .orElse(null);

        original = cl;

        Map<String, CtClass> mutants = generateAllMutant(cl);
        Map<String, Set<Failure>> mutantsFailures = runMutants(mutants);
        Log.debug("");
    }

    protected Map<String, Set<Failure>> runMutants(Map<String, CtClass> mutants) throws Exception {
        Map<String, Set<Failure>> mutantsFailures = new HashMap<>();

        Log.debug("init failure filter");
        Set<String> failureFilter = initFailureFilter();

        for(String mutantId : mutants.keySet()) {
            try {
                Log.debug("run mutant: {}", mutantId);
                boolean status = writeAndCompile(mutants.get(mutantId));
                if (status) {
                    Result result = runTests(buildClassLoader());
                    Set<Failure> failures = getFailures(result, failureFilter);
                    mutantsFailures.put(mutantId, failures);
                    Log.debug("number of test failure: {}", failures.size());

                    List<String> verifyFailure = verifyFailure(mutants.get(mutantId));
                    if (verifyFailure.size() != failures.size()) {
                        Log.debug("");
                    }
            }else{
                Log.debug("mutant not compile");
            }
        }catch(Exception e){
                e.printStackTrace();
            }
        }
        return mutantsFailures;
    }

    protected List<String> verifyFailure(CtClass cl) throws InterruptedException, IOException {

        LoggerUtils.printJavaFile(new File(inputProgram.getAbsoluteSourceCodeDir()), cl);
        String[] phases  = new String[]{"clean", "test"};
        MavenBuilder builder = new MavenBuilder(inputProgram.getProgramDir());

        builder.setGoals(phases);
        builder.initTimeOut();

        LoggerUtils.printJavaFile(new File(inputProgram.getAbsoluteSourceCodeDir()), original);

        return builder.getFailedTests();
    }


    protected Set<Failure> getFailures(Result result, Set<String> failureFilter) {
        return result.getFailures().stream()
                .filter(failure -> !failureFilter.contains(failure.getDescription().getMethodName()))
                .collect(Collectors.toSet());

    }

    protected DiversifyClassLoader buildClassLoader() {
        List<String> classPaths = new ArrayList<>(2);
        classPaths.add(inputProgram.getProgramDir() + "/" + inputProgram.getClassesDir());
        classPaths.add(inputProgram.getProgramDir() + "/" + inputProgram.getTestClassesDir());
        return new DiversifyClassLoader(Thread.currentThread().getContextClassLoader(), classPaths);
    }

    protected Set<String> initFailureFilter() throws IOException, ClassNotFoundException {
        Result result = runTests(buildClassLoader());

       return result.getFailures().stream()
               .map(failure -> failure.getDescription().getMethodName())
               .collect(Collectors.toSet());
    }

    protected Result runTests(DiversifyClassLoader classLoader) throws ClassNotFoundException {
        JunitRunner junitRunner = new JunitRunner(inputProgram, classLoader);

        List<String> testsName = getAllTest().stream()
                .map(test -> test.getQualifiedName())
                .collect(Collectors.toList());
        return junitRunner.runTestClasses(testsName);
    }

    protected Map<String, CtClass> generateAllMutant(CtClass cl) throws Exception {
        Map<String, CtClass> mutants = new HashMap<>();
        MutationQuery query = new MutationQuery(inputProgram);
        Map<String, MutationTransformation> transformations = query.getAllTransformationFor(cl);

        String tmpDir = inputConfiguration.getProperty("tmpDir") + "/tmp_" + System.currentTimeMillis();
        File tmpDirFile = new File(tmpDir);
        tmpDirFile.mkdirs();

        for(String id : transformations.keySet()) {
            Transformation trans = transformations.get(id);
            trans.apply(tmpDir);

            CtClass mutant = inputProgram.getFactory().Core().clone(cl);
            mutant.setParent(cl.getParent());
            mutants.put(id, mutant);

            trans.restore(tmpDir);
        }

        FileUtils.forceDelete(tmpDirFile);
        return mutants;
    }

    protected void initFilter() {
        filter = new HashSet<>();
        for(String s : inputConfiguration.getProperty("filter").split(";") ) {
            filter.add(s);
        }
    }

    protected void initCompiler(String tmpDir) throws IOException, InterruptedException {
        compiler = InitUtils.initSpoonCompiler(inputProgram, true);
        compileClasses();

        if(compiler.getDestinationDirectory() == null) {
            File classOutputDir = new File(inputProgram.getProgramDir() + "/" + inputProgram.getClassesDir());
            if (!classOutputDir.exists()) {
                classOutputDir.mkdirs();
            }
            compiler.setDestinationDirectory(classOutputDir);
        }
        if(compiler.getOutputDirectory().toString().equals("spooned")) {
            File sourceOutputDir = new File(tmpDir + "/tmpSrc" );
            if (!sourceOutputDir.exists()) {
                sourceOutputDir.mkdirs();
            }
            compiler.setOutputDirectory(sourceOutputDir);
        }
        compiler.setCustomClassLoader(buildClassLoader());

        Environment env = compiler.getFactory().getEnvironment();
        env.setDefaultFileGenerator(new JavaOutputProcessor(compiler.getOutputDirectory(),
                new DefaultJavaPrettyPrinter(env)));
    }

    protected void compileClasses() throws InterruptedException, IOException {
        String[] phases  = new String[]{"clean", "test-compile"};
        MavenBuilder builder = new MavenBuilder(inputProgram.getProgramDir());

        builder.setGoals(phases);
        builder.initTimeOut();
//        InitUtils.addApplicationClassesToClassPath(inputProgram);
    }

    protected boolean writeAndCompile(CtClass classInstru) throws IOException {
        FileUtils.cleanDirectory(compiler.getOutputDirectory());
//        FileUtils.cleanDirectory(compiler.getDestinationDirectory());
        try {
            LoggerUtils.printJavaFile(compiler.getOutputDirectory(), classInstru);
            return compiler.compileFileIn(compiler.getOutputDirectory(), true);
        } catch (Exception e) {
            Log.warn("error during compilation",e);
            return false;
        }
    }

    protected List<CtClass> getAllTest() {
        List<CtClass> classes = inputProgram.getAllElement(CtClass.class);

        return classes.stream()
                .filter(cl -> !cl.getModifiers().contains(ModifierKind.ABSTRACT))
                .filter(cl -> cl.getSimpleName().startsWith("Test") || cl.getSimpleName().endsWith("Test"))
                .filter(cl -> cl.getPosition().getFile().toString().contains(inputProgram.getRelativeTestSourceCodeDir()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws InvalidSdkException, Exception {
        MutantGenerator mutantGenerator = new MutantGenerator(args[0]);
        mutantGenerator.generateMutant(args[1]);
    }
}
