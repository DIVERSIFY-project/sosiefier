package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoderAbstractTest;
import org.junit.Test;

/** 
 * Tests the <code>ColognePhonetic</code> class.
 * 
 * <p>Keep this file in UTF-8 encoding for proper Javadoc processing.</p>
 * 
 */
public class ColognePhoneticTest extends StringEncoderAbstractTest<org.apache.commons.codec.language.ColognePhonetic> {
    @Override
    protected ColognePhonetic createStringEncoder() {
        return new ColognePhonetic();
    }

    @Test(timeout = 1000)
    public void testAabjoe_add138() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAabjoe_add138");
        checkEncoding("01", "Aabjoe");
        checkEncoding("01", "Aabjoe");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testAabjoe() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAabjoe");
        checkEncoding("foo", "Aabjoe");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testAabjoe_literalMutation565() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAabjoe_literalMutation565");
        checkEncoding("01", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAabjoe_remove121() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAabjoe_remove121");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAaclan_add139() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAaclan_add139");
        checkEncoding("0856", "Aaclan");
        checkEncoding("0856", "Aaclan");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testAaclan() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAaclan");
        checkEncoding("foo", "Aaclan");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testAaclan_literalMutation567() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAaclan_literalMutation567");
        checkEncoding("0856", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAaclan_remove122() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAaclan_remove122");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests [CODEC-122]
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testAychlmajrForCodec122_add140() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAychlmajrForCodec122_add140");
        checkEncoding("04567", "Aychlmajr");
        checkEncoding("04567", "Aychlmajr");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests [CODEC-122]
     * 
     * @throws EncoderException
     */
@Test
    public void testAychlmajrForCodec122() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAychlmajrForCodec122");
        checkEncoding("foo", "Aychlmajr");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests [CODEC-122]
     * 
     * @throws EncoderException
     */
@Test
    public void testAychlmajrForCodec122_literalMutation569() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAychlmajrForCodec122_literalMutation569");
        checkEncoding("04567", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests [CODEC-122]
     * 
     * @throws EncoderException
     */
@Test(timeout = 1000)
    public void testAychlmajrForCodec122_remove123() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAychlmajrForCodec122_remove123");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEdgeCases_add141() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_add141");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases");
        final String[][] data = new String[][]{ new String[]{ "foo" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation571() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation571");
        final String[][] data = new String[][]{ new String[]{ "a" , "foo" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation572() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation572");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation573() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation573");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "foo" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation574() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation574");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation575() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation575");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "foo" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation576() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation576");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation577() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation577");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "foo" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation578() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation578");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation579() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation579");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "foo" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation580() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation580");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation581() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation581");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "foo" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation582() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation582");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation583() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation583");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "foo" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation584() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation584");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation585() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation585");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "foo" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation586() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation586");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation587() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation587");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "foo" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation588() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation588");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation589() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation589");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "foo" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation590() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation590");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "foo" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation591() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation591");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "foo" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation592() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation592");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "foo" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation593() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation593");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "foo" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation594() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation594");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "foo" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation595() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation595");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "foo" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation596() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation596");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "foo" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation597() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation597");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "foo" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation598() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation598");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "foo" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation599() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation599");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "foo" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation600() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation600");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "foo" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation601() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation601");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "foo" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation602() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation602");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "foo" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation603() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation603");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "foo" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation604() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation604");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "foo" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation605() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation605");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "foo" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation606() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation606");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "foo" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation607() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation607");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "foo" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation608() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation608");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "foo" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation609() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation609");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "foo" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation610() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation610");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "foo" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation611() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation611");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "foo" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation612() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation612");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "foo" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation613() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation613");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "foo" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation614() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation614");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "foo" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation615() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation615");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "foo" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation616() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation616");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "foo" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation617() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation617");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "foo" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation618() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation618");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "foo" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation619() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation619");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "foo" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation620() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation620");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "foo" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation621() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation621");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "foo" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation622() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation622");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "foo" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation623() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation623");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "foo" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation624() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation624");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "foo" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation625() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation625");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "foo" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation626() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation626");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "foo" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation627() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation627");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "foo" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEdgeCases_remove124() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_remove124");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExamples_add142() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_add142");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples");
        final String[][] data = new String[][]{ new String[]{ "foo" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation629() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation629");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "foo" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation630() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation630");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "foo" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation631() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation631");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "foo" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation632() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation632");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "foo" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation633() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation633");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "foo" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation634() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation634");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "foo" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation635() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation635");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "foo" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation636() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation636");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "foo" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation637() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation637");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "foo" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation638() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation638");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "foo" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation639() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation639");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "foo" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation640() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation640");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "foo" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation641() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation641");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "foo" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation642() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation642");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "foo" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation643() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation643");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "foo" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation644() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation644");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "foo" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation645() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation645");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "foo" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation646() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation646");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "foo" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation647() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation647");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "foo" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation648() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation648");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "foo" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation649() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation649");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "foo" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation650() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation650");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "foo" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation651() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation651");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "foo" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation652() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation652");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "foo" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation653() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation653");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "foo" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation654() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation654");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "foo" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation655() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation655");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "foo" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation656() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation656");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "foo" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation657() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation657");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "foo" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation658() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation658");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "foo" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation659() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation659");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "foo" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation660() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation660");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "foo" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation661() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation661");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "foo" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation662() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation662");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "foo" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation663() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation663");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "foo" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation664() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation664");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "foo" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation665() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation665");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "foo" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation666() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation666");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "foo" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation667() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation667");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "foo" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation668() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation668");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "foo" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation669() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation669");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "foo" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation670() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation670");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "foo" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation671() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation671");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "foo" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation672() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation672");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "foo" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation673() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation673");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "foo" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation674() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation674");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "foo" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation675() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation675");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "foo" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation676() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation676");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "foo" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation677() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation677");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "foo" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation678() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation678");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "foo" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation679() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation679");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "foo" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation680() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation680");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "foo" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation681() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation681");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "foo" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation682() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation682");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "foo" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation683() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation683");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "foo" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExamples_remove125() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_remove125");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHyphen_add143() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHyphen_add143");
        final String[][] data = new String[][]{ new String[]{ "bergisch-gladbach" , "174845214" } , new String[]{ "Müller-Lüdenscheidt" , "65752682" } };
        checkEncodings(data);
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHyphen() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHyphen");
        final String[][] data = new String[][]{ new String[]{ "foo" , "174845214" } , new String[]{ "Müller-Lüdenscheidt" , "65752682" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHyphen_literalMutation685() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHyphen_literalMutation685");
        final String[][] data = new String[][]{ new String[]{ "bergisch-gladbach" , "foo" } , new String[]{ "Müller-Lüdenscheidt" , "65752682" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHyphen_literalMutation686() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHyphen_literalMutation686");
        final String[][] data = new String[][]{ new String[]{ "bergisch-gladbach" , "174845214" } , new String[]{ "foo" , "65752682" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHyphen_literalMutation687() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHyphen_literalMutation687");
        final String[][] data = new String[][]{ new String[]{ "bergisch-gladbach" , "174845214" } , new String[]{ "Müller-Lüdenscheidt" , "foo" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHyphen_remove126() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHyphen_remove126");
        final String[][] data = new String[][]{ new String[]{ "bergisch-gladbach" , "174845214" } , new String[]{ "Müller-Lüdenscheidt" , "65752682" } };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsEncodeEquals_add144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_add144");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals");
        final String[][] data = new String[][]{ new String[]{ "foo" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation689() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation689");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "foo" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation690() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation690");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "foo" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation691() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation691");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "foo" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation692() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation692");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "foo" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation693() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation693");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "foo" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation694() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation694");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "foo" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation695() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation695");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "foo" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation696() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation696");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "foo" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation697() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation697");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "foo" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation698() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation698");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "foo" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation699() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation699");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "foo" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation700() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation700");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "foo" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation701() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation701");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "foo" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation702() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation702");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "foo" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation703() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation703");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "foo" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation704() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation704");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[2], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation705() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation705");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[-1]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIsEncodeEquals_remove127() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_remove127");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testVariationsMella_add145() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella_add145");
        final String[] data = new String[]{ "mella" , "milah" , "moulla" , "mellah" , "muehle" , "mule" };
        checkEncodingVariations("65", data);
        checkEncodingVariations("65", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMella() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella");
        final String[] data = new String[]{ "foo" , "milah" , "moulla" , "mellah" , "muehle" , "mule" };
        checkEncodingVariations("65", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMella_literalMutation707() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella_literalMutation707");
        final String[] data = new String[]{ "mella" , "foo" , "moulla" , "mellah" , "muehle" , "mule" };
        checkEncodingVariations("65", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMella_literalMutation708() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella_literalMutation708");
        final String[] data = new String[]{ "mella" , "milah" , "foo" , "mellah" , "muehle" , "mule" };
        checkEncodingVariations("65", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMella_literalMutation709() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella_literalMutation709");
        final String[] data = new String[]{ "mella" , "milah" , "moulla" , "foo" , "muehle" , "mule" };
        checkEncodingVariations("65", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMella_literalMutation710() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella_literalMutation710");
        final String[] data = new String[]{ "mella" , "milah" , "moulla" , "mellah" , "foo" , "mule" };
        checkEncodingVariations("65", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMella_literalMutation711() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella_literalMutation711");
        final String[] data = new String[]{ "mella" , "milah" , "moulla" , "mellah" , "muehle" , "foo" };
        checkEncodingVariations("65", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMella_literalMutation712() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella_literalMutation712");
        final String[] data = new String[]{ "mella" , "milah" , "moulla" , "mellah" , "muehle" , "mule" };
        checkEncodingVariations("foo", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testVariationsMella_remove128() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella_remove128");
        final String[] data = new String[]{ "mella" , "milah" , "moulla" , "mellah" , "muehle" , "mule" };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testVariationsMeyer_add146() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_add146");
        final String[] data = new String[]{ "Meier" , "Maier" , "Mair" , "Meyer" , "Meyr" , "Mejer" , "Major" };
        checkEncodingVariations("67", data);
        checkEncodingVariations("67", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMeyer() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer");
        final String[] data = new String[]{ "foo" , "Maier" , "Mair" , "Meyer" , "Meyr" , "Mejer" , "Major" };
        checkEncodingVariations("67", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMeyer_literalMutation714() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_literalMutation714");
        final String[] data = new String[]{ "Meier" , "foo" , "Mair" , "Meyer" , "Meyr" , "Mejer" , "Major" };
        checkEncodingVariations("67", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMeyer_literalMutation715() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_literalMutation715");
        final String[] data = new String[]{ "Meier" , "Maier" , "foo" , "Meyer" , "Meyr" , "Mejer" , "Major" };
        checkEncodingVariations("67", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMeyer_literalMutation716() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_literalMutation716");
        final String[] data = new String[]{ "Meier" , "Maier" , "Mair" , "foo" , "Meyr" , "Mejer" , "Major" };
        checkEncodingVariations("67", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMeyer_literalMutation717() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_literalMutation717");
        final String[] data = new String[]{ "Meier" , "Maier" , "Mair" , "Meyer" , "foo" , "Mejer" , "Major" };
        checkEncodingVariations("67", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMeyer_literalMutation718() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_literalMutation718");
        final String[] data = new String[]{ "Meier" , "Maier" , "Mair" , "Meyer" , "Meyr" , "foo" , "Major" };
        checkEncodingVariations("67", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMeyer_literalMutation719() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_literalMutation719");
        final String[] data = new String[]{ "Meier" , "Maier" , "Mair" , "Meyer" , "Meyr" , "Mejer" , "foo" };
        checkEncodingVariations("67", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMeyer_literalMutation720() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_literalMutation720");
        final String[] data = new String[]{ "Meier" , "Maier" , "Mair" , "Meyer" , "Meyr" , "Mejer" , "Major" };
        checkEncodingVariations("foo", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testVariationsMeyer_remove129() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_remove129");
        final String[] data = new String[]{ "Meier" , "Maier" , "Mair" , "Meyer" , "Meyr" , "Mejer" , "Major" };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

