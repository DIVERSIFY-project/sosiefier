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
import org.junit.Test;

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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4987,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4989,bidi,4988,bidi.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstKey_add1606() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstKey_add1606");
        resetEmpty();
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        try {
            bidi.firstKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        bidi = getMap();
        final K confirmedFirst = confirmed.keySet().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4987,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4989,bidi,4988,bidi.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstKey_add1607() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstKey_add1607");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        try {
            bidi.firstKey();
            bidi.firstKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        bidi = getMap();
        final K confirmedFirst = confirmed.keySet().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4987,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4989,bidi,4988,bidi.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstKey_add1608() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstKey_add1608");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        try {
            bidi.firstKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        resetFull();
        bidi = getMap();
        final K confirmedFirst = confirmed.keySet().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4987,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4989,bidi,4988,bidi.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstKey_remove1222() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstKey_remove1222");
        OrderedBidiMap<K, V> bidi = getMap();
        try {
            bidi.firstKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        bidi = getMap();
        final K confirmedFirst = confirmed.keySet().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4987,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4989,bidi,4988,bidi.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstKey_remove1223() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstKey_remove1223");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        try {
            bidi.firstKey();
        } catch (final NoSuchElementException ex) {
        }
        bidi = getMap();
        final K confirmedFirst = confirmed.keySet().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4987,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4989,bidi,4988,bidi.firstKey());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4990,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4992,bidi,4991,bidi.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLastKey_add1609() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLastKey_add1609");
        resetEmpty();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4990,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4992,bidi,4991,bidi.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLastKey_add1610() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLastKey_add1610");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        try {
            bidi.lastKey();
            bidi.lastKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        bidi = getMap();
        K confirmedLast = null;
        for (final Iterator<K> it = confirmed.keySet().iterator() ; it.hasNext() ; ) {
            confirmedLast = it.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4990,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4992,bidi,4991,bidi.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLastKey_add1611() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLastKey_add1611");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        try {
            bidi.lastKey();
        } catch (final NoSuchElementException ex) {
        }
        resetFull();
        resetFull();
        bidi = getMap();
        K confirmedLast = null;
        for (final Iterator<K> it = confirmed.keySet().iterator() ; it.hasNext() ; ) {
            confirmedLast = it.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4990,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4992,bidi,4991,bidi.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLastKey_remove1224() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLastKey_remove1224");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4990,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4992,bidi,4991,bidi.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLastKey_remove1225() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLastKey_remove1225");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        try {
            bidi.lastKey();
        } catch (final NoSuchElementException ex) {
        }
        bidi = getMap();
        K confirmedLast = null;
        for (final Iterator<K> it = confirmed.keySet().iterator() ; it.hasNext() ; ) {
            confirmedLast = it.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4990,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4992,bidi,4991,bidi.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNextKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextKey");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = ((OrderedBidiMap<K, V>)(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4994,bidi,4993,bidi.nextKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4996,bidi,4995,bidi.nextKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4998,bidi,4997,bidi.nextKey(null));
        }
        resetFull();
        bidi = ((OrderedBidiMap<K, V>)(map));
        final Iterator<K> it = confirmed.keySet().iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4999,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5001,bidi,5000,bidi.nextKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5003,bidi,5002,bidi.nextKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.nextKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5005,bidi,5004,bidi.nextKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNextKey_add1612() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextKey_add1612");
        resetEmpty();
        resetEmpty();
        OrderedBidiMap<K, V> bidi = ((OrderedBidiMap<K, V>)(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4994,bidi,4993,bidi.nextKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4996,bidi,4995,bidi.nextKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4998,bidi,4997,bidi.nextKey(null));
        }
        resetFull();
        bidi = ((OrderedBidiMap<K, V>)(map));
        final Iterator<K> it = confirmed.keySet().iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4999,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5001,bidi,5000,bidi.nextKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5003,bidi,5002,bidi.nextKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.nextKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5005,bidi,5004,bidi.nextKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNextKey_add1613() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextKey_add1613");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = ((OrderedBidiMap<K, V>)(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4994,bidi,4993,bidi.nextKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4996,bidi,4995,bidi.nextKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4998,bidi,4997,bidi.nextKey(null));
        }
        resetFull();
        resetFull();
        bidi = ((OrderedBidiMap<K, V>)(map));
        final Iterator<K> it = confirmed.keySet().iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4999,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5001,bidi,5000,bidi.nextKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5003,bidi,5002,bidi.nextKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.nextKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5005,bidi,5004,bidi.nextKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNextKey_add1614() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextKey_add1614");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = ((OrderedBidiMap<K, V>)(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4994,bidi,4993,bidi.nextKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4996,bidi,4995,bidi.nextKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4998,bidi,4997,bidi.nextKey(null));
        }
        resetFull();
        bidi = ((OrderedBidiMap<K, V>)(map));
        final Iterator<K> it = confirmed.keySet().iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4999,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5001,bidi,5000,bidi.nextKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5003,bidi,5002,bidi.nextKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.nextKey(null);
                bidi.nextKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5005,bidi,5004,bidi.nextKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNextKey_remove1226() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextKey_remove1226");
        OrderedBidiMap<K, V> bidi = ((OrderedBidiMap<K, V>)(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4994,bidi,4993,bidi.nextKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4996,bidi,4995,bidi.nextKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4998,bidi,4997,bidi.nextKey(null));
        }
        resetFull();
        bidi = ((OrderedBidiMap<K, V>)(map));
        final Iterator<K> it = confirmed.keySet().iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4999,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5001,bidi,5000,bidi.nextKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5003,bidi,5002,bidi.nextKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.nextKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5005,bidi,5004,bidi.nextKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNextKey_remove1227() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextKey_remove1227");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = ((OrderedBidiMap<K, V>)(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4994,bidi,4993,bidi.nextKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4996,bidi,4995,bidi.nextKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4998,bidi,4997,bidi.nextKey(null));
        }
        bidi = ((OrderedBidiMap<K, V>)(map));
        final Iterator<K> it = confirmed.keySet().iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4999,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5001,bidi,5000,bidi.nextKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5003,bidi,5002,bidi.nextKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.nextKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5005,bidi,5004,bidi.nextKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPreviousKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5007,bidi,5006,bidi.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5009,bidi,5008,bidi.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5011,bidi,5010,bidi.previousKey(null));
        }
        resetFull();
        bidi = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        java.util.Collections.reverse(list);
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5012,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5014,bidi,5013,bidi.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5016,bidi,5015,bidi.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5018,bidi,5017,bidi.previousKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPreviousKey_add1615() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey_add1615");
        resetEmpty();
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5007,bidi,5006,bidi.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5009,bidi,5008,bidi.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5011,bidi,5010,bidi.previousKey(null));
        }
        resetFull();
        bidi = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        java.util.Collections.reverse(list);
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5012,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5014,bidi,5013,bidi.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5016,bidi,5015,bidi.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5018,bidi,5017,bidi.previousKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPreviousKey_add1616() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey_add1616");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5007,bidi,5006,bidi.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5009,bidi,5008,bidi.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5011,bidi,5010,bidi.previousKey(null));
        }
        resetFull();
        resetFull();
        bidi = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        java.util.Collections.reverse(list);
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5012,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5014,bidi,5013,bidi.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5016,bidi,5015,bidi.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5018,bidi,5017,bidi.previousKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPreviousKey_add1617() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey_add1617");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5007,bidi,5006,bidi.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5009,bidi,5008,bidi.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5011,bidi,5010,bidi.previousKey(null));
        }
        resetFull();
        bidi = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        java.util.Collections.reverse(list);
        java.util.Collections.reverse(list);
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5012,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5014,bidi,5013,bidi.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5016,bidi,5015,bidi.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5018,bidi,5017,bidi.previousKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPreviousKey_add1618() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey_add1618");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5007,bidi,5006,bidi.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5009,bidi,5008,bidi.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5011,bidi,5010,bidi.previousKey(null));
        }
        resetFull();
        bidi = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        java.util.Collections.reverse(list);
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5012,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5014,bidi,5013,bidi.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5016,bidi,5015,bidi.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.previousKey(null);
                bidi.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5018,bidi,5017,bidi.previousKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPreviousKey_remove1228() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey_remove1228");
        OrderedBidiMap<K, V> bidi = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5007,bidi,5006,bidi.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5009,bidi,5008,bidi.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5011,bidi,5010,bidi.previousKey(null));
        }
        resetFull();
        bidi = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        java.util.Collections.reverse(list);
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5012,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5014,bidi,5013,bidi.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5016,bidi,5015,bidi.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5018,bidi,5017,bidi.previousKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPreviousKey_remove1229() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey_remove1229");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5007,bidi,5006,bidi.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5009,bidi,5008,bidi.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5011,bidi,5010,bidi.previousKey(null));
        }
        bidi = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        java.util.Collections.reverse(list);
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5012,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5014,bidi,5013,bidi.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5016,bidi,5015,bidi.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5018,bidi,5017,bidi.previousKey(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPreviousKey_remove1230() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPreviousKey_remove1230");
        resetEmpty();
        OrderedBidiMap<K, V> bidi = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5007,bidi,5006,bidi.previousKey(getOtherKeys()[0]));
        if (!(isAllowNullKey())) {
            try {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5009,bidi,5008,bidi.previousKey(null));
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5011,bidi,5010,bidi.previousKey(null));
        }
        resetFull();
        bidi = getMap();
        final List<K> list = new ArrayList<K>(confirmed.keySet());
        final Iterator<K> it = list.iterator();
        K confirmedLast = it.next();
        while (it.hasNext()) {
            final K confirmedObject = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5012,confirmedObject);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5014,bidi,5013,bidi.previousKey(confirmedLast));
            confirmedLast = confirmedObject;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5016,bidi,5015,bidi.previousKey(confirmedLast));
        if (!(isAllowNullKey())) {
            try {
                bidi.previousKey(null);
            } catch (final NullPointerException ex) {
            }
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5018,bidi,5017,bidi.previousKey(null));
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

