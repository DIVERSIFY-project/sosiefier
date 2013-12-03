package fr.inria.diversify.transformation.builder;


import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/**
 * User: Simon
 * Date: 29/11/13
 * Time: 10:21
 */
public class FailFastListener extends RunListener {

    public void testAssumptionFailure(Failure failure) {
        System.err.println("FAILURE: " + failure);
        System.exit(-1);
    }

    public void testFailure(Failure failure) throws Exception {
        System.err.println("FAILURE: " + failure);
        System.exit(-1);
    }
}
