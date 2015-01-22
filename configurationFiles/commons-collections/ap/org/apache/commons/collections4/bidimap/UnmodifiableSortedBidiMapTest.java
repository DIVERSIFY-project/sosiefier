package org.apache.commons.collections4.bidimap;

import org.apache.commons.collections4.SortedBidiMap;
import java.util.SortedMap;
import junit.framework.Test;
import java.util.TreeMap;

/** 
 * JUnit tests.
 * 
 * @version $Id$
 */
public class UnmodifiableSortedBidiMapTest<K extends java.lang.Comparable<K>, V extends Comparable<V>> extends AbstractSortedBidiMapTest<K, V> {
    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(UnmodifiableSortedBidiMapTest.class);
    }

    public UnmodifiableSortedBidiMapTest(final String testName) {
        super(testName);
    }

    @Override
    public SortedBidiMap<K, V> makeObject() {
        return org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.unmodifiableSortedBidiMap(new DualTreeBidiMap<K, V>());
    }

    @Override
    public SortedBidiMap<K, V> makeFullMap() {
        final SortedBidiMap<K, V> bidi = new DualTreeBidiMap<K, V>();
        addSampleMappings(bidi);
        return org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.unmodifiableSortedBidiMap(bidi);
    }

    @Override
    public SortedMap<K, V> makeConfirmedMap() {
        return new TreeMap<K, V>();
    }

    @Override
    public boolean isSubMapViewsSerializable() {
        return false;
    }

    @Override
    public String[] ignoredTests() {
        return new String[]{ "UnmodifiableSortedBidiMapTest.bulkTestInverseMap.bulkTestInverseMap" };
    }

    @Override
    public boolean isAllowNullKey() {
        return false;
    }

    @Override
    public boolean isAllowNullValue() {
        return false;
    }

    @Override
    public boolean isPutAddSupported() {
        return false;
    }

    @Override
    public boolean isPutChangeSupported() {
        return false;
    }

    @Override
    public boolean isRemoveSupported() {
        return false;
    }

    public void testUnmodifiable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,((makeObject()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5602,((makeFullMap()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final SortedBidiMap<K, V> map = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5598,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5600,null,5599,org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.unmodifiableSortedBidiMap(map));
        try {
            org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.unmodifiableSortedBidiMap(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

