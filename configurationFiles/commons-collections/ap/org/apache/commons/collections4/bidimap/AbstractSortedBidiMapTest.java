package org.apache.commons.collections4.bidimap;

import org.apache.commons.collections4.map.AbstractSortedMapTest;
import java.util.ArrayList;
import org.apache.commons.collections4.BulkTest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.SortedBidiMap;
import java.util.SortedMap;
import java.util.SortedSet;
import org.junit.Test;
import java.util.TreeMap;
import java.util.TreeSet;

/** 
 * Abstract test class for {@link SortedBidiMap} methods and contracts.
 * 
 * @version $Id$
 */
public abstract class AbstractSortedBidiMapTest<K extends java.lang.Comparable<K>, V extends Comparable<V>> extends AbstractOrderedBidiMapTest<K, V> {
    protected List<K> sortedKeys;

    protected List<V> sortedValues = new ArrayList<V>();

    protected SortedSet<V> sortedNewValues = new TreeSet<V>();

    public AbstractSortedBidiMapTest(final String testName) {
        super(testName);
        sortedKeys = getAsList(getSampleKeys());
        java.util.Collections.sort(sortedKeys);
        sortedKeys = java.util.Collections.unmodifiableList(sortedKeys);
        final Map<K, V> map = new TreeMap<K, V>();
        addSampleMappings(map);
        sortedValues.addAll(map.values());
        sortedValues = java.util.Collections.unmodifiableList(sortedValues);
        sortedNewValues.addAll(this.<V>getAsList(getNewSampleValues()));
    }

    @Override
    public boolean isAllowNullKey() {
        return false;
    }

    @Override
    public boolean isAllowNullValue() {
        return false;
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public abstract SortedBidiMap<K, V> makeObject();

    /** 
     * {@inheritDoc}
     */
@Override
    public SortedBidiMap<K, V> makeFullMap() {
        return ((SortedBidiMap<K, V>)(super.makeFullMap()));
    }

    @Override
    public SortedMap<K, V> makeConfirmedMap() {
        return new TreeMap<K, V>();
    }

    public void testBidiHeadMapContains() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiHeadMapContains");
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        final K first = it.next();
        final K toKey = it.next();
        final K second = it.next();
        final V firstValue = sm.get(first);
        final V secondValue = sm.get(second);
        final SortedMap<K, V> head = sm.headMap(toKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,head,5168,head.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,sm,5170,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5173,head,5172,head.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5175,sm,5174,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5177,head,5176,head.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,sm,5178,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,head,5180,head.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,sm,5182,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,head,5184,head.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiClearByHeadMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClearByHeadMap");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final V firstValue = sm.get(first);
        final V secondValue = sm.get(second);
        final V toKeyValue = sm.get(toKey);
        final SortedMap<K, V> sub = sm.headMap(toKey);
        final int size = sm.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5020,sub,5019,sub.size());
        sub.clear();
        sub.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5022,sub,5021,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5023,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5025,sm,5024,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5026,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5028,sm.inverseBidiMap(),5027,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5030,sm,5029,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5032,sm,5031,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5034,sm.inverseBidiMap(),5033,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5036,sm.inverseBidiMap(),5035,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5038,sub,5037,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,sub,5039,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,sm,5041,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,sm,5043,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,sm.inverseBidiMap(),5045,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,sm.inverseBidiMap(),5047,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,sub,5049,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,sub,5051,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,sm,5053,sm.containsKey(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,sm,5055,sm.containsValue(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,sm.inverseBidiMap(),5057,sm.inverseBidiMap().containsKey(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5060,sm.inverseBidiMap(),5059,sm.inverseBidiMap().containsValue(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5062,sub,5061,sub.containsKey(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5064,sub,5063,sub.containsValue(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiClearByHeadMap_remove1231() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClearByHeadMap_remove1231");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final V firstValue = sm.get(first);
        final V secondValue = sm.get(second);
        final V toKeyValue = sm.get(toKey);
        final SortedMap<K, V> sub = sm.headMap(toKey);
        final int size = sm.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5020,sub,5019,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5022,sub,5021,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5023,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5025,sm,5024,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5026,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5028,sm.inverseBidiMap(),5027,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5030,sm,5029,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5032,sm,5031,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5034,sm.inverseBidiMap(),5033,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5036,sm.inverseBidiMap(),5035,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5038,sub,5037,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,sub,5039,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,sm,5041,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,sm,5043,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,sm.inverseBidiMap(),5045,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,sm.inverseBidiMap(),5047,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,sub,5049,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,sub,5051,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,sm,5053,sm.containsKey(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,sm,5055,sm.containsValue(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,sm.inverseBidiMap(),5057,sm.inverseBidiMap().containsKey(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5060,sm.inverseBidiMap(),5059,sm.inverseBidiMap().containsValue(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5062,sub,5061,sub.containsKey(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5064,sub,5063,sub.containsValue(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByHeadMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByHeadMap");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.headMap(toKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5187,sub,5186,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5189,set,5188,set.size());
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5191,sm,5190,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,sub,5192,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,set,5194,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,sm,5196,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,sub,5198,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,set,5200,set.contains(secondEntry));
        set.remove(firstEntry);
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,sub,5202,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5204,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,sm,5205,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5207,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5209,sm.inverseBidiMap(),5208,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5211,sm,5210,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,sm,5212,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,sm.inverseBidiMap(),5214,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5217,sm.inverseBidiMap(),5216,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,sub,5218,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,sub,5220,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5223,set,5222,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5225,sub,5224,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5226,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5228,sm,5227,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5229,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5231,sm.inverseBidiMap(),5230,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5233,sm,5232,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5235,sm,5234,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5237,sm.inverseBidiMap(),5236,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5239,sm.inverseBidiMap(),5238,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5241,sub,5240,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5243,sub,5242,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5245,set,5244,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByHeadMapEntrySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByHeadMapEntrySet");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.headMap(toKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5187,sub,5186,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5189,set,5188,set.size());
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5191,sm,5190,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,sub,5192,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,set,5194,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,sm,5196,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,sub,5198,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,set,5200,set.contains(secondEntry));
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,sub,5202,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5204,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,sm,5205,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5207,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5209,sm.inverseBidiMap(),5208,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5211,sm,5210,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,sm,5212,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,sm.inverseBidiMap(),5214,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5217,sm.inverseBidiMap(),5216,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,sub,5218,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,sub,5220,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5223,set,5222,set.contains(firstEntry));
        set.remove(secondEntry);
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5225,sub,5224,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5226,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5228,sm,5227,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5229,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5231,sm.inverseBidiMap(),5230,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5233,sm,5232,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5235,sm,5234,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5237,sm.inverseBidiMap(),5236,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5239,sm.inverseBidiMap(),5238,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5241,sub,5240,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5243,sub,5242,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5245,set,5244,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByHeadMapEntrySet_remove1234() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByHeadMapEntrySet_remove1234");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.headMap(toKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5187,sub,5186,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5189,set,5188,set.size());
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5191,sm,5190,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,sub,5192,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,set,5194,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,sm,5196,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,sub,5198,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,set,5200,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,sub,5202,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5204,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,sm,5205,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5207,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5209,sm.inverseBidiMap(),5208,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5211,sm,5210,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,sm,5212,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,sm.inverseBidiMap(),5214,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5217,sm.inverseBidiMap(),5216,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,sub,5218,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,sub,5220,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5223,set,5222,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5225,sub,5224,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5226,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5228,sm,5227,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5229,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5231,sm.inverseBidiMap(),5230,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5233,sm,5232,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5235,sm,5234,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5237,sm.inverseBidiMap(),5236,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5239,sm.inverseBidiMap(),5238,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5241,sub,5240,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5243,sub,5242,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5245,set,5244,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByHeadMapEntrySet_remove1235() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByHeadMapEntrySet_remove1235");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.headMap(toKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5187,sub,5186,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5189,set,5188,set.size());
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5191,sm,5190,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,sub,5192,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,set,5194,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,sm,5196,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,sub,5198,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,set,5200,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,sub,5202,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5204,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5206,sm,5205,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5207,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5209,sm.inverseBidiMap(),5208,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5211,sm,5210,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,sm,5212,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,sm.inverseBidiMap(),5214,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5217,sm.inverseBidiMap(),5216,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,sub,5218,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,sub,5220,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5223,set,5222,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5225,sub,5224,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5226,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5228,sm,5227,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5229,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5231,sm.inverseBidiMap(),5230,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5233,sm,5232,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5235,sm,5234,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5237,sm.inverseBidiMap(),5236,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5239,sm.inverseBidiMap(),5238,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5241,sub,5240,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5243,sub,5242,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5245,set,5244,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiTailMapContains() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiTailMapContains");
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        final K first = it.next();
        final K fromKey = it.next();
        final K second = it.next();
        final V firstValue = sm.get(first);
        final V fromKeyValue = sm.get(fromKey);
        final V secondValue = sm.get(second);
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5494,((sm.size()) - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5496,sub,5495,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5498,sm,5497,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5500,sub,5499,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5502,sm,5501,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5504,sub,5503,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5506,sm,5505,sm.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5508,sub,5507,sub.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5510,sm,5509,sm.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5512,sub,5511,sub.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5514,sm,5513,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5516,sub,5515,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5518,sm,5517,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5520,sub,5519,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiClearByTailMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClearByTailMap");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        it.next();
        final K first = it.next();
        final K fromKey = it.next();
        final K second = it.next();
        final V firstValue = sm.get(first);
        final V fromKeyValue = sm.get(fromKey);
        final V secondValue = sm.get(second);
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        final int size = sm.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5123,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5125,sub,5124,sub.size());
        sub.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5127,sub,5126,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5129,sm,5128,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5131,sm.inverseBidiMap(),5130,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5133,sm,5132,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5135,sm,5134,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5137,sm.inverseBidiMap(),5136,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5139,sm.inverseBidiMap(),5138,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5141,sub,5140,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5143,sub,5142,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5145,sm,5144,sm.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5147,sm,5146,sm.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5149,sm.inverseBidiMap(),5148,sm.inverseBidiMap().containsKey(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5151,sm.inverseBidiMap(),5150,sm.inverseBidiMap().containsValue(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5153,sub,5152,sub.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5155,sub,5154,sub.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5157,sm,5156,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5159,sm,5158,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,sm.inverseBidiMap(),5160,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5163,sm.inverseBidiMap(),5162,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5165,sub,5164,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,sub,5166,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiClearByTailMap_add1623() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClearByTailMap_add1623");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        it.next();
        final K first = it.next();
        final K fromKey = it.next();
        final K second = it.next();
        final V firstValue = sm.get(first);
        final V fromKeyValue = sm.get(fromKey);
        final V secondValue = sm.get(second);
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        final int size = sm.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5123,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5125,sub,5124,sub.size());
        sub.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5127,sub,5126,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5129,sm,5128,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5131,sm.inverseBidiMap(),5130,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5133,sm,5132,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5135,sm,5134,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5137,sm.inverseBidiMap(),5136,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5139,sm.inverseBidiMap(),5138,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5141,sub,5140,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5143,sub,5142,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5145,sm,5144,sm.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5147,sm,5146,sm.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5149,sm.inverseBidiMap(),5148,sm.inverseBidiMap().containsKey(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5151,sm.inverseBidiMap(),5150,sm.inverseBidiMap().containsValue(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5153,sub,5152,sub.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5155,sub,5154,sub.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5157,sm,5156,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5159,sm,5158,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,sm.inverseBidiMap(),5160,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5163,sm.inverseBidiMap(),5162,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5165,sub,5164,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,sub,5166,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiClearByTailMap_add1624() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClearByTailMap_add1624");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K first = it.next();
        final K fromKey = it.next();
        final K second = it.next();
        final V firstValue = sm.get(first);
        final V fromKeyValue = sm.get(fromKey);
        final V secondValue = sm.get(second);
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        final int size = sm.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5123,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5125,sub,5124,sub.size());
        sub.clear();
        sub.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5127,sub,5126,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5129,sm,5128,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5131,sm.inverseBidiMap(),5130,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5133,sm,5132,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5135,sm,5134,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5137,sm.inverseBidiMap(),5136,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5139,sm.inverseBidiMap(),5138,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5141,sub,5140,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5143,sub,5142,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5145,sm,5144,sm.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5147,sm,5146,sm.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5149,sm.inverseBidiMap(),5148,sm.inverseBidiMap().containsKey(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5151,sm.inverseBidiMap(),5150,sm.inverseBidiMap().containsValue(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5153,sub,5152,sub.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5155,sub,5154,sub.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5157,sm,5156,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5159,sm,5158,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,sm.inverseBidiMap(),5160,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5163,sm.inverseBidiMap(),5162,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5165,sub,5164,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,sub,5166,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiClearByTailMap_remove1233() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClearByTailMap_remove1233");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K first = it.next();
        final K fromKey = it.next();
        final K second = it.next();
        final V firstValue = sm.get(first);
        final V fromKeyValue = sm.get(fromKey);
        final V secondValue = sm.get(second);
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        final int size = sm.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5123,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5125,sub,5124,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5127,sub,5126,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5129,sm,5128,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5131,sm.inverseBidiMap(),5130,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5133,sm,5132,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5135,sm,5134,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5137,sm.inverseBidiMap(),5136,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5139,sm.inverseBidiMap(),5138,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5141,sub,5140,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5143,sub,5142,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5145,sm,5144,sm.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5147,sm,5146,sm.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5149,sm.inverseBidiMap(),5148,sm.inverseBidiMap().containsKey(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5151,sm.inverseBidiMap(),5150,sm.inverseBidiMap().containsValue(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5153,sub,5152,sub.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5155,sub,5154,sub.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5157,sm,5156,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5159,sm,5158,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,sm.inverseBidiMap(),5160,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5163,sm.inverseBidiMap(),5162,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5165,sub,5164,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,sub,5166,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByTailMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByTailMap");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5411,sm,5410,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5413,sub,5412,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5415,sm,5414,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5417,sub,5416,sub.containsKey(second));
        final Object firstValue = sub.remove(first);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5418,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5420,sub,5419,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5421,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5423,sm,5422,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5424,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5426,sm.inverseBidiMap(),5425,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5428,sm,5427,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5430,sm,5429,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5432,sm.inverseBidiMap(),5431,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5434,sm.inverseBidiMap(),5433,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5436,sub,5435,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5438,sub,5437,sub.containsValue(firstValue));
        final Object secondValue = sub.remove(second);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5439,(size - 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5441,sub,5440,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5442,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5444,sm,5443,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5445,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5447,sm.inverseBidiMap(),5446,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5449,sm,5448,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5451,sm,5450,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5453,sm.inverseBidiMap(),5452,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5455,sm.inverseBidiMap(),5454,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5457,sub,5456,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5459,sub,5458,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByTailMap_add1635() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByTailMap_add1635");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5411,sm,5410,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5413,sub,5412,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5415,sm,5414,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5417,sub,5416,sub.containsKey(second));
        final Object firstValue = sub.remove(first);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5418,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5420,sub,5419,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5421,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5423,sm,5422,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5424,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5426,sm.inverseBidiMap(),5425,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5428,sm,5427,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5430,sm,5429,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5432,sm.inverseBidiMap(),5431,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5434,sm.inverseBidiMap(),5433,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5436,sub,5435,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5438,sub,5437,sub.containsValue(firstValue));
        final Object secondValue = sub.remove(second);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5439,(size - 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5441,sub,5440,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5442,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5444,sm,5443,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5445,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5447,sm.inverseBidiMap(),5446,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5449,sm,5448,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5451,sm,5450,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5453,sm.inverseBidiMap(),5452,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5455,sm.inverseBidiMap(),5454,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5457,sub,5456,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5459,sub,5458,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveByTailMapEntrySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByTailMapEntrySet");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5353,sm,5352,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5355,sub,5354,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5357,set,5356,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5359,sm,5358,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5361,sub,5360,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5363,set,5362,set.contains(secondEntry));
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5366,sub,5365,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,sm,5368,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5370,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5372,sm.inverseBidiMap(),5371,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5374,sm,5373,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,sm,5375,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,sm.inverseBidiMap(),5377,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,sm.inverseBidiMap(),5379,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5382,sub,5381,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5384,sub,5383,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5386,set,5385,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,(size - 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5389,sub,5388,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5390,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5392,sm,5391,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,sm.inverseBidiMap(),5394,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,sm,5396,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,sm,5398,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5401,sm.inverseBidiMap(),5400,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5403,sm.inverseBidiMap(),5402,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5405,sub,5404,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5407,sub,5406,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5409,set,5408,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByTailMapEntrySet_add1636() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByTailMapEntrySet_add1636");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5353,sm,5352,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5355,sub,5354,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5357,set,5356,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5359,sm,5358,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5361,sub,5360,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5363,set,5362,set.contains(secondEntry));
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5366,sub,5365,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,sm,5368,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5370,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5372,sm.inverseBidiMap(),5371,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5374,sm,5373,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,sm,5375,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,sm.inverseBidiMap(),5377,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,sm.inverseBidiMap(),5379,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5382,sub,5381,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5384,sub,5383,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5386,set,5385,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,(size - 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5389,sub,5388,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5390,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5392,sm,5391,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,sm.inverseBidiMap(),5394,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,sm,5396,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,sm,5398,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5401,sm.inverseBidiMap(),5400,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5403,sm.inverseBidiMap(),5402,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5405,sub,5404,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5407,sub,5406,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5409,set,5408,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByTailMapEntrySet_add1637() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByTailMapEntrySet_add1637");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5353,sm,5352,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5355,sub,5354,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5357,set,5356,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5359,sm,5358,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5361,sub,5360,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5363,set,5362,set.contains(secondEntry));
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5366,sub,5365,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,sm,5368,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5370,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5372,sm.inverseBidiMap(),5371,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5374,sm,5373,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,sm,5375,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,sm.inverseBidiMap(),5377,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,sm.inverseBidiMap(),5379,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5382,sub,5381,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5384,sub,5383,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5386,set,5385,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,(size - 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5389,sub,5388,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5390,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5392,sm,5391,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,sm.inverseBidiMap(),5394,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,sm,5396,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,sm,5398,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5401,sm.inverseBidiMap(),5400,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5403,sm.inverseBidiMap(),5402,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5405,sub,5404,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5407,sub,5406,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5409,set,5408,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByTailMapEntrySet_add1638() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByTailMapEntrySet_add1638");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5353,sm,5352,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5355,sub,5354,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5357,set,5356,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5359,sm,5358,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5361,sub,5360,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5363,set,5362,set.contains(secondEntry));
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5366,sub,5365,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,sm,5368,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5370,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5372,sm.inverseBidiMap(),5371,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5374,sm,5373,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,sm,5375,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,sm.inverseBidiMap(),5377,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,sm.inverseBidiMap(),5379,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5382,sub,5381,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5384,sub,5383,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5386,set,5385,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,(size - 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5389,sub,5388,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5390,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5392,sm,5391,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,sm.inverseBidiMap(),5394,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,sm,5396,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,sm,5398,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5401,sm.inverseBidiMap(),5400,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5403,sm.inverseBidiMap(),5402,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5405,sub,5404,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5407,sub,5406,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5409,set,5408,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByTailMapEntrySet_add1639() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByTailMapEntrySet_add1639");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5353,sm,5352,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5355,sub,5354,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5357,set,5356,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5359,sm,5358,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5361,sub,5360,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5363,set,5362,set.contains(secondEntry));
        set.remove(firstEntry);
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5366,sub,5365,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,sm,5368,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5370,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5372,sm.inverseBidiMap(),5371,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5374,sm,5373,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,sm,5375,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,sm.inverseBidiMap(),5377,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,sm.inverseBidiMap(),5379,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5382,sub,5381,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5384,sub,5383,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5386,set,5385,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,(size - 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5389,sub,5388,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5390,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5392,sm,5391,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,sm.inverseBidiMap(),5394,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,sm,5396,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,sm,5398,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5401,sm.inverseBidiMap(),5400,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5403,sm.inverseBidiMap(),5402,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5405,sub,5404,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5407,sub,5406,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5409,set,5408,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByTailMapEntrySet_add1640() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByTailMapEntrySet_add1640");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5353,sm,5352,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5355,sub,5354,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5357,set,5356,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5359,sm,5358,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5361,sub,5360,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5363,set,5362,set.contains(secondEntry));
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5366,sub,5365,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,sm,5368,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5370,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5372,sm.inverseBidiMap(),5371,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5374,sm,5373,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,sm,5375,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,sm.inverseBidiMap(),5377,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,sm.inverseBidiMap(),5379,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5382,sub,5381,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5384,sub,5383,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5386,set,5385,set.contains(firstEntry));
        set.remove(secondEntry);
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,(size - 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5389,sub,5388,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5390,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5392,sm,5391,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,sm.inverseBidiMap(),5394,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,sm,5396,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,sm,5398,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5401,sm.inverseBidiMap(),5400,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5403,sm.inverseBidiMap(),5402,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5405,sub,5404,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5407,sub,5406,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5409,set,5408,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByTailMapEntrySet_remove1238() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByTailMapEntrySet_remove1238");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5353,sm,5352,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5355,sub,5354,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5357,set,5356,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5359,sm,5358,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5361,sub,5360,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5363,set,5362,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5366,sub,5365,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,sm,5368,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5370,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5372,sm.inverseBidiMap(),5371,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5374,sm,5373,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,sm,5375,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,sm.inverseBidiMap(),5377,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,sm.inverseBidiMap(),5379,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5382,sub,5381,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5384,sub,5383,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5386,set,5385,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,(size - 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5389,sub,5388,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5390,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5392,sm,5391,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,sm.inverseBidiMap(),5394,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,sm,5396,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,sm,5398,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5401,sm.inverseBidiMap(),5400,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5403,sm.inverseBidiMap(),5402,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5405,sub,5404,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5407,sub,5406,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5409,set,5408,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByTailMapEntrySet_remove1239() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByTailMapEntrySet_remove1239");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.tailMap(fromKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5353,sm,5352,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5355,sub,5354,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5357,set,5356,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5359,sm,5358,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5361,sub,5360,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5363,set,5362,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5364,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5366,sub,5365,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,sm,5368,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5370,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5372,sm.inverseBidiMap(),5371,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5374,sm,5373,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,sm,5375,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5378,sm.inverseBidiMap(),5377,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5380,sm.inverseBidiMap(),5379,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5382,sub,5381,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5384,sub,5383,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5386,set,5385,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,(size - 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5389,sub,5388,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5390,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5392,sm,5391,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,sm.inverseBidiMap(),5394,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,sm,5396,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,sm,5398,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5401,sm.inverseBidiMap(),5400,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5403,sm.inverseBidiMap(),5402,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5405,sub,5404,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5407,sub,5406,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5409,set,5408,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiSubMapContains() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiSubMapContains");
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        final K first = it.next();
        final K fromKey = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final K third = it.next();
        final V firstValue = sm.get(first);
        final V fromKeyValue = sm.get(fromKey);
        final V secondValue = sm.get(second);
        final V thirdValue = sm.get(third);
        final SortedMap<K, V> sub = sm.subMap(fromKey, toKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5461,sub,5460,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5463,sm,5462,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5465,sub,5464,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5467,sm,5466,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5469,sub,5468,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5471,sm,5470,sm.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5473,sub,5472,sub.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5475,sm,5474,sm.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5477,sub,5476,sub.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5479,sm,5478,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5481,sub,5480,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5483,sm,5482,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5485,sub,5484,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5487,sm,5486,sm.containsKey(third));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5489,sub,5488,sub.containsKey(third));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5491,sm,5490,sm.containsValue(thirdValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5493,sub,5492,sub.containsValue(thirdValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiClearBySubMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClearBySubMap");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final V fromKeyValue = sm.get(fromKey);
        final V firstValue = sm.get(first);
        final V secondValue = sm.get(second);
        final V toKeyValue = sm.get(toKey);
        final SortedMap<K, V> sub = sm.subMap(fromKey, toKey);
        final int size = sm.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5066,sub,5065,sub.size());
        sub.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5068,sub,5067,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5069,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5071,sm,5070,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5072,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5074,sm.inverseBidiMap(),5073,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5076,sm,5075,sm.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5078,sm,5077,sm.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5080,sm.inverseBidiMap(),5079,sm.inverseBidiMap().containsKey(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5082,sm.inverseBidiMap(),5081,sm.inverseBidiMap().containsValue(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5084,sub,5083,sub.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5086,sub,5085,sub.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5088,sm,5087,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5090,sm,5089,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5092,sm.inverseBidiMap(),5091,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5094,sm.inverseBidiMap(),5093,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5096,sub,5095,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5098,sub,5097,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5100,sm,5099,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5102,sm,5101,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5104,sm.inverseBidiMap(),5103,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5106,sm.inverseBidiMap(),5105,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5108,sub,5107,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5110,sub,5109,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5112,sm,5111,sm.containsKey(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5114,sm,5113,sm.containsValue(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5116,sm.inverseBidiMap(),5115,sm.inverseBidiMap().containsKey(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5118,sm.inverseBidiMap(),5117,sm.inverseBidiMap().containsValue(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5120,sub,5119,sub.containsKey(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5122,sub,5121,sub.containsValue(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiClearBySubMap_add1621() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClearBySubMap_add1621");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final V fromKeyValue = sm.get(fromKey);
        final V firstValue = sm.get(first);
        final V secondValue = sm.get(second);
        final V toKeyValue = sm.get(toKey);
        final SortedMap<K, V> sub = sm.subMap(fromKey, toKey);
        final int size = sm.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5066,sub,5065,sub.size());
        sub.clear();
        sub.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5068,sub,5067,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5069,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5071,sm,5070,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5072,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5074,sm.inverseBidiMap(),5073,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5076,sm,5075,sm.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5078,sm,5077,sm.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5080,sm.inverseBidiMap(),5079,sm.inverseBidiMap().containsKey(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5082,sm.inverseBidiMap(),5081,sm.inverseBidiMap().containsValue(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5084,sub,5083,sub.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5086,sub,5085,sub.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5088,sm,5087,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5090,sm,5089,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5092,sm.inverseBidiMap(),5091,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5094,sm.inverseBidiMap(),5093,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5096,sub,5095,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5098,sub,5097,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5100,sm,5099,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5102,sm,5101,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5104,sm.inverseBidiMap(),5103,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5106,sm.inverseBidiMap(),5105,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5108,sub,5107,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5110,sub,5109,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5112,sm,5111,sm.containsKey(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5114,sm,5113,sm.containsValue(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5116,sm.inverseBidiMap(),5115,sm.inverseBidiMap().containsKey(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5118,sm.inverseBidiMap(),5117,sm.inverseBidiMap().containsValue(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5120,sub,5119,sub.containsKey(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5122,sub,5121,sub.containsValue(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiClearBySubMap_remove1232() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClearBySubMap_remove1232");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final V fromKeyValue = sm.get(fromKey);
        final V firstValue = sm.get(first);
        final V secondValue = sm.get(second);
        final V toKeyValue = sm.get(toKey);
        final SortedMap<K, V> sub = sm.subMap(fromKey, toKey);
        final int size = sm.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5066,sub,5065,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5068,sub,5067,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5069,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5071,sm,5070,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5072,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5074,sm.inverseBidiMap(),5073,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5076,sm,5075,sm.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5078,sm,5077,sm.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5080,sm.inverseBidiMap(),5079,sm.inverseBidiMap().containsKey(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5082,sm.inverseBidiMap(),5081,sm.inverseBidiMap().containsValue(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5084,sub,5083,sub.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5086,sub,5085,sub.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5088,sm,5087,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5090,sm,5089,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5092,sm.inverseBidiMap(),5091,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5094,sm.inverseBidiMap(),5093,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5096,sub,5095,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5098,sub,5097,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5100,sm,5099,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5102,sm,5101,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5104,sm.inverseBidiMap(),5103,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5106,sm.inverseBidiMap(),5105,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5108,sub,5107,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5110,sub,5109,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5112,sm,5111,sm.containsKey(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5114,sm,5113,sm.containsValue(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5116,sm.inverseBidiMap(),5115,sm.inverseBidiMap().containsKey(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5118,sm.inverseBidiMap(),5117,sm.inverseBidiMap().containsValue(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5120,sub,5119,sub.containsKey(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5122,sub,5121,sub.containsValue(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveBySubMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveBySubMap");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.subMap(fromKey, toKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5305,sm,5304,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5307,sub,5306,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5309,sm,5308,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5311,sub,5310,sub.containsKey(second));
        final V firstValue = sub.remove(first);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5313,sub,5312,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5314,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5316,sm,5315,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5317,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5319,sm.inverseBidiMap(),5318,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5321,sm,5320,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5323,sm,5322,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5325,sm.inverseBidiMap(),5324,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5327,sm.inverseBidiMap(),5326,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5329,sub,5328,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5331,sub,5330,sub.containsValue(firstValue));
        final V secondValue = sub.remove(second);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5333,sub,5332,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5334,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5336,sm,5335,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5337,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5339,sm.inverseBidiMap(),5338,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5341,sm,5340,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5343,sm,5342,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5345,sm.inverseBidiMap(),5344,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5347,sm.inverseBidiMap(),5346,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5349,sub,5348,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5351,sub,5350,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveBySubMap_add1628() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveBySubMap_add1628");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.subMap(fromKey, toKey);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5305,sm,5304,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5307,sub,5306,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5309,sm,5308,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5311,sub,5310,sub.containsKey(second));
        final V firstValue = sub.remove(first);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5313,sub,5312,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5314,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5316,sm,5315,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5317,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5319,sm.inverseBidiMap(),5318,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5321,sm,5320,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5323,sm,5322,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5325,sm.inverseBidiMap(),5324,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5327,sm.inverseBidiMap(),5326,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5329,sub,5328,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5331,sub,5330,sub.containsValue(firstValue));
        final V secondValue = sub.remove(second);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5333,sub,5332,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5334,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5336,sm,5335,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5337,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5339,sm.inverseBidiMap(),5338,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5341,sm,5340,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5343,sm,5342,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5345,sm.inverseBidiMap(),5344,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5347,sm.inverseBidiMap(),5346,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5349,sub,5348,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5351,sub,5350,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveBySubMapEntrySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveBySubMapEntrySet");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.subMap(fromKey, toKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5247,set,5246,set.size());
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5249,sm,5248,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5251,sub,5250,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5253,set,5252,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5255,sm,5254,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5257,sub,5256,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5259,set,5258,set.contains(secondEntry));
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5261,sub,5260,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,sm,5263,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5265,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5267,sm.inverseBidiMap(),5266,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5269,sm,5268,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5271,sm,5270,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5273,sm.inverseBidiMap(),5272,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5275,sm.inverseBidiMap(),5274,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5277,sub,5276,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5279,sub,5278,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5281,set,5280,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5283,sub,5282,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5284,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5286,sm,5285,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5287,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5289,sm.inverseBidiMap(),5288,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5291,sm,5290,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5293,sm,5292,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5295,sm.inverseBidiMap(),5294,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5297,sm.inverseBidiMap(),5296,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5299,sub,5298,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5301,sub,5300,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5303,set,5302,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveBySubMapEntrySet_add1629() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveBySubMapEntrySet_add1629");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.subMap(fromKey, toKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5247,set,5246,set.size());
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5249,sm,5248,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5251,sub,5250,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5253,set,5252,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5255,sm,5254,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5257,sub,5256,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5259,set,5258,set.contains(secondEntry));
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5261,sub,5260,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,sm,5263,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5265,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5267,sm.inverseBidiMap(),5266,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5269,sm,5268,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5271,sm,5270,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5273,sm.inverseBidiMap(),5272,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5275,sm.inverseBidiMap(),5274,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5277,sub,5276,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5279,sub,5278,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5281,set,5280,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5283,sub,5282,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5284,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5286,sm,5285,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5287,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5289,sm.inverseBidiMap(),5288,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5291,sm,5290,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5293,sm,5292,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5295,sm.inverseBidiMap(),5294,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5297,sm.inverseBidiMap(),5296,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5299,sub,5298,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5301,sub,5300,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5303,set,5302,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveBySubMapEntrySet_add1630() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveBySubMapEntrySet_add1630");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.subMap(fromKey, toKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5247,set,5246,set.size());
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5249,sm,5248,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5251,sub,5250,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5253,set,5252,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5255,sm,5254,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5257,sub,5256,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5259,set,5258,set.contains(secondEntry));
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5261,sub,5260,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,sm,5263,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5265,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5267,sm.inverseBidiMap(),5266,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5269,sm,5268,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5271,sm,5270,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5273,sm.inverseBidiMap(),5272,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5275,sm.inverseBidiMap(),5274,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5277,sub,5276,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5279,sub,5278,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5281,set,5280,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5283,sub,5282,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5284,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5286,sm,5285,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5287,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5289,sm.inverseBidiMap(),5288,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5291,sm,5290,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5293,sm,5292,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5295,sm.inverseBidiMap(),5294,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5297,sm.inverseBidiMap(),5296,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5299,sub,5298,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5301,sub,5300,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5303,set,5302,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveBySubMapEntrySet_add1631() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveBySubMapEntrySet_add1631");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.subMap(fromKey, toKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5247,set,5246,set.size());
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5249,sm,5248,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5251,sub,5250,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5253,set,5252,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5255,sm,5254,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5257,sub,5256,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5259,set,5258,set.contains(secondEntry));
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5261,sub,5260,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,sm,5263,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5265,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5267,sm.inverseBidiMap(),5266,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5269,sm,5268,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5271,sm,5270,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5273,sm.inverseBidiMap(),5272,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5275,sm.inverseBidiMap(),5274,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5277,sub,5276,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5279,sub,5278,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5281,set,5280,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5283,sub,5282,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5284,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5286,sm,5285,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5287,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5289,sm.inverseBidiMap(),5288,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5291,sm,5290,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5293,sm,5292,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5295,sm.inverseBidiMap(),5294,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5297,sm.inverseBidiMap(),5296,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5299,sub,5298,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5301,sub,5300,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5303,set,5302,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveBySubMapEntrySet_add1632() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveBySubMapEntrySet_add1632");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.subMap(fromKey, toKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5247,set,5246,set.size());
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5249,sm,5248,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5251,sub,5250,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5253,set,5252,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5255,sm,5254,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5257,sub,5256,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5259,set,5258,set.contains(secondEntry));
        set.remove(firstEntry);
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5261,sub,5260,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,sm,5263,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5265,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5267,sm.inverseBidiMap(),5266,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5269,sm,5268,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5271,sm,5270,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5273,sm.inverseBidiMap(),5272,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5275,sm.inverseBidiMap(),5274,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5277,sub,5276,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5279,sub,5278,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5281,set,5280,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5283,sub,5282,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5284,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5286,sm,5285,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5287,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5289,sm.inverseBidiMap(),5288,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5291,sm,5290,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5293,sm,5292,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5295,sm.inverseBidiMap(),5294,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5297,sm.inverseBidiMap(),5296,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5299,sub,5298,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5301,sub,5300,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5303,set,5302,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveBySubMapEntrySet_add1633() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveBySubMapEntrySet_add1633");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.subMap(fromKey, toKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5247,set,5246,set.size());
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5249,sm,5248,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5251,sub,5250,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5253,set,5252,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5255,sm,5254,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5257,sub,5256,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5259,set,5258,set.contains(secondEntry));
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5261,sub,5260,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,sm,5263,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5265,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5267,sm.inverseBidiMap(),5266,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5269,sm,5268,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5271,sm,5270,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5273,sm.inverseBidiMap(),5272,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5275,sm.inverseBidiMap(),5274,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5277,sub,5276,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5279,sub,5278,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5281,set,5280,set.contains(firstEntry));
        set.remove(secondEntry);
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5283,sub,5282,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5284,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5286,sm,5285,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5287,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5289,sm.inverseBidiMap(),5288,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5291,sm,5290,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5293,sm,5292,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5295,sm.inverseBidiMap(),5294,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5297,sm.inverseBidiMap(),5296,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5299,sub,5298,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5301,sub,5300,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5303,set,5302,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveBySubMapEntrySet_remove1236() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveBySubMapEntrySet_remove1236");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.subMap(fromKey, toKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5247,set,5246,set.size());
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5249,sm,5248,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5251,sub,5250,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5253,set,5252,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5255,sm,5254,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5257,sub,5256,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5259,set,5258,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5261,sub,5260,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,sm,5263,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5265,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5267,sm.inverseBidiMap(),5266,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5269,sm,5268,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5271,sm,5270,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5273,sm.inverseBidiMap(),5272,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5275,sm.inverseBidiMap(),5274,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5277,sub,5276,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5279,sub,5278,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5281,set,5280,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5283,sub,5282,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5284,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5286,sm,5285,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5287,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5289,sm.inverseBidiMap(),5288,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5291,sm,5290,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5293,sm,5292,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5295,sm.inverseBidiMap(),5294,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5297,sm.inverseBidiMap(),5296,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5299,sub,5298,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5301,sub,5300,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5303,set,5302,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveBySubMapEntrySet_remove1237() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveBySubMapEntrySet_remove1237");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final SortedBidiMap<K, V> sm = makeFullMap();
        final Iterator<K> it = sm.keySet().iterator();
        it.next();
        it.next();
        final K fromKey = it.next();
        final K first = it.next();
        final K second = it.next();
        final K toKey = it.next();
        final int size = sm.size();
        final SortedMap<K, V> sub = sm.subMap(fromKey, toKey);
        final Set<java.util.Map.Entry<K, V>> set = sub.entrySet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5247,set,5246,set.size());
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5249,sm,5248,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5251,sub,5250,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5253,set,5252,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5255,sm,5254,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5257,sub,5256,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5259,set,5258,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5261,sub,5260,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5262,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5264,sm,5263,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5265,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5267,sm.inverseBidiMap(),5266,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5269,sm,5268,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5271,sm,5270,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5273,sm.inverseBidiMap(),5272,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5275,sm.inverseBidiMap(),5274,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5277,sub,5276,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5279,sub,5278,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5281,set,5280,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5283,sub,5282,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5284,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5286,sm,5285,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5287,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5289,sm.inverseBidiMap(),5288,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5291,sm,5290,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5293,sm,5292,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5295,sm.inverseBidiMap(),5294,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5297,sm.inverseBidiMap(),5296,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5299,sub,5298,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5301,sub,5300,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5303,set,5302,set.contains(secondEntry));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public BulkTest bulkTestHeadMap() {
        return new AbstractSortedMapTest.TestHeadMap<K, V>(this);
    }

    public BulkTest bulkTestTailMap() {
        return new AbstractSortedMapTest.TestTailMap<K, V>(this);
    }

    public BulkTest bulkTestSubMap() {
        return new AbstractSortedMapTest.TestSubMap<K, V>(this);
    }
}

