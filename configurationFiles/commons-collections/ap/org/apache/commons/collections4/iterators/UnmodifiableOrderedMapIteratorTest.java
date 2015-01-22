package org.apache.commons.collections4.iterators;

import java.util.Map;
import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.OrderedMapIterator;
import java.util.TreeMap;

/** 
 * Tests the UnmodifiableOrderedMapIterator.
 * 
 * @version $Id$
 */
public class UnmodifiableOrderedMapIteratorTest<K, V> extends AbstractOrderedMapIteratorTest<K, V> {
    public UnmodifiableOrderedMapIteratorTest(final String testName) {
        super(testName);
    }

    @Override
    public OrderedMapIterator<K, V> makeEmptyIterator() {
        return org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator(org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(new java.util.HashMap<K, V>()).mapIterator());
    }

    @Override
    public OrderedMapIterator<K, V> makeObject() {
        return org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator(getMap().mapIterator());
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public OrderedMap<K, V> getMap() {
        final OrderedMap<K, V> testMap = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(new java.util.HashMap<K, V>());
        testMap.put(((K)("A")), ((V)("a")));
        testMap.put(((K)("B")), ((V)("b")));
        testMap.put(((K)("C")), ((V)("c")));
        return testMap;
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public Map<K, V> getConfirmedMap() {
        final Map<K, V> testMap = new TreeMap<K, V>();
        testMap.put(((K)("A")), ((V)("a")));
        testMap.put(((K)("B")), ((V)("b")));
        testMap.put(((K)("C")), ((V)("c")));
        return testMap;
    }

    @Override
    public boolean supportsRemove() {
        return false;
    }

    @Override
    public boolean supportsSetValue() {
        return false;
    }

    public void testOrderedMapIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrderedMapIterator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4401,((makeEmptyIterator()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        OrderedMapIterator<K, V> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4397,it);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4399,null,4398,org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator(it));
        it = getMap().mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4400,(it != (org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator(it))));
        try {
            org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

