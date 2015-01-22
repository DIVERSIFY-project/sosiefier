package org.apache.commons.collections4.bidimap;

import org.apache.commons.collections4.iterators.AbstractMapIteratorTest;
import org.apache.commons.collections4.map.AbstractMapTest;
import java.util.ArrayList;
import org.apache.commons.collections4.BulkTest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.OrderedBidiMap;

/** 
 * Abstract test class for {@link OrderedBidiMap} methods and contracts.
 * 
 * @version $Id$
 */
public abstract class AbstractOrderedBidiMapTest<K, V> extends AbstractBidiMapTest<K, V> {
    public AbstractOrderedBidiMapTest(final String testName) {
        super(testName);
    }

    public AbstractOrderedBidiMapTest() {
        super();
    }

    public void testFirstKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstKey");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        try {
            bidi.firstKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        bidi = getMap();
        final K confirmedFirst = confirmed.keySet().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4979,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4981,bidi,4980,bidi.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLastKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLastKey");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        try {
            bidi.lastKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        bidi = getMap();
        K confirmedLast = null;
        for (final Iterator<K> it = confirmed.keySet().iterator() ; it.hasNext() ; ) {
            confirmedLast = it.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4982,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4984,bidi,4983,bidi.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNextKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextKey");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = ((OrderedBidiMap<K, V>)(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4986,bidi,4985,bidi.nextKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4988,bidi,4987,bidi.nextKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4990,bidi,4989,bidi.nextKey(null));
        }
        resetFull();
        bidi = ((OrderedBidiMap<K, V>)(map));
        final Iterator<K> it = confirmed.keySet().iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4991,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4993,bidi,4992,bidi.nextKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4995,bidi,4994,bidi.nextKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.nextKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4997,bidi,4996,bidi.nextKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPreviousKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4999,bidi,4998,bidi.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5001,bidi,5000,bidi.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5003,bidi,5002,bidi.previousKey(null));
        }
        resetFull();
        bidi = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        java.util.Collections.reverse(list);
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5004,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5006,bidi,5005,bidi.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5008,bidi,5007,bidi.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5010,bidi,5009,bidi.previousKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public BulkTest bulkTestOrderedMapIterator() {
        return new TestBidiOrderedMapIterator();
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public OrderedBidiMap<K, V> getMap() {
        return ((OrderedBidiMap<K, V>)(super.getMap()));
    }

    public class TestBidiOrderedMapIterator extends AbstractMapIteratorTest<K, V> {
        public TestBidiOrderedMapIterator() {
            super("TestBidiOrderedMapIterator");
        }

        @Override
        public V[] addSetValues() {
            return org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapTest.this.getNewSampleValues();
        }

        @Override
        public boolean supportsRemove() {
            return org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapTest.this.isRemoveSupported();
        }

        @Override
        public boolean supportsSetValue() {
            return org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapTest.this.isSetValueSupported();
        }

        @Override
        public MapIterator<K, V> makeEmptyIterator() {
            resetEmpty();
            return org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapTest.this.getMap().mapIterator();
        }

        @Override
        public MapIterator<K, V> makeObject() {
            resetFull();
            return org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapTest.this.getMap().mapIterator();
        }

        @Override
        public Map<K, V> getMap() {
            return org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapTest.this.map;
        }

        @Override
        public Map<K, V> getConfirmedMap() {
            return org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapTest.this.confirmed;
        }

        @Override
        public void verify() {
            super.verify();
            org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapTest.this.verify();
        }
    }
}

