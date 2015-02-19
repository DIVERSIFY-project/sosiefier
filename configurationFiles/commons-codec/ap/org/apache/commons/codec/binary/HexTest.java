package org.apache.commons.codec.binary;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import java.util.Random;
import org.junit.Test;
import java.nio.charset.UnsupportedCharsetException;
import java.io.UnsupportedEncodingException;

/** 
 * Tests {@link org.apache.commons.codec.binary.Hex}.
 * 
 * @version $Id$
 */
public class HexTest {
    private static final String BAD_ENCODING_NAME = "UNKNOWN";

    private static final boolean LOG = false;

    private boolean charsetSanityCheck(final String name) {
        final String source = "the quick brown dog jumped over the lazy fox";
        try {
            final byte[] bytes = source.getBytes(name);
            final String str = new String(bytes , name);
            final boolean equals = source.equals(str);
            if (equals == false) {
                log(("FAILED charsetSanityCheck=Interesting Java charset oddity: Roundtrip failed for " + name));
            } 
            return equals;
        } catch (final UnsupportedEncodingException e) {
            if (LOG) {
                log(((("FAILED charsetSanityCheck=" + name) + ", e=") + e));
                log(e);
            } 
            return false;
        } catch (final UnsupportedOperationException e) {
            if (LOG) {
                log(((("FAILED charsetSanityCheck=" + name) + ", e=") + e));
                log(e);
            } 
            return false;
        }
    }

    /** 
     * @param data
     */
private void checkDecodeHexOddCharacters(final char[] data) {
        try {
            Hex.decodeHex(data);
        } catch (final DecoderException e) {
        }
    }

    private void log(final String s) {
        if (LOG) {
            System.out.println(s);
            System.out.flush();
        } 
    }

    private void log(final Throwable t) {
        if (LOG) {
            t.printStackTrace(System.out);
            System.out.flush();
        } 
    }

    @Test(timeout = 1000)
    public void testCustomCharset_add504() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomCharset_add504");
        for (final String name : java.nio.charset.Charset.availableCharsets().keySet()) {
            testCustomCharset(name, "testCustomCharset");
            testCustomCharset(name, "testCustomCharset");
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCustomCharset() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomCharset");
        for (final String name : java.nio.charset.Charset.availableCharsets().keySet()) {
            testCustomCharset(name, "bar");
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomCharset_remove455() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomCharset_remove455");
        for (final String name : java.nio.charset.Charset.availableCharsets().keySet()) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * @param name
     * @param parent
     * @throws UnsupportedEncodingException
     * @throws DecoderException
     */
@Test(timeout = 1000)
    private void testCustomCharset_add505(final String name, final String parent) throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomCharset_add505");
        if ((charsetSanityCheck(name)) == false) {
            return ;
        } 
        log(((parent + "=") + name));
        log(((parent + "=") + name));
        final Hex customCodec = new Hex(name);
        final String sourceString = "Hello World";
        final byte[] sourceBytes = sourceString.getBytes(name);
        final byte[] actualEncodedBytes = customCodec.encode(sourceBytes);
        String expectedHexString = Hex.encodeHexString(sourceBytes);
        final byte[] expectedHexStringBytes = expectedHexString.getBytes(name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2593,null,2592,java.util.Arrays.equals(expectedHexStringBytes, actualEncodedBytes));
        String actualStringFromBytes = new String(actualEncodedBytes , name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2594,((((name + ", expectedHexString=") + expectedHexString) + ", actualStringFromBytes=") + actualStringFromBytes));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2595,expectedHexString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2596,actualStringFromBytes);
        final Hex utf8Codec = new Hex();
        expectedHexString = "48656c6c6f20576f726c64";
        final byte[] decodedUtf8Bytes = ((byte[])(utf8Codec.decode(expectedHexString)));
        actualStringFromBytes = new String(decodedUtf8Bytes , utf8Codec.getCharset());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2597,name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2598,sourceString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2599,actualStringFromBytes);
        final byte[] decodedCustomBytes = customCodec.decode(actualEncodedBytes);
        actualStringFromBytes = new String(decodedCustomBytes , name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2600,name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2601,sourceString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2602,actualStringFromBytes);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * @param name
     * @param parent
     * @throws UnsupportedEncodingException
     * @throws DecoderException
     */
private void testCustomCharset(final String name, final String parent) throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomCharset");
        if ((charsetSanityCheck(name)) == true) {
            return ;
        } 
        log(((parent + "=") + name));
        final Hex customCodec = new Hex(name);
        final String sourceString = "Hello World";
        final byte[] sourceBytes = sourceString.getBytes(name);
        final byte[] actualEncodedBytes = customCodec.encode(sourceBytes);
        String expectedHexString = Hex.encodeHexString(sourceBytes);
        final byte[] expectedHexStringBytes = expectedHexString.getBytes(name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2593,null,2592,java.util.Arrays.equals(expectedHexStringBytes, actualEncodedBytes));
        String actualStringFromBytes = new String(actualEncodedBytes , name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2594,((((name + ", expectedHexString=") + expectedHexString) + ", actualStringFromBytes=") + actualStringFromBytes));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2595,expectedHexString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2596,actualStringFromBytes);
        final Hex utf8Codec = new Hex();
        expectedHexString = "48656c6c6f20576f726c64";
        final byte[] decodedUtf8Bytes = ((byte[])(utf8Codec.decode(expectedHexString)));
        actualStringFromBytes = new String(decodedUtf8Bytes , utf8Codec.getCharset());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2597,name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2598,sourceString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2599,actualStringFromBytes);
        final byte[] decodedCustomBytes = customCodec.decode(actualEncodedBytes);
        actualStringFromBytes = new String(decodedCustomBytes , name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2600,name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2601,sourceString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2602,actualStringFromBytes);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * @param name
     * @param parent
     * @throws UnsupportedEncodingException
     * @throws DecoderException
     */
private void testCustomCharset_literalMutation4389(final String name, final String parent) throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomCharset_literalMutation4389");
        if ((charsetSanityCheck(name)) == false) {
            return ;
        } 
        log(((parent + "bar") + name));
        final Hex customCodec = new Hex(name);
        final String sourceString = "Hello World";
        final byte[] sourceBytes = sourceString.getBytes(name);
        final byte[] actualEncodedBytes = customCodec.encode(sourceBytes);
        String expectedHexString = Hex.encodeHexString(sourceBytes);
        final byte[] expectedHexStringBytes = expectedHexString.getBytes(name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2593,null,2592,java.util.Arrays.equals(expectedHexStringBytes, actualEncodedBytes));
        String actualStringFromBytes = new String(actualEncodedBytes , name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2594,((((name + ", expectedHexString=") + expectedHexString) + ", actualStringFromBytes=") + actualStringFromBytes));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2595,expectedHexString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2596,actualStringFromBytes);
        final Hex utf8Codec = new Hex();
        expectedHexString = "48656c6c6f20576f726c64";
        final byte[] decodedUtf8Bytes = ((byte[])(utf8Codec.decode(expectedHexString)));
        actualStringFromBytes = new String(decodedUtf8Bytes , utf8Codec.getCharset());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2597,name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2598,sourceString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2599,actualStringFromBytes);
        final byte[] decodedCustomBytes = customCodec.decode(actualEncodedBytes);
        actualStringFromBytes = new String(decodedCustomBytes , name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2600,name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2601,sourceString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2602,actualStringFromBytes);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * @param name
     * @param parent
     * @throws UnsupportedEncodingException
     * @throws DecoderException
     */
private void testCustomCharset_literalMutation4390(final String name, final String parent) throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomCharset_literalMutation4390");
        if ((charsetSanityCheck(name)) == false) {
            return ;
        } 
        log(((parent + "=") + name));
        final Hex customCodec = new Hex(name);
        final String sourceString = "bar";
        final byte[] sourceBytes = sourceString.getBytes(name);
        final byte[] actualEncodedBytes = customCodec.encode(sourceBytes);
        String expectedHexString = Hex.encodeHexString(sourceBytes);
        final byte[] expectedHexStringBytes = expectedHexString.getBytes(name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2593,null,2592,java.util.Arrays.equals(expectedHexStringBytes, actualEncodedBytes));
        String actualStringFromBytes = new String(actualEncodedBytes , name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2594,((((name + ", expectedHexString=") + expectedHexString) + ", actualStringFromBytes=") + actualStringFromBytes));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2595,expectedHexString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2596,actualStringFromBytes);
        final Hex utf8Codec = new Hex();
        expectedHexString = "48656c6c6f20576f726c64";
        final byte[] decodedUtf8Bytes = ((byte[])(utf8Codec.decode(expectedHexString)));
        actualStringFromBytes = new String(decodedUtf8Bytes , utf8Codec.getCharset());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2597,name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2598,sourceString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2599,actualStringFromBytes);
        final byte[] decodedCustomBytes = customCodec.decode(actualEncodedBytes);
        actualStringFromBytes = new String(decodedCustomBytes , name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2600,name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2601,sourceString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2602,actualStringFromBytes);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * @param name
     * @param parent
     * @throws UnsupportedEncodingException
     * @throws DecoderException
     */
private void testCustomCharset_literalMutation4391(final String name, final String parent) throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomCharset_literalMutation4391");
        if ((charsetSanityCheck(name)) == false) {
            return ;
        } 
        log(((parent + "=") + name));
        final Hex customCodec = new Hex(name);
        final String sourceString = "Hello World";
        final byte[] sourceBytes = sourceString.getBytes(name);
        final byte[] actualEncodedBytes = customCodec.encode(sourceBytes);
        String expectedHexString = Hex.encodeHexString(sourceBytes);
        final byte[] expectedHexStringBytes = expectedHexString.getBytes(name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2593,null,2592,java.util.Arrays.equals(expectedHexStringBytes, actualEncodedBytes));
        String actualStringFromBytes = new String(actualEncodedBytes , name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2594,((((name + ", expectedHexString=") + expectedHexString) + ", actualStringFromBytes=") + actualStringFromBytes));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2595,expectedHexString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2596,actualStringFromBytes);
        final Hex utf8Codec = new Hex();
        expectedHexString = "foo";
        final byte[] decodedUtf8Bytes = ((byte[])(utf8Codec.decode(expectedHexString)));
        actualStringFromBytes = new String(decodedUtf8Bytes , utf8Codec.getCharset());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2597,name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2598,sourceString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2599,actualStringFromBytes);
        final byte[] decodedCustomBytes = customCodec.decode(actualEncodedBytes);
        actualStringFromBytes = new String(decodedCustomBytes , name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2600,name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2601,sourceString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2602,actualStringFromBytes);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * @param name
     * @param parent
     * @throws UnsupportedEncodingException
     * @throws DecoderException
     */
@Test(timeout = 1000)
    private void testCustomCharset_remove456(final String name, final String parent) throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomCharset_remove456");
        if ((charsetSanityCheck(name)) == false) {
            return ;
        } 
        final Hex customCodec = new Hex(name);
        final String sourceString = "Hello World";
        final byte[] sourceBytes = sourceString.getBytes(name);
        final byte[] actualEncodedBytes = customCodec.encode(sourceBytes);
        String expectedHexString = Hex.encodeHexString(sourceBytes);
        final byte[] expectedHexStringBytes = expectedHexString.getBytes(name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2593,null,2592,java.util.Arrays.equals(expectedHexStringBytes, actualEncodedBytes));
        String actualStringFromBytes = new String(actualEncodedBytes , name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2594,((((name + ", expectedHexString=") + expectedHexString) + ", actualStringFromBytes=") + actualStringFromBytes));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2595,expectedHexString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2596,actualStringFromBytes);
        final Hex utf8Codec = new Hex();
        expectedHexString = "48656c6c6f20576f726c64";
        final byte[] decodedUtf8Bytes = ((byte[])(utf8Codec.decode(expectedHexString)));
        actualStringFromBytes = new String(decodedUtf8Bytes , utf8Codec.getCharset());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2597,name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2598,sourceString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2599,actualStringFromBytes);
        final byte[] decodedCustomBytes = customCodec.decode(actualEncodedBytes);
        actualStringFromBytes = new String(decodedCustomBytes , name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2600,name);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2601,sourceString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2602,actualStringFromBytes);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = UnsupportedCharsetException.class)
    public void testCustomCharsetBadName() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomCharsetBadName");
        new Hex(BAD_ENCODING_NAME);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCustomCharsetToString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomCharsetToString");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2591,((new org.apache.commons.codec.binary.Hex().toString().indexOf(org.apache.commons.codec.binary.Hex.DEFAULT_CHARSET_NAME)) >= 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeArrayOddCharacters_add506() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeArrayOddCharacters_add506");
        try {
            new Hex().decode(new byte[]{ 65 });
            new Hex().decode(new byte[]{ 65 });
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeArrayOddCharacters() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeArrayOddCharacters");
        try {
            new Hex().decode(new byte[]{ 66 });
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeArrayOddCharacters_literalMutation4393() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeArrayOddCharacters_literalMutation4393");
        try {
            new Hex().decode(new byte[]{ 64 });
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeArrayOddCharacters_literalMutation4394() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeArrayOddCharacters_literalMutation4394");
        try {
            new Hex().decode(new byte[]{ 32 });
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

   

    @Test(timeout = 1000)
    public void testDecodeBadCharacterPos0_add507() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeBadCharacterPos0_add507");
        try {
            new Hex().decode("q0");
            new Hex().decode("q0");
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeBadCharacterPos0() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeBadCharacterPos0");
        try {
            new Hex().decode("foo");
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeBadCharacterPos1_add508() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeBadCharacterPos1_add508");
        try {
            new Hex().decode("0q");
            new Hex().decode("0q");
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeBadCharacterPos1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeBadCharacterPos1");
        try {
            new Hex().decode("bar");
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeClassCastException_add509() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeClassCastException_add509");
        try {
            new Hex().decode(new int[]{ 65 });
            new Hex().decode(new int[]{ 65 });
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeClassCastException() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeClassCastException");
        try {
            new Hex().decode(new int[]{ 66 });
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeClassCastException_literalMutation4399() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeClassCastException_literalMutation4399");
        try {
            new Hex().decode(new int[]{ 64 });
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeClassCastException_literalMutation4400() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeClassCastException_literalMutation4400");
        try {
            new Hex().decode(new int[]{ 32 });
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeClassCastException_literalMutation4401() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeClassCastException_literalMutation4401");
        try {
            new Hex().decode(new int[]{ 130 });
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeHexOddCharacters1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeHexOddCharacters1");
        checkDecodeHexOddCharacters(new char[]{ 'A' });
        checkDecodeHexOddCharacters(new char[]{ 'A' });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeHexOddCharacters1_remove457() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeHexOddCharacters1_remove457");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeHexOddCharacters3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeHexOddCharacters3");
        checkDecodeHexOddCharacters(new char[]{ 'A' , 'B' , 'C' });
        checkDecodeHexOddCharacters(new char[]{ 'A' , 'B' , 'C' });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeHexOddCharacters3_remove458() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeHexOddCharacters3_remove458");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeHexOddCharacters5() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeHexOddCharacters5");
        checkDecodeHexOddCharacters(new char[]{ 'A' , 'B' , 'C' , 'D' , 'E' });
        checkDecodeHexOddCharacters(new char[]{ 'A' , 'B' , 'C' , 'D' , 'E' });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeHexOddCharacters5_remove459() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeHexOddCharacters5_remove459");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeStringOddCharacters_add513() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeStringOddCharacters_add513");
        try {
            new Hex().decode("6");
            new Hex().decode("6");
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeStringOddCharacters() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeStringOddCharacters");
        try {
            new Hex().decode("bar");
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDencodeEmpty() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDencodeEmpty");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2604,null,2603,java.util.Arrays.equals(new byte[0], org.apache.commons.codec.binary.Hex.decodeHex(new char[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2606,null,2605,java.util.Arrays.equals(new byte[0], new org.apache.commons.codec.binary.Hex().decode(new byte[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2608,null,2607,java.util.Arrays.equals(new byte[0], ((byte[])(new org.apache.commons.codec.binary.Hex().decode("")))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeClassCastException_add514() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeClassCastException_add514");
        try {
            new Hex().encode(new int[]{ 65 });
            new Hex().encode(new int[]{ 65 });
        } catch (final EncoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeClassCastException() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeClassCastException");
        try {
            new Hex().encode(new int[]{ 66 });
        } catch (final EncoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeClassCastException_literalMutation4413() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeClassCastException_literalMutation4413");
        try {
            new Hex().encode(new int[]{ 64 });
        } catch (final EncoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeClassCastException_literalMutation4414() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeClassCastException_literalMutation4414");
        try {
            new Hex().encode(new int[]{ 32 });
        } catch (final EncoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeClassCastException_literalMutation4415() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeClassCastException_literalMutation4415");
        try {
            new Hex().encode(new int[]{ 130 });
        } catch (final EncoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 5 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(10000)) + 1];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeDecodeRandom_add515() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_add515");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 5 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(10000)) + 1];
            random.nextBytes(data);
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation4416() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation4416");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 4 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(10000)) + 1];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation4417() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation4417");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 2 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(10000)) + 1];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation4418() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation4418");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 10 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(10000)) + 1];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation4419() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation4419");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 6 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(10000)) + 1];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation4420() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation4420");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 5 ; i > 1 ; i--) {
            final byte[] data = new byte[(random.nextInt(10000)) + 1];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation4421() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation4421");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 5 ; i > -1 ; i--) {
            final byte[] data = new byte[(random.nextInt(10000)) + 1];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation4422() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation4422");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 5 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(10000)) + 1];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation4423() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation4423");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 5 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(10001)) + 1];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation4424() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation4424");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 5 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(9999)) + 1];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation4425() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation4425");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 5 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(5000)) + 1];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation4426() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation4426");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 5 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(20000)) + 1];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation4427() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation4427");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 5 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(10000)) + 2];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation4428() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation4428");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 5 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(10000)) + 0];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation4429() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation4429");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 5 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(10000)) + 0];
            random.nextBytes(data);
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeDecodeRandom_remove460() throws DecoderException, EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_remove460");
        final Random random = new Random();
        final Hex hex = new Hex();
        for (int i = 5 ; i > 0 ; i--) {
            final byte[] data = new byte[(random.nextInt(10000)) + 1];
            final char[] encodedChars = Hex.encodeHex(data);
            byte[] decodedBytes = Hex.decodeHex(encodedChars);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,null,2609,java.util.Arrays.equals(data, decodedBytes));
            final byte[] encodedStringBytes = hex.encode(data);
            decodedBytes = hex.decode(encodedStringBytes);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,null,2611,java.util.Arrays.equals(data, decodedBytes));
            String dataString = new String(encodedChars);
            char[] encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(encodedStringChars)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,null,2613,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
            dataString = new String(encodedChars);
            encodedStringChars = ((char[])(hex.encode(dataString)));
            decodedBytes = ((byte[])(hex.decode(new String(encodedStringChars))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,null,2615,java.util.Arrays.equals(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(dataString), decodedBytes));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeEmpty() throws EncoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeEmpty");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2618,null,2617,java.util.Arrays.equals(new char[0], org.apache.commons.codec.binary.Hex.encodeHex(new byte[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2620,null,2619,java.util.Arrays.equals(new byte[0], new org.apache.commons.codec.binary.Hex().encode(new byte[0])));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2622,null,2621,java.util.Arrays.equals(new char[0], ((char[])(new org.apache.commons.codec.binary.Hex().encode("")))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeZeroes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeZeroes");
        final char[] c = Hex.encodeHex(new byte[35]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2623,new java.lang.String(c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeZeroes_literalMutation4431() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeZeroes_literalMutation4431");
        final char[] c = Hex.encodeHex(new byte[37]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2623,new java.lang.String(c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeZeroes_literalMutation4432() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeZeroes_literalMutation4432");
        final char[] c = Hex.encodeHex(new byte[18]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2623,new java.lang.String(c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeZeroes_literalMutation4433() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeZeroes_literalMutation4433");
        final char[] c = Hex.encodeHex(new byte[72]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2623,new java.lang.String(c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHelloWorldLowerCaseHex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHelloWorldLowerCaseHex");
        final byte[] b = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        final String expected = "48656c6c6f20576f726c64";
        char[] actual;
        actual = Hex.encodeHex(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),140,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2624,new java.lang.String(actual));
        actual = Hex.encodeHex(b, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2625,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2626,new java.lang.String(actual));
        actual = Hex.encodeHex(b, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2628,expected,2627,expected.equals(new java.lang.String(actual)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHelloWorldLowerCaseHex_literalMutation4435() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHelloWorldLowerCaseHex_literalMutation4435");
        final byte[] b = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Hello World");
        final String expected = "foo";
        char[] actual;
        actual = Hex.encodeHex(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),140,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2624,new java.lang.String(actual));
        actual = Hex.encodeHex(b, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2625,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2626,new java.lang.String(actual));
        actual = Hex.encodeHex(b, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2628,expected,2627,expected.equals(new java.lang.String(actual)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHelloWorldLowerCaseHex_literalMutation4436() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHelloWorldLowerCaseHex_literalMutation4436");
        final byte[] b = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Hello World");
        final String expected = "48656c6c6f20576f726c64";
        char[] actual;
        actual = Hex.encodeHex(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),140,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2624,new java.lang.String(actual));
        actual = Hex.encodeHex(b, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2625,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2626,new java.lang.String(actual));
        actual = Hex.encodeHex(b, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2628,expected,2627,expected.equals(new java.lang.String(actual)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHelloWorldLowerCaseHex_literalMutation4437() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHelloWorldLowerCaseHex_literalMutation4437");
        final byte[] b = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Hello World");
        final String expected = "48656c6c6f20576f726c64";
        char[] actual;
        actual = Hex.encodeHex(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),140,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2624,new java.lang.String(actual));
        actual = Hex.encodeHex(b, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2625,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2626,new java.lang.String(actual));
        actual = Hex.encodeHex(b, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2628,expected,2627,expected.equals(new java.lang.String(actual)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHelloWorldUpperCaseHex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHelloWorldUpperCaseHex");
        final byte[] b = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("bar");
        final String expected = "48656C6C6F20576F726C64";
        char[] actual;
        actual = Hex.encodeHex(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2630,expected,2629,expected.equals(new java.lang.String(actual)));
        actual = Hex.encodeHex(b, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2632,expected,2631,expected.equals(new java.lang.String(actual)));
        actual = Hex.encodeHex(b, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,expected,2633,expected.equals(new java.lang.String(actual)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHelloWorldUpperCaseHex_literalMutation4439() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHelloWorldUpperCaseHex_literalMutation4439");
        final byte[] b = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Hello World");
        final String expected = "bar";
        char[] actual;
        actual = Hex.encodeHex(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2630,expected,2629,expected.equals(new java.lang.String(actual)));
        actual = Hex.encodeHex(b, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2632,expected,2631,expected.equals(new java.lang.String(actual)));
        actual = Hex.encodeHex(b, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,expected,2633,expected.equals(new java.lang.String(actual)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHelloWorldUpperCaseHex_literalMutation4440() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHelloWorldUpperCaseHex_literalMutation4440");
        final byte[] b = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Hello World");
        final String expected = "48656C6C6F20576F726C64";
        char[] actual;
        actual = Hex.encodeHex(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2630,expected,2629,expected.equals(new java.lang.String(actual)));
        actual = Hex.encodeHex(b, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2632,expected,2631,expected.equals(new java.lang.String(actual)));
        actual = Hex.encodeHex(b, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,expected,2633,expected.equals(new java.lang.String(actual)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHelloWorldUpperCaseHex_literalMutation4441() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHelloWorldUpperCaseHex_literalMutation4441");
        final byte[] b = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Hello World");
        final String expected = "48656C6C6F20576F726C64";
        char[] actual;
        actual = Hex.encodeHex(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2630,expected,2629,expected.equals(new java.lang.String(actual)));
        actual = Hex.encodeHex(b, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2632,expected,2631,expected.equals(new java.lang.String(actual)));
        actual = Hex.encodeHex(b, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,expected,2633,expected.equals(new java.lang.String(actual)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRequiredCharset_add516() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_add516");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRequiredCharset_add517() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_add517");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRequiredCharset_add518() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_add518");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRequiredCharset_add519() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_add519");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRequiredCharset_add520() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_add520");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRequiredCharset_add521() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_add521");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRequiredCharset() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset");
        testCustomCharset("bar", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRequiredCharset_literalMutation4443() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_literalMutation4443");
        testCustomCharset("UTF-8", "bar");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRequiredCharset_literalMutation4444() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_literalMutation4444");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("bar", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRequiredCharset_literalMutation4445() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_literalMutation4445");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "bar");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRequiredCharset_literalMutation4446() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_literalMutation4446");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("bar", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRequiredCharset_literalMutation4447() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_literalMutation4447");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "bar");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRequiredCharset_literalMutation4448() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_literalMutation4448");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("bar", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRequiredCharset_literalMutation4449() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_literalMutation4449");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "bar");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRequiredCharset_literalMutation4450() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_literalMutation4450");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("bar", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRequiredCharset_literalMutation4451() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_literalMutation4451");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "bar");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRequiredCharset_literalMutation4452() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_literalMutation4452");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("foo", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRequiredCharset_literalMutation4453() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_literalMutation4453");
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRequiredCharset_remove461() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_remove461");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRequiredCharset_remove462() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_remove462");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRequiredCharset_remove463() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_remove463");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRequiredCharset_remove464() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_remove464");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRequiredCharset_remove465() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_remove465");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRequiredCharset_remove466() throws UnsupportedEncodingException, DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRequiredCharset_remove466");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

