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
        float f1 = java.lang.Float.intBitsToFloat(16909061);
        float f2 = java.lang.Float.intBitsToFloat(67305985);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2159,f2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2161,null,2160,org.apache.commons.io.EndianUtils.swapFloat(f1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapFloat_literalMutation4135() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapFloat_literalMutation4135");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2158,null,2157,org.apache.commons.io.EndianUtils.swapFloat(0.0F));
        float f1 = java.lang.Float.intBitsToFloat(16909059);
        float f2 = java.lang.Float.intBitsToFloat(67305985);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2159,f2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2161,null,2160,org.apache.commons.io.EndianUtils.swapFloat(f1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapFloat_literalMutation4136() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapFloat_literalMutation4136");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2158,null,2157,org.apache.commons.io.EndianUtils.swapFloat(0.0F));
        float f1 = java.lang.Float.intBitsToFloat(8454530);
        float f2 = java.lang.Float.intBitsToFloat(67305985);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2159,f2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2161,null,2160,org.apache.commons.io.EndianUtils.swapFloat(f1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapFloat_literalMutation4137() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapFloat_literalMutation4137");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2158,null,2157,org.apache.commons.io.EndianUtils.swapFloat(0.0F));
        float f1 = java.lang.Float.intBitsToFloat(33818120);
        float f2 = java.lang.Float.intBitsToFloat(67305985);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2159,f2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2161,null,2160,org.apache.commons.io.EndianUtils.swapFloat(f1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapFloat_literalMutation4138() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapFloat_literalMutation4138");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2158,null,2157,org.apache.commons.io.EndianUtils.swapFloat(0.0F));
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = java.lang.Float.intBitsToFloat(67305986);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2159,f2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2161,null,2160,org.apache.commons.io.EndianUtils.swapFloat(f1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapFloat_literalMutation4139() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapFloat_literalMutation4139");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2158,null,2157,org.apache.commons.io.EndianUtils.swapFloat(0.0F));
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = java.lang.Float.intBitsToFloat(67305984);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2159,f2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2161,null,2160,org.apache.commons.io.EndianUtils.swapFloat(f1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapFloat_literalMutation4140() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapFloat_literalMutation4140");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2158,null,2157,org.apache.commons.io.EndianUtils.swapFloat(0.0F));
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = java.lang.Float.intBitsToFloat(33652992);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2159,f2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2161,null,2160,org.apache.commons.io.EndianUtils.swapFloat(f1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapFloat_literalMutation4141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapFloat_literalMutation4141");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2158,null,2157,org.apache.commons.io.EndianUtils.swapFloat(0.0F));
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = java.lang.Float.intBitsToFloat(134611970);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2159,f2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2161,null,2160,org.apache.commons.io.EndianUtils.swapFloat(f1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapDouble() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapDouble");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,null,2152,org.apache.commons.io.EndianUtils.swapDouble(0.0));
        double d1 = java.lang.Double.longBitsToDouble(72623859790382848L);
        double d2 = java.lang.Double.longBitsToDouble(578437695752307201L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2154,d2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2156,null,2155,org.apache.commons.io.EndianUtils.swapDouble(d1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapDouble_literalMutation4129() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapDouble_literalMutation4129");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,null,2152,org.apache.commons.io.EndianUtils.swapDouble(0.0));
        double d1 = java.lang.Double.longBitsToDouble(36311929895191424L);
        double d2 = java.lang.Double.longBitsToDouble(578437695752307201L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2154,d2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2156,null,2155,org.apache.commons.io.EndianUtils.swapDouble(d1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapDouble_literalMutation4130() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapDouble_literalMutation4130");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,null,2152,org.apache.commons.io.EndianUtils.swapDouble(0.0));
        double d1 = java.lang.Double.longBitsToDouble(145247719580765696L);
        double d2 = java.lang.Double.longBitsToDouble(578437695752307201L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2154,d2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2156,null,2155,org.apache.commons.io.EndianUtils.swapDouble(d1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapDouble_literalMutation4131() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapDouble_literalMutation4131");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,null,2152,org.apache.commons.io.EndianUtils.swapDouble(0.0));
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = java.lang.Double.longBitsToDouble(578437695752307200L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2154,d2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2156,null,2155,org.apache.commons.io.EndianUtils.swapDouble(d1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapDouble_literalMutation4132() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapDouble_literalMutation4132");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,null,2152,org.apache.commons.io.EndianUtils.swapDouble(0.0));
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = java.lang.Double.longBitsToDouble(289218847876153600L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2154,d2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2156,null,2155,org.apache.commons.io.EndianUtils.swapDouble(d1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwapDouble_literalMutation4133() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwapDouble_literalMutation4133");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2153,null,2152,org.apache.commons.io.EndianUtils.swapDouble(0.0));
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = java.lang.Double.longBitsToDouble(1156875391504614400L);
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
        float f1 = java.lang.Float.intBitsToFloat(16909061);
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
public void testSymmetry_literalMutation4143() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetry_literalMutation4143");
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
public void testSymmetry_literalMutation4144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetry_literalMutation4144");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2197,null,2196,org.apache.commons.io.EndianUtils.swapShort(org.apache.commons.io.EndianUtils.swapShort(((short)(258)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2199,null,2198,org.apache.commons.io.EndianUtils.swapInteger(org.apache.commons.io.EndianUtils.swapInteger(16909060)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2201,null,2200,org.apache.commons.io.EndianUtils.swapLong(org.apache.commons.io.EndianUtils.swapLong(72623859790382856L)));
        float f1 = java.lang.Float.intBitsToFloat(8454530);
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
public void testSymmetry_literalMutation4145() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetry_literalMutation4145");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2197,null,2196,org.apache.commons.io.EndianUtils.swapShort(org.apache.commons.io.EndianUtils.swapShort(((short)(258)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2199,null,2198,org.apache.commons.io.EndianUtils.swapInteger(org.apache.commons.io.EndianUtils.swapInteger(16909060)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2201,null,2200,org.apache.commons.io.EndianUtils.swapLong(org.apache.commons.io.EndianUtils.swapLong(72623859790382856L)));
        float f1 = java.lang.Float.intBitsToFloat(33818120);
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
public void testSymmetry_literalMutation4146() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetry_literalMutation4146");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2197,null,2196,org.apache.commons.io.EndianUtils.swapShort(org.apache.commons.io.EndianUtils.swapShort(((short)(258)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2199,null,2198,org.apache.commons.io.EndianUtils.swapInteger(org.apache.commons.io.EndianUtils.swapInteger(16909060)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2201,null,2200,org.apache.commons.io.EndianUtils.swapLong(org.apache.commons.io.EndianUtils.swapLong(72623859790382856L)));
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2202,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2204,null,2203,org.apache.commons.io.EndianUtils.swapFloat(org.apache.commons.io.EndianUtils.swapFloat(f1)));
        double d1 = java.lang.Double.longBitsToDouble(72623859790382848L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2205,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2207,null,2206,org.apache.commons.io.EndianUtils.swapDouble(org.apache.commons.io.EndianUtils.swapDouble(d1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests all swapXxxx methods for symmetry when going from one endian
     * to another and back again.
     */
public void testSymmetry_literalMutation4147() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetry_literalMutation4147");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2197,null,2196,org.apache.commons.io.EndianUtils.swapShort(org.apache.commons.io.EndianUtils.swapShort(((short)(258)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2199,null,2198,org.apache.commons.io.EndianUtils.swapInteger(org.apache.commons.io.EndianUtils.swapInteger(16909060)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2201,null,2200,org.apache.commons.io.EndianUtils.swapLong(org.apache.commons.io.EndianUtils.swapLong(72623859790382856L)));
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2202,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2204,null,2203,org.apache.commons.io.EndianUtils.swapFloat(org.apache.commons.io.EndianUtils.swapFloat(f1)));
        double d1 = java.lang.Double.longBitsToDouble(36311929895191424L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2205,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2207,null,2206,org.apache.commons.io.EndianUtils.swapDouble(org.apache.commons.io.EndianUtils.swapDouble(d1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests all swapXxxx methods for symmetry when going from one endian
     * to another and back again.
     */
public void testSymmetry_literalMutation4148() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetry_literalMutation4148");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2197,null,2196,org.apache.commons.io.EndianUtils.swapShort(org.apache.commons.io.EndianUtils.swapShort(((short)(258)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2199,null,2198,org.apache.commons.io.EndianUtils.swapInteger(org.apache.commons.io.EndianUtils.swapInteger(16909060)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2201,null,2200,org.apache.commons.io.EndianUtils.swapLong(org.apache.commons.io.EndianUtils.swapLong(72623859790382856L)));
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2202,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2204,null,2203,org.apache.commons.io.EndianUtils.swapFloat(org.apache.commons.io.EndianUtils.swapFloat(f1)));
        double d1 = java.lang.Double.longBitsToDouble(145247719580765696L);
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

    public void testReadSwappedShort_literalMutation4103() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedShort_literalMutation4103");
        byte[] bytes = new byte[]{ 4 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2141,null,2140,org.apache.commons.io.EndianUtils.readSwappedShort(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,null,2142,org.apache.commons.io.EndianUtils.readSwappedShort(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedShort_literalMutation4104() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedShort_literalMutation4104");
        byte[] bytes = new byte[]{ 3 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2141,null,2140,org.apache.commons.io.EndianUtils.readSwappedShort(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,null,2142,org.apache.commons.io.EndianUtils.readSwappedShort(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedShort_literalMutation4105() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedShort_literalMutation4105");
        byte[] bytes = new byte[]{ 2 , 2 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2141,null,2140,org.apache.commons.io.EndianUtils.readSwappedShort(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,null,2142,org.apache.commons.io.EndianUtils.readSwappedShort(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedShort_literalMutation4106() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedShort_literalMutation4106");
        byte[] bytes = new byte[]{ 2 , 0 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2141,null,2140,org.apache.commons.io.EndianUtils.readSwappedShort(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,null,2142,org.apache.commons.io.EndianUtils.readSwappedShort(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedShort_literalMutation4107() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedShort_literalMutation4107");
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
        byte[] bytes = new byte[1];
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

    public void testWriteSwappedShort_literalMutation4275() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4275");
        byte[] bytes = new byte[4];
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

    public void testWriteSwappedShort_literalMutation4276() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4276");
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

    public void testWriteSwappedShort_literalMutation4277() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4277");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, 1, ((short)(258)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedShort_literalMutation4278() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4278");
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

    public void testWriteSwappedShort_literalMutation4279() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4279");
        byte[] bytes = new byte[2];
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

    public void testWriteSwappedShort_literalMutation4280() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4280");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(259)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedShort_literalMutation4281() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4281");
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

    public void testWriteSwappedShort_literalMutation4282() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4282");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(129)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedShort_literalMutation4283() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4283");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(516)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedShort_literalMutation4284() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4284");
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

    public void testWriteSwappedShort_literalMutation4285() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4285");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(258)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedShort_literalMutation4286() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4286");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(258)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(3);
        EndianUtils.writeSwappedShort(baos, ((short)(258)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedShort_literalMutation4287() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4287");
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

    public void testWriteSwappedShort_literalMutation4288() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4288");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(258)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(257)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedShort_literalMutation4289() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4289");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(258)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(129)));
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedShort_literalMutation4290() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedShort_literalMutation4290");
        byte[] bytes = new byte[2];
        EndianUtils.writeSwappedShort(bytes, 0, ((short)(258)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,bytes[1]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedShort(baos, ((short)(516)));
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
        byte[] bytes = new byte[]{ 1 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2149,null,2148,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,null,2150,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedShort_literalMutation4123() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedShort_literalMutation4123");
        byte[] bytes = new byte[]{ 4 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2149,null,2148,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,null,2150,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedShort_literalMutation4124() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedShort_literalMutation4124");
        byte[] bytes = new byte[]{ 3 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2149,null,2148,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,null,2150,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedShort_literalMutation4125() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedShort_literalMutation4125");
        byte[] bytes = new byte[]{ 2 , 2 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2149,null,2148,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,null,2150,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedShort_literalMutation4126() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedShort_literalMutation4126");
        byte[] bytes = new byte[]{ 2 , 0 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2149,null,2148,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,null,2150,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedShort_literalMutation4127() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedShort_literalMutation4127");
        byte[] bytes = new byte[]{ 2 , 0 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2149,null,2148,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,null,2150,org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger");
        byte[] bytes = new byte[]{ 2 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation4059() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation4059");
        byte[] bytes = new byte[]{ 8 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation4060() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation4060");
        byte[] bytes = new byte[]{ 5 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation4061() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation4061");
        byte[] bytes = new byte[]{ 3 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation4062() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation4062");
        byte[] bytes = new byte[]{ 4 , 4 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation4063() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation4063");
        byte[] bytes = new byte[]{ 4 , 2 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation4064() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation4064");
        byte[] bytes = new byte[]{ 4 , 1 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation4065() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation4065");
        byte[] bytes = new byte[]{ 4 , 6 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation4066() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation4066");
        byte[] bytes = new byte[]{ 4 , 3 , 1 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation4067() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation4067");
        byte[] bytes = new byte[]{ 4 , 3 , 4 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation4068() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation4068");
        byte[] bytes = new byte[]{ 4 , 3 , 3 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation4069() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation4069");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 2 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation4070() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation4070");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 0 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,null,2132,org.apache.commons.io.EndianUtils.readSwappedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,null,2134,org.apache.commons.io.EndianUtils.readSwappedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedInteger_literalMutation4071() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedInteger_literalMutation4071");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 0 };
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
        byte[] bytes = new byte[2];
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

    public void testWriteSwappedInteger_literalMutation4239() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4239");
        byte[] bytes = new byte[8];
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

    public void testWriteSwappedInteger_literalMutation4240() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4240");
        byte[] bytes = new byte[5];
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

    public void testWriteSwappedInteger_literalMutation4241() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4241");
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

    public void testWriteSwappedInteger_literalMutation4242() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4242");
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

    public void testWriteSwappedInteger_literalMutation4243() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4243");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, -1, 16909060);
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

    public void testWriteSwappedInteger_literalMutation4244() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4244");
        byte[] bytes = new byte[4];
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

    public void testWriteSwappedInteger_literalMutation4245() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4245");
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

    public void testWriteSwappedInteger_literalMutation4246() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4246");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 0, 16909059);
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

    public void testWriteSwappedInteger_literalMutation4247() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4247");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 0, 8454530);
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

    public void testWriteSwappedInteger_literalMutation4248() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4248");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 0, 33818120);
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

    public void testWriteSwappedInteger_literalMutation4249() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4249");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 0, 16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedInteger(baos, 16909060);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedInteger_literalMutation4250() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4250");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 0, 16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedInteger(baos, 16909060);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedInteger_literalMutation4251() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4251");
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

    public void testWriteSwappedInteger_literalMutation4252() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4252");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 0, 16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(3);
        EndianUtils.writeSwappedInteger(baos, 16909060);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedInteger_literalMutation4253() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4253");
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

    public void testWriteSwappedInteger_literalMutation4254() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4254");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 0, 16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedInteger(baos, 16909059);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedInteger_literalMutation4255() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4255");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 0, 16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedInteger(baos, 8454530);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedInteger_literalMutation4256() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedInteger_literalMutation4256");
        byte[] bytes = new byte[4];
        EndianUtils.writeSwappedInteger(bytes, 0, 16909060);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2238,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        EndianUtils.writeSwappedInteger(baos, 33818120);
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
        byte[] bytes = new byte[]{ 2 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation4109() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation4109");
        byte[] bytes = new byte[]{ 8 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation4110() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation4110");
        byte[] bytes = new byte[]{ 5 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation4111() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation4111");
        byte[] bytes = new byte[]{ 3 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation4112() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation4112");
        byte[] bytes = new byte[]{ 4 , 4 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation4113() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation4113");
        byte[] bytes = new byte[]{ 4 , 2 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation4114() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation4114");
        byte[] bytes = new byte[]{ 4 , 1 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation4115() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation4115");
        byte[] bytes = new byte[]{ 4 , 6 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation4116() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation4116");
        byte[] bytes = new byte[]{ 4 , 3 , 1 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation4117() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation4117");
        byte[] bytes = new byte[]{ 4 , 3 , 4 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation4118() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation4118");
        byte[] bytes = new byte[]{ 4 , 3 , 3 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation4119() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation4119");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 2 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation4120() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation4120");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 0 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedUnsignedInteger_literalMutation4121() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedUnsignedInteger_literalMutation4121");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 0 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,null,2144,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2147,null,2146,org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong");
        byte[] bytes = new byte[]{ 4 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4073() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4073");
        byte[] bytes = new byte[]{ 16 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4074() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4074");
        byte[] bytes = new byte[]{ 9 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4075() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4075");
        byte[] bytes = new byte[]{ 7 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4076() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4076");
        byte[] bytes = new byte[]{ 8 , 8 , 6 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4077() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4077");
        byte[] bytes = new byte[]{ 8 , 6 , 6 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4078() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4078");
        byte[] bytes = new byte[]{ 8 , 3 , 6 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4079() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4079");
        byte[] bytes = new byte[]{ 8 , 14 , 6 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4080() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4080");
        byte[] bytes = new byte[]{ 8 , 7 , 5 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4081() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4081");
        byte[] bytes = new byte[]{ 8 , 7 , 3 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4082() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4082");
        byte[] bytes = new byte[]{ 8 , 7 , 12 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4083() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4083");
        byte[] bytes = new byte[]{ 8 , 7 , 7 , 5 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4084() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4084");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 4 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4085() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4085");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 2 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4086() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4086");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 10 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4087() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4087");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 6 , 4 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4088() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4088");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 2 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4089() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4089");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 8 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4090() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4090");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 5 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4091() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4091");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 3 , 3 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4092() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4092");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 4 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4093() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4093");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 2 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4094() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4094");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 1 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4095() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4095");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 6 , 2 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4096() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4096");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 1 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4097() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4097");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 4 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4098() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4098");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 3 , 1 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4099() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4099");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 2 , 2 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4100() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4100");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 2 , 0 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,null,2136,org.apache.commons.io.EndianUtils.readSwappedLong(bytes, 0));
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,null,2138,org.apache.commons.io.EndianUtils.readSwappedLong(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedLong_literalMutation4101() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedLong_literalMutation4101");
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
        byte[] bytes = new byte[4];
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

    public void testWriteSwappedLong_literalMutation4258() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4258");
        byte[] bytes = new byte[16];
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

    public void testWriteSwappedLong_literalMutation4259() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4259");
        byte[] bytes = new byte[9];
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

    public void testWriteSwappedLong_literalMutation4260() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4260");
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

    public void testWriteSwappedLong_literalMutation4261() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4261");
        byte[] bytes = new byte[8];
        EndianUtils.writeSwappedLong(bytes, 1, 72623859790382856L);
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

    public void testWriteSwappedLong_literalMutation4262() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4262");
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

    public void testWriteSwappedLong_literalMutation4263() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4263");
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

    public void testWriteSwappedLong_literalMutation4264() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4264");
        byte[] bytes = new byte[8];
        EndianUtils.writeSwappedLong(bytes, 0, 72623859790382848L);
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

    public void testWriteSwappedLong_literalMutation4265() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4265");
        byte[] bytes = new byte[8];
        EndianUtils.writeSwappedLong(bytes, 0, 36311929895191424L);
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

    public void testWriteSwappedLong_literalMutation4266() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4266");
        byte[] bytes = new byte[8];
        EndianUtils.writeSwappedLong(bytes, 0, 145247719580765696L);
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

    public void testWriteSwappedLong_literalMutation4267() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4267");
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
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
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

    public void testWriteSwappedLong_literalMutation4268() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4268");
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
        ByteArrayOutputStream baos = new ByteArrayOutputStream(16);
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

    public void testWriteSwappedLong_literalMutation4269() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4269");
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
        ByteArrayOutputStream baos = new ByteArrayOutputStream(9);
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

    public void testWriteSwappedLong_literalMutation4270() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4270");
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

    public void testWriteSwappedLong_literalMutation4271() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4271");
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
        EndianUtils.writeSwappedLong(baos, 72623859790382848L);
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

    public void testWriteSwappedLong_literalMutation4272() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4272");
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
        EndianUtils.writeSwappedLong(baos, 36311929895191424L);
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

    public void testWriteSwappedLong_literalMutation4273() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedLong_literalMutation4273");
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
        EndianUtils.writeSwappedLong(baos, 145247719580765696L);
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
        byte[] bytes = new byte[]{ 2 , 3 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation4038() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4038");
        byte[] bytes = new byte[]{ 8 , 3 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation4039() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4039");
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

    public void testReadSwappedFloat_literalMutation4040() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4040");
        byte[] bytes = new byte[]{ 3 , 3 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation4041() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4041");
        byte[] bytes = new byte[]{ 4 , 4 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation4042() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4042");
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

    public void testReadSwappedFloat_literalMutation4043() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4043");
        byte[] bytes = new byte[]{ 4 , 1 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation4044() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4044");
        byte[] bytes = new byte[]{ 4 , 6 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation4045() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4045");
        byte[] bytes = new byte[]{ 4 , 3 , 1 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation4046() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4046");
        byte[] bytes = new byte[]{ 4 , 3 , 4 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation4047() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4047");
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

    public void testReadSwappedFloat_literalMutation4048() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4048");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 2 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation4049() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4049");
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

    public void testReadSwappedFloat_literalMutation4050() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4050");
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

    public void testReadSwappedFloat_literalMutation4051() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4051");
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

    public void testReadSwappedFloat_literalMutation4052() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4052");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909059);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation4053() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4053");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(8454530);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation4054() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4054");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(33818120);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation4055() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4055");
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

    public void testReadSwappedFloat_literalMutation4056() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4056");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, -1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,f2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,null,2130,org.apache.commons.io.EndianUtils.readSwappedFloat(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedFloat_literalMutation4057() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedFloat_literalMutation4057");
        byte[] bytes = new byte[]{ 4 , 3 , 2 , 1 };
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        float f2 = EndianUtils.readSwappedFloat(bytes, 0);
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
        byte[] bytes = new byte[2];
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

    public void testWriteSwappedFloat_literalMutation4224() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation4224");
        byte[] bytes = new byte[8];
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

    public void testWriteSwappedFloat_literalMutation4225() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation4225");
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

    public void testWriteSwappedFloat_literalMutation4226() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation4226");
        byte[] bytes = new byte[3];
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

    public void testWriteSwappedFloat_literalMutation4227() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation4227");
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

    public void testWriteSwappedFloat_literalMutation4228() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation4228");
        byte[] bytes = new byte[4];
        float f1 = java.lang.Float.intBitsToFloat(16909059);
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

    public void testWriteSwappedFloat_literalMutation4229() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation4229");
        byte[] bytes = new byte[4];
        float f1 = java.lang.Float.intBitsToFloat(8454530);
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

    public void testWriteSwappedFloat_literalMutation4230() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation4230");
        byte[] bytes = new byte[4];
        float f1 = java.lang.Float.intBitsToFloat(33818120);
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

    public void testWriteSwappedFloat_literalMutation4231() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation4231");
        byte[] bytes = new byte[4];
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        EndianUtils.writeSwappedFloat(bytes, 1, f1);
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

    public void testWriteSwappedFloat_literalMutation4232() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation4232");
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

    public void testWriteSwappedFloat_literalMutation4233() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation4233");
        byte[] bytes = new byte[4];
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

    public void testWriteSwappedFloat_literalMutation4234() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation4234");
        byte[] bytes = new byte[4];
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        EndianUtils.writeSwappedFloat(bytes, 0, f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2228,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2230,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        EndianUtils.writeSwappedFloat(baos, f1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2232,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2234,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedFloat_literalMutation4235() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation4235");
        byte[] bytes = new byte[4];
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        EndianUtils.writeSwappedFloat(bytes, 0, f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2228,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2230,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        EndianUtils.writeSwappedFloat(baos, f1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2232,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2234,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedFloat_literalMutation4236() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation4236");
        byte[] bytes = new byte[4];
        float f1 = java.lang.Float.intBitsToFloat(16909060);
        EndianUtils.writeSwappedFloat(bytes, 0, f1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2228,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2230,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,bytes[3]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(5);
        EndianUtils.writeSwappedFloat(baos, f1);
        bytes = baos.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2232,bytes[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,bytes[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2234,bytes[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,bytes[3]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteSwappedFloat_literalMutation4237() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedFloat_literalMutation4237");
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
        byte[] bytes = new byte[]{ 4 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4002() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4002");
        byte[] bytes = new byte[]{ 16 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4003() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4003");
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

    public void testReadSwappedDouble_literalMutation4004() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4004");
        byte[] bytes = new byte[]{ 7 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4005() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4005");
        byte[] bytes = new byte[]{ 8 , 8 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4006() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4006");
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

    public void testReadSwappedDouble_literalMutation4007() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4007");
        byte[] bytes = new byte[]{ 8 , 3 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4008() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4008");
        byte[] bytes = new byte[]{ 8 , 14 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4009() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4009");
        byte[] bytes = new byte[]{ 8 , 7 , 5 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4010() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4010");
        byte[] bytes = new byte[]{ 8 , 7 , 3 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4011() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4011");
        byte[] bytes = new byte[]{ 8 , 7 , 12 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4012() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4012");
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

    public void testReadSwappedDouble_literalMutation4013() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4013");
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

    public void testReadSwappedDouble_literalMutation4014() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4014");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 2 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4015() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4015");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 10 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4016() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4016");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 6 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4017() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4017");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 2 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4018() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4018");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 8 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4019() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4019");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 5 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4020() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4020");
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

    public void testReadSwappedDouble_literalMutation4021() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4021");
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

    public void testReadSwappedDouble_literalMutation4022() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4022");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 2 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4023() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4023");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 1 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4024() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4024");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 6 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4025() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4025");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 1 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4026() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4026");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 4 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4027() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4027");
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

    public void testReadSwappedDouble_literalMutation4028() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4028");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 2 , 2 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4029() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4029");
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

    public void testReadSwappedDouble_literalMutation4030() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4030");
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

    public void testReadSwappedDouble_literalMutation4031() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4031");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382848L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4032() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4032");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(36311929895191424L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4033() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4033");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(145247719580765696L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4034() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4034");
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

    public void testReadSwappedDouble_literalMutation4035() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4035");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, -1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2123,d2);
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,d1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,null,2125,org.apache.commons.io.EndianUtils.readSwappedDouble(input));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadSwappedDouble_literalMutation4036() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadSwappedDouble_literalMutation4036");
        byte[] bytes = new byte[]{ 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        double d2 = EndianUtils.readSwappedDouble(bytes, 0);
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
        byte[] bytes = new byte[4];
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

    public void testWriteSwappedDouble_literalMutation4210() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation4210");
        byte[] bytes = new byte[16];
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

    public void testWriteSwappedDouble_literalMutation4211() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation4211");
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

    public void testWriteSwappedDouble_literalMutation4212() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation4212");
        byte[] bytes = new byte[7];
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

    public void testWriteSwappedDouble_literalMutation4213() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation4213");
        byte[] bytes = new byte[8];
        double d1 = java.lang.Double.longBitsToDouble(72623859790382848L);
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

    public void testWriteSwappedDouble_literalMutation4214() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation4214");
        byte[] bytes = new byte[8];
        double d1 = java.lang.Double.longBitsToDouble(36311929895191424L);
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

    public void testWriteSwappedDouble_literalMutation4215() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation4215");
        byte[] bytes = new byte[8];
        double d1 = java.lang.Double.longBitsToDouble(145247719580765696L);
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

    public void testWriteSwappedDouble_literalMutation4216() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation4216");
        byte[] bytes = new byte[8];
        double d1 = java.lang.Double.longBitsToDouble(72623859790382856L);
        EndianUtils.writeSwappedDouble(bytes, 1, d1);
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

    public void testWriteSwappedDouble_literalMutation4217() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation4217");
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

    public void testWriteSwappedDouble_literalMutation4218() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation4218");
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

    public void testWriteSwappedDouble_literalMutation4219() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation4219");
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
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
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

    public void testWriteSwappedDouble_literalMutation4220() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation4220");
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
        ByteArrayOutputStream baos = new ByteArrayOutputStream(16);
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

    public void testWriteSwappedDouble_literalMutation4221() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation4221");
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
        ByteArrayOutputStream baos = new ByteArrayOutputStream(9);
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

    public void testWriteSwappedDouble_literalMutation4222() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteSwappedDouble_literalMutation4222");
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

    @Test(timeout = 1000)
    public void testSymmetryOfLong_add1216() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_add1216");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
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
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong");
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

    public void testSymmetryOfLong_literalMutation4150() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4150");
        double[] tests = new double[]{ 35.345 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4151() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4151");
        double[] tests = new double[]{ 17.1725 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4152() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4152");
        double[] tests = new double[]{ 68.69 , -345.5645 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4153() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4153");
        double[] tests = new double[]{ 34.345 , -346.5645 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4154() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4154");
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

    public void testSymmetryOfLong_literalMutation4155() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4155");
        double[] tests = new double[]{ 34.345 , 172.78225 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4156() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4156");
        double[] tests = new double[]{ 34.345 , 691.129 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4157() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4157");
        double[] tests = new double[]{ 34.345 , 346.5645 , 546.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4158() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4158");
        double[] tests = new double[]{ 34.345 , 346.5645 , 544.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4159() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4159");
        double[] tests = new double[]{ 34.345 , 346.5645 , 272.56 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4160() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4160");
        double[] tests = new double[]{ 34.345 , 346.5645 , 1090.24 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4161() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4161");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 9.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4162");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 11.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4163");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 5.0215 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4164() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4164");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 20.086 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4165() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4165");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 8.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4166() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4166");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 3.5617283945615 };
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

    public void testSymmetryOfLong_literalMutation4167() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4167");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 14.246913578246 };
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

    public void testSymmetryOfLong_literalMutation4168() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4168");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 6.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4169() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4169");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[4];
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

    public void testSymmetryOfLong_literalMutation4170() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4170");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[16];
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

    public void testSymmetryOfLong_literalMutation4171() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4171");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[9];
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

    public void testSymmetryOfLong_literalMutation4172() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4172");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4173() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4173");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 1, ln1);
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

    public void testSymmetryOfLong_literalMutation4174() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4174");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4175() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4175");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4176() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4176");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4177() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4177");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, -1);
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

    public void testSymmetryOfLong_literalMutation4178() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4178");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4179() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4179");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[4];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation4180() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4180");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[16];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation4181() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4181");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4182() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4182");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[7];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation4183() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4183");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 1, test);
            double val = EndianUtils.readSwappedDouble(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation4184() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4184");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4185() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4185");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4186() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4186");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
        for (double test : tests) {
            byte[] buffer = new byte[8];
            long ln1 = java.lang.Double.doubleToLongBits(test);
            EndianUtils.writeSwappedLong(buffer, 0, ln1);
            long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,ln1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,ln2);
            buffer = new byte[8];
            EndianUtils.writeSwappedDouble(buffer, 0, test);
            double val = EndianUtils.readSwappedDouble(buffer, 1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,test);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,val);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSymmetryOfLong_literalMutation4187() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4187");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
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

    public void testSymmetryOfLong_literalMutation4188() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_literalMutation4188");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
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
    public void testSymmetryOfLong_remove943() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSymmetryOfLong_remove943");
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
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
        double[] tests = new double[]{ 34.345 , 346.5645 , 545.12 , 10.043 , 7.123456789123 };
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
        byte[] target = new byte[]{ 1 , 0 , 0 , ((byte)(128)) };
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

    public void testUnsignedOverrun_literalMutation4190() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4190");
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

    public void testUnsignedOverrun_literalMutation4191() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4191");
        byte[] target = new byte[]{ 0 , 0 , 0 , ((byte)(128)) };
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

    public void testUnsignedOverrun_literalMutation4192() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4192");
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

    public void testUnsignedOverrun_literalMutation4193() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4193");
        byte[] target = new byte[]{ 0 , -1 , 0 , ((byte)(128)) };
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

    public void testUnsignedOverrun_literalMutation4194() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4194");
        byte[] target = new byte[]{ 0 , 0 , 0 , ((byte)(128)) };
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

    public void testUnsignedOverrun_literalMutation4195() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4195");
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

    public void testUnsignedOverrun_literalMutation4196() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4196");
        byte[] target = new byte[]{ 0 , 0 , -1 , ((byte)(128)) };
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

    public void testUnsignedOverrun_literalMutation4197() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4197");
        byte[] target = new byte[]{ 0 , 0 , 0 , ((byte)(128)) };
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

    public void testUnsignedOverrun_literalMutation4198() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4198");
        byte[] target = new byte[]{ 0 , 0 , 0 , ((byte)(129)) };
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

    public void testUnsignedOverrun_literalMutation4199() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4199");
        byte[] target = new byte[]{ 0 , 0 , 0 , ((byte)(64)) };
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

    public void testUnsignedOverrun_literalMutation4200() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4200");
        byte[] target = new byte[]{ 0 , 0 , 0 , ((byte)(256)) };
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

    public void testUnsignedOverrun_literalMutation4201() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4201");
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

    public void testUnsignedOverrun_literalMutation4202() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4202");
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

    public void testUnsignedOverrun_literalMutation4203() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4203");
        byte[] target = new byte[]{ 0 , 0 , 0 , ((byte)(128)) };
        long expected = 2147483647L;
        long actual = EndianUtils.readSwappedUnsignedInteger(target, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2208,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2209,actual);
        ByteArrayInputStream in = new ByteArrayInputStream(target);
        actual = EndianUtils.readSwappedUnsignedInteger(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2210,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2211,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnsignedOverrun_literalMutation4204() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4204");
        byte[] target = new byte[]{ 0 , 0 , 0 , ((byte)(128)) };
        long expected = 1073741824L;
        long actual = EndianUtils.readSwappedUnsignedInteger(target, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2208,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2209,actual);
        ByteArrayInputStream in = new ByteArrayInputStream(target);
        actual = EndianUtils.readSwappedUnsignedInteger(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2210,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2211,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnsignedOverrun_literalMutation4205() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4205");
        byte[] target = new byte[]{ 0 , 0 , 0 , ((byte)(128)) };
        long expected = 4294967296L;
        long actual = EndianUtils.readSwappedUnsignedInteger(target, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2208,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2209,actual);
        ByteArrayInputStream in = new ByteArrayInputStream(target);
        actual = EndianUtils.readSwappedUnsignedInteger(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2210,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2211,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnsignedOverrun_literalMutation4206() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4206");
        byte[] target = new byte[]{ 0 , 0 , 0 , ((byte)(128)) };
        long expected = 2147483648L;
        long actual = EndianUtils.readSwappedUnsignedInteger(target, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2208,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2209,actual);
        ByteArrayInputStream in = new ByteArrayInputStream(target);
        actual = EndianUtils.readSwappedUnsignedInteger(in);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2210,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2211,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnsignedOverrun_literalMutation4207() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4207");
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

    public void testUnsignedOverrun_literalMutation4208() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsignedOverrun_literalMutation4208");
        byte[] target = new byte[]{ 0 , 0 , 0 , ((byte)(128)) };
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
}

