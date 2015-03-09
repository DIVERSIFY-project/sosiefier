package org.apache.commons.collections4.functors;

import org.junit.Before;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public abstract class AbstractPredicateTest {
    protected Object cObject;

    protected String cString;

    protected Integer cInteger;

    @Before
    public void initialiseTestObjects() throws Exception {
        cObject = new Object();
        cString = "Hello";
        cInteger = Integer.valueOf(6);
    }

    @Test
    public void predicateSanityTests() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "predicateSanityTests");
        final Predicate<?> predicate = generatePredicate();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4419,predicate);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * @return a predicate for general sanity tests.
     */
protected abstract Predicate<?> generatePredicate();

    protected <T>void assertFalse(final Predicate<T> predicate, final T testObject) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4416,predicate,4415,predicate.evaluate(testObject));
    }

    protected <T>void assertTrue(final Predicate<T> predicate, final T testObject) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4418,predicate,4417,predicate.evaluate(testObject));
    }
}

