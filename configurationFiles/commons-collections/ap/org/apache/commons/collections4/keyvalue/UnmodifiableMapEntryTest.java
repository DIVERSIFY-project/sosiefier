package org.apache.commons.collections4.keyvalue;

import org.apache.commons.collections4.KeyValue;
import java.util.Map;

/** 
 * Test the UnmodifiableMapEntry class.
 * 
 * @version $Id$
 * @since 3.0
 */
public class UnmodifiableMapEntryTest<K, V> extends AbstractMapEntryTest<K, V> {
    /** 
     * Make an instance of Map.Entry with the default (null) key and value.
     * Subclasses should override this method to return a Map.Entry
     * of the type being tested.
     */
@Override
    public Map.Entry<K, V> makeMapEntry() {
        return new UnmodifiableMapEntry<K, V>(null , null);
    }

    /** 
     * Make an instance of Map.Entry with the specified key and value.
     * Subclasses should override this method to return a Map.Entry
     * of the type being tested.
     */
@Override
    public Map.Entry<K, V> makeMapEntry(final K key, final V value) {
        return new UnmodifiableMapEntry<K, V>(key , value);
    }

    /** 
     * Subclasses should override this method.
     */
@Override
    @SuppressWarnings(value = "unchecked")
    public void testConstructors() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors");
        Map.Entry<K, V> entry = new UnmodifiableMapEntry<K, V>(((K)(key)) , ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,entry,2576,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,entry,2579,entry.getValue());
        final KeyValue<K, V> pair = new DefaultKeyValue<K, V>(((K)(key)) , ((V)(value)));
        entry = new UnmodifiableMapEntry<K, V>(pair);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2583,entry,2582,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2584,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2586,entry,2585,entry.getValue());
        final Map.Entry<K, V> entry2 = new UnmodifiableMapEntry<K, V>(entry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2587,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2589,entry2,2588,entry2.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2590,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2592,entry2,2591,entry2.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2593,(entry instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Subclasses should override this method.
     */
@SuppressWarnings(value = "unchecked")
    public void testConstructors_literalMutation928() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors_literalMutation928");
        Map.Entry<K, V> entry = new UnmodifiableMapEntry<K, V>(((K)(key)) , ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2575,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2577,entry,2576,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2578,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,entry,2579,entry.getValue());
        final KeyValue<K, V> pair = new DefaultKeyValue<K, V>(((K)(key)) , ((V)(value)));
        entry = new UnmodifiableMapEntry<K, V>(pair);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2583,entry,2582,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2584,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2586,entry,2585,entry.getValue());
        final Map.Entry<K, V> entry2 = new UnmodifiableMapEntry<K, V>(entry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2587,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2589,entry2,2588,entry2.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2590,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2592,entry2,2591,entry2.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2593,(entry instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public void testAccessorsAndMutators() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccessorsAndMutators");
        Map.Entry<K, V> entry = makeMapEntry(((K)(key)), ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,entry,2568,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        entry = makeMapEntry(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,entry,2571,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,entry,2573,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAccessorsAndMutators_literalMutation925() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAccessorsAndMutators_literalMutation925");
        Map.Entry<K, V> entry = makeMapEntry(((K)(key)), ((V)(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2567,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2569,entry,2568,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2570,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        entry = makeMapEntry(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2572,entry,2571,entry.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2574,entry,2573,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public void testSelfReferenceHandling() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelfReferenceHandling");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnmodifiable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable");
        final Map.Entry<K, V> entry = makeMapEntry();
        try {
            entry.setValue(null);
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

