package org.apache.commons.collections4.map;

import java.util.SortedMap;
import junit.framework.Test;
import java.util.TreeMap;

/** 
 * Extension of {@link AbstractSortedMapTest} for exercising the {@link FixedSizeSortedMap}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class FixedSizeSortedMapTest<K, V> extends AbstractSortedMapTest<K, V> {
    public FixedSizeSortedMapTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(FixedSizeSortedMapTest.class);
    }

    @Override
    public SortedMap<K, V> makeObject() {
        return org.apache.commons.collections4.map.FixedSizeSortedMap.fixedSizeSortedMap(new TreeMap<K, V>());
    }

    @Override
    public SortedMap<K, V> makeFullMap() {
        final SortedMap<K, V> map = new TreeMap<K, V>();
        addSampleMappings(map);
        return org.apache.commons.collections4.map.FixedSizeSortedMap.fixedSizeSortedMap(map);
    }

    @Override
    public boolean isSubMapViewsSerializable() {
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
    public String getCompatibilityVersion() {
        return "4";
    }
}

