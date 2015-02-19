package org.apache.commons.collections4.keyvalue;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Abstract tests that can be extended to test any Map.Entry implementation.
 * Subclasses must implement {@link #makeMapEntry(Object, Object)} to return
 * a new Map.Entry of the type being tested. Subclasses must also implement
 * {@link #testConstructors()} to test the constructors of the Map.Entry
 * type being tested.
 * 
 * @version $Id$
 * @since 3.0
 */
public abstract class AbstractMapEntryTest<K, V> extends TestCase {
    protected final String key = "name";

    protected final String value = "duke";

    /** 
     * Make an instance of Map.Entry with the default (null) key and value.
     * This implementation simply calls {@link #makeMapEntry(Object, Object)}
     * with null for key and value. Subclasses can override this method if desired.
     */
public Map.Entry<K, V> makeMapEntry() {
        return makeMapEntry(null, null);
    }

    /** 
     * Make an instance of Map.Entry with the specified key and value.
     * Subclasses should override this method to return a Map.Entry
     * of the type being tested.
     */
public abstract Map.Entry<K, V> makeMapEntry(K key, V value);

    /** 
     * Makes a Map.Entry of a type that's known to work correctly.
     */
public Map.Entry<K, V> makeKnownMapEntry() {
        return makeKnownMapEntry(null, null);
    }

    /** 
     * Makes a Map.Entry of a type that's known to work correctly.
     */
public Map.Entry<K, V> makeKnownMapEntry(final K key, final V value) {
        final Map<K, V> map = new HashMap<K, V>(1);
        map.put(key, value);
        final Map.Entry<K, V> entry = map.entrySet().iterator().next();
        return entry;
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAccessorsAndMutators_add850() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccessorsAndMutators_add850");
        Map.Entry<K, V> entry = makeMapEntry(((K)(key)), ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,((entry.getKey()) == (key)));
        entry.setValue(((V)(value)));
        entry.setValue(((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,((entry.getValue()) == (value)));
        entry = makeMapEntry(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,((entry.getKey()) == null));
        entry.setValue(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2393,((entry.getValue()) == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAccessorsAndMutators_add851() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccessorsAndMutators_add851");
        Map.Entry<K, V> entry = makeMapEntry(((K)(key)), ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,((entry.getKey()) == (key)));
        entry.setValue(((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,((entry.getValue()) == (value)));
        entry = makeMapEntry(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,((entry.getKey()) == null));
        entry.setValue(null);
        entry.setValue(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2393,((entry.getValue()) == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAccessorsAndMutators() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccessorsAndMutators");
        Map.Entry<K, V> entry = makeMapEntry(((K)(key)), ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,((entry.getKey()) == (key)));
        entry.setValue(((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,((entry.getValue()) == (value)));
        entry = makeMapEntry(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,((entry.getKey()) == null));
        entry.setValue(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2393,((entry.getValue()) == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAccessorsAndMutators_remove667() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccessorsAndMutators_remove667");
        Map.Entry<K, V> entry = makeMapEntry(((K)(key)), ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,((entry.getKey()) == (key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,((entry.getValue()) == (value)));
        entry = makeMapEntry(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,((entry.getKey()) == null));
        entry.setValue(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2393,((entry.getValue()) == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAccessorsAndMutators_remove668() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccessorsAndMutators_remove668");
        Map.Entry<K, V> entry = makeMapEntry(((K)(key)), ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,((entry.getKey()) == (key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,((entry.getValue()) == (value)));
        entry = makeMapEntry(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,((entry.getKey()) == null));
        entry.setValue(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2393,((entry.getValue()) == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Subclasses should override this method to test the
     * desired behaviour of the class with respect to
     * handling of self-references.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSelfReferenceHandling_add852() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceHandling_add852");
        final Map.Entry<K, V> entry = makeMapEntry();
        try {
            entry.setValue(((V)(entry)));
            entry.setValue(((V)(entry)));
        } catch (final IllegalArgumentException iae) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,(((entry.getKey()) == null) && ((entry.getValue()) == null)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Subclasses should override this method to test the
     * desired behaviour of the class with respect to
     * handling of self-references.
     */
@SuppressWarnings(value = "unchecked")
    public void testSelfReferenceHandling() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceHandling");
        final Map.Entry<K, V> entry = makeMapEntry();
        try {
            entry.setValue(((V)(entry)));
        } catch (final IllegalArgumentException iae) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,(((entry.getKey()) == null) && ((entry.getValue()) == null)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Subclasses should provide tests for their constructors.
     */
public abstract void testConstructors();

    @SuppressWarnings(value = "unchecked")
    public void testEqualsAndHashCode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode");
        Map.Entry<K, V> e1 = makeMapEntry(((K)(key)), ((V)(value)));
        Map.Entry<K, V> e2 = makeKnownMapEntry(((K)(key)), ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2395,e1,2394,e1.equals(e1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2397,e2,2396,e2.equals(e1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2399,e1,2398,e1.equals(e2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2400,((e1.hashCode()) == (e2.hashCode())));
        e1 = makeMapEntry();
        e2 = makeKnownMapEntry();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,e1,2401,e1.equals(e1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,e2,2403,e2.equals(e1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,e1,2405,e1.equals(e2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2407,((e1.hashCode()) == (e2.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testToString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToString");
        Map.Entry<K, V> entry = makeMapEntry(((K)(key)), ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2410,entry.toString(),2409,entry.toString().equals((((entry.getKey()) + "=") + (entry.getValue()))));
        entry = makeMapEntry();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2412,entry.toString(),2411,entry.toString().equals((((entry.getKey()) + "=") + (entry.getValue()))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testToString_literalMutation880() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToString_literalMutation880");
        Map.Entry<K, V> entry = makeMapEntry(((K)(key)), ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2410,entry.toString(),2409,entry.toString().equals((((entry.getKey()) + "=") + (entry.getValue()))));
        entry = makeMapEntry();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2412,entry.toString(),2411,entry.toString().equals((((entry.getKey()) + "=") + (entry.getValue()))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

