package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.OrderedMapIterator;
import java.util.Set;

/** 
 * Abstract class for testing the OrderedMapIterator interface.
 * <p/>
 * This class provides a framework for testing an implementation of MapIterator.
 * Concrete subclasses must provide the list iterator to be tested.
 * They must also specify certain details of how the list iterator operates by
 * overriding the supportsXxx() methods if necessary.
 * 
 * @version $Id$
 * @since 3.0
 */
public abstract class AbstractOrderedMapIteratorTest<K, V> extends AbstractMapIteratorTest<K, V> {
    /** 
     * JUnit constructor.
     * 
     * @param testName the test class name
     */
public AbstractOrderedMapIteratorTest(final String testName) {
        super(testName);
    }

    @Override
    public abstract OrderedMapIterator<K, V> makeEmptyIterator();

    @Override
    public abstract OrderedMapIterator<K, V> makeObject();

    /** 
     * Test that the empty list iterator contract is correct.
     */
@Override
    public void testEmptyMapIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator");
        if (!(supportsEmptyIterator())) {
            return ;
        } 
        super.testEmptyMapIterator();
        final OrderedMapIterator<K, V> it = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2694,it,2693,it.hasPrevious());
        try {
            it.previous();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that the full list iterator contract is correct.
     */
@Override
    public void testFullMapIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMapIterator");
        if (!(supportsFullIterator())) {
            return ;
        } 
        super.testFullMapIterator();
        final OrderedMapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2696,it,2695,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2698,it,2697,it.hasPrevious());
        final Set<K> set = new HashSet<K>();
        while (it.hasNext()) {
            final K key = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2699,key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2701,it,2700,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2703,map,2702,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2705,set,2704,set.add(key));
            final V value = it.getValue();
            if (!(isGetStructuralModify())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2707,map,2706,map.get(key));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2708,value);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2710,map,2709,map.containsValue(value));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2712,it,2711,it.hasPrevious());
            verify();
        }
        while (it.hasPrevious()) {
            final Object key = it.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2713,key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2715,it,2714,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2717,map,2716,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2719,set,2718,set.remove(key));
            final Object value = it.getValue();
            if (!(isGetStructuralModify())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2721,map,2720,map.get(key));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2722,value);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2724,map,2723,map.containsValue(value));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2726,it,2725,it.hasNext());
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that the iterator order matches the keySet order.
     */
public void testMapIteratorOrder() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorOrder");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final OrderedMapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2727,new java.util.ArrayList<K>(map.keySet()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2727,new java.util.ArrayList<K>(map.keySet()));
        final Iterator<K> it2 = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2632,it,2631,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2729,it2,2728,it2.hasNext());
        final List<K> list = new ArrayList<K>();
        while (it.hasNext()) {
            final K key = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2731,it2,2730,it2.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2732,key);
            list.add(key);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2734,map,2733,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2736,list,2735,list.size());
        while (it.hasPrevious()) {
            final K key = it.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2738,list,2737,list.get(((list.size()) - 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2739,key);
            list.remove(((list.size()) - 2));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2741,list,2740,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

