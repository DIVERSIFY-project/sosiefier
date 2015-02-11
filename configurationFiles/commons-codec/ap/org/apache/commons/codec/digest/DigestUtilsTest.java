package org.apache.commons.codec.digest;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.Random;
import org.junit.Test;

/** 
 * Tests DigestUtils methods.
 * 
 * @version $Id$
 */
public class DigestUtilsTest {
    private final byte[] testData = new byte[1024 * 1024];

    protected void setUp() throws Exception {
        new Random().nextBytes(testData);
    }

    @Test
    public void testConstructable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructable");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1188,new org.apache.commons.codec.digest.DigestUtils());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testInternalNoSuchAlgorithmException_add250() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInternalNoSuchAlgorithmException_add250");
        org.apache.commons.codec.digest.DigestUtils.getDigest("Bogus Bogus");
        org.apache.commons.codec.digest.DigestUtils.getDigest("Bogus Bogus");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInternalNoSuchAlgorithmException() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInternalNoSuchAlgorithmException");
        org.apache.commons.codec.digest.DigestUtils.getDigest("foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testInternalNoSuchAlgorithmException_remove233() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInternalNoSuchAlgorithmException_remove233");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * An MD2 hash converted to hex should always be 32 characters.
     */
@Test
    public void testMd2Hex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd2Hex");
        String hashMe = "foo";
        String hash = org.apache.commons.codec.digest.DigestUtils.md2Hex(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1190,hash,1189,hash.length());
        hashMe = "length < 32";
        hash = org.apache.commons.codec.digest.DigestUtils.md2Hex(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1192,hash,1191,hash.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * An MD2 hash converted to hex should always be 32 characters.
     */
@Test
    public void testMd2HexLength() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd2HexLength");
        String hashMe = "this is some string that is longer than 32 characters";
        String hash = org.apache.commons.codec.digest.DigestUtils.md2Hex(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1190,hash,1189,hash.length());
        hashMe = "foo";
        hash = org.apache.commons.codec.digest.DigestUtils.md2Hex(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1192,hash,1191,hash.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * An MD2 hash should always be a 16 element byte[].
     */
@Test
    public void testMd2Length() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd2Length");
        String hashMe = "foo";
        byte[] hash = org.apache.commons.codec.digest.DigestUtils.md2(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1193,hash.length);
        hashMe = "length < 16";
        hash = org.apache.commons.codec.digest.DigestUtils.md2(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1194,hash.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * An MD2 hash should always be a 16 element byte[].
     */
@Test
    public void testMd2Length_literalMutation1379() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd2Length_literalMutation1379");
        String hashMe = "this is some string that is longer than 16 characters";
        byte[] hash = org.apache.commons.codec.digest.DigestUtils.md2(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1193,hash.length);
        hashMe = "foo";
        hash = org.apache.commons.codec.digest.DigestUtils.md2(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1194,hash.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * An MD5 hash converted to hex should always be 32 characters.
     */
@Test
    public void testMd5Hex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5Hex");
        String hashMe = "foo";
        String hash = org.apache.commons.codec.digest.DigestUtils.md5Hex(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1196,hash,1195,hash.length());
        hashMe = "length < 32";
        hash = org.apache.commons.codec.digest.DigestUtils.md5Hex(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,hash,1197,hash.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * An MD5 hash converted to hex should always be 32 characters.
     */
@Test
    public void testMd5HexLength() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5HexLength");
        String hashMe = "this is some string that is longer than 32 characters";
        String hash = org.apache.commons.codec.digest.DigestUtils.md5Hex(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1196,hash,1195,hash.length());
        hashMe = "foo";
        hash = org.apache.commons.codec.digest.DigestUtils.md5Hex(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,hash,1197,hash.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * An MD5 hash should always be a 16 element byte[].
     */
@Test
    public void testMd5Length() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5Length");
        String hashMe = "foo";
        byte[] hash = org.apache.commons.codec.digest.DigestUtils.md5(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1199,hash.length);
        hashMe = "length < 16";
        hash = org.apache.commons.codec.digest.DigestUtils.md5(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,hash.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * An MD5 hash should always be a 16 element byte[].
     */
@Test
    public void testMd5Length_literalMutation1383() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5Length_literalMutation1383");
        String hashMe = "this is some string that is longer than 16 characters";
        byte[] hash = org.apache.commons.codec.digest.DigestUtils.md5(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1199,hash.length);
        hashMe = "foo";
        hash = org.apache.commons.codec.digest.DigestUtils.md5(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(hashMe));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,hash.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha1Hex() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1Hex");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1202,null,1201,org.apache.commons.codec.digest.DigestUtils.sha1Hex("abc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,null,1203,org.apache.commons.codec.digest.DigestUtils.sha1Hex(org.apache.commons.codec.binary.StringUtils.getBytesUtf8("abc")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,null,1205,org.apache.commons.codec.digest.DigestUtils.sha1Hex(("abcdbcdecdefdefgefghfghighij" + "hijkijkljklmklmnlmnomnopnopq")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1208,null,1207,org.apache.commons.codec.digest.DigestUtils.sha1Hex(testData));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1210,null,1209,org.apache.commons.codec.digest.DigestUtils.sha1Hex(new java.io.ByteArrayInputStream(testData)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithByteArray_add251() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithByteArray_add251");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1211,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1212,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithByteArray_add252() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithByteArray_add252");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1211,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1212,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithByteArray_add253() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithByteArray_add253");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1211,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1212,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithByteArray_add254() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithByteArray_add254");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1211,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1212,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha1UpdateWithByteArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithByteArray");
        final String d1 = "foo";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1211,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1212,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha1UpdateWithByteArray_literalMutation1385() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithByteArray_literalMutation1385");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "foo";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1211,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1212,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithByteArray_remove234() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithByteArray_remove234");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1211,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1212,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithByteArray_remove235() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithByteArray_remove235");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1211,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1212,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithByteArray_remove236() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithByteArray_remove236");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1211,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1212,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithByteArray_remove237() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithByteArray_remove237");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1211,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1212,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithString_add255() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithString_add255");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1213,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1214,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithString_add256() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithString_add256");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1213,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1214,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithString_add257() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithString_add257");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1213,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1214,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithString_add258() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithString_add258");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1213,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1214,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha1UpdateWithString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithString");
        final String d1 = "foo";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1213,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1214,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha1UpdateWithString_literalMutation1387() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithString_literalMutation1387");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "foo";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1213,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1214,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithString_remove238() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithString_remove238");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1213,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1214,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithString_remove239() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithString_remove239");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1213,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1214,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithString_remove240() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithString_remove240");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1213,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1214,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha1UpdateWithString_remove241() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1UpdateWithString_remove241");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getSha1Digest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1213,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1214,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha256() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1216,null,1215,org.apache.commons.codec.digest.DigestUtils.sha256Hex("abc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1218,null,1217,org.apache.commons.codec.digest.DigestUtils.sha256Hex(org.apache.commons.codec.binary.StringUtils.getBytesUtf8("abc")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1220,null,1219,org.apache.commons.codec.digest.DigestUtils.sha256Hex("abcdbcdecdefdefgefghfghighijhijkijkljklmklmnlmnomnopnopq"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1222,null,1221,org.apache.commons.codec.digest.DigestUtils.sha256Hex(testData));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1224,null,1223,org.apache.commons.codec.digest.DigestUtils.sha256Hex(new java.io.ByteArrayInputStream(testData)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha384() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha384");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1225,("cb00753f45a35e8bb5a03d699ac65007272c32ab0eded1631a8b605a43ff5bed" + "8086072ba1e7cc2358baeca134c825a7"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1227,null,1226,org.apache.commons.codec.digest.DigestUtils.sha384Hex("abc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1228,("cb00753f45a35e8bb5a03d699ac65007272c32ab0eded1631a8b605a43ff5bed" + "8086072ba1e7cc2358baeca134c825a7"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1230,null,1229,org.apache.commons.codec.digest.DigestUtils.sha384Hex(org.apache.commons.codec.binary.StringUtils.getBytesUtf8("abc")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1231,("09330c33f71147e83d192fc782cd1b4753111b173b3b05d22fa08086e3b0f712" + "fcc7c71a557e2db966c3e9fa91746039"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1233,null,1232,org.apache.commons.codec.digest.DigestUtils.sha384Hex(("abcdefghbcdefghicdefghijdefghijkefghijklfghijklmghijklmn" + "hijklmnoijklmnopjklmnopqklmnopqrlmnopqrsmnopqrstnopqrstu")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1235,null,1234,org.apache.commons.codec.digest.DigestUtils.sha384Hex(testData));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1237,null,1236,org.apache.commons.codec.digest.DigestUtils.sha384Hex(new java.io.ByteArrayInputStream(testData)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha512() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha512");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1238,("ddaf35a193617abacc417349ae20413112e6fa4e89a97ea20a9eeee64b55d39a" + "2192992a274fc1a836ba3c23a3feebbd454d4423643ce80e2a9ac94fa54ca49f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1240,null,1239,org.apache.commons.codec.digest.DigestUtils.sha512Hex("abc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1241,("ddaf35a193617abacc417349ae20413112e6fa4e89a97ea20a9eeee64b55d39a" + "2192992a274fc1a836ba3c23a3feebbd454d4423643ce80e2a9ac94fa54ca49f"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1243,null,1242,org.apache.commons.codec.digest.DigestUtils.sha512Hex(org.apache.commons.codec.binary.StringUtils.getBytesUtf8("abc")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1244,("8e959b75dae313da8cf4f72814fc143f8f7779c6eb9f7fa17299aeadb6889018" + "501d289e4900f7e4331b99dec4b5433ac7d329eeb6dd26545e96e55b874be909"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1246,null,1245,org.apache.commons.codec.digest.DigestUtils.sha512Hex(("abcdefghbcdefghicdefghijdefghijkefghijklfghijklmghijklmn" + "hijklmnoijklmnopjklmnopqklmnopqrlmnopqrsmnopqrstnopqrstu")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1248,null,1247,org.apache.commons.codec.digest.DigestUtils.sha512Hex(testData));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1250,null,1249,org.apache.commons.codec.digest.DigestUtils.sha512Hex(new java.io.ByteArrayInputStream(testData)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test
    public void testShaHex() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaHex");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1252,null,1251,org.apache.commons.codec.digest.DigestUtils.shaHex("abc"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1254,null,1253,org.apache.commons.codec.digest.DigestUtils.shaHex(org.apache.commons.codec.binary.StringUtils.getBytesUtf8("abc")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1256,null,1255,org.apache.commons.codec.digest.DigestUtils.shaHex(("abcdbcdecdefdefgefghfghighij" + "hijkijkljklmklmnlmnomnopnopq")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1258,null,1257,org.apache.commons.codec.digest.DigestUtils.shaHex(testData));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1260,null,1259,org.apache.commons.codec.digest.DigestUtils.shaHex(new java.io.ByteArrayInputStream(testData)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithByteArray_add259() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithByteArray_add259");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1261,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1262,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithByteArray_add260() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithByteArray_add260");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1261,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1262,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithByteArray_add261() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithByteArray_add261");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1261,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1262,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithByteArray_add262() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithByteArray_add262");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1261,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1262,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test
    public void testShaUpdateWithByteArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithByteArray");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1261,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1262,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test
    public void testShaUpdateWithByteArray_literalMutation1390() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithByteArray_literalMutation1390");
        final String d1 = "foo";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1261,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1262,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test
    public void testShaUpdateWithByteArray_literalMutation1391() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithByteArray_literalMutation1391");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "foo";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1261,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1262,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithByteArray_remove242() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithByteArray_remove242");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1261,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1262,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithByteArray_remove243() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithByteArray_remove243");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1.getBytes());
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1261,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1262,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithByteArray_remove244() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithByteArray_remove244");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1261,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1262,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithByteArray_remove245() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithByteArray_remove245");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(d1.getBytes());
        messageDigest.update(d2.getBytes());
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2.getBytes());
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1261,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1262,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithString_add263() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithString_add263");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1263,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1264,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithString_add264() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithString_add264");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1263,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1264,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithString_add265() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithString_add265");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1263,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1264,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithString_add266() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithString_add266");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1263,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1264,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test
    public void testShaUpdateWithString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithString");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1263,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1264,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test
    public void testShaUpdateWithString_literalMutation1393() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithString_literalMutation1393");
        final String d1 = "foo";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1263,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1264,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test
    public void testShaUpdateWithString_literalMutation1394() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithString_literalMutation1394");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "foo";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1263,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1264,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithString_remove246() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithString_remove246");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1263,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1264,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithString_remove247() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithString_remove247");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d1);
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1263,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1264,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithString_remove248() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithString_remove248");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1263,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1264,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testShaUpdateWithString_remove249() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShaUpdateWithString_remove249");
        final String d1 = "C\'est un homme qui rentre dans un café, et plouf";
        final String d2 = "C\'est un homme, c\'est qu\'une tête, on lui offre un cadeau: \'oh... encore un chapeau!\'";
        MessageDigest messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d1));
        messageDigest.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(d2));
        final String expectedResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        messageDigest = org.apache.commons.codec.digest.DigestUtils.getShaDigest();
        org.apache.commons.codec.digest.DigestUtils.updateDigest(messageDigest, d2);
        final String actualResult = org.apache.commons.codec.binary.Hex.encodeHexString(messageDigest.digest());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1263,expectedResult);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1264,actualResult);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

