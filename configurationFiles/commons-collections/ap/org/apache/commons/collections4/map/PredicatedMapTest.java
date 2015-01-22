package org.apache.commons.collections4.map;

import java.util.HashMap;
import org.apache.commons.collections4.IterableMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections4.Predicate;

/** 
 * Extension of {@link AbstractMapTest} for exercising the
 * {@link PredicatedMap} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class PredicatedMapTest<K, V> extends AbstractIterableMapTest<K, V> {
    protected static final Predicate<java.lang.Object> truePredicate = org.apache.commons.collections4.functors.TruePredicate.<Object>truePredicate();

    protected static final Predicate<java.lang.Object> testPredicate = new Predicate<java.lang.Object>() {
        public boolean evaluate(final Object o) {
            return o instanceof String;
        }
    };

    public PredicatedMapTest(final String testName) {
        super(testName);
    }

    protected IterableMap<K, V> decorateMap(final Map<K, V> map, final Predicate<? super K> keyPredicate, final Predicate<? super V> valuePredicate) {
        return org.apache.commons.collections4.map.PredicatedMap.predicatedMap(map, keyPredicate, valuePredicate);
    }

    @Override
    public IterableMap<K, V> makeObject() {
        return decorateMap(new HashMap<K, V>(), truePredicate, truePredicate);
    }

    public IterableMap<K, V> makeTestMap() {
        return decorateMap(new HashMap<K, V>(), testPredicate, testPredicate);
    }

    @SuppressWarnings(value = "unchecked")
    public void testEntrySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntrySet");
        Map<K, V> map = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1767,((map.entrySet()) != null));
        map = decorateMap(new HashMap<K, V>(), null, null);
        map.put(((K)("oneKey")), ((V)("oneValue")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,((map.entrySet().size()) == 1));
        map = decorateMap(map, null, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEntrySet_literalMutation522() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntrySet_literalMutation522");
        Map<K, V> map = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1767,((map.entrySet()) != null));
        map = decorateMap(new HashMap<K, V>(), null, null);
        map.put(((K)("foo")), ((V)("oneValue")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,((map.entrySet().size()) == 1));
        map = decorateMap(map, null, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEntrySet_literalMutation523() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntrySet_literalMutation523");
        Map<K, V> map = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1767,((map.entrySet()) != null));
        map = decorateMap(new HashMap<K, V>(), null, null);
        map.put(((K)("oneKey")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,((map.entrySet().size()) == 1));
        map = decorateMap(map, null, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation526() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation526");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation527() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation527");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("foo")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation528() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation528");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(4))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation529() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation529");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(4))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation530() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation530");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("foo")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation531() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation531");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("foo")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation532() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation532");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("foo")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation533() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation533");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("foo")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation534() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation534");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("foo")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation535() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation535");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("foo")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation536() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation536");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("foo")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation537() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation537");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("foo")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation538() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation538");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(4))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation539() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation539");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("foo")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation540() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation540");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("foo")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation541() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation541");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(4))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation542() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation542");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("foo")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation543() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation543");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("foo")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation544() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation544");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("E")), ((V)("e")));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        try {
            final Map.Entry<K, V> entry = iterator.next();
            entry.setValue(((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

