package org.apache.commons.io.input;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Test for the SwappedDataInputStream. This also
 * effectively tests the underlying EndianUtils Stream methods.
 * 
 * @version $Id$
 */
public class SwappedDataInputStreamTest extends TestCase {
    private SwappedDataInputStream sdis;

    private byte[] bytes;

    public SwappedDataInputStreamTest(String name) {
        super(name);
    }

    @Override
    public void setUp() {
        bytes = new byte[]{ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 };
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        this.sdis = new SwappedDataInputStream(bais);
    }

    @Override
    public void tearDown() {
        this.sdis = null;
    }

    public void testReadBoolean() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadBoolean");
        bytes = new byte[]{ 1 , 1 , 2 };
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        SwappedDataInputStream sdis = new SwappedDataInputStream(bais);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),839,sdis,838,sdis.readBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),841,sdis,840,sdis.readBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),843,sdis,842,sdis.readBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadBoolean_literalMutation604() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadBoolean_literalMutation604");
        bytes = new byte[]{ 0 , 2 , 2 };
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        SwappedDataInputStream sdis = new SwappedDataInputStream(bais);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),839,sdis,838,sdis.readBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),841,sdis,840,sdis.readBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),843,sdis,842,sdis.readBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadBoolean_literalMutation605() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadBoolean_literalMutation605");
        bytes = new byte[]{ 0 , 1 , 1 };
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        SwappedDataInputStream sdis = new SwappedDataInputStream(bais);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),839,sdis,838,sdis.readBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),841,sdis,840,sdis.readBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),843,sdis,842,sdis.readBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadByte() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadByte");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,this.sdis,844,this.sdis.readByte());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadChar() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadChar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,this.sdis,846,this.sdis.readChar());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadDouble() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadDouble");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,null,848,java.lang.Double.longBitsToDouble(578437695752307201L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,this.sdis,850,this.sdis.readDouble());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadFloat() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadFloat");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),853,null,852,java.lang.Float.intBitsToFloat(67305985));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,this.sdis,854,this.sdis.readFloat());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadFully_add246() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadFully_add246");
        byte[] bytesIn = new byte[8];
        this.sdis.readFully(bytesIn);
        this.sdis.readFully(bytesIn);
        for (int i = 0 ; i < 8 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,bytes[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),856,bytesIn[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadFully() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadFully");
        byte[] bytesIn = new byte[7];
        this.sdis.readFully(bytesIn);
        for (int i = 0 ; i < 8 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,bytes[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),856,bytesIn[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadFully_literalMutation607() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadFully_literalMutation607");
        byte[] bytesIn = new byte[8];
        this.sdis.readFully(bytesIn);
        for (int i = 1 ; i < 8 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,bytes[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),856,bytesIn[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadFully_literalMutation608() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadFully_literalMutation608");
        byte[] bytesIn = new byte[8];
        this.sdis.readFully(bytesIn);
        for (int i = 0 ; i < 9 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,bytes[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),856,bytesIn[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadFully_remove116() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadFully_remove116");
        byte[] bytesIn = new byte[8];
        for (int i = 0 ; i < 8 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,bytes[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),856,bytesIn[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadInt() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadInt");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),858,this.sdis,857,this.sdis.readInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadLine() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadLine");
        try {
            this.sdis.readLine();
            this.sdis.readLine();
        } catch (UnsupportedOperationException uoe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadLong() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadLong");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),860,this.sdis,859,this.sdis.readLong());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadShort() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadShort");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),862,this.sdis,861,this.sdis.readShort());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadUnsignedByte() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadUnsignedByte");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),864,this.sdis,863,this.sdis.readUnsignedByte());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadUnsignedShort() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadUnsignedShort");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,this.sdis,865,this.sdis.readUnsignedShort());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadUTF() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadUTF");
        try {
            this.sdis.readUTF();
            this.sdis.readUTF();
        } catch (UnsupportedOperationException uoe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipBytes_add249() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipBytes_add249");
        this.sdis.skipBytes(4);
        this.sdis.skipBytes(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),868,this.sdis,867,this.sdis.readInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipBytes() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipBytes");
        this.sdis.skipBytes(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),868,this.sdis,867,this.sdis.readInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipBytes_remove117() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipBytes_remove117");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),868,this.sdis,867,this.sdis.readInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

