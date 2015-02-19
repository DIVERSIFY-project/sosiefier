package org.apache.commons.collections4.map;

import java.util.Comparator;
import org.apache.commons.collections4.Factory;
import java.util.Map;
import java.util.SortedMap;
import org.junit.Test;
import org.apache.commons.collections4.Transformer;

/** 
 * Extension of {@link LazyMapTest} for exercising the
 * {@link LazySortedMap} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
@SuppressWarnings(value = "boxing")
public class LazySortedMapTest<K, V> extends AbstractSortedMapTest<K, V> {
    private static final Factory<java.lang.Integer> oneFactory = org.apache.commons.collections4.FactoryUtils.constantFactory(1);

    public LazySortedMapTest(final String testName) {
        super(testName);
    }

    @Override
    public SortedMap<K, V> makeObject() {
        return org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<K, V>(), org.apache.commons.collections4.FactoryUtils.<V>nullFactory());
    }

    @Override
    public boolean isAllowNullKey() {
        return false;
    }

    @Override
    public void testMapGet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapGet");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void mapGet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "mapGet");
        Map<java.lang.Integer, java.lang.Number> map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.Integer, java.lang.Number>(), oneFactory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        final Number i1 = map.get(6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),828,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
        map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.Integer, java.lang.Number>(), org.apache.commons.collections4.FactoryUtils.<Number>nullFactory());
        final Number o = map.get(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),829,o);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),831,map,830,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void mapGet_literalMutation223() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "mapGet_literalMutation223");
        Map<java.lang.Integer, java.lang.Number> map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.Integer, java.lang.Number>(), oneFactory);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),827,map,826,map.size());
        final Number i1 = map.get(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),828,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),820,map,819,map.size());
        map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.Integer, java.lang.Number>(), org.apache.commons.collections4.FactoryUtils.<Number>nullFactory());
        final Number o = map.get(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),829,o);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),831,map,830,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSortOrder_add308() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_add308");
        final SortedMap<java.lang.String, java.lang.Number> map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.String, java.lang.Number>(), oneFactory);
        map.put("A", 5);
        map.put("A", 5);
        map.get("B");
        map.put("C", 8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),833,map,832,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),835,map,834,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),837,map.tailMap("B"),836,map.tailMap("B").firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),839,map.headMap("C"),838,map.headMap("C").lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),841,map.subMap("A", "C"),840,map.subMap("A", "C").lastKey());
        final Comparator<?> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),842,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSortOrder_add309() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_add309");
        final SortedMap<java.lang.String, java.lang.Number> map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.String, java.lang.Number>(), oneFactory);
        map.put("A", 5);
        map.get("B");
        map.get("B");
        map.put("C", 8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),833,map,832,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),835,map,834,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),837,map.tailMap("B"),836,map.tailMap("B").firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),839,map.headMap("C"),838,map.headMap("C").lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),841,map.subMap("A", "C"),840,map.subMap("A", "C").lastKey());
        final Comparator<?> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),842,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSortOrder_add310() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_add310");
        final SortedMap<java.lang.String, java.lang.Number> map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.String, java.lang.Number>(), oneFactory);
        map.put("A", 5);
        map.get("B");
        map.put("C", 8);
        map.put("C", 8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),833,map,832,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),835,map,834,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),837,map.tailMap("B"),836,map.tailMap("B").firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),839,map.headMap("C"),838,map.headMap("C").lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),841,map.subMap("A", "C"),840,map.subMap("A", "C").lastKey());
        final Comparator<?> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),842,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSortOrder() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder");
        final SortedMap<java.lang.String, java.lang.Number> map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.String, java.lang.Number>(), oneFactory);
        map.put("foo", 5);
        map.get("B");
        map.put("C", 8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),833,map,832,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),835,map,834,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),837,map.tailMap("B"),836,map.tailMap("B").firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),839,map.headMap("C"),838,map.headMap("C").lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),841,map.subMap("A", "C"),840,map.subMap("A", "C").lastKey());
        final Comparator<?> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),842,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSortOrder_literalMutation225() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation225");
        final SortedMap<java.lang.String, java.lang.Number> map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.String, java.lang.Number>(), oneFactory);
        map.put("A", 4);
        map.get("B");
        map.put("C", 8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),833,map,832,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),835,map,834,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),837,map.tailMap("B"),836,map.tailMap("B").firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),839,map.headMap("C"),838,map.headMap("C").lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),841,map.subMap("A", "C"),840,map.subMap("A", "C").lastKey());
        final Comparator<?> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),842,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSortOrder_literalMutation226() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation226");
        final SortedMap<java.lang.String, java.lang.Number> map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.String, java.lang.Number>(), oneFactory);
        map.put("A", 5);
        map.get("foo");
        map.put("C", 8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),833,map,832,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),835,map,834,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),837,map.tailMap("B"),836,map.tailMap("B").firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),839,map.headMap("C"),838,map.headMap("C").lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),841,map.subMap("A", "C"),840,map.subMap("A", "C").lastKey());
        final Comparator<?> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),842,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSortOrder_literalMutation227() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation227");
        final SortedMap<java.lang.String, java.lang.Number> map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.String, java.lang.Number>(), oneFactory);
        map.put("A", 5);
        map.get("B");
        map.put("foo", 8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),833,map,832,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),835,map,834,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),837,map.tailMap("B"),836,map.tailMap("B").firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),839,map.headMap("C"),838,map.headMap("C").lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),841,map.subMap("A", "C"),840,map.subMap("A", "C").lastKey());
        final Comparator<?> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),842,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSortOrder_literalMutation228() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation228");
        final SortedMap<java.lang.String, java.lang.Number> map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.String, java.lang.Number>(), oneFactory);
        map.put("A", 5);
        map.get("B");
        map.put("C", 9);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),833,map,832,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),835,map,834,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),837,map.tailMap("B"),836,map.tailMap("B").firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),839,map.headMap("C"),838,map.headMap("C").lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),841,map.subMap("A", "C"),840,map.subMap("A", "C").lastKey());
        final Comparator<?> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),842,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSortOrder_remove258() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_remove258");
        final SortedMap<java.lang.String, java.lang.Number> map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.String, java.lang.Number>(), oneFactory);
        map.get("B");
        map.put("C", 8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),833,map,832,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),835,map,834,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),837,map.tailMap("B"),836,map.tailMap("B").firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),839,map.headMap("C"),838,map.headMap("C").lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),841,map.subMap("A", "C"),840,map.subMap("A", "C").lastKey());
        final Comparator<?> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),842,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSortOrder_remove259() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_remove259");
        final SortedMap<java.lang.String, java.lang.Number> map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.String, java.lang.Number>(), oneFactory);
        map.put("A", 5);
        map.put("C", 8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),833,map,832,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),835,map,834,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),837,map.tailMap("B"),836,map.tailMap("B").firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),839,map.headMap("C"),838,map.headMap("C").lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),841,map.subMap("A", "C"),840,map.subMap("A", "C").lastKey());
        final Comparator<?> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),842,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSortOrder_remove260() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_remove260");
        final SortedMap<java.lang.String, java.lang.Number> map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.String, java.lang.Number>(), oneFactory);
        map.get("B");
        map.put("C", 8);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),833,map,832,map.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),835,map,834,map.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),837,map.tailMap("B"),836,map.tailMap("B").firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),839,map.headMap("C"),838,map.headMap("C").lastKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),841,map.subMap("A", "C"),840,map.subMap("A", "C").lastKey());
        final Comparator<?> c = map.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),842,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformerDecorate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformerDecorate");
        final Transformer<java.lang.Object, java.lang.Integer> transformer = org.apache.commons.collections4.TransformerUtils.asTransformer(oneFactory);
        SortedMap<java.lang.Integer, java.lang.Number> map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.Integer, java.lang.Number>(), transformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),843,(map instanceof org.apache.commons.collections4.map.LazySortedMap));
        try {
            map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(new java.util.TreeMap<java.lang.Integer, java.lang.Number>(), ((Transformer<java.lang.Integer, java.lang.Number>)(null)));
        } catch (final IllegalArgumentException e) {
        }
        try {
            map = org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(((SortedMap<java.lang.Integer, java.lang.Number>)(null)), transformer);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

