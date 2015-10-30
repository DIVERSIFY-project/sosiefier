package fr.inria.diversify.dspot;

import fr.inria.diversify.buildSystem.DiversifyClassLoader;
import fr.inria.diversify.compare.ObjectLog;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.logger.Logger;
import org.junit.internal.requests.FilterRequest;
import org.junit.runner.Computer;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 15/10/15
 * Time: 19:43
 */
public class JunitRunner {
    String testClassPath;
    InputProgram inputProgram;
    protected int timeout = 60;
    protected static final ExecutorService THREAD_POOL = Executors.newSingleThreadExecutor();

    public JunitRunner(InputProgram inputProgram, String testClassPath) {
        this.inputProgram = inputProgram;
        this.testClassPath = testClassPath;
    }

    public Result runTestMethods(List<CtMethod> methods) {
        List<CtClass> list = methods.stream()
                .map(mth -> mth.getParent())
                .map(cl -> (CtClass) cl)
                .distinct()
                .collect(Collectors.toList());

        List<String> methodName = methods.stream()
                .map(mth -> mth.getSimpleName())
                .collect(Collectors.toList());
        return runTestClasses(list, methodName);
    }

    public Result runTestClass(CtClass test) {
        List<CtClass> list = new ArrayList<>(1);
        list.add(test);
        return runTestClasses(list, new ArrayList<>(0));
    }

    public Result runTestClasses(List<CtClass> tests) {
        return runTestClasses(tests, new ArrayList<>(0));
    }

    protected Result runTestClasses(List<CtClass> tests, List<String> methodsToRun) {
        try {
            Class<?>[] testClasses = loadClass(tests, testClassPath);
            Logger.reset();
            Logger.setLogDir(new File(inputProgram.getProgramDir() + "/log/"));
            Result result = runRequest(buildRequest(testClasses, methodsToRun));

            Logger.close();
//            loadClass(tests, inputProgram.getProgramDir() + "/" + inputProgram.getTestClassesDir());
        return result;
        } catch (Exception e) {
             return null;
        }
    }



    protected Request buildRequest(Class<?>[] testClasses, List<String> methodsToRun) {
        Request classesRequest = Request.classes(new Computer(), testClasses);
        if(methodsToRun.isEmpty()) {
            return classesRequest;
        } else {
            return new FilterRequest(classesRequest, new MethodFilter(methodsToRun));
        }
    }

    protected Result runRequest(Request request) throws InterruptedException, ExecutionException, TimeoutException {
        return timedCall(new Callable<Result>() {
            public Result call() throws Exception {
                return new JUnitCore().run(request);
            }
        }, timeout, TimeUnit.SECONDS);
    }

    protected Class<?>[] loadClass(List<CtClass> tests, String classPath) throws ClassNotFoundException {
        DiversifyClassLoader classLoader = new DiversifyClassLoader(Thread.currentThread().getContextClassLoader(), classPath);
        classLoader.setClassFilter(tests.stream().map(cl -> cl.getQualifiedName()).collect(Collectors.toList()));

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
