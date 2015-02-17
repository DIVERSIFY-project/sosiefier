package org.apache.commons.codec.binary;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.junit.Test;

/** 
 * @version $Id $
 * @since 1.4
 */
public class Base64InputStreamTest {
    /** 
     * Decodes to {0, 0, 0, 255, 255, 255}
     */
private static final String ENCODED_B64 = "AAAA////";

    private static final byte[] CRLF = new byte[]{ ((byte)('\r')) , ((byte)('\n')) };

    private static final byte[] LF = new byte[]{ ((byte)('\n')) };

    private static final String STRING_FIXTURE = "Hello World";

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base64OutputStream base64os = new Base64OutputStream(bos);
        base64os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base64os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base64InputStream ins = new Base64InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = Base64TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE,1641,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test(timeout = 1000)
    public void testCodec130_add387() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_add387");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base64OutputStream base64os = new Base64OutputStream(bos);
        base64os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base64os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base64os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base64InputStream ins = new Base64InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = Base64TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE,1641,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test(timeout = 1000)
    public void testCodec130_add388() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_add388");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base64OutputStream base64os = new Base64OutputStream(bos);
        base64os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base64os.close();
        base64os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base64InputStream ins = new Base64InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = Base64TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE,1641,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test(timeout = 1000)
    public void testCodec130_add389() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_add389");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base64OutputStream base64os = new Base64OutputStream(bos);
        base64os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base64os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base64InputStream ins = new Base64InputStream(bis);
        ins.skip(1);
        ins.skip(1);
        final byte[] decodedBytes = Base64TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE,1641,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130_literalMutation2081() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation2081");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base64OutputStream base64os = new Base64OutputStream(bos);
        base64os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base64os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base64InputStream ins = new Base64InputStream(bis);
        ins.skip(2);
        final byte[] decodedBytes = Base64TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE,1641,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130_literalMutation2082() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation2082");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base64OutputStream base64os = new Base64OutputStream(bos);
        base64os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base64os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base64InputStream ins = new Base64InputStream(bis);
        ins.skip(0);
        final byte[] decodedBytes = Base64TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE,1641,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130_literalMutation2083() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation2083");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base64OutputStream base64os = new Base64OutputStream(bos);
        base64os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base64os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base64InputStream ins = new Base64InputStream(bis);
        ins.skip(0);
        final byte[] decodedBytes = Base64TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE,1641,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130_literalMutation2084() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation2084");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base64OutputStream base64os = new Base64OutputStream(bos);
        base64os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base64os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base64InputStream ins = new Base64InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = Base64TestData.streamToBytes(ins, new byte[65]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE,1641,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130_literalMutation2085() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation2085");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base64OutputStream base64os = new Base64OutputStream(bos);
        base64os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base64os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base64InputStream ins = new Base64InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = Base64TestData.streamToBytes(ins, new byte[32]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE,1641,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130_literalMutation2086() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation2086");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base64OutputStream base64os = new Base64OutputStream(bos);
        base64os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base64os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base64InputStream ins = new Base64InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = Base64TestData.streamToBytes(ins, new byte[128]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE,1641,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130_literalMutation2087() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation2087");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base64OutputStream base64os = new Base64OutputStream(bos);
        base64os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base64os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base64InputStream ins = new Base64InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = Base64TestData.streamToBytes(ins, new byte[63]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE,1641,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test(timeout = 1000)
    public void testCodec130_remove356() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_remove356");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base64OutputStream base64os = new Base64OutputStream(bos);
        base64os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base64InputStream ins = new Base64InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = Base64TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE,1641,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test(timeout = 1000)
    public void testCodec130_remove357() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_remove357");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base64OutputStream base64os = new Base64OutputStream(bos);
        base64os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base64InputStream ins = new Base64InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = Base64TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE,1641,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test(timeout = 1000)
    public void testCodec130_remove358() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_remove358");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base64OutputStream base64os = new Base64OutputStream(bos);
        base64os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base64os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base64InputStream ins = new Base64InputStream(bis);
        final byte[] decodedBytes = Base64TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1642,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE,1641,org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test
    public void testCodec105() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105");
        final Base64InputStream in = new Base64InputStream(new Codec105ErrorInputStream() , true , 0 , null);
        try {
            for (int i = 0 ; i < 5 ; i++) {
                in.read();
            }
        } finally {
            in.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test(timeout = 1000)
    public void testCodec105_add385() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_add385");
        final Base64InputStream in = new Base64InputStream(new Codec105ErrorInputStream() , true , 0 , null);
        try {
            for (int i = 0 ; i < 5 ; i++) {
                in.read();
                in.read();
            }
        } finally {
            in.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test(timeout = 1000)
    public void testCodec105_add386() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_add386");
        final Base64InputStream in = new Base64InputStream(new Codec105ErrorInputStream() , true , 0 , null);
        try {
            for (int i = 0 ; i < 5 ; i++) {
                in.read();
            }
        } finally {
            in.close();
            in.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test
    public void testCodec105_literalMutation2069() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation2069");
        final Base64InputStream in = new Base64InputStream(new Codec105ErrorInputStream() , false , 0 , null);
        try {
            for (int i = 0 ; i < 5 ; i++) {
                in.read();
            }
        } finally {
            in.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test
    public void testCodec105_literalMutation2070() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation2070");
        final Base64InputStream in = new Base64InputStream(new Codec105ErrorInputStream() , true , 1 , null);
        try {
            for (int i = 0 ; i < 5 ; i++) {
                in.read();
            }
        } finally {
            in.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test
    public void testCodec105_literalMutation2071() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation2071");
        final Base64InputStream in = new Base64InputStream(new Codec105ErrorInputStream() , true , -1 , null);
        try {
            for (int i = 0 ; i < 5 ; i++) {
                in.read();
            }
        } finally {
            in.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test
    public void testCodec105_literalMutation2072() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation2072");
        final Base64InputStream in = new Base64InputStream(new Codec105ErrorInputStream() , true , 0 , null);
        try {
            for (int i = 0 ; i < 5 ; i++) {
                in.read();
            }
        } finally {
            in.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test
    public void testCodec105_literalMutation2074() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation2074");
        final Base64InputStream in = new Base64InputStream(new Codec105ErrorInputStream() , true , 0 , null);
        try {
            for (int i = 1 ; i < 5 ; i++) {
                in.read();
            }
        } finally {
            in.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test
    public void testCodec105_literalMutation2075() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation2075");
        final Base64InputStream in = new Base64InputStream(new Codec105ErrorInputStream() , true , 0 , null);
        try {
            for (int i = -1 ; i < 5 ; i++) {
                in.read();
            }
        } finally {
            in.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test
    public void testCodec105_literalMutation2076() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation2076");
        final Base64InputStream in = new Base64InputStream(new Codec105ErrorInputStream() , true , 0 , null);
        try {
            for (int i = 0 ; i < 5 ; i++) {
                in.read();
            }
        } finally {
            in.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test
    public void testCodec105_literalMutation2077() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation2077");
        final Base64InputStream in = new Base64InputStream(new Codec105ErrorInputStream() , true , 0 , null);
        try {
            for (int i = 0 ; i < 4 ; i++) {
                in.read();
            }
        } finally {
            in.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test
    public void testCodec105_literalMutation2078() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation2078");
        final Base64InputStream in = new Base64InputStream(new Codec105ErrorInputStream() , true , 0 , null);
        try {
            for (int i = 0 ; i < 2 ; i++) {
                in.read();
            }
        } finally {
            in.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test
    public void testCodec105_literalMutation2079() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation2079");
        final Base64InputStream in = new Base64InputStream(new Codec105ErrorInputStream() , true , 0 , null);
        try {
            for (int i = 0 ; i < 10 ; i++) {
                in.read();
            }
        } finally {
            in.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test
    public void testCodec105_literalMutation2080() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation2080");
        final Base64InputStream in = new Base64InputStream(new Codec105ErrorInputStream() , true , 0 , null);
        try {
            for (int i = 0 ; i < 6 ; i++) {
                in.read();
            }
        } finally {
            in.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for the CODEC-101 bug: InputStream.read(byte[]) should never return 0 because Java's builtin InputStreamReader hates that.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testCodec101_add384() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec101_add384");
        final byte[] codec101 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_101_MULTIPLE_OF_3);
        final ByteArrayInputStream bais = new ByteArrayInputStream(codec101);
        final Base64InputStream in = new Base64InputStream(bais);
        final byte[] result = new byte[8192];
        int c = in.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,(("Codec101: First read successful [c=" + c) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,(c > 0));
        c = in.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,(("Codec101: Second read should report end-of-stream [c=" + c) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,(c < 0));
        in.close();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for the CODEC-101 bug: InputStream.read(byte[]) should never return 0 because Java's builtin InputStreamReader hates that.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testCodec101() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec101");
        final byte[] codec101 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_101_MULTIPLE_OF_3);
        final ByteArrayInputStream bais = new ByteArrayInputStream(codec101);
        final Base64InputStream in = new Base64InputStream(bais);
        final byte[] result = new byte[8193];
        int c = in.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,(("Codec101: First read successful [c=" + c) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,(c > 0));
        c = in.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,(("Codec101: Second read should report end-of-stream [c=" + c) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,(c < 0));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for the CODEC-101 bug: InputStream.read(byte[]) should never return 0 because Java's builtin InputStreamReader hates that.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testCodec101_literalMutation2066() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec101_literalMutation2066");
        final byte[] codec101 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_101_MULTIPLE_OF_3);
        final ByteArrayInputStream bais = new ByteArrayInputStream(codec101);
        final Base64InputStream in = new Base64InputStream(bais);
        final byte[] result = new byte[4096];
        int c = in.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,(("Codec101: First read successful [c=" + c) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,(c > 0));
        c = in.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,(("Codec101: Second read should report end-of-stream [c=" + c) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,(c < 0));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for the CODEC-101 bug: InputStream.read(byte[]) should never return 0 because Java's builtin InputStreamReader hates that.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testCodec101_literalMutation2067() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec101_literalMutation2067");
        final byte[] codec101 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_101_MULTIPLE_OF_3);
        final ByteArrayInputStream bais = new ByteArrayInputStream(codec101);
        final Base64InputStream in = new Base64InputStream(bais);
        final byte[] result = new byte[16384];
        int c = in.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,(("Codec101: First read successful [c=" + c) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,(c > 0));
        c = in.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,(("Codec101: Second read should report end-of-stream [c=" + c) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,(c < 0));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for the CODEC-101 bug: InputStream.read(byte[]) should never return 0 because Java's builtin InputStreamReader hates that.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testCodec101_literalMutation2068() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec101_literalMutation2068");
        final byte[] codec101 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_101_MULTIPLE_OF_3);
        final ByteArrayInputStream bais = new ByteArrayInputStream(codec101);
        final Base64InputStream in = new Base64InputStream(bais);
        final byte[] result = new byte[8191];
        int c = in.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,(("Codec101: First read successful [c=" + c) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,(c > 0));
        c = in.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,(("Codec101: Second read should report end-of-stream [c=" + c) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,(c < 0));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for the CODEC-101 bug: InputStream.read(byte[]) should never return 0 because Java's builtin InputStreamReader hates that.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testCodec101_remove355() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec101_remove355");
        final byte[] codec101 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_101_MULTIPLE_OF_3);
        final ByteArrayInputStream bais = new ByteArrayInputStream(codec101);
        final Base64InputStream in = new Base64InputStream(bais);
        final byte[] result = new byte[8192];
        int c = in.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,(("Codec101: First read successful [c=" + c) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1638,(c > 0));
        c = in.read(result);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,(("Codec101: Second read should report end-of-stream [c=" + c) + "]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1640,(c < 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Another test for the CODEC-101 bug: In commons-codec-1.4 this test shows InputStreamReader explicitly hating an
     * InputStream.read(byte[]) return of 0:
     * 
     * java.io.IOException: Underlying input stream returned zero bytes at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:268) at
     * sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:306) at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:158) at
     * java.io.InputStreamReader.read(InputStreamReader.java:167) at java.io.BufferedReader.fill(BufferedReader.java:136) at
     * java.io.BufferedReader.readLine(BufferedReader.java:299) at java.io.BufferedReader.readLine(BufferedReader.java:362) at
     * org.apache.commons.codec.binary.Base64InputStreamTest.testInputStreamReader(Base64InputStreamTest.java:75)
     * 
     * But in commons-codec-1.5 it's fixed. :-)
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testInputStreamReader() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInputStreamReader");
        final byte[] codec101 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_101_MULTIPLE_OF_3);
        final ByteArrayInputStream bais = new ByteArrayInputStream(codec101);
        final Base64InputStream in = new Base64InputStream(bais);
        final InputStreamReader isr = new InputStreamReader(in);
        final BufferedReader br = new BufferedReader(isr);
        final String line = br.readLine();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1646,line);
        br.close();
        br.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Another test for the CODEC-101 bug: In commons-codec-1.4 this test shows InputStreamReader explicitly hating an
     * InputStream.read(byte[]) return of 0:
     * 
     * java.io.IOException: Underlying input stream returned zero bytes at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:268) at
     * sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:306) at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:158) at
     * java.io.InputStreamReader.read(InputStreamReader.java:167) at java.io.BufferedReader.fill(BufferedReader.java:136) at
     * java.io.BufferedReader.readLine(BufferedReader.java:299) at java.io.BufferedReader.readLine(BufferedReader.java:362) at
     * org.apache.commons.codec.binary.Base64InputStreamTest.testInputStreamReader(Base64InputStreamTest.java:75)
     * 
     * But in commons-codec-1.5 it's fixed. :-)
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testInputStreamReader_remove359() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInputStreamReader_remove359");
        final byte[] codec101 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_101_MULTIPLE_OF_3);
        final ByteArrayInputStream bais = new ByteArrayInputStream(codec101);
        final Base64InputStream in = new Base64InputStream(bais);
        final InputStreamReader isr = new InputStreamReader(in);
        final BufferedReader br = new BufferedReader(isr);
        final String line = br.readLine();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1646,line);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64InputStream implementation against the special NPE inducing input identified in the CODEC-98 bug.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testCodec98NPE() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final ByteArrayInputStream data = new ByteArrayInputStream(codec98);
        final Base64InputStream stream = new Base64InputStream(data);
        final byte[] decodedBytes = Base64TestData.streamToBytes(stream, new byte[1025]);
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64InputStream implementation against the special NPE inducing input identified in the CODEC-98 bug.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testCodec98NPE_literalMutation2089() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_literalMutation2089");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final ByteArrayInputStream data = new ByteArrayInputStream(codec98);
        final Base64InputStream stream = new Base64InputStream(data);
        final byte[] decodedBytes = Base64TestData.streamToBytes(stream, new byte[512]);
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64InputStream implementation against the special NPE inducing input identified in the CODEC-98 bug.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testCodec98NPE_literalMutation2090() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_literalMutation2090");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final ByteArrayInputStream data = new ByteArrayInputStream(codec98);
        final Base64InputStream stream = new Base64InputStream(data);
        final byte[] decodedBytes = Base64TestData.streamToBytes(stream, new byte[2048]);
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64InputStream implementation against the special NPE inducing input identified in the CODEC-98 bug.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testCodec98NPE_literalMutation2091() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_literalMutation2091");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final ByteArrayInputStream data = new ByteArrayInputStream(codec98);
        final Base64InputStream stream = new Base64InputStream(data);
        final byte[] decodedBytes = Base64TestData.streamToBytes(stream, new byte[1023]);
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1644,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping past the end of a stream.
     * 
     * @throws Throwable
     */
@Test
    public void testAvailable() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvailable");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1579,b64stream,1578,b64stream.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1581,b64stream,1580,b64stream.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1583,b64stream,1582,b64stream.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1584,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1586,b64stream,1585,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1587,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1589,b64stream,1588,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1591,b64stream,1590,b64stream.available());
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping past the end of a stream.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testAvailable_add364() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvailable_add364");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1579,b64stream,1578,b64stream.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1581,b64stream,1580,b64stream.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1583,b64stream,1582,b64stream.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1584,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1586,b64stream,1585,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1587,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1589,b64stream,1588,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1591,b64stream,1590,b64stream.available());
        b64stream.close();
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping past the end of a stream.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testAvailable_remove335() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvailable_remove335");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1579,b64stream,1578,b64stream.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1581,b64stream,1580,b64stream.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1583,b64stream,1582,b64stream.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1584,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1586,b64stream,1585,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1587,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1589,b64stream,1588,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1591,b64stream,1590,b64stream.available());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64EmptyInputStreamMimeChuckSize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStreamMimeChuckSize");
        testBase64EmptyInputStream(org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64EmptyInputStreamMimeChuckSize_add367() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStreamMimeChuckSize_add367");
        testBase64EmptyInputStream(org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE);
        testBase64EmptyInputStream(org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64EmptyInputStreamMimeChuckSize_remove338() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStreamMimeChuckSize_remove338");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64EmptyInputStreamPemChuckSize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStreamPemChuckSize");
        testBase64EmptyInputStream(org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64EmptyInputStreamPemChuckSize_add368() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStreamPemChuckSize_add368");
        testBase64EmptyInputStream(org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE);
        testBase64EmptyInputStream(org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64EmptyInputStreamPemChuckSize_remove339() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStreamPemChuckSize_remove339");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase64EmptyInputStream_add365(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStream_add365");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase64EmptyInputStream_add366(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStream_add366");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase64EmptyInputStream(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStream");
        final byte[] emptyEncoded = new byte[1];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase64EmptyInputStream_literalMutation1977(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStream_literalMutation1977");
        final byte[] emptyEncoded = new byte[-1];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase64EmptyInputStream_literalMutation1978(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStream_literalMutation1978");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase64EmptyInputStream_literalMutation1979(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStream_literalMutation1979");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[1];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase64EmptyInputStream_literalMutation1980(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStream_literalMutation1980");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[-1];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase64EmptyInputStream_literalMutation1981(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStream_literalMutation1981");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase64EmptyInputStream_remove336(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStream_remove336");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase64EmptyInputStream_remove337(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStream_remove337");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByChunk_add369() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_add369");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByChunk_add370() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_add370");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByChunk_add371() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_add371");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByChunk_add372() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_add372");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByChunk_add373() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_add373");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1983() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1983");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("bar");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1984() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1984");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(1)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1985() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1985");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(-1)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1986() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1986");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1987() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1987");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("bar", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1988() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1988");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "foo");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1989() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1989");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 1, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1990() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1990");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, -1, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1991() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1991");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1992() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1992");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 1 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1993() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1993");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = -1 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1994() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1994");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1995() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1995");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 151 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1996() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1996");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 149 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1997() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1997");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 75 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1998() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1998");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 300 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation1999() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1999");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, true);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation2000() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation2000");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[2];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation2001() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation2001");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[0];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation2002() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation2002");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[0];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation2003() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation2003");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[1];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation2004() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation2004");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[-1];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation2005() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation2005");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation2006() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation2006");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 1, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation2007() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation2007");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, -1, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByChunk_literalMutation2008() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation2008");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByChunk_remove340() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_remove340");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByChunk_remove341() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_remove341");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByChunk_remove342() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_remove342");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByChunk_remove343() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_remove343");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByChunk_remove344() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_remove344");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByteByByte_add374() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_add374");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByteByByte_add375() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_add375");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByteByByte_add376() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_add376");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByteByByte_add377() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_add377");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByteByByte_add378() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_add378");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2010() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2010");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("bar");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2011() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2011");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(1)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2012() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2012");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(-1)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2013() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2013");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2014() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2014");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("bar", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2015() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2015");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "bar");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2016() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2016");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 1, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2017() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2017");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, -1, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2018() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2018");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2019() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2019");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 1 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2020() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2020");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = -1 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2021() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2021");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2022() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2022");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 151 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2023() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2023");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 149 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2024() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2024");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 75 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2025() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2025");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 300 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2026() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2026");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, true);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2027() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2027");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[2];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2028() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2028");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[0];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2029() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2029");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[0];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2030() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2030");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[1];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2031() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2031");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[-1];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2032() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2032");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2033() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2033");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 1, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2034() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2034");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, -1, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64InputStreamByteByByte_literalMutation2035() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation2035");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByteByByte_remove345() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_remove345");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByteByByte_remove346() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_remove346");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByteByByte_remove347() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_remove347");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByteByByte_remove348() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_remove348");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base64InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64InputStreamByteByByte_remove349() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_remove349");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(singleLine);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 0, LF);
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = Base64TestData.randomData(i, false);
            encoded = randomData[1];
            decoded = randomData[0];
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByChunk(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_add379(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add379");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in.close();
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_add380(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add380");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByChunk_literalMutation2036(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation2036");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , false , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByChunk_literalMutation2037(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation2037");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 1 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByChunk_literalMutation2038(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation2038");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = -1 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByChunk_literalMutation2039(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation2039");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByChunk_literalMutation2040(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation2040");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 9 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByChunk_literalMutation2041(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation2041");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 5 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByChunk_literalMutation2042(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation2042");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 20 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByChunk_literalMutation2043(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation2043");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 11 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByChunk_literalMutation2044(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation2044");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , false , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByChunk_literalMutation2045(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation2045");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , true);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_remove350(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove350");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_remove351(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove351");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1592,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1594,in,1593,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,in,1596,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,null,1598,java.util.Arrays.equals(output, encoded));
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1600,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1602,in,1601,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,in,1604,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,null,1606,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = Base64TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1608,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1610,in,1609,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,in,1612,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,null,1614,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_add381(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add381");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_add382(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add382");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_add383(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add383");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2046(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2046");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , false , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2047(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2047");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 1 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2048(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2048");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = -1 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2049(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2049");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2050(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2050");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 1 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2051(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2051");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = -1 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2052(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2052");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2053(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2053");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 1 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2054(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2054");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = -1 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2055(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2055");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2056(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2056");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 9 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2057(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2057");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 5 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2058(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2058");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 20 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2059(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2059");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 11 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2060(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2060");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , false , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2061(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2061");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , true);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2062(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2062");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 1 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2063(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2063");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = -1 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
private void testByteByByte_literalMutation2064(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation2064");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_remove352(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove352");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_remove353(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove353");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base64 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base64 encoded data.
     * @param separator
     * Line separator in the base64 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base64 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_remove354(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove354");
        InputStream in;
        in = new Base64InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1616,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1618,in,1617,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1620,null,1619,java.util.Arrays.equals(output, encoded));
        in = new Base64InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,in,1622,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1626,in,1625,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1628,null,1627,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base64InputStream(in , true , chunkSize , separator);
            in = new Base64InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,in,1630,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1632,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1634,in,1633,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1636,null,1635,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test(timeout = 1000)
    public void testMarkSupported_add391() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_add391");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation2092() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation2092");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , false , 4 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation2093() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation2093");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 2 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation2094() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation2094");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 8 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation2095() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation2095");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 5 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation2096() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation2096");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 3 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation2097() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation2097");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 1 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation2098() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation2098");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ -1 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation2099() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation2099");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation2100() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation2100");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 1 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation2101() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation2101");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , -1 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation2102() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation2102");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation2103() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation2103");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 1 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation2104() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation2104");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , -1 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation2105() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation2105");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test(timeout = 1000)
    public void testMarkSupported_remove360() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_remove360");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1648,in,1647,in.markSupported());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test(timeout = 1000)
    public void testRead0_add392() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_add392");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2106() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2106");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1025];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2107() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2107");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[512];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2108() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2108");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[2048];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2109() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2109");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1023];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2110() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2110");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 1;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2111() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2111");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = -1;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2112() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2112");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2113() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2113");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , false , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2114() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2114");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 2 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2115() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2115");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 8 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2116() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2116");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 5 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2117() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2117");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 3 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2118() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2118");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 1 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2119() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2119");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ -1 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2120() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2120");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2121() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2121");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 1 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2122() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2122");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , -1 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2123() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2123");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2124() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2124");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 1 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2125() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2125");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , -1 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2126() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2126");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2127() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2127");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 1, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2128() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2128");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, -1, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2129() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2129");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2130() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2130");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2131() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2131");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, -1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation2132() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation2132");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test(timeout = 1000)
    public void testRead0_remove361() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_remove361");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,bytesRead);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testReadNull_add393() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_add393");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 0);
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testReadNull_add394() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_add394");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2133() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2133");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , false , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2134() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2134");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 2 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2135() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2135");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 8 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2136() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2136");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 5 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2137() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2137");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 3 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2138() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2138");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 1 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2139() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2139");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ -1 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2140() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2140");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2141() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2141");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 1 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2142() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2142");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , -1 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2143() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2143");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2144() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2144");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 1 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2145() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2145");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , -1 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2146() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2146");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2148() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2148");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 1, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2149() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2149");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, -1, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2150() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2150");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2151() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2151");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 1);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2152() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2152");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, -1);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testReadNull_literalMutation2153() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation2153");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testReadNull_remove362() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_remove362");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test(timeout = 1000)
    public void testReadOutOfBounds_add395() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_add395");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test(timeout = 1000)
    public void testReadOutOfBounds_add396() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_add396");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test(timeout = 1000)
    public void testReadOutOfBounds_add397() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_add397");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test(timeout = 1000)
    public void testReadOutOfBounds_add398() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_add398");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test(timeout = 1000)
    public void testReadOutOfBounds_add399() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_add399");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2154() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2154");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1025];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2155() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2155");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[512];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2156() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2156");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[2048];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2157() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2157");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1023];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2158() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2158");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , false , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2159() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2159");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 2 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2160() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2160");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 8 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2161() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2161");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 5 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2162() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2162");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 3 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2163() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2163");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 1 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2164() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2164");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ -1 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2165() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2165");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2166() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2166");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 1 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2167() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2167");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , -1 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2168() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2168");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2169() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2169");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 1 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2170() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2170");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , -1 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2171() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2171");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2172() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2172");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2173() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2173");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 0, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2174() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2174");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 0, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2175() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2175");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2176() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2176");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2177() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2177");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2178() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2178");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 1, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2179() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2179");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, -1, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2180() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2180");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2181() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2181");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, -2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2182() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2182");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2183() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2183");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2184() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2184");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 2), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2185() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2185");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 0), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2186() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2186");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 0), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2187() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2187");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2188() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2188");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), -1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2189() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2189");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2190() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2190");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 2), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2191() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2191");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 0), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2192() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2192");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 0), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2193() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2193");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 1);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2194() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2194");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 4);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation2195() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation2195");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 3);
        } catch (final IndexOutOfBoundsException e) {
        }
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test(timeout = 1000)
    public void testReadOutOfBounds_remove363() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_remove363");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, 2, 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, 0, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            in.read(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping number of characters larger than the internal buffer.
     * 
     * @throws Throwable
     */
@Test
    public void testSkipBig() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipBig");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,b64stream,1650,b64stream.skip(java.lang.Integer.MAX_VALUE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1652,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1654,b64stream,1653,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,b64stream,1656,b64stream.read());
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping number of characters larger than the internal buffer.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipBig_add400() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipBig_add400");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,b64stream,1650,b64stream.skip(java.lang.Integer.MAX_VALUE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1652,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1654,b64stream,1653,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,b64stream,1656,b64stream.read());
        b64stream.close();
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping number of characters larger than the internal buffer.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipBig_remove364() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipBig_remove364");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,b64stream,1650,b64stream.skip(java.lang.Integer.MAX_VALUE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1652,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1654,b64stream,1653,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,b64stream,1656,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test
    public void testSkipNone() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,b64stream,1658,b64stream.skip(0));
        b64stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,new byte[]{ 0 , 0 , 0 , ((byte)(255)) , ((byte)(255)) , ((byte)(255)) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,b64stream,1663,b64stream.read());
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipNone_add401() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_add401");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,b64stream,1658,b64stream.skip(0));
        b64stream.read(actualBytes, 0, actualBytes.length);
        b64stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,new byte[]{ 0 , 0 , 0 , ((byte)(255)) , ((byte)(255)) , ((byte)(255)) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,b64stream,1663,b64stream.read());
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipNone_add402() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_add402");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,b64stream,1658,b64stream.skip(0));
        b64stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,new byte[]{ 0 , 0 , 0 , ((byte)(255)) , ((byte)(255)) , ((byte)(255)) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,b64stream,1663,b64stream.read());
        b64stream.close();
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test
    public void testSkipNone_literalMutation2196() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation2196");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        final byte[] actualBytes = new byte[5];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,b64stream,1658,b64stream.skip(0));
        b64stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,new byte[]{ 0 , 0 , 0 , ((byte)(255)) , ((byte)(255)) , ((byte)(255)) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,b64stream,1663,b64stream.read());
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test
    public void testSkipNone_literalMutation2197() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation2197");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        final byte[] actualBytes = new byte[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,b64stream,1658,b64stream.skip(0));
        b64stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,new byte[]{ 0 , 0 , 0 , ((byte)(255)) , ((byte)(255)) , ((byte)(255)) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,b64stream,1663,b64stream.read());
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test
    public void testSkipNone_literalMutation2198() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation2198");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        final byte[] actualBytes = new byte[12];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,b64stream,1658,b64stream.skip(0));
        b64stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,new byte[]{ 0 , 0 , 0 , ((byte)(255)) , ((byte)(255)) , ((byte)(255)) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,b64stream,1663,b64stream.read());
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test
    public void testSkipNone_literalMutation2199() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation2199");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        final byte[] actualBytes = new byte[7];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,b64stream,1658,b64stream.skip(0));
        b64stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,new byte[]{ 0 , 0 , 0 , ((byte)(255)) , ((byte)(255)) , ((byte)(255)) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,b64stream,1663,b64stream.read());
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test
    public void testSkipNone_literalMutation2200() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation2200");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,b64stream,1658,b64stream.skip(0));
        b64stream.read(actualBytes, 1, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,new byte[]{ 0 , 0 , 0 , ((byte)(255)) , ((byte)(255)) , ((byte)(255)) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,b64stream,1663,b64stream.read());
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test
    public void testSkipNone_literalMutation2201() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation2201");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,b64stream,1658,b64stream.skip(0));
        b64stream.read(actualBytes, -1, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,new byte[]{ 0 , 0 , 0 , ((byte)(255)) , ((byte)(255)) , ((byte)(255)) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,b64stream,1663,b64stream.read());
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test
    public void testSkipNone_literalMutation2202() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation2202");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,b64stream,1658,b64stream.skip(0));
        b64stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,new byte[]{ 0 , 0 , 0 , ((byte)(255)) , ((byte)(255)) , ((byte)(255)) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,b64stream,1663,b64stream.read());
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipNone_remove365() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_remove365");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,b64stream,1658,b64stream.skip(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,new byte[]{ 0 , 0 , 0 , ((byte)(255)) , ((byte)(255)) , ((byte)(255)) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,b64stream,1663,b64stream.read());
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipNone_remove366() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_remove366");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,b64stream,1658,b64stream.skip(0));
        b64stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1660,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,new byte[]{ 0 , 0 , 0 , ((byte)(255)) , ((byte)(255)) , ((byte)(255)) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1662,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,b64stream,1663,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping past the end of a stream.
     * 
     * @throws Throwable
     */
@Test
    public void testSkipPastEnd() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipPastEnd");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,b64stream,1665,b64stream.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,b64stream,1668,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1670,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1672,b64stream,1671,b64stream.read());
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping past the end of a stream.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipPastEnd_add403() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipPastEnd_add403");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,b64stream,1665,b64stream.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,b64stream,1668,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1670,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1672,b64stream,1671,b64stream.read());
        b64stream.close();
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping past the end of a stream.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipPastEnd_remove367() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipPastEnd_remove367");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1666,b64stream,1665,b64stream.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,b64stream,1668,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1670,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1672,b64stream,1671,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping to the end of a stream.
     * 
     * @throws Throwable
     */
@Test
    public void testSkipToEnd() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipToEnd");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1674,b64stream,1673,b64stream.skip(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,b64stream,1676,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1678,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1680,b64stream,1679,b64stream.read());
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping to the end of a stream.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipToEnd_add404() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipToEnd_add404");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1674,b64stream,1673,b64stream.skip(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,b64stream,1676,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1678,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1680,b64stream,1679,b64stream.read());
        b64stream.close();
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping to the end of a stream.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipToEnd_remove368() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipToEnd_remove368");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1674,b64stream,1673,b64stream.skip(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,b64stream,1676,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1678,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1680,b64stream,1679,b64stream.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class)
    public void testSkipWrongArgument() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        b64stream.skip(9);
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSkipWrongArgument_add405() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_add405");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        b64stream.skip(9);
        b64stream.skip(9);
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSkipWrongArgument_add406() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_add406");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        b64stream.skip(9);
        b64stream.close();
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class)
    public void testSkipWrongArgument_literalMutation2203() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_literalMutation2203");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        b64stream.skip(-9);
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class)
    public void testSkipWrongArgument_literalMutation2204() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_literalMutation2204");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        b64stream.skip(5);
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class)
    public void testSkipWrongArgument_literalMutation2205() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_literalMutation2205");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        b64stream.skip(20);
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class)
    public void testSkipWrongArgument_literalMutation2206() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_literalMutation2206");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        b64stream.skip(11);
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSkipWrongArgument_remove369() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_remove369");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        b64stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSkipWrongArgument_remove370() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_remove370");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_B64));
        final Base64InputStream b64stream = new Base64InputStream(ins);
        b64stream.skip(9);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

