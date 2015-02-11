package org.apache.commons.io.output;

import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Basic unit tests for the alternative ByteArrayOutputStream implementation.
 */
public class ByteArrayOutputStreamTestCase extends TestCase {
    private static final byte[] DATA;

    static {
        DATA = new byte[64];
        for (byte i = 0 ; i < 64 ; i++) {
            DATA[i] = i;
        }
    }

    public ByteArrayOutputStreamTestCase(String name) {
        super(name);
    }

    private int writeData(ByteArrayOutputStream baout, java.io.ByteArrayOutputStream ref, int count) {
        if (count > (DATA.length)) {
            throw new IllegalArgumentException("Requesting too many bytes");
        } 
        if (count == 0) {
            baout.write(100);
            ref.write(100);
            return 1;
        } else {
            baout.write(DATA, 0, count);
            ref.write(DATA, 0, count);
            return count;
        }
    }

    private int writeData(ByteArrayOutputStream baout, java.io.ByteArrayOutputStream ref, int[] instructions) {
        int written = 0;
        for (int instruction : instructions) {
            written += writeData(baout, ref, instruction);
        }
        return written;
    }

    private static boolean byteCmp(byte[] src, byte[] cmp) {
        for (int i = 0 ; i < (cmp.length) ; i++) {
            if ((src[i]) != (cmp[i])) {
                return false;
            } 
        }
        return true;
    }

    private void checkByteArrays(byte[] expected, byte[] actual) {
        if ((expected.length) != (actual.length)) {
        } 
        if (!(ByteArrayOutputStreamTestCase.byteCmp(expected, actual))) {
        } 
    }

    private void checkStreams(ByteArrayOutputStream actual, java.io.ByteArrayOutputStream expected) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1360,expected,1359,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1362,actual,1361,actual.size());
        byte[] buf = actual.toByteArray();
        byte[] refbuf = expected.toByteArray();
        checkByteArrays(buf, refbuf);
    }

    @Test(timeout = 1000)
    public void testStream_add946() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_add946");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_add947() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_add947");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_add948() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_add948");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_add949() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_add949");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_add950() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_add950");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_add951() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_add951");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_add952() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_add952");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_add953() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_add953");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_add954() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_add954");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_add955() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_add955");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(31);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2276() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2276");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 3 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2277() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2277");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 11 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2278() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2278");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 23 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2279() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2279");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 19 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2280() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2280");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 13 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2281() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2281");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 6 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2282() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2282");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 48 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2283() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2283");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 34 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2284() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2284");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 61 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2285() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2285");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 2 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2286() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2286");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , -1 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2287() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2287");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 7 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2288() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2288");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(31);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2289() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2289");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("foo");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation2290() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation2290");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_remove777() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_remove777");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_remove778() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_remove778");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_remove779() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_remove779");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_remove780() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_remove780");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_remove781() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_remove781");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_remove782() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_remove782");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_remove783() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_remove783");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_remove784() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_remove784");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_remove785() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_remove785");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStream_remove786() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_remove786");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        written = writeData(baout, ref, new int[]{ 20 , 12 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,written);
        checkStreams(baout, ref);
        baout.reset();
        ref.reset();
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 8 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,written);
        checkStreams(baout, ref);
        baout.reset();
        written = baout.write(new java.io.ByteArrayInputStream(ref.toByteArray()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1366,written);
        checkStreams(baout, ref);
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(32);
        ref.writeTo(baout1);
        java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
        baout.writeTo(ref1);
        checkStreams(baout1, ref1);
        String baoutString = baout.toString("ASCII");
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

