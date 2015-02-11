package org.apache.commons.io;

import org.junit.Test;

/** 
 * Tests {@link Charsets}.
 * 
 * @version $Id: CharEncodingTest.java 1298985 2012-03-09 19:12:49Z ggregory $
 */
public class CharsetsTestCase {
    @Test
    public void testToCharset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToCharset");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1793,null,1792,java.nio.charset.Charset.defaultCharset());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1795,null,1794,org.apache.commons.io.Charsets.toCharset(((java.lang.String)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1797,null,1796,java.nio.charset.Charset.defaultCharset());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1799,null,1798,org.apache.commons.io.Charsets.toCharset(((java.nio.charset.Charset)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1801,null,1800,java.nio.charset.Charset.defaultCharset());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1803,null,1802,org.apache.commons.io.Charsets.toCharset(java.nio.charset.Charset.defaultCharset()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1805,null,1804,java.nio.charset.Charset.forName("UTF-8"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1807,null,1806,org.apache.commons.io.Charsets.toCharset(java.nio.charset.Charset.forName("UTF-8")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIso8859_1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIso8859_1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1791,org.apache.commons.io.Charsets.ISO_8859_1,1790,org.apache.commons.io.Charsets.ISO_8859_1.name());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUsAscii() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUsAscii");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1809,org.apache.commons.io.Charsets.US_ASCII,1808,org.apache.commons.io.Charsets.US_ASCII.name());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUtf16() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUtf16");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,org.apache.commons.io.Charsets.UTF_16,1810,org.apache.commons.io.Charsets.UTF_16.name());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUtf16Be() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUtf16Be");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1813,org.apache.commons.io.Charsets.UTF_16BE,1812,org.apache.commons.io.Charsets.UTF_16BE.name());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUtf16Le() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUtf16Le");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1815,org.apache.commons.io.Charsets.UTF_16LE,1814,org.apache.commons.io.Charsets.UTF_16LE.name());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUtf8() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUtf8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,org.apache.commons.io.Charsets.UTF_8,1816,org.apache.commons.io.Charsets.UTF_8.name());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

