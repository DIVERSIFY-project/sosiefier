package org.apache.commons.collections4;

import java.util.ArrayList;
import org.apache.commons.collections4.functors.CloneTransformer;
import java.util.Collection;
import org.apache.commons.collections4.functors.ExceptionTransformer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.functors.NOPTransformer;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Tests the TransformerUtils class.
 * 
 * @version $Id$
 * @since 3.0
 */
public class TransformerUtilsTest extends TestCase {
    private static final Object cObject = new Object();

    private static final Object cString = "Hello";

    private static final Object cInteger = Integer.valueOf(6);

    /** 
     * Set up instance variables required by this test case.
     */
@Override
    public void setUp() {
    }

    /** 
     * Tear down instance variables required by this test case.
     */
@Override
    public void tearDown() {
    }

    @Test(timeout = 1000)
    public void testExceptionTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8292,null,8291,org.apache.commons.collections4.TransformerUtils.exceptionTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8294,null,8293,org.apache.commons.collections4.TransformerUtils.exceptionTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8294,null,8293,org.apache.commons.collections4.TransformerUtils.exceptionTransformer());
        try {
            org.apache.commons.collections4.TransformerUtils.exceptionTransformer().transform(null);
            org.apache.commons.collections4.TransformerUtils.exceptionTransformer().transform(null);
        } catch (final FunctorException ex) {
            try {
                org.apache.commons.collections4.TransformerUtils.exceptionTransformer().transform(cString);
            } catch (final FunctorException ex2) {
                return ;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExceptionTransformer_add2986() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionTransformer_add2986");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8292,null,8291,org.apache.commons.collections4.TransformerUtils.exceptionTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8294,null,8293,org.apache.commons.collections4.TransformerUtils.exceptionTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8294,null,8293,org.apache.commons.collections4.TransformerUtils.exceptionTransformer());
        try {
            org.apache.commons.collections4.TransformerUtils.exceptionTransformer().transform(null);
        } catch (final FunctorException ex) {
            try {
                org.apache.commons.collections4.TransformerUtils.exceptionTransformer().transform(cString);
                org.apache.commons.collections4.TransformerUtils.exceptionTransformer().transform(cString);
            } catch (final FunctorException ex2) {
                return ;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8370,null,8369,org.apache.commons.collections4.TransformerUtils.nullTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8372,null,8371,org.apache.commons.collections4.TransformerUtils.nullTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8372,null,8371,org.apache.commons.collections4.TransformerUtils.nullTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8374,org.apache.commons.collections4.TransformerUtils.nullTransformer(),8373,org.apache.commons.collections4.TransformerUtils.nullTransformer().transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8376,org.apache.commons.collections4.TransformerUtils.nullTransformer(),8375,org.apache.commons.collections4.TransformerUtils.nullTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8378,org.apache.commons.collections4.TransformerUtils.nullTransformer(),8377,org.apache.commons.collections4.TransformerUtils.nullTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8380,org.apache.commons.collections4.TransformerUtils.nullTransformer(),8379,org.apache.commons.collections4.TransformerUtils.nullTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNopTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNopTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8355,null,8354,org.apache.commons.collections4.TransformerUtils.nullTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8357,null,8356,org.apache.commons.collections4.TransformerUtils.nullTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8357,null,8356,org.apache.commons.collections4.TransformerUtils.nullTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8359,org.apache.commons.collections4.TransformerUtils.nopTransformer(),8358,org.apache.commons.collections4.TransformerUtils.nopTransformer().transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8360,org.apache.commons.collections4.TransformerUtilsTest.cObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8362,org.apache.commons.collections4.TransformerUtils.nopTransformer(),8361,org.apache.commons.collections4.TransformerUtils.nopTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8363,org.apache.commons.collections4.TransformerUtilsTest.cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8365,org.apache.commons.collections4.TransformerUtils.nopTransformer(),8364,org.apache.commons.collections4.TransformerUtils.nopTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8366,org.apache.commons.collections4.TransformerUtilsTest.cInteger);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8368,org.apache.commons.collections4.TransformerUtils.nopTransformer(),8367,org.apache.commons.collections4.TransformerUtils.nopTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstantTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstantTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8276,org.apache.commons.collections4.TransformerUtilsTest.cObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8278,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject),8277,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8279,org.apache.commons.collections4.TransformerUtilsTest.cObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8281,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject),8280,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8282,org.apache.commons.collections4.TransformerUtilsTest.cObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8284,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject),8283,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8285,org.apache.commons.collections4.TransformerUtilsTest.cObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8287,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject),8286,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8288,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8290,null,8289,org.apache.commons.collections4.TransformerUtils.constantTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCloneTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloneTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8266,org.apache.commons.collections4.TransformerUtils.cloneTransformer(),8265,org.apache.commons.collections4.TransformerUtils.cloneTransformer().transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8267,org.apache.commons.collections4.TransformerUtilsTest.cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8269,org.apache.commons.collections4.TransformerUtils.cloneTransformer(),8268,org.apache.commons.collections4.TransformerUtils.cloneTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8270,org.apache.commons.collections4.TransformerUtilsTest.cInteger);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8272,org.apache.commons.collections4.TransformerUtils.cloneTransformer(),8271,org.apache.commons.collections4.TransformerUtils.cloneTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8273,org.apache.commons.collections4.TransformerUtilsTest.cObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8275,org.apache.commons.collections4.TransformerUtils.cloneTransformer(),8274,org.apache.commons.collections4.TransformerUtils.cloneTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @Test(timeout = 1000)
    public void testMapTransformer_add3001() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapTransformer_add3001");
        final Map<java.lang.Object, java.lang.Integer> map = new HashMap<java.lang.Object, java.lang.Integer>();
        map.put(null, 0);
        map.put(null, 0);
        map.put(cObject, 1);
        map.put(cString, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8338,null,8337,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8340,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8339,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8342,null,8341,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8344,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8343,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8346,null,8345,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8348,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8347,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8350,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8349,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8351,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8353,null,8352,org.apache.commons.collections4.TransformerUtils.mapTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @Test(timeout = 1000)
    public void testMapTransformer_add3002() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapTransformer_add3002");
        final Map<java.lang.Object, java.lang.Integer> map = new HashMap<java.lang.Object, java.lang.Integer>();
        map.put(null, 0);
        map.put(cObject, 1);
        map.put(cObject, 1);
        map.put(cString, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8338,null,8337,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8340,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8339,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8342,null,8341,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8344,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8343,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8346,null,8345,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8348,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8347,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8350,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8349,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8351,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8353,null,8352,org.apache.commons.collections4.TransformerUtils.mapTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @Test(timeout = 1000)
    public void testMapTransformer_add3003() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapTransformer_add3003");
        final Map<java.lang.Object, java.lang.Integer> map = new HashMap<java.lang.Object, java.lang.Integer>();
        map.put(null, 0);
        map.put(cObject, 1);
        map.put(cString, 2);
        map.put(cString, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8338,null,8337,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8340,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8339,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8342,null,8341,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8344,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8343,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8346,null,8345,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8348,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8347,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8350,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8349,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8351,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8353,null,8352,org.apache.commons.collections4.TransformerUtils.mapTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testMapTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapTransformer");
        final Map<java.lang.Object, java.lang.Integer> map = new HashMap<java.lang.Object, java.lang.Integer>();
        map.put(null, 0);
        map.put(cObject, 1);
        map.put(cString, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8338,null,8337,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8340,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8339,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8342,null,8341,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8344,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8343,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8346,null,8345,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8348,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8347,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8350,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8349,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8351,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8353,null,8352,org.apache.commons.collections4.TransformerUtils.mapTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testMapTransformer_literalMutation3108() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapTransformer_literalMutation3108");
        final Map<java.lang.Object, java.lang.Integer> map = new HashMap<java.lang.Object, java.lang.Integer>();
        map.put(null, 1);
        map.put(cObject, 1);
        map.put(cString, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8338,null,8337,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8340,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8339,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8342,null,8341,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8344,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8343,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8346,null,8345,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8348,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8347,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8350,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8349,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8351,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8353,null,8352,org.apache.commons.collections4.TransformerUtils.mapTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testMapTransformer_literalMutation3109() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapTransformer_literalMutation3109");
        final Map<java.lang.Object, java.lang.Integer> map = new HashMap<java.lang.Object, java.lang.Integer>();
        map.put(null, 0);
        map.put(cObject, 0);
        map.put(cString, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8338,null,8337,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8340,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8339,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8342,null,8341,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8344,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8343,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8346,null,8345,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8348,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8347,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8350,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8349,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8351,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8353,null,8352,org.apache.commons.collections4.TransformerUtils.mapTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testMapTransformer_literalMutation3110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapTransformer_literalMutation3110");
        final Map<java.lang.Object, java.lang.Integer> map = new HashMap<java.lang.Object, java.lang.Integer>();
        map.put(null, 0);
        map.put(cObject, 1);
        map.put(cString, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8338,null,8337,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8340,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8339,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8342,null,8341,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8344,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8343,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8346,null,8345,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8348,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8347,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8350,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8349,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8351,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8353,null,8352,org.apache.commons.collections4.TransformerUtils.mapTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @Test(timeout = 1000)
    public void testMapTransformer_remove2405() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapTransformer_remove2405");
        final Map<java.lang.Object, java.lang.Integer> map = new HashMap<java.lang.Object, java.lang.Integer>();
        map.put(cObject, 1);
        map.put(cString, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8338,null,8337,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8340,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8339,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8342,null,8341,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8344,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8343,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8346,null,8345,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8348,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8347,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8350,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8349,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8351,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8353,null,8352,org.apache.commons.collections4.TransformerUtils.mapTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @Test(timeout = 1000)
    public void testMapTransformer_remove2406() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapTransformer_remove2406");
        final Map<java.lang.Object, java.lang.Integer> map = new HashMap<java.lang.Object, java.lang.Integer>();
        map.put(cObject, 1);
        map.put(cString, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8338,null,8337,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8340,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8339,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8342,null,8341,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8344,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8343,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8346,null,8345,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8348,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8347,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8350,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8349,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8351,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8353,null,8352,org.apache.commons.collections4.TransformerUtils.mapTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @Test(timeout = 1000)
    public void testMapTransformer_remove2407() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapTransformer_remove2407");
        final Map<java.lang.Object, java.lang.Integer> map = new HashMap<java.lang.Object, java.lang.Integer>();
        map.put(cObject, 1);
        map.put(cString, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8338,null,8337,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8340,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8339,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8342,null,8341,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8344,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8343,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8346,null,8345,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8348,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8347,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8350,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8349,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8351,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8353,null,8352,org.apache.commons.collections4.TransformerUtils.mapTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExecutorTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExecutorTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8296,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()),8295,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8297,org.apache.commons.collections4.TransformerUtilsTest.cObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8299,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()),8298,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8300,org.apache.commons.collections4.TransformerUtilsTest.cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8302,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()),8301,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8303,org.apache.commons.collections4.TransformerUtilsTest.cInteger);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8305,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()),8304,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        try {
            org.apache.commons.collections4.TransformerUtils.asTransformer(((org.apache.commons.collections4.Closure<java.lang.Object>)(null)));
            org.apache.commons.collections4.TransformerUtils.asTransformer(((org.apache.commons.collections4.Closure<java.lang.Object>)(null)));
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPredicateTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicateTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8381,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8383,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8382,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8384,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8386,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8385,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8387,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8389,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8388,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8390,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8392,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8391,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        try {
            org.apache.commons.collections4.TransformerUtils.asTransformer(((Predicate<java.lang.Object>)(null)));
            org.apache.commons.collections4.TransformerUtils.asTransformer(((Predicate<java.lang.Object>)(null)));
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFactoryTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactoryTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8307,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()),8306,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8309,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()),8308,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8311,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()),8310,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8313,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()),8312,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        try {
            org.apache.commons.collections4.TransformerUtils.asTransformer(((org.apache.commons.collections4.Factory<java.lang.Object>)(null)));
            org.apache.commons.collections4.TransformerUtils.asTransformer(((org.apache.commons.collections4.Factory<java.lang.Object>)(null)));
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedTransformer_add2976() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer_add2976");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("A");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8251,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8253,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8255,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(b);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8257,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,null,8260,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8262,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,null,8263,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedTransformer_add2977() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer_add2977");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("A");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8251,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8253,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8255,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8257,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,null,8260,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8262,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,null,8263,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedTransformer_add2978() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer_add2978");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("A");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8251,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8253,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8255,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8257,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,null,8260,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8262,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,null,8263,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedTransformer_add2979() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer_add2979");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("A");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8251,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8253,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8255,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8257,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,null,8260,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8262,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,null,8263,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedTransformer_add2980() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer_add2980");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("A");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8251,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8253,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8255,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8257,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,null,8260,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8262,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,null,8263,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedTransformer_add2981() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer_add2981");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("A");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8251,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8253,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8255,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8257,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,null,8260,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8262,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,null,8263,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedTransformer_add2982() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer_add2982");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("A");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8251,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8253,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8255,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8257,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,null,8260,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8262,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,null,8263,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedTransformer_add2983() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer_add2983");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("A");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8251,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8253,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8255,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8257,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,null,8260,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8262,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,null,8263,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedTransformer_add2984() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer_add2984");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("A");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8251,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8253,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8255,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8257,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,null,8260,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8262,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,null,8263,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testChainedTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("A");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8251,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8253,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8255,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8257,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,null,8260,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8262,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,null,8263,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testChainedTransformer_literalMutation3077() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer_literalMutation3077");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("foo");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8251,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8253,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8255,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8257,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,null,8260,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8262,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,null,8263,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testChainedTransformer_literalMutation3078() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer_literalMutation3078");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("A");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8251,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8253,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8255,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8257,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,null,8260,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8262,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,null,8263,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedTransformer_remove2401() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer_remove2401");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("A");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8251,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8253,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8255,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8257,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,null,8260,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8262,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,null,8263,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testChainedTransformer_remove2402() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer_remove2402");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("A");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8252,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8251,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8254,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8253,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8256,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8255,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8258,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8257,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8259,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8261,null,8260,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8262,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8264,null,8263,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(((Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(new Transformer[]{ null , null });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
            coll.add(null);
            coll.add(null);
            org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchTransformer_add3011() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_add3011");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchTransformer_add3012() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_add3012");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchTransformer_add3013() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_add3013");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchTransformer_add3014() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_add3014");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchTransformer_add3015() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_add3015");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchTransformer_add3016() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_add3016");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchTransformer_add3017() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_add3017");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchTransformer_add3018() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_add3018");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchTransformer_add3019() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_add3019");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchTransformer_literalMutation3123() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_literalMutation3123");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("foo");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchTransformer_literalMutation3124() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_literalMutation3124");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("foo");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchTransformer_literalMutation3125() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_literalMutation3125");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchTransformer_literalMutation3126() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_literalMutation3126");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchTransformer_literalMutation3127() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_literalMutation3127");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchTransformer_literalMutation3136() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_literalMutation3136");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[3], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSwitchTransformer_literalMutation3137() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_literalMutation3137");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[3]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchTransformer_remove2413() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_remove2413");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchTransformer_remove2414() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_remove2414");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchTransformer_remove2415() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_remove2415");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSwitchTransformer_remove2416() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer_remove2416");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8414,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8413,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8416,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8415,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8418,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8417,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8420,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8419,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8422,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8421,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8424,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8423,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8425,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8427,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8429,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8431,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8433,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,null,8434,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8436,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,null,8437,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8439,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,null,8440,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Predicate[])(null)), ((Transformer[])(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(((Map<org.apache.commons.collections4.Predicate<java.lang.Object>, Transformer<java.lang.Object, java.lang.Object>>)(null)));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[2]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapTransformer_add3006() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapTransformer_add3006");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        Map<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put("HELLO", a);
        map.put("HELLO", a);
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8400,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8399,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8402,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8401,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8404,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8403,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8406,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8405,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,null,8408,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8410,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8412,null,8411,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapTransformer_add3007() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapTransformer_add3007");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        Map<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8400,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8399,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8402,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8401,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8404,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8403,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8406,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8405,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,null,8408,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8410,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8412,null,8411,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapTransformer_add3008() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapTransformer_add3008");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        Map<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8400,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8399,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8402,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8401,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8404,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8403,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8406,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8405,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,null,8408,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8410,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8412,null,8411,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapTransformer_add3009() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapTransformer_add3009");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        Map<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8400,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8399,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8402,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8401,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8404,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8403,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8406,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8405,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,null,8408,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8410,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8412,null,8411,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapTransformer_add3010() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapTransformer_add3010");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        Map<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8400,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8399,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8402,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8401,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8404,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8403,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8406,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8405,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,null,8408,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8410,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8412,null,8411,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwitchMapTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapTransformer");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("foo");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        Map<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8400,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8399,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8402,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8401,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8404,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8403,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8406,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8405,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,null,8408,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8410,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8412,null,8411,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwitchMapTransformer_literalMutation3114() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapTransformer_literalMutation3114");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("foo");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        Map<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8400,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8399,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8402,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8401,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8404,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8403,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8406,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8405,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,null,8408,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8410,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8412,null,8411,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwitchMapTransformer_literalMutation3115() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapTransformer_literalMutation3115");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("foo");
        Map<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put("HELLO", a);
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8400,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8399,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8402,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8401,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8404,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8403,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8406,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8405,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,null,8408,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8410,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8412,null,8411,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwitchMapTransformer_literalMutation3116() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapTransformer_literalMutation3116");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        Map<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put("foo", a);
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8400,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8399,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8402,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8401,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8404,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8403,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8406,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8405,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,null,8408,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8410,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8412,null,8411,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSwitchMapTransformer_literalMutation3117() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapTransformer_literalMutation3117");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        Map<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put("HELLO", a);
        map.put("foo", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8400,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8399,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8402,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8401,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8404,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8403,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8406,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8405,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,null,8408,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8410,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8412,null,8411,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapTransformer_remove2409() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapTransformer_remove2409");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        Map<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8400,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8399,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8402,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8401,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8404,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8403,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8406,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8405,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,null,8408,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8410,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8412,null,8411,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapTransformer_remove2410() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapTransformer_remove2410");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        Map<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8400,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8399,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8402,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8401,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8404,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8403,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8406,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8405,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,null,8408,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8410,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8412,null,8411,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapTransformer_remove2411() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapTransformer_remove2411");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        Map<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8400,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8399,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8402,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8401,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8404,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8403,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8406,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8405,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,null,8408,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8410,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8412,null,8411,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSwitchMapTransformer_remove2412() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchMapTransformer_remove2412");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        Map<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put("THERE", b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8400,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8399,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8402,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8401,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8404,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8403,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8406,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8405,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,null,8408,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8410,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8412,null,8411,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokerTransformer_add2992() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer_add2992");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8328,null,8327,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8330,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8329,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(list));
        list.add(new Object());
        list.add(new Object());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8332,null,8331,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8334,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8333,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8336,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8335,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod").transform(new Object());
        } catch (final FunctorException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokerTransformer_add2993() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer_add2993");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8328,null,8327,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8330,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8329,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(list));
        list.add(new Object());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8332,null,8331,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8334,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8333,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8336,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8335,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null);
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod").transform(new Object());
        } catch (final FunctorException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokerTransformer_add2994() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer_add2994");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8328,null,8327,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8330,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8329,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(list));
        list.add(new Object());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8332,null,8331,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8334,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8333,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8336,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8335,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod").transform(new Object());
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod").transform(new Object());
        } catch (final FunctorException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokerTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8328,null,8327,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8330,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8329,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(list));
        list.add(new Object());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8332,null,8331,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8334,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8333,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8336,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8335,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("foo").transform(new Object());
        } catch (final FunctorException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokerTransformer_remove2403() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer_remove2403");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8328,null,8327,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8330,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8329,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8332,null,8331,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8334,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8333,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8336,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8335,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod").transform(new Object());
        } catch (final FunctorException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokerTransformer2_add2995() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer2_add2995");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8321,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8320,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        list.add(cString);
        list.add(cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8324,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8323,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8326,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8325,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null, null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod", new Class[]{ Object.class }, new Object[]{ cString }).transform(new Object());
        } catch (final FunctorException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", null, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{ Object.class }, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{  }, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokerTransformer2_add2996() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer2_add2996");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8321,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8320,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        list.add(cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8324,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8323,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8326,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8325,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null, null, null);
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null, null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod", new Class[]{ Object.class }, new Object[]{ cString }).transform(new Object());
        } catch (final FunctorException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", null, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{ Object.class }, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{  }, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokerTransformer2_add2997() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer2_add2997");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8321,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8320,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        list.add(cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8324,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8323,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8326,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8325,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null, null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod", new Class[]{ Object.class }, new Object[]{ cString }).transform(new Object());
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod", new Class[]{ Object.class }, new Object[]{ cString }).transform(new Object());
        } catch (final FunctorException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", null, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{ Object.class }, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{  }, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokerTransformer2_add2998() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer2_add2998");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8321,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8320,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        list.add(cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8324,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8323,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8326,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8325,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null, null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod", new Class[]{ Object.class }, new Object[]{ cString }).transform(new Object());
        } catch (final FunctorException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", null, new Object[]{ cString });
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", null, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{ Object.class }, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{  }, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokerTransformer2_add2999() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer2_add2999");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8321,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8320,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        list.add(cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8324,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8323,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8326,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8325,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null, null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod", new Class[]{ Object.class }, new Object[]{ cString }).transform(new Object());
        } catch (final FunctorException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", null, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{ Object.class }, null);
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{ Object.class }, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{  }, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokerTransformer2_add3000() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer2_add3000");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8321,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8320,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        list.add(cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8324,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8323,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8326,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8325,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null, null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod", new Class[]{ Object.class }, new Object[]{ cString }).transform(new Object());
        } catch (final FunctorException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", null, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{ Object.class }, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{  }, new Object[]{ cString });
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{  }, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokerTransformer2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer2");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8321,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8320,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        list.add(cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8324,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8323,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8326,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8325,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null, null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("foo", new Class[]{ Object.class }, new Object[]{ cString }).transform(new Object());
        } catch (final FunctorException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", null, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{ Object.class }, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{  }, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokerTransformer2_literalMutation3101() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer2_literalMutation3101");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8321,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8320,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        list.add(cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8324,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8323,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8326,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8325,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null, null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod", new Class[]{ Object.class }, new Object[]{ cString }).transform(new Object());
        } catch (final FunctorException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("foo", null, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{ Object.class }, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{  }, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokerTransformer2_literalMutation3103() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer2_literalMutation3103");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8321,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8320,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        list.add(cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8324,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8323,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8326,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8325,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null, null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod", new Class[]{ Object.class }, new Object[]{ cString }).transform(new Object());
        } catch (final FunctorException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", null, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("foo", new Class[]{ Object.class }, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{  }, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokerTransformer2_literalMutation3105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer2_literalMutation3105");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8321,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8320,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        list.add(cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8324,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8323,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8326,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8325,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null, null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod", new Class[]{ Object.class }, new Object[]{ cString }).transform(new Object());
        } catch (final FunctorException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", null, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{ Object.class }, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("foo", new Class[]{  }, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvokerTransformer2_remove2404() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer2_remove2404");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8319,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8321,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8320,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8322,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8324,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8323,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8326,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8325,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer(null, null, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("noSuchMethod", new Class[]{ Object.class }, new Object[]{ cString }).transform(new Object());
        } catch (final FunctorException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", null, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{ Object.class }, null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.invokerTransformer("badArgs", new Class[]{  }, new Object[]{ cString });
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringValueTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringValueTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8394,org.apache.commons.collections4.TransformerUtils.stringValueTransformer(),8393,org.apache.commons.collections4.TransformerUtils.stringValueTransformer().transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8396,org.apache.commons.collections4.TransformerUtils.stringValueTransformer(),8395,org.apache.commons.collections4.TransformerUtils.stringValueTransformer().transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8398,org.apache.commons.collections4.TransformerUtils.stringValueTransformer(),8397,org.apache.commons.collections4.TransformerUtils.stringValueTransformer().transform(java.lang.Integer.valueOf(6)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInstantiateTransformerNull_add2989() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstantiateTransformerNull_add2989");
        try {
            org.apache.commons.collections4.TransformerUtils.instantiateTransformer(null, new Object[]{ "str" });
            org.apache.commons.collections4.TransformerUtils.instantiateTransformer(null, new Object[]{ "str" });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{  }, new Object[]{ "str" });
        } catch (final IllegalArgumentException ex) {
        }
        Transformer<java.lang.Class<?>, Object> trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.class }, new Object[]{ null });
        try {
            trans.transform(String.class);
        } catch (final FunctorException ex) {
        }
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,trans,8314,trans.transform(java.lang.String.class));
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.TYPE }, new Object[]{ new java.lang.Long(1000L) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8316,new java.util.Date(1000L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8318,trans,8317,trans.transform(java.util.Date.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInstantiateTransformerNull_add2990() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstantiateTransformerNull_add2990");
        try {
            org.apache.commons.collections4.TransformerUtils.instantiateTransformer(null, new Object[]{ "str" });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{  }, new Object[]{ "str" });
            org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{  }, new Object[]{ "str" });
        } catch (final IllegalArgumentException ex) {
        }
        Transformer<java.lang.Class<?>, Object> trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.class }, new Object[]{ null });
        try {
            trans.transform(String.class);
        } catch (final FunctorException ex) {
        }
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,trans,8314,trans.transform(java.lang.String.class));
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.TYPE }, new Object[]{ new java.lang.Long(1000L) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8316,new java.util.Date(1000L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8318,trans,8317,trans.transform(java.util.Date.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInstantiateTransformerNull_add2991() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstantiateTransformerNull_add2991");
        try {
            org.apache.commons.collections4.TransformerUtils.instantiateTransformer(null, new Object[]{ "str" });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{  }, new Object[]{ "str" });
        } catch (final IllegalArgumentException ex) {
        }
        Transformer<java.lang.Class<?>, Object> trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.class }, new Object[]{ null });
        try {
            trans.transform(String.class);
            trans.transform(String.class);
        } catch (final FunctorException ex) {
        }
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,trans,8314,trans.transform(java.lang.String.class));
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.TYPE }, new Object[]{ new java.lang.Long(1000L) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8316,new java.util.Date(1000L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8318,trans,8317,trans.transform(java.util.Date.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInstantiateTransformerNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstantiateTransformerNull");
        try {
            org.apache.commons.collections4.TransformerUtils.instantiateTransformer(null, new Object[]{ "foo" });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{  }, new Object[]{ "str" });
        } catch (final IllegalArgumentException ex) {
        }
        Transformer<java.lang.Class<?>, Object> trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.class }, new Object[]{ null });
        try {
            trans.transform(String.class);
        } catch (final FunctorException ex) {
        }
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,trans,8314,trans.transform(java.lang.String.class));
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.TYPE }, new Object[]{ new java.lang.Long(1000L) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8316,new java.util.Date(1000L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8318,trans,8317,trans.transform(java.util.Date.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInstantiateTransformerNull_literalMutation3092() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstantiateTransformerNull_literalMutation3092");
        try {
            org.apache.commons.collections4.TransformerUtils.instantiateTransformer(null, new Object[]{ "str" });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{  }, new Object[]{ "foo" });
        } catch (final IllegalArgumentException ex) {
        }
        Transformer<java.lang.Class<?>, Object> trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.class }, new Object[]{ null });
        try {
            trans.transform(String.class);
        } catch (final FunctorException ex) {
        }
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,trans,8314,trans.transform(java.lang.String.class));
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.TYPE }, new Object[]{ new java.lang.Long(1000L) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8316,new java.util.Date(1000L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8318,trans,8317,trans.transform(java.util.Date.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInstantiateTransformerNull_literalMutation3094() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstantiateTransformerNull_literalMutation3094");
        try {
            org.apache.commons.collections4.TransformerUtils.instantiateTransformer(null, new Object[]{ "str" });
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{  }, new Object[]{ "str" });
        } catch (final IllegalArgumentException ex) {
        }
        Transformer<java.lang.Class<?>, Object> trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.class }, new Object[]{ null });
        try {
            trans.transform(String.class);
        } catch (final FunctorException ex) {
        }
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8315,trans,8314,trans.transform(java.lang.String.class));
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.TYPE }, new Object[]{ new java.lang.Long(1001L) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8316,new java.util.Date(1000L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8318,trans,8317,trans.transform(java.util.Date.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that all Transformer singletons hold singleton pattern in
     * serialization/deserialization process.
     */
public void testSingletonPatternInSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonPatternInSerialization");
        final Object[] singletones = new Object[]{ CloneTransformer.INSTANCE , ExceptionTransformer.INSTANCE , NOPTransformer.INSTANCE , org.apache.commons.collections4.functors.StringValueTransformer.stringValueTransformer() };
        for (final Object original : singletones) {
            org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(("Singleton pattern broken for " + (original.getClass())), original);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that all Transformer singletons hold singleton pattern in
     * serialization/deserialization process.
     */
@Test(timeout = 1000)
    public void testSingletonPatternInSerialization_add3005() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonPatternInSerialization_add3005");
        final Object[] singletones = new Object[]{ CloneTransformer.INSTANCE , ExceptionTransformer.INSTANCE , NOPTransformer.INSTANCE , org.apache.commons.collections4.functors.StringValueTransformer.stringValueTransformer() };
        for (final Object original : singletones) {
            org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(("Singleton pattern broken for " + (original.getClass())), original);
            org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(("Singleton pattern broken for " + (original.getClass())), original);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that all Transformer singletons hold singleton pattern in
     * serialization/deserialization process.
     */
public void testSingletonPatternInSerialization_literalMutation3112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonPatternInSerialization_literalMutation3112");
        final Object[] singletones = new Object[]{ CloneTransformer.INSTANCE , ExceptionTransformer.INSTANCE , NOPTransformer.INSTANCE , org.apache.commons.collections4.functors.StringValueTransformer.stringValueTransformer() };
        for (final Object original : singletones) {
            org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(("foo" + (original.getClass())), original);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that all Transformer singletons hold singleton pattern in
     * serialization/deserialization process.
     */
@Test(timeout = 1000)
    public void testSingletonPatternInSerialization_remove2408() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonPatternInSerialization_remove2408");
        final Object[] singletones = new Object[]{ CloneTransformer.INSTANCE , ExceptionTransformer.INSTANCE , NOPTransformer.INSTANCE , org.apache.commons.collections4.functors.StringValueTransformer.stringValueTransformer() };
        for (final Object original : singletones) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

