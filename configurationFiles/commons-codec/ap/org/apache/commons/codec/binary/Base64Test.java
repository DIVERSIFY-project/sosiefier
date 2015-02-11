package org.apache.commons.codec.binary;

import java.math.BigInteger;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Ignore;
import java.util.Random;
import org.junit.Test;

/** 
 * Test cases for Base64 class.
 * 
 * @see <a href="http://www.ietf.org/rfc/rfc2045.txt">RFC 2045</a>
 * @version $Id$
 */
public class Base64Test {
    private final Random random = new Random();

    /** 
     * @return Returns the random.
     */
public Random getRandom() {
        return this.random;
    }

    /** 
     * Test the isStringBase64 method.
     */
@Test(timeout = 1000)
    public void testIsStringBase64_add460() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsStringBase64_add460");
        final String nullString = null;
        final String emptyString = "";
        final String validString = "abc===defg\n\r123456\r789\r\rABC\n\nDEF==GHI\r\nJKL==============";
        final String invalidString = validString + ((char)(0));
        try {
            Base64.isBase64(nullString);
            Base64.isBase64(nullString);
        } catch (final NullPointerException npe) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1809,npe);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,null,1810,org.apache.commons.codec.binary.Base64.isBase64(emptyString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1813,null,1812,org.apache.commons.codec.binary.Base64.isBase64(validString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1815,null,1814,org.apache.commons.codec.binary.Base64.isBase64(invalidString));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the isStringBase64 method.
     */
@Test
    public void testIsStringBase64() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsStringBase64");
        final String nullString = null;
        final String emptyString = "foo";
        final String validString = "abc===defg\n\r123456\r789\r\rABC\n\nDEF==GHI\r\nJKL==============";
        final String invalidString = validString + ((char)(0));
        try {
            Base64.isBase64(nullString);
        } catch (final NullPointerException npe) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1809,npe);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,null,1810,org.apache.commons.codec.binary.Base64.isBase64(emptyString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1813,null,1812,org.apache.commons.codec.binary.Base64.isBase64(validString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1815,null,1814,org.apache.commons.codec.binary.Base64.isBase64(invalidString));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the isStringBase64 method.
     */
@Test
    public void testIsStringBase64_literalMutation1845() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsStringBase64_literalMutation1845");
        final String nullString = null;
        final String emptyString = "";
        final String validString = "foo";
        final String invalidString = validString + ((char)(0));
        try {
            Base64.isBase64(nullString);
        } catch (final NullPointerException npe) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1809,npe);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,null,1810,org.apache.commons.codec.binary.Base64.isBase64(emptyString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1813,null,1812,org.apache.commons.codec.binary.Base64.isBase64(validString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1815,null,1814,org.apache.commons.codec.binary.Base64.isBase64(invalidString));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the isStringBase64 method.
     */
@Test
    public void testIsStringBase64_literalMutation1846() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsStringBase64_literalMutation1846");
        final String nullString = null;
        final String emptyString = "";
        final String validString = "abc===defg\n\r123456\r789\r\rABC\n\nDEF==GHI\r\nJKL==============";
        final String invalidString = validString + ((char)(1));
        try {
            Base64.isBase64(nullString);
        } catch (final NullPointerException npe) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1809,npe);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,null,1810,org.apache.commons.codec.binary.Base64.isBase64(emptyString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1813,null,1812,org.apache.commons.codec.binary.Base64.isBase64(validString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1815,null,1814,org.apache.commons.codec.binary.Base64.isBase64(invalidString));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64 implementation
     */
@Test
    public void testBase64() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64");
        final String content = "foo";
        String encodedContent;
        byte[] encodedBytes = Base64.encodeBase64(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(content));
        encodedContent = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1695,encodedContent);
        Base64 b64 = new Base64(BaseNCodec.MIME_CHUNK_SIZE , null);
        encodedBytes = b64.encode(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(content));
        encodedContent = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1696,encodedContent);
        b64 = new Base64(0 , null);
        encodedBytes = b64.encode(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(content));
        encodedContent = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1697,encodedContent);
        final byte[] decode = b64.decode("SGVsbG{éééééé}8gV29ybGQ=");
        final String decodeString = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decode);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1698,decodeString);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64 implementation
     */
@Test
    public void testBase64_literalMutation1736() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64_literalMutation1736");
        final String content = "Hello World";
        String encodedContent;
        byte[] encodedBytes = Base64.encodeBase64(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(content));
        encodedContent = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1695,encodedContent);
        Base64 b64 = new Base64(BaseNCodec.MIME_CHUNK_SIZE , null);
        encodedBytes = b64.encode(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(content));
        encodedContent = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1696,encodedContent);
        b64 = new Base64(-1 , null);
        encodedBytes = b64.encode(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(content));
        encodedContent = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1697,encodedContent);
        final byte[] decode = b64.decode("SGVsbG{éééééé}8gV29ybGQ=");
        final String decodeString = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decode);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1698,decodeString);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64 implementation
     */
@Test
    public void testBase64_literalMutation1738() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64_literalMutation1738");
        final String content = "Hello World";
        String encodedContent;
        byte[] encodedBytes = Base64.encodeBase64(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(content));
        encodedContent = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1695,encodedContent);
        Base64 b64 = new Base64(BaseNCodec.MIME_CHUNK_SIZE , null);
        encodedBytes = b64.encode(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(content));
        encodedContent = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1696,encodedContent);
        b64 = new Base64(0 , null);
        encodedBytes = b64.encode(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(content));
        encodedContent = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1697,encodedContent);
        final byte[] decode = b64.decode("foo");
        final String decodeString = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decode);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1698,decodeString);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test our decode with pad character in the middle.
     * (Our current implementation:  halt decode and return what we've got so far).
     * 
     * The point of this test is not to say "this is the correct way to decode base64."
     * The point is simply to keep us aware of the current logic since 1.4 so we
     * don't accidentally break it without realizing.
     * 
     * Note for historians.  The 1.3 logic would decode to:
     * "Hello World\u0000Hello World" -- null in the middle ---
     * and 1.4 unwittingly changed it to current logic.
     */
@Test
    public void testDecodeWithInnerPad() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithInnerPad");
        final String content = "foo";
        final byte[] result = Base64.decodeBase64(content);
        final byte[] shouldBe = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Hello World");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1762,null,1761,java.util.Arrays.equals(result, shouldBe));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test our decode with pad character in the middle.
     * (Our current implementation:  halt decode and return what we've got so far).
     * 
     * The point of this test is not to say "this is the correct way to decode base64."
     * The point is simply to keep us aware of the current logic since 1.4 so we
     * don't accidentally break it without realizing.
     * 
     * Note for historians.  The 1.3 logic would decode to:
     * "Hello World\u0000Hello World" -- null in the middle ---
     * and 1.4 unwittingly changed it to current logic.
     */
@Test
    public void testDecodeWithInnerPad_literalMutation1814() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithInnerPad_literalMutation1814");
        final String content = "SGVsbG8gV29ybGQ=SGVsbG8gV29ybGQ=";
        final byte[] result = Base64.decodeBase64(content);
        final byte[] shouldBe = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1762,null,1761,java.util.Arrays.equals(result, shouldBe));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64.encodeBase64().
     */
@Test
    public void testChunkedEncodeMultipleOf76() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChunkedEncodeMultipleOf76");
        final byte[] expectedEncode = Base64.encodeBase64(Base64TestData.DECODED, false);
        final String actualResult = Base64TestData.ENCODED_76_CHARS_PER_LINE.replaceAll("\n", "\r\n");
        final byte[] actualEncode = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(actualResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,null,1717,java.util.Arrays.equals(expectedEncode, actualEncode));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64.encodeBase64().
     */
@Test
    public void testChunkedEncodeMultipleOf76_literalMutation1745() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChunkedEncodeMultipleOf76_literalMutation1745");
        final byte[] expectedEncode = Base64.encodeBase64(Base64TestData.DECODED, true);
        final String actualResult = Base64TestData.ENCODED_76_CHARS_PER_LINE.replaceAll("foo", "\r\n");
        final byte[] actualEncode = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(actualResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,null,1717,java.util.Arrays.equals(expectedEncode, actualEncode));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64.encodeBase64().
     */
@Test
    public void testChunkedEncodeMultipleOf76_literalMutation1746() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChunkedEncodeMultipleOf76_literalMutation1746");
        final byte[] expectedEncode = Base64.encodeBase64(Base64TestData.DECODED, true);
        final String actualResult = Base64TestData.ENCODED_76_CHARS_PER_LINE.replaceAll("\n", "foo");
        final byte[] actualEncode = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(actualResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,null,1717,java.util.Arrays.equals(expectedEncode, actualEncode));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * CODEC-68: isBase64 throws ArrayIndexOutOfBoundsException on some non-BASE64 bytes
     */
@Test(timeout = 1000)
    public void testCodec68_add448() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec68_add448");
        final byte[] x = new byte[]{ 'n' , 'A' , '=' , '=' , ((byte)(156)) };
        Base64.decodeBase64(x);
        Base64.decodeBase64(x);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * CODEC-68: isBase64 throws ArrayIndexOutOfBoundsException on some non-BASE64 bytes
     */
@Test
    public void testCodec68() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec68");
        final byte[] x = new byte[]{ 'n' , 'A' , '=' , '=' , ((byte)(155)) };
        Base64.decodeBase64(x);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * CODEC-68: isBase64 throws ArrayIndexOutOfBoundsException on some non-BASE64 bytes
     */
@Test(timeout = 1000)
    public void testCodec68_remove405() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec68_remove405");
        final byte[] x = new byte[]{ 'n' , 'A' , '=' , '=' , ((byte)(156)) };
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger1");
        final String encodedInt1 = "foo";
        final BigInteger bigInt1 = new BigInteger(("85739377120809420210425962799" + "0318636601332086981"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,encodedInt1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,bigInt1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1723,null,1722,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt1.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger1_literalMutation1748() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger1_literalMutation1748");
        final String encodedInt1 = "li7dzDacuo67Jg7mtqEm2TRuOMU=";
        final BigInteger bigInt1 = new BigInteger(("foo" + "0318636601332086981"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,encodedInt1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,bigInt1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1723,null,1722,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt1.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger1_literalMutation1749() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger1_literalMutation1749");
        final String encodedInt1 = "li7dzDacuo67Jg7mtqEm2TRuOMU=";
        final BigInteger bigInt1 = new BigInteger(("85739377120809420210425962799" + "foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1719,encodedInt1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1721,bigInt1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1723,null,1722,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt1.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger2");
        final String encodedInt2 = "foo";
        final BigInteger bigInt2 = new BigInteger(("13936727572861167254666467268" + "91466679477132949611"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,encodedInt2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1725,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,bigInt2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,null,1727,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt2.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger2_literalMutation1751() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger2_literalMutation1751");
        final String encodedInt2 = "9B5ypLY9pMOmtxCeTDHgwdNFeGs=";
        final BigInteger bigInt2 = new BigInteger(("foo" + "91466679477132949611"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,encodedInt2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1725,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,bigInt2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,null,1727,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt2.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger2_literalMutation1752() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger2_literalMutation1752");
        final String encodedInt2 = "9B5ypLY9pMOmtxCeTDHgwdNFeGs=";
        final BigInteger bigInt2 = new BigInteger(("13936727572861167254666467268" + "foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,encodedInt2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1725,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,bigInt2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,null,1727,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt2.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger3");
        final String encodedInt3 = "foo" + "rY+1LFWTK6D44AyiC1n8uWz1itkYMZF0/aKDK0Yjg==";
        final BigInteger bigInt3 = new BigInteger(("10806548154093873461951748545" + ("1196989136416448805819079363524309897749044958112417136240557" + "4495062430572478766856090958495998158114332651671116876320938126")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1729,encodedInt3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,bigInt3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1733,null,1732,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt3.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger3_literalMutation1754() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger3_literalMutation1754");
        final String encodedInt3 = "FKIhdgaG5LGKiEtF1vHy4f3y700zaD6QwDS3IrNVGzNp2" + "foo";
        final BigInteger bigInt3 = new BigInteger(("10806548154093873461951748545" + ("1196989136416448805819079363524309897749044958112417136240557" + "4495062430572478766856090958495998158114332651671116876320938126")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1729,encodedInt3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,bigInt3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1733,null,1732,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt3.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger3_literalMutation1755() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger3_literalMutation1755");
        final String encodedInt3 = "FKIhdgaG5LGKiEtF1vHy4f3y700zaD6QwDS3IrNVGzNp2" + "rY+1LFWTK6D44AyiC1n8uWz1itkYMZF0/aKDK0Yjg==";
        final BigInteger bigInt3 = new BigInteger(("foo" + ("1196989136416448805819079363524309897749044958112417136240557" + "4495062430572478766856090958495998158114332651671116876320938126")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1729,encodedInt3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,bigInt3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1733,null,1732,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt3.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger3_literalMutation1756() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger3_literalMutation1756");
        final String encodedInt3 = "FKIhdgaG5LGKiEtF1vHy4f3y700zaD6QwDS3IrNVGzNp2" + "rY+1LFWTK6D44AyiC1n8uWz1itkYMZF0/aKDK0Yjg==";
        final BigInteger bigInt3 = new BigInteger(("10806548154093873461951748545" + ("foo" + "4495062430572478766856090958495998158114332651671116876320938126")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1729,encodedInt3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,bigInt3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1733,null,1732,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt3.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger3_literalMutation1757() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger3_literalMutation1757");
        final String encodedInt3 = "FKIhdgaG5LGKiEtF1vHy4f3y700zaD6QwDS3IrNVGzNp2" + "rY+1LFWTK6D44AyiC1n8uWz1itkYMZF0/aKDK0Yjg==";
        final BigInteger bigInt3 = new BigInteger(("10806548154093873461951748545" + ("1196989136416448805819079363524309897749044958112417136240557" + "foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1729,encodedInt3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,bigInt3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1733,null,1732,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt3.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger4() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger4");
        final String encodedInt4 = "foo" + ("4iDm68fnp4Mi3RrJ6bZAygFrUIQLxLjV+OJtgJAEto0xAs+Mehuq1DkSFEpP3o" + ("DzCTOsrOiS1DwQe4oIb7zVk/9l7aPtJMHW0LVlMdwZNFNNJoqMcT2ZfCPrfvYv" + "Q0="));
        final BigInteger bigInt4 = new BigInteger(("80624726256040348115552042320" + ("6968135001872753709424419772586693950232350200555646471175944" + ("519297087885987040810778908507262272892702303774422853675597" + ("748008534040890923814202286633163248086055216976551456088015" + ("338880713818192088877057717530169381044092839402438015097654" + "53542091716518238707344493641683483917"))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,encodedInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1735,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt4)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,bigInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,null,1737,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt4.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger4_literalMutation1759() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger4_literalMutation1759");
        final String encodedInt4 = "ctA8YGxrtngg/zKVvqEOefnwmViFztcnPBYPlJsvh6yKI" + ("foo" + ("DzCTOsrOiS1DwQe4oIb7zVk/9l7aPtJMHW0LVlMdwZNFNNJoqMcT2ZfCPrfvYv" + "Q0="));
        final BigInteger bigInt4 = new BigInteger(("80624726256040348115552042320" + ("6968135001872753709424419772586693950232350200555646471175944" + ("519297087885987040810778908507262272892702303774422853675597" + ("748008534040890923814202286633163248086055216976551456088015" + ("338880713818192088877057717530169381044092839402438015097654" + "53542091716518238707344493641683483917"))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,encodedInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1735,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt4)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,bigInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,null,1737,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt4.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger4_literalMutation1760() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger4_literalMutation1760");
        final String encodedInt4 = "ctA8YGxrtngg/zKVvqEOefnwmViFztcnPBYPlJsvh6yKI" + ("4iDm68fnp4Mi3RrJ6bZAygFrUIQLxLjV+OJtgJAEto0xAs+Mehuq1DkSFEpP3o" + ("foo" + "Q0="));
        final BigInteger bigInt4 = new BigInteger(("80624726256040348115552042320" + ("6968135001872753709424419772586693950232350200555646471175944" + ("519297087885987040810778908507262272892702303774422853675597" + ("748008534040890923814202286633163248086055216976551456088015" + ("338880713818192088877057717530169381044092839402438015097654" + "53542091716518238707344493641683483917"))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,encodedInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1735,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt4)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,bigInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,null,1737,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt4.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger4_literalMutation1761() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger4_literalMutation1761");
        final String encodedInt4 = "ctA8YGxrtngg/zKVvqEOefnwmViFztcnPBYPlJsvh6yKI" + ("4iDm68fnp4Mi3RrJ6bZAygFrUIQLxLjV+OJtgJAEto0xAs+Mehuq1DkSFEpP3o" + ("DzCTOsrOiS1DwQe4oIb7zVk/9l7aPtJMHW0LVlMdwZNFNNJoqMcT2ZfCPrfvYv" + "foo"));
        final BigInteger bigInt4 = new BigInteger(("80624726256040348115552042320" + ("6968135001872753709424419772586693950232350200555646471175944" + ("519297087885987040810778908507262272892702303774422853675597" + ("748008534040890923814202286633163248086055216976551456088015" + ("338880713818192088877057717530169381044092839402438015097654" + "53542091716518238707344493641683483917"))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,encodedInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1735,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt4)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,bigInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,null,1737,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt4.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger4_literalMutation1762() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger4_literalMutation1762");
        final String encodedInt4 = "ctA8YGxrtngg/zKVvqEOefnwmViFztcnPBYPlJsvh6yKI" + ("4iDm68fnp4Mi3RrJ6bZAygFrUIQLxLjV+OJtgJAEto0xAs+Mehuq1DkSFEpP3o" + ("DzCTOsrOiS1DwQe4oIb7zVk/9l7aPtJMHW0LVlMdwZNFNNJoqMcT2ZfCPrfvYv" + "Q0="));
        final BigInteger bigInt4 = new BigInteger(("foo" + ("6968135001872753709424419772586693950232350200555646471175944" + ("519297087885987040810778908507262272892702303774422853675597" + ("748008534040890923814202286633163248086055216976551456088015" + ("338880713818192088877057717530169381044092839402438015097654" + "53542091716518238707344493641683483917"))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,encodedInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1735,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt4)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,bigInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,null,1737,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt4.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger4_literalMutation1763() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger4_literalMutation1763");
        final String encodedInt4 = "ctA8YGxrtngg/zKVvqEOefnwmViFztcnPBYPlJsvh6yKI" + ("4iDm68fnp4Mi3RrJ6bZAygFrUIQLxLjV+OJtgJAEto0xAs+Mehuq1DkSFEpP3o" + ("DzCTOsrOiS1DwQe4oIb7zVk/9l7aPtJMHW0LVlMdwZNFNNJoqMcT2ZfCPrfvYv" + "Q0="));
        final BigInteger bigInt4 = new BigInteger(("80624726256040348115552042320" + ("foo" + ("519297087885987040810778908507262272892702303774422853675597" + ("748008534040890923814202286633163248086055216976551456088015" + ("338880713818192088877057717530169381044092839402438015097654" + "53542091716518238707344493641683483917"))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,encodedInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1735,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt4)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,bigInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,null,1737,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt4.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger4_literalMutation1764() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger4_literalMutation1764");
        final String encodedInt4 = "ctA8YGxrtngg/zKVvqEOefnwmViFztcnPBYPlJsvh6yKI" + ("4iDm68fnp4Mi3RrJ6bZAygFrUIQLxLjV+OJtgJAEto0xAs+Mehuq1DkSFEpP3o" + ("DzCTOsrOiS1DwQe4oIb7zVk/9l7aPtJMHW0LVlMdwZNFNNJoqMcT2ZfCPrfvYv" + "Q0="));
        final BigInteger bigInt4 = new BigInteger(("80624726256040348115552042320" + ("6968135001872753709424419772586693950232350200555646471175944" + ("foo" + ("748008534040890923814202286633163248086055216976551456088015" + ("338880713818192088877057717530169381044092839402438015097654" + "53542091716518238707344493641683483917"))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,encodedInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1735,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt4)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,bigInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,null,1737,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt4.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger4_literalMutation1765() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger4_literalMutation1765");
        final String encodedInt4 = "ctA8YGxrtngg/zKVvqEOefnwmViFztcnPBYPlJsvh6yKI" + ("4iDm68fnp4Mi3RrJ6bZAygFrUIQLxLjV+OJtgJAEto0xAs+Mehuq1DkSFEpP3o" + ("DzCTOsrOiS1DwQe4oIb7zVk/9l7aPtJMHW0LVlMdwZNFNNJoqMcT2ZfCPrfvYv" + "Q0="));
        final BigInteger bigInt4 = new BigInteger(("80624726256040348115552042320" + ("6968135001872753709424419772586693950232350200555646471175944" + ("519297087885987040810778908507262272892702303774422853675597" + ("foo" + ("338880713818192088877057717530169381044092839402438015097654" + "53542091716518238707344493641683483917"))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,encodedInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1735,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt4)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,bigInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,null,1737,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt4.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger4_literalMutation1766() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger4_literalMutation1766");
        final String encodedInt4 = "ctA8YGxrtngg/zKVvqEOefnwmViFztcnPBYPlJsvh6yKI" + ("4iDm68fnp4Mi3RrJ6bZAygFrUIQLxLjV+OJtgJAEto0xAs+Mehuq1DkSFEpP3o" + ("DzCTOsrOiS1DwQe4oIb7zVk/9l7aPtJMHW0LVlMdwZNFNNJoqMcT2ZfCPrfvYv" + "Q0="));
        final BigInteger bigInt4 = new BigInteger(("80624726256040348115552042320" + ("6968135001872753709424419772586693950232350200555646471175944" + ("519297087885987040810778908507262272892702303774422853675597" + ("748008534040890923814202286633163248086055216976551456088015" + ("foo" + "53542091716518238707344493641683483917"))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,encodedInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1735,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt4)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,bigInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,null,1737,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt4.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeInteger4_literalMutation1767() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeInteger4_literalMutation1767");
        final String encodedInt4 = "ctA8YGxrtngg/zKVvqEOefnwmViFztcnPBYPlJsvh6yKI" + ("4iDm68fnp4Mi3RrJ6bZAygFrUIQLxLjV+OJtgJAEto0xAs+Mehuq1DkSFEpP3o" + ("DzCTOsrOiS1DwQe4oIb7zVk/9l7aPtJMHW0LVlMdwZNFNNJoqMcT2ZfCPrfvYv" + "Q0="));
        final BigInteger bigInt4 = new BigInteger(("80624726256040348115552042320" + ("6968135001872753709424419772586693950232350200555646471175944" + ("519297087885987040810778908507262272892702303774422853675597" + ("748008534040890923814202286633163248086055216976551456088015" + ("338880713818192088877057717530169381044092839402438015097654" + "foo"))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,encodedInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1735,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeInteger(bigInt4)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,bigInt4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,null,1737,org.apache.commons.codec.binary.Base64.decodeInteger(encodedInt4.getBytes(org.apache.commons.codec.Charsets.UTF_8)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodeIntegerEdgeCases() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeIntegerEdgeCases");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCodeIntegerNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodeIntegerNull");
        try {
            Base64.encodeInteger(null);
            Base64.encodeInteger(null);
        } catch (final NullPointerException npe) {
        } catch (final Exception e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructors() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors");
        Base64 base64;
        base64 = new Base64();
        base64 = new Base64(0);
        base64 = new Base64(-1 , new byte[]{  });
        base64 = new Base64(64 , new byte[]{  });
        try {
            base64 = new Base64(-1 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ '=' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ '$' });
        try {
            base64 = new Base64(64 , new byte[]{ 'A' , '$' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ ' ' , '$' , '\n' , '\r' , '\t' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1743,base64);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructors_literalMutation1794() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation1794");
        Base64 base64;
        base64 = new Base64();
        base64 = new Base64(-1);
        base64 = new Base64(2 , new byte[]{  });
        base64 = new Base64(64 , new byte[]{  });
        try {
            base64 = new Base64(-1 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ '=' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ '$' });
        try {
            base64 = new Base64(64 , new byte[]{ 'A' , '$' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ ' ' , '$' , '\n' , '\r' , '\t' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1743,base64);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructors_literalMutation1795() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation1795");
        Base64 base64;
        base64 = new Base64();
        base64 = new Base64(-1);
        base64 = new Base64(-1 , new byte[]{  });
        base64 = new Base64(63 , new byte[]{  });
        try {
            base64 = new Base64(-1 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ '=' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ '$' });
        try {
            base64 = new Base64(64 , new byte[]{ 'A' , '$' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ ' ' , '$' , '\n' , '\r' , '\t' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1743,base64);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructors_literalMutation1796() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation1796");
        Base64 base64;
        base64 = new Base64();
        base64 = new Base64(-1);
        base64 = new Base64(-1 , new byte[]{  });
        base64 = new Base64(64 , new byte[]{  });
        try {
            base64 = new Base64(2 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ '=' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ '$' });
        try {
            base64 = new Base64(64 , new byte[]{ 'A' , '$' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ ' ' , '$' , '\n' , '\r' , '\t' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1743,base64);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructors_literalMutation1798() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation1798");
        Base64 base64;
        base64 = new Base64();
        base64 = new Base64(-1);
        base64 = new Base64(-1 , new byte[]{  });
        base64 = new Base64(64 , new byte[]{  });
        try {
            base64 = new Base64(-1 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(65 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ '=' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ '$' });
        try {
            base64 = new Base64(64 , new byte[]{ 'A' , '$' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ ' ' , '$' , '\n' , '\r' , '\t' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1743,base64);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructors_literalMutation1800() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation1800");
        Base64 base64;
        base64 = new Base64();
        base64 = new Base64(-1);
        base64 = new Base64(-1 , new byte[]{  });
        base64 = new Base64(64 , new byte[]{  });
        try {
            base64 = new Base64(-1 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(63 , new byte[]{ '=' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ '$' });
        try {
            base64 = new Base64(64 , new byte[]{ 'A' , '$' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ ' ' , '$' , '\n' , '\r' , '\t' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1743,base64);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructors_literalMutation1802() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation1802");
        Base64 base64;
        base64 = new Base64();
        base64 = new Base64(-1);
        base64 = new Base64(-1 , new byte[]{  });
        base64 = new Base64(64 , new byte[]{  });
        try {
            base64 = new Base64(-1 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ '=' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(65 , new byte[]{ '$' });
        try {
            base64 = new Base64(64 , new byte[]{ 'A' , '$' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ ' ' , '$' , '\n' , '\r' , '\t' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1743,base64);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructors_literalMutation1804() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation1804");
        Base64 base64;
        base64 = new Base64();
        base64 = new Base64(-1);
        base64 = new Base64(-1 , new byte[]{  });
        base64 = new Base64(64 , new byte[]{  });
        try {
            base64 = new Base64(-1 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ '=' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ '$' });
        try {
            base64 = new Base64(63 , new byte[]{ 'A' , '$' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ ' ' , '$' , '\n' , '\r' , '\t' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1743,base64);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructors_literalMutation1807() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation1807");
        Base64 base64;
        base64 = new Base64();
        base64 = new Base64(-1);
        base64 = new Base64(-1 , new byte[]{  });
        base64 = new Base64(64 , new byte[]{  });
        try {
            base64 = new Base64(-1 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ 'A' });
        } catch (final IllegalArgumentException ignored) {
        }
        try {
            base64 = new Base64(64 , new byte[]{ '=' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(64 , new byte[]{ '$' });
        try {
            base64 = new Base64(64 , new byte[]{ 'A' , '$' });
        } catch (final IllegalArgumentException ignored) {
        }
        base64 = new Base64(63 , new byte[]{ ' ' , '$' , '\n' , '\r' , '\t' });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1743,base64);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructor_Int_ByteArray_Boolean() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_Int_ByteArray_Boolean");
        final Base64 base64 = new Base64(64 , new byte[]{ '\t' } , false);
        final byte[] encoded = base64.encode(Base64TestData.DECODED);
        String expectedResult = Base64TestData.ENCODED_64_CHARS_PER_LINE;
        expectedResult = expectedResult.replace('\n', '\t');
        final String result = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructor_Int_ByteArray_Boolean_literalMutation1779() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_Int_ByteArray_Boolean_literalMutation1779");
        final Base64 base64 = new Base64(65 , new byte[]{ '\t' } , true);
        final byte[] encoded = base64.encode(Base64TestData.DECODED);
        String expectedResult = Base64TestData.ENCODED_64_CHARS_PER_LINE;
        expectedResult = expectedResult.replace('\n', '\t');
        final String result = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructor_Int_ByteArray_Boolean_UrlSafe() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_Int_ByteArray_Boolean_UrlSafe");
        final Base64 base64 = new Base64(63 , new byte[]{ '\t' } , true);
        final byte[] encoded = base64.encode(Base64TestData.DECODED);
        String expectedResult = Base64TestData.ENCODED_64_CHARS_PER_LINE;
        expectedResult = expectedResult.replaceAll("=", "");
        expectedResult = expectedResult.replace('\n', '\t');
        expectedResult = expectedResult.replace('+', '-');
        expectedResult = expectedResult.replace('/', '_');
        final String result = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1740,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructor_Int_ByteArray_Boolean_UrlSafe_literalMutation1784() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_Int_ByteArray_Boolean_UrlSafe_literalMutation1784");
        final Base64 base64 = new Base64(64 , new byte[]{ '\t' } , true);
        final byte[] encoded = base64.encode(Base64TestData.DECODED);
        String expectedResult = Base64TestData.ENCODED_64_CHARS_PER_LINE;
        expectedResult = expectedResult.replaceAll("=", "");
        expectedResult = expectedResult.replace('\n', '\t');
        expectedResult = expectedResult.replace('+', '-');
        expectedResult = expectedResult.replace('/', '_');
        final String result = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1740,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructor_Int_ByteArray_Boolean_UrlSafe_literalMutation1785() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_Int_ByteArray_Boolean_UrlSafe_literalMutation1785");
        final Base64 base64 = new Base64(64 , new byte[]{ '\t' } , true);
        final byte[] encoded = base64.encode(Base64TestData.DECODED);
        String expectedResult = Base64TestData.ENCODED_64_CHARS_PER_LINE;
        expectedResult = expectedResult.replaceAll("foo", "");
        expectedResult = expectedResult.replace('\n', '\t');
        expectedResult = expectedResult.replace('+', '-');
        expectedResult = expectedResult.replace('/', '_');
        final String result = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1740,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testConstructor_Int_ByteArray_Boolean_UrlSafe_literalMutation1786() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_Int_ByteArray_Boolean_UrlSafe_literalMutation1786");
        final Base64 base64 = new Base64(64 , new byte[]{ '\t' } , true);
        final byte[] encoded = base64.encode(Base64TestData.DECODED);
        String expectedResult = Base64TestData.ENCODED_64_CHARS_PER_LINE;
        expectedResult = expectedResult.replaceAll("=", "foo");
        expectedResult = expectedResult.replace('\n', '\t');
        expectedResult = expectedResult.replace('+', '-');
        expectedResult = expectedResult.replace('/', '_');
        final String result = org.apache.commons.codec.binary.StringUtils.newStringUtf8(encoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1740,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests conditional true branch for "marker0" test.
     */
@Test
    public void testDecodePadMarkerIndex2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodePadMarkerIndex2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1746,new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64("QQ==".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests conditional branches for "marker1" test.
     */
@Test
    public void testDecodePadMarkerIndex3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodePadMarkerIndex3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1747,new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64("QUE=".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64("QUFB".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodePadOnly() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodePadOnly");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1749,org.apache.commons.codec.binary.Base64.decodeBase64("====".getBytes(org.apache.commons.codec.Charsets.UTF_8)).length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64("====".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1751,org.apache.commons.codec.binary.Base64.decodeBase64("===".getBytes(org.apache.commons.codec.Charsets.UTF_8)).length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,org.apache.commons.codec.binary.Base64.decodeBase64("==".getBytes(org.apache.commons.codec.Charsets.UTF_8)).length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1753,org.apache.commons.codec.binary.Base64.decodeBase64("=".getBytes(org.apache.commons.codec.Charsets.UTF_8)).length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1754,org.apache.commons.codec.binary.Base64.decodeBase64("".getBytes(org.apache.commons.codec.Charsets.UTF_8)).length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodePadOnlyChunked() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodePadOnlyChunked");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1755,org.apache.commons.codec.binary.Base64.decodeBase64("====\n".getBytes(org.apache.commons.codec.Charsets.UTF_8)).length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64("====\n".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1757,org.apache.commons.codec.binary.Base64.decodeBase64("===\n".getBytes(org.apache.commons.codec.Charsets.UTF_8)).length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,org.apache.commons.codec.binary.Base64.decodeBase64("==\n".getBytes(org.apache.commons.codec.Charsets.UTF_8)).length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,org.apache.commons.codec.binary.Base64.decodeBase64("=\n".getBytes(org.apache.commons.codec.Charsets.UTF_8)).length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1760,org.apache.commons.codec.binary.Base64.decodeBase64("\n".getBytes(org.apache.commons.codec.Charsets.UTF_8)).length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeWithWhitespace_add449() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithWhitespace_add449");
        final String orig = "I am a late night coder.";
        final byte[] encodedArray = Base64.encodeBase64(orig.getBytes(org.apache.commons.codec.Charsets.UTF_8));
        final StringBuilder intermediate = new StringBuilder(new String(encodedArray));
        intermediate.insert(2, ' ');
        intermediate.insert(2, ' ');
        intermediate.insert(5, '\t');
        intermediate.insert(10, '\r');
        intermediate.insert(15, '\n');
        final byte[] encodedWithWS = intermediate.toString().getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedWithWS = Base64.decodeBase64(encodedWithWS);
        final String dest = new String(decodedWithWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,orig);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeWithWhitespace_add450() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithWhitespace_add450");
        final String orig = "I am a late night coder.";
        final byte[] encodedArray = Base64.encodeBase64(orig.getBytes(org.apache.commons.codec.Charsets.UTF_8));
        final StringBuilder intermediate = new StringBuilder(new String(encodedArray));
        intermediate.insert(2, ' ');
        intermediate.insert(5, '\t');
        intermediate.insert(5, '\t');
        intermediate.insert(10, '\r');
        intermediate.insert(15, '\n');
        final byte[] encodedWithWS = intermediate.toString().getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedWithWS = Base64.decodeBase64(encodedWithWS);
        final String dest = new String(decodedWithWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,orig);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeWithWhitespace_add451() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithWhitespace_add451");
        final String orig = "I am a late night coder.";
        final byte[] encodedArray = Base64.encodeBase64(orig.getBytes(org.apache.commons.codec.Charsets.UTF_8));
        final StringBuilder intermediate = new StringBuilder(new String(encodedArray));
        intermediate.insert(2, ' ');
        intermediate.insert(5, '\t');
        intermediate.insert(10, '\r');
        intermediate.insert(10, '\r');
        intermediate.insert(15, '\n');
        final byte[] encodedWithWS = intermediate.toString().getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedWithWS = Base64.decodeBase64(encodedWithWS);
        final String dest = new String(decodedWithWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,orig);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeWithWhitespace_add452() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithWhitespace_add452");
        final String orig = "I am a late night coder.";
        final byte[] encodedArray = Base64.encodeBase64(orig.getBytes(org.apache.commons.codec.Charsets.UTF_8));
        final StringBuilder intermediate = new StringBuilder(new String(encodedArray));
        intermediate.insert(2, ' ');
        intermediate.insert(5, '\t');
        intermediate.insert(10, '\r');
        intermediate.insert(15, '\n');
        intermediate.insert(15, '\n');
        final byte[] encodedWithWS = intermediate.toString().getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedWithWS = Base64.decodeBase64(encodedWithWS);
        final String dest = new String(decodedWithWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,orig);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeWithWhitespace() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithWhitespace");
        final String orig = "foo";
        final byte[] encodedArray = Base64.encodeBase64(orig.getBytes(org.apache.commons.codec.Charsets.UTF_8));
        final StringBuilder intermediate = new StringBuilder(new String(encodedArray));
        intermediate.insert(2, ' ');
        intermediate.insert(5, '\t');
        intermediate.insert(10, '\r');
        intermediate.insert(15, '\n');
        final byte[] encodedWithWS = intermediate.toString().getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedWithWS = Base64.decodeBase64(encodedWithWS);
        final String dest = new String(decodedWithWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,orig);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeWithWhitespace_literalMutation1816() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithWhitespace_literalMutation1816");
        final String orig = "I am a late night coder.";
        final byte[] encodedArray = Base64.encodeBase64(orig.getBytes(org.apache.commons.codec.Charsets.UTF_8));
        final StringBuilder intermediate = new StringBuilder(new String(encodedArray));
        intermediate.insert(3, ' ');
        intermediate.insert(5, '\t');
        intermediate.insert(10, '\r');
        intermediate.insert(15, '\n');
        final byte[] encodedWithWS = intermediate.toString().getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedWithWS = Base64.decodeBase64(encodedWithWS);
        final String dest = new String(decodedWithWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,orig);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeWithWhitespace_literalMutation1818() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithWhitespace_literalMutation1818");
        final String orig = "I am a late night coder.";
        final byte[] encodedArray = Base64.encodeBase64(orig.getBytes(org.apache.commons.codec.Charsets.UTF_8));
        final StringBuilder intermediate = new StringBuilder(new String(encodedArray));
        intermediate.insert(2, ' ');
        intermediate.insert(4, '\t');
        intermediate.insert(10, '\r');
        intermediate.insert(15, '\n');
        final byte[] encodedWithWS = intermediate.toString().getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedWithWS = Base64.decodeBase64(encodedWithWS);
        final String dest = new String(decodedWithWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,orig);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeWithWhitespace_literalMutation1820() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithWhitespace_literalMutation1820");
        final String orig = "I am a late night coder.";
        final byte[] encodedArray = Base64.encodeBase64(orig.getBytes(org.apache.commons.codec.Charsets.UTF_8));
        final StringBuilder intermediate = new StringBuilder(new String(encodedArray));
        intermediate.insert(2, ' ');
        intermediate.insert(5, '\t');
        intermediate.insert(9, '\r');
        intermediate.insert(15, '\n');
        final byte[] encodedWithWS = intermediate.toString().getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedWithWS = Base64.decodeBase64(encodedWithWS);
        final String dest = new String(decodedWithWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,orig);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDecodeWithWhitespace_literalMutation1822() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithWhitespace_literalMutation1822");
        final String orig = "I am a late night coder.";
        final byte[] encodedArray = Base64.encodeBase64(orig.getBytes(org.apache.commons.codec.Charsets.UTF_8));
        final StringBuilder intermediate = new StringBuilder(new String(encodedArray));
        intermediate.insert(2, ' ');
        intermediate.insert(5, '\t');
        intermediate.insert(10, '\r');
        intermediate.insert(16, '\n');
        final byte[] encodedWithWS = intermediate.toString().getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedWithWS = Base64.decodeBase64(encodedWithWS);
        final String dest = new String(decodedWithWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,orig);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeWithWhitespace_remove406() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithWhitespace_remove406");
        final String orig = "I am a late night coder.";
        final byte[] encodedArray = Base64.encodeBase64(orig.getBytes(org.apache.commons.codec.Charsets.UTF_8));
        final StringBuilder intermediate = new StringBuilder(new String(encodedArray));
        intermediate.insert(5, '\t');
        intermediate.insert(10, '\r');
        intermediate.insert(15, '\n');
        final byte[] encodedWithWS = intermediate.toString().getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedWithWS = Base64.decodeBase64(encodedWithWS);
        final String dest = new String(decodedWithWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,orig);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeWithWhitespace_remove407() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithWhitespace_remove407");
        final String orig = "I am a late night coder.";
        final byte[] encodedArray = Base64.encodeBase64(orig.getBytes(org.apache.commons.codec.Charsets.UTF_8));
        final StringBuilder intermediate = new StringBuilder(new String(encodedArray));
        intermediate.insert(5, '\t');
        intermediate.insert(10, '\r');
        intermediate.insert(15, '\n');
        final byte[] encodedWithWS = intermediate.toString().getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedWithWS = Base64.decodeBase64(encodedWithWS);
        final String dest = new String(decodedWithWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,orig);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeWithWhitespace_remove408() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithWhitespace_remove408");
        final String orig = "I am a late night coder.";
        final byte[] encodedArray = Base64.encodeBase64(orig.getBytes(org.apache.commons.codec.Charsets.UTF_8));
        final StringBuilder intermediate = new StringBuilder(new String(encodedArray));
        intermediate.insert(5, '\t');
        intermediate.insert(10, '\r');
        intermediate.insert(15, '\n');
        final byte[] encodedWithWS = intermediate.toString().getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedWithWS = Base64.decodeBase64(encodedWithWS);
        final String dest = new String(decodedWithWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,orig);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecodeWithWhitespace_remove409() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeWithWhitespace_remove409");
        final String orig = "I am a late night coder.";
        final byte[] encodedArray = Base64.encodeBase64(orig.getBytes(org.apache.commons.codec.Charsets.UTF_8));
        final StringBuilder intermediate = new StringBuilder(new String(encodedArray));
        intermediate.insert(5, '\t');
        intermediate.insert(10, '\r');
        intermediate.insert(15, '\n');
        final byte[] encodedWithWS = intermediate.toString().getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final byte[] decodedWithWS = Base64.decodeBase64(encodedWithWS);
        final String dest = new String(decodedWithWS);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,orig);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test encode and decode of empty byte array.
     */
@Test
    public void testEmptyBase64() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyBase64");
        byte[] empty = new byte[-1];
        byte[] result = Base64.encodeBase64(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1765,result.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1767,null,1766,org.apache.commons.codec.binary.Base64.encodeBase64(null));
        empty = new byte[0];
        result = Base64.decodeBase64(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,result.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,null,1769,org.apache.commons.codec.binary.Base64.decodeBase64(((byte[])(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test encode and decode of empty byte array.
     */
@Test
    public void testEmptyBase64_literalMutation1825() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyBase64_literalMutation1825");
        byte[] empty = new byte[0];
        byte[] result = Base64.encodeBase64(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1765,result.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1767,null,1766,org.apache.commons.codec.binary.Base64.encodeBase64(null));
        empty = new byte[1];
        result = Base64.decodeBase64(empty);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,result.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,null,1769,org.apache.commons.codec.binary.Base64.decodeBase64(((byte[])(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeDecodeRandom_add453() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_add453");
        for (int i = 1 ; i < 5 ; i++) {
            final byte[] data = new byte[(getRandom().nextInt(10000)) + 1];
            getRandom().nextBytes(data);
            getRandom().nextBytes(data);
            final byte[] enc = Base64.encodeBase64(data);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,null,1773,org.apache.commons.codec.binary.Base64.isBase64(enc));
            final byte[] data2 = Base64.decodeBase64(enc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,null,1775,java.util.Arrays.equals(data, data2));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom");
        for (int i = 2 ; i < 5 ; i++) {
            final byte[] data = new byte[(getRandom().nextInt(10000)) + 1];
            getRandom().nextBytes(data);
            final byte[] enc = Base64.encodeBase64(data);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,null,1773,org.apache.commons.codec.binary.Base64.isBase64(enc));
            final byte[] data2 = Base64.decodeBase64(enc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,null,1775,java.util.Arrays.equals(data, data2));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation1827() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation1827");
        for (int i = 1 ; i < 4 ; i++) {
            final byte[] data = new byte[(getRandom().nextInt(10000)) + 1];
            getRandom().nextBytes(data);
            final byte[] enc = Base64.encodeBase64(data);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,null,1773,org.apache.commons.codec.binary.Base64.isBase64(enc));
            final byte[] data2 = Base64.decodeBase64(enc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,null,1775,java.util.Arrays.equals(data, data2));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation1828() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation1828");
        for (int i = 1 ; i < 5 ; i++) {
            final byte[] data = new byte[(getRandom().nextInt(9999)) + 1];
            getRandom().nextBytes(data);
            final byte[] enc = Base64.encodeBase64(data);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,null,1773,org.apache.commons.codec.binary.Base64.isBase64(enc));
            final byte[] data2 = Base64.decodeBase64(enc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,null,1775,java.util.Arrays.equals(data, data2));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeRandom_literalMutation1829() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_literalMutation1829");
        for (int i = 1 ; i < 5 ; i++) {
            final byte[] data = new byte[(getRandom().nextInt(10000)) + 2];
            getRandom().nextBytes(data);
            final byte[] enc = Base64.encodeBase64(data);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,null,1773,org.apache.commons.codec.binary.Base64.isBase64(enc));
            final byte[] data2 = Base64.decodeBase64(enc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,null,1775,java.util.Arrays.equals(data, data2));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeDecodeRandom_remove410() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeRandom_remove410");
        for (int i = 1 ; i < 5 ; i++) {
            final byte[] data = new byte[(getRandom().nextInt(10000)) + 1];
            final byte[] enc = Base64.encodeBase64(data);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,null,1773,org.apache.commons.codec.binary.Base64.isBase64(enc));
            final byte[] data2 = Base64.decodeBase64(enc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,null,1775,java.util.Arrays.equals(data, data2));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeDecodeSmall_add454() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeSmall_add454");
        for (int i = 0 ; i < 12 ; i++) {
            final byte[] data = new byte[i];
            getRandom().nextBytes(data);
            getRandom().nextBytes(data);
            final byte[] enc = Base64.encodeBase64(data);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1777,(("\"" + (new java.lang.String(enc))) + "\" is Base64 data."));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1779,null,1778,org.apache.commons.codec.binary.Base64.isBase64(enc));
            final byte[] data2 = Base64.decodeBase64(enc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,(((toString(data)) + " equals ") + (toString(data2))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,null,1781,java.util.Arrays.equals(data, data2));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeSmall() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeSmall");
        for (int i = -1 ; i < 12 ; i++) {
            final byte[] data = new byte[i];
            getRandom().nextBytes(data);
            final byte[] enc = Base64.encodeBase64(data);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1777,(("\"" + (new java.lang.String(enc))) + "\" is Base64 data."));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1779,null,1778,org.apache.commons.codec.binary.Base64.isBase64(enc));
            final byte[] data2 = Base64.decodeBase64(enc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,(((toString(data)) + " equals ") + (toString(data2))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,null,1781,java.util.Arrays.equals(data, data2));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeDecodeSmall_literalMutation1831() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeSmall_literalMutation1831");
        for (int i = 0 ; i < 11 ; i++) {
            final byte[] data = new byte[i];
            getRandom().nextBytes(data);
            final byte[] enc = Base64.encodeBase64(data);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1777,(("\"" + (new java.lang.String(enc))) + "\" is Base64 data."));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1779,null,1778,org.apache.commons.codec.binary.Base64.isBase64(enc));
            final byte[] data2 = Base64.decodeBase64(enc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,(((toString(data)) + " equals ") + (toString(data2))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,null,1781,java.util.Arrays.equals(data, data2));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeDecodeSmall_remove411() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecodeSmall_remove411");
        for (int i = 0 ; i < 12 ; i++) {
            final byte[] data = new byte[i];
            final byte[] enc = Base64.encodeBase64(data);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1777,(("\"" + (new java.lang.String(enc))) + "\" is Base64 data."));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1779,null,1778,org.apache.commons.codec.binary.Base64.isBase64(enc));
            final byte[] data2 = Base64.decodeBase64(enc);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,(((toString(data)) + " equals ") + (toString(data2))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,null,1781,java.util.Arrays.equals(data, data2));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeOverMaxSize_add455() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize_add455");
        testEncodeOverMaxSize(-1);
        testEncodeOverMaxSize(-1);
        testEncodeOverMaxSize(0);
        testEncodeOverMaxSize(1);
        testEncodeOverMaxSize(2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeOverMaxSize_add456() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize_add456");
        testEncodeOverMaxSize(-1);
        testEncodeOverMaxSize(0);
        testEncodeOverMaxSize(0);
        testEncodeOverMaxSize(1);
        testEncodeOverMaxSize(2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeOverMaxSize_add457() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize_add457");
        testEncodeOverMaxSize(-1);
        testEncodeOverMaxSize(0);
        testEncodeOverMaxSize(1);
        testEncodeOverMaxSize(1);
        testEncodeOverMaxSize(2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeOverMaxSize_add458() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize_add458");
        testEncodeOverMaxSize(-1);
        testEncodeOverMaxSize(0);
        testEncodeOverMaxSize(1);
        testEncodeOverMaxSize(2);
        testEncodeOverMaxSize(2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeOverMaxSize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize");
        testEncodeOverMaxSize(2);
        testEncodeOverMaxSize(0);
        testEncodeOverMaxSize(1);
        testEncodeOverMaxSize(2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeOverMaxSize_literalMutation1833() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize_literalMutation1833");
        testEncodeOverMaxSize(-1);
        testEncodeOverMaxSize(-1);
        testEncodeOverMaxSize(1);
        testEncodeOverMaxSize(2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeOverMaxSize_literalMutation1834() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize_literalMutation1834");
        testEncodeOverMaxSize(-1);
        testEncodeOverMaxSize(0);
        testEncodeOverMaxSize(0);
        testEncodeOverMaxSize(2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEncodeOverMaxSize_literalMutation1835() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize_literalMutation1835");
        testEncodeOverMaxSize(-1);
        testEncodeOverMaxSize(0);
        testEncodeOverMaxSize(1);
        testEncodeOverMaxSize(3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeOverMaxSize_remove412() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize_remove412");
        testEncodeOverMaxSize(0);
        testEncodeOverMaxSize(1);
        testEncodeOverMaxSize(2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeOverMaxSize_remove413() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize_remove413");
        testEncodeOverMaxSize(0);
        testEncodeOverMaxSize(1);
        testEncodeOverMaxSize(2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeOverMaxSize_remove414() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize_remove414");
        testEncodeOverMaxSize(0);
        testEncodeOverMaxSize(1);
        testEncodeOverMaxSize(2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEncodeOverMaxSize_remove415() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize_remove415");
        testEncodeOverMaxSize(0);
        testEncodeOverMaxSize(1);
        testEncodeOverMaxSize(2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCodec112_add447() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec112_add447");
        final byte[] in = new byte[]{ 0 };
        final byte[] out = Base64.encodeBase64(in);
        Base64.encodeBase64(in, false, false, out.length);
        Base64.encodeBase64(in, false, false, out.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodec112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec112");
        final byte[] in = new byte[]{ 1 };
        final byte[] out = Base64.encodeBase64(in);
        Base64.encodeBase64(in, false, false, out.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodec112_literalMutation1770() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec112_literalMutation1770");
        final byte[] in = new byte[]{ 0 };
        final byte[] out = Base64.encodeBase64(in);
        Base64.encodeBase64(in, false, false, out.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCodec112_literalMutation1771() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec112_literalMutation1771");
        final byte[] in = new byte[]{ 0 };
        final byte[] out = Base64.encodeBase64(in);
        Base64.encodeBase64(in, false, true, out.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCodec112_remove404() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec112_remove404");
        final byte[] in = new byte[]{ 0 };
        final byte[] out = Base64.encodeBase64(in);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testEncodeOverMaxSize_add459(final int maxSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize_add459");
        try {
            Base64.encodeBase64(Base64TestData.DECODED, true, false, maxSize);
            Base64.encodeBase64(Base64TestData.DECODED, true, false, maxSize);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1783,("Expected " + (java.lang.IllegalArgumentException.class.getName())));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testEncodeOverMaxSize(final int maxSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize");
        try {
            Base64.encodeBase64(Base64TestData.DECODED, false, false, maxSize);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1783,("Expected " + (java.lang.IllegalArgumentException.class.getName())));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testEncodeOverMaxSize_literalMutation1837(final int maxSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeOverMaxSize_literalMutation1837");
        try {
            Base64.encodeBase64(Base64TestData.DECODED, true, true, maxSize);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1783,("Expected " + (java.lang.IllegalArgumentException.class.getName())));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIgnoringNonBase64InDecode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIgnoringNonBase64InDecode");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1786,new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64("VGhlIH@$#$@%F1aWN@#@#@@rIGJyb3duIGZve\n\r\t%#%#%#%CBqd##$#$W1wZWQgb3ZlciB0aGUgbGF6eSBkb2dzLg==".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsArrayByteBase64() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsArrayByteBase64");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1788,null,1787,org.apache.commons.codec.binary.Base64.isBase64(new byte[]{ java.lang.Byte.MIN_VALUE }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1790,null,1789,org.apache.commons.codec.binary.Base64.isBase64(new byte[]{ -125 }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1792,null,1791,org.apache.commons.codec.binary.Base64.isBase64(new byte[]{ -10 }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,null,1793,org.apache.commons.codec.binary.Base64.isBase64(new byte[]{ 0 }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1796,null,1795,org.apache.commons.codec.binary.Base64.isBase64(new byte[]{ 64 , java.lang.Byte.MAX_VALUE }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1798,null,1797,org.apache.commons.codec.binary.Base64.isBase64(new byte[]{ java.lang.Byte.MAX_VALUE }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1800,null,1799,org.apache.commons.codec.binary.Base64.isBase64(new byte[]{ 'A' }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,null,1801,org.apache.commons.codec.binary.Base64.isBase64(new byte[]{ 'A' , java.lang.Byte.MIN_VALUE }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1804,null,1803,org.apache.commons.codec.binary.Base64.isBase64(new byte[]{ 'A' , 'Z' , 'a' }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1806,null,1805,org.apache.commons.codec.binary.Base64.isBase64(new byte[]{ '/' , '=' , '+' }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1808,null,1807,org.apache.commons.codec.binary.Base64.isBase64(new byte[]{ '$' }));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests isUrlSafe.
     */
@Test
    public void testIsUrlSafe() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsUrlSafe");
        final Base64 base64Standard = new Base64(false);
        final Base64 base64URLSafe = new Base64(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,base64Standard,1816,base64Standard.isUrlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,base64URLSafe,1818,base64URLSafe.isUrlSafe());
        final byte[] whiteSpace = new byte[]{ ' ' , '\n' , '\r' , '\t' };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,null,1820,org.apache.commons.codec.binary.Base64.isBase64(whiteSpace));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests isUrlSafe.
     */
@Test
    public void testIsUrlSafe_literalMutation1848() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsUrlSafe_literalMutation1848");
        final Base64 base64Standard = new Base64(false);
        final Base64 base64URLSafe = new Base64(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,base64Standard,1816,base64Standard.isUrlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,base64URLSafe,1818,base64URLSafe.isUrlSafe());
        final byte[] whiteSpace = new byte[]{ ' ' , '\n' , '\r' , '\t' };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,null,1820,org.apache.commons.codec.binary.Base64.isBase64(whiteSpace));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testKnownDecodings() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testKnownDecodings");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1822,new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64("VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2dzLg==".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1823,new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64("SXQgd2FzIHRoZSBiZXN0IG9mIHRpbWVzLCBpdCB3YXMgdGhlIHdvcnN0IG9mIHRpbWVzLg==".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1824,new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64("aHR0cDovL2pha2FydGEuYXBhY2hlLm9yZy9jb21tbW9ucw==".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64("QWFCYkNjRGRFZUZmR2dIaElpSmpLa0xsTW1Obk9vUHBRcVJyU3NUdFV1VnZXd1h4WXlaeg==".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64("eyAwLCAxLCAyLCAzLCA0LCA1LCA2LCA3LCA4LCA5IH0=".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1827,new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64("eHl6enkh".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testKnownEncodings() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testKnownEncodings");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64("The quick brown fox jumped over the lazy dogs.".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1829,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked("blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64("It was the best of times, it was the worst of times.".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1831,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64("http://jakarta.apache.org/commmons".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1833,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64("{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64("xyzzy!".getBytes(org.apache.commons.codec.Charsets.UTF_8))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNonBase64Test() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonBase64Test");
        final byte[] bArray = new byte[]{ '%' };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1835,("Invalid Base64 array was incorrectly validated as " + "an array of Base64 encoded data"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1837,null,1836,org.apache.commons.codec.binary.Base64.isBase64(bArray));
        try {
            final Base64 b64 = new Base64();
            final byte[] result = b64.decode(bArray);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,("The result should be empty as the test encoded content did " + "not contain any valid base 64 characters"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1839,result.length);
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,("Exception was thrown when trying to decode " + ("invalid base64 encoded data - RFC 2045 requires that all " + ("non base64 character be discarded, an exception should not" + " have been thrown"))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectDecodeWithInvalidParameter_add461() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectDecodeWithInvalidParameter_add461");
        final Base64 b64 = new Base64();
        try {
            b64.decode(java.lang.Integer.valueOf(5));
            b64.decode(java.lang.Integer.valueOf(5));
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testObjectDecodeWithInvalidParameter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectDecodeWithInvalidParameter");
        final Base64 b64 = new Base64();
        try {
            b64.decode(java.lang.Integer.valueOf(6));
        } catch (final DecoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testObjectDecodeWithValidParameter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectDecodeWithValidParameter");
        final String original = "foo";
        final Object o = Base64.encodeBase64(original.getBytes(org.apache.commons.codec.Charsets.UTF_8));
        final Base64 b64 = new Base64();
        final Object oDecoded = b64.decode(o);
        final byte[] baDecoded = ((byte[])(oDecoded));
        final String dest = new String(baDecoded);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1841,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectEncodeWithInvalidParameter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectEncodeWithInvalidParameter");
        final Base64 b64 = new Base64();
        try {
            b64.encode("Yadayadayada");
            b64.encode("Yadayadayada");
        } catch (final EncoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testObjectEncode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectEncode");
        final Base64 b64 = new Base64();
        try {
            b64.encode("foo");
        } catch (final EncoderException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testObjectEncodeWithValidParameter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectEncodeWithValidParameter");
        final String original = "foo";
        final Object origObj = original.getBytes(org.apache.commons.codec.Charsets.UTF_8);
        final Base64 b64 = new Base64();
        final Object oEncoded = b64.encode(origObj);
        final byte[] bArray = Base64.decodeBase64(((byte[])(oEncoded)));
        final String dest = new String(bArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1843,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testPairs() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPairs");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1845,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ 0 , 0 })));
        for (int i = 129 ; i <= 127 ; i++) {
            final byte[] test = new byte[]{ ((byte)(i)) , ((byte)(i)) };
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1847,null,1846,java.util.Arrays.equals(test, org.apache.commons.codec.binary.Base64.decodeBase64(org.apache.commons.codec.binary.Base64.encodeBase64(test))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testPairs_literalMutation1859() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPairs_literalMutation1859");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1845,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ 0 , 0 })));
        for (int i = -128 ; i <= 128 ; i++) {
            final byte[] test = new byte[]{ ((byte)(i)) , ((byte)(i)) };
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1847,null,1846,java.util.Arrays.equals(test, org.apache.commons.codec.binary.Base64.decodeBase64(org.apache.commons.codec.binary.Base64.encodeBase64(test))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 2045 section 2.1 CRLF definition.
     */
@Test
    public void testRfc2045Section2Dot1CrLfDefinition() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc2045Section2Dot1CrLfDefinition");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,null,1849,java.util.Arrays.equals(new byte[]{ 13 , 10 }, org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 2045 section 6.8 chuck size definition.
     */
@Test
    public void testRfc2045Section6Dot8ChunkSizeDefinition() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc2045Section6Dot8ChunkSizeDefinition");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1851,org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 1421 section 4.3.2.4 chuck size definition.
     */
@Test
    public void testRfc1421Section6Dot8ChunkSizeDefinition() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc1421Section6Dot8ChunkSizeDefinition");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10DecodeWithCrLf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeWithCrLf");
        final String CRLF = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(Base64.CHUNK_SEPARATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1853,null,1852,org.apache.commons.codec.binary.StringUtils.newStringUsAscii(org.apache.commons.codec.binary.Base64.decodeBase64(("" + CRLF))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,null,1854,org.apache.commons.codec.binary.StringUtils.newStringUsAscii(org.apache.commons.codec.binary.Base64.decodeBase64(("Zg==" + CRLF))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,null,1856,org.apache.commons.codec.binary.StringUtils.newStringUsAscii(org.apache.commons.codec.binary.Base64.decodeBase64(("Zm8=" + CRLF))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,null,1858,org.apache.commons.codec.binary.StringUtils.newStringUsAscii(org.apache.commons.codec.binary.Base64.decodeBase64(("Zm9v" + CRLF))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,null,1860,org.apache.commons.codec.binary.StringUtils.newStringUsAscii(org.apache.commons.codec.binary.Base64.decodeBase64(("Zm9vYg==" + CRLF))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,null,1862,org.apache.commons.codec.binary.StringUtils.newStringUsAscii(org.apache.commons.codec.binary.Base64.decodeBase64(("Zm9vYmE=" + CRLF))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1865,null,1864,org.apache.commons.codec.binary.StringUtils.newStringUsAscii(org.apache.commons.codec.binary.Base64.decodeBase64(("Zm9vYmFy" + CRLF))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10DecodeEncode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode");
        testDecodeEncode("");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10DecodeEncode_add463() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_add463");
        testDecodeEncode("");
        testDecodeEncode("");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10DecodeEncode_add464() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_add464");
        testDecodeEncode("");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10DecodeEncode_add465() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_add465");
        testDecodeEncode("");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10DecodeEncode_add466() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_add466");
        testDecodeEncode("");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10DecodeEncode_add467() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_add467");
        testDecodeEncode("");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10DecodeEncode_add468() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_add468");
        testDecodeEncode("");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10DecodeEncode_add469() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_add469");
        testDecodeEncode("");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10Decode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10Decode");
        testDecodeEncode("foo");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10DecodeEncode_literalMutation1861() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_literalMutation1861");
        testDecodeEncode("");
        testDecodeEncode("foo");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10DecodeEncode_literalMutation1862() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_literalMutation1862");
        testDecodeEncode("");
        testDecodeEncode("Zg==");
        testDecodeEncode("foo");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10DecodeEncode_literalMutation1863() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_literalMutation1863");
        testDecodeEncode("");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("foo");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10DecodeEncode_literalMutation1864() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_literalMutation1864");
        testDecodeEncode("");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("foo");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10DecodeEncode_literalMutation1865() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_literalMutation1865");
        testDecodeEncode("");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("foo");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10DecodeEncode_literalMutation1866() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_literalMutation1866");
        testDecodeEncode("");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10DecodeEncode_remove416() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_remove416");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10DecodeEncode_remove417() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_remove417");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10DecodeEncode_remove418() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_remove418");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10DecodeEncode_remove419() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_remove419");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10DecodeEncode_remove420() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_remove420");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10DecodeEncode_remove421() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_remove421");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10DecodeEncode_remove422() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10DecodeEncode_remove422");
        testDecodeEncode("Zg==");
        testDecodeEncode("Zm8=");
        testDecodeEncode("Zm9v");
        testDecodeEncode("Zm9vYg==");
        testDecodeEncode("Zm9vYmE=");
        testDecodeEncode("Zm9vYmFy");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testDecodeEncode(final String encodedText) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecodeEncode");
        final String decodedText = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(Base64.decodeBase64(encodedText));
        final String encodedText2 = Base64.encodeBase64String(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(decodedText));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1744,encodedText);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1745,encodedText2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10EncodeDecode_add470() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_add470");
        testEncodeDecode("");
        testEncodeDecode("");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10EncodeDecode_add471() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_add471");
        testEncodeDecode("");
        testEncodeDecode("f");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10EncodeDecode_add472() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_add472");
        testEncodeDecode("");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10EncodeDecode_add473() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_add473");
        testEncodeDecode("");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10EncodeDecode_add474() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_add474");
        testEncodeDecode("");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10EncodeDecode_add475() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_add475");
        testEncodeDecode("");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10EncodeDecode_add476() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_add476");
        testEncodeDecode("");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10Encode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10Encode");
        testEncodeDecode("foo");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10EncodeDecode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode");
        testEncodeDecode("");
        testEncodeDecode("foo");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10EncodeDecode_literalMutation1869() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_literalMutation1869");
        testEncodeDecode("");
        testEncodeDecode("f");
        testEncodeDecode("foo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10EncodeDecode_literalMutation1870() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_literalMutation1870");
        testEncodeDecode("");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10EncodeDecode_literalMutation1871() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_literalMutation1871");
        testEncodeDecode("");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foo");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10EncodeDecode_literalMutation1872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_literalMutation1872");
        testEncodeDecode("");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("foo");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test
    public void testRfc4648Section10EncodeDecode_literalMutation1873() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_literalMutation1873");
        testEncodeDecode("");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10EncodeDecode_remove423() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_remove423");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10EncodeDecode_remove424() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_remove424");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10EncodeDecode_remove425() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_remove425");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10EncodeDecode_remove426() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_remove426");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10EncodeDecode_remove427() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_remove427");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10EncodeDecode_remove428() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_remove428");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests RFC 4648 section 10 test vectors.
     * <ul>
     * <li>BASE64("") = ""</li>
     * <li>BASE64("f") = "Zg=="</li>
     * <li>BASE64("fo") = "Zm8="</li>
     * <li>BASE64("foo") = "Zm9v"</li>
     * <li>BASE64("foob") = "Zm9vYg=="</li>
     * <li>BASE64("fooba") = "Zm9vYmE="</li>
     * <li>BASE64("foobar") = "Zm9vYmFy"</li>
     * </ul>
     * 
     * @see <a href="http://tools.ietf.org/html/rfc4648">http://tools.ietf.org/html/rfc4648</a>
     */
@Test(timeout = 1000)
    public void testRfc4648Section10EncodeDecode_remove429() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRfc4648Section10EncodeDecode_remove429");
        testEncodeDecode("f");
        testEncodeDecode("fo");
        testEncodeDecode("foo");
        testEncodeDecode("foob");
        testEncodeDecode("fooba");
        testEncodeDecode("foobar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testEncodeDecode(final String plainText) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEncodeDecode");
        final String encodedText = Base64.encodeBase64String(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(plainText));
        final String decodedText = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(Base64.decodeBase64(encodedText));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,plainText);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,decodedText);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingletons() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletons");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1971,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(1)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1973,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(2)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(3)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1975,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(4)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(5)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1977,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(6)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(7)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(8)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(9)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1981,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(10)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(11)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(12)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1984,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(13)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1985,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(14)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1986,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(15)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1987,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(16)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1988,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(17)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1989,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(18)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1990,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(19)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1991,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(20)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1992,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(21)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1993,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(22)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(23)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(24)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1996,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(25)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(26)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(27)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1999,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(28)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(29)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(30)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(31)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(32)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(33)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2005,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(34)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(35)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(36)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(37)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(38)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(39)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(40)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(41)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2013,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(42)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(43)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(44)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(45)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2017,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(46)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(47)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2019,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(48)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(49)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2021,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(50)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(51)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(52)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(53)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2025,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(54)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(55)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2027,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(56)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(57)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2029,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(58)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(59)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2031,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(60)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(61)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2033,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(62)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(63)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2035,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(64)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(65)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2037,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(66)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(67)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2039,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(68)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(69)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2041,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(70)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(71)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2043,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(72)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(73)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2045,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(74)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(75)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2047,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(76)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(77)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2049,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(78)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(79)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2051,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(80)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(81)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2053,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(82)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2054,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(83)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2055,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(84)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2056,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(85)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2057,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(86)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2058,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(87)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2059,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(88)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2060,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(89)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2061,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(90)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2062,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(91)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2063,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(92)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2064,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(93)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2065,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(94)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2066,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(95)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2067,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(96)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2068,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(97)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2069,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(98)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2070,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(99)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2071,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(100)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2072,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(101)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2073,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(102)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2074,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(103)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2075,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(104)) })));
        for (int i = 127 ; i <= 127 ; i++) {
            final byte[] test = new byte[]{ ((byte)(i)) };
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2077,null,2076,java.util.Arrays.equals(test, org.apache.commons.codec.binary.Base64.decodeBase64(org.apache.commons.codec.binary.Base64.encodeBase64(test))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingletons_literalMutation1875() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletons_literalMutation1875");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1971,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(1)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1973,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(2)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(3)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1975,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(4)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(5)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1977,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(6)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(7)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(8)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(9)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1981,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(10)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(11)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(12)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1984,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(13)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1985,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(14)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1986,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(15)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1987,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(16)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1988,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(17)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1989,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(18)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1990,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(19)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1991,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(20)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1992,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(21)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1993,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(22)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(23)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(24)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1996,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(25)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(26)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(27)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1999,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(28)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(29)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2001,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(30)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(31)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(32)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(33)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2005,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(34)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(35)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(36)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(37)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(38)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(39)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2011,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(40)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(41)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2013,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(42)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(43)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2015,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(44)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(45)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2017,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(46)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(47)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2019,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(48)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(49)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2021,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(50)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(51)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(52)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(53)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2025,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(54)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(55)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2027,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(56)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(57)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2029,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(58)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(59)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2031,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(60)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(61)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2033,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(62)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(63)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2035,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(64)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(65)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2037,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(66)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(67)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2039,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(68)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(69)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2041,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(70)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(71)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2043,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(72)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(73)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2045,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(74)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(75)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2047,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(76)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(77)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2049,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(78)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(79)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2051,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(80)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(81)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2053,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(82)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2054,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(83)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2055,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(84)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2056,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(85)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2057,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(86)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2058,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(87)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2059,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(88)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2060,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(89)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2061,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(90)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2062,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(91)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2063,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(92)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2064,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(93)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2065,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(94)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2066,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(95)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2067,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(96)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2068,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(97)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2069,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(98)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2070,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(99)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2071,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(100)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2072,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(101)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2073,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(102)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2074,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(103)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2075,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(104)) })));
        for (int i = -128 ; i <= 126 ; i++) {
            final byte[] test = new byte[]{ ((byte)(i)) };
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2077,null,2076,java.util.Arrays.equals(test, org.apache.commons.codec.binary.Base64.decodeBase64(org.apache.commons.codec.binary.Base64.encodeBase64(test))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSingletonsChunked() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonsChunked");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(1)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(2)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(3)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1870,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(4)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(5)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(6)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(7)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(8)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1875,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(9)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(10)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1877,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(11)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(12)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1879,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(13)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(14)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1881,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(15)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(16)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(17)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(18)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(19)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(20)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1887,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(21)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(22)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(23)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(24)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1891,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(25)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(26)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1893,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(27)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(28)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(29)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(30)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(31)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(32)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1899,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(33)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(34)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1901,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(35)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(36)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1903,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(37)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(38)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1905,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(39)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(40)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1907,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(41)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(42)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1909,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(43)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(44)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1911,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(45)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(46)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1913,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(47)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(48)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1915,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(49)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(50)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1917,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(51)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(52)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1919,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(53)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(54)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1921,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(55)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(56)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1923,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(57)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(58)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1925,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(59)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(60)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1927,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(61)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(62)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1929,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(63)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(64)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1931,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(65)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(66)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1933,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(67)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(68)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1935,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(69)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(70)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(71)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1938,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(72)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(73)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1940,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(74)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(75)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1942,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(76)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(77)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(78)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1945,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(79)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(80)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(81)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1948,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(82)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(83)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(84)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1951,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(85)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(86)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1953,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(87)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(88)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1955,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(89)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(90)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1957,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(91)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(92)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1959,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(93)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(94)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1961,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(95)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(96)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1963,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(97)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(98)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1965,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(99)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(100)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1967,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(101)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(102)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1969,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(103)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(104)) })));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTriplets() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTriplets");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2098,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(0)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2099,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(1)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(2)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2101,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(3)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2102,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(4)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2103,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(5)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2104,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(6)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2105,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(7)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2106,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(8)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2107,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(9)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2108,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(10)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(11)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(12)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2111,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(13)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(14)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(15)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2114,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(16)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2115,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(17)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(18)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(19)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(20)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2119,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(21)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2120,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(22)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(23)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(24)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(25)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(26)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2125,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(27)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(28)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(29)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(30)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(31)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2130,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(32)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(33)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2132,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(34)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(35)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2134,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(36)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(37)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2136,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(38)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(39)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2138,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(40)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(41)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2140,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(42)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2141,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(43)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2142,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(44)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(45)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2144,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(46)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(47)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(48)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(49)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2148,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(50)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2149,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(51)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2150,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(52)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(53)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2152,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(54)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(55)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2154,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(56)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2155,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(57)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2156,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(58)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2157,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(59)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2158,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(60)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2159,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(61)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2160,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(62)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2161,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(63)) })));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTripletsChunked() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTripletsChunked");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2162,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(0)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2163,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(1)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2164,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(2)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2165,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(3)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2166,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(4)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2167,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(5)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2168,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(6)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2169,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(7)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2170,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(8)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2171,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(9)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2172,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(10)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2173,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(11)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2174,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(12)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2175,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(13)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2176,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(14)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2177,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(15)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2178,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(16)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2179,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(17)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2180,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(18)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2181,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(19)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2182,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(20)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2183,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(21)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2184,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(22)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2185,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(23)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2186,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(24)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2187,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(25)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2188,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(26)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2189,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(27)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2190,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(28)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2191,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(29)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(30)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(31)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(32)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(33)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2196,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(34)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2197,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(35)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2198,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(36)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2199,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(37)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2200,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(38)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2201,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(39)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2202,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(40)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2203,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(41)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2204,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(42)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2205,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(43)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2206,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(44)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2207,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(45)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2208,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(46)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2209,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(47)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2210,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(48)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2211,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(49)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2212,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(50)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2213,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(51)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2214,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(52)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2215,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(53)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2216,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(54)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2217,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(55)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2218,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(56)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2219,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(57)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2220,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(58)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2221,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(59)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2222,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(60)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2223,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(61)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2224,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(62)) })));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2225,new java.lang.String(org.apache.commons.codec.binary.Base64.encodeBase64Chunked(new byte[]{ ((byte)(0)) , ((byte)(0)) , ((byte)(63)) })));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests url-safe Base64 against random data, sizes 0 to 150.
     */
@Test
    public void testUrlSafe() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUrlSafe");
        for (int i = -1 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, true);
            final byte[] encoded = randomData[1];
            final byte[] decoded = randomData[0];
            final byte[] result = Base64.decodeBase64(encoded);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,("url-safe i=" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,null,2239,java.util.Arrays.equals(decoded, result));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,(("url-safe i=" + i) + " no \'=\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,null,2242,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('='))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,(("url-safe i=" + i) + " no \'\\\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,null,2245,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('\\'))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,(("url-safe i=" + i) + " no \'+\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,null,2248,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('+'))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests url-safe Base64 against random data, sizes 0 to 150.
     */
@Test
    public void testUrlSafe_literalMutation1945() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUrlSafe_literalMutation1945");
        for (int i = 0 ; i <= 151 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, true);
            final byte[] encoded = randomData[1];
            final byte[] decoded = randomData[0];
            final byte[] result = Base64.decodeBase64(encoded);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,("url-safe i=" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,null,2239,java.util.Arrays.equals(decoded, result));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,(("url-safe i=" + i) + " no \'=\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,null,2242,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('='))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,(("url-safe i=" + i) + " no \'\\\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,null,2245,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('\\'))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,(("url-safe i=" + i) + " no \'+\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,null,2248,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('+'))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests url-safe Base64 against random data, sizes 0 to 150.
     */
@Test
    public void testUrlSafe_literalMutation1946() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUrlSafe_literalMutation1946");
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            final byte[] encoded = randomData[1];
            final byte[] decoded = randomData[0];
            final byte[] result = Base64.decodeBase64(encoded);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,("url-safe i=" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,null,2239,java.util.Arrays.equals(decoded, result));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,(("url-safe i=" + i) + " no \'=\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,null,2242,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('='))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,(("url-safe i=" + i) + " no \'\\\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,null,2245,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('\\'))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,(("url-safe i=" + i) + " no \'+\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,null,2248,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('+'))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests url-safe Base64 against random data, sizes 0 to 150.
     */
@Test
    public void testUrlSafe_literalMutation1947() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUrlSafe_literalMutation1947");
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, true);
            final byte[] encoded = randomData[0];
            final byte[] decoded = randomData[0];
            final byte[] result = Base64.decodeBase64(encoded);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,("url-safe i=" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,null,2239,java.util.Arrays.equals(decoded, result));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,(("url-safe i=" + i) + " no \'=\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,null,2242,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('='))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,(("url-safe i=" + i) + " no \'\\\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,null,2245,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('\\'))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,(("url-safe i=" + i) + " no \'+\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,null,2248,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('+'))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests url-safe Base64 against random data, sizes 0 to 150.
     */
@Test
    public void testUrlSafe_literalMutation1948() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUrlSafe_literalMutation1948");
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, true);
            final byte[] encoded = randomData[1];
            final byte[] decoded = randomData[-1];
            final byte[] result = Base64.decodeBase64(encoded);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,("url-safe i=" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,null,2239,java.util.Arrays.equals(decoded, result));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,(("url-safe i=" + i) + " no \'=\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,null,2242,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('='))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,(("url-safe i=" + i) + " no \'\\\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,null,2245,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('\\'))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,(("url-safe i=" + i) + " no \'+\'"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,null,2248,org.apache.commons.codec.binary.Base64TestData.bytesContain(encoded, ((byte)('+'))));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test(timeout = 1000)
    public void testUUID_add477() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_add477");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test(timeout = 1000)
    public void testUUID_add478() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_add478");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test(timeout = 1000)
    public void testUUID_add479() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_add479");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test(timeout = 1000)
    public void testUUID_add480() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_add480");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test(timeout = 1000)
    public void testUUID_add481() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_add481");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID");
        final byte[][] ids = new byte[3][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1883() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1883");
        final byte[][] ids = new byte[4][];
        ids[-1] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1884() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1884");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("foo".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1885() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1885");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1886() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1886");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("foo".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1887() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1887");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1888() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1888");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("foo".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1889() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1889");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[4] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1890() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1890");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("foo".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1891() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1891");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[5][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1892() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1892");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1893() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1893");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1894() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1894");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1895() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1895");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1896() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1896");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1897() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1897");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1898() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1898");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[4] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1899() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1899");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1900() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1900");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[3][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1901() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1901");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[-1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1902() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1902");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1903() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1903");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1904() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1904");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1905() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1905");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1906() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1906");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1907() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1907");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[4] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1908() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1908");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1909() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1909");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[5][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1910() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1910");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[-1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1911() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1911");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1912() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1912");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1913() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1913");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1914() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1914");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1915() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1915");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1916() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1916");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1917() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1917");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1918() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1918");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[3][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1919() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1919");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[-1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1920() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1920");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1921() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1921");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1922() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1922");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1923() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1923");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1924() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1924");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1925() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1925");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1926() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1926");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1927() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1927");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 1 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1928() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1928");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 3 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1929() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1929");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (true) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1930() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1930");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("foo" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1931() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1931");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "foo"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1932() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1932");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("foo" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1933() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1933");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "foo") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1934() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1934");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "foo"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1935() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1935");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("foo" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1936() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1936");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "foo") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1937() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1937");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "foo"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1938() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1938");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("foo" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1939() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1939");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "foo") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1940() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1940");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "foo"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1941() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1941");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("foo" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1942() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1942");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "foo") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test
    public void testUUID_literalMutation1943() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_literalMutation1943");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((("reference: [" + (org.apache.commons.codec.binary.Hex.encodeHexString(ids[i]))) + "]"));
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "foo"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test(timeout = 1000)
    public void testUUID_remove430() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_remove430");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test(timeout = 1000)
    public void testUUID_remove431() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_remove431");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test(timeout = 1000)
    public void testUUID_remove432() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_remove432");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test(timeout = 1000)
    public void testUUID_remove433() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_remove433");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Base64 encoding of UUID's is a common use-case, especially in URL-SAFE mode. This test case ends up being the
     * "URL-SAFE" JUnit's.
     * 
     * @throws DecoderException
     * if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!
     */
@Test(timeout = 1000)
    public void testUUID_remove434() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUUID_remove434");
        final byte[][] ids = new byte[4][];
        ids[0] = org.apache.commons.codec.binary.Hex.decodeHex("94ed8d0319e4493399560fb67404d370".toCharArray());
        ids[1] = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        ids[2] = org.apache.commons.codec.binary.Hex.decodeHex("64be154b6ffa40258d1a01288e7c31ca".toCharArray());
        ids[3] = org.apache.commons.codec.binary.Hex.decodeHex("ff7f8fc01cdb471a8c8b5a9306183fe8".toCharArray());
        final byte[][] standard = new byte[4][];
        standard[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg+2dATTcA==");
        standard[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K/fMJwH+Q5e0nr7tWsxwkA==");
        standard[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2/6QCWNGgEojnwxyg==");
        standard[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("/3+PwBzbRxqMi1qTBhg/6A==");
        final byte[][] urlSafe1 = new byte[4][];
        urlSafe1[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA==");
        urlSafe1[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA==");
        urlSafe1[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg==");
        urlSafe1[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A==");
        final byte[][] urlSafe2 = new byte[4][];
        urlSafe2[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA=");
        urlSafe2[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA=");
        urlSafe2[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg=");
        urlSafe2[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A=");
        final byte[][] urlSafe3 = new byte[4][];
        urlSafe3[0] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("lO2NAxnkSTOZVg-2dATTcA");
        urlSafe3[1] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("K_fMJwH-Q5e0nr7tWsxwkA");
        urlSafe3[2] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("ZL4VS2_6QCWNGgEojnwxyg");
        urlSafe3[3] = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("_3-PwBzbRxqMi1qTBhg_6A");
        for (int i = 0 ; i < 4 ; i++) {
            final byte[] encodedStandard = Base64.encodeBase64(ids[i]);
            final byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(ids[i]);
            final byte[] decodedStandard = Base64.decodeBase64(standard[i]);
            final byte[] decodedUrlSafe1 = Base64.decodeBase64(urlSafe1[i]);
            final byte[] decodedUrlSafe2 = Base64.decodeBase64(urlSafe2[i]);
            final byte[] decodedUrlSafe3 = Base64.decodeBase64(urlSafe3[i]);
            if (false) {
                System.out.println((((("standard:  [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedStandard))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(standard[i]))) + "]"));
                System.out.println((((("safe1:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe1))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe1[i]))) + "]"));
                System.out.println((((("safe2:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe2))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe2[i]))) + "]"));
                System.out.println((((("safe3:     [" + (org.apache.commons.codec.binary.Hex.encodeHexString(decodedUrlSafe3))) + "] From: [") + (org.apache.commons.codec.binary.StringUtils.newStringUtf8(urlSafe3[i]))) + "]"));
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,null,2226,java.util.Arrays.equals(encodedStandard, standard[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.util.Arrays.equals(encodedUrlSafe, urlSafe3[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.util.Arrays.equals(decodedStandard, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.util.Arrays.equals(decodedUrlSafe1, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.util.Arrays.equals(decodedUrlSafe2, ids[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,null,2236,java.util.Arrays.equals(decodedUrlSafe3, ids[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testByteToStringVariations() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteToStringVariations");
        final Base64 base64 = new Base64(1);
        final byte[] b1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Hello World");
        final byte[] b2 = new byte[0];
        final byte[] b3 = null;
        final byte[] b4 = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1700,base64,1699,base64.encodeToString(b1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1702,null,1701,org.apache.commons.codec.binary.Base64.encodeBase64String(b1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1704,base64,1703,base64.encodeToString(b2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1706,null,1705,org.apache.commons.codec.binary.Base64.encodeBase64String(b2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1708,base64,1707,base64.encodeToString(b3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1710,null,1709,org.apache.commons.codec.binary.Base64.encodeBase64String(b3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,base64,1711,base64.encodeToString(b4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,null,1713,org.apache.commons.codec.binary.Base64.encodeBase64String(b4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,null,1715,org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(b4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testByteToStringVariations_literalMutation1740() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteToStringVariations_literalMutation1740");
        final Base64 base64 = new Base64(0);
        final byte[] b1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        final byte[] b2 = new byte[0];
        final byte[] b3 = null;
        final byte[] b4 = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1700,base64,1699,base64.encodeToString(b1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1702,null,1701,org.apache.commons.codec.binary.Base64.encodeBase64String(b1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1704,base64,1703,base64.encodeToString(b2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1706,null,1705,org.apache.commons.codec.binary.Base64.encodeBase64String(b2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1708,base64,1707,base64.encodeToString(b3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1710,null,1709,org.apache.commons.codec.binary.Base64.encodeBase64String(b3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,base64,1711,base64.encodeToString(b4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,null,1713,org.apache.commons.codec.binary.Base64.encodeBase64String(b4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,null,1715,org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(b4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testByteToStringVariations_literalMutation1741() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteToStringVariations_literalMutation1741");
        final Base64 base64 = new Base64(0);
        final byte[] b1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Hello World");
        final byte[] b2 = new byte[1];
        final byte[] b3 = null;
        final byte[] b4 = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1700,base64,1699,base64.encodeToString(b1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1702,null,1701,org.apache.commons.codec.binary.Base64.encodeBase64String(b1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1704,base64,1703,base64.encodeToString(b2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1706,null,1705,org.apache.commons.codec.binary.Base64.encodeBase64String(b2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1708,base64,1707,base64.encodeToString(b3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1710,null,1709,org.apache.commons.codec.binary.Base64.encodeBase64String(b3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,base64,1711,base64.encodeToString(b4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,null,1713,org.apache.commons.codec.binary.Base64.encodeBase64String(b4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,null,1715,org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(b4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testByteToStringVariations_literalMutation1743() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteToStringVariations_literalMutation1743");
        final Base64 base64 = new Base64(0);
        final byte[] b1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Hello World");
        final byte[] b2 = new byte[0];
        final byte[] b3 = null;
        final byte[] b4 = org.apache.commons.codec.binary.Hex.decodeHex("foo".toCharArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1700,base64,1699,base64.encodeToString(b1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1702,null,1701,org.apache.commons.codec.binary.Base64.encodeBase64String(b1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1704,base64,1703,base64.encodeToString(b2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1706,null,1705,org.apache.commons.codec.binary.Base64.encodeBase64String(b2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1708,base64,1707,base64.encodeToString(b3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1710,null,1709,org.apache.commons.codec.binary.Base64.encodeBase64String(b3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,base64,1711,base64.encodeToString(b4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,null,1713,org.apache.commons.codec.binary.Base64.encodeBase64String(b4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,null,1715,org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(b4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testStringToByteVariations() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringToByteVariations");
        final Base64 base64 = new Base64();
        final String s1 = "foo";
        final String s2 = "";
        final String s3 = null;
        final String s4a = "K/fMJwH+Q5e0nr7tWsxwkA==\r\n";
        final String s4b = "K_fMJwH-Q5e0nr7tWsxwkA";
        final byte[] b4 = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2079,null,2078,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2081,null,2080,org.apache.commons.codec.binary.StringUtils.newStringUtf8(((byte[])(base64.decode(((java.lang.Object)(s1)))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2083,null,2082,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2085,null,2084,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2087,null,2086,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2089,null,2088,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2091,null,2090,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2093,null,2092,java.util.Arrays.equals(b4, base64.decode(s4b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2095,null,2094,java.util.Arrays.equals(b4, org.apache.commons.codec.binary.Base64.decodeBase64(s4a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2097,null,2096,java.util.Arrays.equals(b4, org.apache.commons.codec.binary.Base64.decodeBase64(s4b)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testStringToByteVariations_literalMutation1877() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringToByteVariations_literalMutation1877");
        final Base64 base64 = new Base64();
        final String s1 = "SGVsbG8gV29ybGQ=\r\n";
        final String s2 = "foo";
        final String s3 = null;
        final String s4a = "K/fMJwH+Q5e0nr7tWsxwkA==\r\n";
        final String s4b = "K_fMJwH-Q5e0nr7tWsxwkA";
        final byte[] b4 = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2079,null,2078,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2081,null,2080,org.apache.commons.codec.binary.StringUtils.newStringUtf8(((byte[])(base64.decode(((java.lang.Object)(s1)))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2083,null,2082,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2085,null,2084,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2087,null,2086,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2089,null,2088,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2091,null,2090,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2093,null,2092,java.util.Arrays.equals(b4, base64.decode(s4b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2095,null,2094,java.util.Arrays.equals(b4, org.apache.commons.codec.binary.Base64.decodeBase64(s4a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2097,null,2096,java.util.Arrays.equals(b4, org.apache.commons.codec.binary.Base64.decodeBase64(s4b)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testStringToByteVariations_literalMutation1879() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringToByteVariations_literalMutation1879");
        final Base64 base64 = new Base64();
        final String s1 = "SGVsbG8gV29ybGQ=\r\n";
        final String s2 = "";
        final String s3 = null;
        final String s4a = "foo";
        final String s4b = "K_fMJwH-Q5e0nr7tWsxwkA";
        final byte[] b4 = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2079,null,2078,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2081,null,2080,org.apache.commons.codec.binary.StringUtils.newStringUtf8(((byte[])(base64.decode(((java.lang.Object)(s1)))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2083,null,2082,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2085,null,2084,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2087,null,2086,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2089,null,2088,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2091,null,2090,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2093,null,2092,java.util.Arrays.equals(b4, base64.decode(s4b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2095,null,2094,java.util.Arrays.equals(b4, org.apache.commons.codec.binary.Base64.decodeBase64(s4a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2097,null,2096,java.util.Arrays.equals(b4, org.apache.commons.codec.binary.Base64.decodeBase64(s4b)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testStringToByteVariations_literalMutation1880() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringToByteVariations_literalMutation1880");
        final Base64 base64 = new Base64();
        final String s1 = "SGVsbG8gV29ybGQ=\r\n";
        final String s2 = "";
        final String s3 = null;
        final String s4a = "K/fMJwH+Q5e0nr7tWsxwkA==\r\n";
        final String s4b = "foo";
        final byte[] b4 = org.apache.commons.codec.binary.Hex.decodeHex("2bf7cc2701fe4397b49ebeed5acc7090".toCharArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2079,null,2078,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2081,null,2080,org.apache.commons.codec.binary.StringUtils.newStringUtf8(((byte[])(base64.decode(((java.lang.Object)(s1)))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2083,null,2082,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2085,null,2084,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2087,null,2086,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2089,null,2088,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2091,null,2090,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2093,null,2092,java.util.Arrays.equals(b4, base64.decode(s4b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2095,null,2094,java.util.Arrays.equals(b4, org.apache.commons.codec.binary.Base64.decodeBase64(s4a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2097,null,2096,java.util.Arrays.equals(b4, org.apache.commons.codec.binary.Base64.decodeBase64(s4b)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testStringToByteVariations_literalMutation1881() throws DecoderException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringToByteVariations_literalMutation1881");
        final Base64 base64 = new Base64();
        final String s1 = "SGVsbG8gV29ybGQ=\r\n";
        final String s2 = "";
        final String s3 = null;
        final String s4a = "K/fMJwH+Q5e0nr7tWsxwkA==\r\n";
        final String s4b = "K_fMJwH-Q5e0nr7tWsxwkA";
        final byte[] b4 = org.apache.commons.codec.binary.Hex.decodeHex("foo".toCharArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2079,null,2078,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2081,null,2080,org.apache.commons.codec.binary.StringUtils.newStringUtf8(((byte[])(base64.decode(((java.lang.Object)(s1)))))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2083,null,2082,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2085,null,2084,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2087,null,2086,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2089,null,2088,org.apache.commons.codec.binary.StringUtils.newStringUtf8(base64.decode(s3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2091,null,2090,org.apache.commons.codec.binary.StringUtils.newStringUtf8(org.apache.commons.codec.binary.Base64.decodeBase64(s3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2093,null,2092,java.util.Arrays.equals(b4, base64.decode(s4b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2095,null,2094,java.util.Arrays.equals(b4, org.apache.commons.codec.binary.Base64.decodeBase64(s4a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2097,null,2096,java.util.Arrays.equals(b4, org.apache.commons.codec.binary.Base64.decodeBase64(s4b)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private String toString(final byte[] data) {
        final StringBuilder buf = new StringBuilder();
        for (int i = 0 ; i < (data.length) ; i++) {
            buf.append(data[i]);
            if (i != ((data.length) - 1)) {
                buf.append(",");
            } 
        }
        return buf.toString();
    }

    /** 
     * Tests a lineSeparator much bigger than DEFAULT_BUFFER_SIZE.
     * 
     * @see "<a href='http://mail-archives.apache.org/mod_mbox/commons-dev/201202.mbox/%3C4F3C85D7.5060706@snafu.de%3E'>dev@commons.apache.org</a>"
     */
@Test
    @Ignore
    public void testHugeLineSeparator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHugeLineSeparator");
        final int BaseNCodec_DEFAULT_BUFFER_SIZE = 8193;
        final int Base64_BYTES_PER_ENCODED_BLOCK = 4;
        final byte[] baLineSeparator = new byte[(BaseNCodec_DEFAULT_BUFFER_SIZE * 4) - 3];
        final Base64 b64 = new Base64(Base64_BYTES_PER_ENCODED_BLOCK , baLineSeparator);
        final String strOriginal = "Hello World";
        final String strDecoded = new String(b64.decode(b64.encode(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(strOriginal))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,strOriginal);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,strDecoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests a lineSeparator much bigger than DEFAULT_BUFFER_SIZE.
     * 
     * @see "<a href='http://mail-archives.apache.org/mod_mbox/commons-dev/201202.mbox/%3C4F3C85D7.5060706@snafu.de%3E'>dev@commons.apache.org</a>"
     */
@Test
    @Ignore
    public void testHugeLineSeparator_literalMutation1839() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHugeLineSeparator_literalMutation1839");
        final int BaseNCodec_DEFAULT_BUFFER_SIZE = 8192;
        final int Base64_BYTES_PER_ENCODED_BLOCK = 3;
        final byte[] baLineSeparator = new byte[(BaseNCodec_DEFAULT_BUFFER_SIZE * 4) - 3];
        final Base64 b64 = new Base64(Base64_BYTES_PER_ENCODED_BLOCK , baLineSeparator);
        final String strOriginal = "Hello World";
        final String strDecoded = new String(b64.decode(b64.encode(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(strOriginal))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,strOriginal);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,strDecoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests a lineSeparator much bigger than DEFAULT_BUFFER_SIZE.
     * 
     * @see "<a href='http://mail-archives.apache.org/mod_mbox/commons-dev/201202.mbox/%3C4F3C85D7.5060706@snafu.de%3E'>dev@commons.apache.org</a>"
     */
@Test
    @Ignore
    public void testHugeLineSeparator_literalMutation1840() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHugeLineSeparator_literalMutation1840");
        final int BaseNCodec_DEFAULT_BUFFER_SIZE = 8192;
        final int Base64_BYTES_PER_ENCODED_BLOCK = 4;
        final byte[] baLineSeparator = new byte[(BaseNCodec_DEFAULT_BUFFER_SIZE * 3) - 3];
        final Base64 b64 = new Base64(Base64_BYTES_PER_ENCODED_BLOCK , baLineSeparator);
        final String strOriginal = "Hello World";
        final String strDecoded = new String(b64.decode(b64.encode(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(strOriginal))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,strOriginal);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,strDecoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests a lineSeparator much bigger than DEFAULT_BUFFER_SIZE.
     * 
     * @see "<a href='http://mail-archives.apache.org/mod_mbox/commons-dev/201202.mbox/%3C4F3C85D7.5060706@snafu.de%3E'>dev@commons.apache.org</a>"
     */
@Test
    @Ignore
    public void testHugeLineSeparator_literalMutation1841() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHugeLineSeparator_literalMutation1841");
        final int BaseNCodec_DEFAULT_BUFFER_SIZE = 8192;
        final int Base64_BYTES_PER_ENCODED_BLOCK = 4;
        final byte[] baLineSeparator = new byte[(BaseNCodec_DEFAULT_BUFFER_SIZE * 4) - 4];
        final Base64 b64 = new Base64(Base64_BYTES_PER_ENCODED_BLOCK , baLineSeparator);
        final String strOriginal = "Hello World";
        final String strDecoded = new String(b64.decode(b64.encode(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(strOriginal))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,strOriginal);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,strDecoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests a lineSeparator much bigger than DEFAULT_BUFFER_SIZE.
     * 
     * @see "<a href='http://mail-archives.apache.org/mod_mbox/commons-dev/201202.mbox/%3C4F3C85D7.5060706@snafu.de%3E'>dev@commons.apache.org</a>"
     */
@Test
    @Ignore
    public void testHugeLineSeparator_literalMutation1842() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHugeLineSeparator_literalMutation1842");
        final int BaseNCodec_DEFAULT_BUFFER_SIZE = 8192;
        final int Base64_BYTES_PER_ENCODED_BLOCK = 4;
        final byte[] baLineSeparator = new byte[(BaseNCodec_DEFAULT_BUFFER_SIZE * 4) - 3];
        final Base64 b64 = new Base64(Base64_BYTES_PER_ENCODED_BLOCK , baLineSeparator);
        final String strOriginal = "foo";
        final String strDecoded = new String(b64.decode(b64.encode(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(strOriginal))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,strOriginal);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,strDecoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

