package org.apache.commons.collections4.map;

import java.util.HashMap;
import org.apache.commons.collections4.IterableMap;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

/** 
 * Extension of {@link AbstractMapTest} for exercising the {@link TransformedMap}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class TransformedMapTest<K, V> extends AbstractIterableMapTest<K, V> {
    public TransformedMapTest(final String testName) {
        super(testName);
    }

    @Override
    public IterableMap<K, V> makeObject() {
        return org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), org.apache.commons.collections4.TransformerUtils.<K>nopTransformer(), org.apache.commons.collections4.TransformerUtils.<V>nopTransformer());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testTransformedMap_add581() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_add581");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testTransformedMap_add582() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_add582");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testTransformedMap_add583() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_add583");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testTransformedMap_add584() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_add584");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "foo" , "rawtypes" })
    public void testTransformedMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "foo" })
    public void testTransformedMap_literalMutation621() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation621");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testTransformedMap_literalMutation622() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation622");
        final Object[] els = new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testTransformedMap_literalMutation623() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation623");
        final Object[] els = new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testTransformedMap_literalMutation624() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation624");
        final Object[] els = new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testTransformedMap_literalMutation625() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation625");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testTransformedMap_literalMutation626() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation626");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testTransformedMap_literalMutation627() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation627");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testTransformedMap_literalMutation628() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation628");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testTransformedMap_literalMutation630() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation630");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = -1 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testTransformedMap_literalMutation632() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation632");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 1 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testTransformedMap_literalMutation633() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation633");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[1]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testTransformedMap_literalMutation634() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation634");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[-1].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testTransformedMap_literalMutation635() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation635");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testTransformedMap_literalMutation636() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_literalMutation636");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testTransformedMap_remove464() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_remove464");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testTransformedMap_remove465() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_remove465");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        array[0].setValue(((V)("66")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testTransformedMap_remove466() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_remove466");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testTransformedMap_remove467() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedMap_remove467");
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        Map<K, V> map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap<K, V>(), ((org.apache.commons.collections4.Transformer<? super K, ? extends K>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),795,map,794,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,map,1856,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,map,1858,map.containsKey(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1861,map,1860,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1863,map,1862,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,map,1865,map.get(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1868,map,1867,map.remove(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,els[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,map,1870,map.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        map = org.apache.commons.collections4.map.TransformedMap.transformingMap(new HashMap(), null, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1873,map,1872,map.size());
        for (int i = 0 ; i < (els.length) ; i++) {
            map.put(((K)(els[i])), ((V)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,map,1875,map.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.containsValue(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsValue(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.containsKey(els[i]));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1884,null,1883,java.lang.Integer.valueOf(((java.lang.String)(els[i]))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1886,map,1885,map.get(els[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1888,null,1887,java.lang.Integer.valueOf(((java.lang.String)(els[0]))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,map,1889,map.remove(els[0]));
        final Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        final Map.Entry<K, V>[] array = entrySet.toArray(new Map.Entry[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,null,1891,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,array[0],1893,array[0].getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1896,null,1895,java.lang.Integer.valueOf(66));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1898,map,1897,map.get(array[0].getKey()));
        final Map.Entry<K, V> entry = entrySet.iterator().next();
        entry.setValue(((V)("88")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1900,null,1899,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1902,entry,1901,entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1904,null,1903,java.lang.Integer.valueOf(88));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1906,map,1905,map.get(entry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_Decorate_add573() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_add573");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_Decorate_add574() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_add574");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_Decorate_add575() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_add575");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_Decorate_add576() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_add576");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation601() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation601");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("foo")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation602() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation602");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("foo")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation603() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation603");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("foo")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation604() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation604");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("foo")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation605() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation605");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("foo")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation606() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation606");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("foo")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation608() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation608");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("foo")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_Decorate_literalMutation609() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_literalMutation609");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_Decorate_remove456() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_remove456");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_Decorate_remove457() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_remove457");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_Decorate_remove458() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_remove458");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_Decorate_remove459() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_Decorate_remove459");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformingMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,trans,1825,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,trans,1827,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,trans,1829,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,trans,1831,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,null,1833,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1836,trans,1835,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_decorateTransform_add577() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_add577");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_decorateTransform_add578() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_add578");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_decorateTransform_add579() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_add579");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_decorateTransform_add580() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_add580");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation611() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation611");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("foo")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation612() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation612");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("foo")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation613() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation613");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("foo")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation614() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation614");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("foo")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation615() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation615");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("foo")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation616() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation616");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("foo")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation618() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation618");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("foo")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFactory_decorateTransform_literalMutation619() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_literalMutation619");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("A")), ((V)("1")));
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_decorateTransform_remove460() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_remove460");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_decorateTransform_remove461() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_remove461");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_decorateTransform_remove462() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_remove462");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testFactory_decorateTransform_remove463() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFactory_decorateTransform_remove463");
        final Map<K, V> base = new HashMap<K, V>();
        base.put(((K)("B")), ((V)("2")));
        base.put(((K)("C")), ((V)("3")));
        final Map<K, V> trans = org.apache.commons.collections4.map.TransformedMap.transformedMap(base, null, ((org.apache.commons.collections4.Transformer<? super V, ? extends V>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1838,trans,1837,trans.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1840,null,1839,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1842,trans,1841,trans.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1844,null,1843,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1846,trans,1845,trans.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1848,null,1847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,trans,1849,trans.get("C"));
        trans.put(((K)("D")), ((V)("4")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1852,null,1851,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1854,trans,1853,trans.get("D"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

