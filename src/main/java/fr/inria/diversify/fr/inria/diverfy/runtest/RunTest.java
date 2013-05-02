package fr.inria.diversify.fr.inria.diverfy.runtest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * User: Simon
 * Date: 4/30/13
 * Time: 10:15 AM
 */


public class RunTest {

//    RunTest(Collection<Class<?>> testClasses,)
    public  void run() {
        Result result = JUnitCore.runClasses(RunTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
