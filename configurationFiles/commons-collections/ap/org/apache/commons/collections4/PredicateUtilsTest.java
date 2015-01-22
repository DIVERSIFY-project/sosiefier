package org.apache.commons.collections4;

import org.apache.commons.collections4.functors.AbstractPredicateTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.functors.ExceptionPredicate;
import org.apache.commons.collections4.functors.FalsePredicate;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.junit.Test;
import org.apache.commons.collections4.functors.TruePredicate;

/** 
 * Tests the PredicateUtils class.
 * 
 * @version $Id$
 * @since 3.0
 */
@SuppressWarnings(value = "boxing")
public class PredicateUtilsTest extends AbstractPredicateTest {
    /** 
     * Set up instance variables required by this test case.
     */
public void setUp() {
    }

    /** 
     * Tear down instance variables required by this test case.
     */
public void tearDown() {
    }

    @Test
    public void testExceptionPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionPredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8072,null,8071,org.apache.commons.collections4.PredicateUtils.exceptionPredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8074,null,8073,org.apache.commons.collections4.PredicateUtils.exceptionPredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8074,null,8073,org.apache.commons.collections4.PredicateUtils.exceptionPredicate());
        try {
            org.apache.commons.collections4.PredicateUtils.exceptionPredicate().evaluate(null);
        } catch (final FunctorException ex) {
            try {
                org.apache.commons.collections4.PredicateUtils.exceptionPredicate().evaluate(cString);
            } catch (final FunctorException ex2) {
                return ;
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsNotNullPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsNotNullPredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8114,null,8113,org.apache.commons.collections4.PredicateUtils.notNullPredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8116,null,8115,org.apache.commons.collections4.PredicateUtils.notNullPredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8116,null,8115,org.apache.commons.collections4.PredicateUtils.notNullPredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8118,org.apache.commons.collections4.PredicateUtils.notNullPredicate(),8117,org.apache.commons.collections4.PredicateUtils.notNullPredicate().evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8120,org.apache.commons.collections4.PredicateUtils.notNullPredicate(),8119,org.apache.commons.collections4.PredicateUtils.notNullPredicate().evaluate(cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8122,org.apache.commons.collections4.PredicateUtils.notNullPredicate(),8121,org.apache.commons.collections4.PredicateUtils.notNullPredicate().evaluate(cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8124,org.apache.commons.collections4.PredicateUtils.notNullPredicate(),8123,org.apache.commons.collections4.PredicateUtils.notNullPredicate().evaluate(cInteger));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIdentityPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIdentityPredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8088,null,8087,org.apache.commons.collections4.functors.NullPredicate.nullPredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8090,null,8089,org.apache.commons.collections4.PredicateUtils.identityPredicate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8092,null,8091,org.apache.commons.collections4.PredicateUtils.identityPredicate(java.lang.Integer.valueOf(6)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8094,org.apache.commons.collections4.PredicateUtils.identityPredicate(java.lang.Integer.valueOf(6)),8093,org.apache.commons.collections4.PredicateUtils.identityPredicate(java.lang.Integer.valueOf(6)).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8096,org.apache.commons.collections4.PredicateUtils.<java.lang.Object>identityPredicate(java.lang.Integer.valueOf(6)),8095,org.apache.commons.collections4.PredicateUtils.<java.lang.Object>identityPredicate(java.lang.Integer.valueOf(6)).evaluate(cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8098,org.apache.commons.collections4.PredicateUtils.<java.lang.Object>identityPredicate(java.lang.Integer.valueOf(6)),8097,org.apache.commons.collections4.PredicateUtils.<java.lang.Object>identityPredicate(java.lang.Integer.valueOf(6)).evaluate(cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8100,org.apache.commons.collections4.PredicateUtils.identityPredicate(new java.lang.Integer(6)),8099,org.apache.commons.collections4.PredicateUtils.identityPredicate(new java.lang.Integer(6)).evaluate(cInteger));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8102,org.apache.commons.collections4.PredicateUtils.identityPredicate(cInteger),8101,org.apache.commons.collections4.PredicateUtils.identityPredicate(cInteger).evaluate(cInteger));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTruePredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTruePredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8208,null,8207,org.apache.commons.collections4.functors.TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,null,8209,org.apache.commons.collections4.functors.TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8210,null,8209,org.apache.commons.collections4.functors.TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8212,org.apache.commons.collections4.functors.TruePredicate.truePredicate(),8211,org.apache.commons.collections4.functors.TruePredicate.truePredicate().evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8214,org.apache.commons.collections4.functors.TruePredicate.truePredicate(),8213,org.apache.commons.collections4.functors.TruePredicate.truePredicate().evaluate(cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8216,org.apache.commons.collections4.functors.TruePredicate.truePredicate(),8215,org.apache.commons.collections4.functors.TruePredicate.truePredicate().evaluate(cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8218,org.apache.commons.collections4.functors.TruePredicate.truePredicate(),8217,org.apache.commons.collections4.functors.TruePredicate.truePredicate().evaluate(cInteger));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFalsePredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFalsePredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8076,null,8075,org.apache.commons.collections4.functors.FalsePredicate.falsePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8078,null,8077,org.apache.commons.collections4.functors.FalsePredicate.falsePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8078,null,8077,org.apache.commons.collections4.functors.FalsePredicate.falsePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8080,org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(),8079,org.apache.commons.collections4.functors.FalsePredicate.falsePredicate().evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8082,org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(),8081,org.apache.commons.collections4.functors.FalsePredicate.falsePredicate().evaluate(cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8084,org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(),8083,org.apache.commons.collections4.functors.FalsePredicate.falsePredicate().evaluate(cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8086,org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(),8085,org.apache.commons.collections4.functors.FalsePredicate.falsePredicate().evaluate(cInteger));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNotPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNotPredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8150,null,8149,org.apache.commons.collections4.PredicateUtils.notPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8152,org.apache.commons.collections4.PredicateUtils.notPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8151,org.apache.commons.collections4.PredicateUtils.notPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8154,org.apache.commons.collections4.PredicateUtils.notPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8153,org.apache.commons.collections4.PredicateUtils.notPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8156,org.apache.commons.collections4.PredicateUtils.notPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8155,org.apache.commons.collections4.PredicateUtils.notPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8158,org.apache.commons.collections4.PredicateUtils.notPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8157,org.apache.commons.collections4.PredicateUtils.notPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(cInteger));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNotPredicateEx() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNotPredicateEx");
        org.apache.commons.collections4.PredicateUtils.notPredicate(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testAndPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAndPredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8036,org.apache.commons.collections4.PredicateUtils.andPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8035,org.apache.commons.collections4.PredicateUtils.andPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8038,org.apache.commons.collections4.PredicateUtils.andPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()),8037,org.apache.commons.collections4.PredicateUtils.andPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8040,org.apache.commons.collections4.PredicateUtils.andPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8039,org.apache.commons.collections4.PredicateUtils.andPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8042,org.apache.commons.collections4.PredicateUtils.andPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()),8041,org.apache.commons.collections4.PredicateUtils.andPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAndPredicateEx() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAndPredicateEx");
        org.apache.commons.collections4.PredicateUtils.andPredicate(null, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test
    public void testAllPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAllPredicate");
        assertTrue(org.apache.commons.collections4.functors.AllPredicate.allPredicate(new Predicate[]{  }), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8020,org.apache.commons.collections4.functors.AllPredicate.allPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }),8019,org.apache.commons.collections4.functors.AllPredicate.allPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8022,org.apache.commons.collections4.functors.AllPredicate.allPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }),8021,org.apache.commons.collections4.functors.AllPredicate.allPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8024,org.apache.commons.collections4.functors.AllPredicate.allPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }),8023,org.apache.commons.collections4.functors.AllPredicate.allPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8026,org.apache.commons.collections4.functors.AllPredicate.allPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() }),8025,org.apache.commons.collections4.functors.AllPredicate.allPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() }).evaluate(null));
        final Collection<org.apache.commons.collections4.Predicate<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Predicate<java.lang.Object>>();
        coll.add(TruePredicate.truePredicate());
        coll.add(TruePredicate.truePredicate());
        coll.add(TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8028,org.apache.commons.collections4.functors.AllPredicate.allPredicate(coll),8027,org.apache.commons.collections4.functors.AllPredicate.allPredicate(coll).evaluate(null));
        coll.clear();
        coll.add(TruePredicate.truePredicate());
        coll.add(FalsePredicate.falsePredicate());
        coll.add(TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8030,org.apache.commons.collections4.functors.AllPredicate.allPredicate(coll),8029,org.apache.commons.collections4.functors.AllPredicate.allPredicate(coll).evaluate(null));
        coll.clear();
        coll.add(FalsePredicate.falsePredicate());
        coll.add(FalsePredicate.falsePredicate());
        coll.add(TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8032,org.apache.commons.collections4.functors.AllPredicate.allPredicate(coll),8031,org.apache.commons.collections4.functors.AllPredicate.allPredicate(coll).evaluate(null));
        coll.clear();
        coll.add(FalsePredicate.falsePredicate());
        coll.add(FalsePredicate.falsePredicate());
        coll.add(FalsePredicate.falsePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8034,org.apache.commons.collections4.functors.AllPredicate.allPredicate(coll),8033,org.apache.commons.collections4.functors.AllPredicate.allPredicate(coll).evaluate(null));
        coll.clear();
        coll.add(FalsePredicate.falsePredicate());
        assertFalse(org.apache.commons.collections4.functors.AllPredicate.allPredicate(coll), null);
        coll.clear();
        coll.add(TruePredicate.truePredicate());
        assertTrue(org.apache.commons.collections4.functors.AllPredicate.allPredicate(coll), null);
        coll.clear();
        assertTrue(org.apache.commons.collections4.functors.AllPredicate.allPredicate(coll), null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAllPredicateEx1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAllPredicateEx1");
        org.apache.commons.collections4.functors.AllPredicate.allPredicate(((Predicate<java.lang.Object>[])(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(expected = IllegalArgumentException.class)
    public void testAllPredicateEx2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAllPredicateEx2");
        org.apache.commons.collections4.functors.AllPredicate.<Object>allPredicate(new Predicate[]{ null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(expected = IllegalArgumentException.class)
    public void testAllPredicateEx3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAllPredicateEx3");
        org.apache.commons.collections4.functors.AllPredicate.allPredicate(new Predicate[]{ null , null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAllPredicateEx4() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAllPredicateEx4");
        org.apache.commons.collections4.functors.AllPredicate.allPredicate(((Collection<org.apache.commons.collections4.Predicate<java.lang.Object>>)(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testAllPredicateEx5() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAllPredicateEx5");
        org.apache.commons.collections4.functors.AllPredicate.allPredicate(java.util.Collections.<Predicate<java.lang.Object>>emptyList());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAllPredicateEx6() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAllPredicateEx6");
        final Collection<org.apache.commons.collections4.Predicate<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Predicate<java.lang.Object>>();
        coll.add(null);
        coll.add(null);
        org.apache.commons.collections4.functors.AllPredicate.allPredicate(coll);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testOrPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrPredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8194,org.apache.commons.collections4.PredicateUtils.orPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8193,org.apache.commons.collections4.PredicateUtils.orPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8196,org.apache.commons.collections4.PredicateUtils.orPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()),8195,org.apache.commons.collections4.PredicateUtils.orPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8198,org.apache.commons.collections4.PredicateUtils.orPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8197,org.apache.commons.collections4.PredicateUtils.orPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8200,org.apache.commons.collections4.PredicateUtils.orPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()),8199,org.apache.commons.collections4.PredicateUtils.orPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOrPredicateEx() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrPredicateEx");
        org.apache.commons.collections4.PredicateUtils.orPredicate(null, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test
    public void testAnyPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAnyPredicate");
        assertFalse(org.apache.commons.collections4.PredicateUtils.anyPredicate(new Predicate[]{  }), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8044,org.apache.commons.collections4.PredicateUtils.anyPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }),8043,org.apache.commons.collections4.PredicateUtils.anyPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8046,org.apache.commons.collections4.PredicateUtils.anyPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }),8045,org.apache.commons.collections4.PredicateUtils.anyPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8048,org.apache.commons.collections4.PredicateUtils.anyPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }),8047,org.apache.commons.collections4.PredicateUtils.anyPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8050,org.apache.commons.collections4.PredicateUtils.anyPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() }),8049,org.apache.commons.collections4.PredicateUtils.anyPredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() }).evaluate(null));
        final Collection<org.apache.commons.collections4.Predicate<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Predicate<java.lang.Object>>();
        coll.add(TruePredicate.truePredicate());
        coll.add(TruePredicate.truePredicate());
        coll.add(TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8052,org.apache.commons.collections4.PredicateUtils.anyPredicate(coll),8051,org.apache.commons.collections4.PredicateUtils.anyPredicate(coll).evaluate(null));
        coll.clear();
        coll.add(TruePredicate.truePredicate());
        coll.add(FalsePredicate.falsePredicate());
        coll.add(TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8054,org.apache.commons.collections4.PredicateUtils.anyPredicate(coll),8053,org.apache.commons.collections4.PredicateUtils.anyPredicate(coll).evaluate(null));
        coll.clear();
        coll.add(FalsePredicate.falsePredicate());
        coll.add(FalsePredicate.falsePredicate());
        coll.add(TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8056,org.apache.commons.collections4.PredicateUtils.anyPredicate(coll),8055,org.apache.commons.collections4.PredicateUtils.anyPredicate(coll).evaluate(null));
        coll.clear();
        coll.add(FalsePredicate.falsePredicate());
        coll.add(FalsePredicate.falsePredicate());
        coll.add(FalsePredicate.falsePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8058,org.apache.commons.collections4.PredicateUtils.anyPredicate(coll),8057,org.apache.commons.collections4.PredicateUtils.anyPredicate(coll).evaluate(null));
        coll.clear();
        coll.add(FalsePredicate.falsePredicate());
        assertFalse(org.apache.commons.collections4.PredicateUtils.anyPredicate(coll), null);
        coll.clear();
        coll.add(TruePredicate.truePredicate());
        assertTrue(org.apache.commons.collections4.PredicateUtils.anyPredicate(coll), null);
        coll.clear();
        assertFalse(org.apache.commons.collections4.PredicateUtils.anyPredicate(coll), null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnyPredicateEx1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAnyPredicateEx1");
        org.apache.commons.collections4.PredicateUtils.anyPredicate(((Predicate<java.lang.Object>[])(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(expected = IllegalArgumentException.class)
    public void testAnyPredicateEx2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAnyPredicateEx2");
        org.apache.commons.collections4.PredicateUtils.anyPredicate(new Predicate[]{ null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(expected = IllegalArgumentException.class)
    public void testAnyPredicateEx3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAnyPredicateEx3");
        org.apache.commons.collections4.PredicateUtils.anyPredicate(new Predicate[]{ null , null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnyPredicateEx4() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAnyPredicateEx4");
        org.apache.commons.collections4.PredicateUtils.anyPredicate(((Collection<org.apache.commons.collections4.Predicate<java.lang.Object>>)(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testAnyPredicateEx5() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAnyPredicateEx5");
        org.apache.commons.collections4.PredicateUtils.anyPredicate(java.util.Collections.<Predicate<java.lang.Object>>emptyList());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnyPredicateEx6() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAnyPredicateEx6");
        final Collection<org.apache.commons.collections4.Predicate<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Predicate<java.lang.Object>>();
        coll.add(null);
        coll.add(null);
        org.apache.commons.collections4.PredicateUtils.anyPredicate(coll);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testEitherPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEitherPredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8064,org.apache.commons.collections4.PredicateUtils.eitherPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8063,org.apache.commons.collections4.PredicateUtils.eitherPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8066,org.apache.commons.collections4.PredicateUtils.eitherPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()),8065,org.apache.commons.collections4.PredicateUtils.eitherPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8068,org.apache.commons.collections4.PredicateUtils.eitherPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8067,org.apache.commons.collections4.PredicateUtils.eitherPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8070,org.apache.commons.collections4.PredicateUtils.eitherPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()),8069,org.apache.commons.collections4.PredicateUtils.eitherPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEitherPredicateEx() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEitherPredicateEx");
        org.apache.commons.collections4.PredicateUtils.eitherPredicate(null, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test
    public void testOnePredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOnePredicate");
        assertFalse(org.apache.commons.collections4.PredicateUtils.onePredicate(((Predicate<java.lang.Object>[])(new Predicate[]{  }))), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8174,org.apache.commons.collections4.PredicateUtils.onePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }),8173,org.apache.commons.collections4.PredicateUtils.onePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8176,org.apache.commons.collections4.PredicateUtils.onePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }),8175,org.apache.commons.collections4.PredicateUtils.onePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8178,org.apache.commons.collections4.PredicateUtils.onePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() }),8177,org.apache.commons.collections4.PredicateUtils.onePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8180,org.apache.commons.collections4.PredicateUtils.onePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() }),8179,org.apache.commons.collections4.PredicateUtils.onePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8182,org.apache.commons.collections4.PredicateUtils.onePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }),8181,org.apache.commons.collections4.PredicateUtils.onePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8184,org.apache.commons.collections4.PredicateUtils.onePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() }),8183,org.apache.commons.collections4.PredicateUtils.onePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() }).evaluate(null));
        final Collection<org.apache.commons.collections4.Predicate<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Predicate<java.lang.Object>>();
        coll.add(TruePredicate.truePredicate());
        coll.add(TruePredicate.truePredicate());
        coll.add(TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8186,org.apache.commons.collections4.PredicateUtils.onePredicate(coll),8185,org.apache.commons.collections4.PredicateUtils.onePredicate(coll).evaluate(null));
        coll.clear();
        coll.add(TruePredicate.truePredicate());
        coll.add(FalsePredicate.falsePredicate());
        coll.add(TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8188,org.apache.commons.collections4.PredicateUtils.onePredicate(coll),8187,org.apache.commons.collections4.PredicateUtils.onePredicate(coll).evaluate(null));
        coll.clear();
        coll.add(FalsePredicate.falsePredicate());
        coll.add(FalsePredicate.falsePredicate());
        coll.add(TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8190,org.apache.commons.collections4.PredicateUtils.onePredicate(coll),8189,org.apache.commons.collections4.PredicateUtils.onePredicate(coll).evaluate(null));
        coll.clear();
        coll.add(FalsePredicate.falsePredicate());
        coll.add(FalsePredicate.falsePredicate());
        coll.add(FalsePredicate.falsePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8192,org.apache.commons.collections4.PredicateUtils.onePredicate(coll),8191,org.apache.commons.collections4.PredicateUtils.onePredicate(coll).evaluate(null));
        coll.clear();
        coll.add(FalsePredicate.falsePredicate());
        assertFalse(org.apache.commons.collections4.PredicateUtils.onePredicate(coll), null);
        coll.clear();
        coll.add(TruePredicate.truePredicate());
        assertTrue(org.apache.commons.collections4.PredicateUtils.onePredicate(coll), null);
        coll.clear();
        assertFalse(org.apache.commons.collections4.PredicateUtils.onePredicate(coll), null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOnePredicateEx1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOnePredicateEx1");
        org.apache.commons.collections4.PredicateUtils.onePredicate(((Predicate<java.lang.Object>[])(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(expected = IllegalArgumentException.class)
    public void testOnePredicateEx2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOnePredicateEx2");
        org.apache.commons.collections4.PredicateUtils.onePredicate(new Predicate[]{ null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(expected = IllegalArgumentException.class)
    public void testOnePredicateEx3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOnePredicateEx3");
        org.apache.commons.collections4.PredicateUtils.onePredicate(new Predicate[]{ null , null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOnePredicateEx4() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOnePredicateEx4");
        org.apache.commons.collections4.PredicateUtils.onePredicate(((Collection<org.apache.commons.collections4.Predicate<java.lang.Object>>)(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test
    public void testOnePredicateEx5() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOnePredicateEx5");
        org.apache.commons.collections4.PredicateUtils.onePredicate(java.util.Collections.EMPTY_LIST);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOnePredicateEx6() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOnePredicateEx6");
        final Collection<org.apache.commons.collections4.Predicate<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Predicate<java.lang.Object>>();
        coll.add(null);
        coll.add(null);
        org.apache.commons.collections4.PredicateUtils.onePredicate(coll);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNeitherPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNeitherPredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8126,org.apache.commons.collections4.PredicateUtils.neitherPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8125,org.apache.commons.collections4.PredicateUtils.neitherPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8128,org.apache.commons.collections4.PredicateUtils.neitherPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()),8127,org.apache.commons.collections4.PredicateUtils.neitherPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8130,org.apache.commons.collections4.PredicateUtils.neitherPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8129,org.apache.commons.collections4.PredicateUtils.neitherPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8132,org.apache.commons.collections4.PredicateUtils.neitherPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()),8131,org.apache.commons.collections4.PredicateUtils.neitherPredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate(), org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNeitherPredicateEx() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNeitherPredicateEx");
        org.apache.commons.collections4.PredicateUtils.neitherPredicate(null, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test
    public void testNonePredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonePredicate");
        assertTrue(org.apache.commons.collections4.PredicateUtils.nonePredicate(new Predicate[]{  }), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8134,org.apache.commons.collections4.PredicateUtils.nonePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }),8133,org.apache.commons.collections4.PredicateUtils.nonePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8136,org.apache.commons.collections4.PredicateUtils.nonePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }),8135,org.apache.commons.collections4.PredicateUtils.nonePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.TruePredicate.truePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8138,org.apache.commons.collections4.PredicateUtils.nonePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }),8137,org.apache.commons.collections4.PredicateUtils.nonePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.TruePredicate.truePredicate() }).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8140,org.apache.commons.collections4.PredicateUtils.nonePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() }),8139,org.apache.commons.collections4.PredicateUtils.nonePredicate(new org.apache.commons.collections4.Predicate[]{ org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() , org.apache.commons.collections4.functors.FalsePredicate.falsePredicate() }).evaluate(null));
        final Collection<org.apache.commons.collections4.Predicate<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Predicate<java.lang.Object>>();
        coll.add(TruePredicate.truePredicate());
        coll.add(TruePredicate.truePredicate());
        coll.add(TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8142,org.apache.commons.collections4.PredicateUtils.nonePredicate(coll),8141,org.apache.commons.collections4.PredicateUtils.nonePredicate(coll).evaluate(null));
        coll.clear();
        coll.add(TruePredicate.truePredicate());
        coll.add(FalsePredicate.falsePredicate());
        coll.add(TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8144,org.apache.commons.collections4.PredicateUtils.nonePredicate(coll),8143,org.apache.commons.collections4.PredicateUtils.nonePredicate(coll).evaluate(null));
        coll.clear();
        coll.add(FalsePredicate.falsePredicate());
        coll.add(FalsePredicate.falsePredicate());
        coll.add(TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8146,org.apache.commons.collections4.PredicateUtils.nonePredicate(coll),8145,org.apache.commons.collections4.PredicateUtils.nonePredicate(coll).evaluate(null));
        coll.clear();
        coll.add(FalsePredicate.falsePredicate());
        coll.add(FalsePredicate.falsePredicate());
        coll.add(FalsePredicate.falsePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8148,org.apache.commons.collections4.PredicateUtils.nonePredicate(coll),8147,org.apache.commons.collections4.PredicateUtils.nonePredicate(coll).evaluate(null));
        coll.clear();
        coll.add(FalsePredicate.falsePredicate());
        assertTrue(org.apache.commons.collections4.PredicateUtils.nonePredicate(coll), null);
        coll.clear();
        coll.add(TruePredicate.truePredicate());
        assertFalse(org.apache.commons.collections4.PredicateUtils.nonePredicate(coll), null);
        coll.clear();
        assertTrue(org.apache.commons.collections4.PredicateUtils.nonePredicate(coll), null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonePredicateEx1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonePredicateEx1");
        org.apache.commons.collections4.PredicateUtils.nonePredicate(((Predicate<java.lang.Object>[])(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(expected = IllegalArgumentException.class)
    public void testNonePredicateEx2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonePredicateEx2");
        org.apache.commons.collections4.PredicateUtils.nonePredicate(new Predicate[]{ null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(expected = IllegalArgumentException.class)
    public void testNonePredicateEx3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonePredicateEx3");
        org.apache.commons.collections4.PredicateUtils.nonePredicate(new Predicate[]{ null , null });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonePredicateEx4() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonePredicateEx4");
        org.apache.commons.collections4.PredicateUtils.nonePredicate(((Collection<org.apache.commons.collections4.Predicate<java.lang.Object>>)(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNonePredicateEx5() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonePredicateEx5");
        org.apache.commons.collections4.PredicateUtils.nonePredicate(java.util.Collections.<Predicate<java.lang.Object>>emptyList());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonePredicateEx6() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonePredicateEx6");
        final Collection<org.apache.commons.collections4.Predicate<java.lang.Object>> coll = new ArrayList<org.apache.commons.collections4.Predicate<java.lang.Object>>();
        coll.add(null);
        coll.add(null);
        org.apache.commons.collections4.PredicateUtils.nonePredicate(coll);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testInstanceOfPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInstanceOfPredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8104,null,8103,org.apache.commons.collections4.PredicateUtils.instanceofPredicate(java.lang.String.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8106,org.apache.commons.collections4.PredicateUtils.instanceofPredicate(java.lang.String.class),8105,org.apache.commons.collections4.PredicateUtils.instanceofPredicate(java.lang.String.class).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8108,org.apache.commons.collections4.PredicateUtils.instanceofPredicate(java.lang.String.class),8107,org.apache.commons.collections4.PredicateUtils.instanceofPredicate(java.lang.String.class).evaluate(cObject));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8110,org.apache.commons.collections4.PredicateUtils.instanceofPredicate(java.lang.String.class),8109,org.apache.commons.collections4.PredicateUtils.instanceofPredicate(java.lang.String.class).evaluate(cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8112,org.apache.commons.collections4.PredicateUtils.instanceofPredicate(java.lang.String.class),8111,org.apache.commons.collections4.PredicateUtils.instanceofPredicate(java.lang.String.class).evaluate(cInteger));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUniquePredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUniquePredicate");
        final Predicate<java.lang.Object> p = org.apache.commons.collections4.PredicateUtils.uniquePredicate();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8220,p,8219,p.evaluate(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8222,p,8221,p.evaluate(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8224,p,8223,p.evaluate(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8226,p,8225,p.evaluate(cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8228,p,8227,p.evaluate(cString));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8230,p,8229,p.evaluate(cString));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testAsPredicateTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsPredicateTransformer");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8060,org.apache.commons.collections4.PredicateUtils.asPredicate(org.apache.commons.collections4.TransformerUtils.<java.lang.Boolean>nopTransformer()),8059,org.apache.commons.collections4.PredicateUtils.asPredicate(org.apache.commons.collections4.TransformerUtils.<java.lang.Boolean>nopTransformer()).evaluate(false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8062,org.apache.commons.collections4.PredicateUtils.asPredicate(org.apache.commons.collections4.TransformerUtils.<java.lang.Boolean>nopTransformer()),8061,org.apache.commons.collections4.PredicateUtils.asPredicate(org.apache.commons.collections4.TransformerUtils.<java.lang.Boolean>nopTransformer()).evaluate(true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAsPredicateTransformerEx1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsPredicateTransformerEx1");
        org.apache.commons.collections4.PredicateUtils.asPredicate(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = FunctorException.class)
    public void testAsPredicateTransformerEx2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsPredicateTransformerEx2");
        org.apache.commons.collections4.PredicateUtils.asPredicate(org.apache.commons.collections4.TransformerUtils.<java.lang.Boolean>nopTransformer()).evaluate(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvokerPredicateEx1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerPredicateEx1");
        org.apache.commons.collections4.PredicateUtils.invokerPredicate(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = FunctorException.class)
    public void testInvokerPredicateEx2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerPredicateEx2");
        org.apache.commons.collections4.PredicateUtils.invokerPredicate("foo").evaluate(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = FunctorException.class)
    public void testInvokerPredicateEx3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerPredicateEx3");
        org.apache.commons.collections4.PredicateUtils.invokerPredicate("foo").evaluate(new Object());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvokerPredicate2Ex1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerPredicate2Ex1");
        org.apache.commons.collections4.PredicateUtils.invokerPredicate(null, null, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = FunctorException.class)
    public void testInvokerPredicate2Ex2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerPredicate2Ex2");
        org.apache.commons.collections4.PredicateUtils.invokerPredicate("contains", new java.lang.Class[]{ Object.class }, new Object[]{ cString }).evaluate(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = FunctorException.class)
    public void testInvokerPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerPredicate");
        org.apache.commons.collections4.PredicateUtils.invokerPredicate("foo", new java.lang.Class[]{ Object.class }, new Object[]{ cString }).evaluate(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = FunctorException.class)
    public void testInvokerPredicate2Ex3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerPredicate2Ex3");
        org.apache.commons.collections4.PredicateUtils.invokerPredicate("noSuchMethod", new java.lang.Class[]{ Object.class }, new Object[]{ cString }).evaluate(new Object());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = FunctorException.class)
    public void testInvokerPredicate2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvokerPredicate2");
        org.apache.commons.collections4.PredicateUtils.invokerPredicate("foo", new java.lang.Class[]{ Object.class }, new Object[]{ cString }).evaluate(new Object());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = FunctorException.class)
    public void testNullIsExceptionPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullIsExceptionPredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8160,org.apache.commons.collections4.PredicateUtils.nullIsExceptionPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8159,org.apache.commons.collections4.PredicateUtils.nullIsExceptionPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(new java.lang.Object()));
        org.apache.commons.collections4.PredicateUtils.nullIsExceptionPredicate(TruePredicate.truePredicate()).evaluate(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullIsExceptionPredicateEx1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullIsExceptionPredicateEx1");
        org.apache.commons.collections4.PredicateUtils.nullIsExceptionPredicate(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNullIsTruePredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullIsTruePredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8168,org.apache.commons.collections4.PredicateUtils.nullIsTruePredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8167,org.apache.commons.collections4.PredicateUtils.nullIsTruePredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8170,org.apache.commons.collections4.PredicateUtils.nullIsTruePredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8169,org.apache.commons.collections4.PredicateUtils.nullIsTruePredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8172,org.apache.commons.collections4.PredicateUtils.nullIsTruePredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()),8171,org.apache.commons.collections4.PredicateUtils.nullIsTruePredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).evaluate(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullIsTruePredicateEx1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullIsTruePredicateEx1");
        org.apache.commons.collections4.PredicateUtils.nullIsTruePredicate(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNullIsFalsePredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullIsFalsePredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8162,org.apache.commons.collections4.PredicateUtils.nullIsFalsePredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8161,org.apache.commons.collections4.PredicateUtils.nullIsFalsePredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8164,org.apache.commons.collections4.PredicateUtils.nullIsFalsePredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8163,org.apache.commons.collections4.PredicateUtils.nullIsFalsePredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8166,org.apache.commons.collections4.PredicateUtils.nullIsFalsePredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()),8165,org.apache.commons.collections4.PredicateUtils.nullIsFalsePredicate(org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()).evaluate(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullIsFalsePredicateEx1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullIsFalsePredicateEx1");
        org.apache.commons.collections4.PredicateUtils.nullIsFalsePredicate(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTransformedPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedPredicate");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,org.apache.commons.collections4.PredicateUtils.transformedPredicate(org.apache.commons.collections4.TransformerUtils.nopTransformer(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8201,org.apache.commons.collections4.PredicateUtils.transformedPredicate(org.apache.commons.collections4.TransformerUtils.nopTransformer(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(new java.lang.Object()));
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(java.lang.Boolean.TRUE, "foo");
        final Transformer<java.lang.Object, java.lang.Object> t = org.apache.commons.collections4.TransformerUtils.mapTransformer(map);
        final Predicate<java.lang.Object> p = org.apache.commons.collections4.functors.EqualPredicate.<Object>equalPredicate("Hello");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,org.apache.commons.collections4.PredicateUtils.transformedPredicate(t, p),8203,org.apache.commons.collections4.PredicateUtils.transformedPredicate(t, p).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,org.apache.commons.collections4.PredicateUtils.transformedPredicate(t, p),8205,org.apache.commons.collections4.PredicateUtils.transformedPredicate(t, p).evaluate(java.lang.Boolean.TRUE));
        try {
            org.apache.commons.collections4.PredicateUtils.transformedPredicate(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTransformedPredicate_literalMutation3034() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedPredicate_literalMutation3034");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8202,org.apache.commons.collections4.PredicateUtils.transformedPredicate(org.apache.commons.collections4.TransformerUtils.nopTransformer(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()),8201,org.apache.commons.collections4.PredicateUtils.transformedPredicate(org.apache.commons.collections4.TransformerUtils.nopTransformer(), org.apache.commons.collections4.functors.TruePredicate.truePredicate()).evaluate(new java.lang.Object()));
        final Map<java.lang.Object, java.lang.Object> map = new HashMap<java.lang.Object, java.lang.Object>();
        map.put(java.lang.Boolean.TRUE, "Hello");
        final Transformer<java.lang.Object, java.lang.Object> t = org.apache.commons.collections4.TransformerUtils.mapTransformer(map);
        final Predicate<java.lang.Object> p = org.apache.commons.collections4.functors.EqualPredicate.<Object>equalPredicate("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8204,org.apache.commons.collections4.PredicateUtils.transformedPredicate(t, p),8203,org.apache.commons.collections4.PredicateUtils.transformedPredicate(t, p).evaluate(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8206,org.apache.commons.collections4.PredicateUtils.transformedPredicate(t, p),8205,org.apache.commons.collections4.PredicateUtils.transformedPredicate(t, p).evaluate(java.lang.Boolean.TRUE));
        try {
            org.apache.commons.collections4.PredicateUtils.transformedPredicate(null, null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that all Predicate singletones hold singleton pattern in
     * serialization/deserialization process.
     */
@Test
    public void testSingletonPatternInSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonPatternInSerialization");
        final Object[] singletones = new Object[]{ ExceptionPredicate.INSTANCE , FalsePredicate.INSTANCE , NotNullPredicate.INSTANCE , NullPredicate.INSTANCE , TruePredicate.INSTANCE };
        for (final Object original : singletones) {
            org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(("Singletone patern broken for " + (original.getClass())), original);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that all Predicate singletones hold singleton pattern in
     * serialization/deserialization process.
     */
@Test
    public void testSingletonPatternInSerialization_literalMutation3032() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonPatternInSerialization_literalMutation3032");
        final Object[] singletones = new Object[]{ ExceptionPredicate.INSTANCE , FalsePredicate.INSTANCE , NotNullPredicate.INSTANCE , NullPredicate.INSTANCE , TruePredicate.INSTANCE };
        for (final Object original : singletones) {
            org.apache.commons.collections4.TestUtils.assertSameAfterSerialization(("foo" + (original.getClass())), original);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    protected Predicate<?> generatePredicate() {
        return TruePredicate.truePredicate();
    }
}

