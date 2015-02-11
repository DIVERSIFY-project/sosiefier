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
    public void testCodec130_literalMutation1631() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation1631");
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
    public void testCodec130_literalMutation1632() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation1632");
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
    public void testCodec105_literalMutation1626() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation1626");
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
    public void testCodec105_literalMutation1627() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation1627");
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
    public void testCodec105_literalMutation1629() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation1629");
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
    public void testCodec105_literalMutation1630() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation1630");
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
@Test(timeout = 1000)
    public void testBase64EmptyInputStreamMimeChuckSize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStreamMimeChuckSize");
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
@Test(timeout = 1000)
    public void testBase64EmptyInputStreamPemChuckSize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStreamPemChuckSize");
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

    private void testBase64EmptyInputStream_literalMutation1587(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyInputStream_literalMutation1587");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[1];
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
    public void testBase64InputStreamByChunk_literalMutation1589() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1589");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
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
    public void testBase64InputStreamByChunk_literalMutation1590() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1590");
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
    public void testBase64InputStreamByChunk_literalMutation1591() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1591");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByChunk(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("foo", "");
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
    public void testBase64InputStreamByChunk_literalMutation1592() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1592");
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
    public void testBase64InputStreamByChunk_literalMutation1593() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1593");
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
    public void testBase64InputStreamByChunk_literalMutation1594() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1594");
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
    public void testBase64InputStreamByChunk_literalMutation1595() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1595");
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
    public void testBase64InputStreamByChunk_literalMutation1596() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1596");
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
    public void testBase64InputStreamByChunk_literalMutation1597() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1597");
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
    public void testBase64InputStreamByChunk_literalMutation1598() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1598");
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
    public void testBase64InputStreamByChunk_literalMutation1599() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByChunk_literalMutation1599");
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
    public void testBase64InputStreamByteByByte_literalMutation1601() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation1601");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
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
    public void testBase64InputStreamByteByByte_literalMutation1602() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation1602");
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
    public void testBase64InputStreamByteByByte_literalMutation1603() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation1603");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("foo", "");
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
    public void testBase64InputStreamByteByByte_literalMutation1604() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation1604");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, LF);
        final String singleLine = Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "foo");
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
    public void testBase64InputStreamByteByByte_literalMutation1605() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation1605");
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
    public void testBase64InputStreamByteByByte_literalMutation1606() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation1606");
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
    public void testBase64InputStreamByteByByte_literalMutation1607() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation1607");
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
    public void testBase64InputStreamByteByByte_literalMutation1608() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation1608");
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
    public void testBase64InputStreamByteByByte_literalMutation1609() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation1609");
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
    public void testBase64InputStreamByteByByte_literalMutation1610() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation1610");
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
    public void testBase64InputStreamByteByByte_literalMutation1611() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64InputStreamByteByByte_literalMutation1611");
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
private void testByChunk_literalMutation1612(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1612");
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
private void testByChunk_literalMutation1613(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1613");
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
private void testByChunk_literalMutation1614(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1614");
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
private void testByChunk_literalMutation1615(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1615");
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
private void testByChunk_literalMutation1616(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1616");
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
private void testByteByByte_literalMutation1617(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1617");
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
private void testByteByByte_literalMutation1618(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1618");
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
private void testByteByByte_literalMutation1619(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1619");
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
private void testByteByByte_literalMutation1620(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1620");
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
private void testByteByByte_literalMutation1621(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1621");
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
private void testByteByByte_literalMutation1622(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1622");
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
private void testByteByByte_literalMutation1623(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1623");
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
private void testByteByByte_literalMutation1624(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1624");
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
    public void testMarkSupported_literalMutation1634() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1634");
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
    public void testMarkSupported_literalMutation1635() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1635");
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
    public void testMarkSupported_literalMutation1636() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1636");
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
    public void testMarkSupported_literalMutation1637() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1637");
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
    public void testMarkSupported_literalMutation1638() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1638");
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
    public void testRead0_literalMutation1639() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1639");
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
    public void testRead0_literalMutation1640() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1640");
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
    public void testRead0_literalMutation1641() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1641");
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
    public void testRead0_literalMutation1642() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1642");
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
    public void testRead0_literalMutation1643() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1643");
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
    public void testRead0_literalMutation1644() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1644");
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
    public void testRead0_literalMutation1645() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1645");
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
    public void testRead0_literalMutation1646() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1646");
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
    public void testRead0_literalMutation1647() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1647");
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
    public void testReadNull_literalMutation1648() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1648");
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
    public void testReadNull_literalMutation1649() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1649");
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
    public void testReadNull_literalMutation1650() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1650");
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
    public void testReadNull_literalMutation1651() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1651");
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
    public void testReadNull_literalMutation1652() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1652");
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
    public void testReadNull_literalMutation1654() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1654");
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
    public void testReadNull_literalMutation1655() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1655");
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
@Test(timeout = 1000)
    public void testReadOutOfBounds_add395() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_add395");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
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
@Test(timeout = 1000)
    public void testReadOutOfBounds_add396() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_add396");
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
@Test(timeout = 1000)
    public void testReadOutOfBounds_add397() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_add397");
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
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read throwing IndexOutOfBoundsException
     * 
     * @throws Exception
     */
@Test
    public void testReadOutOfBounds_literalMutation1656() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1656");
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
    public void testReadOutOfBounds_literalMutation1657() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1657");
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
    public void testReadOutOfBounds_literalMutation1658() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1658");
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
    public void testReadOutOfBounds_literalMutation1659() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1659");
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
    public void testReadOutOfBounds_literalMutation1660() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1660");
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
    public void testReadOutOfBounds_literalMutation1661() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1661");
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
    public void testReadOutOfBounds_literalMutation1662() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1662");
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
    public void testReadOutOfBounds_literalMutation1663() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1663");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 1);
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
    public void testReadOutOfBounds_literalMutation1664() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1664");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
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
    public void testReadOutOfBounds_literalMutation1665() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1665");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base64InputStream in = new Base64InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        try {
            in.read(buf, -1, 0);
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
    public void testReadOutOfBounds_literalMutation1666() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1666");
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
    public void testReadOutOfBounds_literalMutation1667() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1667");
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
    public void testReadOutOfBounds_literalMutation1668() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1668");
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
    public void testReadOutOfBounds_literalMutation1669() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1669");
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
    public void testSkipNone_literalMutation1670() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation1670");
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
    public void testSkipNone_literalMutation1671() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation1671");
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
        b64stream.skip(-10);
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
        b64stream.skip(-10);
        b64stream.skip(-10);
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
        b64stream.skip(-10);
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
    public void testSkipWrongArgument_literalMutation1672() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_literalMutation1672");
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
        b64stream.skip(-10);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

