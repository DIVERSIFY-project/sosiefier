package org.apache.commons.collections4.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections4.Predicate;
import java.util.SortedMap;
import org.junit.Test;

/** 
 * Extension of {@link PredicatedMapTest} for exercising the
 * {@link PredicatedSortedMap} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class PredicatedSortedMapTest<K, V> extends AbstractSortedMapTest<K, V> {
    protected static final Predicate<java.lang.Object> truePredicate = org.apache.commons.collections4.functors.TruePredicate.truePredicate();

    protected static final Predicate<java.lang.Object> testPredicate = new Predicate<java.lang.Object>() {
        public boolean evaluate(final Object o) {
            return o instanceof String;
        }
    };

    public PredicatedSortedMapTest(final String testName) {
        super(testName);
    }

    protected SortedMap<K, V> decorateMap(final SortedMap<K, V> map, final Predicate<? super K> keyPredicate, final Predicate<? super V> valuePredicate) {
        return org.apache.commons.collections4.map.PredicatedSortedMap.predicatedSortedMap(map, keyPredicate, valuePredicate);
    }

    @Override
    public SortedMap<K, V> makeObject() {
        return decorateMap(new java.util.TreeMap<K, V>(), truePredicate, truePredicate);
    }

    public SortedMap<K, V> makeTestMap() {
        return decorateMap(new java.util.TreeMap<K, V>(), testPredicate, testPredicate);
    }

    @Override
    public boolean isSubMapViewsSerializable() {
        return false;
    }

    @Override
    public boolean isAllowNullKey() {
        return false;
    }

    @SuppressWarnings(value = "unchecked")
    public void testEntrySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntrySet");
        SortedMap<K, V> map = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,((map.entrySet()) != null));
        map = decorateMap(new java.util.TreeMap<K, V>(), null, null);
        map.put(((K)("oneKey")), ((V)("oneValue")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,((map.entrySet().size()) == 1));
        map = decorateMap(map, null, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testEntrySet_add553() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntrySet_add553");
        SortedMap<K, V> map = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,((map.entrySet()) != null));
        map = decorateMap(new java.util.TreeMap<K, V>(), null, null);
        map.put(((K)("oneKey")), ((V)("oneValue")));
        map.put(((K)("oneKey")), ((V)("oneValue")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,((map.entrySet().size()) == 1));
        map = decorateMap(map, null, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEntrySet_literalMutation545() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntrySet_literalMutation545");
        SortedMap<K, V> map = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,((map.entrySet()) != null));
        map = decorateMap(new java.util.TreeMap<K, V>(), null, null);
        map.put(((K)("oneKey")), ((V)("oneValue")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,((map.entrySet().size()) == 1));
        map = decorateMap(map, null, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEntrySet_literalMutation548() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntrySet_literalMutation548");
        SortedMap<K, V> map = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,((map.entrySet()) != null));
        map = decorateMap(new java.util.TreeMap<K, V>(), null, null);
        map.put(((K)("foo")), ((V)("oneValue")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,((map.entrySet().size()) == 1));
        map = decorateMap(map, null, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEntrySet_literalMutation549() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntrySet_literalMutation549");
        SortedMap<K, V> map = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,((map.entrySet()) != null));
        map = decorateMap(new java.util.TreeMap<K, V>(), null, null);
        map.put(((K)("oneKey")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,((map.entrySet().size()) == 1));
        map = decorateMap(map, null, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testEntrySet_remove442() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntrySet_remove442");
        SortedMap<K, V> map = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,((map.entrySet()) != null));
        map = decorateMap(new java.util.TreeMap<K, V>(), null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,((map.entrySet().size()) == 1));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    @Test(timeout = 1000)
    public void testPut_add554() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_add554");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    @Test(timeout = 1000)
    public void testPut_add555() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_add555");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    @Test(timeout = 1000)
    public void testPut_add556() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_add556");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
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
    @Test(timeout = 1000)
    public void testPut_add557() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_add557");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
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
    @Test(timeout = 1000)
    public void testPut_add558() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_add558");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
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
    @Test(timeout = 1000)
    public void testPut_add559() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_add559");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
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
    @Test(timeout = 1000)
    public void testPut_add560() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_add560");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(3))));
        try {
            map.putAll(map2);
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
    @Test(timeout = 1000)
    public void testPut_add561() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_add561");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    @Test(timeout = 1000)
    public void testPut_add562() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_add562");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    @Test(timeout = 1000)
    public void testPut_add563() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_add563");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testPut_add564() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_add564");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation552() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation552");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation553() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation553");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("foo")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation554() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation554");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(4))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation555() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation555");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(4))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation556() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation556");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("foo")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation557() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation557");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation558() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation558");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation559() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation559");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation560() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation560");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation561() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation561");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation562() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation562");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation563() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation563");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation564() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation564");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
        map2.put(((K)("A")), ((V)("a")));
        map2.put(((K)("B")), ((V)("b")));
        map2.put(((K)("C")), ((V)("c")));
        map2.put(((K)("c")), ((V)(java.lang.Integer.valueOf(2))));
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
    public void testPut_literalMutation565() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation565");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation566() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation566");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation567() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation567");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
            entry.setValue(((V)(java.lang.Integer.valueOf(2))));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("F")), ((V)("f")));
        iterator = map.entrySet().iterator();
        final Map.Entry<K, V> entry = iterator.next();
        entry.setValue(((V)("x")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_literalMutation568() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation568");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation569() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation569");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
    public void testPut_literalMutation570() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_literalMutation570");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testPut_remove443() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_remove443");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
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
    @Test(timeout = 1000)
    public void testPut_remove444() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_remove444");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
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
    @Test(timeout = 1000)
    public void testPut_remove445() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_remove445");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
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
    @Test(timeout = 1000)
    public void testPut_remove446() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_remove446");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
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
    @Test(timeout = 1000)
    public void testPut_remove447() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_remove447");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
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
    @Test(timeout = 1000)
    public void testPut_remove448() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_remove448");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
        final Map<K, V> map2 = new HashMap<K, V>();
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
    @Test(timeout = 1000)
    public void testPut_remove449() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_remove449");
        final Map<K, V> map = makeTestMap();
        try {
            map.put(((K)("Hi")), ((V)(java.lang.Integer.valueOf(3))));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map.put(((K)(java.lang.Integer.valueOf(3))), ((V)("Hi")));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,!(map.containsKey(java.lang.Integer.valueOf(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,!(map.containsValue(java.lang.Integer.valueOf(3))));
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
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSortOrder_add565() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_add565");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSortOrder_add566() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_add566");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSortOrder_add567() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_add567");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSortOrder_add568() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_add568");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSortOrder_add569() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_add569");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder_literalMutation571() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation571");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder_literalMutation572() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation572");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("foo")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder_literalMutation573() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation573");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("A")), ((V)("foo")));
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder_literalMutation574() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation574");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("foo")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder_literalMutation575() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation575");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("foo")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder_literalMutation577() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation577");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("foo")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder_literalMutation578() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation578");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("foo")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder_literalMutation579() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation579");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("foo")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder_literalMutation580() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation580");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("A")), ((V)("a")));
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("foo")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSortOrder_remove450() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_remove450");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSortOrder_remove451() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_remove451");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSortOrder_remove452() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_remove452");
        final SortedMap<K, V> map = makeTestMap();
        map.put(((K)("B")), ((V)("b")));
        try {
            map.put(null, ((V)("c")));
        } catch (final IllegalArgumentException e) {
        }
        map.put(((K)("C")), ((V)("c")));
        try {
            map.put(((K)("D")), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1776,map,1775,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1778,map,1777,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1780,map.tailMap(((K)("B"))),1779,map.tailMap(((K)("B"))).firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1782,map.headMap(((K)("C"))),1781,map.headMap(((K)("C"))).lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1784,map.subMap(((K)("A")), ((K)("C"))),1783,map.subMap(((K)("A")), ((K)("C"))).lastKey());
        final Comparator<? super K> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

