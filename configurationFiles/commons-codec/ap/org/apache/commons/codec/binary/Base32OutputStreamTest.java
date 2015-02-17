package org.apache.commons.codec.binary;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.junit.Test;

public class Base32OutputStreamTest {
    private static final byte[] CRLF = new byte[]{ ((byte)('\r')) , ((byte)('\n')) };

    private static final byte[] LF = new byte[]{ ((byte)('\n')) };

    /** 
     * Test the Base32OutputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32EmptyOutputStreamMimeChunkSize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStreamMimeChunkSize");
        testBase32EmptyOutputStream(BaseNCodec.MIME_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32EmptyOutputStreamMimeChunkSize_add333() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStreamMimeChunkSize_add333");
        testBase32EmptyOutputStream(BaseNCodec.MIME_CHUNK_SIZE);
        testBase32EmptyOutputStream(BaseNCodec.MIME_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32EmptyOutputStreamMimeChunkSize_remove309() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStreamMimeChunkSize_remove309");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32EmptyOutputStreamPemChunkSize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStreamPemChunkSize");
        testBase32EmptyOutputStream(BaseNCodec.PEM_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32EmptyOutputStreamPemChunkSize_add334() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStreamPemChunkSize_add334");
        testBase32EmptyOutputStream(BaseNCodec.PEM_CHUNK_SIZE);
        testBase32EmptyOutputStream(BaseNCodec.PEM_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32EmptyOutputStreamPemChunkSize_remove310() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStreamPemChunkSize_remove310");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase32EmptyOutputStream_add331(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStream_add331");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase32EmptyOutputStream_add332(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStream_add332");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase32EmptyOutputStream(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStream");
        final byte[] emptyEncoded = new byte[1];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase32EmptyOutputStream_literalMutation1784(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStream_literalMutation1784");
        final byte[] emptyEncoded = new byte[-1];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase32EmptyOutputStream_literalMutation1785(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStream_literalMutation1785");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase32EmptyOutputStream_literalMutation1786(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStream_literalMutation1786");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[1];
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase32EmptyOutputStream_literalMutation1787(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStream_literalMutation1787");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[-1];
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase32EmptyOutputStream_literalMutation1788(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStream_literalMutation1788");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase32EmptyOutputStream_remove307(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStream_remove307");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByChunk(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase32EmptyOutputStream_remove308(final int chunkSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyOutputStream_remove308");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chunkSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32OutputStreamByChunk_add335() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_add335");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32OutputStreamByChunk_add336() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_add336");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 1 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1790() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1790");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = -1 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1791() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1791");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1792() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1792");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 151 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1793() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1793");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 149 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1794() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1794");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 75 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1795() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1795");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 300 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1796() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1796");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[2];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1797() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1797");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[0];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1798() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1798");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[0];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1799() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1799");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[1];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1800() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1800");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[-1];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1801() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1801");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1802() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1802");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 1, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1803() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1803");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, -1, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByChunk_literalMutation1804() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_literalMutation1804");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32OutputStreamByChunk_remove311() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_remove311");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByChunk(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32OutputStreamByChunk_remove312() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByChunk_remove312");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32OutputStreamByteByByte_add337() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_add337");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32OutputStreamByteByByte_add338() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_add338");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 75, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1806() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1806");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 77, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1807() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1807");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 38, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1808() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1808");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 152, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1809() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1809");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 1 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1810() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1810");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = -1 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1811() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1811");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1812() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1812");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 151 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1813() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1813");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 149 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1814() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1814");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 75 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1815() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1815");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 300 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1816() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1816");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[2];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1817() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1817");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[0];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1818() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1818");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[0];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1819() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1819");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[1];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1820() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1820");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[-1];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1821() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1821");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1822() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1822");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 1, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1823() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1823");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, -1, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32OutputStreamByteByByte_literalMutation1824() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_literalMutation1824");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32OutputStreamByteByByte_remove313() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_remove313");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
            testByteByByte(encoded, decoded, 0, LF);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the Base32OutputStream implementation
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32OutputStreamByteByByte_remove314() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32OutputStreamByteByByte_remove314");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, 76, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_add339(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add339");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_add340(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add340");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_add341(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add341");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_add342(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add342");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_add343(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add343");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_add344(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add344");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1825(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1825");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , false , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1826(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1826");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , true);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1827(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1827");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 1 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1828(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1828");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = -1 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1829(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1829");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1830(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1830");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 9 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1831(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1831");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 5 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1832(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1832");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 20 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1833(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1833");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 11 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1834(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1834");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , true);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1835(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1835");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , false , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_remove315(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove315");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_remove316(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove316");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_remove317(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove317");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_remove318(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove318");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_remove319(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove319");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_remove320(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove320");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        out.write(decoded);
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,null,1527,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        out.write(encoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1530,null,1529,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        out.write(decoded);
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,null,1531,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_add345(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add345");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_add346(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add346");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_add347(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add347");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_add348(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add348");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_add349(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add349");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_add350(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add350");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_add351(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add351");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_add352(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add352");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_add353(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add353");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1836(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1836");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , false , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1837(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1837");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , true);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1838(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1838");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , true);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1839(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1839");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 1 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1840(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1840");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = -1 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1841(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1841");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1842(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1842");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 9 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1843(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1843");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 5 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1844(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1844");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 20 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1845(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1845");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 11 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1846(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1846");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , true);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1847(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1847");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , false , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_remove321(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove321");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_remove322(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove322");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_remove323(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove323");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_remove324(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove324");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_remove325(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove325");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_remove326(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove326");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_remove327(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove327");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_remove328(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove328");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     * 
     * @param encoded
     * Base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * Line separator in the Base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_remove329(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove329");
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        OutputStream out = new Base32OutputStream(byteOut , true , chunkSize , separator);
        for (final byte element : decoded) {
            out.write(element);
        }
        byte[] output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,null,1533,java.util.Arrays.equals(output, encoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,null,1535,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = new Base32OutputStream(byteOut , false);
        for (final byte element : encoded) {
            out.write(element);
            out.flush();
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,null,1537,java.util.Arrays.equals(output, decoded));
        byteOut = new ByteArrayOutputStream();
        out = byteOut;
        for (int i = 0 ; i < 10 ; i++) {
            out = new Base32OutputStream(out , false);
            out = new Base32OutputStream(out , true , chunkSize , separator);
        }
        for (final byte element : decoded) {
            out.write(element);
        }
        out.close();
        output = byteOut.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,null,1539,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteOutOfBounds_add354() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_add354");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteOutOfBounds_add355() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_add355");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
            out.write(buf, 1, 2);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteOutOfBounds_add356() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_add356");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteOutOfBounds_add357() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_add357");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteOutOfBounds_add358() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_add358");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds");
        final byte[] buf = new byte[1025];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1849() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1849");
        final byte[] buf = new byte[512];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1850() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1850");
        final byte[] buf = new byte[2048];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1851() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1851");
        final byte[] buf = new byte[1023];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1852() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1852");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, -2, 1);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1853() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1853");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 0, 1);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1854() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1854");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 0, 1);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1855() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1855");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 2);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1856() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1856");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 0);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1857() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1857");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 0);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1858() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1858");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 2, -1);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1859() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1859");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1860() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1860");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1861() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1861");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, -2);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1862() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1862");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1863() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1863");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1864() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1864");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1865() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1865");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 0), 0);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1866() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1866");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 0), 0);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1867() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1867");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1868() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1868");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), -1);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1869() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1869");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1870() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1870");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 2), 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1871() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1871");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1872() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1872");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1873() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1873");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
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
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1874() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1874");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 4);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteOutOfBounds_literalMutation1875() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_literalMutation1875");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) + 1), 0);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, ((buf.length) - 1), 3);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteOutOfBounds_remove330() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteOutOfBounds_remove330");
        final byte[] buf = new byte[1024];
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(buf, 2, 1);
        } catch (final IndexOutOfBoundsException ioobe) {
        }
        try {
            out.write(buf, 1, 2);
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
     * Tests Base32OutputStream.write(null).
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteToNullCoverage_add359() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteToNullCoverage_add359");
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(null, 0, 0);
            out.write(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base32OutputStream.write(null).
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteToNullCoverage_add360() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteToNullCoverage_add360");
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        out.close();
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base32OutputStream.write(null).
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteToNullCoverage() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteToNullCoverage");
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(null, 1, 0);
        } catch (final NullPointerException e) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base32OutputStream.write(null).
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteToNullCoverage_literalMutation1878() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteToNullCoverage_literalMutation1878");
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(null, -1, 0);
        } catch (final NullPointerException e) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base32OutputStream.write(null).
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteToNullCoverage_literalMutation1879() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteToNullCoverage_literalMutation1879");
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base32OutputStream.write(null).
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteToNullCoverage_literalMutation1880() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteToNullCoverage_literalMutation1880");
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(null, 0, 1);
        } catch (final NullPointerException e) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base32OutputStream.write(null).
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteToNullCoverage_literalMutation1881() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteToNullCoverage_literalMutation1881");
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(null, 0, -1);
        } catch (final NullPointerException e) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base32OutputStream.write(null).
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testWriteToNullCoverage_literalMutation1882() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteToNullCoverage_literalMutation1882");
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        out.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests Base32OutputStream.write(null).
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testWriteToNullCoverage_remove331() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteToNullCoverage_remove331");
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final Base32OutputStream out = new Base32OutputStream(bout);
        try {
            out.write(null, 0, 0);
        } catch (final NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

