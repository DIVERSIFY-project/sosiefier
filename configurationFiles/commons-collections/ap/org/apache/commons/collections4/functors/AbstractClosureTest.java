package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Closure;
import org.junit.Test;

public abstract class AbstractClosureTest {
    @Test
    public void closureSanityTests() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "closureSanityTests");
        final Closure<?> closure = generateClosure();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4410,closure);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * @return a closure for general sanity tests.
     */
protected abstract <T>Closure<T> generateClosure();
}

