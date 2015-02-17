package org.apache.commons.codec.binary;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;

public class Base32InputStreamTest {
    private static final String ENCODED_FOO = "MZXW6===";

    private static final byte[] CRLF = new byte[]{ ((byte)('\r')) , ((byte)('\n')) };

    private static final byte[] LF = new byte[]{ ((byte)('\n')) };

    private static final String STRING_FIXTURE = "Hello World";

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test(timeout = 1000)
    public void testCodec130_add312() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_add312");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base32OutputStream base32os = new Base32OutputStream(bos);
        base32os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base32os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base32os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base32InputStream ins = new Base32InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = org.apache.commons.codec.binary.Base32TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE,1490,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1492,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test(timeout = 1000)
    public void testCodec130_add313() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_add313");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base32OutputStream base32os = new Base32OutputStream(bos);
        base32os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base32os.close();
        base32os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base32InputStream ins = new Base32InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = org.apache.commons.codec.binary.Base32TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE,1490,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1492,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test(timeout = 1000)
    public void testCodec130_add314() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_add314");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base32OutputStream base32os = new Base32OutputStream(bos);
        base32os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base32os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base32InputStream ins = new Base32InputStream(bis);
        ins.skip(1);
        ins.skip(1);
        final byte[] decodedBytes = org.apache.commons.codec.binary.Base32TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE,1490,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1492,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base32OutputStream base32os = new Base32OutputStream(bos);
        base32os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base32os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base32InputStream ins = new Base32InputStream(bis);
        ins.skip(2);
        final byte[] decodedBytes = org.apache.commons.codec.binary.Base32TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE,1490,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1492,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130_literalMutation1662() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation1662");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base32OutputStream base32os = new Base32OutputStream(bos);
        base32os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base32os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base32InputStream ins = new Base32InputStream(bis);
        ins.skip(0);
        final byte[] decodedBytes = org.apache.commons.codec.binary.Base32TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE,1490,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1492,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130_literalMutation1663() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation1663");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base32OutputStream base32os = new Base32OutputStream(bos);
        base32os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base32os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base32InputStream ins = new Base32InputStream(bis);
        ins.skip(0);
        final byte[] decodedBytes = org.apache.commons.codec.binary.Base32TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE,1490,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1492,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130_literalMutation1664() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation1664");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base32OutputStream base32os = new Base32OutputStream(bos);
        base32os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base32os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base32InputStream ins = new Base32InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = org.apache.commons.codec.binary.Base32TestData.streamToBytes(ins, new byte[65]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE,1490,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1492,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130_literalMutation1665() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation1665");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base32OutputStream base32os = new Base32OutputStream(bos);
        base32os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base32os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base32InputStream ins = new Base32InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = org.apache.commons.codec.binary.Base32TestData.streamToBytes(ins, new byte[32]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE,1490,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1492,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130_literalMutation1666() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation1666");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base32OutputStream base32os = new Base32OutputStream(bos);
        base32os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base32os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base32InputStream ins = new Base32InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = org.apache.commons.codec.binary.Base32TestData.streamToBytes(ins, new byte[128]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE,1490,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1492,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test
    public void testCodec130_literalMutation1667() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_literalMutation1667");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base32OutputStream base32os = new Base32OutputStream(bos);
        base32os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base32os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base32InputStream ins = new Base32InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = org.apache.commons.codec.binary.Base32TestData.streamToBytes(ins, new byte[63]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE,1490,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1492,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test(timeout = 1000)
    public void testCodec130_remove293() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_remove293");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base32OutputStream base32os = new Base32OutputStream(bos);
        base32os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base32InputStream ins = new Base32InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = org.apache.commons.codec.binary.Base32TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE,1490,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1492,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test(timeout = 1000)
    public void testCodec130_remove294() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_remove294");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base32OutputStream base32os = new Base32OutputStream(bos);
        base32os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base32InputStream ins = new Base32InputStream(bis);
        ins.skip(1);
        final byte[] decodedBytes = org.apache.commons.codec.binary.Base32TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE,1490,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1492,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
@Test(timeout = 1000)
    public void testCodec130_remove295() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec130_remove295");
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final Base32OutputStream base32os = new Base32OutputStream(bos);
        base32os.write(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(STRING_FIXTURE));
        base32os.close();
        final ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        final Base32InputStream ins = new Base32InputStream(bis);
        final byte[] decodedBytes = org.apache.commons.codec.binary.Base32TestData.streamToBytes(ins, new byte[64]);
        final String str = org.apache.commons.codec.binary.StringUtils.newStringUtf8(decodedBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1491,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE,1490,org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE.substring(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1492,str);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
@Test(timeout = 1000)
    public void testCodec105_add310() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_add310");
        final Base32InputStream in = new Base32InputStream(new Codec105ErrorInputStream() , true , 0 , null);
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
    public void testCodec105_add311() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_add311");
        final Base32InputStream in = new Base32InputStream(new Codec105ErrorInputStream() , true , 0 , null);
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
    public void testCodec105() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105");
        final Base32InputStream in = new Base32InputStream(new Codec105ErrorInputStream() , false , 0 , null);
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
    public void testCodec105_literalMutation1650() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation1650");
        final Base32InputStream in = new Base32InputStream(new Codec105ErrorInputStream() , true , 1 , null);
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
    public void testCodec105_literalMutation1651() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation1651");
        final Base32InputStream in = new Base32InputStream(new Codec105ErrorInputStream() , true , -1 , null);
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
    public void testCodec105_literalMutation1652() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation1652");
        final Base32InputStream in = new Base32InputStream(new Codec105ErrorInputStream() , true , 0 , null);
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
    public void testCodec105_literalMutation1654() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation1654");
        final Base32InputStream in = new Base32InputStream(new Codec105ErrorInputStream() , true , 0 , null);
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
    public void testCodec105_literalMutation1655() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation1655");
        final Base32InputStream in = new Base32InputStream(new Codec105ErrorInputStream() , true , 0 , null);
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
    public void testCodec105_literalMutation1656() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation1656");
        final Base32InputStream in = new Base32InputStream(new Codec105ErrorInputStream() , true , 0 , null);
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
    public void testCodec105_literalMutation1657() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation1657");
        final Base32InputStream in = new Base32InputStream(new Codec105ErrorInputStream() , true , 0 , null);
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
    public void testCodec105_literalMutation1658() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation1658");
        final Base32InputStream in = new Base32InputStream(new Codec105ErrorInputStream() , true , 0 , null);
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
    public void testCodec105_literalMutation1659() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation1659");
        final Base32InputStream in = new Base32InputStream(new Codec105ErrorInputStream() , true , 0 , null);
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
    public void testCodec105_literalMutation1660() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCodec105_literalMutation1660");
        final Base32InputStream in = new Base32InputStream(new Codec105ErrorInputStream() , true , 0 , null);
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
     * Tests skipping past the end of a stream.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testAvailable() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvailable");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1429,b32stream,1428,b32stream.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1431,b32stream,1430,b32stream.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1433,b32stream,1432,b32stream.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1434,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1436,b32stream,1435,b32stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1437,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1439,b32stream,1438,b32stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1441,b32stream,1440,b32stream.available());
        b32stream.close();
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping past the end of a stream.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testAvailable_remove279() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvailable_remove279");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1429,b32stream,1428,b32stream.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1431,b32stream,1430,b32stream.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1433,b32stream,1432,b32stream.available());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1434,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1436,b32stream,1435,b32stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1437,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1439,b32stream,1438,b32stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1441,b32stream,1440,b32stream.available());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base32InputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32EmptyInputStreamMimeChuckSize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStreamMimeChuckSize");
        testBase32EmptyInputStream(BaseNCodec.MIME_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base32InputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32EmptyInputStreamMimeChuckSize_add299() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStreamMimeChuckSize_add299");
        testBase32EmptyInputStream(BaseNCodec.MIME_CHUNK_SIZE);
        testBase32EmptyInputStream(BaseNCodec.MIME_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base32InputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32EmptyInputStreamMimeChuckSize_remove282() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStreamMimeChuckSize_remove282");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base32InputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32EmptyInputStreamPemChuckSize() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStreamPemChuckSize");
        testBase32EmptyInputStream(BaseNCodec.PEM_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base32InputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32EmptyInputStreamPemChuckSize_add300() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStreamPemChuckSize_add300");
        testBase32EmptyInputStream(BaseNCodec.PEM_CHUNK_SIZE);
        testBase32EmptyInputStream(BaseNCodec.PEM_CHUNK_SIZE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base32InputStream implementation against empty input.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32EmptyInputStreamPemChuckSize_remove283() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStreamPemChuckSize_remove283");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase32EmptyInputStream_add297(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStream_add297");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase32EmptyInputStream_add298(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStream_add298");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase32EmptyInputStream(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStream");
        final byte[] emptyEncoded = new byte[1];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase32EmptyInputStream_literalMutation1575(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStream_literalMutation1575");
        final byte[] emptyEncoded = new byte[-1];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase32EmptyInputStream_literalMutation1576(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStream_literalMutation1576");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase32EmptyInputStream_literalMutation1577(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStream_literalMutation1577");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[1];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase32EmptyInputStream_literalMutation1578(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStream_literalMutation1578");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[-1];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testBase32EmptyInputStream_literalMutation1579(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStream_literalMutation1579");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase32EmptyInputStream_remove280(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStream_remove280");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByChunk(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testBase32EmptyInputStream_remove281(final int chuckSize) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32EmptyInputStream_remove281");
        final byte[] emptyEncoded = new byte[0];
        final byte[] emptyDecoded = new byte[0];
        testByteByByte(emptyEncoded, emptyDecoded, chuckSize, CRLF);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32InputStreamByChunk_add301() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_add301");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32InputStreamByChunk_add302() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_add302");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32InputStreamByChunk_add303() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_add303");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("bar");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1581() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1581");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(1)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1582() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1582");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(-1)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1583() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1583");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1584() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1584");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1585() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1585");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1586() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1586");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1587() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1587");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1588() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1588");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1589() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1589");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1590() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1590");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1591() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1591");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1592() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1592");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1593() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1593");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1594() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1594");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1595() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1595");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1596() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1596");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1597() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1597");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1598() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1598");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByChunk_literalMutation1599() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_literalMutation1599");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32InputStreamByChunk_remove284() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_remove284");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32InputStreamByChunk_remove285() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_remove285");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32InputStreamByChunk_remove286() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByChunk_remove286");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByChunk(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32InputStreamByteByByte_add304() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_add304");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32InputStreamByteByByte_add305() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_add305");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32InputStreamByteByByte_add306() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_add306");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("foo");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1601() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1601");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(1)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1602() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1602");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(-1)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1603() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1603");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1604() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1604");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1605() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1605");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1606() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1606");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1607() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1607");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1608() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1608");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1609() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1609");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1610() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1610");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1611() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1611");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1612() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1612");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1613() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1613");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1614() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1614");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1615() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1615");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1616() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1616");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1617() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1617");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1618() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1618");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test
    public void testBase32InputStreamByteByByte_literalMutation1619() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_literalMutation1619");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32InputStreamByteByByte_remove287() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_remove287");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32InputStreamByteByByte_remove288() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_remove288");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
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
     * Tests the Base32InputStream implementation.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testBase32InputStreamByteByByte_remove289() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBase32InputStreamByteByByte_remove289");
        byte[] encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE);
        byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n");
        decoded = new byte[]{ ((byte)(0)) };
        testByteByByte(encoded, decoded, BaseNCodec.MIME_CHUNK_SIZE, CRLF);
        final BaseNCodec codec = new Base32();
        for (int i = 0 ; i <= 150 ; i++) {
            final byte[][] randomData = org.apache.commons.codec.binary.Base32TestData.randomData(codec, i);
            encoded = randomData[1];
            decoded = randomData[0];
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_add307(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_add307");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,in,1443,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1445,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1447,in,1446,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1449,null,1448,java.util.Arrays.equals(output, encoded));
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1452,in,1451,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1453,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1455,in,1454,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1457,null,1456,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,in,1459,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1461,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1463,in,1462,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1465,null,1464,java.util.Arrays.equals(output, decoded));
        in.close();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , false , chunkSize , separator);
        byte[] output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,in,1443,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1445,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1447,in,1446,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1449,null,1448,java.util.Arrays.equals(output, encoded));
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1452,in,1451,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1453,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1455,in,1454,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1457,null,1456,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,in,1459,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1461,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1463,in,1462,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1465,null,1464,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1621(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1621");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,in,1443,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1445,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1447,in,1446,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1449,null,1448,java.util.Arrays.equals(output, encoded));
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1452,in,1451,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1453,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1455,in,1454,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1457,null,1456,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 1 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,in,1459,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1461,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1463,in,1462,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1465,null,1464,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1622(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1622");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,in,1443,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1445,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1447,in,1446,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1449,null,1448,java.util.Arrays.equals(output, encoded));
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1452,in,1451,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1453,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1455,in,1454,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1457,null,1456,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = -1 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,in,1459,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1461,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1463,in,1462,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1465,null,1464,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1623(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1623");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,in,1443,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1445,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1447,in,1446,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1449,null,1448,java.util.Arrays.equals(output, encoded));
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1452,in,1451,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1453,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1455,in,1454,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1457,null,1456,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,in,1459,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1461,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1463,in,1462,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1465,null,1464,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1624(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1624");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,in,1443,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1445,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1447,in,1446,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1449,null,1448,java.util.Arrays.equals(output, encoded));
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1452,in,1451,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1453,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1455,in,1454,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1457,null,1456,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 9 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,in,1459,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1461,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1463,in,1462,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1465,null,1464,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1625(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1625");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,in,1443,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1445,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1447,in,1446,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1449,null,1448,java.util.Arrays.equals(output, encoded));
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1452,in,1451,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1453,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1455,in,1454,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1457,null,1456,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 5 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,in,1459,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1461,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1463,in,1462,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1465,null,1464,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1626(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1626");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,in,1443,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1445,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1447,in,1446,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1449,null,1448,java.util.Arrays.equals(output, encoded));
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1452,in,1451,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1453,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1455,in,1454,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1457,null,1456,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 20 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,in,1459,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1461,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1463,in,1462,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1465,null,1464,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1627(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1627");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,in,1443,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1445,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1447,in,1446,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1449,null,1448,java.util.Arrays.equals(output, encoded));
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1452,in,1451,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1453,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1455,in,1454,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1457,null,1456,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 11 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,in,1459,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1461,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1463,in,1462,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1465,null,1464,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1628(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1628");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,in,1443,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1445,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1447,in,1446,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1449,null,1448,java.util.Arrays.equals(output, encoded));
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1452,in,1451,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1453,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1455,in,1454,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1457,null,1456,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , false , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,in,1459,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1461,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1463,in,1462,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1465,null,1464,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByChunk_literalMutation1629(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_literalMutation1629");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,in,1443,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1445,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1447,in,1446,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1449,null,1448,java.util.Arrays.equals(output, encoded));
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1452,in,1451,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1453,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1455,in,1454,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1457,null,1456,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , true);
        }
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,in,1459,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1461,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1463,in,1462,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1465,null,1464,java.util.Arrays.equals(output, decoded));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByChunk_remove290(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByChunk_remove290");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,in,1443,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1445,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1447,in,1446,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1449,null,1448,java.util.Arrays.equals(output, encoded));
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1450,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1452,in,1451,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1453,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1455,in,1454,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1457,null,1456,java.util.Arrays.equals(output, decoded));
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,in,1459,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1461,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1463,in,1462,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1465,null,1464,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_add308(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add308");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_add309(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_add309");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , false , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1631(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1631");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 1 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1632(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1632");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = -1 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1633(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1633");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1634(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1634");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 1 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1635(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1635");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = -1 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1636(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1636");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1637(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1637");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 1 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1638(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1638");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = -1 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1639(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1639");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1640(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1640");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 9 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1641(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1641");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 5 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1642(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1642");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 20 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1643(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1643");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 11 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1644(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1644");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , false , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1645(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1645");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , true);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1646(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1646");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 1 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1647(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1647");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = -1 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
private void testByteByByte_literalMutation1648(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_literalMutation1648");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in.close();
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_remove291(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove291");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     * 
     * @param encoded
     * base32 encoded data
     * @param decoded
     * the data from above, but decoded
     * @param chunkSize
     * chunk size (line-length) of the base32 encoded data.
     * @param separator
     * Line separator in the base32 encoded data.
     * @throws Exception
     * Usually signifies a bug in the Base32 commons-codec implementation.
     */
@Test(timeout = 1000)
    private void testByteByByte_remove292(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteByByte_remove292");
        InputStream in;
        in = new Base32InputStream(new ByteArrayInputStream(decoded) , true , chunkSize , separator);
        byte[] output = new byte[encoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,in,1467,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1469,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,in,1470,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1473,null,1472,java.util.Arrays.equals(output, encoded));
        in = new Base32InputStream(new ByteArrayInputStream(encoded));
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,in,1475,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1477,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1479,in,1478,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1481,null,1480,java.util.Arrays.equals(output, decoded));
        in.close();
        in = new ByteArrayInputStream(decoded);
        for (int i = 0 ; i < 10 ; i++) {
            in = new Base32InputStream(in , true , chunkSize , separator);
            in = new Base32InputStream(in , false);
        }
        output = new byte[decoded.length];
        for (int i = 0 ; i < (output.length) ; i++) {
            output[i] = ((byte)(in.read()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,in,1483,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1485,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1487,in,1486,in.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1489,null,1488,java.util.Arrays.equals(output, decoded));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test(timeout = 1000)
    public void testMarkSupported_add315() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_add315");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
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
    public void testMarkSupported() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , false , 4 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation1669() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1669");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 2 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation1670() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1670");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 8 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation1671() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1671");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 5 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation1672() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1672");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 3 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation1673() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1673");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 1 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation1674() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1674");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ -1 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation1675() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1675");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation1676() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1676");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 1 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation1677() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1677");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , -1 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation1678() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1678");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation1679() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1679");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 1 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation1680() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1680");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , -1 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test
    public void testMarkSupported_literalMutation1681() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_literalMutation1681");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests markSupported.
     * 
     * @throws Exception
     */
@Test(timeout = 1000)
    public void testMarkSupported_remove296() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMarkSupported_remove296");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,in,1493,in.markSupported());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test(timeout = 1000)
    public void testRead0_add316() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_add316");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
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
    public void testRead0() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1025];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1683() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1683");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[512];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1684() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1684");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[2048];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1685() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1685");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1023];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1686() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1686");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 1;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1687() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1687");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = -1;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1688() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1688");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1689() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1689");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , false , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1690() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1690");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 2 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1691() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1691");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 8 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1692() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1692");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 5 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1693() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1693");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 3 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1694() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1694");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 1 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1695() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1695");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ -1 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1696() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1696");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1697() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1697");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 1 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1698() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1698");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , -1 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1699() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1699");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1700() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1700");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 1 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1701() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1701");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , -1 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1702() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1702");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1703() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1703");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 1, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1704() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1704");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, -1, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1705() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1705");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1706() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1706");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1707() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1707");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, -1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test
    public void testRead0_literalMutation1708() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_literalMutation1708");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read returning 0
     * 
     * @throws Exception
     */
@Test(timeout = 1000)
    public void testRead0_remove297() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRead0_remove297");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        int bytesRead = 0;
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
        bytesRead = in.read(buf, 0, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,bytesRead);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests read with null.
     * 
     * @throws Exception
     * for some failure scenarios.
     */
@Test(timeout = 1000)
    public void testReadNull_add317() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_add317");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_add318() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_add318");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , false , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_literalMutation1710() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1710");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 2 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_literalMutation1711() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1711");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 8 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_literalMutation1712() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1712");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 5 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_literalMutation1713() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1713");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 3 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_literalMutation1714() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1714");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 1 , 0 , 0 });
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
    public void testReadNull_literalMutation1715() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1715");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ -1 , 0 , 0 });
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
    public void testReadNull_literalMutation1716() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1716");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_literalMutation1717() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1717");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 1 , 0 });
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
    public void testReadNull_literalMutation1718() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1718");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , -1 , 0 });
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
    public void testReadNull_literalMutation1719() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1719");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_literalMutation1720() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1720");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 1 });
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
    public void testReadNull_literalMutation1721() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1721");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , -1 });
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
    public void testReadNull_literalMutation1722() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1722");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_literalMutation1724() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1724");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_literalMutation1725() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1725");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_literalMutation1726() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1726");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_literalMutation1727() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1727");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_literalMutation1728() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1728");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_literalMutation1729() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_literalMutation1729");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadNull_remove298() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNull_remove298");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
@Test(timeout = 1000)
    public void testReadOutOfBounds_add319() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_add319");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_add320() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_add320");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_add321() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_add321");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_add322() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_add322");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_add323() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_add323");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1025];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1731() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1731");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[512];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1732() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1732");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[2048];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1733() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1733");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1023];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1734() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1734");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , false , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1735() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1735");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 2 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1736() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1736");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 8 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1737() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1737");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 5 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1738() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1738");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 3 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1739() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1739");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 1 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1740() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1740");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ -1 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1741() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1741");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1742() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1742");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 1 , 0 });
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
    public void testReadOutOfBounds_literalMutation1743() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1743");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , -1 , 0 });
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
    public void testReadOutOfBounds_literalMutation1744() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1744");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1745() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1745");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 1 });
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
    public void testReadOutOfBounds_literalMutation1746() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1746");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , -1 });
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
    public void testReadOutOfBounds_literalMutation1747() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1747");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1748() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1748");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1749() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1749");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1750() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1750");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1751() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1751");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1752() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1752");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1753() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1753");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1754() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1754");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1755() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1755");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1756() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1756");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1757() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1757");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1758() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1758");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1759() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1759");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1760() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1760");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1761() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1761");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1762() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1762");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1763() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1763");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1764() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1764");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1765() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1765");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1766() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1766");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1767() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1767");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1768() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1768");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1769() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1769");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1770() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1770");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_literalMutation1771() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_literalMutation1771");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
    public void testReadOutOfBounds_remove299() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadOutOfBounds_remove299");
        final byte[] decoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE);
        final byte[] buf = new byte[1024];
        final ByteArrayInputStream bin = new ByteArrayInputStream(decoded);
        final Base32InputStream in = new Base32InputStream(bin , true , 4 , new byte[]{ 0 , 0 , 0 });
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
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipNone_add325() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_add325");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,b32stream,1504,b32stream.skip(0));
        b32stream.read(actualBytes, 0, actualBytes.length);
        b32stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,new byte[]{ 102 , 111 , 111 , 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,b32stream,1509,b32stream.read());
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipNone_add326() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_add326");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,b32stream,1504,b32stream.skip(0));
        b32stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,new byte[]{ 102 , 111 , 111 , 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,b32stream,1509,b32stream.read());
        b32stream.close();
        b32stream.close();
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
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        final byte[] actualBytes = new byte[5];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,b32stream,1504,b32stream.skip(0));
        b32stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,new byte[]{ 102 , 111 , 111 , 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,b32stream,1509,b32stream.read());
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test
    public void testSkipNone_literalMutation1773() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation1773");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        final byte[] actualBytes = new byte[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,b32stream,1504,b32stream.skip(0));
        b32stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,new byte[]{ 102 , 111 , 111 , 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,b32stream,1509,b32stream.read());
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test
    public void testSkipNone_literalMutation1774() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation1774");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        final byte[] actualBytes = new byte[12];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,b32stream,1504,b32stream.skip(0));
        b32stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,new byte[]{ 102 , 111 , 111 , 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,b32stream,1509,b32stream.read());
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test
    public void testSkipNone_literalMutation1775() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation1775");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        final byte[] actualBytes = new byte[7];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,b32stream,1504,b32stream.skip(0));
        b32stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,new byte[]{ 102 , 111 , 111 , 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,b32stream,1509,b32stream.read());
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test
    public void testSkipNone_literalMutation1776() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation1776");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,b32stream,1504,b32stream.skip(0));
        b32stream.read(actualBytes, 1, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,new byte[]{ 102 , 111 , 111 , 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,b32stream,1509,b32stream.read());
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test
    public void testSkipNone_literalMutation1777() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation1777");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,b32stream,1504,b32stream.skip(0));
        b32stream.read(actualBytes, -1, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,new byte[]{ 102 , 111 , 111 , 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,b32stream,1509,b32stream.read());
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test
    public void testSkipNone_literalMutation1778() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_literalMutation1778");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,b32stream,1504,b32stream.skip(0));
        b32stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,new byte[]{ 102 , 111 , 111 , 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,b32stream,1509,b32stream.read());
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipNone_remove301() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_remove301");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,b32stream,1504,b32stream.skip(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,new byte[]{ 102 , 111 , 111 , 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,b32stream,1509,b32stream.read());
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping as a noop
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipNone_remove302() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNone_remove302");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        final byte[] actualBytes = new byte[6];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,b32stream,1504,b32stream.skip(0));
        b32stream.read(actualBytes, 0, actualBytes.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,actualBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,new byte[]{ 102 , 111 , 111 , 0 , 0 , 0 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,b32stream,1509,b32stream.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping number of characters larger than the internal buffer.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipBig() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipBig");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,b32stream,1496,b32stream.skip(1024));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1498,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1500,b32stream,1499,b32stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,b32stream,1502,b32stream.read());
        b32stream.close();
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping number of characters larger than the internal buffer.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipBig_remove300() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipBig_remove300");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,b32stream,1496,b32stream.skip(1024));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1498,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1500,b32stream,1499,b32stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,b32stream,1502,b32stream.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping past the end of a stream.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipPastEnd() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipPastEnd");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1512,b32stream,1511,b32stream.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,b32stream,1514,b32stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1516,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1518,b32stream,1517,b32stream.read());
        b32stream.close();
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping past the end of a stream.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipPastEnd_remove303() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipPastEnd_remove303");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1512,b32stream,1511,b32stream.skip(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,b32stream,1514,b32stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1516,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1518,b32stream,1517,b32stream.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping to the end of a stream.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipToEnd() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipToEnd");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1520,b32stream,1519,b32stream.skip(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1521,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1523,b32stream,1522,b32stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1524,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1526,b32stream,1525,b32stream.read());
        b32stream.close();
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests skipping to the end of a stream.
     * 
     * @throws Throwable
     */
@Test(timeout = 1000)
    public void testSkipToEnd_remove304() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipToEnd_remove304");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1520,b32stream,1519,b32stream.skip(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1521,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1523,b32stream,1522,b32stream.read());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1524,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1526,b32stream,1525,b32stream.read());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSkipWrongArgument_add329() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_add329");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        b32stream.skip(9);
        b32stream.skip(9);
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSkipWrongArgument_add330() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_add330");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        b32stream.skip(9);
        b32stream.close();
        b32stream.close();
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
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        b32stream.skip(-9);
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class)
    public void testSkipWrongArgument_literalMutation1780() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_literalMutation1780");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        b32stream.skip(5);
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class)
    public void testSkipWrongArgument_literalMutation1781() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_literalMutation1781");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        b32stream.skip(20);
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class)
    public void testSkipWrongArgument_literalMutation1782() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_literalMutation1782");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        b32stream.skip(11);
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSkipWrongArgument_remove305() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_remove305");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        b32stream.close();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests if negative arguments to skip are handled correctly.
     * 
     * @throws Throwable
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSkipWrongArgument_remove306() throws Throwable {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipWrongArgument_remove306");
        final InputStream ins = new ByteArrayInputStream(org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(ENCODED_FOO));
        final Base32InputStream b32stream = new Base32InputStream(ins);
        b32stream.skip(9);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

