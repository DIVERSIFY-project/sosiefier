package org.apache.commons.collections4.map;

import org.apache.commons.collections4.iterators.AbstractMapIteratorTest;
import org.apache.commons.collections4.BulkTest;
import java.util.ConcurrentModificationException;
import org.apache.commons.collections4.IterableMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;

/** 
 * Abstract test class for {@link IterableMap} methods and contracts.
 * 
 * @version $Id$
 */
public abstract class AbstractIterableMapTest<K, V> extends AbstractMapTest<K, V> {
    /** 
     * JUnit constructor.
     * 
     * @param testName the test name
     */
public AbstractIterableMapTest(final String testName) {
        super(testName);
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public abstract IterableMap<K, V> makeObject();

    /** 
     * {@inheritDoc}
     */
@Override
    public IterableMap<K, V> makeFullMap() {
        return ((IterableMap<K, V>)(super.makeFullMap()));
    }

    public void testFailFastEntrySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastEntrySet");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
        resetFull();
        Iterator<java.util.Map.Entry<K, V>> it = getMap().entrySet().iterator();
        final Map.Entry<K, V> val = it.next();
        getMap().remove(val.getKey());
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        resetFull();
        it = getMap().entrySet().iterator();
        it.next();
        getMap().clear();
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFailFastKeySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastKeySet");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
        resetFull();
        Iterator<K> it = getMap().keySet().iterator();
        final K val = it.next();
        getMap().remove(val);
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        resetFull();
        it = getMap().keySet().iterator();
        it.next();
        getMap().clear();
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFailFastValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastValues");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
        resetFull();
        Iterator<V> it = getMap().values().iterator();
        it.next();
        getMap().remove(getMap().keySet().iterator().next());
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        resetFull();
        it = getMap().values().iterator();
        it.next();
        getMap().clear();
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public BulkTest bulkTestMapIterator() {
        return new InnerTestMapIterator();
    }

    public class InnerTestMapIterator extends AbstractMapIteratorTest<K, V> {
        public InnerTestMapIterator() {
            super("InnerTestMapIterator");
        }

        @Override
        public V[] addSetValues() {
            return org.apache.commons.collections4.map.AbstractIterableMapTest.this.getNewSampleValues();
        }

        @Override
        public boolean supportsRemove() {
            return org.apache.commons.collections4.map.AbstractIterableMapTest.this.isRemoveSupported();
        }

        @Override
        public boolean isGetStructuralModify() {
            return org.apache.commons.collections4.map.AbstractIterableMapTest.this.isGetStructuralModify();
        }

        @Override
        public boolean supportsSetValue() {
            return org.apache.commons.collections4.map.AbstractIterableMapTest.this.isSetValueSupported();
        }

        @Override
        public MapIterator<K, V> makeEmptyIterator() {
            resetEmpty();
            return org.apache.commons.collections4.map.AbstractIterableMapTest.this.getMap().mapIterator();
        }

        @Override
        public MapIterator<K, V> makeObject() {
            resetFull();
            return org.apache.commons.collections4.map.AbstractIterableMapTest.this.getMap().mapIterator();
        }

        @Override
        public Map<K, V> getMap() {
            return org.apache.commons.collections4.map.AbstractIterableMapTest.this.getMap();
        }

        @Override
        public Map<K, V> getConfirmedMap() {
            return org.apache.commons.collections4.map.AbstractIterableMapTest.this.getConfirmed();
        }

        @Override
        public void verify() {
            super.verify();
            org.apache.commons.collections4.map.AbstractIterableMapTest.this.verify();
        }
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public IterableMap<K, V> getMap() {
        return ((IterableMap<K, V>)(super.getMap()));
    }
}

