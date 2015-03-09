package org.apache.commons.collections4;

import org.apache.commons.collections4.map.AbstractMapTest;
import org.junit.Test;
import java.util.TreeMap;

/** 
 * Tests TreeMap.
 * 
 * @version $Id$
 */
public abstract class AbstractTreeMapTest<K, V> extends AbstractMapTest<K, V> {
    public AbstractTreeMapTest(final String testName) {
        super(testName);
    }

    @Override
    public boolean isAllowNullKey() {
        return false;
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public abstract TreeMap<K, V> makeObject();

    public void testNewMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewMap");
        final TreeMap<K, V> map = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6402,map,6401,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6404,map,6403,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("first")), ((V)("First Item")));
        map.put(((K)("second")), ((V)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6406,map,6405,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6408,map,6407,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSearch_add2040() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_add2040");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("first")), ((V)("First Item")));
        map.put(((K)("first")), ((V)("First Item")));
        map.put(((K)("second")), ((V)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6406,map,6405,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6408,map,6407,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSearch_add2041() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_add2041");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("first")), ((V)("First Item")));
        map.put(((K)("second")), ((V)("Second Item")));
        map.put(((K)("second")), ((V)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6406,map,6405,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6408,map,6407,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1951() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1951");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("first")), ((V)("First Item")));
        map.put(((K)("second")), ((V)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6406,map,6405,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6408,map,6407,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1952() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1952");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("foo")), ((V)("First Item")));
        map.put(((K)("second")), ((V)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6406,map,6405,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6408,map,6407,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1953() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1953");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("first")), ((V)("foo")));
        map.put(((K)("second")), ((V)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6406,map,6405,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6408,map,6407,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1954() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1954");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("first")), ((V)("First Item")));
        map.put(((K)("foo")), ((V)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6406,map,6405,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6408,map,6407,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1955() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1955");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("first")), ((V)("First Item")));
        map.put(((K)("second")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6406,map,6405,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6408,map,6407,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSearch_remove1594() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_remove1594");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("second")), ((V)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6406,map,6405,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6408,map,6407,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSearch_remove1595() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_remove1595");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("second")), ((V)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6406,map,6405,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6408,map,6407,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

