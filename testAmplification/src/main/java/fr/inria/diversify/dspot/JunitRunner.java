package fr.inria.diversify.dspot;


import fr.inria.diversify.logger.logger.Logger;
import fr.inria.diversify.runner.InputProgram;
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
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 15/10/15
 * Time: 19:43
 */
public class JunitRunner {
    protected ClassLoader classLoader;
    protected InputProgram inputProgram;
    protected int classTimeOut = 120;
    protected int methodTimeOut = 5;
    protected static final ExecutorService THREAD_POOL = Executors.newSingleThreadExecutor();

    public JunitRunner(InputProgram inputProgram, ClassLoader classLoader) {
        this.inputProgram = inputProgram;
        this.classLoader = classLoader;
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
        return runTestClass(test, new ArrayList<>(0));
    }

    public Result runTestClass(CtClass test, List<String> methodsToRun) {
        List<CtClass> list = new ArrayList<>(1);
        list.add(test);
        return runTestClasses(list, methodsToRun);
    }

    public Result runTestClasses(List<CtClass> tests) {
        return runTestClasses(tests, new ArrayList<>(0));
    }


    protected Result runTestClasses(List<CtClass> tests, List<String> methodsToRun) {
        try {
            Class<?>[] testClasses = loadClass(tests);
            Logger.reset();
            Logger.setLogDir(new File(inputProgram.getProgramDir() + "/log"));

            int timeOut = computeTimeOut(methodsToRun);
            Result result = runRequest(buildRequest(testClasses, methodsToRun), timeOut);

            Logger.close();
            return result;
        } catch (Exception e) {
            return null;
        }
    }

    private int computeTimeOut(List<String> methodsToRun) {
        if(methodsToRun.isEmpty()) {
            return classTimeOut;
        } else {
            return Math.min(methodsToRun.size() * methodTimeOut, classTimeOut);
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

    protected Result runRequest(Request request, int timeOut) throws InterruptedException, ExecutionException, TimeoutException {
        Result result = timedCall(new Callable<Result>() {
            public Result call() throws Exception {
                return new JUnitCore().run(request);
            }
        }, timeOut, TimeUnit.SECONDS);

        return result;
    }

    protected Class<?>[] loadClass(List<CtClass> tests) throws ClassNotFoundException {
        Class<?>[] testClasses = new Class<?>[tests.size()];
        for(int i = 0; i < tests.size(); i++) {
            testClasses[i] = classLoader.loadClass(tests.get(i).getQualifiedName());
        }
        return testClasses;
    }

    protected <T> T timedCall(Callable<T> c, long timeout, TimeUnit timeUnit)
            throws InterruptedException, ExecutionException, TimeoutException {
        FutureTask<T> task = new FutureTask<T>(c);
        THREAD_POOL.execute(task);
        return task.get(timeout, timeUnit);
    }
}