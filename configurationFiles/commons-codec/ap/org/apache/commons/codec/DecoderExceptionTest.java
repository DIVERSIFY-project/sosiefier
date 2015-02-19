package org.apache.commons.codec;

import org.junit.Test;

/** 
 * Tests {@link DecoderException}.
 * 
 * @version $Id$
 */
public class DecoderExceptionTest {
    private static final String MSG = "TEST";

    private static final Throwable t = new Exception();

    @Test
    public void testConstructor0() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor0");
        final DecoderException e = new DecoderException();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2704,e,2703,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2706,e,2705,e.getCause());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructorString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorString");
        final DecoderException e = new DecoderException(MSG);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2707,org.apache.commons.codec.DecoderExceptionTest.MSG);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2709,e,2708,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2711,e,2710,e.getCause());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructorStringThrowable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorStringThrowable");
        final DecoderException e = new DecoderException(MSG , t);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2712,org.apache.commons.codec.DecoderExceptionTest.MSG);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2714,e,2713,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2715,org.apache.commons.codec.DecoderExceptionTest.t);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2717,e,2716,e.getCause());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructorThrowable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorThrowable");
        final DecoderException e = new DecoderException(t);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2719,org.apache.commons.codec.DecoderExceptionTest.t.getClass(),2718,org.apache.commons.codec.DecoderExceptionTest.t.getClass().getName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2721,e,2720,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2722,org.apache.commons.codec.DecoderExceptionTest.t);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2724,e,2723,e.getCause());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

