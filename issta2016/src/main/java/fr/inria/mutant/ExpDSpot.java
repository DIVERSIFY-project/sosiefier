package fr.inria.mutant;

import fr.inria.diversify.buildSystem.DiversifyClassLoader;
import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.dspot.AssertGenerator;
import fr.inria.diversify.dspot.DSpot;
import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 14/12/15
 * Time: 14:30
 */
public class ExpDSpot {
    protected int nbVersion;
    protected InputConfiguration inputConfiguration;
    protected InputProgram inputProgram;
    protected Mutant mutant;

    BufferedWriter log;
    File resultDir;

    public ExpDSpot(String propertiesFile, int nbVersion) throws Exception, InvalidSdkException {
        this.nbVersion = nbVersion;

        inputConfiguration = new InputConfiguration(propertiesFile);
        InitUtils.initLogLevel(inputConfiguration);

        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        String tmpDir = inputConfiguration.getProperty("tmpDir") + "/tmp_" + System.currentTimeMillis();
        FileUtils.copyDirectory(new File(inputProgram.getProgramDir()), new File(tmpDir));
        inputProgram.setProgramDir(tmpDir);

        mutant = new Mutant(inputProgram, "result/test/mutant", "tmpDir/mutantTest/");
        resultDir = new File(inputConfiguration.getProperty("tmpDir") + "/DSpot_mutant" + System.currentTimeMillis());
        resultDir.mkdirs();

        initLog(inputConfiguration);
    }

    public void runExp() throws IOException {
        for(int i = 0; i <= nbVersion; i++)
            try {
                log.flush();
                AssertGenerator.initLog(resultDir.getAbsolutePath(), i);

                String mutantTestProject = mutant.checkout("tmpDir/mutantTestFT/", i, false, true);
                String  mutantApplicationProject = mutant.checkout("tmpDir/mutantTestTF/", i, true, true);

                initRegressionClassLoader(mutantApplicationProject);

                inputConfiguration.getProperties().setProperty("project", mutantTestProject);
                DSpot dSpot = new DSpot(inputConfiguration, regressionClassLoader);

                List<String> testsNameToExclude = mutant.triggerTests(i);
                List<CtClass> testClasses = run(dSpot, testsNameToExclude);
                printClasses(testClasses, resultDir.getAbsolutePath() + "/DSpotTests/" + i + "/" + inputConfiguration.getRelativeTestSourceCodeDir());
                if(verify(i, testClasses)) {
                    List<String> failures = findBug(i, testClasses);
                    if(!failures.isEmpty()) {
                        log.write("mutant "+ i +": " + failures.size() +" test fail\n");
                        for(String failure : failures) {
                            log.write("\t"+failure+ "\n");
                        }
                    } else {
                        log.write("mutant "+ i + ": all tests green\n");
                    }
                } else {
                    log.write(i + ": failing tests on correct version\n");
                }
                dSpot.clean();
            } catch (Throwable e) {
                e.printStackTrace();
                Log.debug("");
            }
        log.close();
        suicide();
    }

    protected boolean verify(int version, List<CtClass> testClasses) throws Exception {
        String  mutantApplicationProject = mutant.checkout(inputConfiguration.getProperty("tmpDir") +"/tmp"+ System.currentTimeMillis(), version, false, true);
        printClasses(testClasses, mutantApplicationProject + "/" + inputConfiguration.getRelativeTestSourceCodeDir());

        List<String> failure = runTest(mutantApplicationProject);

        FileUtils.forceDelete(new File(mutantApplicationProject));

        return failure != null && failure.isEmpty();
    }

    protected List<String> findBug(int version, List<CtClass> testClasses) throws Exception {
        String  mutantApplicationProject = mutant.checkout(inputConfiguration.getProperty("tmpDir") +"/tmp"+ System.currentTimeMillis(), version, true, true);
        printClasses(testClasses, mutantApplicationProject + "/" + inputConfiguration.getRelativeTestSourceCodeDir());

        List<String> failure = runTest(mutantApplicationProject);

        FileUtils.forceDelete(new File(mutantApplicationProject));

        return failure;
    }

    protected void initLog(InputConfiguration inputConfiguration) throws IOException {
        FileWriter fw = new FileWriter(resultDir + "/resultLog");
        log = new BufferedWriter(fw);
    }

    public static DiversifyClassLoader regressionClassLoader;
    protected void initRegressionClassLoader(String  dir) throws IOException, InterruptedException {
        List<String> classPaths = new ArrayList<>();
        classPaths.add(dir + "/" + inputConfiguration.getClassesDir());
        classPaths.add(dir + "/target/test-classes/");
        regressionClassLoader = new DiversifyClassLoader(Thread.currentThread().getContextClassLoader(), classPaths);

        Set<String> filter = new HashSet<>();
        for(String s : inputConfiguration.getProperty("filter").split(";") ) {
            filter.add(s);
        }
        regressionClassLoader.setClassFilter(filter);

        runTest(dir);
    }

    protected List<String> runTest(String dir) throws InterruptedException, IOException {
        String[] phases = new String[]{"clean", "test"};
        MavenBuilder builder = new MavenBuilder(dir);

        builder.setGoals(phases);
        builder.initTimeOut();
        if(builder.getCompileError()) {
            return null;
        }
        return builder.getFailedTests();
    }

    protected void printClasses(List<CtClass> classes, String dir) {
        File dirFile = new File(dir);
        if(!dirFile.exists()) {
            dirFile.mkdirs();
        }
        for(CtClass cl : classes) {
            try {
                LoggerUtils.printJavaFile(new File(dir), cl);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected List<CtClass> run(DSpot dSpot, List<String> testsNameToExclude) {
        Set<CtClass> testClasses = testsNameToExclude.stream()
                .map(failure -> failure.substring(0,failure.lastIndexOf(".")))
                .map(className -> findClass(className,  dSpot.getInputProgram()))
                .collect(Collectors.toSet());

        return testClasses.stream()
                .map(cl -> {
                    List<CtMethod> methods = new LinkedList<>(cl.getMethods());
                    try {
                        return dSpot.generateTest(methods, cl);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                })
                .filter(cl -> cl != null)
                .collect(Collectors.toList());
    }

    protected CtClass findClass(String className, InputProgram inputProgram) {
        List<CtClass> classes = inputProgram.getAllElement(CtClass.class);

        return classes.stream()
                .filter(cl -> cl.getQualifiedName().equals(className))
                .findFirst()
                .get();
    }

    protected static void suicide() {
        String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        Log.debug("suicide");
        Log.debug("PID :"+pid);
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("kill "+pid);
        } catch (Exception e) {
            Log.error("suicide ",e);
        }
    }

    public static void main(String[] args) throws Exception, InvalidSdkException {
        ExpDSpot exp = new ExpDSpot(args[0], Integer.parseInt(args[1]));
        exp.runExp();
    }
}
