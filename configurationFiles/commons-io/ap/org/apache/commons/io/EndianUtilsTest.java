package org.apache.commons.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * @version $Id$
 */
public class EndianUtilsTest extends TestCase {
    public EndianUtilsTest(String name) {
        super(name);
    }

    public void testCtor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCtor");
        new EndianUtils();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEOFException() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOFException");
        ByteArrayInputStream input = new ByteArrayInputStream(new byte[]{  });
        try {
            EndianUtils.readSwappedDouble(input);
        } catch (EOFException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEOFException_add1215() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEOFException_add1215");
        ByteArrayInputStream input = new ByteArrayInputStream(new byte[]{  });
        try {
            EndianUtils.readSwappedDouble(input);
            EndianUtils.readSwappedDouble(input);
        } catch (EOFException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapShort() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapShort");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2185,null,2184,org.apache.commons.io.EndianUtils.swapShort(((short)(0))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2187,null,2186,org.apache.commons.io.EndianUtils.swapShort(((short)(258))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2189,null,2188,org.apache.commons.io.EndianUtils.swapShort(((short)(65535))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2191,null,2190,org.apache.commons.io.EndianUtils.swapShort(((short)(513))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapInteger() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapInteger");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2163,null,2162,org.apache.commons.io.EndianUtils.swapInteger(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2165,null,2164,org.apache.commons.io.EndianUtils.swapInteger(16909060));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2167,null,2166,org.apache.commons.io.EndianUtils.swapInteger(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2169,null,2168,org.apache.commons.io.EndianUtils.swapInteger(16777216));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2171,null,2170,org.apache.commons.io.EndianUtils.swapInteger(286331153));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2173,null,2172,org.apache.commons.io.EndianUtils.swapInteger(284151211));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2175,null,2174,org.apache.commons.io.EndianUtils.swapInteger(-1426063360));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapLong() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapLong");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2177,null,2176,org.apache.commons.io.EndianUtils.swapLong(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2179,null,2178,org.apache.commons.io.EndianUtils.swapLong(72623859790382856L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2181,null,2180,org.apache.commons.io.EndianUtils.swapLong(-1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2183,null,2182,org.apache.commons.io.EndianUtils.swapLong(-6124895493223874560L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapFloat() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapFloat");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2158,null,2157,org.apache.commons.io.EndianUtils.swapFloat(0.0F));
        float f1 = java.lang.Float.intBitsToFloat(16909059);
        float f2 = java.lang.Float.intBitsToFloat(67305985);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2159,f2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2161,null,2160,org.apache.commons.io.EndianUtils.swapFloat(f1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapFloat_literalMutation2719() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapFloat_literalMutation2719");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2158,null,2157,org.apache.commons.io.EndianUtils.swapFloat(0.0F));
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = java.lang.Float.intBitsToFloat(67305986);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2159,f2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2161,null,2160,org.apache.commons.io.EndianUtils.swapFloat(f1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapDouble() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapDouble");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,null,2152,org.apache.commons.io.EndianUtils.swapDouble(0.0));
        double d1 = java.lang.Double.longBitsToDouble(72623859790382857L);
        double d2 = java.lang.Double.longBitsToDouble(578437695752307201L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2154,d2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2156,null,2155,org.apache.commons.io.EndianUtils.swapDouble(d1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapDouble_literalMutation2717() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapDouble_literalMutation2717");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,null,2152,org.apache.commons.io.EndianUtils.swapDouble(0.0));
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = java.lang.Double.longBitsToDouble(578437695752307200L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2154,d2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2156,null,2155,org.apache.commons.io.EndianUtils.swapDouble(d1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests all swapXxxx methods for symmetry when going from one endian
     * to another and back again.
     */
public void testSymmetry() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetry");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2197,null,2196,org.apache.commons.io.EndianUtils.swapShort(org.apache.commons.io.EndianUtils.swapShort(((short)(258)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2199,null,2198,org.apache.commons.io.EndianUtils.swapInteger(org.apache.commons.io.EndianUtils.swapInteger(16909060)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2201,null,2200,org.apache.commons.io.EndianUtils.swapLong(org.apache.commons.io.EndianUtils.swapLong(72623859790382856L)));
        float f1 = java.lang.Float.intBitsToFloat(16909059);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2202,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2204,null,2203,org.apache.commons.io.EndianUtils.swapFloat(org.apache.commons.io.EndianUtils.swapFloat(f1)));
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2205,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2207,null,2206,org.apache.commons.io.EndianUtils.swapDouble(org.apache.commons.io.EndianUtils.swapDouble(d1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests all swapXxxx methods for symmetry when going from one endian
     * to another and back again.
     */
public void testSymmetry_literalMutation2721() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetry_literalMutation2721");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2197,null,2196,org.apache.commons.io.EndianUtils.swapShort(org.apache.commons.io.EndianUtils.swapShort(((short)(258)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2199,null,2198,org.apache.commons.io.EndianUtils.swapInteger(org.apache.commons.io.EndianUtils.swapInteger(16909060)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2201,null,2200,org.apache.commons.io.EndianUtils.swapLong(org.apache.commons.io.EndianUtils.swapLong(72623859790382856L)));
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2202,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2204,null,2203,org.apache.commons.io.EndianUtils.swapFloat(org.apache.commons.io.EndianUtils.swapFloat(f1)));
        double d1 = java.lang.Double.longBitsToDouble(72623859790382857L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2205,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2207,null,2206,org.apache.commons.io.EndianUtils.swapDouble(org.apache.commons.io.EndianUtils.swapDouble(d1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedShort() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedShort");
        byte[] bytes = new byte[]{ 1 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2141,null,2140,org.apache.commons.io.EndianUtils.readSwappedShort(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,null,2142,org.apache.commons.io.EndianUtils.readSwappedShort(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedShort_literalMutation2709() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedShort_literalMutation2709");
        byte[] bytes = new byte[]{ 2 , 0 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2141,null,2140,org.apache.commons.io.EndianUtils.readSwappedShort(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,null,2142,org.apache.commons.io.EndianUtils.readSwappedShort(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedShort_add1226() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_add1226");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(258)));
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(258)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedShort_add1227() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_add1227");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(258)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedShort() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort");
        byte[] bytes = new byte[3];
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(258)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedShort_literalMutation2758() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation2758");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, -1, ((short)(258)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedShort_literalMutation2759() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation2759");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(257)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedShort_literalMutation2760() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation2760");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(258)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(1);
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedShort_literalMutation2761() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation2761");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(258)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(259)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedShort_remove953() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_remove953");
        byte[] bytes = new byte[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedShort_remove954() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_remove954");
        byte[] bytes = new byte[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedShort() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedShort");
        byte[] bytes = new byte[]{ 3 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2149,null,2148,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,null,2150,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedShort_literalMutation2715() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedShort_literalMutation2715");
        byte[] bytes = new byte[]{ 2 , 2 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2149,null,2148,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,null,2150,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger");
        byte[] bytes = new byte[]{ 5 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation2697() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation2697");
        byte[] bytes = new byte[]{ 4 , 2 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation2698() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation2698");
        byte[] bytes = new byte[]{ 4 , 3 , 3 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation2699() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation2699");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 2 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedInteger_add1222() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_add1222");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 0, 16909060);
        EndianUtils.writeSwappedInteger(bytes, 0, 16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedInteger(baos, 16909060);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedInteger_add1223() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_add1223");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 0, 16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedInteger(baos, 16909060);
        EndianUtils.writeSwappedInteger(baos, 16909060);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedInteger() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger");
        byte[] bytes = new byte[3];
        EndianUtils.writeSwappedInteger(bytes, 0, 16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedInteger(baos, 16909060);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedInteger_literalMutation2748() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation2748");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 1, 16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedInteger(baos, 16909060);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedInteger_literalMutation2749() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation2749");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 0, 16909061);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedInteger(baos, 16909060);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedInteger_literalMutation2750() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation2750");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 0, 16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(5);
        EndianUtils.writeSwappedInteger(baos, 16909060);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedInteger_literalMutation2751() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation2751");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 0, 16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedInteger(baos, 16909061);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedInteger_remove949() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_remove949");
        byte[] bytes = new byte[4];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedInteger(baos, 16909060);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedInteger_remove950() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_remove950");
        byte[] bytes = new byte[4];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedInteger(baos, 16909060);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger");
        byte[] bytes = new byte[]{ 3 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation2711() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation2711");
        byte[] bytes = new byte[]{ 4 , 4 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation2712() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation2712");
        byte[] bytes = new byte[]{ 4 , 3 , 3 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation2713() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation2713");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 0 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong");
        byte[] bytes = new byte[]{ 9 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation2701() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation2701");
        byte[] bytes = new byte[]{ 8 , 8 , 6 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation2702() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation2702");
        byte[] bytes = new byte[]{ 8 , 7 , 5 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation2703() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation2703");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 6 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation2704() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation2704");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 5 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation2705() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation2705");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 4 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation2706() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation2706");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 1 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation2707() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation2707");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 2 , 0 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedLong_add1224() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_add1224");
        byte[] bytes = new byte[8];
        EndianUtils.writeSwappedLong(bytes, 0, 72623859790382856L);
        EndianUtils.writeSwappedLong(bytes, 0, 72623859790382856L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2245,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2248,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2250,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2251,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedLong(baos, 72623859790382856L);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2253,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2254,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2255,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2257,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2258,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2259,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedLong_add1225() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_add1225");
        byte[] bytes = new byte[8];
        EndianUtils.writeSwappedLong(bytes, 0, 72623859790382856L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2245,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2248,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2250,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2251,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedLong(baos, 72623859790382856L);
        EndianUtils.writeSwappedLong(baos, 72623859790382856L);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2253,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2254,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2255,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2257,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2258,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2259,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedLong() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong");
        byte[] bytes = new byte[7];
        EndianUtils.writeSwappedLong(bytes, 0, 72623859790382856L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2245,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2248,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2250,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2251,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedLong(baos, 72623859790382856L);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2253,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2254,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2255,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2257,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2258,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2259,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedLong_literalMutation2753() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation2753");
        byte[] bytes = new byte[8];
        EndianUtils.writeSwappedLong(bytes, -1, 72623859790382856L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2245,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2248,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2250,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2251,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedLong(baos, 72623859790382856L);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2253,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2254,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2255,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2257,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2258,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2259,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedLong_literalMutation2754() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation2754");
        byte[] bytes = new byte[8];
        EndianUtils.writeSwappedLong(bytes, 0, 72623859790382855L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2245,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2248,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2250,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2251,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedLong(baos, 72623859790382856L);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2253,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2254,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2255,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2257,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2258,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2259,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedLong_literalMutation2755() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation2755");
        byte[] bytes = new byte[8];
        EndianUtils.writeSwappedLong(bytes, 0, 72623859790382856L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2245,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2248,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2250,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2251,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(7);
        EndianUtils.writeSwappedLong(baos, 72623859790382856L);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2253,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2254,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2255,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2257,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2258,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2259,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedLong_literalMutation2756() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation2756");
        byte[] bytes = new byte[8];
        EndianUtils.writeSwappedLong(bytes, 0, 72623859790382856L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2245,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2248,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2250,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2251,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedLong(baos, 72623859790382857L);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2253,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2254,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2255,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2257,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2258,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2259,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedLong_remove951() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_remove951");
        byte[] bytes = new byte[8];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2245,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2248,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2250,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2251,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedLong(baos, 72623859790382856L);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2253,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2254,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2255,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2257,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2258,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2259,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedLong_remove952() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_remove952");
        byte[] bytes = new byte[8];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2245,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2248,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2250,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2251,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedLong(baos, 72623859790382856L);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2253,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2254,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2255,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2257,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2258,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2259,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat");
        byte[] bytes = new byte[]{ 5 , 3 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation2691() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation2691");
        byte[] bytes = new byte[]{ 4 , 2 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation2692() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation2692");
        byte[] bytes = new byte[]{ 4 , 3 , 3 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation2693() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation2693");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 0 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation2694() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation2694");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909061);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation2695() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation2695");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedFloat_add1220() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_add1220");
        byte[] bytes = new byte[4];
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        EndianUtils.writeSwappedFloat(bytes, 0, f1);
        EndianUtils.writeSwappedFloat(bytes, 0, f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2228,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2230,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedFloat(baos, f1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2232,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2234,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedFloat_add1221() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_add1221");
        byte[] bytes = new byte[4];
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        EndianUtils.writeSwappedFloat(bytes, 0, f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2228,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2230,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedFloat(baos, f1);
        EndianUtils.writeSwappedFloat(baos, f1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2232,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2234,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedFloat() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat");
        byte[] bytes = new byte[5];
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        EndianUtils.writeSwappedFloat(bytes, 0, f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2228,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2230,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedFloat(baos, f1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2232,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2234,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedFloat_literalMutation2744() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation2744");
        byte[] bytes = new byte[4];
        float f1 = java.lang.Float.intBitsToFloat(16909061);
        EndianUtils.writeSwappedFloat(bytes, 0, f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2228,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2230,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedFloat(baos, f1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2232,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2234,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedFloat_literalMutation2745() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation2745");
        byte[] bytes = new byte[4];
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        EndianUtils.writeSwappedFloat(bytes, -1, f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2228,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2230,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedFloat(baos, f1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2232,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2234,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedFloat_literalMutation2746() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation2746");
        byte[] bytes = new byte[4];
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        EndianUtils.writeSwappedFloat(bytes, 0, f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2228,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2230,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(3);
        EndianUtils.writeSwappedFloat(baos, f1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2232,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2234,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedFloat_remove947() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_remove947");
        byte[] bytes = new byte[4];
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2228,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2230,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedFloat(baos, f1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2232,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2234,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedFloat_remove948() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_remove948");
        byte[] bytes = new byte[4];
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2228,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2230,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedFloat(baos, f1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2232,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2234,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble");
        byte[] bytes = new byte[]{ 9 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation2681() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation2681");
        byte[] bytes = new byte[]{ 8 , 6 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation2682() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation2682");
        byte[] bytes = new byte[]{ 8 , 7 , 7 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation2683() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation2683");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 4 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation2684() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation2684");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 3 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation2685() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation2685");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 4 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation2686() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation2686");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 3 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation2687() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation2687");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 2 , 0 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation2688() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation2688");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382857L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation2689() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation2689");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedDouble_add1218() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_add1218");
        byte[] bytes = new byte[8];
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        EndianUtils.writeSwappedDouble(bytes, 0, d1);
        EndianUtils.writeSwappedDouble(bytes, 0, d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2212,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2213,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2214,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2215,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2216,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2217,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2218,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2219,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedDouble(baos, d1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2220,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2221,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2222,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2223,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2224,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2225,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2226,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedDouble_add1219() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_add1219");
        byte[] bytes = new byte[8];
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        EndianUtils.writeSwappedDouble(bytes, 0, d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2212,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2213,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2214,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2215,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2216,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2217,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2218,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2219,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedDouble(baos, d1);
        EndianUtils.writeSwappedDouble(baos, d1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2220,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2221,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2222,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2223,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2224,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2225,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2226,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedDouble() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble");
        byte[] bytes = new byte[9];
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        EndianUtils.writeSwappedDouble(bytes, 0, d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2212,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2213,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2214,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2215,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2216,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2217,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2218,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2219,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedDouble(baos, d1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2220,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2221,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2222,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2223,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2224,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2225,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2226,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedDouble_literalMutation2740() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation2740");
        byte[] bytes = new byte[8];
        double d1 = java.lang.Double.longBitsToDouble(72623859790382855L);
        EndianUtils.writeSwappedDouble(bytes, 0, d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2212,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2213,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2214,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2215,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2216,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2217,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2218,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2219,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedDouble(baos, d1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2220,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2221,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2222,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2223,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2224,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2225,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2226,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedDouble_literalMutation2741() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation2741");
        byte[] bytes = new byte[8];
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        EndianUtils.writeSwappedDouble(bytes, -1, d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2212,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2213,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2214,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2215,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2216,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2217,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2218,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2219,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedDouble(baos, d1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2220,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2221,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2222,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2223,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2224,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2225,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2226,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedDouble_literalMutation2742() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation2742");
        byte[] bytes = new byte[8];
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        EndianUtils.writeSwappedDouble(bytes, 0, d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2212,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2213,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2214,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2215,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2216,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2217,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2218,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2219,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(7);
        EndianUtils.writeSwappedDouble(baos, d1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2220,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2221,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2222,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2223,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2224,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2225,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2226,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedDouble_remove945() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_remove945");
        byte[] bytes = new byte[8];
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2212,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2213,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2214,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2215,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2216,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2217,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2218,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2219,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedDouble(baos, d1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2220,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2221,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2222,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2223,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2224,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2225,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2226,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteSwappedDouble_remove946() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_remove946");
        byte[] bytes = new byte[8];
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2212,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2213,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2214,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2215,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2216,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2217,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2218,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2219,bytes[7]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedDouble(baos, d1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2220,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2221,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2222,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2223,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2224,bytes[4]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2225,bytes[5]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2226,bytes[6]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,bytes[7]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong");
        double[] tests = new double[]{ 34.345 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSymmetryOfLong_add1216() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_add1216");
        double[] tests = new double[]{ 34.345 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSymmetryOfLong_add1217() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_add1217");
        double[] tests = new double[]{ 34.345 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation2722() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation2722");
        double[] tests = new double[]{ 33.345 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation2723() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation2723");
        double[] tests = new double[]{ 34.345 , 344.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation2724() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation2724");
        double[] tests = new double[]{ 34.345 , -345.5645 , 546.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation2725() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation2725");
        double[] tests = new double[]{ 34.345 , -345.5645 , 545.12 , 9.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation2726() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation2726");
        double[] tests = new double[]{ 34.345 , -345.5645 , 545.12 , 10.043 , 6.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation2727() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation2727");
        double[] tests = new double[]{ 34.345 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[7];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation2728() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation2728");
        double[] tests = new double[]{ 34.345 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, -1, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation2729() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation2729");
        double[] tests = new double[]{ 34.345 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation2730() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation2730");
        double[] tests = new double[]{ 34.345 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[9];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation2731() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation2731");
        double[] tests = new double[]{ 34.345 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, -1, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation2732() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation2732");
        double[] tests = new double[]{ 34.345 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, -1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSymmetryOfLong_remove943() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_remove943");
        double[] tests = new double[]{ 34.345 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSymmetryOfLong_remove944() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_remove944");
        double[] tests = new double[]{ 34.345 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnsignedOverrun() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun");
        byte[] target = new byte[]{ -1 , 0 , 0 , ((byte)(128)) };
        long expected = 2147483648L;
        long actual = EndianUtils.readSwappedUnsignedInteger(target, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2208,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2209,actual);
        ByteArrayInputStream in = new ByteArrayInputStream(target);
        actual = EndianUtils.readSwappedUnsignedInteger(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2210,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2211,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnsignedOverrun_literalMutation2734() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation2734");
        byte[] target = new byte[]{ 0 , 1 , 0 , ((byte)(128)) };
        long expected = 2147483648L;
        long actual = EndianUtils.readSwappedUnsignedInteger(target, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2208,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2209,actual);
        ByteArrayInputStream in = new ByteArrayInputStream(target);
        actual = EndianUtils.readSwappedUnsignedInteger(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2210,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2211,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnsignedOverrun_literalMutation2735() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation2735");
        byte[] target = new byte[]{ 0 , 0 , 1 , ((byte)(128)) };
        long expected = 2147483648L;
        long actual = EndianUtils.readSwappedUnsignedInteger(target, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2208,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2209,actual);
        ByteArrayInputStream in = new ByteArrayInputStream(target);
        actual = EndianUtils.readSwappedUnsignedInteger(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2210,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2211,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnsignedOverrun_literalMutation2736() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation2736");
        byte[] target = new byte[]{ 0 , 0 , 0 , ((byte)(127)) };
        long expected = 2147483648L;
        long actual = EndianUtils.readSwappedUnsignedInteger(target, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2208,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2209,actual);
        ByteArrayInputStream in = new ByteArrayInputStream(target);
        actual = EndianUtils.readSwappedUnsignedInteger(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2210,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2211,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnsignedOverrun_literalMutation2737() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation2737");
        byte[] target = new byte[]{ 0 , 0 , 0 , ((byte)(128)) };
        long expected = 2147483649L;
        long actual = EndianUtils.readSwappedUnsignedInteger(target, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2208,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2209,actual);
        ByteArrayInputStream in = new ByteArrayInputStream(target);
        actual = EndianUtils.readSwappedUnsignedInteger(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2210,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2211,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnsignedOverrun_literalMutation2738() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation2738");
        byte[] target = new byte[]{ 0 , 0 , 0 , ((byte)(128)) };
        long expected = 2147483648L;
        long actual = EndianUtils.readSwappedUnsignedInteger(target, -1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2208,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2209,actual);
        ByteArrayInputStream in = new ByteArrayInputStream(target);
        actual = EndianUtils.readSwappedUnsignedInteger(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2210,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2211,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

