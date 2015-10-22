package fr.inria.diversify.dspot;

import fr.inria.diversify.buildSystem.DiversifyClassLoader;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.logger.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import spoon.reflect.declaration.CtClass;

import java.io.File;
import java.util.List;
import java.util.concurrent.*;

/**
 * User: Simon
 * Date: 15/10/15
 * Time: 19:43
 */
public class JunitRunner {
    String testClassPath;
    InputProgram inputProgram;

    protected int timeout = 20;
    protected static final ExecutorService THREAD_POOL = Executors.newSingleThreadExecutor();

    public JunitRunner(InputProgram inputProgram, String testClassPath) {
        this.inputProgram = inputProgram;
        this.testClassPath = testClassPath;
    }
    protected Result runTest(List<CtClass> tests) {
        try {
            Class<?>[] testClasses = loadClass(tests, testClassPath);
            Logger.reset();
            Logger.setLogDir(new File(inputProgram.getProgramDir() + "/log/"));

            Result result = timedCall(new Callable<Result>() {
                public Result call() throws Exception {
                    return JUnitCore.runClasses(testClasses);
                }
            }, timeout, TimeUnit.SECONDS);

            Logger.close();

            loadClass(tests, inputProgram.getProgramDir() + "/" + inputProgram.getTestClassesDir());

            return result;
        } catch (Exception e) {
            return null;
        }
    }

    protected Class<?>[] loadClass(List<CtClass> tests, String classPath) throws ClassNotFoundException {
        DiversifyClassLoader classLoader = new DiversifyClassLoader(Thread.currentThread().getContextClassLoader(), classPath);

        Class<?>[] testClasses = new Class<?>[tests.size()];
        for(int i = 0; i < tests.size(); i++) {
            testClasses[i] = classLoader.loadClass(tests.get(i).getQualifiedName());
        }
        return testClasses;
    }

    protected <T> T timedCall(Callable<T> c, long timeout, TimeUnit timeUnit)
            throws InterruptedException, ExecutionException, TimeoutException
    {
        FutureTask<T> task = new FutureTask<T>(c);
        THREAD_POOL.execute(task);
        return task.get(timeout, timeUnit);
    }
}
