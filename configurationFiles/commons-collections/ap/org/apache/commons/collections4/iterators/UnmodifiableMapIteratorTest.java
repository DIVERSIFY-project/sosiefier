package org.apache.commons.collections4.iterators;

import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import java.util.HashMap;
import org.apache.commons.collections4.IterableMap;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;

/** 
 * Tests the UnmodifiableMapIterator.
 * 
 * @version $Id$
 */
public class UnmodifiableMapIteratorTest<K, V> extends AbstractMapIteratorTest<K, V> {
    public UnmodifiableMapIteratorTest(final String testName) {
        super(testName);
    }

    @Override
    public MapIterator<K, V> makeEmptyIterator() {
        return org.apache.commons.collections4.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(new DualHashBidiMap<K, V>().mapIterator());
    }

    @Override
    public MapIterator<K, V> makeObject() {
        return org.apache.commons.collections4.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(getMap().mapIterator());
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public IterableMap<K, V> getMap() {
        final IterableMap<K, V> testMap = new DualHashBidiMap<K, V>();
        testMap.put(((K)("A")), ((V)("a")));
        testMap.put(((K)("B")), ((V)("b")));
        testMap.put(((K)("C")), ((V)("c")));
        return testMap;
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public Map<K, V> getConfirmedMap() {
        final Map<K, V> testMap = new HashMap<K, V>();
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

    public void testMapIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIterator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4396,((makeEmptyIterator()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        MapIterator<K, V> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4392,it);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4394,null,4393,org.apache.commons.collections4.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(it));
        it = getMap().mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4395,(it != (org.apache.commons.collections4.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(it))));
        try {
            org.apache.commons.collections4.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

