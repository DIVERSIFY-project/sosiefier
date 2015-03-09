package org.apache.commons.collections4.map;

import org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorTest;
import java.util.ArrayList;
import org.apache.commons.collections4.BulkTest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.comparators.NullComparator;
import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Test;
import java.util.TreeMap;

/** 
 * Abstract test class for {@link OrderedMap} methods and contracts.
 * 
 * @version $Id$
 */
public abstract class AbstractOrderedMapTest<K, V> extends AbstractIterableMapTest<K, V> {
    /** 
     * JUnit constructor.
     * 
     * @param testName the test name
     */
public AbstractOrderedMapTest(final String testName) {
        super(testName);
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public abstract OrderedMap<K, V> makeObject();

    /** 
     * {@inheritDoc}
     */
@Override
    public OrderedMap<K, V> makeFullMap() {
        return ((OrderedMap<K, V>)(super.makeFullMap()));
    }

    /** 
     * OrderedMap uses TreeMap as its known comparison.
     * 
     * @return a map that is known to be valid
     */
@Override
    public Map<K, V> makeConfirmedMap() {
        return new TreeMap<K, V>(new NullComparator<K>());
    }

    /** 
     * The only confirmed collection we have that is ordered is the sorted one.
     * Thus, sort the keys.
     */
@Override
    @SuppressWarnings(value = "unchecked")
    public K[] getSampleKeys() {
        final List<K> list = new ArrayList<K>(java.util.Arrays.asList(super.getSampleKeys()));
        java.util.Collections.sort(list, new NullComparator<K>());
        return ((K[])(list.toArray()));
    }

    @Test(timeout = 1000)
    public void testFirstKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstKey");
        resetEmpty();
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        try {
            ordered.firstKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        ordered = getMap();
        final K confirmedFirst = confirmed.keySet().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,ordered,341,ordered.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstKey_add172() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstKey_add172");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        try {
            ordered.firstKey();
            ordered.firstKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        ordered = getMap();
        final K confirmedFirst = confirmed.keySet().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,ordered,341,ordered.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstKey_add173() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstKey_add173");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        try {
            ordered.firstKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        resetFull();
        ordered = getMap();
        final K confirmedFirst = confirmed.keySet().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,ordered,341,ordered.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstKey_remove141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstKey_remove141");
        OrderedMap<K, V> ordered = getMap();
        try {
            ordered.firstKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        ordered = getMap();
        final K confirmedFirst = confirmed.keySet().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,ordered,341,ordered.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstKey_remove142() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstKey_remove142");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        try {
            ordered.firstKey();
        } catch (final NoSuchElementException ex) {
        }
        ordered = getMap();
        final K confirmedFirst = confirmed.keySet().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,ordered,341,ordered.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLastKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLastKey");
        resetEmpty();
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        try {
            ordered.lastKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        ordered = getMap();
        K confirmedLast = null;
        for (final Iterator<K> it = confirmed.keySet().iterator() ; it.hasNext() ; ) {
            confirmedLast = it.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,ordered,344,ordered.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLastKey_add175() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLastKey_add175");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        try {
            ordered.lastKey();
            ordered.lastKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        ordered = getMap();
        K confirmedLast = null;
        for (final Iterator<K> it = confirmed.keySet().iterator() ; it.hasNext() ; ) {
            confirmedLast = it.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,ordered,344,ordered.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLastKey_add176() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLastKey_add176");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        try {
            ordered.lastKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        resetFull();
        ordered = getMap();
        K confirmedLast = null;
        for (final Iterator<K> it = confirmed.keySet().iterator() ; it.hasNext() ; ) {
            confirmedLast = it.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,ordered,344,ordered.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLastKey_remove143() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLastKey_remove143");
        OrderedMap<K, V> ordered = getMap();
        try {
            ordered.lastKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        ordered = getMap();
        K confirmedLast = null;
        for (final Iterator<K> it = confirmed.keySet().iterator() ; it.hasNext() ; ) {
            confirmedLast = it.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,ordered,344,ordered.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLastKey_remove144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLastKey_remove144");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        try {
            ordered.lastKey();
        } catch (final NoSuchElementException ex) {
        }
        ordered = getMap();
        K confirmedLast = null;
        for (final Iterator<K> it = confirmed.keySet().iterator() ; it.hasNext() ; ) {
            confirmedLast = it.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,ordered,344,ordered.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNextKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextKey");
        resetEmpty();
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,ordered,346,ordered.nextKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,ordered,348,ordered.nextKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,ordered,350,ordered.nextKey(null));
        }
        resetFull();
        ordered = getMap();
        final Iterator<K> it = confirmed.keySet().iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),352,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),354,ordered,353,ordered.nextKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),356,ordered,355,ordered.nextKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                ordered.nextKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),358,ordered,357,ordered.nextKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNextKey_add178() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextKey_add178");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,ordered,346,ordered.nextKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,ordered,348,ordered.nextKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,ordered,350,ordered.nextKey(null));
        }
        resetFull();
        resetFull();
        ordered = getMap();
        final Iterator<K> it = confirmed.keySet().iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),352,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),354,ordered,353,ordered.nextKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),356,ordered,355,ordered.nextKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                ordered.nextKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),358,ordered,357,ordered.nextKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNextKey_add179() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextKey_add179");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,ordered,346,ordered.nextKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,ordered,348,ordered.nextKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,ordered,350,ordered.nextKey(null));
        }
        resetFull();
        ordered = getMap();
        final Iterator<K> it = confirmed.keySet().iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),352,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),354,ordered,353,ordered.nextKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),356,ordered,355,ordered.nextKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                ordered.nextKey(null);
                ordered.nextKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),358,ordered,357,ordered.nextKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNextKey_remove145() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextKey_remove145");
        OrderedMap<K, V> ordered = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,ordered,346,ordered.nextKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,ordered,348,ordered.nextKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,ordered,350,ordered.nextKey(null));
        }
        resetFull();
        ordered = getMap();
        final Iterator<K> it = confirmed.keySet().iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),352,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),354,ordered,353,ordered.nextKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),356,ordered,355,ordered.nextKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                ordered.nextKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),358,ordered,357,ordered.nextKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNextKey_remove146() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextKey_remove146");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,ordered,346,ordered.nextKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,ordered,348,ordered.nextKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,ordered,350,ordered.nextKey(null));
        }
        ordered = getMap();
        final Iterator<K> it = confirmed.keySet().iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),352,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),354,ordered,353,ordered.nextKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),356,ordered,355,ordered.nextKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                ordered.nextKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),358,ordered,357,ordered.nextKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPreviousKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey");
        resetEmpty();
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),360,ordered,359,ordered.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),362,ordered,361,ordered.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),364,ordered,363,ordered.previousKey(null));
        }
        resetFull();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        java.util.Collections.reverse(list);
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),365,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),367,ordered,366,ordered.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),369,ordered,368,ordered.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                ordered.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            if (!(isAllowNullKey())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,ordered,370,ordered.previousKey(null));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPreviousKey_add181() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey_add181");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),360,ordered,359,ordered.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),362,ordered,361,ordered.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),364,ordered,363,ordered.previousKey(null));
        }
        resetFull();
        resetFull();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        java.util.Collections.reverse(list);
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),365,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),367,ordered,366,ordered.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),369,ordered,368,ordered.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                ordered.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            if (!(isAllowNullKey())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,ordered,370,ordered.previousKey(null));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPreviousKey_add182() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey_add182");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),360,ordered,359,ordered.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),362,ordered,361,ordered.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),364,ordered,363,ordered.previousKey(null));
        }
        resetFull();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        java.util.Collections.reverse(list);
        java.util.Collections.reverse(list);
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),365,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),367,ordered,366,ordered.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),369,ordered,368,ordered.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                ordered.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            if (!(isAllowNullKey())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,ordered,370,ordered.previousKey(null));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPreviousKey_add183() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey_add183");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),360,ordered,359,ordered.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),362,ordered,361,ordered.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),364,ordered,363,ordered.previousKey(null));
        }
        resetFull();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        java.util.Collections.reverse(list);
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),365,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),367,ordered,366,ordered.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),369,ordered,368,ordered.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                ordered.previousKey(null);
                ordered.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            if (!(isAllowNullKey())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,ordered,370,ordered.previousKey(null));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPreviousKey_remove147() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey_remove147");
        OrderedMap<K, V> ordered = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),360,ordered,359,ordered.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),362,ordered,361,ordered.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),364,ordered,363,ordered.previousKey(null));
        }
        resetFull();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        java.util.Collections.reverse(list);
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),365,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),367,ordered,366,ordered.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),369,ordered,368,ordered.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                ordered.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            if (!(isAllowNullKey())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,ordered,370,ordered.previousKey(null));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPreviousKey_remove148() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey_remove148");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),360,ordered,359,ordered.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),362,ordered,361,ordered.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),364,ordered,363,ordered.previousKey(null));
        }
        ordered = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        java.util.Collections.reverse(list);
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),365,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),367,ordered,366,ordered.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),369,ordered,368,ordered.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                ordered.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            if (!(isAllowNullKey())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,ordered,370,ordered.previousKey(null));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPreviousKey_remove149() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey_remove149");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),360,ordered,359,ordered.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),362,ordered,361,ordered.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),364,ordered,363,ordered.previousKey(null));
        }
        resetFull();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),365,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),367,ordered,366,ordered.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),369,ordered,368,ordered.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                ordered.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            if (!(isAllowNullKey())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),371,ordered,370,ordered.previousKey(null));
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public BulkTest bulkTestOrderedMapIterator() {
        return new InnerTestOrderedMapIterator();
    }

    public class InnerTestOrderedMapIterator extends AbstractOrderedMapIteratorTest<K, V> {
        public InnerTestOrderedMapIterator() {
            super("InnerTestOrderedMapIterator");
        }

        @Override
        public boolean supportsRemove() {
            return org.apache.commons.collections4.map.AbstractOrderedMapTest.this.isRemoveSupported();
        }

        @Override
        public boolean isGetStructuralModify() {
            return org.apache.commons.collections4.map.AbstractOrderedMapTest.this.isGetStructuralModify();
        }

        @Override
        public boolean supportsSetValue() {
            return org.apache.commons.collections4.map.AbstractOrderedMapTest.this.isSetValueSupported();
        }

        @Override
        public OrderedMapIterator<K, V> makeEmptyIterator() {
            resetEmpty();
            return org.apache.commons.collections4.map.AbstractOrderedMapTest.this.getMap().mapIterator();
        }

        @Override
        public OrderedMapIterator<K, V> makeObject() {
            resetFull();
            return org.apache.commons.collections4.map.AbstractOrderedMapTest.this.getMap().mapIterator();
        }

        @Override
        public OrderedMap<K, V> getMap() {
            return org.apache.commons.collections4.map.AbstractOrderedMapTest.this.getMap();
        }

        @Override
        public Map<K, V> getConfirmedMap() {
            return org.apache.commons.collections4.map.AbstractOrderedMapTest.this.getConfirmed();
        }

        @Override
        public void verify() {
            super.verify();
            org.apache.commons.collections4.map.AbstractOrderedMapTest.this.verify();
        }
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public OrderedMap<K, V> getMap() {
        return ((OrderedMap<K, V>)(super.getMap()));
    }
}

