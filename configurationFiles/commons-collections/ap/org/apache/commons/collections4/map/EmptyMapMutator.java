package org.apache.commons.collections4.map;

import java.util.Collection;
import java.util.Map;

/** 
 * This class is used in TestCompositeMap. When testing serialization,
 * the class has to be separate of TestCompositeMap, else the test
 * class also has to be serialized.
 */
class EmptyMapMutator<K, V> implements CompositeMap.MapMutator<K, V> {
    /** 
     * Serialization version
     */
private static final long serialVersionUID = -2729718980002476794L;

    public void resolveCollision(final CompositeMap<K, V> composite, final Map<K, V> existing, final Map<K, V> added, final Collection<K> intersect) {
    }

    public V put(final CompositeMap<K, V> map, final Map<K, V>[] composited, final K key, final V value) {
        return composited[0].put(key, value);
    }

    public void putAll(final CompositeMap<K, V> map, final Map<K, V>[] composited, final Map<? extends K, ? extends V> t) {
        composited[0].putAll(t);
    }
}

