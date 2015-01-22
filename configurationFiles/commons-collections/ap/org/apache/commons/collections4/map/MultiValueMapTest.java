package org.apache.commons.collections4.map;

import org.apache.commons.collections4.AbstractObjectTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections4.MultiMap;

/** 
 * TestMultiValueMap.
 * 
 * @version $Id$
 * @since 3.2
 */
public class MultiValueMapTest<K, V> extends AbstractObjectTest {
    public MultiValueMapTest(final String testName) {
        super(testName);
    }

    public void testNoMappingReturnsNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoMappingReturnsNull");
        final MultiValueMap<K, V> map = createTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,map,1500,map.get("whatever"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testValueCollectionType() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValueCollectionType");
        final MultiValueMap<K, V> map = createTestMap(java.util.LinkedList.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1682,((map.get("one")) instanceof java.util.LinkedList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMultipleValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleValues");
        final MultiValueMap<K, V> map = createTestMap(HashSet.class);
        final HashSet<V> expected = new HashSet<V>();
        expected.add(((V)("uno")));
        expected.add(((V)("un")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,map,1498,map.get("one"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMultipleValues_literalMutation415() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleValues_literalMutation415");
        final MultiValueMap<K, V> map = createTestMap(HashSet.class);
        final HashSet<V> expected = new HashSet<V>();
        expected.add(((V)("foo")));
        expected.add(((V)("un")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,map,1498,map.get("one"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMultipleValues_literalMutation416() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleValues_literalMutation416");
        final MultiValueMap<K, V> map = createTestMap(HashSet.class);
        final HashSet<V> expected = new HashSet<V>();
        expected.add(((V)("uno")));
        expected.add(((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,map,1498,map.get("one"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testContainsValue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsValue");
        final MultiValueMap<K, V> map = createTestMap(HashSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1436,map,1435,map.containsValue("uno"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1438,map,1437,map.containsValue("un"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1440,map,1439,map.containsValue("dos"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1442,map,1441,map.containsValue("deux"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1444,map,1443,map.containsValue("tres"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1446,map,1445,map.containsValue("trois"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1448,map,1447,map.containsValue("quatro"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testKeyContainsValue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testKeyContainsValue");
        final MultiValueMap<K, V> map = createTestMap(HashSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1480,map,1479,map.containsValue("one", "uno"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1482,map,1481,map.containsValue("one", "un"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1484,map,1483,map.containsValue("two", "dos"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1486,map,1485,map.containsValue("two", "deux"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1488,map,1487,map.containsValue("three", "tres"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1490,map,1489,map.containsValue("three", "trois"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1492,map,1491,map.containsValue("four", "quatro"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValues");
        final MultiValueMap<K, V> map = createTestMap(HashSet.class);
        final HashSet<V> expected = new HashSet<V>();
        expected.add(((V)("uno")));
        expected.add(((V)("dos")));
        expected.add(((V)("tres")));
        expected.add(((V)("un")));
        expected.add(((V)("deux")));
        expected.add(((V)("trois")));
        final Collection<java.lang.Object> c = map.values();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,c,1683,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,new java.util.HashSet<java.lang.Object>(c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testValues_literalMutation490() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValues_literalMutation490");
        final MultiValueMap<K, V> map = createTestMap(HashSet.class);
        final HashSet<V> expected = new HashSet<V>();
        expected.add(((V)("foo")));
        expected.add(((V)("dos")));
        expected.add(((V)("tres")));
        expected.add(((V)("un")));
        expected.add(((V)("deux")));
        expected.add(((V)("trois")));
        final Collection<java.lang.Object> c = map.values();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,c,1683,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,new java.util.HashSet<java.lang.Object>(c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testValues_literalMutation491() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValues_literalMutation491");
        final MultiValueMap<K, V> map = createTestMap(HashSet.class);
        final HashSet<V> expected = new HashSet<V>();
        expected.add(((V)("uno")));
        expected.add(((V)("foo")));
        expected.add(((V)("tres")));
        expected.add(((V)("un")));
        expected.add(((V)("deux")));
        expected.add(((V)("trois")));
        final Collection<java.lang.Object> c = map.values();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,c,1683,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,new java.util.HashSet<java.lang.Object>(c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testValues_literalMutation492() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValues_literalMutation492");
        final MultiValueMap<K, V> map = createTestMap(HashSet.class);
        final HashSet<V> expected = new HashSet<V>();
        expected.add(((V)("uno")));
        expected.add(((V)("dos")));
        expected.add(((V)("foo")));
        expected.add(((V)("un")));
        expected.add(((V)("deux")));
        expected.add(((V)("trois")));
        final Collection<java.lang.Object> c = map.values();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,c,1683,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,new java.util.HashSet<java.lang.Object>(c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testValues_literalMutation493() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValues_literalMutation493");
        final MultiValueMap<K, V> map = createTestMap(HashSet.class);
        final HashSet<V> expected = new HashSet<V>();
        expected.add(((V)("uno")));
        expected.add(((V)("dos")));
        expected.add(((V)("tres")));
        expected.add(((V)("foo")));
        expected.add(((V)("deux")));
        expected.add(((V)("trois")));
        final Collection<java.lang.Object> c = map.values();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,c,1683,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,new java.util.HashSet<java.lang.Object>(c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testValues_literalMutation494() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValues_literalMutation494");
        final MultiValueMap<K, V> map = createTestMap(HashSet.class);
        final HashSet<V> expected = new HashSet<V>();
        expected.add(((V)("uno")));
        expected.add(((V)("dos")));
        expected.add(((V)("tres")));
        expected.add(((V)("un")));
        expected.add(((V)("foo")));
        expected.add(((V)("trois")));
        final Collection<java.lang.Object> c = map.values();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,c,1683,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,new java.util.HashSet<java.lang.Object>(c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testValues_literalMutation495() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValues_literalMutation495");
        final MultiValueMap<K, V> map = createTestMap(HashSet.class);
        final HashSet<V> expected = new HashSet<V>();
        expected.add(((V)("uno")));
        expected.add(((V)("dos")));
        expected.add(((V)("tres")));
        expected.add(((V)("un")));
        expected.add(((V)("deux")));
        expected.add(((V)("foo")));
        final Collection<java.lang.Object> c = map.values();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1684,c,1683,c.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1686,new java.util.HashSet<java.lang.Object>(c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    private MultiValueMap<K, V> createTestMap() {
        return createTestMap(ArrayList.class);
    }

    @SuppressWarnings(value = "unchecked")
    private <C extends java.util.Collection<V>>MultiValueMap<K, V> createTestMap(final Class<C> collectionClass) {
        final MultiValueMap<K, V> map = MultiValueMap.multiValueMap(new HashMap<K, C>(), collectionClass);
        map.put(((K)("one")), ((V)("uno")));
        map.put(((K)("one")), ((V)("un")));
        map.put(((K)("two")), ((V)("dos")));
        map.put(((K)("two")), ((V)("deux")));
        map.put(((K)("three")), ((V)("tres")));
        map.put(((K)("three")), ((V)("trois")));
        return map;
    }

    public void testKeyedIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testKeyedIterator");
        final MultiValueMap<K, V> map = createTestMap();
        final ArrayList<java.lang.Object> actual = new ArrayList<java.lang.Object>(org.apache.commons.collections4.IteratorUtils.toList(map.iterator("foo")));
        final ArrayList<java.lang.Object> expected = new ArrayList<java.lang.Object>(java.util.Arrays.asList("uno", "un"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testKeyedIterator_literalMutation408() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testKeyedIterator_literalMutation408");
        final MultiValueMap<K, V> map = createTestMap();
        final ArrayList<java.lang.Object> actual = new ArrayList<java.lang.Object>(org.apache.commons.collections4.IteratorUtils.toList(map.iterator("one")));
        final ArrayList<java.lang.Object> expected = new ArrayList<java.lang.Object>(java.util.Arrays.asList("foo", "un"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testKeyedIterator_literalMutation409() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testKeyedIterator_literalMutation409");
        final MultiValueMap<K, V> map = createTestMap();
        final ArrayList<java.lang.Object> actual = new ArrayList<java.lang.Object>(org.apache.commons.collections4.IteratorUtils.toList(map.iterator("one")));
        final ArrayList<java.lang.Object> expected = new ArrayList<java.lang.Object>(java.util.Arrays.asList("uno", "foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1493,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1494,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveAllViaIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAllViaIterator");
        final MultiValueMap<K, V> map = createTestMap();
        for (final Iterator<?> i = map.values().iterator() ; i.hasNext() ; ) {
            i.next();
            i.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1605,map,1604,map.get("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1607,map,1606,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveAllViaKeyedIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAllViaKeyedIterator");
        final MultiValueMap<K, V> map = createTestMap();
        for (final Iterator<?> i = map.iterator("foo") ; i.hasNext() ; ) {
            i.next();
            i.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1609,map,1608,map.get("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1611,map,1610,map.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator");
        final MultiValueMap<K, V> map = createTestMap();
        @SuppressWarnings(value = "unchecked")
        Collection<V> values = new ArrayList<V>(((Collection<V>)(map.values())));
        Iterator<java.util.Map.Entry<K, V>> iterator = map.iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1472,map,1471,map.containsValue(entry.getKey(), entry.getValue()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1474,values,1473,values.contains(entry.getValue()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1476,values,1475,values.remove(entry.getValue()));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1478,values,1477,values.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveAllViaEntryIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAllViaEntryIterator");
        final MultiValueMap<K, V> map = createTestMap();
        for (final Iterator<?> i = map.iterator() ; i.hasNext() ; ) {
            i.next();
            i.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1601,map,1600,map.get("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1603,map,1602,map.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTotalSizeA() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTotalSizeA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1667,createTestMap(),1666,createTestMap().totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEquals");
        final MultiValueMap<K, V> one = new MultiValueMap<K, V>();
        final Integer value = Integer.valueOf(1);
        one.put(((K)("One")), value);
        one.removeMapping("One", value);
        final MultiValueMap<K, V> two = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1496,one);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapEquals_literalMutation411() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEquals_literalMutation411");
        final MultiValueMap<K, V> one = new MultiValueMap<K, V>();
        final Integer value = Integer.valueOf(0);
        one.put(((K)("One")), value);
        one.removeMapping("One", value);
        final MultiValueMap<K, V> two = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1496,one);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapEquals_literalMutation412() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEquals_literalMutation412");
        final MultiValueMap<K, V> one = new MultiValueMap<K, V>();
        final Integer value = Integer.valueOf(1);
        one.put(((K)("foo")), value);
        one.removeMapping("One", value);
        final MultiValueMap<K, V> two = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1496,one);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapEquals_literalMutation413() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEquals_literalMutation413");
        final MultiValueMap<K, V> one = new MultiValueMap<K, V>();
        final Integer value = Integer.valueOf(1);
        one.put(((K)("One")), value);
        one.removeMapping("foo", value);
        final MultiValueMap<K, V> two = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1495,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1496,one);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetCollection");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1462,map,1461,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1464,map,1463,map.getCollection("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetCollection_literalMutation399() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetCollection_literalMutation399");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        map.put(((K)("foo")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1462,map,1461,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1464,map,1463,map.getCollection("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetCollection_literalMutation400() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetCollection_literalMutation400");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        map.put(((K)("A")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1462,map,1461,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1464,map,1463,map.getCollection("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTotalSize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTotalSize");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,map,1668,map.totalSize());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,map,1670,map.totalSize());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,map,1672,map.totalSize());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,map,1674,map.totalSize());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,map,1676,map.totalSize());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1679,map,1678,map.totalSize());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,map,1680,map.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTotalSize_literalMutation477() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTotalSize_literalMutation477");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,map,1668,map.totalSize());
        map.put(((K)("foo")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,map,1670,map.totalSize());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,map,1672,map.totalSize());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,map,1674,map.totalSize());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,map,1676,map.totalSize());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1679,map,1678,map.totalSize());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,map,1680,map.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTotalSize_literalMutation478() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTotalSize_literalMutation478");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,map,1668,map.totalSize());
        map.put(((K)("A")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,map,1670,map.totalSize());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,map,1672,map.totalSize());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,map,1674,map.totalSize());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,map,1676,map.totalSize());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1679,map,1678,map.totalSize());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,map,1680,map.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTotalSize_literalMutation479() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTotalSize_literalMutation479");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,map,1668,map.totalSize());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,map,1670,map.totalSize());
        map.put(((K)("foo")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,map,1672,map.totalSize());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,map,1674,map.totalSize());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,map,1676,map.totalSize());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1679,map,1678,map.totalSize());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,map,1680,map.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTotalSize_literalMutation480() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTotalSize_literalMutation480");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,map,1668,map.totalSize());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,map,1670,map.totalSize());
        map.put(((K)("B")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,map,1672,map.totalSize());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,map,1674,map.totalSize());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,map,1676,map.totalSize());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1679,map,1678,map.totalSize());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,map,1680,map.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTotalSize_literalMutation481() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTotalSize_literalMutation481");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,map,1668,map.totalSize());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,map,1670,map.totalSize());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,map,1672,map.totalSize());
        map.put(((K)("foo")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,map,1674,map.totalSize());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,map,1676,map.totalSize());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1679,map,1678,map.totalSize());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,map,1680,map.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTotalSize_literalMutation482() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTotalSize_literalMutation482");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,map,1668,map.totalSize());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,map,1670,map.totalSize());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,map,1672,map.totalSize());
        map.put(((K)("B")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,map,1674,map.totalSize());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,map,1676,map.totalSize());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1679,map,1678,map.totalSize());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,map,1680,map.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTotalSize_literalMutation483() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTotalSize_literalMutation483");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,map,1668,map.totalSize());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,map,1670,map.totalSize());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,map,1672,map.totalSize());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,map,1674,map.totalSize());
        map.put(((K)("foo")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,map,1676,map.totalSize());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1679,map,1678,map.totalSize());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,map,1680,map.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTotalSize_literalMutation484() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTotalSize_literalMutation484");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,map,1668,map.totalSize());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,map,1670,map.totalSize());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,map,1672,map.totalSize());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,map,1674,map.totalSize());
        map.put(((K)("B")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,map,1676,map.totalSize());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1679,map,1678,map.totalSize());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,map,1680,map.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTotalSize_literalMutation485() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTotalSize_literalMutation485");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,map,1668,map.totalSize());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,map,1670,map.totalSize());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,map,1672,map.totalSize());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,map,1674,map.totalSize());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,map,1676,map.totalSize());
        map.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1679,map,1678,map.totalSize());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,map,1680,map.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTotalSize_literalMutation486() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTotalSize_literalMutation486");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,map,1668,map.totalSize());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,map,1670,map.totalSize());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,map,1672,map.totalSize());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,map,1674,map.totalSize());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,map,1676,map.totalSize());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1679,map,1678,map.totalSize());
        map.removeMapping("foo", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,map,1680,map.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTotalSize_literalMutation487() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTotalSize_literalMutation487");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1669,map,1668,map.totalSize());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1671,map,1670,map.totalSize());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1673,map,1672,map.totalSize());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1675,map,1674,map.totalSize());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1677,map,1676,map.totalSize());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1679,map,1678,map.totalSize());
        map.removeMapping("B", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1681,map,1680,map.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1653,map,1652,map.size());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,map,1654,map.size());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,map,1656,map.size());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,map,1658,map.size());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,map,1660,map.size());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1663,map,1662,map.size());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,map,1664,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_literalMutation453() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation453");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1653,map,1652,map.size());
        map.put(((K)("foo")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,map,1654,map.size());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,map,1656,map.size());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,map,1658,map.size());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,map,1660,map.size());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1663,map,1662,map.size());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,map,1664,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_literalMutation454() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation454");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1653,map,1652,map.size());
        map.put(((K)("A")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,map,1654,map.size());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,map,1656,map.size());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,map,1658,map.size());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,map,1660,map.size());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1663,map,1662,map.size());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,map,1664,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_literalMutation455() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation455");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1653,map,1652,map.size());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,map,1654,map.size());
        map.put(((K)("foo")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,map,1656,map.size());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,map,1658,map.size());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,map,1660,map.size());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1663,map,1662,map.size());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,map,1664,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_literalMutation456() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation456");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1653,map,1652,map.size());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,map,1654,map.size());
        map.put(((K)("B")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,map,1656,map.size());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,map,1658,map.size());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,map,1660,map.size());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1663,map,1662,map.size());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,map,1664,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_literalMutation457() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation457");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1653,map,1652,map.size());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,map,1654,map.size());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,map,1656,map.size());
        map.put(((K)("foo")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,map,1658,map.size());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,map,1660,map.size());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1663,map,1662,map.size());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,map,1664,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_literalMutation458() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation458");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1653,map,1652,map.size());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,map,1654,map.size());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,map,1656,map.size());
        map.put(((K)("B")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,map,1658,map.size());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,map,1660,map.size());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1663,map,1662,map.size());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,map,1664,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_literalMutation459() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation459");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1653,map,1652,map.size());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,map,1654,map.size());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,map,1656,map.size());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,map,1658,map.size());
        map.put(((K)("foo")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,map,1660,map.size());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1663,map,1662,map.size());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,map,1664,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_literalMutation460() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation460");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1653,map,1652,map.size());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,map,1654,map.size());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,map,1656,map.size());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,map,1658,map.size());
        map.put(((K)("B")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,map,1660,map.size());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1663,map,1662,map.size());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,map,1664,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_literalMutation461() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation461");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1653,map,1652,map.size());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,map,1654,map.size());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,map,1656,map.size());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,map,1658,map.size());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,map,1660,map.size());
        map.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1663,map,1662,map.size());
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,map,1664,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_literalMutation462() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation462");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1653,map,1652,map.size());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,map,1654,map.size());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,map,1656,map.size());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,map,1658,map.size());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,map,1660,map.size());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1663,map,1662,map.size());
        map.removeMapping("foo", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,map,1664,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_literalMutation463() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_literalMutation463");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1653,map,1652,map.size());
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1655,map,1654,map.size());
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1657,map,1656,map.size());
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1659,map,1658,map.size());
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1661,map,1660,map.size());
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1663,map,1662,map.size());
        map.removeMapping("B", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1665,map,1664,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_Key() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Key");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1625,map,1624,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1627,map,1626,map.size("B"));
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,map,1628,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,map,1630,map.size("B"));
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,map,1632,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,map,1634,map.size("B"));
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,map,1636,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,map,1638,map.size("B"));
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,map,1640,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,map,1642,map.size("B"));
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,map,1644,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,map,1646,map.size("B"));
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,map,1648,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,map,1650,map.size("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_Key_literalMutation465() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Key_literalMutation465");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1625,map,1624,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1627,map,1626,map.size("B"));
        map.put(((K)("foo")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,map,1628,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,map,1630,map.size("B"));
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,map,1632,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,map,1634,map.size("B"));
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,map,1636,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,map,1638,map.size("B"));
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,map,1640,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,map,1642,map.size("B"));
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,map,1644,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,map,1646,map.size("B"));
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,map,1648,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,map,1650,map.size("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_Key_literalMutation466() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Key_literalMutation466");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1625,map,1624,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1627,map,1626,map.size("B"));
        map.put(((K)("A")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,map,1628,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,map,1630,map.size("B"));
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,map,1632,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,map,1634,map.size("B"));
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,map,1636,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,map,1638,map.size("B"));
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,map,1640,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,map,1642,map.size("B"));
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,map,1644,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,map,1646,map.size("B"));
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,map,1648,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,map,1650,map.size("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_Key_literalMutation467() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Key_literalMutation467");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1625,map,1624,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1627,map,1626,map.size("B"));
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,map,1628,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,map,1630,map.size("B"));
        map.put(((K)("foo")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,map,1632,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,map,1634,map.size("B"));
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,map,1636,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,map,1638,map.size("B"));
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,map,1640,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,map,1642,map.size("B"));
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,map,1644,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,map,1646,map.size("B"));
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,map,1648,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,map,1650,map.size("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_Key_literalMutation468() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Key_literalMutation468");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1625,map,1624,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1627,map,1626,map.size("B"));
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,map,1628,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,map,1630,map.size("B"));
        map.put(((K)("B")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,map,1632,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,map,1634,map.size("B"));
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,map,1636,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,map,1638,map.size("B"));
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,map,1640,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,map,1642,map.size("B"));
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,map,1644,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,map,1646,map.size("B"));
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,map,1648,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,map,1650,map.size("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_Key_literalMutation469() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Key_literalMutation469");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1625,map,1624,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1627,map,1626,map.size("B"));
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,map,1628,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,map,1630,map.size("B"));
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,map,1632,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,map,1634,map.size("B"));
        map.put(((K)("foo")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,map,1636,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,map,1638,map.size("B"));
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,map,1640,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,map,1642,map.size("B"));
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,map,1644,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,map,1646,map.size("B"));
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,map,1648,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,map,1650,map.size("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_Key_literalMutation470() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Key_literalMutation470");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1625,map,1624,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1627,map,1626,map.size("B"));
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,map,1628,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,map,1630,map.size("B"));
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,map,1632,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,map,1634,map.size("B"));
        map.put(((K)("B")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,map,1636,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,map,1638,map.size("B"));
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,map,1640,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,map,1642,map.size("B"));
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,map,1644,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,map,1646,map.size("B"));
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,map,1648,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,map,1650,map.size("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_Key_literalMutation471() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Key_literalMutation471");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1625,map,1624,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1627,map,1626,map.size("B"));
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,map,1628,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,map,1630,map.size("B"));
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,map,1632,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,map,1634,map.size("B"));
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,map,1636,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,map,1638,map.size("B"));
        map.put(((K)("foo")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,map,1640,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,map,1642,map.size("B"));
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,map,1644,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,map,1646,map.size("B"));
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,map,1648,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,map,1650,map.size("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_Key_literalMutation472() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Key_literalMutation472");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1625,map,1624,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1627,map,1626,map.size("B"));
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,map,1628,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,map,1630,map.size("B"));
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,map,1632,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,map,1634,map.size("B"));
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,map,1636,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,map,1638,map.size("B"));
        map.put(((K)("B")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,map,1640,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,map,1642,map.size("B"));
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,map,1644,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,map,1646,map.size("B"));
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,map,1648,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,map,1650,map.size("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_Key_literalMutation473() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Key_literalMutation473");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1625,map,1624,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1627,map,1626,map.size("B"));
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,map,1628,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,map,1630,map.size("B"));
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,map,1632,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,map,1634,map.size("B"));
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,map,1636,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,map,1638,map.size("B"));
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,map,1640,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,map,1642,map.size("B"));
        map.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,map,1644,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,map,1646,map.size("B"));
        map.removeMapping("B", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,map,1648,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,map,1650,map.size("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_Key_literalMutation474() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Key_literalMutation474");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1625,map,1624,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1627,map,1626,map.size("B"));
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,map,1628,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,map,1630,map.size("B"));
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,map,1632,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,map,1634,map.size("B"));
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,map,1636,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,map,1638,map.size("B"));
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,map,1640,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,map,1642,map.size("B"));
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,map,1644,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,map,1646,map.size("B"));
        map.removeMapping("foo", "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,map,1648,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,map,1650,map.size("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSize_Key_literalMutation475() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Key_literalMutation475");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1625,map,1624,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1627,map,1626,map.size("B"));
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1629,map,1628,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1631,map,1630,map.size("B"));
        map.put(((K)("B")), "BA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1633,map,1632,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1635,map,1634,map.size("B"));
        map.put(((K)("B")), "BB");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1637,map,1636,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1639,map,1638,map.size("B"));
        map.put(((K)("B")), "BC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1641,map,1640,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1643,map,1642,map.size("B"));
        map.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1645,map,1644,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1647,map,1646,map.size("B"));
        map.removeMapping("B", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1649,map,1648,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1651,map,1650,map.size("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIterator_Key() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_Key");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,map.iterator("A"),1465,map.iterator("A").hasNext());
        map.put(((K)("A")), "AA");
        final Iterator<?> it = map.iterator("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,it,1467,it.hasNext());
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1470,it,1469,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIterator_Key_literalMutation403() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_Key_literalMutation403");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,map.iterator("A"),1465,map.iterator("A").hasNext());
        map.put(((K)("foo")), "AA");
        final Iterator<?> it = map.iterator("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,it,1467,it.hasNext());
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1470,it,1469,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIterator_Key_literalMutation404() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_Key_literalMutation404");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,map.iterator("A"),1465,map.iterator("A").hasNext());
        map.put(((K)("A")), "foo");
        final Iterator<?> it = map.iterator("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,it,1467,it.hasNext());
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1470,it,1469,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIterator_Key_literalMutation405() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_Key_literalMutation405");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1466,map.iterator("A"),1465,map.iterator("A").hasNext());
        map.put(((K)("A")), "AA");
        final Iterator<?> it = map.iterator("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1468,it,1467,it.hasNext());
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1470,it,1469,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testContainsValue_Key() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsValue_Key");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1428,map,1427,map.containsValue("A", "AA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1430,map,1429,map.containsValue("B", "BB"));
        map.put(((K)("A")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1432,map,1431,map.containsValue("A", "AA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1434,map,1433,map.containsValue("A", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testContainsValue_Key_literalMutation396() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsValue_Key_literalMutation396");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1428,map,1427,map.containsValue("A", "AA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1430,map,1429,map.containsValue("B", "BB"));
        map.put(((K)("foo")), "AA");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1432,map,1431,map.containsValue("A", "AA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1434,map,1433,map.containsValue("A", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testContainsValue_Key_literalMutation397() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsValue_Key_literalMutation397");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1428,map,1427,map.containsValue("A", "AA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1430,map,1429,map.containsValue("B", "BB"));
        map.put(((K)("A")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1432,map,1431,map.containsValue("A", "AA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1434,map,1433,map.containsValue("A", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutWithList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutWithList");
        @SuppressWarnings(value = "rawtypes")
        final MultiValueMap<K, V> test = MultiValueMap.multiValueMap(new HashMap<K, java.util.Collection>(), ArrayList.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1579,test,1578,test.put(((K)("A")), "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1581,test,1580,test.put(((K)("A")), "b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1583,test,1582,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1585,test,1584,test.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1587,test,1586,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutWithList_literalMutation441() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutWithList_literalMutation441");
        @SuppressWarnings(value = "rawtypes")
        final MultiValueMap<K, V> test = MultiValueMap.multiValueMap(new HashMap<K, java.util.Collection>(), ArrayList.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1579,test,1578,test.put(((K)("A")), "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1581,test,1580,test.put(((K)("A")), "b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1583,test,1582,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1585,test,1584,test.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1587,test,1586,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutWithSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutWithSet");
        @SuppressWarnings(value = "rawtypes")
        final MultiValueMap<K, V> test = MultiValueMap.multiValueMap(new HashMap<K, java.util.HashSet>(), HashSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1589,test,1588,test.put(((K)("A")), "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1591,test,1590,test.put(((K)("A")), "b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1593,test,1592,test.put(((K)("A")), "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,test,1594,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,test,1596,test.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,test,1598,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutWithSet_literalMutation443() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutWithSet_literalMutation443");
        @SuppressWarnings(value = "rawtypes")
        final MultiValueMap<K, V> test = MultiValueMap.multiValueMap(new HashMap<K, java.util.HashSet>(), HashSet.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1589,test,1588,test.put(((K)("A")), "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1591,test,1590,test.put(((K)("A")), "b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1593,test,1592,test.put(((K)("A")), "a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,test,1594,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,test,1596,test.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1599,test,1598,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map1");
        final MultiMap<K, V> original = new MultiValueMap<K, V>();
        original.put(((K)("key")), "object1");
        original.put(((K)("key")), "object2");
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "objectA");
        test.put(((K)("key")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1545,test,1544,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,test,1546,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,test.getCollection("keyA"),1548,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,test.getCollection("key"),1550,test.getCollection("key").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,test,1552,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,test,1554,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,test,1556,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,test,1558,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map1_literalMutation423() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map1_literalMutation423");
        final MultiMap<K, V> original = new MultiValueMap<K, V>();
        original.put(((K)("foo")), "object1");
        original.put(((K)("key")), "object2");
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "objectA");
        test.put(((K)("key")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1545,test,1544,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,test,1546,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,test.getCollection("keyA"),1548,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,test.getCollection("key"),1550,test.getCollection("key").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,test,1552,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,test,1554,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,test,1556,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,test,1558,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map1_literalMutation424() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map1_literalMutation424");
        final MultiMap<K, V> original = new MultiValueMap<K, V>();
        original.put(((K)("key")), "foo");
        original.put(((K)("key")), "object2");
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "objectA");
        test.put(((K)("key")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1545,test,1544,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,test,1546,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,test.getCollection("keyA"),1548,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,test.getCollection("key"),1550,test.getCollection("key").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,test,1552,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,test,1554,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,test,1556,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,test,1558,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map1_literalMutation425() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map1_literalMutation425");
        final MultiMap<K, V> original = new MultiValueMap<K, V>();
        original.put(((K)("key")), "object1");
        original.put(((K)("foo")), "object2");
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "objectA");
        test.put(((K)("key")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1545,test,1544,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,test,1546,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,test.getCollection("keyA"),1548,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,test.getCollection("key"),1550,test.getCollection("key").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,test,1552,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,test,1554,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,test,1556,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,test,1558,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map1_literalMutation426() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map1_literalMutation426");
        final MultiMap<K, V> original = new MultiValueMap<K, V>();
        original.put(((K)("key")), "object1");
        original.put(((K)("key")), "foo");
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "objectA");
        test.put(((K)("key")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1545,test,1544,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,test,1546,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,test.getCollection("keyA"),1548,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,test.getCollection("key"),1550,test.getCollection("key").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,test,1552,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,test,1554,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,test,1556,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,test,1558,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map1_literalMutation427() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map1_literalMutation427");
        final MultiMap<K, V> original = new MultiValueMap<K, V>();
        original.put(((K)("key")), "object1");
        original.put(((K)("key")), "object2");
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("foo")), "objectA");
        test.put(((K)("key")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1545,test,1544,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,test,1546,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,test.getCollection("keyA"),1548,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,test.getCollection("key"),1550,test.getCollection("key").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,test,1552,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,test,1554,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,test,1556,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,test,1558,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map1_literalMutation428() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map1_literalMutation428");
        final MultiMap<K, V> original = new MultiValueMap<K, V>();
        original.put(((K)("key")), "object1");
        original.put(((K)("key")), "object2");
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "foo");
        test.put(((K)("key")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1545,test,1544,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,test,1546,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,test.getCollection("keyA"),1548,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,test.getCollection("key"),1550,test.getCollection("key").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,test,1552,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,test,1554,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,test,1556,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,test,1558,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map1_literalMutation429() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map1_literalMutation429");
        final MultiMap<K, V> original = new MultiValueMap<K, V>();
        original.put(((K)("key")), "object1");
        original.put(((K)("key")), "object2");
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "objectA");
        test.put(((K)("foo")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1545,test,1544,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,test,1546,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,test.getCollection("keyA"),1548,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,test.getCollection("key"),1550,test.getCollection("key").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,test,1552,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,test,1554,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,test,1556,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,test,1558,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map1_literalMutation430() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map1_literalMutation430");
        final MultiMap<K, V> original = new MultiValueMap<K, V>();
        original.put(((K)("key")), "object1");
        original.put(((K)("key")), "object2");
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "objectA");
        test.put(((K)("key")), "foo");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1545,test,1544,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,test,1546,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,test.getCollection("keyA"),1548,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,test.getCollection("key"),1550,test.getCollection("key").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,test,1552,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,test,1554,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,test,1556,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,test,1558,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map2");
        final Map<K, V> original = new HashMap<K, V>();
        original.put(((K)("keyX")), ((V)("object1")));
        original.put(((K)("keyY")), ((V)("object2")));
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "objectA");
        test.put(((K)("keyX")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,test,1560,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1563,test,1562,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1565,test.getCollection("keyA"),1564,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1567,test.getCollection("keyX"),1566,test.getCollection("keyX").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1569,test.getCollection("keyY"),1568,test.getCollection("keyY").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1571,test,1570,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1573,test,1572,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1575,test,1574,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1577,test,1576,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map2_literalMutation432() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map2_literalMutation432");
        final Map<K, V> original = new HashMap<K, V>();
        original.put(((K)("foo")), ((V)("object1")));
        original.put(((K)("keyY")), ((V)("object2")));
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "objectA");
        test.put(((K)("keyX")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,test,1560,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1563,test,1562,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1565,test.getCollection("keyA"),1564,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1567,test.getCollection("keyX"),1566,test.getCollection("keyX").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1569,test.getCollection("keyY"),1568,test.getCollection("keyY").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1571,test,1570,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1573,test,1572,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1575,test,1574,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1577,test,1576,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map2_literalMutation433() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map2_literalMutation433");
        final Map<K, V> original = new HashMap<K, V>();
        original.put(((K)("keyX")), ((V)("foo")));
        original.put(((K)("keyY")), ((V)("object2")));
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "objectA");
        test.put(((K)("keyX")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,test,1560,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1563,test,1562,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1565,test.getCollection("keyA"),1564,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1567,test.getCollection("keyX"),1566,test.getCollection("keyX").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1569,test.getCollection("keyY"),1568,test.getCollection("keyY").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1571,test,1570,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1573,test,1572,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1575,test,1574,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1577,test,1576,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map2_literalMutation434() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map2_literalMutation434");
        final Map<K, V> original = new HashMap<K, V>();
        original.put(((K)("keyX")), ((V)("object1")));
        original.put(((K)("foo")), ((V)("object2")));
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "objectA");
        test.put(((K)("keyX")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,test,1560,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1563,test,1562,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1565,test.getCollection("keyA"),1564,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1567,test.getCollection("keyX"),1566,test.getCollection("keyX").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1569,test.getCollection("keyY"),1568,test.getCollection("keyY").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1571,test,1570,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1573,test,1572,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1575,test,1574,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1577,test,1576,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map2_literalMutation435() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map2_literalMutation435");
        final Map<K, V> original = new HashMap<K, V>();
        original.put(((K)("keyX")), ((V)("object1")));
        original.put(((K)("keyY")), ((V)("foo")));
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "objectA");
        test.put(((K)("keyX")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,test,1560,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1563,test,1562,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1565,test.getCollection("keyA"),1564,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1567,test.getCollection("keyX"),1566,test.getCollection("keyX").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1569,test.getCollection("keyY"),1568,test.getCollection("keyY").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1571,test,1570,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1573,test,1572,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1575,test,1574,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1577,test,1576,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map2_literalMutation436() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map2_literalMutation436");
        final Map<K, V> original = new HashMap<K, V>();
        original.put(((K)("keyX")), ((V)("object1")));
        original.put(((K)("keyY")), ((V)("object2")));
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("foo")), "objectA");
        test.put(((K)("keyX")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,test,1560,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1563,test,1562,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1565,test.getCollection("keyA"),1564,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1567,test.getCollection("keyX"),1566,test.getCollection("keyX").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1569,test.getCollection("keyY"),1568,test.getCollection("keyY").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1571,test,1570,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1573,test,1572,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1575,test,1574,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1577,test,1576,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map2_literalMutation437() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map2_literalMutation437");
        final Map<K, V> original = new HashMap<K, V>();
        original.put(((K)("keyX")), ((V)("object1")));
        original.put(((K)("keyY")), ((V)("object2")));
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "foo");
        test.put(((K)("keyX")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,test,1560,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1563,test,1562,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1565,test.getCollection("keyA"),1564,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1567,test.getCollection("keyX"),1566,test.getCollection("keyX").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1569,test.getCollection("keyY"),1568,test.getCollection("keyY").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1571,test,1570,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1573,test,1572,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1575,test,1574,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1577,test,1576,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map2_literalMutation438() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map2_literalMutation438");
        final Map<K, V> original = new HashMap<K, V>();
        original.put(((K)("keyX")), ((V)("object1")));
        original.put(((K)("keyY")), ((V)("object2")));
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "objectA");
        test.put(((K)("foo")), "object0");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,test,1560,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1563,test,1562,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1565,test.getCollection("keyA"),1564,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1567,test.getCollection("keyX"),1566,test.getCollection("keyX").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1569,test.getCollection("keyY"),1568,test.getCollection("keyY").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1571,test,1570,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1573,test,1572,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1575,test,1574,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1577,test,1576,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_Map2_literalMutation439() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_Map2_literalMutation439");
        final Map<K, V> original = new HashMap<K, V>();
        original.put(((K)("keyX")), ((V)("object1")));
        original.put(((K)("keyY")), ((V)("object2")));
        final MultiValueMap<K, V> test = new MultiValueMap<K, V>();
        test.put(((K)("keyA")), "objectA");
        test.put(((K)("keyX")), "foo");
        test.putAll(original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,test,1560,test.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1563,test,1562,test.totalSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1565,test.getCollection("keyA"),1564,test.getCollection("keyA").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1567,test.getCollection("keyX"),1566,test.getCollection("keyX").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1569,test.getCollection("keyY"),1568,test.getCollection("keyY").size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1571,test,1570,test.containsValue("objectA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1573,test,1572,test.containsValue("object0"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1575,test,1574,test.containsValue("object1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1577,test,1576,test.containsValue("object2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_KeyCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_KeyCollection");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        Collection<V> coll = ((Collection<V>)(java.util.Arrays.asList("X", "Y", "Z")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,map,1502,map.putAll(((K)("A")), coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,map,1504,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,map,1506,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,map,1508,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1511,map,1510,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,map,1512,map.putAll(((K)("A")), null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,map,1514,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1517,map,1516,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1519,map,1518,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1521,map,1520,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1523,map,1522,map.putAll(((K)("A")), new java.util.ArrayList<V>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1525,map,1524,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1527,map,1526,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1529,map,1528,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1531,map,1530,map.containsValue("A", "Z"));
        coll = ((Collection<V>)(java.util.Arrays.asList("M")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1533,map,1532,map.putAll(((K)("A")), coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1535,map,1534,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1537,map,1536,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1539,map,1538,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,map,1540,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1543,map,1542,map.containsValue("A", "M"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_KeyCollection_literalMutation418() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_KeyCollection_literalMutation418");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        Collection<V> coll = ((Collection<V>)(java.util.Arrays.asList("foo", "Y", "Z")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,map,1502,map.putAll(((K)("A")), coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,map,1504,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,map,1506,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,map,1508,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1511,map,1510,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,map,1512,map.putAll(((K)("A")), null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,map,1514,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1517,map,1516,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1519,map,1518,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1521,map,1520,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1523,map,1522,map.putAll(((K)("A")), new java.util.ArrayList<V>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1525,map,1524,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1527,map,1526,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1529,map,1528,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1531,map,1530,map.containsValue("A", "Z"));
        coll = ((Collection<V>)(java.util.Arrays.asList("M")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1533,map,1532,map.putAll(((K)("A")), coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1535,map,1534,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1537,map,1536,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1539,map,1538,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,map,1540,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1543,map,1542,map.containsValue("A", "M"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_KeyCollection_literalMutation419() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_KeyCollection_literalMutation419");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        Collection<V> coll = ((Collection<V>)(java.util.Arrays.asList("X", "foo", "Z")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,map,1502,map.putAll(((K)("A")), coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,map,1504,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,map,1506,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,map,1508,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1511,map,1510,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,map,1512,map.putAll(((K)("A")), null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,map,1514,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1517,map,1516,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1519,map,1518,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1521,map,1520,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1523,map,1522,map.putAll(((K)("A")), new java.util.ArrayList<V>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1525,map,1524,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1527,map,1526,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1529,map,1528,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1531,map,1530,map.containsValue("A", "Z"));
        coll = ((Collection<V>)(java.util.Arrays.asList("M")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1533,map,1532,map.putAll(((K)("A")), coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1535,map,1534,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1537,map,1536,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1539,map,1538,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,map,1540,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1543,map,1542,map.containsValue("A", "M"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_KeyCollection_literalMutation420() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_KeyCollection_literalMutation420");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        Collection<V> coll = ((Collection<V>)(java.util.Arrays.asList("X", "Y", "foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,map,1502,map.putAll(((K)("A")), coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,map,1504,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,map,1506,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,map,1508,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1511,map,1510,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,map,1512,map.putAll(((K)("A")), null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,map,1514,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1517,map,1516,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1519,map,1518,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1521,map,1520,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1523,map,1522,map.putAll(((K)("A")), new java.util.ArrayList<V>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1525,map,1524,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1527,map,1526,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1529,map,1528,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1531,map,1530,map.containsValue("A", "Z"));
        coll = ((Collection<V>)(java.util.Arrays.asList("M")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1533,map,1532,map.putAll(((K)("A")), coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1535,map,1534,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1537,map,1536,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1539,map,1538,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,map,1540,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1543,map,1542,map.containsValue("A", "M"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAll_KeyCollection_literalMutation421() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAll_KeyCollection_literalMutation421");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        Collection<V> coll = ((Collection<V>)(java.util.Arrays.asList("X", "Y", "Z")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,map,1502,map.putAll(((K)("A")), coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,map,1504,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,map,1506,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,map,1508,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1511,map,1510,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,map,1512,map.putAll(((K)("A")), null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,map,1514,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1517,map,1516,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1519,map,1518,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1521,map,1520,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1523,map,1522,map.putAll(((K)("A")), new java.util.ArrayList<V>()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1525,map,1524,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1527,map,1526,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1529,map,1528,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1531,map,1530,map.containsValue("A", "Z"));
        coll = ((Collection<V>)(java.util.Arrays.asList("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1533,map,1532,map.putAll(((K)("A")), coll));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1535,map,1534,map.size("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1537,map,1536,map.containsValue("A", "X"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1539,map,1538,map.containsValue("A", "Y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,map,1540,map.containsValue("A", "Z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1543,map,1542,map.containsValue("A", "M"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove_KeyItem() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_KeyItem");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        map.put(((K)("A")), "AA");
        map.put(((K)("A")), "AB");
        map.put(((K)("A")), "AC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,map,1612,map.removeMapping("C", "CA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,map,1614,map.removeMapping("A", "AD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1617,map,1616,map.removeMapping("A", "AC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1619,map,1618,map.removeMapping("A", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,map,1620,map.removeMapping("A", "AA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,new org.apache.commons.collections4.map.MultiValueMap<K, V>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,map);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove_KeyItem_literalMutation446() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_KeyItem_literalMutation446");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        map.put(((K)("foo")), "AA");
        map.put(((K)("A")), "AB");
        map.put(((K)("A")), "AC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,map,1612,map.removeMapping("C", "CA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,map,1614,map.removeMapping("A", "AD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1617,map,1616,map.removeMapping("A", "AC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1619,map,1618,map.removeMapping("A", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,map,1620,map.removeMapping("A", "AA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,new org.apache.commons.collections4.map.MultiValueMap<K, V>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,map);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove_KeyItem_literalMutation447() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_KeyItem_literalMutation447");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        map.put(((K)("A")), "foo");
        map.put(((K)("A")), "AB");
        map.put(((K)("A")), "AC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,map,1612,map.removeMapping("C", "CA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,map,1614,map.removeMapping("A", "AD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1617,map,1616,map.removeMapping("A", "AC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1619,map,1618,map.removeMapping("A", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,map,1620,map.removeMapping("A", "AA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,new org.apache.commons.collections4.map.MultiValueMap<K, V>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,map);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove_KeyItem_literalMutation448() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_KeyItem_literalMutation448");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        map.put(((K)("A")), "AA");
        map.put(((K)("foo")), "AB");
        map.put(((K)("A")), "AC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,map,1612,map.removeMapping("C", "CA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,map,1614,map.removeMapping("A", "AD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1617,map,1616,map.removeMapping("A", "AC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1619,map,1618,map.removeMapping("A", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,map,1620,map.removeMapping("A", "AA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,new org.apache.commons.collections4.map.MultiValueMap<K, V>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,map);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove_KeyItem_literalMutation449() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_KeyItem_literalMutation449");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        map.put(((K)("A")), "AA");
        map.put(((K)("A")), "foo");
        map.put(((K)("A")), "AC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,map,1612,map.removeMapping("C", "CA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,map,1614,map.removeMapping("A", "AD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1617,map,1616,map.removeMapping("A", "AC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1619,map,1618,map.removeMapping("A", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,map,1620,map.removeMapping("A", "AA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,new org.apache.commons.collections4.map.MultiValueMap<K, V>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,map);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove_KeyItem_literalMutation450() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_KeyItem_literalMutation450");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        map.put(((K)("A")), "AA");
        map.put(((K)("A")), "AB");
        map.put(((K)("foo")), "AC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,map,1612,map.removeMapping("C", "CA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,map,1614,map.removeMapping("A", "AD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1617,map,1616,map.removeMapping("A", "AC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1619,map,1618,map.removeMapping("A", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,map,1620,map.removeMapping("A", "AA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,new org.apache.commons.collections4.map.MultiValueMap<K, V>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,map);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove_KeyItem_literalMutation451() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_KeyItem_literalMutation451");
        final MultiValueMap<K, V> map = new MultiValueMap<K, V>();
        map.put(((K)("A")), "AA");
        map.put(((K)("A")), "AB");
        map.put(((K)("A")), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1613,map,1612,map.removeMapping("C", "CA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1615,map,1614,map.removeMapping("A", "AD"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1617,map,1616,map.removeMapping("A", "AC"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1619,map,1618,map.removeMapping("A", "AB"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1621,map,1620,map.removeMapping("A", "AA"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1622,new org.apache.commons.collections4.map.MultiValueMap<K, V>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1623,map);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    @Override
    public Object makeObject() {
        @SuppressWarnings(value = "unchecked")
        final Map<java.lang.String, java.lang.String> m = makeEmptyMap();
        m.put("a", "1");
        m.put("a", "1b");
        m.put("b", "2");
        m.put("c", "3");
        m.put("c", "3b");
        m.put("d", "4");
        return m;
    }

    @SuppressWarnings(value = "rawtypes")
    private Map makeEmptyMap() {
        return new MultiValueMap();
    }

    public void testEmptyMapCompatibility() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapCompatibility");
        final Map<?, ?> map = makeEmptyMap();
        final Map<?, ?> map2 = ((Map<?, ?>)(readExternalFormFromDisk(getCanonicalEmptyCollectionName(map))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1450,map2,1449,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFullMapCompatibility() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullMapCompatibility");
        final Map<?, ?> map = ((Map<?, ?>)(makeObject()));
        final Map<?, ?> map2 = ((Map<?, ?>)(readExternalFormFromDisk(getCanonicalFullCollectionName(map))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1452,map,1451,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1454,map2,1453,map2.size());
        for (final Object key : map.keySet()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1456,map,1455,map.get(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1458,map2,1457,map2.get(key));
            map2.remove(key);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1460,map2,1459,map2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

