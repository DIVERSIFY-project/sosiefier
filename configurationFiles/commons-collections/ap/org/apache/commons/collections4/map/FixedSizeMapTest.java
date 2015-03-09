package org.apache.commons.collections4.map;

import java.util.HashMap;
import org.apache.commons.collections4.IterableMap;
import java.util.Map;

/** 
 * Extension of {@link AbstractMapTest} for exercising the {@link FixedSizeMap}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class FixedSizeMapTest<K, V> extends AbstractIterableMapTest<K, V> {
    public FixedSizeMapTest(final String testName) {
        super(testName);
    }

    @Override
    public IterableMap<K, V> makeObject() {
        return org.apache.commons.collections4.map.FixedSizeMap.fixedSizeMap(new HashMap<K, V>());
    }

    @Override
    public IterableMap<K, V> makeFullMap() {
        final Map<K, V> map = new HashMap<K, V>();
        addSampleMappings(map);
        return org.apache.commons.collections4.map.FixedSizeMap.fixedSizeMap(map);
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

