package org.apache.commons.collections4.map;

import org.apache.commons.collections4.BulkTest;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import junit.framework.Test;
import java.util.TreeMap;

/** 
 * Extension of {@link AbstractSortedMapTest} for exercising the {@link TransformedSortedMap}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class TransformedSortedMapTest<K, V> extends AbstractSortedMapTest<K, V> {
    public TransformedSortedMapTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return BulkTest.makeSuite(TransformedSortedMapTest.class);
    }

    @Override
    public String[] ignoredTests() {
        if (BulkTest.IBMJDK16) {
            final String preSubMap = "TransformedSortedMapTest.bulkTestSubMap.";
            final String preTailMap = "TransformedSortedMapTest.bulkTestTailMap.";
            return new String[]{ preSubMap + "bulkTestMapEntrySet.testCollectionIteratorRemove" , preSubMap + "bulkTestMapKeySet.testCollectionRemove" , preSubMap + "bulkTestMapValues.testCollectionIteratorRemove" , preTailMap + "testMapRemove" , preTailMap + "bulkTestMapEntrySet.testCollectionIteratorRemove" , preTailMap + "bulkTestMapEntrySet.testCollectionRemoveAll" , preTailMap + "bulkTestMapKeySet.testCollectionIteratorRemove" , preTailMap + "bulkTestMapKeySet.testCollectionRemoveAll" , preTailMap + "bulkTestMapValues.testCollectionClear" , preTailMap + "bulkTestMapValues.testCollectionRemoveAll" , preTailMap + "bulkTestMapValues.testCollectionRetainAll" };
        } else {
            return null;
        }
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public SortedMap<K, V> makeObject() {
        return org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.TransformerUtils.nopTransformer())), ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.TransformerUtils.nopTransformer())));
    }

    @Override
    public boolean isSubMapViewsSerializable() {
        return false;
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testTransformedMap_add593() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_add593");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testTransformedMap_add594() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_add594");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testTransformedMap_add595() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_add595");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testTransformedMap_add596() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_add596");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testTransformedMap_add597() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_add597");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testTransformedMap_add598() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_add598");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation657() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation657");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation658() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation658");
        final Object[] els = new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation659() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation659");
        final Object[] els = new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation660() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation660");
        final Object[] els = new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation661() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation661");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation662() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation662");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation663() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation663");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation664() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation664");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation666() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation666");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = -1 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation667() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation667");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[-1]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation669() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation669");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 1 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation670() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation670");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[1]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation671() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation671");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[-1].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation672() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation672");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedMap_literalMutation673() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation673");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testTransformedMap_remove476() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_remove476");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testTransformedMap_remove477() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_remove477");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testTransformedMap_remove478() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_remove478");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testTransformedMap_remove479() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_remove479");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        SortedMap<K, V> map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),475,map,474,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1937,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1939,map,1938,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1941,map,1940,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            try {
                map.containsKey(els[i]);
            } catch (final ClassCastException ex) {
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1943,map,1942,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1944,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,map,1945,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        try {
            map.remove(els[0]);
        } catch (final ClassCastException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,map,1948,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(new TreeMap<K, V>(), null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,map,1953,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,map,1955,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1958,map,1957,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,null,1959,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1962,map,1961,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1964,null,1963,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1966,map,1965,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,null,1967,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,array[0],1969,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,null,1971,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,map,1973,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1976,null,1975,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,entry,1977,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,null,1979,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,map,1981,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_Decorate_add585() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_add585");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_Decorate_add586() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_add586");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_Decorate_add587() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_add587");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_Decorate_add588() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_add588");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation637() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation637");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation638() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation638");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("foo")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation639() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation639");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("foo")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation640() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation640");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("foo")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation641() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation641");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("foo")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation642() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation642");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("foo")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation643() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation643");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("foo")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation645() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation645");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("foo")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation646() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation646");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_Decorate_remove468() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_remove468");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_Decorate_remove469() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_remove469");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_Decorate_remove470() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_remove470");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_Decorate_remove471() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_remove471");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1908,trans,1907,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1910,trans,1909,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1912,trans,1911,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1914,trans,1913,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1916,null,1915,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1918,trans,1917,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_decorateTransform_add589() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_add589");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_decorateTransform_add590() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_add590");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_decorateTransform_add591() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_add591");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_decorateTransform_add592() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_add592");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation647() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation647");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation648() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation648");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("foo")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation649() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation649");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("foo")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation650() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation650");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("foo")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation651() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation651");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("foo")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation652() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation652");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("foo")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation653() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation653");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("foo")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation655() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation655");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("foo")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation656() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation656");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_decorateTransform_remove472() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_remove472");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_decorateTransform_remove473() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_remove473");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_decorateTransform_remove474() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_remove474");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testFactory_decorateTransform_remove475() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_remove475");
        final SortedMap<K, V> base = new TreeMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final SortedMap<K, V> trans = org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1920,trans,1919,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1922,null,1921,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1924,trans,1923,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1926,null,1925,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1928,trans,1927,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1930,null,1929,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1932,trans,1931,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1934,null,1933,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1936,trans,1935,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

