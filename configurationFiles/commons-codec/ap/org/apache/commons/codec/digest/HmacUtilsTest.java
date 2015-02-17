package org.apache.commons.codec.digest;

import java.io.IOException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.junit.Test;

/** 
 * Tests HmacUtils methods.
 * 
 * @version $Id$
 */
public class HmacUtilsTest {
    private static final String STANDARD_KEY_STRING = "key";

    private static final byte[] STANDARD_KEY_BYTES = STANDARD_KEY_STRING.getBytes();

    private static final byte[] STANDARD_MD5_RESULT_BYTES = new byte[]{ -128 , 7 , 7 , 19 , 70 , 62 , 119 , 73 , -71 , 12 , 45 , -62 , 73 , 17 , -30 , 117 };

    private static final String STANDARD_MD5_RESULT_STRING = "80070713463e7749b90c2dc24911e275";

    private static final String STANDARD_PHRASE_STRING = "The quick brown fox jumps over the lazy dog";

    private static final byte[] STANDARD_PHRASE_BYTES = STANDARD_PHRASE_STRING.getBytes();

    private static final byte[] STANDARD_SHA1_RESULT_BYTES = new byte[]{ -34 , 124 , -101 , -123 , -72 , -73 , -118 , -90 , -68 , -118 , 122 , 54 , -9 , 10 , -112 , 112 , 28 , -99 , -76 , -39 };

    private static final String STANDARD_SHA1_RESULT_STRING = "de7c9b85b8b78aa6bc8a7a36f70a90701c9db4d9";

    private static final byte[] STANDARD_SHA256_RESULT_BYTES = new byte[]{ -9 , -68 , -125 , -12 , 48 , 83 , -124 , 36 , -79 , 50 , -104 , -26 , -86 , 111 , -79 , 67 , -17 , 77 , 89 , -95 , 73 , 70 , 23 , 89 , -105 , 71 , -99 , -68 , 45 , 26 , 60 , -40 };

    private static final String STANDARD_SHA256_RESULT_STRING = "f7bc83f430538424b13298e6aa6fb143ef4d59a14946175997479dbc2d1a3cd8";

    private static final byte[] STANDARD_SHA384_RESULT_BYTES = new byte[]{ -41 , -12 , 114 , 126 , 44 , 11 , 57 , -82 , 15 , 30 , 64 , -52 , -106 , -10 , 2 , 66 , -43 , -73 , -128 , 24 , 65 , -50 , -90 , -4 , 89 , 44 , 93 , 62 , 26 , -27 , 7 , 0 , 88 , 42 , -106 , -49 , 53 , -31 , -27 , 84 , -103 , 95 , -28 , -32 , 51 , -127 , -62 , 55 };

    private static final String STANDARD_SHA384_RESULT_STRING = "D7F4727E2C0B39AE0F1E40CC96F60242D5B7801841CEA6FC592C5D3E1AE50700582A96CF35E1E554995FE4E03381C237".toLowerCase();

    private static final byte[] STANDARD_SHA512_RESULT_BYTES = new byte[]{ -76 , 42 , -16 , -112 , 87 , -70 , -63 , -30 , -44 , 23 , 8 , -28 , -118 , -112 , 46 , 9 , -75 , -1 , 127 , 18 , -85 , 66 , -118 , 79 , -24 , 102 , 83 , -57 , 61 , -46 , 72 , -5 , -126 , -7 , 72 , -91 , 73 , -9 , -73 , -111 , -91 , -76 , 25 , 21 , -18 , 77 , 30 , -61 , -109 , 83 , 87 , -28 , -30 , 49 , 114 , 80 , -48 , 55 , 42 , -6 , 46 , -66 , -21 , 58 };

    private static final String STANDARD_SHA512_RESULT_STRING = "B42AF09057BAC1E2D41708E48A902E09B5FF7F12AB428A4FE86653C73DD248FB82F948A549F7B791A5B41915EE4D1EC3935357E4E2317250D0372AFA2EBEEB3A".toLowerCase();

    @Test
    public void testConstructor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1265,new org.apache.commons.codec.digest.HmacUtils());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testEmptyKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyKey");
        org.apache.commons.codec.digest.HmacUtils.getHmacMd5(new byte[]{  });
        org.apache.commons.codec.digest.HmacUtils.getHmacMd5(new byte[]{  });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testEmptyKey_remove250() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyKey_remove250");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testGetHMac() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetHMac");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1266,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_MD5_RESULT_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1268,org.apache.commons.codec.digest.HmacUtils.getHmacMd5(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_KEY_BYTES),1267,org.apache.commons.codec.digest.HmacUtils.getHmacMd5(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_KEY_BYTES).doFinal(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_PHRASE_BYTES));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1269,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1271,org.apache.commons.codec.digest.HmacUtils.getHmacSha1(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_KEY_BYTES),1270,org.apache.commons.codec.digest.HmacUtils.getHmacSha1(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_KEY_BYTES).doFinal(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_PHRASE_BYTES));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1272,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA256_RESULT_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1274,org.apache.commons.codec.digest.HmacUtils.getHmacSha256(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_KEY_BYTES),1273,org.apache.commons.codec.digest.HmacUtils.getHmacSha256(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_KEY_BYTES).doFinal(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_PHRASE_BYTES));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1275,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA384_RESULT_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1277,org.apache.commons.codec.digest.HmacUtils.getHmacSha384(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_KEY_BYTES),1276,org.apache.commons.codec.digest.HmacUtils.getHmacSha384(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_KEY_BYTES).doFinal(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_PHRASE_BYTES));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1278,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA512_RESULT_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1280,org.apache.commons.codec.digest.HmacUtils.getHmacSha512(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_KEY_BYTES),1279,org.apache.commons.codec.digest.HmacUtils.getHmacSha512(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_KEY_BYTES).doFinal(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_PHRASE_BYTES));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHmacMd5Hex() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacMd5Hex");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1282,null,1281,org.apache.commons.codec.digest.HmacUtils.hmacMd5Hex(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_KEY_STRING, "The quick brown fox jumps over the lazy dog"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1284,null,1283,org.apache.commons.codec.digest.HmacUtils.hmacMd5Hex("Jefe", "what do ya want for nothing?"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1286,null,1285,org.apache.commons.codec.digest.HmacUtils.hmacMd5Hex("Jefe".getBytes(), new java.io.ByteArrayInputStream("what do ya want for nothing?".getBytes())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHmacSha1Hex() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1Hex");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1287,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1289,null,1288,org.apache.commons.codec.digest.HmacUtils.hmacSha1Hex(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_KEY_STRING, org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_PHRASE_STRING));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1291,null,1290,org.apache.commons.codec.digest.HmacUtils.hmacSha1Hex(org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_KEY_STRING, ""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1293,null,1292,org.apache.commons.codec.digest.HmacUtils.hmacSha1Hex("Jefe", "what do ya want for nothing?"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1295,null,1294,org.apache.commons.codec.digest.HmacUtils.hmacSha1Hex("Jefe".getBytes(), new java.io.ByteArrayInputStream("what do ya want for nothing?".getBytes())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHmacSha1UpdateWithByteArray_add268() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithByteArray_add268");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, STANDARD_PHRASE_BYTES);
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, STANDARD_PHRASE_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1296,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1298,null,1297,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, "".getBytes());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1300,null,1299,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHmacSha1UpdateWithByteArray_add269() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithByteArray_add269");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, STANDARD_PHRASE_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1296,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1298,null,1297,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, "".getBytes());
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, "".getBytes());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1300,null,1299,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHmacSha1UpdateWithByteArray() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithByteArray");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, STANDARD_PHRASE_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1296,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1298,null,1297,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, "bar".getBytes());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1300,null,1299,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHmacSha1UpdateWithByteArray_remove251() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithByteArray_remove251");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1296,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1298,null,1297,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, "".getBytes());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1300,null,1299,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHmacSha1UpdateWithByteArray_remove252() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithByteArray_remove252");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1296,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1298,null,1297,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, "".getBytes());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1300,null,1299,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHmacSha1UpdateWithInpustream_add270() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithInpustream_add270");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, new java.io.ByteArrayInputStream(STANDARD_PHRASE_BYTES));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, new java.io.ByteArrayInputStream(STANDARD_PHRASE_BYTES));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1301,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1303,null,1302,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, new java.io.ByteArrayInputStream("".getBytes()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,null,1304,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHmacSha1UpdateWithInpustream_add271() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithInpustream_add271");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, new java.io.ByteArrayInputStream(STANDARD_PHRASE_BYTES));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1301,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1303,null,1302,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, new java.io.ByteArrayInputStream("".getBytes()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, new java.io.ByteArrayInputStream("".getBytes()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,null,1304,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHmacSha1UpdateWithInpustream() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithInpustream");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, new java.io.ByteArrayInputStream(STANDARD_PHRASE_BYTES));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1301,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1303,null,1302,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, new java.io.ByteArrayInputStream("bar".getBytes()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,null,1304,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHmacSha1UpdateWithInpustream_remove253() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithInpustream_remove253");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1301,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1303,null,1302,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, new java.io.ByteArrayInputStream("".getBytes()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,null,1304,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHmacSha1UpdateWithInpustream_remove254() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithInpustream_remove254");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1301,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1303,null,1302,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, new java.io.ByteArrayInputStream("".getBytes()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,null,1304,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHmacSha1UpdateWithString_add272() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithString_add272");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, STANDARD_PHRASE_STRING);
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, STANDARD_PHRASE_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,null,1307,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,null,1309,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHmacSha1UpdateWithString_add273() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithString_add273");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, STANDARD_PHRASE_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,null,1307,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, "");
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,null,1309,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testHmacSha1UpdateWithString() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithString");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, STANDARD_PHRASE_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,null,1307,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,null,1309,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHmacSha1UpdateWithString_remove255() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithString_remove255");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,null,1307,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,null,1309,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHmacSha1UpdateWithString_remove256() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHmacSha1UpdateWithString_remove256");
        final Mac mac = org.apache.commons.codec.digest.HmacUtils.getHmacSha1(STANDARD_KEY_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_SHA1_RESULT_STRING);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1308,null,1307,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        org.apache.commons.codec.digest.HmacUtils.updateHmac(mac, "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,null,1309,org.apache.commons.codec.binary.Hex.encodeHexString(mac.doFinal()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testInitializedMac() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInitializedMac");
        final Mac md5Mac = org.apache.commons.codec.digest.HmacUtils.getInitializedMac(org.apache.commons.codec.digest.HmacAlgorithms.HMAC_MD5, STANDARD_KEY_BYTES);
        final Mac md5Mac2 = org.apache.commons.codec.digest.HmacUtils.getInitializedMac("bar", STANDARD_KEY_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1311,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_MD5_RESULT_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1313,org.apache.commons.codec.digest.HmacUtils.updateHmac(md5Mac, org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_PHRASE_STRING),1312,org.apache.commons.codec.digest.HmacUtils.updateHmac(md5Mac, org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_PHRASE_STRING).doFinal());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1314,org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_MD5_RESULT_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1316,org.apache.commons.codec.digest.HmacUtils.updateHmac(md5Mac2, org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_PHRASE_STRING),1315,org.apache.commons.codec.digest.HmacUtils.updateHmac(md5Mac2, org.apache.commons.codec.digest.HmacUtilsTest.STANDARD_PHRASE_STRING).doFinal());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testInitializedMacNullAlgo() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInitializedMacNullAlgo");
        org.apache.commons.codec.digest.HmacUtils.getInitializedMac(((String)(null)), STANDARD_KEY_BYTES);
        org.apache.commons.codec.digest.HmacUtils.getInitializedMac(((String)(null)), STANDARD_KEY_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testInitializedMacNullAlgo_remove257() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInitializedMacNullAlgo_remove257");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testInitializedMacNullKey() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInitializedMacNullKey");
        org.apache.commons.codec.digest.HmacUtils.getInitializedMac(org.apache.commons.codec.digest.HmacAlgorithms.HMAC_MD5, null);
        org.apache.commons.codec.digest.HmacUtils.getInitializedMac(org.apache.commons.codec.digest.HmacAlgorithms.HMAC_MD5, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testInitializedMacNullKey_remove258() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInitializedMacNullKey_remove258");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInternalNoSuchAlgorithmException() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInternalNoSuchAlgorithmException");
        org.apache.commons.codec.digest.HmacUtils.getInitializedMac("Bogus Bogus", org.apache.commons.codec.binary.StringUtils.getBytesUtf8("akey"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testInternalNoSuchAlgorithmException_add276() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInternalNoSuchAlgorithmException_add276");
        org.apache.commons.codec.digest.HmacUtils.getInitializedMac("Bogus Bogus", org.apache.commons.codec.binary.StringUtils.getBytesUtf8("akey"));
        org.apache.commons.codec.digest.HmacUtils.getInitializedMac("Bogus Bogus", org.apache.commons.codec.binary.StringUtils.getBytesUtf8("akey"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInternalNoSuchAlgorithmException_literalMutation1521() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInternalNoSuchAlgorithmException_literalMutation1521");
        org.apache.commons.codec.digest.HmacUtils.getInitializedMac("bar", org.apache.commons.codec.binary.StringUtils.getBytesUtf8("akey"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInternalNoSuchAlgorithmException_literalMutation1522() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInternalNoSuchAlgorithmException_literalMutation1522");
        org.apache.commons.codec.digest.HmacUtils.getInitializedMac("Bogus Bogus", org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testInternalNoSuchAlgorithmException_remove259() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInternalNoSuchAlgorithmException_remove259");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testMd5HMac() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5HMac");
        org.apache.commons.codec.digest.HmacUtils.hmacMd5(((byte[])(null)), STANDARD_PHRASE_BYTES);
        org.apache.commons.codec.digest.HmacUtils.hmacMd5(((byte[])(null)), STANDARD_PHRASE_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testMd5HMacFail() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5HMacFail");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testNullKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullKey");
        org.apache.commons.codec.digest.HmacUtils.getHmacMd5(null);
        org.apache.commons.codec.digest.HmacUtils.getHmacMd5(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testNullKey_remove261() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullKey_remove261");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSecretKeySpecAllowsEmtyKeys() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSecretKeySpecAllowsEmtyKeys");
        new SecretKeySpec(new byte[]{  } , "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSha1HMac() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1HMac");
        org.apache.commons.codec.digest.HmacUtils.hmacSha1(((byte[])(null)), STANDARD_PHRASE_BYTES);
        org.apache.commons.codec.digest.HmacUtils.hmacSha1(((byte[])(null)), STANDARD_PHRASE_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSha1HMacFail() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha1HMacFail");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSha256HMac() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256HMac");
        org.apache.commons.codec.digest.HmacUtils.hmacSha256(((byte[])(null)), STANDARD_PHRASE_BYTES);
        org.apache.commons.codec.digest.HmacUtils.hmacSha256(((byte[])(null)), STANDARD_PHRASE_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSha256HMacFail() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256HMacFail");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSha384HMac() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha384HMac");
        org.apache.commons.codec.digest.HmacUtils.hmacSha384(((byte[])(null)), STANDARD_PHRASE_BYTES);
        org.apache.commons.codec.digest.HmacUtils.hmacSha384(((byte[])(null)), STANDARD_PHRASE_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSha384HMacFail() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha384HMacFail");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSha512HMac() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha512HMac");
        org.apache.commons.codec.digest.HmacUtils.hmacSha512(((byte[])(null)), STANDARD_PHRASE_BYTES);
        org.apache.commons.codec.digest.HmacUtils.hmacSha512(((byte[])(null)), STANDARD_PHRASE_BYTES);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSha512HMacFail() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha512HMacFail");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

