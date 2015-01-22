package org.apache.commons.collections4.keyvalue;

import java.util.HashMap;
import java.util.Map;
import junit.framework.TestCase;

/** 
 * Test the DefaultKeyValue class.
 * 
 * @version $Id$
 * @since 3.0
 */
public class DefaultKeyValueTest<K, V> extends TestCase {
    private final String key = "name";

    private final String value = "duke";

    /** 
     * Make an instance of DefaultKeyValue with the default (null) key and value.
     * Subclasses should override this method to return a DefaultKeyValue
     * of the type being tested.
     */
protected DefaultKeyValue<K, V> makeDefaultKeyValue() {
        return new DefaultKeyValue<K, V>(null , null);
    }

    /** 
     * Make an instance of DefaultKeyValue with the specified key and value.
     * Subclasses should override this method to return a DefaultKeyValue
     * of the type being tested.
     */
protected DefaultKeyValue<K, V> makeDefaultKeyValue(final K key, final V value) {
        return new DefaultKeyValue<K, V>(key , value);
    }

    @SuppressWarnings(value = "unchecked")
    public void testAccessorsAndMutators() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccessorsAndMutators");
        final DefaultKeyValue<K, V> kv = makeDefaultKeyValue();
        kv.setKey(((K)(key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2413,((kv.getKey()) == (key)));
        kv.setValue(((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2414,((kv.getValue()) == (value)));
        kv.setKey(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2415,((kv.getKey()) == null));
        kv.setValue(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2416,((kv.getValue()) == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAccessorsAndMutators_literalMutation881() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccessorsAndMutators_literalMutation881");
        final DefaultKeyValue<K, V> kv = makeDefaultKeyValue();
        kv.setKey(((K)(key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2413,((kv.getKey()) == (key)));
        kv.setValue(((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2414,((kv.getValue()) == (value)));
        kv.setKey(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2415,((kv.getKey()) == null));
        kv.setValue(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2416,((kv.getValue()) == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSelfReferenceHandling() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceHandling");
        final DefaultKeyValue<K, V> kv = makeDefaultKeyValue();
        try {
            kv.setKey(((K)(kv)));
        } catch (final IllegalArgumentException iae) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2433,(((kv.getKey()) == null) && ((kv.getValue()) == null)));
        }
        try {
            kv.setValue(((V)(kv)));
        } catch (final IllegalArgumentException iae) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2434,(((kv.getKey()) == null) && ((kv.getValue()) == null)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSelfReferenceHandling_literalMutation893() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceHandling_literalMutation893");
        final DefaultKeyValue<K, V> kv = makeDefaultKeyValue();
        try {
            kv.setKey(((K)(kv)));
        } catch (final IllegalArgumentException iae) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2433,(((kv.getKey()) == null) && ((kv.getValue()) == null)));
        }
        try {
            kv.setValue(((V)(kv)));
        } catch (final IllegalArgumentException iae) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2434,(((kv.getKey()) == null) && ((kv.getValue()) == null)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Subclasses should override this method to test their own constructors.
     */
@SuppressWarnings(value = "unchecked")
    public void testConstructors() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors");
        DefaultKeyValue<K, V> kv = new DefaultKeyValue<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2417,(((kv.getKey()) == null) && ((kv.getValue()) == null)));
        kv = new DefaultKeyValue<K, V>(((K)(key)) , ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2418,(((kv.getKey()) == (key)) && ((kv.getValue()) == (value))));
        final DefaultKeyValue<K, V> kv2 = new DefaultKeyValue<K, V>(kv);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2419,(((kv2.getKey()) == (key)) && ((kv2.getValue()) == (value))));
        kv.setKey(null);
        kv.setValue(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2420,(((kv2.getKey()) == (key)) && ((kv2.getValue()) == (value))));
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)(key)), ((V)(value)));
        final Map.Entry<K, V> entry = map.entrySet().iterator().next();
        kv = new DefaultKeyValue<K, V>(entry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2421,(((kv.getKey()) == (key)) && ((kv.getValue()) == (value))));
        entry.setValue(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2422,((kv.getValue()) == (value)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Subclasses should override this method to test their own constructors.
     */
@SuppressWarnings(value = "unchecked")
    public void testConstructors_literalMutation884() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation884");
        DefaultKeyValue<K, V> kv = new DefaultKeyValue<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2417,(((kv.getKey()) == null) && ((kv.getValue()) == null)));
        kv = new DefaultKeyValue<K, V>(((K)(key)) , ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2418,(((kv.getKey()) == (key)) && ((kv.getValue()) == (value))));
        final DefaultKeyValue<K, V> kv2 = new DefaultKeyValue<K, V>(kv);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2419,(((kv2.getKey()) == (key)) && ((kv2.getValue()) == (value))));
        kv.setKey(null);
        kv.setValue(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2420,(((kv2.getKey()) == (key)) && ((kv2.getValue()) == (value))));
        final Map<K, V> map = new HashMap<K, V>();
        map.put(((K)(key)), ((V)(value)));
        final Map.Entry<K, V> entry = map.entrySet().iterator().next();
        kv = new DefaultKeyValue<K, V>(entry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2421,(((kv.getKey()) == (key)) && ((kv.getValue()) == (value))));
        entry.setValue(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2422,((kv.getValue()) == (value)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEqualsAndHashCode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode");
        DefaultKeyValue<K, V> kv = makeDefaultKeyValue(((K)(key)), ((V)(value)));
        DefaultKeyValue<K, V> kv2 = makeDefaultKeyValue(((K)(key)), ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2424,kv,2423,kv.equals(kv));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2426,kv,2425,kv.equals(kv2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2427,((kv.hashCode()) == (kv2.hashCode())));
        kv = makeDefaultKeyValue(null, null);
        kv2 = makeDefaultKeyValue(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2429,kv,2428,kv.equals(kv));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2431,kv,2430,kv.equals(kv2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2432,((kv.hashCode()) == (kv2.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEqualsAndHashCode_literalMutation888() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation888");
        DefaultKeyValue<K, V> kv = makeDefaultKeyValue(((K)(key)), ((V)(value)));
        DefaultKeyValue<K, V> kv2 = makeDefaultKeyValue(((K)(key)), ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2424,kv,2423,kv.equals(kv));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2426,kv,2425,kv.equals(kv2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2427,((kv.hashCode()) == (kv2.hashCode())));
        kv = makeDefaultKeyValue(null, null);
        kv2 = makeDefaultKeyValue(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2429,kv,2428,kv.equals(kv));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2431,kv,2430,kv.equals(kv2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2432,((kv.hashCode()) == (kv2.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testToString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToString");
        DefaultKeyValue<K, V> kv = makeDefaultKeyValue(((K)(key)), ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2439,kv.toString(),2438,kv.toString().equals((((kv.getKey()) + "=") + (kv.getValue()))));
        kv = makeDefaultKeyValue(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,kv.toString(),2440,kv.toString().equals((((kv.getKey()) + "=") + (kv.getValue()))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testToString_literalMutation895() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToString_literalMutation895");
        DefaultKeyValue<K, V> kv = makeDefaultKeyValue(((K)(key)), ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2439,kv.toString(),2438,kv.toString().equals((((kv.getKey()) + "=") + (kv.getValue()))));
        kv = makeDefaultKeyValue(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2441,kv.toString(),2440,kv.toString().equals((((kv.getKey()) + "=") + (kv.getValue()))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testToMapEntry() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToMapEntry");
        final DefaultKeyValue<K, V> kv = makeDefaultKeyValue(((K)(key)), ((V)(value)));
        final Map<K, V> map = new HashMap<K, V>();
        map.put(kv.getKey(), kv.getValue());
        final Map.Entry<K, V> entry = map.entrySet().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2436,entry,2435,entry.equals(kv.toMapEntry()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2437,((entry.hashCode()) == (kv.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

