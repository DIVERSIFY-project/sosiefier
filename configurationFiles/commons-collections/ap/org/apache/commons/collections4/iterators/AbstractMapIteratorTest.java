package org.apache.commons.collections4.iterators;

import java.util.HashSet;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.junit.Test;

/** 
 * Abstract class for testing the MapIterator interface.
 * <p/>
 * This class provides a framework for testing an implementation of MapIterator.
 * Concrete subclasses must provide the list iterator to be tested.
 * They must also specify certain details of how the list iterator operates by
 * overriding the supportsXxx() methods if necessary.
 * 
 * @version $Id$
 * @since 3.0
 */
public abstract class AbstractMapIteratorTest<K, V> extends AbstractIteratorTest<K> {
    /** 
     * JUnit constructor.
     * 
     * @param testName the test class name
     */
public AbstractMapIteratorTest(final String testName) {
        super(testName);
    }

    /** 
     * Implement this method to return a map iterator over an empty map.
     * 
     * @return an empty iterator
     */
@Override
    public abstract MapIterator<K, V> makeEmptyIterator();

    /** 
     * Implement this method to return a map iterator over a map with elements.
     * 
     * @return a full iterator
     */
@Override
    public abstract MapIterator<K, V> makeObject();

    /** 
     * Implement this method to return the map which contains the same data as the
     * iterator.
     * 
     * @return a full map which can be updated
     */
public abstract Map<K, V> getMap();

    /** 
     * Implement this method to return the confirmed map which contains the same
     * data as the iterator.
     * 
     * @return a full map which can be updated
     */
public abstract Map<K, V> getConfirmedMap();

    /** 
     * Whether or not we are testing an iterator that supports setValue().
     * Default is true.
     * 
     * @return true if Iterator supports set
     */
public boolean supportsSetValue() {
        return true;
    }

    /** 
     * Whether the get operation on the map structurally modifies the map,
     * such as with LRUMap. Default is false.
     * 
     * @return true if the get method structurally modifies the map
     */
public boolean isGetStructuralModify() {
        return false;
    }

    /** 
     * The values to be used in the add and set tests.
     * Default is two strings.
     */
@SuppressWarnings(value = "unchecked")
    public V[] addSetValues() {
        return ((V[])(new Object[]{ "A" , "B" }));
    }

    /** 
     * Test that the empty list iterator contract is correct.
     */
@Test(timeout = 1000)
    public void testEmptyMapIterator_add912() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator_add912");
        if (!(supportsEmptyIterator())) {
            return ;
        } 
        final MapIterator<K, V> it = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,it,2635,it.hasNext());
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        try {
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        if (!(supportsSetValue())) {
            try {
                it.setValue(addSetValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            } catch (final IllegalStateException ex) {
            }
        } else {
            try {
                it.setValue(addSetValues()[0]);
            } catch (final IllegalStateException ex) {
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that the empty list iterator contract is correct.
     */
@Test(timeout = 1000)
    public void testEmptyMapIterator_add913() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator_add913");
        if (!(supportsEmptyIterator())) {
            return ;
        } 
        final MapIterator<K, V> it = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,it,2635,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            it.getKey();
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        try {
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        if (!(supportsSetValue())) {
            try {
                it.setValue(addSetValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            } catch (final IllegalStateException ex) {
            }
        } else {
            try {
                it.setValue(addSetValues()[0]);
            } catch (final IllegalStateException ex) {
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that the empty list iterator contract is correct.
     */
@Test(timeout = 1000)
    public void testEmptyMapIterator_add914() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator_add914");
        if (!(supportsEmptyIterator())) {
            return ;
        } 
        final MapIterator<K, V> it = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,it,2635,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        try {
            it.getValue();
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        if (!(supportsSetValue())) {
            try {
                it.setValue(addSetValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            } catch (final IllegalStateException ex) {
            }
        } else {
            try {
                it.setValue(addSetValues()[0]);
            } catch (final IllegalStateException ex) {
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that the empty list iterator contract is correct.
     */
@Test(timeout = 1000)
    public void testEmptyMapIterator_add915() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator_add915");
        if (!(supportsEmptyIterator())) {
            return ;
        } 
        final MapIterator<K, V> it = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,it,2635,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        try {
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        if (!(supportsSetValue())) {
            try {
                it.setValue(addSetValues()[0]);
                it.setValue(addSetValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            } catch (final IllegalStateException ex) {
            }
        } else {
            try {
                it.setValue(addSetValues()[0]);
            } catch (final IllegalStateException ex) {
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that the empty list iterator contract is correct.
     */
@Test(timeout = 1000)
    public void testEmptyMapIterator_add916() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator_add916");
        if (!(supportsEmptyIterator())) {
            return ;
        } 
        final MapIterator<K, V> it = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,it,2635,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        try {
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        if (!(supportsSetValue())) {
            try {
                it.setValue(addSetValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            } catch (final IllegalStateException ex) {
            }
        } else {
            try {
                it.setValue(addSetValues()[0]);
                it.setValue(addSetValues()[0]);
            } catch (final IllegalStateException ex) {
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that the empty list iterator contract is correct.
     */
public void testEmptyMapIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator");
        if (!(supportsEmptyIterator())) {
            return ;
        } 
        final MapIterator<K, V> it = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,it,2635,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        try {
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        if (!(supportsSetValue())) {
            try {
                it.setValue(addSetValues()[-1]);
            } catch (final UnsupportedOperationException ex) {
            } catch (final IllegalStateException ex) {
            }
        } else {
            try {
                it.setValue(addSetValues()[0]);
            } catch (final IllegalStateException ex) {
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that the empty list iterator contract is correct.
     */
public void testEmptyMapIterator_literalMutation933() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator_literalMutation933");
        if (!(supportsEmptyIterator())) {
            return ;
        } 
        final MapIterator<K, V> it = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,it,2635,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        try {
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        if (!(supportsSetValue())) {
            try {
                it.setValue(addSetValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            } catch (final IllegalStateException ex) {
            }
        } else {
            try {
                it.setValue(addSetValues()[-1]);
            } catch (final IllegalStateException ex) {
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that the full list iterator contract is correct.
     */
@Test(timeout = 1000)
    public void testFullMapIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMapIterator");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2638,it,2637,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2640,it,2639,it.hasNext());
        final Set<K> set = new HashSet<K>();
        while (it.hasNext()) {
            final K key = it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2641,key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2643,it,2642,it.getKey());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2645,map,2644,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2647,set,2646,set.add(key));
            final V value = it.getValue();
            if (!(isGetStructuralModify())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2649,map,2648,map.get(key));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,value);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2652,map,2651,map.containsValue(value));
            verify();
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_add928() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_add928");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_add929() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_add929");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_add930() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_add930");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_add931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_add931");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_add932() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_add932");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_add933() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_add933");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_add934() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_add934");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_add935() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_add935");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_add936() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_add936");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapIteratorSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[1];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapIteratorSet_literalMutation935() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_literalMutation935");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 2 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapIteratorSet_literalMutation936() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_literalMutation936");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[-1] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapIteratorSet_literalMutation937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_literalMutation937");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[2];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_remove704() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_remove704");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_remove705() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_remove705");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_remove706() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_remove706");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_remove707() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_remove707");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_remove708() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_remove708");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_remove709() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_remove709");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_remove710() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_remove710");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        verify();
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSet_remove711() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSet_remove711");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final V newValue2 = (addSetValues().length) == 1 ? addSetValues()[0] : addSetValues()[1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,it,2659,it.hasNext());
        final K key = it.next();
        final V value = it.getValue();
        if (!(supportsSetValue())) {
            try {
                it.setValue(newValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        final V old = it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2661,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,it,2662,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2664,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,it,2665,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,old);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,map,2669,map.containsKey(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2672,confirmed,2671,confirmed.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,map,2673,map.containsValue(old));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,map,2675,map.containsValue(newValue));
        it.setValue(newValue);
        confirmed.put(key, newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2677,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2679,it,2678,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2682,it,2681,it.getValue());
        verify();
        it.setValue(newValue2);
        confirmed.put(key, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2683,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2685,it,2684,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2686,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2688,it,2687,it.getValue());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public void testRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove");
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,it,2689,it.hasNext());
        final K key = it.next();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.remove();
        confirmed.remove(key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,map,2691,map.containsKey(key));
        verify();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add943() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add943");
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,it,2689,it.hasNext());
        final K key = it.next();
        if (!(supportsRemove())) {
            try {
                it.remove();
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.remove();
        confirmed.remove(key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,map,2691,map.containsKey(key));
        verify();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add944() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add944");
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,it,2689,it.hasNext());
        final K key = it.next();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.remove();
        it.remove();
        confirmed.remove(key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,map,2691,map.containsKey(key));
        verify();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add945() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add945");
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,it,2689,it.hasNext());
        final K key = it.next();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.remove();
        confirmed.remove(key);
        confirmed.remove(key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,map,2691,map.containsKey(key));
        verify();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add946() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add946");
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,it,2689,it.hasNext());
        final K key = it.next();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.remove();
        confirmed.remove(key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,map,2691,map.containsKey(key));
        verify();
        verify();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add947() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add947");
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,it,2689,it.hasNext());
        final K key = it.next();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.remove();
        confirmed.remove(key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,map,2691,map.containsKey(key));
        verify();
        try {
            it.remove();
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add948() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add948");
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,it,2689,it.hasNext());
        final K key = it.next();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.remove();
        confirmed.remove(key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,map,2691,map.containsKey(key));
        verify();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_remove717() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove717");
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,it,2689,it.hasNext());
        final K key = it.next();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        confirmed.remove(key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,map,2691,map.containsKey(key));
        verify();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_remove718() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove718");
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,it,2689,it.hasNext());
        final K key = it.next();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,map,2691,map.containsKey(key));
        verify();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_remove719() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove719");
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,it,2689,it.hasNext());
        final K key = it.next();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.remove();
        confirmed.remove(key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,map,2691,map.containsKey(key));
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_remove720() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove720");
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> map = getMap();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2690,it,2689,it.hasNext());
        final K key = it.next();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.remove();
        confirmed.remove(key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2692,map,2691,map.containsKey(key));
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSetRemoveSet_add937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetRemoveSet_add937");
        if ((!(supportsSetValue())) || (!(supportsRemove()))) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,it,2657,it.hasNext());
        final K key = it.next();
        it.setValue(newValue);
        it.setValue(newValue);
        it.remove();
        confirmed.remove(key);
        verify();
        try {
            it.setValue(newValue);
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSetRemoveSet_add938() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetRemoveSet_add938");
        if ((!(supportsSetValue())) || (!(supportsRemove()))) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,it,2657,it.hasNext());
        final K key = it.next();
        it.setValue(newValue);
        it.remove();
        it.remove();
        confirmed.remove(key);
        verify();
        try {
            it.setValue(newValue);
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSetRemoveSet_add939() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetRemoveSet_add939");
        if ((!(supportsSetValue())) || (!(supportsRemove()))) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,it,2657,it.hasNext());
        final K key = it.next();
        it.setValue(newValue);
        it.remove();
        confirmed.remove(key);
        confirmed.remove(key);
        verify();
        try {
            it.setValue(newValue);
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSetRemoveSet_add940() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetRemoveSet_add940");
        if ((!(supportsSetValue())) || (!(supportsRemove()))) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,it,2657,it.hasNext());
        final K key = it.next();
        it.setValue(newValue);
        it.remove();
        confirmed.remove(key);
        verify();
        verify();
        try {
            it.setValue(newValue);
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSetRemoveSet_add941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetRemoveSet_add941");
        if ((!(supportsSetValue())) || (!(supportsRemove()))) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,it,2657,it.hasNext());
        final K key = it.next();
        it.setValue(newValue);
        it.remove();
        confirmed.remove(key);
        verify();
        try {
            it.setValue(newValue);
            it.setValue(newValue);
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSetRemoveSet_add942() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetRemoveSet_add942");
        if ((!(supportsSetValue())) || (!(supportsRemove()))) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,it,2657,it.hasNext());
        final K key = it.next();
        it.setValue(newValue);
        it.remove();
        confirmed.remove(key);
        verify();
        try {
            it.setValue(newValue);
        } catch (final IllegalStateException ex) {
        }
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapIteratorSetRemoveSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetRemoveSet");
        if ((!(supportsSetValue())) || (!(supportsRemove()))) {
            return ;
        } 
        final V newValue = addSetValues()[-1];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,it,2657,it.hasNext());
        final K key = it.next();
        it.setValue(newValue);
        it.remove();
        confirmed.remove(key);
        verify();
        try {
            it.setValue(newValue);
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSetRemoveSet_remove712() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetRemoveSet_remove712");
        if ((!(supportsSetValue())) || (!(supportsRemove()))) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,it,2657,it.hasNext());
        final K key = it.next();
        it.remove();
        confirmed.remove(key);
        verify();
        try {
            it.setValue(newValue);
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSetRemoveSet_remove713() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetRemoveSet_remove713");
        if ((!(supportsSetValue())) || (!(supportsRemove()))) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,it,2657,it.hasNext());
        final K key = it.next();
        it.setValue(newValue);
        confirmed.remove(key);
        verify();
        try {
            it.setValue(newValue);
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSetRemoveSet_remove714() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetRemoveSet_remove714");
        if ((!(supportsSetValue())) || (!(supportsRemove()))) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,it,2657,it.hasNext());
        final K key = it.next();
        it.setValue(newValue);
        it.remove();
        verify();
        try {
            it.setValue(newValue);
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSetRemoveSet_remove715() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetRemoveSet_remove715");
        if ((!(supportsSetValue())) || (!(supportsRemove()))) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,it,2657,it.hasNext());
        final K key = it.next();
        it.setValue(newValue);
        it.remove();
        confirmed.remove(key);
        try {
            it.setValue(newValue);
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorSetRemoveSet_remove716() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetRemoveSet_remove716");
        if ((!(supportsSetValue())) || (!(supportsRemove()))) {
            return ;
        } 
        final V newValue = addSetValues()[0];
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,it,2657,it.hasNext());
        final K key = it.next();
        it.setValue(newValue);
        it.remove();
        confirmed.remove(key);
        try {
            it.setValue(newValue);
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetKey");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,it,2653,it.hasNext());
        final K key = it.next();
        it.remove();
        it.remove();
        confirmed.remove(key);
        verify();
        try {
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetKey_add919() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetKey_add919");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,it,2653,it.hasNext());
        final K key = it.next();
        it.remove();
        confirmed.remove(key);
        confirmed.remove(key);
        verify();
        try {
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetKey_add920() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetKey_add920");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,it,2653,it.hasNext());
        final K key = it.next();
        it.remove();
        confirmed.remove(key);
        verify();
        verify();
        try {
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetKey_add921() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetKey_add921");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,it,2653,it.hasNext());
        final K key = it.next();
        it.remove();
        confirmed.remove(key);
        verify();
        try {
            it.getKey();
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetKey_add922() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetKey_add922");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,it,2653,it.hasNext());
        final K key = it.next();
        it.remove();
        confirmed.remove(key);
        verify();
        try {
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetKey_remove696() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetKey_remove696");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,it,2653,it.hasNext());
        final K key = it.next();
        confirmed.remove(key);
        verify();
        try {
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetKey_remove697() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetKey_remove697");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,it,2653,it.hasNext());
        final K key = it.next();
        it.remove();
        verify();
        try {
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetKey_remove698() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetKey_remove698");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,it,2653,it.hasNext());
        final K key = it.next();
        it.remove();
        confirmed.remove(key);
        try {
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetKey_remove699() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetKey_remove699");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,it,2653,it.hasNext());
        final K key = it.next();
        it.remove();
        confirmed.remove(key);
        try {
            it.getKey();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetValue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetValue");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,it,2655,it.hasNext());
        final K key = it.next();
        it.remove();
        it.remove();
        confirmed.remove(key);
        verify();
        try {
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetValue_add924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetValue_add924");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,it,2655,it.hasNext());
        final K key = it.next();
        it.remove();
        confirmed.remove(key);
        confirmed.remove(key);
        verify();
        try {
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetValue_add925() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetValue_add925");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,it,2655,it.hasNext());
        final K key = it.next();
        it.remove();
        confirmed.remove(key);
        verify();
        verify();
        try {
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetValue_add926() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetValue_add926");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,it,2655,it.hasNext());
        final K key = it.next();
        it.remove();
        confirmed.remove(key);
        verify();
        try {
            it.getValue();
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetValue_add927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetValue_add927");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,it,2655,it.hasNext());
        final K key = it.next();
        it.remove();
        confirmed.remove(key);
        verify();
        try {
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetValue_remove700() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetValue_remove700");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,it,2655,it.hasNext());
        final K key = it.next();
        confirmed.remove(key);
        verify();
        try {
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetValue_remove701() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetValue_remove701");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,it,2655,it.hasNext());
        final K key = it.next();
        it.remove();
        verify();
        try {
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetValue_remove702() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetValue_remove702");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,it,2655,it.hasNext());
        final K key = it.next();
        it.remove();
        confirmed.remove(key);
        try {
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapIteratorRemoveGetValue_remove703() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorRemoveGetValue_remove703");
        if (!(supportsRemove())) {
            return ;
        } 
        final MapIterator<K, V> it = makeObject();
        final Map<K, V> confirmed = getConfirmedMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2656,it,2655,it.hasNext());
        final K key = it.next();
        it.remove();
        confirmed.remove(key);
        try {
            it.getValue();
        } catch (final IllegalStateException ex) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

