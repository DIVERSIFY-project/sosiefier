package org.apache.commons.codec.binary;

import org.junit.Test;
import java.io.UnsupportedEncodingException;

/** 
 * Tests {@link StringUtils}
 * 
 * @version $Id$
 */
public class StringUtilsTest {
    private static final byte[] BYTES_FIXTURE = new byte[]{ 'a' , 'b' , 'c' };

    private static final byte[] BYTES_FIXTURE_16BE = new byte[]{ 0 , 'a' , 0 , 'b' , 0 , 'c' };

    private static final byte[] BYTES_FIXTURE_16LE = new byte[]{ 'a' , 0 , 'b' , 0 , 'c' , 0 };

    private static final String STRING_FIXTURE = "ABC";

    /** 
     * We could make the constructor private but there does not seem to be a point to jumping through extra code hoops
     * to restrict instantiation right now.
     */
@Test
    public void testConstructor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor");
        new StringUtils();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetBytesIso8859_1_add522() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesIso8859_1_add522");
        final String charsetName = "ISO-8859-1";
        testGetBytesUnchecked(charsetName);
        testGetBytesUnchecked(charsetName);
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesIso8859_1(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,null,2635,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testGetBytesIso8859_1() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesIso8859_1");
        final String charsetName = "foo";
        testGetBytesUnchecked(charsetName);
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesIso8859_1(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,null,2635,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetBytesIso8859_1_remove467() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesIso8859_1_remove467");
        final String charsetName = "ISO-8859-1";
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesIso8859_1(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,null,2635,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testGetBytesUnchecked(final String charsetName) throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUnchecked");
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUnchecked(STRING_FIXTURE, charsetName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2638,null,2637,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetBytesUsAscii_add524() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUsAscii_add524");
        final String charsetName = "US-ASCII";
        testGetBytesUnchecked(charsetName);
        testGetBytesUnchecked(charsetName);
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUsAscii(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,null,2642,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testGetBytesUsAscii() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUsAscii");
        final String charsetName = "foo";
        testGetBytesUnchecked(charsetName);
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUsAscii(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,null,2642,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetBytesUsAscii_remove468() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUsAscii_remove468");
        final String charsetName = "US-ASCII";
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUsAscii(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,null,2642,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetBytesUtf16_add525() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUtf16_add525");
        final String charsetName = "UTF-16";
        testGetBytesUnchecked(charsetName);
        testGetBytesUnchecked(charsetName);
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUtf16(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2649,null,2648,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testGetBytesUtf16() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUtf16");
        final String charsetName = "foo";
        testGetBytesUnchecked(charsetName);
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUtf16(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2649,null,2648,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetBytesUtf16_remove469() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUtf16_remove469");
        final String charsetName = "UTF-16";
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUtf16(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2649,null,2648,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetBytesUtf16Be_add526() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUtf16Be_add526");
        final String charsetName = "UTF-16BE";
        testGetBytesUnchecked(charsetName);
        testGetBytesUnchecked(charsetName);
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUtf16Be(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2645,null,2644,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testGetBytesUtf16Be() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUtf16Be");
        final String charsetName = "foo";
        testGetBytesUnchecked(charsetName);
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUtf16Be(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2645,null,2644,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetBytesUtf16Be_remove470() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUtf16Be_remove470");
        final String charsetName = "UTF-16BE";
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUtf16Be(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2645,null,2644,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetBytesUtf16Le_add527() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUtf16Le_add527");
        final String charsetName = "UTF-16LE";
        testGetBytesUnchecked(charsetName);
        testGetBytesUnchecked(charsetName);
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUtf16Le(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2647,null,2646,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testGetBytesUtf16Le() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUtf16Le");
        final String charsetName = "bar";
        testGetBytesUnchecked(charsetName);
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUtf16Le(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2647,null,2646,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetBytesUtf16Le_remove471() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUtf16Le_remove471");
        final String charsetName = "UTF-16LE";
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUtf16Le(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2647,null,2646,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetBytesUtf8_add528() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUtf8_add528");
        final String charsetName = "UTF-8";
        testGetBytesUnchecked(charsetName);
        testGetBytesUnchecked(charsetName);
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUtf8(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2651,null,2650,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testGetBytesUtf8() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUtf8");
        final String charsetName = "bar";
        testGetBytesUnchecked(charsetName);
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUtf8(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2651,null,2650,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetBytesUtf8_remove472() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUtf8_remove472");
        final String charsetName = "UTF-8";
        final byte[] expected = STRING_FIXTURE.getBytes(charsetName);
        final byte[] actual = StringUtils.getBytesUtf8(STRING_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2651,null,2650,java.util.Arrays.equals(expected, actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetBytesUncheckedBadName_add523() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUncheckedBadName_add523");
        try {
            StringUtils.getBytesUnchecked(STRING_FIXTURE, "UNKNOWN");
            StringUtils.getBytesUnchecked(STRING_FIXTURE, "UNKNOWN");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2639,("Expected " + (java.lang.IllegalStateException.class.getName())));
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testGetBytesUncheckedBadName() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUncheckedBadName");
        try {
            StringUtils.getBytesUnchecked(STRING_FIXTURE, "bar");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2639,("Expected " + (java.lang.IllegalStateException.class.getName())));
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testGetBytesUncheckedNullInput() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytesUncheckedNullInput");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,null,2640,org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(null, "UNKNOWN"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testNewString(final String charsetName) throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewString");
        final String expected = new String(BYTES_FIXTURE , charsetName);
        final String actual = StringUtils.newString(BYTES_FIXTURE, charsetName);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2652,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2653,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewStringBadEnc_add529() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringBadEnc_add529");
        try {
            StringUtils.newString(BYTES_FIXTURE, "UNKNOWN");
            StringUtils.newString(BYTES_FIXTURE, "UNKNOWN");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,("Expected " + (java.lang.IllegalStateException.class.getName())));
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNewStringBadEnc() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringBadEnc");
        try {
            StringUtils.newString(BYTES_FIXTURE, "foo");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,("Expected " + (java.lang.IllegalStateException.class.getName())));
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNewStringNullInput() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringNullInput");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,null,2657,org.apache.commons.codec.binary.StringUtils.newString(null, "UNKNOWN"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewStringIso8859_1_add530() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringIso8859_1_add530");
        final String charsetName = "ISO-8859-1";
        testNewString(charsetName);
        testNewString(charsetName);
        final String expected = new String(BYTES_FIXTURE , charsetName);
        final String actual = StringUtils.newStringIso8859_1(BYTES_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2655,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNewStringIso8859_1() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringIso8859_1");
        final String charsetName = "bar";
        testNewString(charsetName);
        final String expected = new String(BYTES_FIXTURE , charsetName);
        final String actual = StringUtils.newStringIso8859_1(BYTES_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2655,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewStringIso8859_1_remove473() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringIso8859_1_remove473");
        final String charsetName = "ISO-8859-1";
        final String expected = new String(BYTES_FIXTURE , charsetName);
        final String actual = StringUtils.newStringIso8859_1(BYTES_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2655,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewStringUsAscii_add531() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUsAscii_add531");
        final String charsetName = "US-ASCII";
        testNewString(charsetName);
        testNewString(charsetName);
        final String expected = new String(BYTES_FIXTURE , charsetName);
        final String actual = StringUtils.newStringUsAscii(BYTES_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2659,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNewStringUsAscii() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUsAscii");
        final String charsetName = "bar";
        testNewString(charsetName);
        final String expected = new String(BYTES_FIXTURE , charsetName);
        final String actual = StringUtils.newStringUsAscii(BYTES_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2659,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewStringUsAscii_remove474() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUsAscii_remove474");
        final String charsetName = "US-ASCII";
        final String expected = new String(BYTES_FIXTURE , charsetName);
        final String actual = StringUtils.newStringUsAscii(BYTES_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2659,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewStringUtf16_add532() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUtf16_add532");
        final String charsetName = "UTF-16";
        testNewString(charsetName);
        testNewString(charsetName);
        final String expected = new String(BYTES_FIXTURE , charsetName);
        final String actual = StringUtils.newStringUtf16(BYTES_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2665,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNewStringUtf16() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUtf16");
        final String charsetName = "bar";
        testNewString(charsetName);
        final String expected = new String(BYTES_FIXTURE , charsetName);
        final String actual = StringUtils.newStringUtf16(BYTES_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2665,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewStringUtf16_remove475() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUtf16_remove475");
        final String charsetName = "UTF-16";
        final String expected = new String(BYTES_FIXTURE , charsetName);
        final String actual = StringUtils.newStringUtf16(BYTES_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2665,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewStringUtf16Be_add533() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUtf16Be_add533");
        final String charsetName = "UTF-16BE";
        testNewString(charsetName);
        testNewString(charsetName);
        final String expected = new String(BYTES_FIXTURE_16BE , charsetName);
        final String actual = StringUtils.newStringUtf16Be(BYTES_FIXTURE_16BE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2662,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNewStringUtf16Be() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUtf16Be");
        final String charsetName = "foo";
        testNewString(charsetName);
        final String expected = new String(BYTES_FIXTURE_16BE , charsetName);
        final String actual = StringUtils.newStringUtf16Be(BYTES_FIXTURE_16BE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2662,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewStringUtf16Be_remove476() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUtf16Be_remove476");
        final String charsetName = "UTF-16BE";
        final String expected = new String(BYTES_FIXTURE_16BE , charsetName);
        final String actual = StringUtils.newStringUtf16Be(BYTES_FIXTURE_16BE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2662,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewStringUtf16Le_add534() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUtf16Le_add534");
        final String charsetName = "UTF-16LE";
        testNewString(charsetName);
        testNewString(charsetName);
        final String expected = new String(BYTES_FIXTURE_16LE , charsetName);
        final String actual = StringUtils.newStringUtf16Le(BYTES_FIXTURE_16LE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNewStringUtf16Le() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUtf16Le");
        final String charsetName = "foo";
        testNewString(charsetName);
        final String expected = new String(BYTES_FIXTURE_16LE , charsetName);
        final String actual = StringUtils.newStringUtf16Le(BYTES_FIXTURE_16LE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewStringUtf16Le_remove477() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUtf16Le_remove477");
        final String charsetName = "UTF-16LE";
        final String expected = new String(BYTES_FIXTURE_16LE , charsetName);
        final String actual = StringUtils.newStringUtf16Le(BYTES_FIXTURE_16LE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewStringUtf8_add535() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUtf8_add535");
        final String charsetName = "UTF-8";
        testNewString(charsetName);
        testNewString(charsetName);
        final String expected = new String(BYTES_FIXTURE , charsetName);
        final String actual = StringUtils.newStringUtf8(BYTES_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNewStringUtf8() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUtf8");
        final String charsetName = "foo";
        testNewString(charsetName);
        final String expected = new String(BYTES_FIXTURE , charsetName);
        final String actual = StringUtils.newStringUtf8(BYTES_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNewStringUtf8_remove478() throws UnsupportedEncodingException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStringUtf8_remove478");
        final String charsetName = "UTF-8";
        final String expected = new String(BYTES_FIXTURE , charsetName);
        final String actual = StringUtils.newStringUtf8(BYTES_FIXTURE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

