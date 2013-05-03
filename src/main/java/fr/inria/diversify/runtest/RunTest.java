package fr.inria.diversify.runtest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

/**
 * User: Simon
 * Date: 4/30/13
 * Time: 10:15 AM
 */


public class RunTest {

    protected Class<?> testClasses;
    protected ClassLoader classLoader;

    public RunTest(String testClasses, List<String> classPath) throws MalformedURLException, ClassNotFoundException {
        URL[] urls  = new URL[classPath.size()];
        for (int i = 0; i < classPath.size(); i++) {
            urls[i] = new URL("file://"+classPath.get(i));
        }
        classLoader = new URLClassLoader(urls,Thread.currentThread().getContextClassLoader());

        this.testClasses = classLoader.loadClass(testClasses);
    }

    public Result run() {
        System.out.println("run test class: "+testClasses.getName());
        Result result = JUnitCore.runClasses(testClasses);
        System.out.println("number of failure: "+result.getFailures().size());
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.getDescription().getTestClass().getName()+":"+failure.getDescription().getMethodName());
        }
        return  result;
    }
}
