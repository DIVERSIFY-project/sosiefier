package org.apache.commons.collections4;

import org.apache.commons.collections4.map.AbstractMapTest;
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6441,map,6440,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6443,map,6442,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("first")), ((V)("First Item")));
        map.put(((K)("second")), ((V)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6445,map,6444,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6447,map,6446,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1951() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1951");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("first")), ((V)("First Item")));
        map.put(((K)("second")), ((V)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6445,map,6444,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6447,map,6446,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1952() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1952");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("foo")), ((V)("First Item")));
        map.put(((K)("second")), ((V)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6445,map,6444,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6447,map,6446,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1953() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1953");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("first")), ((V)("foo")));
        map.put(((K)("second")), ((V)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6445,map,6444,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6447,map,6446,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1954() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1954");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("first")), ((V)("First Item")));
        map.put(((K)("foo")), ((V)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6445,map,6444,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6447,map,6446,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1955() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1955");
        final TreeMap<K, V> map = makeObject();
        map.put(((K)("first")), ((V)("First Item")));
        map.put(((K)("second")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6445,map,6444,map.get("first"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6447,map,6446,map.get("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

