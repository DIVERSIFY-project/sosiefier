package org.apache.commons.collections4.keyvalue;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

/** 
 * Test the TiedMapEntry class.
 * 
 * @version $Id$
 * @since 3.0
 */
public class TiedMapEntryTest<K, V> extends AbstractMapEntryTest<K, V> {
    /** 
     * Gets the instance to test
     */
@Override
    public Map.Entry<K, V> makeMapEntry(final K key, final V value) {
        final Map<K, V> map = new HashMap<K, V>();
        map.put(key, value);
        return new TiedMapEntry<K, V>(map , key);
    }

    /** 
     * Tests the constructors.
     */
@Override
    public void testConstructors() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetValue_add871() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_add871");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("C")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetValue_add872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_add872");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("C")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetValue_add873() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_add873");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("C")), ((V)("c")));
        map.put(((K)("C")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetValue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("C")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetValue_literalMutation916() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_literalMutation916");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("foo")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("C")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetValue_literalMutation917() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_literalMutation917");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("A")), ((V)("foo")));
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("C")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetValue_literalMutation918() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_literalMutation918");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("foo")), ((V)("b")));
        map.put(((K)("C")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetValue_literalMutation919() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_literalMutation919");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("foo")));
        map.put(((K)("C")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetValue_literalMutation920() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_literalMutation920");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("foo")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetValue_literalMutation921() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_literalMutation921");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("C")), ((V)("foo")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetValue_literalMutation922() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_literalMutation922");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("C")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetValue_literalMutation923() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_literalMutation923");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("C")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetValue_literalMutation924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_literalMutation924");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("C")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetValue_remove683() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_remove683");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("C")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetValue_remove684() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_remove684");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("C")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the constructors.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetValue_remove685() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValue_remove685");
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("C")), ((V)("c")));
        Map.Entry<K, V> entry = new TiedMapEntry<K, V>(map , ((K)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2538,entry,2537,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2540,entry,2539,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2542,entry,2541,entry.setValue(((V)("x"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2544,entry,2543,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2546,entry,2545,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2548,entry,2547,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2550,entry,2549,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2552,entry,2551,entry.setValue(((V)("y"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2554,entry,2553,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2556,entry,2555,entry.getValue());
        entry = new TiedMapEntry<K, V>(map , ((K)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2558,entry,2557,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2560,entry,2559,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2562,entry,2561,entry.setValue(((V)("z"))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2564,entry,2563,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2566,entry,2565,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

