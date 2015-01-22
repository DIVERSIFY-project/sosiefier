package org.apache.commons.collections4;

import java.util.ArrayList;
import org.apache.commons.collections4.functors.CloneTransformer;
import java.util.Collection;
import org.apache.commons.collections4.functors.ExceptionTransformer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.functors.NOPTransformer;
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

    public void testExceptionTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8367,null,8366,org.apache.commons.collections4.TransformerUtils.exceptionTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8369,null,8368,org.apache.commons.collections4.TransformerUtils.exceptionTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8369,null,8368,org.apache.commons.collections4.TransformerUtils.exceptionTransformer());
        try {
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

    public void testNullTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8445,null,8444,org.apache.commons.collections4.TransformerUtils.nullTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8447,null,8446,org.apache.commons.collections4.TransformerUtils.nullTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8447,null,8446,org.apache.commons.collections4.TransformerUtils.nullTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8449,org.apache.commons.collections4.TransformerUtils.nullTransformer(),8448,org.apache.commons.collections4.TransformerUtils.nullTransformer().transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8451,org.apache.commons.collections4.TransformerUtils.nullTransformer(),8450,org.apache.commons.collections4.TransformerUtils.nullTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8453,org.apache.commons.collections4.TransformerUtils.nullTransformer(),8452,org.apache.commons.collections4.TransformerUtils.nullTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8455,org.apache.commons.collections4.TransformerUtils.nullTransformer(),8454,org.apache.commons.collections4.TransformerUtils.nullTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNopTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNopTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8430,null,8429,org.apache.commons.collections4.TransformerUtils.nullTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,null,8431,org.apache.commons.collections4.TransformerUtils.nullTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8432,null,8431,org.apache.commons.collections4.TransformerUtils.nullTransformer());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8434,org.apache.commons.collections4.TransformerUtils.nopTransformer(),8433,org.apache.commons.collections4.TransformerUtils.nopTransformer().transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8435,org.apache.commons.collections4.TransformerUtilsTest.cObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8437,org.apache.commons.collections4.TransformerUtils.nopTransformer(),8436,org.apache.commons.collections4.TransformerUtils.nopTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8438,org.apache.commons.collections4.TransformerUtilsTest.cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8440,org.apache.commons.collections4.TransformerUtils.nopTransformer(),8439,org.apache.commons.collections4.TransformerUtils.nopTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8441,org.apache.commons.collections4.TransformerUtilsTest.cInteger);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8443,org.apache.commons.collections4.TransformerUtils.nopTransformer(),8442,org.apache.commons.collections4.TransformerUtils.nopTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstantTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstantTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8351,org.apache.commons.collections4.TransformerUtilsTest.cObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8353,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject),8352,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8354,org.apache.commons.collections4.TransformerUtilsTest.cObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8356,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject),8355,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8357,org.apache.commons.collections4.TransformerUtilsTest.cObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8359,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject),8358,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8360,org.apache.commons.collections4.TransformerUtilsTest.cObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8362,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject),8361,org.apache.commons.collections4.TransformerUtils.constantTransformer(org.apache.commons.collections4.TransformerUtilsTest.cObject).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8363,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8365,null,8364,org.apache.commons.collections4.TransformerUtils.constantTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCloneTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloneTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8341,org.apache.commons.collections4.TransformerUtils.cloneTransformer(),8340,org.apache.commons.collections4.TransformerUtils.cloneTransformer().transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8342,org.apache.commons.collections4.TransformerUtilsTest.cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8344,org.apache.commons.collections4.TransformerUtils.cloneTransformer(),8343,org.apache.commons.collections4.TransformerUtils.cloneTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8345,org.apache.commons.collections4.TransformerUtilsTest.cInteger);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8347,org.apache.commons.collections4.TransformerUtils.cloneTransformer(),8346,org.apache.commons.collections4.TransformerUtils.cloneTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8348,org.apache.commons.collections4.TransformerUtilsTest.cObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8350,org.apache.commons.collections4.TransformerUtils.cloneTransformer(),8349,org.apache.commons.collections4.TransformerUtils.cloneTransformer().transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testMapTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapTransformer");
        final Map<java.lang.Object, java.lang.Integer> map = new HashMap<java.lang.Object, java.lang.Integer>();
        map.put(null, 0);
        map.put(cObject, 1);
        map.put(cString, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8413,null,8412,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8415,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8414,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8417,null,8416,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8419,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8418,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8421,null,8420,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8423,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8422,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8425,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8424,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,null,8427,org.apache.commons.collections4.TransformerUtils.mapTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testMapTransformer_literalMutation3108() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapTransformer_literalMutation3108");
        final Map<java.lang.Object, java.lang.Integer> map = new HashMap<java.lang.Object, java.lang.Integer>();
        map.put(null, -1);
        map.put(cObject, 1);
        map.put(cString, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8413,null,8412,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8415,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8414,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8417,null,8416,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8419,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8418,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8421,null,8420,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8423,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8422,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8425,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8424,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,null,8427,org.apache.commons.collections4.TransformerUtils.mapTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testMapTransformer_literalMutation3109() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapTransformer_literalMutation3109");
        final Map<java.lang.Object, java.lang.Integer> map = new HashMap<java.lang.Object, java.lang.Integer>();
        map.put(null, 0);
        map.put(cObject, 0);
        map.put(cString, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8413,null,8412,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8415,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8414,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8417,null,8416,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8419,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8418,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8421,null,8420,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8423,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8422,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8425,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8424,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,null,8427,org.apache.commons.collections4.TransformerUtils.mapTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testMapTransformer_literalMutation3110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapTransformer_literalMutation3110");
        final Map<java.lang.Object, java.lang.Integer> map = new HashMap<java.lang.Object, java.lang.Integer>();
        map.put(null, 0);
        map.put(cObject, 1);
        map.put(cString, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8413,null,8412,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8415,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8414,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8417,null,8416,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8419,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8418,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8421,null,8420,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8423,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8422,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8425,org.apache.commons.collections4.TransformerUtils.mapTransformer(map),8424,org.apache.commons.collections4.TransformerUtils.mapTransformer(map).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8426,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8428,null,8427,org.apache.commons.collections4.TransformerUtils.mapTransformer(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExecutorTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExecutorTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8371,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()),8370,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8372,org.apache.commons.collections4.TransformerUtilsTest.cObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8374,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()),8373,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8375,org.apache.commons.collections4.TransformerUtilsTest.cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8377,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()),8376,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8378,org.apache.commons.collections4.TransformerUtilsTest.cInteger);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8380,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()),8379,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.ClosureUtils.nopClosure()).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        try {
            org.apache.commons.collections4.TransformerUtils.asTransformer(((org.apache.commons.collections4.Closure<java.lang.Object>)(null)));
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPredicateTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicateTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8456,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8458,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8457,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8459,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8461,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8460,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8462,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8464,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8463,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8465,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8467,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8466,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        try {
            org.apache.commons.collections4.TransformerUtils.asTransformer(((Predicate<java.lang.Object>)(null)));
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFactoryTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactoryTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8382,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()),8381,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8384,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()),8383,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()).transform(org.apache.commons.collections4.TransformerUtilsTest.cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8386,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()),8385,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()).transform(org.apache.commons.collections4.TransformerUtilsTest.cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8388,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()),8387,org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.FactoryUtils.nullFactory()).transform(org.apache.commons.collections4.TransformerUtilsTest.cInteger));
        try {
            org.apache.commons.collections4.TransformerUtils.asTransformer(((org.apache.commons.collections4.Factory<java.lang.Object>)(null)));
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testChainedTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChainedTransformer");
        final Transformer<java.lang.Object, java.lang.Object> a = org.apache.commons.collections4.TransformerUtils.<Object,Object>constantTransformer("A");
        final Transformer<java.lang.Object, java.lang.Object> b = org.apache.commons.collections4.TransformerUtils.constantTransformer(((Object)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8327,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8326,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8329,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8328,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8331,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8330,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8333,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8332,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8334,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8336,null,8335,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8337,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8339,null,8338,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8327,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8326,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8329,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8328,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8331,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8330,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8333,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8332,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8334,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8336,null,8335,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8337,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8339,null,8338,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8327,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a),8326,org.apache.commons.collections4.TransformerUtils.chainedTransformer(b, a).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8329,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b),8328,org.apache.commons.collections4.TransformerUtils.chainedTransformer(a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8331,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }),8330,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[]{ b , a }).transform(null));
        Collection<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>();
        coll.add(b);
        coll.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8333,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll),8332,org.apache.commons.collections4.TransformerUtils.chainedTransformer(coll).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8334,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8336,null,8335,org.apache.commons.collections4.TransformerUtils.chainedTransformer(new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8337,org.apache.commons.collections4.functors.NOPTransformer.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8339,null,8338,org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collections.<org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>emptyList()));
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
    public void testSwitchTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSwitchTransformer");
        final Transformer<java.lang.String, java.lang.String> a = org.apache.commons.collections4.TransformerUtils.constantTransformer("A");
        final Transformer<java.lang.String, java.lang.String> b = org.apache.commons.collections4.TransformerUtils.constantTransformer("B");
        final Transformer<java.lang.String, java.lang.String> c = org.apache.commons.collections4.TransformerUtils.constantTransformer("C");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8489,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8488,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8491,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8490,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8493,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8492,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8495,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8494,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8497,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8496,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8499,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8498,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8501,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8500,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8503,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8502,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8505,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8504,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8507,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8506,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8508,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8510,null,8509,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8511,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8513,null,8512,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8514,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8516,null,8515,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8489,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8488,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8491,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8490,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8493,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8492,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8495,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8494,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8497,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8496,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8499,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8498,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8501,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8500,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8503,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8502,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8505,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8504,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8507,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8506,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8508,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8510,null,8509,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8511,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8513,null,8512,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8514,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8516,null,8515,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8489,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8488,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8491,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8490,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8493,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8492,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8495,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8494,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8497,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8496,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8499,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8498,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8501,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8500,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8503,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8502,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8505,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8504,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8507,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8506,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8508,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8510,null,8509,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8511,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8513,null,8512,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8514,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8516,null,8515,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8489,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8488,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8491,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8490,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8493,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8492,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8495,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8494,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8497,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8496,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8499,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8498,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8501,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8500,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8503,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8502,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8505,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8504,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8507,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8506,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8508,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8510,null,8509,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8511,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8513,null,8512,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8514,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8516,null,8515,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8489,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8488,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8491,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8490,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8493,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8492,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8495,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8494,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8497,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8496,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8499,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8498,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8501,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8500,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8503,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8502,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8505,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8504,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8507,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8506,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8508,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8510,null,8509,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8511,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8513,null,8512,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8514,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8516,null,8515,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8489,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8488,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8491,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8490,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8493,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8492,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8495,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8494,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8497,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8496,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8499,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8498,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8501,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8500,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8503,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8502,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8505,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8504,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8507,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8506,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8508,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8510,null,8509,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8511,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8513,null,8512,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8514,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8516,null,8515,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8489,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8488,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8491,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8490,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8493,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8492,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8495,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8494,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8497,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8496,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8499,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8498,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8501,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8500,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8503,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8502,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8505,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8504,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8507,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8506,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8508,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8510,null,8509,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8511,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8513,null,8512,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8514,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8516,null,8515,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
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
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[1], new Transformer[2]);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8489,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b),8488,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8491,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b),8490,org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), a, b).transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8493,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8492,org.apache.commons.collections4.TransformerUtils.<java.lang.Object,java.lang.String>switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8495,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8494,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8497,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }),8496,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }).transform("THERE"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8499,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c),8498,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO") , org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE") }, new org.apache.commons.collections4.Transformer[]{ a , b }, c).transform("WELL"));
        Map<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>> map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("HELLO"), a);
        map.put(org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("THERE"), b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8501,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8500,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8503,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8502,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8505,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8504,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8507,org.apache.commons.collections4.TransformerUtils.switchTransformer(map),8506,org.apache.commons.collections4.TransformerUtils.switchTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8508,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8510,null,8509,org.apache.commons.collections4.TransformerUtils.switchTransformer(new org.apache.commons.collections4.Predicate[0], new org.apache.commons.collections4.Transformer[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8511,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8513,null,8512,org.apache.commons.collections4.TransformerUtils.switchTransformer(new java.util.HashMap<org.apache.commons.collections4.Predicate<java.lang.Object>, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<org.apache.commons.collections4.Predicate<java.lang.String>, Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8514,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8516,null,8515,org.apache.commons.collections4.TransformerUtils.switchTransformer(map));
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
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[2], new Transformer[1]);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.TransformerUtils.switchTransformer(new Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() }, new Transformer[]{ a , b });
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8475,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8474,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8477,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8476,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8479,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8478,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8481,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8480,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8482,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8484,null,8483,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8485,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8487,null,8486,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8475,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8474,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8477,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8476,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8479,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8478,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8481,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8480,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8482,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8484,null,8483,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8485,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8487,null,8486,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8475,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8474,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8477,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8476,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8479,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8478,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8481,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8480,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8482,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8484,null,8483,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8485,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8487,null,8486,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8475,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8474,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8477,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8476,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8479,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8478,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8481,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8480,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8482,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8484,null,8483,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8485,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8487,null,8486,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8475,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8474,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8477,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8476,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("HELLO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8479,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8478,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("THERE"));
        map.put(null, c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8481,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map),8480,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map).transform("WELL"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8482,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8484,null,8483,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(new java.util.HashMap<java.lang.Object, org.apache.commons.collections4.Transformer<java.lang.Object, java.lang.Object>>()));
        map = new HashMap<java.lang.String, org.apache.commons.collections4.Transformer<java.lang.String, java.lang.String>>();
        map.put(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8485,org.apache.commons.collections4.functors.ConstantTransformer.NULL_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8487,null,8486,org.apache.commons.collections4.TransformerUtils.switchMapTransformer(map));
        try {
            org.apache.commons.collections4.TransformerUtils.switchMapTransformer(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvokerTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8403,null,8402,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8405,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8404,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(list));
        list.add(new Object());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8407,null,8406,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8409,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8408,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8411,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size"),8410,org.apache.commons.collections4.TransformerUtils.invokerTransformer("size").transform(null));
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

    public void testInvokerTransformer2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerTransformer2");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8394,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8396,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8395,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        list.add(cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8397,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8399,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8398,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8401,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8400,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8394,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8396,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8395,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        list.add(cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8397,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8399,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8398,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8401,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8400,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8394,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8396,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8395,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        list.add(cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8397,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8399,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8398,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8401,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8400,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8394,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8396,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8395,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        list.add(cString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8397,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8399,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8398,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(list));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8401,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }),8400,org.apache.commons.collections4.TransformerUtils.invokerTransformer("contains", new java.lang.Class[]{ java.lang.Object.class }, new java.lang.Object[]{ org.apache.commons.collections4.TransformerUtilsTest.cString }).transform(null));
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

    public void testStringValueTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringValueTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8469,org.apache.commons.collections4.TransformerUtils.stringValueTransformer(),8468,org.apache.commons.collections4.TransformerUtils.stringValueTransformer().transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8471,org.apache.commons.collections4.TransformerUtils.stringValueTransformer(),8470,org.apache.commons.collections4.TransformerUtils.stringValueTransformer().transform(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8473,org.apache.commons.collections4.TransformerUtils.stringValueTransformer(),8472,org.apache.commons.collections4.TransformerUtils.stringValueTransformer().transform(java.lang.Integer.valueOf(6)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8390,trans,8389,trans.transform(java.lang.String.class));
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.TYPE }, new Object[]{ new java.lang.Long(1000L) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8391,new java.util.Date(1000L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8393,trans,8392,trans.transform(java.util.Date.class));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8390,trans,8389,trans.transform(java.lang.String.class));
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.TYPE }, new Object[]{ new java.lang.Long(1000L) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8391,new java.util.Date(1000L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8393,trans,8392,trans.transform(java.util.Date.class));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8390,trans,8389,trans.transform(java.lang.String.class));
        trans = org.apache.commons.collections4.TransformerUtils.instantiateTransformer(new Class[]{ java.lang.Long.TYPE }, new Object[]{ new java.lang.Long(1001L) });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8391,new java.util.Date(1000L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8393,trans,8392,trans.transform(java.util.Date.class));
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
public void testSingletonPatternInSerialization_literalMutation3112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonPatternInSerialization_literalMutation3112");
        final Object[] singletones = new Object[]{ CloneTransformer.INSTANCE , ExceptionTransformer.INSTANCE , NOPTransformer.INSTANCE , org.apache.commons.collections4.functors.StringValueTransformer.stringValueTransformer() };
        for (final Object original : singletones) {
            org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(("foo" + (original.getClass())), original);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

