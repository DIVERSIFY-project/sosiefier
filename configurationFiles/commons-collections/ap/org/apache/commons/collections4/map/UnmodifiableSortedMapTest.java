package org.apache.commons.collections4.map;

import java.util.SortedMap;
import java.util.TreeMap;

/** 
 * Extension of {@link AbstractSortedMapTest} for exercising the
 * {@link UnmodifiableSortedMap} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class UnmodifiableSortedMapTest<K, V> extends AbstractSortedMapTest<K, V> {
    public UnmodifiableSortedMapTest(final String testName) {
        super(testName);
    }

    @Override
    public SortedMap<K, V> makeObject() {
        return org.apache.commons.collections4.map.UnmodifiableSortedMap.unmodifiableSortedMap(new TreeMap<K, V>());
    }

    @Override
    public boolean isPutChangeSupported() {
        return false;
    }

    @Override
    public boolean isPutAddSupported() {
        return false;
    }

    @Override
    public boolean isRemoveSupported() {
        return false;
    }

    @Override
    public SortedMap<K, V> makeFullMap() {
        final SortedMap<K, V> m = new TreeMap<K, V>();
        addSampleMappings(m);
        return org.apache.commons.collections4.map.UnmodifiableSortedMap.unmodifiableSortedMap(m);
    }

    public void testUnmodifiable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1991,((makeObject()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1992,((makeFullMap()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final SortedMap<K, V> map = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1988,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1994,null,1993,org.apache.commons.collections4.map.UnmodifiableSortedMap.unmodifiableSortedMap(map));
        try {
            org.apache.commons.collections4.map.UnmodifiableSortedMap.unmodifiableSortedMap(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

