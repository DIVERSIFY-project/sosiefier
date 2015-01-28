package org.apache.commons.collections4.map;

import org.apache.commons.collections4.iterators.AbstractMapIteratorTest;
import org.apache.commons.collections4.BulkTest;
import java.util.ConcurrentModificationException;
import org.apache.commons.collections4.IterableMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.junit.Test;

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

    @Test(timeout = 1000)
    public void testFailFastEntrySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastEntrySet");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
        resetFull();
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

    @Test(timeout = 1000)
    public void testFailFastEntrySet_add2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastEntrySet_add2");
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

    @Test(timeout = 1000)
    public void testFailFastEntrySet_add3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastEntrySet_add3");
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

    @Test(timeout = 1000)
    public void testFailFastEntrySet_add4() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastEntrySet_add4");
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

    @Test(timeout = 1000)
    public void testFailFastEntrySet_add5() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastEntrySet_add5");
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
        it.next();
        getMap().clear();
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFailFastEntrySet_add6() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastEntrySet_add6");
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
        getMap().clear();
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFailFastEntrySet_add7() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastEntrySet_add7");
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
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFailFastEntrySet_remove1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastEntrySet_remove1");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
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

    @Test(timeout = 1000)
    public void testFailFastEntrySet_remove2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastEntrySet_remove2");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
        resetFull();
        Iterator<java.util.Map.Entry<K, V>> it = getMap().entrySet().iterator();
        final Map.Entry<K, V> val = it.next();
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

    @Test(timeout = 1000)
    public void testFailFastEntrySet_remove3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastEntrySet_remove3");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
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

    @Test(timeout = 1000)
    public void testFailFastEntrySet_remove4() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastEntrySet_remove4");
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
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFailFastKeySet_add10() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastKeySet_add10");
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

    @Test(timeout = 1000)
    public void testFailFastKeySet_add11() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastKeySet_add11");
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

    @Test(timeout = 1000)
    public void testFailFastKeySet_add12() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastKeySet_add12");
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
        it.next();
        getMap().clear();
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFailFastKeySet_add13() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastKeySet_add13");
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
        getMap().clear();
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFailFastKeySet_add14() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastKeySet_add14");
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
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFailFastKeySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastKeySet");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
        resetFull();
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

    @Test(timeout = 1000)
    public void testFailFastKeySet_add9() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastKeySet_add9");
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

    @Test(timeout = 1000)
    public void testFailFastKeySet_remove5() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastKeySet_remove5");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
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

    @Test(timeout = 1000)
    public void testFailFastKeySet_remove6() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastKeySet_remove6");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
        resetFull();
        Iterator<K> it = getMap().keySet().iterator();
        final K val = it.next();
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

    @Test(timeout = 1000)
    public void testFailFastKeySet_remove7() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastKeySet_remove7");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
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

    @Test(timeout = 1000)
    public void testFailFastKeySet_remove8() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastKeySet_remove8");
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
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFailFastValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastValues");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
        resetFull();
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

    @Test(timeout = 1000)
    public void testFailFastValues_add16() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastValues_add16");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
        resetFull();
        Iterator<V> it = getMap().values().iterator();
        it.next();
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

    @Test(timeout = 1000)
    public void testFailFastValues_add17() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastValues_add17");
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

    @Test(timeout = 1000)
    public void testFailFastValues_add18() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastValues_add18");
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

    @Test(timeout = 1000)
    public void testFailFastValues_add19() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastValues_add19");
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

    @Test(timeout = 1000)
    public void testFailFastValues_add20() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastValues_add20");
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
        it.next();
        getMap().clear();
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFailFastValues_add21() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastValues_add21");
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
        getMap().clear();
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFailFastValues_add22() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastValues_add22");
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
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFailFastValues_remove10() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastValues_remove10");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
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

    @Test(timeout = 1000)
    public void testFailFastValues_remove11() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastValues_remove11");
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
        try {
            it.next();
        } catch (final ConcurrentModificationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFailFastValues_remove9() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailFastValues_remove9");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if (!(isFailFastExpected())) {
            return ;
        } 
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

