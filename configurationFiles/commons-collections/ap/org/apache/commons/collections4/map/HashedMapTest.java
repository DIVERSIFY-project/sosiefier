package org.apache.commons.collections4.map;

import junit.framework.Test;

/** 
 * JUnit tests.
 * 
 * @version $Id$
 */
public class HashedMapTest<K, V> extends AbstractIterableMapTest<K, V> {
    public HashedMapTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(HashedMapTest.class);
    }

    @Override
    public HashedMap<K, V> makeObject() {
        return new HashedMap<K, V>();
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone");
        final HashedMap<K, V> map = new HashedMap<K, V>(10);
        map.put(((K)("1")), ((V)("1")));
        final HashedMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),797,cloned,796,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),799,map,798,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),801,cloned,800,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testClone_add306() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_add306");
        final HashedMap<K, V> map = new HashedMap<K, V>(10);
        map.put(((K)("1")), ((V)("1")));
        map.put(((K)("1")), ((V)("1")));
        final HashedMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),797,cloned,796,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),799,map,798,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),801,cloned,800,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone_literalMutation208() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_literalMutation208");
        final HashedMap<K, V> map = new HashedMap<K, V>(10);
        map.put(((K)("1")), ((V)("1")));
        final HashedMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),797,cloned,796,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),799,map,798,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),801,cloned,800,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone_literalMutation209() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_literalMutation209");
        final HashedMap<K, V> map = new HashedMap<K, V>(11);
        map.put(((K)("1")), ((V)("1")));
        final HashedMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),797,cloned,796,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),799,map,798,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),801,cloned,800,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone_literalMutation210() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_literalMutation210");
        final HashedMap<K, V> map = new HashedMap<K, V>(10);
        map.put(((K)("foo")), ((V)("1")));
        final HashedMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),797,cloned,796,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),799,map,798,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),801,cloned,800,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone_literalMutation211() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_literalMutation211");
        final HashedMap<K, V> map = new HashedMap<K, V>(10);
        map.put(((K)("1")), ((V)("foo")));
        final HashedMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),797,cloned,796,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),799,map,798,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),801,cloned,800,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testClone_remove256() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_remove256");
        final HashedMap<K, V> map = new HashedMap<K, V>(10);
        final HashedMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),797,cloned,796,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),799,map,798,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),801,cloned,800,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInternalState() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInternalState");
        final HashedMap<K, V> map = new HashedMap<K, V>(43 , 0.75F);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),803,map.loadFactor);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),804,map.size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),805,map.data.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),806,map.threshold);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),807,map.modCount);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInternalState_literalMutation214() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInternalState_literalMutation214");
        final HashedMap<K, V> map = new HashedMap<K, V>(42 , 1.75F);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),803,map.loadFactor);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),804,map.size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),805,map.data.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),806,map.threshold);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),807,map.modCount);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for <a href="https://issues.apache.org/jira/browse/COLLECTIONS-323">COLLECTIONS-323</a>.
     */
public void testInitialCapacityZero() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInitialCapacityZero");
        final HashedMap<java.lang.String, java.lang.String> map = new HashedMap<java.lang.String, java.lang.String>(0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),802,map.data.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for <a href="https://issues.apache.org/jira/browse/COLLECTIONS-323">COLLECTIONS-323</a>.
     */
public void testInitialCapacityZero_literalMutation212() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInitialCapacityZero_literalMutation212");
        final HashedMap<java.lang.String, java.lang.String> map = new HashedMap<java.lang.String, java.lang.String>(-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),802,map.data.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

