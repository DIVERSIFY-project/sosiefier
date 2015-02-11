package org.apache.commons.codec.binary;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.junit.Test;

/** 
 * @version $Id $
 * @since 1.4
 */
public class Base64OutputStreamTest {
    private static final byte[] CRLF = new byte[]{ ((byte)('\r')) , ((byte)('\n')) };

    private static final byte[] LF = new byte[]{ ((byte)('\n')) };

    private static final String STRING_FIXTURE = "Hello World";

    /** 
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     * 
     * @throws Exception for some failure scenarios.
     */
@Test
    public void testCodec98NPE() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final byte[] codec98_1024 = new byte[1024];
        java.lang.System.arraycopy(codec98, 0, codec98_1024, 0, codec98.length);
        final ByteArrayOutputStream data = new ByteArrayOutputStream(1024);
        final Base64OutputStream stream = new Base64OutputStream(data , false);
        stream.write(codec98_1024, 0, 1024);
        stream.close();
        final byte[] decodedBytes = data.toByteArray();
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     * 
     * @throws Exception for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testCodec98NPE_add436() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_add436");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final byte[] codec98_1024 = new byte[1024];
        java.lang.System.arraycopy(codec98, 0, codec98_1024, 0, codec98.length);
        java.lang.System.arraycopy(codec98, 0, codec98_1024, 0, codec98.length);
        final ByteArrayOutputStream data = new ByteArrayOutputStream(1024);
        final Base64OutputStream stream = new Base64OutputStream(data , false);
        stream.write(codec98_1024, 0, 1024);
        stream.close();
        final byte[] decodedBytes = data.toByteArray();
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     * 
     * @throws Exception for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testCodec98NPE_add437() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_add437");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final byte[] codec98_1024 = new byte[1024];
        java.lang.System.arraycopy(codec98, 0, codec98_1024, 0, codec98.length);
        final ByteArrayOutputStream data = new ByteArrayOutputStream(1024);
        final Base64OutputStream stream = new Base64OutputStream(data , false);
        stream.write(codec98_1024, 0, 1024);
        stream.write(codec98_1024, 0, 1024);
        stream.close();
        final byte[] decodedBytes = data.toByteArray();
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     * 
     * @throws Exception for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testCodec98NPE_add438() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_add438");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final byte[] codec98_1024 = new byte[1024];
        java.lang.System.arraycopy(codec98, 0, codec98_1024, 0, codec98.length);
        final ByteArrayOutputStream data = new ByteArrayOutputStream(1024);
        final Base64OutputStream stream = new Base64OutputStream(data , false);
        stream.write(codec98_1024, 0, 1024);
        stream.close();
        stream.close();
        final byte[] decodedBytes = data.toByteArray();
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     * 
     * @throws Exception for some failure scenarios.
     */
@Test
    public void testCodec98NPE_literalMutation1715() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_literalMutation1715");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final byte[] codec98_1024 = new byte[1023];
        java.lang.System.arraycopy(codec98, 0, codec98_1024, 0, codec98.length);
        final ByteArrayOutputStream data = new ByteArrayOutputStream(1024);
        final Base64OutputStream stream = new Base64OutputStream(data , false);
        stream.write(codec98_1024, 0, 1024);
        stream.close();
        final byte[] decodedBytes = data.toByteArray();
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     * 
     * @throws Exception for some failure scenarios.
     */
@Test
    public void testCodec98NPE_literalMutation1716() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_literalMutation1716");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final byte[] codec98_1024 = new byte[1024];
        java.lang.System.arraycopy(codec98, 1, codec98_1024, 0, codec98.length);
        final ByteArrayOutputStream data = new ByteArrayOutputStream(1024);
        final Base64OutputStream stream = new Base64OutputStream(data , false);
        stream.write(codec98_1024, 0, 1024);
        stream.close();
        final byte[] decodedBytes = data.toByteArray();
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     * 
     * @throws Exception for some failure scenarios.
     */
@Test
    public void testCodec98NPE_literalMutation1717() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_literalMutation1717");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final byte[] codec98_1024 = new byte[1024];
        java.lang.System.arraycopy(codec98, 0, codec98_1024, 1, codec98.length);
        final ByteArrayOutputStream data = new ByteArrayOutputStream(1024);
        final Base64OutputStream stream = new Base64OutputStream(data , false);
        stream.write(codec98_1024, 0, 1024);
        stream.close();
        final byte[] decodedBytes = data.toByteArray();
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     * 
     * @throws Exception for some failure scenarios.
     */
@Test
    public void testCodec98NPE_literalMutation1718() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_literalMutation1718");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final byte[] codec98_1024 = new byte[1024];
        java.lang.System.arraycopy(codec98, 0, codec98_1024, 0, codec98.length);
        final ByteArrayOutputStream data = new ByteArrayOutputStream(1023);
        final Base64OutputStream stream = new Base64OutputStream(data , false);
        stream.write(codec98_1024, 0, 1024);
        stream.close();
        final byte[] decodedBytes = data.toByteArray();
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     * 
     * @throws Exception for some failure scenarios.
     */
@Test
    public void testCodec98NPE_literalMutation1719() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_literalMutation1719");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final byte[] codec98_1024 = new byte[1024];
        java.lang.System.arraycopy(codec98, 0, codec98_1024, 0, codec98.length);
        final ByteArrayOutputStream data = new ByteArrayOutputStream(1024);
        final Base64OutputStream stream = new Base64OutputStream(data , true);
        stream.write(codec98_1024, 0, 1024);
        stream.close();
        final byte[] decodedBytes = data.toByteArray();
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     * 
     * @throws Exception for some failure scenarios.
     */
@Test
    public void testCodec98NPE_literalMutation1720() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_literalMutation1720");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final byte[] codec98_1024 = new byte[1024];
        java.lang.System.arraycopy(codec98, 0, codec98_1024, 0, codec98.length);
        final ByteArrayOutputStream data = new ByteArrayOutputStream(1024);
        final Base64OutputStream stream = new Base64OutputStream(data , false);
        stream.write(codec98_1024, 1, 1024);
        stream.close();
        final byte[] decodedBytes = data.toByteArray();
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     * 
     * @throws Exception for some failure scenarios.
     */
@Test
    public void testCodec98NPE_literalMutation1721() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_literalMutation1721");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final byte[] codec98_1024 = new byte[1024];
        java.lang.System.arraycopy(codec98, 0, codec98_1024, 0, codec98.length);
        final ByteArrayOutputStream data = new ByteArrayOutputStream(1024);
        final Base64OutputStream stream = new Base64OutputStream(data , false);
        stream.write(codec98_1024, 0, 1023);
        stream.close();
        final byte[] decodedBytes = data.toByteArray();
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     * 
     * @throws Exception for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testCodec98NPE_remove400() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_remove400");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final byte[] codec98_1024 = new byte[1024];
        final ByteArrayOutputStream data = new ByteArrayOutputStream(1024);
        final Base64OutputStream stream = new Base64OutputStream(data , false);
        stream.write(codec98_1024, 0, 1024);
        stream.close();
        final byte[] decodedBytes = data.toByteArray();
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     * 
     * @throws Exception for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testCodec98NPE_remove401() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_remove401");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final byte[] codec98_1024 = new byte[1024];
        java.lang.System.arraycopy(codec98, 0, codec98_1024, 0, codec98.length);
        final ByteArrayOutputStream data = new ByteArrayOutputStream(1024);
        final Base64OutputStream stream = new Base64OutputStream(data , false);
        stream.close();
        final byte[] decodedBytes = data.toByteArray();
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     * 
     * @throws Exception for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testCodec98NPE_remove402() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec98NPE_remove402");
        final byte[] codec98 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.CODEC_98_NPE);
        final byte[] codec98_1024 = new byte[1024];
        java.lang.System.arraycopy(codec98, 0, codec98_1024, 0, codec98.length);
        final ByteArrayOutputStream data = new ByteArrayOutputStream(1024);
        final Base64OutputStream stream = new Base64OutputStream(data , false);
        stream.write(codec98_1024, 0, 1024);
        final byte[] decodedBytes = data.toByteArray();
        final String decoded = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,decoded);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64EmptyOutputStreamMimeChunkSize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyOutputStreamMimeChunkSize");
        testBase64EmptyOutputStream(org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE);
        testBase64EmptyOutputStream(org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64EmptyOutputStreamMimeChunkSize_remove373() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyOutputStreamMimeChunkSize_remove373");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64EmptyOutputStreamPemChunkSize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyOutputStreamPemChunkSize");
        testBase64EmptyOutputStream(org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE);
        testBase64EmptyOutputStream(org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64EmptyOutputStreamPemChunkSize_remove374() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyOutputStreamPemChunkSize_remove374");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase64EmptyOutputStream_add407(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyOutputStream_add407");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase64EmptyOutputStream_add408(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyOutputStream_add408");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase64EmptyOutputStream(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyOutputStream");
        final byte[] emptyEncoded = new byte[1];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase64EmptyOutputStream_literalMutation1674(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyOutputStream_literalMutation1674");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[1];
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase64EmptyOutputStream_remove371(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyOutputStream_remove371");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase64EmptyOutputStream_remove372(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64EmptyOutputStream_remove372");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByChunk_add411() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_add411");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByChunk_add412() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_add412");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByChunk_add413() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_add413");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByChunk_add414() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_add414");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByChunk_add415() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_add415");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByChunk() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByChunk_literalMutation1676() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_literalMutation1676");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByChunk_literalMutation1677() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_literalMutation1677");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByChunk_literalMutation1678() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_literalMutation1678");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByChunk_literalMutation1679() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_literalMutation1679");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByChunk_literalMutation1680() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_literalMutation1680");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByChunk_literalMutation1681() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_literalMutation1681");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByChunk_literalMutation1682() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_literalMutation1682");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByChunk_literalMutation1683() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_literalMutation1683");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByChunk_literalMutation1684() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_literalMutation1684");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByChunk_literalMutation1685() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_literalMutation1685");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByChunk_literalMutation1686() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_literalMutation1686");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByChunk_remove375() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_remove375");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByChunk_remove376() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_remove376");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByChunk_remove377() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_remove377");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByChunk_remove378() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_remove378");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByChunk_remove379() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByChunk_remove379");
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByteByByte_add416() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_add416");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByteByByte_add417() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_add417");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByteByByte_add418() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_add418");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByteByByte_add419() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_add419");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByteByByte_add420() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_add420");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte_literalMutation1688() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_literalMutation1688");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 77, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte_literalMutation1689() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_literalMutation1689");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte_literalMutation1690() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_literalMutation1690");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(1)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte_literalMutation1691() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_literalMutation1691");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 75, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte_literalMutation1692() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_literalMutation1692");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 65, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte_literalMutation1693() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_literalMutation1693");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte_literalMutation1694() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_literalMutation1694");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte_literalMutation1695() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_literalMutation1695");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte_literalMutation1696() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_literalMutation1696");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte_literalMutation1697() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_literalMutation1697");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte_literalMutation1698() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_literalMutation1698");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte_literalMutation1699() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_literalMutation1699");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte_literalMutation1700() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_literalMutation1700");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase64OutputStreamByteByByte_literalMutation1701() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_literalMutation1701");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByteByByte_remove380() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_remove380");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByteByByte_remove381() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_remove381");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByteByByte_remove382() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_remove382");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByteByByte_remove383() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_remove383");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test the Base64OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase64OutputStreamByteByByte_remove384() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase64OutputStreamByteByByte_remove384");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n");
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, 76, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(Base64TestData.ENCODED_64_CHARS_PER_LINE);
        decoded = Base64TestData.DECODED;
        testByteByByte(encoded, decoded, 64, LF);
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
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByChunk_add421(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add421");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByChunk_add422(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add422");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByChunk_add423(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add423");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByChunk_add424(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add424");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByChunk_add425(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add425");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByChunk_add426(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add426");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
private void testByChunk_literalMutation1702(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1702");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , false , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
private void testByChunk_literalMutation1703(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1703");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , true);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
private void testByChunk_literalMutation1704(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1704");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = -1 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
private void testByChunk_literalMutation1705(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1705");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 9 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
private void testByChunk_literalMutation1706(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1706");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
private void testByChunk_literalMutation1707(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1707");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByChunk_remove385(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove385");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByChunk_remove386(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove386");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByChunk_remove387(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove387");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByChunk_remove388(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove388");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByChunk_remove389(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove389");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByChunk_remove390(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove390");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,null,1681,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,null,1683,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,null,1685,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_add427(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add427");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_add428(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add428");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_add429(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add429");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_add430(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add430");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_add431(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add431");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_add432(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add432");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_add433(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add433");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_add434(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add434");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_add435(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add435");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
private void testByteByByte_literalMutation1708(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1708");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
private void testByteByByte_literalMutation1709(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1709");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
private void testByteByByte_literalMutation1710(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1710");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
private void testByteByByte_literalMutation1711(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1711");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 1 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
private void testByteByByte_literalMutation1712(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1712");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 9 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
private void testByteByByte_literalMutation1713(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1713");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
private void testByteByByte_literalMutation1714(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1714");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_remove391(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove391");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_remove392(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove392");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_remove393(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove393");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_remove394(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove394");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_remove395(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove395");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_remove396(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove396");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_remove397(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove397");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_remove398(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove398");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
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
    private void testByteByByte_remove399(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove399");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base64OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,null,1687,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base64OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,null,1689,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base64OutputStream(out , false);
            out = new Base64OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,null,1691,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteOutOfBounds_add439() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_add439");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 1);
            out.write(buf, -1, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteOutOfBounds_add440() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_add440");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -1);
            out.write(buf, 1, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteOutOfBounds_add441() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_add441");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteOutOfBounds_add442() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_add442");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 2);
            out.write(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteOutOfBounds_add443() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_add443");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1722() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1722");
        final byte[] buf = new byte[1023];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1723() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1723");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1724() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1724");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1725() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1725");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 0, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1726() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1726");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1727() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1727");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 2), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1728() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1728");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1729() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1729");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 0), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1730() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1730");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteOutOfBounds_remove403() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_remove403");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(buf, -1, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write(null).
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteToNullCoverage() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteToNullCoverage");
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(null, 0, 0);
        } catch (final NullPointerException e) {
        } finally {
            out.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write(null).
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteToNullCoverage_add444() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteToNullCoverage_add444");
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(null, 0, 0);
            out.write(null, 0, 0);
        } catch (final NullPointerException e) {
        } finally {
            out.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write(null).
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteToNullCoverage_add445() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteToNullCoverage_add445");
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(null, 0, 0);
        } catch (final NullPointerException e) {
        } finally {
            out.close();
            out.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write(null).
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteToNullCoverage_literalMutation1732() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteToNullCoverage_literalMutation1732");
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(null, 1, 0);
        } catch (final NullPointerException e) {
        } finally {
            out.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base64OutputStream.write(null).
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteToNullCoverage_literalMutation1733() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteToNullCoverage_literalMutation1733");
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base64OutputStream out = new Base64OutputStream(bout);
        try {
            out.write(null, 0, 1);
        } catch (final NullPointerException e) {
        } finally {
            out.close();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

