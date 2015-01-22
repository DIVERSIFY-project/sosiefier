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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5161,head,5160,head.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5163,sm,5162,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5165,head,5164,head.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5167,sm,5166,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5169,head,5168,head.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5171,sm,5170,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5173,head,5172,head.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5175,sm,5174,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5177,head,5176,head.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5012,sub,5011,sub.size());
        sub.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5014,sub,5013,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5015,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5017,sm,5016,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5018,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5020,sm.inverseBidiMap(),5019,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5022,sm,5021,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5024,sm,5023,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5026,sm.inverseBidiMap(),5025,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5028,sm.inverseBidiMap(),5027,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5030,sub,5029,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5032,sub,5031,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5034,sm,5033,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5036,sm,5035,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5038,sm.inverseBidiMap(),5037,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,sm.inverseBidiMap(),5039,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,sub,5041,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,sub,5043,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,sm,5045,sm.containsKey(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,sm,5047,sm.containsValue(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,sm.inverseBidiMap(),5049,sm.inverseBidiMap().containsKey(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,sm.inverseBidiMap(),5051,sm.inverseBidiMap().containsValue(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,sub,5053,sub.containsKey(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,sub,5055,sub.containsValue(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5179,sub,5178,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5181,sm,5180,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5183,sub,5182,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5185,sm,5184,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5187,sub,5186,sub.containsKey(second));
        final V firstValue = sub.remove(first);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5189,sub,5188,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5190,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5192,sm,5191,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5193,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5195,sm.inverseBidiMap(),5194,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5197,sm,5196,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5199,sm,5198,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5201,sm.inverseBidiMap(),5200,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5203,sm.inverseBidiMap(),5202,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5205,sub,5204,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5207,sub,5206,sub.containsValue(firstValue));
        final V secondValue = sub.remove(second);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5209,sub,5208,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5210,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5212,sm,5211,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5213,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5215,sm.inverseBidiMap(),5214,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5217,sm,5216,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5219,sm,5218,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5221,sm.inverseBidiMap(),5220,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5223,sm.inverseBidiMap(),5222,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5225,sub,5224,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5227,sub,5226,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5229,sub,5228,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5231,set,5230,set.size());
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5233,sm,5232,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5235,sub,5234,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5237,set,5236,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5239,sm,5238,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5241,sub,5240,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5243,set,5242,set.contains(secondEntry));
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5245,sub,5244,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5246,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5248,sm,5247,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5249,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5251,sm.inverseBidiMap(),5250,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5253,sm,5252,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5255,sm,5254,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5257,sm.inverseBidiMap(),5256,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5259,sm.inverseBidiMap(),5258,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5261,sub,5260,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5263,sub,5262,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5265,set,5264,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5267,sub,5266,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5268,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5270,sm,5269,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5271,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5273,sm.inverseBidiMap(),5272,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5275,sm,5274,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5277,sm,5276,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5279,sm.inverseBidiMap(),5278,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5281,sm.inverseBidiMap(),5280,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5283,sub,5282,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5285,sub,5284,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5287,set,5286,set.contains(secondEntry));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5536,((sm.size()) - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5538,sub,5537,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5540,sm,5539,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5542,sub,5541,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5544,sm,5543,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5546,sub,5545,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5548,sm,5547,sm.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5550,sub,5549,sub.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5552,sm,5551,sm.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5554,sub,5553,sub.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5556,sm,5555,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5558,sub,5557,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5560,sm,5559,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5562,sub,5561,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiClearByTailMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClearByTailMap");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5115,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5117,sub,5116,sub.size());
        sub.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5119,sub,5118,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5121,sm,5120,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5123,sm.inverseBidiMap(),5122,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5125,sm,5124,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5127,sm,5126,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5129,sm.inverseBidiMap(),5128,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5131,sm.inverseBidiMap(),5130,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5133,sub,5132,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5135,sub,5134,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5137,sm,5136,sm.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5139,sm,5138,sm.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5141,sm.inverseBidiMap(),5140,sm.inverseBidiMap().containsKey(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5143,sm.inverseBidiMap(),5142,sm.inverseBidiMap().containsValue(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5145,sub,5144,sub.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5147,sub,5146,sub.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5149,sm,5148,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5151,sm,5150,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5153,sm.inverseBidiMap(),5152,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5155,sm.inverseBidiMap(),5154,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5157,sub,5156,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5159,sub,5158,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveByTailMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByTailMap");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5395,sm,5394,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5397,sub,5396,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5399,sm,5398,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5401,sub,5400,sub.containsKey(second));
        final Object firstValue = sub.remove(first);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5402,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5404,sub,5403,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5405,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5407,sm,5406,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5408,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5410,sm.inverseBidiMap(),5409,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5412,sm,5411,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5414,sm,5413,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5416,sm.inverseBidiMap(),5415,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5418,sm.inverseBidiMap(),5417,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5420,sub,5419,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5422,sub,5421,sub.containsValue(firstValue));
        final Object secondValue = sub.remove(second);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5423,(size - 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5425,sub,5424,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5426,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5428,sm,5427,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5429,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5431,sm.inverseBidiMap(),5430,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5433,sm,5432,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5435,sm,5434,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5437,sm.inverseBidiMap(),5436,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5439,sm.inverseBidiMap(),5438,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5441,sub,5440,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5443,sub,5442,sub.containsValue(secondValue));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5445,sm,5444,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5447,sub,5446,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5449,set,5448,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5451,sm,5450,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5453,sub,5452,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5455,set,5454,set.contains(secondEntry));
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5456,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5458,sub,5457,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5459,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5461,sm,5460,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5462,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5464,sm.inverseBidiMap(),5463,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5466,sm,5465,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5468,sm,5467,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5470,sm.inverseBidiMap(),5469,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5472,sm.inverseBidiMap(),5471,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5474,sub,5473,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5476,sub,5475,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5478,set,5477,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5479,(size - 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5481,sub,5480,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5482,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5484,sm,5483,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5485,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5487,sm.inverseBidiMap(),5486,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5489,sm,5488,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5491,sm,5490,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5493,sm.inverseBidiMap(),5492,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5495,sm.inverseBidiMap(),5494,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5497,sub,5496,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5499,sub,5498,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5501,set,5500,set.contains(secondEntry));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5503,sub,5502,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5505,sm,5504,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5507,sub,5506,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5509,sm,5508,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5511,sub,5510,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5513,sm,5512,sm.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5515,sub,5514,sub.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5517,sm,5516,sm.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5519,sub,5518,sub.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5521,sm,5520,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5523,sub,5522,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5525,sm,5524,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5527,sub,5526,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5529,sm,5528,sm.containsKey(third));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5531,sub,5530,sub.containsKey(third));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5533,sm,5532,sm.containsValue(thirdValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5535,sub,5534,sub.containsValue(thirdValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiClearBySubMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClearBySubMap");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,sub,5057,sub.size());
        sub.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5060,sub,5059,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5061,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5063,sm,5062,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5064,(size - 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5066,sm.inverseBidiMap(),5065,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5068,sm,5067,sm.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5070,sm,5069,sm.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5072,sm.inverseBidiMap(),5071,sm.inverseBidiMap().containsKey(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5074,sm.inverseBidiMap(),5073,sm.inverseBidiMap().containsValue(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5076,sub,5075,sub.containsKey(fromKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5078,sub,5077,sub.containsValue(fromKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5080,sm,5079,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5082,sm,5081,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5084,sm.inverseBidiMap(),5083,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5086,sm.inverseBidiMap(),5085,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5088,sub,5087,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5090,sub,5089,sub.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5092,sm,5091,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5094,sm,5093,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5096,sm.inverseBidiMap(),5095,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5098,sm.inverseBidiMap(),5097,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5100,sub,5099,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5102,sub,5101,sub.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5104,sm,5103,sm.containsKey(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5106,sm,5105,sm.containsValue(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5108,sm.inverseBidiMap(),5107,sm.inverseBidiMap().containsKey(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5110,sm.inverseBidiMap(),5109,sm.inverseBidiMap().containsValue(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5112,sub,5111,sub.containsKey(toKey));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5114,sub,5113,sub.containsValue(toKeyValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveBySubMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveBySubMap");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5289,sm,5288,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5291,sub,5290,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5293,sm,5292,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5295,sub,5294,sub.containsKey(second));
        final V firstValue = sub.remove(first);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5297,sub,5296,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5298,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5300,sm,5299,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5301,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5303,sm.inverseBidiMap(),5302,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5305,sm,5304,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5307,sm,5306,sm.containsValue(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5309,sm.inverseBidiMap(),5308,sm.inverseBidiMap().containsKey(firstValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5311,sm.inverseBidiMap(),5310,sm.inverseBidiMap().containsValue(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5313,sub,5312,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5315,sub,5314,sub.containsValue(firstValue));
        final V secondValue = sub.remove(second);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5317,sub,5316,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5318,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5320,sm,5319,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5321,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5323,sm.inverseBidiMap(),5322,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5325,sm,5324,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5327,sm,5326,sm.containsValue(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5329,sm.inverseBidiMap(),5328,sm.inverseBidiMap().containsKey(secondValue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5331,sm.inverseBidiMap(),5330,sm.inverseBidiMap().containsValue(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5333,sub,5332,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5335,sub,5334,sub.containsValue(secondValue));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5337,set,5336,set.size());
        final Iterator<java.util.Map.Entry<K, V>> it2 = set.iterator();
        it2.next();
        final Map.Entry<K, V> firstEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        final Map.Entry<K, V> secondEntry = org.apache.commons.collections4.map.AbstractMapTest.cloneMapEntry(it2.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5339,sm,5338,sm.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5341,sub,5340,sub.containsKey(first));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5343,set,5342,set.contains(firstEntry));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5345,sm,5344,sm.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5347,sub,5346,sub.containsKey(second));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5349,set,5348,set.contains(secondEntry));
        set.remove(firstEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5351,sub,5350,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5352,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5354,sm,5353,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5355,(size - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5357,sm.inverseBidiMap(),5356,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5359,sm,5358,sm.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5361,sm,5360,sm.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5363,sm.inverseBidiMap(),5362,sm.inverseBidiMap().containsKey(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5365,sm.inverseBidiMap(),5364,sm.inverseBidiMap().containsValue(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5367,sub,5366,sub.containsKey(firstEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5369,sub,5368,sub.containsValue(firstEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5371,set,5370,set.contains(firstEntry));
        set.remove(secondEntry);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5373,sub,5372,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5374,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5376,sm,5375,sm.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5377,(size - 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5379,sm.inverseBidiMap(),5378,sm.inverseBidiMap().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5381,sm,5380,sm.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5383,sm,5382,sm.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5385,sm.inverseBidiMap(),5384,sm.inverseBidiMap().containsKey(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5387,sm.inverseBidiMap(),5386,sm.inverseBidiMap().containsValue(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5389,sub,5388,sub.containsKey(secondEntry.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5391,sub,5390,sub.containsValue(secondEntry.getValue()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5393,set,5392,set.contains(secondEntry));
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

