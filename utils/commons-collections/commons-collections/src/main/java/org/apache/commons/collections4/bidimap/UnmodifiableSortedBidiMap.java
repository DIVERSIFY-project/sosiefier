/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.collections4.bidimap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

import org.apache.commons.collections4.set.UnmodifiableSet;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.SortedBidiMap;
import org.apache.commons.collections4.Unmodifiable;
import org.apache.commons.collections4.collection.UnmodifiableCollection;
import org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator;
import org.apache.commons.collections4.map.UnmodifiableEntrySet;
import org.apache.commons.collections4.map.UnmodifiableSortedMap;

/**
 * Decorates another {@link SortedBidiMap} to ensure it can't be altered.
 * <p>
 * Attempts to modify it will result in an {@link UnsupportedOperationException}.
 *
 * @since 3.0
 * @version $Id: UnmodifiableSortedBidiMap.java 1479400 2013-05-05 21:49:47Z tn $
 */
public final class UnmodifiableSortedBidiMap<K, V>
        extends AbstractSortedBidiMapDecorator<K, V> implements Unmodifiable {

    /** The inverse unmodifiable map */
    private UnmodifiableSortedBidiMap<V, K> inverse;

    /**
     * Factory method to create an unmodifiable map.
     * <p>
     * If the map passed in is already unmodifiable, it is returned.
     *
     * @param <K> the key type
     * @param <V> the value type
     * @param map  the map to decorate, must not be null
     * @return an unmodifiable SortedBidiMap
     * @throws IllegalArgumentException if map is null
     * @since 4.0
     */
    public static <K, V> SortedBidiMap<K, V> unmodifiableSortedBidiMap(final SortedBidiMap<K, V> map) {
        if (map instanceof Unmodifiable) {
            return map;
        }
        return new UnmodifiableSortedBidiMap<K, V>(map);
    }

    //-----------------------------------------------------------------------
    /**
     * Constructor that wraps (not copies).
     *
     * @param map  the map to decorate, must not be null
     * @throws IllegalArgumentException if map is null
     */
    private UnmodifiableSortedBidiMap(final SortedBidiMap<K, V> map) {
        super(map);
    }

    //-----------------------------------------------------------------------
    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public V put(final K key, final V value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void putAll(final Map<? extends K, ? extends V> mapToCopy) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V remove(final Object key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        final Set<Map.Entry<K, V>> set = super.entrySet();
        return UnmodifiableEntrySet.unmodifiableEntrySet(set);
    }

    @Override
    public Set<K> keySet() {
        final Set<K> set = super.keySet();
        return UnmodifiableSet.unmodifiableSet(set);
    }

    @Override
    public Collection<V> values() {
        final Collection<V> coll = super.values();
        return UnmodifiableCollection.unmodifiableCollection(coll);
    }

    //-----------------------------------------------------------------------
    @Override
    public K removeValue(final Object value) {
        throw new UnsupportedOperationException();
    }

    //-----------------------------------------------------------------------
    @Override
    public OrderedMapIterator<K, V> mapIterator() {
        final OrderedMapIterator<K, V> it = decorated().mapIterator();
        return UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator(it);
    }

    //-----------------------------------------------------------------------
    @Override
    public SortedBidiMap<V, K> inverseBidiMap() {
        if (inverse == null) {
            inverse = new UnmodifiableSortedBidiMap<V, K>(decorated().inverseBidiMap());
            inverse.inverse = this;
        }
        return inverse;
    }

    @Override
    public SortedMap<K, V> subMap(final K fromKey, final K toKey) {
        final SortedMap<K, V> sm = decorated().subMap(fromKey, toKey);
        return UnmodifiableSortedMap.unmodifiableSortedMap(sm);
    }

    @Override
    public SortedMap<K, V> headMap(final K toKey) {
        final SortedMap<K, V> sm = decorated().headMap(toKey);
        return UnmodifiableSortedMap.unmodifiableSortedMap(sm);
    }

    @Override
    public SortedMap<K, V> tailMap(final K fromKey) {
        final SortedMap<K, V> sm = decorated().tailMap(fromKey);
        return UnmodifiableSortedMap.unmodifiableSortedMap(sm);
    }

}
