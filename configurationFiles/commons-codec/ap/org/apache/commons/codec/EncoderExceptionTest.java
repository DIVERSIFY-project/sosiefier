package org.apache.commons.codec;

import org.junit.Test;

/** 
 * Tests {@link EncoderException}.
 * 
 * @version $Id$
 */
public class EncoderExceptionTest {
    private static final String MSG = "TEST";

    private static final Throwable t = new Exception();

    @Test
    public void testConstructor0() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor0");
        final EncoderException e = new EncoderException();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2704,e,2703,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2706,e,2705,e.getCause());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructorString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorString");
        final EncoderException e = new EncoderException(MSG);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2725,org.apache.commons.codec.EncoderExceptionTest.MSG);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2709,e,2708,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2711,e,2710,e.getCause());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructorStringThrowable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorStringThrowable");
        final EncoderException e = new EncoderException(MSG , t);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2726,org.apache.commons.codec.EncoderExceptionTest.MSG);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2714,e,2713,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2727,org.apache.commons.codec.EncoderExceptionTest.t);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2717,e,2716,e.getCause());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructorThrowable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorThrowable");
        final EncoderException e = new EncoderException(t);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2729,org.apache.commons.codec.EncoderExceptionTest.t.getClass(),2728,org.apache.commons.codec.EncoderExceptionTest.t.getClass().getName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2721,e,2720,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2730,org.apache.commons.codec.EncoderExceptionTest.t);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2724,e,2723,e.getCause());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

