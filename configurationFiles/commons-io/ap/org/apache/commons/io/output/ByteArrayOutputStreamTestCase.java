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
        ByteArrayOutputStream baout = new ByteArrayOutputStream(33);
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

    public void testStream_literalMutation3243() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3243");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(16);
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

    public void testStream_literalMutation3244() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3244");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(64);
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

    public void testStream_literalMutation3245() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3245");
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

    public void testStream_literalMutation3246() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3246");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 2 , 10 , 22 });
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

    public void testStream_literalMutation3247() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3247");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 8 , 10 , 22 });
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

    public void testStream_literalMutation3248() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3248");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 5 , 10 , 22 });
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

    public void testStream_literalMutation3249() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3249");
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

    public void testStream_literalMutation3250() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3250");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 9 , 22 });
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

    public void testStream_literalMutation3251() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3251");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 5 , 22 });
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

    public void testStream_literalMutation3252() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3252");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 20 , 22 });
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

    public void testStream_literalMutation3253() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3253");
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

    public void testStream_literalMutation3254() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3254");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 21 });
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

    public void testStream_literalMutation3255() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3255");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 11 });
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

    public void testStream_literalMutation3256() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3256");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 44 });
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

    public void testStream_literalMutation3257() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3257");
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

    public void testStream_literalMutation3258() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3258");
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

    public void testStream_literalMutation3259() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3259");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 10 , 12 });
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

    public void testStream_literalMutation3260() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3260");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 40 , 12 });
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

    public void testStream_literalMutation3261() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3261");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 21 , 12 });
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

    public void testStream_literalMutation3262() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3262");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 11 });
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

    public void testStream_literalMutation3263() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3263");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 6 });
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

    public void testStream_literalMutation3264() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3264");
        int written;
        ByteArrayOutputStream baout = new ByteArrayOutputStream(32);
        java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream();
        written = writeData(baout, ref, new int[]{ 4 , 10 , 22 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,written);
        checkStreams(baout, ref);
        written = writeData(baout, ref, new int[]{ 20 , 24 });
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

    public void testStream_literalMutation3265() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3265");
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

    public void testStream_literalMutation3266() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3266");
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
        written = writeData(baout, ref, new int[]{ 4 , 47 , 33 , 60 , 1 , 0 , 8 });
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

    public void testStream_literalMutation3267() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3267");
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
        written = writeData(baout, ref, new int[]{ 2 , 47 , 33 , 60 , 1 , 0 , 8 });
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

    public void testStream_literalMutation3268() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3268");
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
        written = writeData(baout, ref, new int[]{ 10 , 47 , 33 , 60 , 1 , 0 , 8 });
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

    public void testStream_literalMutation3269() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3269");
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

    public void testStream_literalMutation3270() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3270");
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
        written = writeData(baout, ref, new int[]{ 5 , 46 , 33 , 60 , 1 , 0 , 8 });
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

    public void testStream_literalMutation3271() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3271");
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
        written = writeData(baout, ref, new int[]{ 5 , 23 , 33 , 60 , 1 , 0 , 8 });
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

    public void testStream_literalMutation3272() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3272");
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
        written = writeData(baout, ref, new int[]{ 5 , 94 , 33 , 60 , 1 , 0 , 8 });
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

    public void testStream_literalMutation3273() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3273");
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

    public void testStream_literalMutation3274() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3274");
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
        written = writeData(baout, ref, new int[]{ 5 , 47 , 32 , 60 , 1 , 0 , 8 });
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

    public void testStream_literalMutation3275() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3275");
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
        written = writeData(baout, ref, new int[]{ 5 , 47 , 16 , 60 , 1 , 0 , 8 });
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

    public void testStream_literalMutation3276() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3276");
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
        written = writeData(baout, ref, new int[]{ 5 , 47 , 66 , 60 , 1 , 0 , 8 });
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

    public void testStream_literalMutation3277() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3277");
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

    public void testStream_literalMutation3278() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3278");
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
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 59 , 1 , 0 , 8 });
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

    public void testStream_literalMutation3279() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3279");
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

    public void testStream_literalMutation3280() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3280");
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
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 30 , 1 , 0 , 8 });
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

    public void testStream_literalMutation3281() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3281");
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
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 120 , 1 , 0 , 8 });
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

    public void testStream_literalMutation3282() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3282");
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

    public void testStream_literalMutation3283() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3283");
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
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 0 , 0 , 8 });
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

    public void testStream_literalMutation3284() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3284");
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
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 0 , 0 , 8 });
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

    public void testStream_literalMutation3285() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3285");
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
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 1 , 8 });
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

    public void testStream_literalMutation3286() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3286");
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

    public void testStream_literalMutation3287() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3287");
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
        String refString = ref.toString("ASCII");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,refString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1368,baoutString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new org.apache.commons.io.output.ByteArrayOutputStream(),1369,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,new org.apache.commons.io.output.ByteArrayOutputStream(),1371,new org.apache.commons.io.output.ByteArrayOutputStream().toByteArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStream_literalMutation3288() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3288");
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
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 4 });
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

    public void testStream_literalMutation3289() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3289");
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
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 16 });
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

    public void testStream_literalMutation3290() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3290");
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
        written = writeData(baout, ref, new int[]{ 5 , 47 , 33 , 60 , 1 , 0 , 9 });
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

    public void testStream_literalMutation3291() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3291");
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

    public void testStream_literalMutation3292() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3292");
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
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(33);
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

    public void testStream_literalMutation3293() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3293");
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
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(16);
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

    public void testStream_literalMutation3294() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3294");
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
        ByteArrayOutputStream baout1 = new ByteArrayOutputStream(64);
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

    public void testStream_literalMutation3295() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3295");
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

    public void testStream_literalMutation3296() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3296");
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

    public void testStream_literalMutation3297() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStream_literalMutation3297");
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
        String refString = ref.toString("bar");
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

