package org.apache.commons.io;

import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Tests IOExceptionWithCause
 * 
 * @version $Id$
 */
public class IOExceptionWithCauseTestCase extends TestCase {
    /** 
     * Tests the {@link IOExceptionWithCause#IOExceptionWithCause(String,Throwable)} constructor.
     */
@Test(timeout = 1000)
    public void testIOExceptionStringThrowable_add1773() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIOExceptionStringThrowable_add1773");
        Throwable cause = new IllegalArgumentException("cause");
        IOExceptionWithCause exception = new IOExceptionWithCause("message" , cause);
        validate(exception, cause, "message");
        validate(exception, cause, "message");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link IOExceptionWithCause#IOExceptionWithCause(String,Throwable)} constructor.
     */
public void testIOExceptionStringThrowable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIOExceptionStringThrowable");
        Throwable cause = new IllegalArgumentException("bar");
        IOExceptionWithCause exception = new IOExceptionWithCause("message" , cause);
        validate(exception, cause, "message");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link IOExceptionWithCause#IOExceptionWithCause(String,Throwable)} constructor.
     */
public void testIOExceptionStringThrowable_literalMutation6244() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIOExceptionStringThrowable_literalMutation6244");
        Throwable cause = new IllegalArgumentException("cause");
        IOExceptionWithCause exception = new IOExceptionWithCause("foo" , cause);
        validate(exception, cause, "message");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link IOExceptionWithCause#IOExceptionWithCause(String,Throwable)} constructor.
     */
public void testIOExceptionStringThrowable_literalMutation6245() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIOExceptionStringThrowable_literalMutation6245");
        Throwable cause = new IllegalArgumentException("cause");
        IOExceptionWithCause exception = new IOExceptionWithCause("message" , cause);
        validate(exception, cause, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link IOExceptionWithCause#IOExceptionWithCause(String,Throwable)} constructor.
     */
@Test(timeout = 1000)
    public void testIOExceptionStringThrowable_remove1340() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIOExceptionStringThrowable_remove1340");
        Throwable cause = new IllegalArgumentException("cause");
        IOExceptionWithCause exception = new IOExceptionWithCause("message" , cause);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link IOExceptionWithCause#IOExceptionWithCause(Throwable)} constructor.
     */
@Test(timeout = 1000)
    public void testIOExceptionThrowable_add1774() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIOExceptionThrowable_add1774");
        Throwable cause = new IllegalArgumentException("cause");
        IOExceptionWithCause exception = new IOExceptionWithCause(cause);
        validate(exception, cause, "java.lang.IllegalArgumentException: cause");
        validate(exception, cause, "java.lang.IllegalArgumentException: cause");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link IOExceptionWithCause#IOExceptionWithCause(Throwable)} constructor.
     */
public void testIOExceptionThrowable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIOExceptionThrowable");
        Throwable cause = new IllegalArgumentException("bar");
        IOExceptionWithCause exception = new IOExceptionWithCause(cause);
        validate(exception, cause, "java.lang.IllegalArgumentException: cause");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link IOExceptionWithCause#IOExceptionWithCause(Throwable)} constructor.
     */
public void testIOExceptionThrowable_literalMutation6247() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIOExceptionThrowable_literalMutation6247");
        Throwable cause = new IllegalArgumentException("cause");
        IOExceptionWithCause exception = new IOExceptionWithCause(cause);
        validate(exception, cause, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link IOExceptionWithCause#IOExceptionWithCause(Throwable)} constructor.
     */
@Test(timeout = 1000)
    public void testIOExceptionThrowable_remove1341() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIOExceptionThrowable_remove1341");
        Throwable cause = new IllegalArgumentException("cause");
        IOExceptionWithCause exception = new IOExceptionWithCause(cause);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    void validate(Throwable throwable, Throwable expectedCause, String expectedMessage) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5339,expectedMessage);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5341,throwable,5340,throwable.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5342,expectedCause);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5344,throwable,5343,throwable.getCause());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5345,expectedCause);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5347,throwable,5346,throwable.getCause());
    }
}

