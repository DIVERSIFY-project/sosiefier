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
        checkEncoding("bar", "Aabjoe");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testAabjoe_literalMutation634() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAabjoe_literalMutation634");
        checkEncoding("01", "bar");
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
        checkEncoding("bar", "Aaclan");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testAaclan_literalMutation636() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAaclan_literalMutation636");
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
        checkEncoding("bar", "Aychlmajr");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests [CODEC-122]
     * 
     * @throws EncoderException
     */
@Test
    public void testAychlmajrForCodec122_literalMutation638() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAychlmajrForCodec122_literalMutation638");
        checkEncoding("04567", "bar");
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
        final String[][] data = new String[][]{ new String[]{ "bar" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation640() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation640");
        final String[][] data = new String[][]{ new String[]{ "a" , "bar" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation641() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation641");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "bar" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation642() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation642");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "bar" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation643() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation643");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation644() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation644");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "bar" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation645() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation645");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "bar" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation646() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation646");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "bar" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation647() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation647");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation648() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation648");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "foo" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation649() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation649");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation650() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation650");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "foo" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation651() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation651");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation652() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation652");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "foo" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation653() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation653");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation654() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation654");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "foo" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation655() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation655");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "bar" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation656() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation656");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "bar" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation657() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation657");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "foo" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation658() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation658");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "foo" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation659() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation659");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "foo" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation660() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation660");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "bar" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation661() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation661");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "bar" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation662() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation662");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "foo" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation663() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation663");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "foo" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation664() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation664");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "foo" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation665() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation665");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "foo" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation666() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation666");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "foo" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation667() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation667");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "bar" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation668() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation668");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "bar" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation669() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation669");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "bar" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation670() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation670");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "foo" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation671() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation671");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "foo" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation672() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation672");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "foo" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation673() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation673");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "foo" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation674() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation674");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "bar" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation675() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation675");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "bar" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation676() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation676");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "foo" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation677() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation677");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "foo" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation678() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation678");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "bar" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation679() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation679");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "foo" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation680() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation680");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "foo" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation681() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation681");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "foo" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation682() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation682");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "foo" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation683() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation683");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "bar" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation684() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation684");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "foo" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation685() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation685");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "bar" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation686() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation686");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "foo" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation687() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation687");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "bar" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation688() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation688");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "foo" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation689() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation689");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "foo" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation690() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation690");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "bar" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation691() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation691");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "foo" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation692() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation692");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "foo" } , new String[]{ "mn" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation693() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation693");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "foo" , "6" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation694() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation694");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "foo" } , new String[]{ "r" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation695() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation695");
        final String[][] data = new String[][]{ new String[]{ "a" , "0" } , new String[]{ "e" , "0" } , new String[]{ "i" , "0" } , new String[]{ "o" , "0" } , new String[]{ "u" , "0" } , new String[]{ "ä" , "0" } , new String[]{ "ö" , "0" } , new String[]{ "ü" , "0" } , new String[]{ "aa" , "0" } , new String[]{ "ha" , "0" } , new String[]{ "h" , "" } , new String[]{ "aha" , "0" } , new String[]{ "b" , "1" } , new String[]{ "p" , "1" } , new String[]{ "ph" , "3" } , new String[]{ "f" , "3" } , new String[]{ "v" , "3" } , new String[]{ "w" , "3" } , new String[]{ "g" , "4" } , new String[]{ "k" , "4" } , new String[]{ "q" , "4" } , new String[]{ "x" , "48" } , new String[]{ "ax" , "048" } , new String[]{ "cx" , "48" } , new String[]{ "l" , "5" } , new String[]{ "cl" , "45" } , new String[]{ "acl" , "085" } , new String[]{ "mn" , "6" } , new String[]{ "foo" , "7" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEdgeCases_literalMutation696() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEdgeCases_literalMutation696");
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
        final String[][] data = new String[][]{ new String[]{ "bar" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation698() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation698");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "foo" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation699() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation699");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "foo" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation700() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation700");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "bar" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation701() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation701");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "bar" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation702() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation702");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "bar" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation703() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation703");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "foo" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation704() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation704");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "bar" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation705() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation705");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "bar" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation706() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation706");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "bar" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation707() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation707");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "bar" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation708() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation708");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "foo" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation709() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation709");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "bar" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation710() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation710");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "foo" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation711() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation711");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "bar" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation712() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation712");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "foo" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation713() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation713");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "foo" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation714() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation714");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "foo" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation715() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation715");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "bar" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation716() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation716");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "bar" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation717() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation717");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "foo" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation718() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation718");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "foo" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation719() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation719");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "bar" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation720() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation720");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "bar" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation721() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation721");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "bar" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation722() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation722");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "foo" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation723() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation723");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "foo" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation724() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation724");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "bar" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation725() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation725");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "bar" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation726() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation726");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "bar" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation727() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation727");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "bar" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation728() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation728");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "foo" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation729() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation729");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "bar" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation730() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation730");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "bar" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation731() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation731");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "foo" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation732() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation732");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "bar" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation733() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation733");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "foo" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation734() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation734");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "foo" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation735() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation735");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "foo" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation736() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation736");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "bar" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation737() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation737");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "bar" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation738() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation738");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "bar" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation739() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation739");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "foo" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation740() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation740");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "foo" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation741() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation741");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "bar" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation742() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation742");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "foo" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation743() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation743");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "bar" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation744() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation744");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "bar" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation745() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation745");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "foo" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation746() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation746");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "foo" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation747() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation747");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "foo" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation748() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation748");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "bar" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation749() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation749");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "foo" , "01772" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation750() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation750");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "foo" } , new String[]{ "heithabu" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation751() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation751");
        final String[][] data = new String[][]{ new String[]{ "mÜller" , "657" } , new String[]{ "schmidt" , "862" } , new String[]{ "schneider" , "8627" } , new String[]{ "fischer" , "387" } , new String[]{ "weber" , "317" } , new String[]{ "wagner" , "3467" } , new String[]{ "becker" , "147" } , new String[]{ "hoffmann" , "0366" } , new String[]{ "schÄfer" , "837" } , new String[]{ "Breschnew" , "17863" } , new String[]{ "Wikipedia" , "3412" } , new String[]{ "peter" , "127" } , new String[]{ "pharma" , "376" } , new String[]{ "mönchengladbach" , "664645214" } , new String[]{ "deutsch" , "28" } , new String[]{ "deutz" , "28" } , new String[]{ "hamburg" , "06174" } , new String[]{ "hannover" , "0637" } , new String[]{ "christstollen" , "478256" } , new String[]{ "Xanthippe" , "48621" } , new String[]{ "Zacharias" , "8478" } , new String[]{ "Holzbau" , "0581" } , new String[]{ "matsch" , "68" } , new String[]{ "matz" , "68" } , new String[]{ "Arbeitsamt" , "071862" } , new String[]{ "Eberhard" , "01772" } , new String[]{ "Eberhardt" , "01772" } , new String[]{ "foo" , "021" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testExamples_literalMutation752() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExamples_literalMutation752");
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
        final String[][] data = new String[][]{ new String[]{ "bar" , "174845214" } , new String[]{ "Müller-Lüdenscheidt" , "65752682" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHyphen_literalMutation754() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHyphen_literalMutation754");
        final String[][] data = new String[][]{ new String[]{ "bergisch-gladbach" , "bar" } , new String[]{ "Müller-Lüdenscheidt" , "65752682" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHyphen_literalMutation755() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHyphen_literalMutation755");
        final String[][] data = new String[][]{ new String[]{ "bergisch-gladbach" , "174845214" } , new String[]{ "bar" , "65752682" } };
        checkEncodings(data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHyphen_literalMutation756() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHyphen_literalMutation756");
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
    public void testIsEncodeEquals_literalMutation758() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation758");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "bar" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation759() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation759");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "bar" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation760() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation760");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "foo" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation761() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation761");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "foo" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation762() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation762");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "foo" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation763() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation763");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "foo" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation764() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation764");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "foo" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation765() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation765");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "bar" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation766() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation766");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "bar" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation767() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation767");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "foo" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation768() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation768");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "bar" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation769() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation769");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "foo" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation770() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation770");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "bar" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation771() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation771");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "foo" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation772() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation772");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "foo" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation773() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation773");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[2], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation774() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation774");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[0], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation775() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation775");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[0], element[0]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation776() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation776");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[1]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation777() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation777");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[-1]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEncodeEquals_literalMutation778() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEncodeEquals_literalMutation778");
        final String[][] data = new String[][]{ new String[]{ "Meyer" , "Müller" } , new String[]{ "Meyer" , "Mayr" } , new String[]{ "house" , "house" } , new String[]{ "House" , "house" } , new String[]{ "Haus" , "house" } , new String[]{ "ganz" , "Gans" } , new String[]{ "ganz" , "Gänse" } , new String[]{ "Miyagi" , "Miyako" } };
        for (final String[] element : data) {
            getStringEncoder().isEncodeEqual(element[1], element[0]);
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
    public void testVariationsMella_literalMutation780() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella_literalMutation780");
        final String[] data = new String[]{ "mella" , "foo" , "moulla" , "mellah" , "muehle" , "mule" };
        checkEncodingVariations("65", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMella_literalMutation781() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella_literalMutation781");
        final String[] data = new String[]{ "mella" , "milah" , "bar" , "mellah" , "muehle" , "mule" };
        checkEncodingVariations("65", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMella_literalMutation782() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella_literalMutation782");
        final String[] data = new String[]{ "mella" , "milah" , "moulla" , "bar" , "muehle" , "mule" };
        checkEncodingVariations("65", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMella_literalMutation783() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella_literalMutation783");
        final String[] data = new String[]{ "mella" , "milah" , "moulla" , "mellah" , "bar" , "mule" };
        checkEncodingVariations("65", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMella_literalMutation784() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella_literalMutation784");
        final String[] data = new String[]{ "mella" , "milah" , "moulla" , "mellah" , "muehle" , "bar" };
        checkEncodingVariations("65", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMella_literalMutation785() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMella_literalMutation785");
        final String[] data = new String[]{ "mella" , "milah" , "moulla" , "mellah" , "muehle" , "mule" };
        checkEncodingVariations("bar", data);
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
    public void testVariationsMeyer_literalMutation787() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_literalMutation787");
        final String[] data = new String[]{ "Meier" , "bar" , "Mair" , "Meyer" , "Meyr" , "Mejer" , "Major" };
        checkEncodingVariations("67", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMeyer_literalMutation788() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_literalMutation788");
        final String[] data = new String[]{ "Meier" , "Maier" , "bar" , "Meyer" , "Meyr" , "Mejer" , "Major" };
        checkEncodingVariations("67", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMeyer_literalMutation789() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_literalMutation789");
        final String[] data = new String[]{ "Meier" , "Maier" , "Mair" , "bar" , "Meyr" , "Mejer" , "Major" };
        checkEncodingVariations("67", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMeyer_literalMutation790() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_literalMutation790");
        final String[] data = new String[]{ "Meier" , "Maier" , "Mair" , "Meyer" , "foo" , "Mejer" , "Major" };
        checkEncodingVariations("67", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMeyer_literalMutation791() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_literalMutation791");
        final String[] data = new String[]{ "Meier" , "Maier" , "Mair" , "Meyer" , "Meyr" , "bar" , "Major" };
        checkEncodingVariations("67", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMeyer_literalMutation792() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_literalMutation792");
        final String[] data = new String[]{ "Meier" , "Maier" , "Mair" , "Meyer" , "Meyr" , "Mejer" , "bar" };
        checkEncodingVariations("67", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testVariationsMeyer_literalMutation793() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_literalMutation793");
        final String[] data = new String[]{ "Meier" , "Maier" , "Mair" , "Meyer" , "Meyr" , "Mejer" , "Major" };
        checkEncodingVariations("bar", data);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testVariationsMeyer_remove129() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariationsMeyer_remove129");
        final String[] data = new String[]{ "Meier" , "Maier" , "Mair" , "Meyer" , "Meyr" , "Mejer" , "Major" };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

