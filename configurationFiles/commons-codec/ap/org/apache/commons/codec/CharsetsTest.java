package org.apache.commons.codec;

import org.junit.Test;

/** 
 * Sanity checks for {@link Charsets}.
 * 
 * @version $Id: CharEncodingTest.java 1298985 2012-03-09 19:12:49Z ggregory $
 */
public class CharsetsTest {
    @Test
    public void testToCharset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCharset");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2678,null,2677,java.nio.charset.Charset.defaultCharset());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,null,2679,org.apache.commons.codec.Charsets.toCharset(((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,null,2681,java.nio.charset.Charset.defaultCharset());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2684,null,2683,org.apache.commons.codec.Charsets.toCharset(((java.nio.charset.Charset)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,null,2685,java.nio.charset.Charset.defaultCharset());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,null,2687,org.apache.commons.codec.Charsets.toCharset(java.nio.charset.Charset.defaultCharset()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,null,2689,java.nio.charset.Charset.forName("UTF-8"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,null,2691,org.apache.commons.codec.Charsets.toCharset(java.nio.charset.Charset.forName("UTF-8")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIso8859_1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIso8859_1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,org.apache.commons.codec.Charsets.ISO_8859_1,2675,org.apache.commons.codec.Charsets.ISO_8859_1.name());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUsAscii() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUsAscii");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2694,org.apache.commons.codec.Charsets.US_ASCII,2693,org.apache.commons.codec.Charsets.US_ASCII.name());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUtf16() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUtf16");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2696,org.apache.commons.codec.Charsets.UTF_16,2695,org.apache.commons.codec.Charsets.UTF_16.name());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUtf16Be() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUtf16Be");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2698,org.apache.commons.codec.Charsets.UTF_16BE,2697,org.apache.commons.codec.Charsets.UTF_16BE.name());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUtf16Le() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUtf16Le");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2700,org.apache.commons.codec.Charsets.UTF_16LE,2699,org.apache.commons.codec.Charsets.UTF_16LE.name());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUtf8() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUtf8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2702,org.apache.commons.codec.Charsets.UTF_8,2701,org.apache.commons.codec.Charsets.UTF_8.name());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

