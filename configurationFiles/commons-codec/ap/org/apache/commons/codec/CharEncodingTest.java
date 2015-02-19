package org.apache.commons.codec;

import org.junit.Test;

/** 
 * Sanity checks for {@link CharEncoding}.
 * 
 * @version $Id$
 */
public class CharEncodingTest {
    /** 
     * We could make the constructor private in the future, it's a matter a style.
     */
@Test
    public void testConstructor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor");
        new CharEncoding();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIso8859_1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIso8859_1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2669,org.apache.commons.codec.CharEncoding.ISO_8859_1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUsAscii() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUsAscii");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,org.apache.commons.codec.CharEncoding.US_ASCII);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUtf16() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUtf16");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2671,org.apache.commons.codec.CharEncoding.UTF_16);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUtf16Be() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUtf16Be");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,org.apache.commons.codec.CharEncoding.UTF_16BE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUtf16Le() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUtf16Le");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2673,org.apache.commons.codec.CharEncoding.UTF_16LE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUtf8() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUtf8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,org.apache.commons.codec.CharEncoding.UTF_8);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

