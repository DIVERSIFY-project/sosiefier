package org.apache.commons.collections4;

import java.util.ArrayList;
import org.junit.Before;
import org.apache.commons.collections4.queue.CircularFifoQueue;
import java.util.Collection;
import java.util.Enumeration;
import org.apache.commons.collections4.bag.HashBag;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import org.junit.Test;
import java.util.TreeMap;
import java.util.Vector;

/** 
 * Tests for CollectionUtils.
 * 
 * @version $Id$
 */
@SuppressWarnings(value = "boxing")
public class CollectionUtilsTest extends MockTestCase {
    /** 
     * Collection of {@link Integer}s
     */
private List<java.lang.Integer> collectionA = null;

    /** 
     * Collection of {@link Long}s
     */
private List<java.lang.Long> collectionB = null;

    /** 
     * Collection of {@link Integer}s that are equivalent to the Longs in
     * collectionB.
     */
private Collection<java.lang.Integer> collectionC = null;

    /** 
     * Sorted Collection of {@link Integer}s
     */
private Collection<java.lang.Integer> collectionD = null;

    /** 
     * Sorted Collection of {@link Integer}s
     */
private Collection<java.lang.Integer> collectionE = null;

    /** 
     * Collection of {@link Integer}s, bound as {@link Number}s
     */
private Collection<java.lang.Number> collectionA2 = null;

    /** 
     * Collection of {@link Long}s, bound as {@link Number}s
     */
private Collection<java.lang.Number> collectionB2 = null;

    /** 
     * Collection of {@link Integer}s (cast as {@link Number}s) that are
     * equivalent to the Longs in collectionB.
     */
private Collection<java.lang.Number> collectionC2 = null;

    private Iterable<java.lang.Integer> iterableA = null;

    private Iterable<java.lang.Long> iterableB = null;

    private Iterable<java.lang.Integer> iterableC = null;

    private Iterable<java.lang.Number> iterableA2 = null;

    private Iterable<java.lang.Number> iterableB2 = null;

    private Collection<java.lang.Integer> emptyCollection = new ArrayList<java.lang.Integer>(1);

    @Before
    public void setUp() {
        collectionA = new ArrayList<java.lang.Integer>();
        collectionA.add(1);
        collectionA.add(2);
        collectionA.add(2);
        collectionA.add(3);
        collectionA.add(3);
        collectionA.add(3);
        collectionA.add(4);
        collectionA.add(4);
        collectionA.add(4);
        collectionA.add(4);
        collectionB = new LinkedList<java.lang.Long>();
        collectionB.add(5L);
        collectionB.add(4L);
        collectionB.add(4L);
        collectionB.add(3L);
        collectionB.add(3L);
        collectionB.add(3L);
        collectionB.add(2L);
        collectionB.add(2L);
        collectionB.add(2L);
        collectionB.add(2L);
        collectionC = new ArrayList<java.lang.Integer>();
        for (final Long l : collectionB) {
            collectionC.add(l.intValue());
        }
        iterableA = collectionA;
        iterableB = collectionB;
        iterableC = collectionC;
        collectionA2 = new ArrayList<java.lang.Number>(collectionA);
        collectionB2 = new LinkedList<java.lang.Number>(collectionB);
        collectionC2 = new LinkedList<java.lang.Number>(collectionC);
        iterableA2 = collectionA2;
        iterableB2 = collectionB2;
        collectionD = new ArrayList<java.lang.Integer>();
        collectionD.add(1);
        collectionD.add(3);
        collectionD.add(3);
        collectionD.add(3);
        collectionD.add(5);
        collectionD.add(7);
        collectionD.add(7);
        collectionD.add(10);
        collectionE = new ArrayList<java.lang.Integer>();
        collectionE.add(2);
        collectionE.add(4);
        collectionE.add(4);
        collectionE.add(5);
        collectionE.add(6);
        collectionE.add(6);
        collectionE.add(9);
    }

    @Test
    public void getCardinalityMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getCardinalityMap");
        final Map<java.lang.Number, java.lang.Integer> freqA = org.apache.commons.collections4.CollectionUtils.<Number>getCardinalityMap(iterableA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6890,freqA,6889,((int)(freqA.get(1))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6892,freqA,6891,((int)(freqA.get(2))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6894,freqA,6893,((int)(freqA.get(3))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6896,freqA,6895,((int)(freqA.get(4))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6898,freqA,6897,freqA.get(5));
        final Map<java.lang.Long, java.lang.Integer> freqB = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(iterableB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6900,freqB,6899,freqB.get(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6902,freqB,6901,((int)(freqB.get(2L))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6904,freqB,6903,((int)(freqB.get(3L))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6906,freqB,6905,((int)(freqB.get(4L))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6908,freqB,6907,((int)(freqB.get(5L))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void cardinality() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "cardinality");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6652,null,6651,org.apache.commons.collections4.CollectionUtils.cardinality(1, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6654,null,6653,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6656,null,6655,org.apache.commons.collections4.CollectionUtils.cardinality(3, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6658,null,6657,org.apache.commons.collections4.CollectionUtils.cardinality(4, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6660,null,6659,org.apache.commons.collections4.CollectionUtils.cardinality(5, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6662,null,6661,org.apache.commons.collections4.CollectionUtils.cardinality(1L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6664,null,6663,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6666,null,6665,org.apache.commons.collections4.CollectionUtils.cardinality(3L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6668,null,6667,org.apache.commons.collections4.CollectionUtils.cardinality(4L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6670,null,6669,org.apache.commons.collections4.CollectionUtils.cardinality(5L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6672,null,6671,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableA2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6674,null,6673,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableB2));
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("foo");
        set.add("C");
        set.add("E");
        set.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6676,null,6675,org.apache.commons.collections4.CollectionUtils.cardinality("A", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6678,null,6677,org.apache.commons.collections4.CollectionUtils.cardinality("B", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6680,null,6679,org.apache.commons.collections4.CollectionUtils.cardinality("C", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6682,null,6681,org.apache.commons.collections4.CollectionUtils.cardinality("D", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6684,null,6683,org.apache.commons.collections4.CollectionUtils.cardinality("E", set));
        final Bag<java.lang.String> bag = new HashBag<java.lang.String>();
        bag.add("A", 3);
        bag.add("C");
        bag.add("E");
        bag.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6686,null,6685,org.apache.commons.collections4.CollectionUtils.cardinality("A", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6688,null,6687,org.apache.commons.collections4.CollectionUtils.cardinality("B", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6690,null,6689,org.apache.commons.collections4.CollectionUtils.cardinality("C", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6692,null,6691,org.apache.commons.collections4.CollectionUtils.cardinality("D", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6694,null,6693,org.apache.commons.collections4.CollectionUtils.cardinality("E", bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void cardinality_literalMutation2078() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "cardinality_literalMutation2078");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6652,null,6651,org.apache.commons.collections4.CollectionUtils.cardinality(1, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6654,null,6653,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6656,null,6655,org.apache.commons.collections4.CollectionUtils.cardinality(3, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6658,null,6657,org.apache.commons.collections4.CollectionUtils.cardinality(4, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6660,null,6659,org.apache.commons.collections4.CollectionUtils.cardinality(5, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6662,null,6661,org.apache.commons.collections4.CollectionUtils.cardinality(1L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6664,null,6663,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6666,null,6665,org.apache.commons.collections4.CollectionUtils.cardinality(3L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6668,null,6667,org.apache.commons.collections4.CollectionUtils.cardinality(4L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6670,null,6669,org.apache.commons.collections4.CollectionUtils.cardinality(5L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6672,null,6671,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableA2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6674,null,6673,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableB2));
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("A");
        set.add("foo");
        set.add("E");
        set.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6676,null,6675,org.apache.commons.collections4.CollectionUtils.cardinality("A", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6678,null,6677,org.apache.commons.collections4.CollectionUtils.cardinality("B", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6680,null,6679,org.apache.commons.collections4.CollectionUtils.cardinality("C", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6682,null,6681,org.apache.commons.collections4.CollectionUtils.cardinality("D", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6684,null,6683,org.apache.commons.collections4.CollectionUtils.cardinality("E", set));
        final Bag<java.lang.String> bag = new HashBag<java.lang.String>();
        bag.add("A", 3);
        bag.add("C");
        bag.add("E");
        bag.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6686,null,6685,org.apache.commons.collections4.CollectionUtils.cardinality("A", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6688,null,6687,org.apache.commons.collections4.CollectionUtils.cardinality("B", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6690,null,6689,org.apache.commons.collections4.CollectionUtils.cardinality("C", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6692,null,6691,org.apache.commons.collections4.CollectionUtils.cardinality("D", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6694,null,6693,org.apache.commons.collections4.CollectionUtils.cardinality("E", bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void cardinality_literalMutation2079() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "cardinality_literalMutation2079");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6652,null,6651,org.apache.commons.collections4.CollectionUtils.cardinality(1, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6654,null,6653,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6656,null,6655,org.apache.commons.collections4.CollectionUtils.cardinality(3, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6658,null,6657,org.apache.commons.collections4.CollectionUtils.cardinality(4, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6660,null,6659,org.apache.commons.collections4.CollectionUtils.cardinality(5, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6662,null,6661,org.apache.commons.collections4.CollectionUtils.cardinality(1L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6664,null,6663,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6666,null,6665,org.apache.commons.collections4.CollectionUtils.cardinality(3L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6668,null,6667,org.apache.commons.collections4.CollectionUtils.cardinality(4L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6670,null,6669,org.apache.commons.collections4.CollectionUtils.cardinality(5L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6672,null,6671,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableA2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6674,null,6673,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableB2));
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("A");
        set.add("C");
        set.add("foo");
        set.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6676,null,6675,org.apache.commons.collections4.CollectionUtils.cardinality("A", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6678,null,6677,org.apache.commons.collections4.CollectionUtils.cardinality("B", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6680,null,6679,org.apache.commons.collections4.CollectionUtils.cardinality("C", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6682,null,6681,org.apache.commons.collections4.CollectionUtils.cardinality("D", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6684,null,6683,org.apache.commons.collections4.CollectionUtils.cardinality("E", set));
        final Bag<java.lang.String> bag = new HashBag<java.lang.String>();
        bag.add("A", 3);
        bag.add("C");
        bag.add("E");
        bag.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6686,null,6685,org.apache.commons.collections4.CollectionUtils.cardinality("A", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6688,null,6687,org.apache.commons.collections4.CollectionUtils.cardinality("B", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6690,null,6689,org.apache.commons.collections4.CollectionUtils.cardinality("C", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6692,null,6691,org.apache.commons.collections4.CollectionUtils.cardinality("D", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6694,null,6693,org.apache.commons.collections4.CollectionUtils.cardinality("E", bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void cardinality_literalMutation2080() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "cardinality_literalMutation2080");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6652,null,6651,org.apache.commons.collections4.CollectionUtils.cardinality(1, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6654,null,6653,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6656,null,6655,org.apache.commons.collections4.CollectionUtils.cardinality(3, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6658,null,6657,org.apache.commons.collections4.CollectionUtils.cardinality(4, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6660,null,6659,org.apache.commons.collections4.CollectionUtils.cardinality(5, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6662,null,6661,org.apache.commons.collections4.CollectionUtils.cardinality(1L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6664,null,6663,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6666,null,6665,org.apache.commons.collections4.CollectionUtils.cardinality(3L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6668,null,6667,org.apache.commons.collections4.CollectionUtils.cardinality(4L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6670,null,6669,org.apache.commons.collections4.CollectionUtils.cardinality(5L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6672,null,6671,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableA2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6674,null,6673,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableB2));
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("A");
        set.add("C");
        set.add("E");
        set.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6676,null,6675,org.apache.commons.collections4.CollectionUtils.cardinality("A", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6678,null,6677,org.apache.commons.collections4.CollectionUtils.cardinality("B", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6680,null,6679,org.apache.commons.collections4.CollectionUtils.cardinality("C", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6682,null,6681,org.apache.commons.collections4.CollectionUtils.cardinality("D", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6684,null,6683,org.apache.commons.collections4.CollectionUtils.cardinality("E", set));
        final Bag<java.lang.String> bag = new HashBag<java.lang.String>();
        bag.add("A", 3);
        bag.add("C");
        bag.add("E");
        bag.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6686,null,6685,org.apache.commons.collections4.CollectionUtils.cardinality("A", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6688,null,6687,org.apache.commons.collections4.CollectionUtils.cardinality("B", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6690,null,6689,org.apache.commons.collections4.CollectionUtils.cardinality("C", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6692,null,6691,org.apache.commons.collections4.CollectionUtils.cardinality("D", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6694,null,6693,org.apache.commons.collections4.CollectionUtils.cardinality("E", bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void cardinality_literalMutation2081() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "cardinality_literalMutation2081");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6652,null,6651,org.apache.commons.collections4.CollectionUtils.cardinality(1, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6654,null,6653,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6656,null,6655,org.apache.commons.collections4.CollectionUtils.cardinality(3, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6658,null,6657,org.apache.commons.collections4.CollectionUtils.cardinality(4, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6660,null,6659,org.apache.commons.collections4.CollectionUtils.cardinality(5, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6662,null,6661,org.apache.commons.collections4.CollectionUtils.cardinality(1L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6664,null,6663,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6666,null,6665,org.apache.commons.collections4.CollectionUtils.cardinality(3L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6668,null,6667,org.apache.commons.collections4.CollectionUtils.cardinality(4L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6670,null,6669,org.apache.commons.collections4.CollectionUtils.cardinality(5L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6672,null,6671,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableA2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6674,null,6673,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableB2));
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("A");
        set.add("C");
        set.add("E");
        set.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6676,null,6675,org.apache.commons.collections4.CollectionUtils.cardinality("A", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6678,null,6677,org.apache.commons.collections4.CollectionUtils.cardinality("B", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6680,null,6679,org.apache.commons.collections4.CollectionUtils.cardinality("C", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6682,null,6681,org.apache.commons.collections4.CollectionUtils.cardinality("D", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6684,null,6683,org.apache.commons.collections4.CollectionUtils.cardinality("E", set));
        final Bag<java.lang.String> bag = new HashBag<java.lang.String>();
        bag.add("foo", 3);
        bag.add("C");
        bag.add("E");
        bag.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6686,null,6685,org.apache.commons.collections4.CollectionUtils.cardinality("A", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6688,null,6687,org.apache.commons.collections4.CollectionUtils.cardinality("B", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6690,null,6689,org.apache.commons.collections4.CollectionUtils.cardinality("C", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6692,null,6691,org.apache.commons.collections4.CollectionUtils.cardinality("D", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6694,null,6693,org.apache.commons.collections4.CollectionUtils.cardinality("E", bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void cardinality_literalMutation2082() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "cardinality_literalMutation2082");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6652,null,6651,org.apache.commons.collections4.CollectionUtils.cardinality(1, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6654,null,6653,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6656,null,6655,org.apache.commons.collections4.CollectionUtils.cardinality(3, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6658,null,6657,org.apache.commons.collections4.CollectionUtils.cardinality(4, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6660,null,6659,org.apache.commons.collections4.CollectionUtils.cardinality(5, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6662,null,6661,org.apache.commons.collections4.CollectionUtils.cardinality(1L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6664,null,6663,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6666,null,6665,org.apache.commons.collections4.CollectionUtils.cardinality(3L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6668,null,6667,org.apache.commons.collections4.CollectionUtils.cardinality(4L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6670,null,6669,org.apache.commons.collections4.CollectionUtils.cardinality(5L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6672,null,6671,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableA2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6674,null,6673,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableB2));
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("A");
        set.add("C");
        set.add("E");
        set.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6676,null,6675,org.apache.commons.collections4.CollectionUtils.cardinality("A", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6678,null,6677,org.apache.commons.collections4.CollectionUtils.cardinality("B", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6680,null,6679,org.apache.commons.collections4.CollectionUtils.cardinality("C", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6682,null,6681,org.apache.commons.collections4.CollectionUtils.cardinality("D", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6684,null,6683,org.apache.commons.collections4.CollectionUtils.cardinality("E", set));
        final Bag<java.lang.String> bag = new HashBag<java.lang.String>();
        bag.add("A", 4);
        bag.add("C");
        bag.add("E");
        bag.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6686,null,6685,org.apache.commons.collections4.CollectionUtils.cardinality("A", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6688,null,6687,org.apache.commons.collections4.CollectionUtils.cardinality("B", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6690,null,6689,org.apache.commons.collections4.CollectionUtils.cardinality("C", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6692,null,6691,org.apache.commons.collections4.CollectionUtils.cardinality("D", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6694,null,6693,org.apache.commons.collections4.CollectionUtils.cardinality("E", bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void cardinality_literalMutation2083() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "cardinality_literalMutation2083");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6652,null,6651,org.apache.commons.collections4.CollectionUtils.cardinality(1, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6654,null,6653,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6656,null,6655,org.apache.commons.collections4.CollectionUtils.cardinality(3, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6658,null,6657,org.apache.commons.collections4.CollectionUtils.cardinality(4, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6660,null,6659,org.apache.commons.collections4.CollectionUtils.cardinality(5, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6662,null,6661,org.apache.commons.collections4.CollectionUtils.cardinality(1L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6664,null,6663,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6666,null,6665,org.apache.commons.collections4.CollectionUtils.cardinality(3L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6668,null,6667,org.apache.commons.collections4.CollectionUtils.cardinality(4L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6670,null,6669,org.apache.commons.collections4.CollectionUtils.cardinality(5L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6672,null,6671,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableA2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6674,null,6673,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableB2));
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("A");
        set.add("C");
        set.add("E");
        set.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6676,null,6675,org.apache.commons.collections4.CollectionUtils.cardinality("A", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6678,null,6677,org.apache.commons.collections4.CollectionUtils.cardinality("B", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6680,null,6679,org.apache.commons.collections4.CollectionUtils.cardinality("C", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6682,null,6681,org.apache.commons.collections4.CollectionUtils.cardinality("D", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6684,null,6683,org.apache.commons.collections4.CollectionUtils.cardinality("E", set));
        final Bag<java.lang.String> bag = new HashBag<java.lang.String>();
        bag.add("A", 3);
        bag.add("foo");
        bag.add("E");
        bag.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6686,null,6685,org.apache.commons.collections4.CollectionUtils.cardinality("A", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6688,null,6687,org.apache.commons.collections4.CollectionUtils.cardinality("B", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6690,null,6689,org.apache.commons.collections4.CollectionUtils.cardinality("C", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6692,null,6691,org.apache.commons.collections4.CollectionUtils.cardinality("D", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6694,null,6693,org.apache.commons.collections4.CollectionUtils.cardinality("E", bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void cardinality_literalMutation2084() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "cardinality_literalMutation2084");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6652,null,6651,org.apache.commons.collections4.CollectionUtils.cardinality(1, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6654,null,6653,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6656,null,6655,org.apache.commons.collections4.CollectionUtils.cardinality(3, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6658,null,6657,org.apache.commons.collections4.CollectionUtils.cardinality(4, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6660,null,6659,org.apache.commons.collections4.CollectionUtils.cardinality(5, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6662,null,6661,org.apache.commons.collections4.CollectionUtils.cardinality(1L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6664,null,6663,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6666,null,6665,org.apache.commons.collections4.CollectionUtils.cardinality(3L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6668,null,6667,org.apache.commons.collections4.CollectionUtils.cardinality(4L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6670,null,6669,org.apache.commons.collections4.CollectionUtils.cardinality(5L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6672,null,6671,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableA2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6674,null,6673,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableB2));
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("A");
        set.add("C");
        set.add("E");
        set.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6676,null,6675,org.apache.commons.collections4.CollectionUtils.cardinality("A", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6678,null,6677,org.apache.commons.collections4.CollectionUtils.cardinality("B", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6680,null,6679,org.apache.commons.collections4.CollectionUtils.cardinality("C", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6682,null,6681,org.apache.commons.collections4.CollectionUtils.cardinality("D", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6684,null,6683,org.apache.commons.collections4.CollectionUtils.cardinality("E", set));
        final Bag<java.lang.String> bag = new HashBag<java.lang.String>();
        bag.add("A", 3);
        bag.add("C");
        bag.add("foo");
        bag.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6686,null,6685,org.apache.commons.collections4.CollectionUtils.cardinality("A", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6688,null,6687,org.apache.commons.collections4.CollectionUtils.cardinality("B", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6690,null,6689,org.apache.commons.collections4.CollectionUtils.cardinality("C", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6692,null,6691,org.apache.commons.collections4.CollectionUtils.cardinality("D", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6694,null,6693,org.apache.commons.collections4.CollectionUtils.cardinality("E", bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void cardinality_literalMutation2085() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "cardinality_literalMutation2085");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6652,null,6651,org.apache.commons.collections4.CollectionUtils.cardinality(1, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6654,null,6653,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6656,null,6655,org.apache.commons.collections4.CollectionUtils.cardinality(3, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6658,null,6657,org.apache.commons.collections4.CollectionUtils.cardinality(4, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6660,null,6659,org.apache.commons.collections4.CollectionUtils.cardinality(5, iterableA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6662,null,6661,org.apache.commons.collections4.CollectionUtils.cardinality(1L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6664,null,6663,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6666,null,6665,org.apache.commons.collections4.CollectionUtils.cardinality(3L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6668,null,6667,org.apache.commons.collections4.CollectionUtils.cardinality(4L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6670,null,6669,org.apache.commons.collections4.CollectionUtils.cardinality(5L, iterableB));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6672,null,6671,org.apache.commons.collections4.CollectionUtils.cardinality(2L, iterableA2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6674,null,6673,org.apache.commons.collections4.CollectionUtils.cardinality(2, iterableB2));
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("A");
        set.add("C");
        set.add("E");
        set.add("E");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6676,null,6675,org.apache.commons.collections4.CollectionUtils.cardinality("A", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6678,null,6677,org.apache.commons.collections4.CollectionUtils.cardinality("B", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6680,null,6679,org.apache.commons.collections4.CollectionUtils.cardinality("C", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6682,null,6681,org.apache.commons.collections4.CollectionUtils.cardinality("D", set));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6684,null,6683,org.apache.commons.collections4.CollectionUtils.cardinality("E", set));
        final Bag<java.lang.String> bag = new HashBag<java.lang.String>();
        bag.add("A", 3);
        bag.add("C");
        bag.add("E");
        bag.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6686,null,6685,org.apache.commons.collections4.CollectionUtils.cardinality("A", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6688,null,6687,org.apache.commons.collections4.CollectionUtils.cardinality("B", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6690,null,6689,org.apache.commons.collections4.CollectionUtils.cardinality("C", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6692,null,6691,org.apache.commons.collections4.CollectionUtils.cardinality("D", bag));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6694,null,6693,org.apache.commons.collections4.CollectionUtils.cardinality("E", bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void cardinalityOfNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "cardinalityOfNull");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6614,null,6613,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6616,freq,6615,freq.get(null));
        }
        list.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6618,null,6617,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6620,freq,6619,freq.get(null));
        }
        list.add(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6622,null,6621,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6624,null,6623,java.lang.Integer.valueOf(1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6626,freq,6625,freq.get(null));
        }
        list.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6628,null,6627,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6630,null,6629,java.lang.Integer.valueOf(1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6632,freq,6631,freq.get(null));
        }
        list.add(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6634,null,6633,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6636,null,6635,java.lang.Integer.valueOf(2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6638,freq,6637,freq.get(null));
        }
        list.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6640,null,6639,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6642,null,6641,java.lang.Integer.valueOf(2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6644,freq,6643,freq.get(null));
        }
        list.add(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6646,null,6645,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6648,null,6647,java.lang.Integer.valueOf(3));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6650,freq,6649,freq.get(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void cardinalityOfNull_literalMutation2088() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "cardinalityOfNull_literalMutation2088");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6614,null,6613,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6616,freq,6615,freq.get(null));
        }
        list.add("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6618,null,6617,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6620,freq,6619,freq.get(null));
        }
        list.add(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6622,null,6621,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6624,null,6623,java.lang.Integer.valueOf(1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6626,freq,6625,freq.get(null));
        }
        list.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6628,null,6627,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6630,null,6629,java.lang.Integer.valueOf(1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6632,freq,6631,freq.get(null));
        }
        list.add(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6634,null,6633,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6636,null,6635,java.lang.Integer.valueOf(2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6638,freq,6637,freq.get(null));
        }
        list.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6640,null,6639,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6642,null,6641,java.lang.Integer.valueOf(2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6644,freq,6643,freq.get(null));
        }
        list.add(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6646,null,6645,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6648,null,6647,java.lang.Integer.valueOf(3));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6650,freq,6649,freq.get(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void cardinalityOfNull_literalMutation2090() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "cardinalityOfNull_literalMutation2090");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6614,null,6613,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6616,freq,6615,freq.get(null));
        }
        list.add("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6618,null,6617,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6620,freq,6619,freq.get(null));
        }
        list.add(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6622,null,6621,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6624,null,6623,java.lang.Integer.valueOf(1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6626,freq,6625,freq.get(null));
        }
        list.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6628,null,6627,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6630,null,6629,java.lang.Integer.valueOf(1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6632,freq,6631,freq.get(null));
        }
        list.add(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6634,null,6633,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6636,null,6635,java.lang.Integer.valueOf(2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6638,freq,6637,freq.get(null));
        }
        list.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6640,null,6639,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6642,null,6641,java.lang.Integer.valueOf(2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6644,freq,6643,freq.get(null));
        }
        list.add(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6646,null,6645,org.apache.commons.collections4.CollectionUtils.cardinality(null, list));
        {
            final Map<java.lang.String, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6648,null,6647,java.lang.Integer.valueOf(3));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6650,freq,6649,freq.get(null));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAll");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(-1);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        final Collection<java.lang.String> multiples = new ArrayList<java.lang.String>(3);
        multiples.add("1");
        multiples.add("3");
        multiples.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6703,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6705,null,6704,org.apache.commons.collections4.CollectionUtils.containsAll(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6706,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6708,null,6707,org.apache.commons.collections4.CollectionUtils.containsAll(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6710,null,6709,org.apache.commons.collections4.CollectionUtils.containsAll(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6712,null,6711,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6713,!(org.apache.commons.collections4.CollectionUtils.containsAll(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6714,!(org.apache.commons.collections4.CollectionUtils.containsAll(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6715,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6716,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6718,null,6717,org.apache.commons.collections4.CollectionUtils.containsAll(odds, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6719,!(org.apache.commons.collections4.CollectionUtils.containsAll(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6721,null,6720,org.apache.commons.collections4.CollectionUtils.containsAll(empty, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6723,null,6722,org.apache.commons.collections4.CollectionUtils.containsAll(odds, multiples));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6725,null,6724,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAll_literalMutation2101() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAll_literalMutation2101");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(2);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        final Collection<java.lang.String> multiples = new ArrayList<java.lang.String>(3);
        multiples.add("1");
        multiples.add("3");
        multiples.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6703,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6705,null,6704,org.apache.commons.collections4.CollectionUtils.containsAll(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6706,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6708,null,6707,org.apache.commons.collections4.CollectionUtils.containsAll(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6710,null,6709,org.apache.commons.collections4.CollectionUtils.containsAll(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6712,null,6711,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6713,!(org.apache.commons.collections4.CollectionUtils.containsAll(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6714,!(org.apache.commons.collections4.CollectionUtils.containsAll(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6715,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6716,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6718,null,6717,org.apache.commons.collections4.CollectionUtils.containsAll(odds, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6719,!(org.apache.commons.collections4.CollectionUtils.containsAll(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6721,null,6720,org.apache.commons.collections4.CollectionUtils.containsAll(empty, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6723,null,6722,org.apache.commons.collections4.CollectionUtils.containsAll(odds, multiples));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6725,null,6724,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAll_literalMutation2102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAll_literalMutation2102");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("foo");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        final Collection<java.lang.String> multiples = new ArrayList<java.lang.String>(3);
        multiples.add("1");
        multiples.add("3");
        multiples.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6703,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6705,null,6704,org.apache.commons.collections4.CollectionUtils.containsAll(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6706,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6708,null,6707,org.apache.commons.collections4.CollectionUtils.containsAll(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6710,null,6709,org.apache.commons.collections4.CollectionUtils.containsAll(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6712,null,6711,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6713,!(org.apache.commons.collections4.CollectionUtils.containsAll(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6714,!(org.apache.commons.collections4.CollectionUtils.containsAll(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6715,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6716,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6718,null,6717,org.apache.commons.collections4.CollectionUtils.containsAll(odds, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6719,!(org.apache.commons.collections4.CollectionUtils.containsAll(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6721,null,6720,org.apache.commons.collections4.CollectionUtils.containsAll(empty, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6723,null,6722,org.apache.commons.collections4.CollectionUtils.containsAll(odds, multiples));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6725,null,6724,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAll_literalMutation2103() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAll_literalMutation2103");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(0);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        final Collection<java.lang.String> multiples = new ArrayList<java.lang.String>(3);
        multiples.add("1");
        multiples.add("3");
        multiples.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6703,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6705,null,6704,org.apache.commons.collections4.CollectionUtils.containsAll(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6706,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6708,null,6707,org.apache.commons.collections4.CollectionUtils.containsAll(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6710,null,6709,org.apache.commons.collections4.CollectionUtils.containsAll(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6712,null,6711,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6713,!(org.apache.commons.collections4.CollectionUtils.containsAll(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6714,!(org.apache.commons.collections4.CollectionUtils.containsAll(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6715,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6716,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6718,null,6717,org.apache.commons.collections4.CollectionUtils.containsAll(odds, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6719,!(org.apache.commons.collections4.CollectionUtils.containsAll(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6721,null,6720,org.apache.commons.collections4.CollectionUtils.containsAll(empty, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6723,null,6722,org.apache.commons.collections4.CollectionUtils.containsAll(odds, multiples));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6725,null,6724,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAll_literalMutation2104() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAll_literalMutation2104");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("foo");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        final Collection<java.lang.String> multiples = new ArrayList<java.lang.String>(3);
        multiples.add("1");
        multiples.add("3");
        multiples.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6703,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6705,null,6704,org.apache.commons.collections4.CollectionUtils.containsAll(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6706,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6708,null,6707,org.apache.commons.collections4.CollectionUtils.containsAll(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6710,null,6709,org.apache.commons.collections4.CollectionUtils.containsAll(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6712,null,6711,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6713,!(org.apache.commons.collections4.CollectionUtils.containsAll(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6714,!(org.apache.commons.collections4.CollectionUtils.containsAll(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6715,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6716,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6718,null,6717,org.apache.commons.collections4.CollectionUtils.containsAll(odds, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6719,!(org.apache.commons.collections4.CollectionUtils.containsAll(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6721,null,6720,org.apache.commons.collections4.CollectionUtils.containsAll(empty, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6723,null,6722,org.apache.commons.collections4.CollectionUtils.containsAll(odds, multiples));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6725,null,6724,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAll_literalMutation2105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAll_literalMutation2105");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(2);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        final Collection<java.lang.String> multiples = new ArrayList<java.lang.String>(3);
        multiples.add("1");
        multiples.add("3");
        multiples.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6703,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6705,null,6704,org.apache.commons.collections4.CollectionUtils.containsAll(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6706,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6708,null,6707,org.apache.commons.collections4.CollectionUtils.containsAll(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6710,null,6709,org.apache.commons.collections4.CollectionUtils.containsAll(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6712,null,6711,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6713,!(org.apache.commons.collections4.CollectionUtils.containsAll(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6714,!(org.apache.commons.collections4.CollectionUtils.containsAll(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6715,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6716,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6718,null,6717,org.apache.commons.collections4.CollectionUtils.containsAll(odds, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6719,!(org.apache.commons.collections4.CollectionUtils.containsAll(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6721,null,6720,org.apache.commons.collections4.CollectionUtils.containsAll(empty, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6723,null,6722,org.apache.commons.collections4.CollectionUtils.containsAll(odds, multiples));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6725,null,6724,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAll_literalMutation2106() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAll_literalMutation2106");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("foo");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        final Collection<java.lang.String> multiples = new ArrayList<java.lang.String>(3);
        multiples.add("1");
        multiples.add("3");
        multiples.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6703,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6705,null,6704,org.apache.commons.collections4.CollectionUtils.containsAll(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6706,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6708,null,6707,org.apache.commons.collections4.CollectionUtils.containsAll(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6710,null,6709,org.apache.commons.collections4.CollectionUtils.containsAll(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6712,null,6711,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6713,!(org.apache.commons.collections4.CollectionUtils.containsAll(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6714,!(org.apache.commons.collections4.CollectionUtils.containsAll(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6715,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6716,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6718,null,6717,org.apache.commons.collections4.CollectionUtils.containsAll(odds, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6719,!(org.apache.commons.collections4.CollectionUtils.containsAll(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6721,null,6720,org.apache.commons.collections4.CollectionUtils.containsAll(empty, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6723,null,6722,org.apache.commons.collections4.CollectionUtils.containsAll(odds, multiples));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6725,null,6724,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAll_literalMutation2107() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAll_literalMutation2107");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(3);
        odds.add("1");
        odds.add("3");
        final Collection<java.lang.String> multiples = new ArrayList<java.lang.String>(3);
        multiples.add("1");
        multiples.add("3");
        multiples.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6703,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6705,null,6704,org.apache.commons.collections4.CollectionUtils.containsAll(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6706,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6708,null,6707,org.apache.commons.collections4.CollectionUtils.containsAll(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6710,null,6709,org.apache.commons.collections4.CollectionUtils.containsAll(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6712,null,6711,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6713,!(org.apache.commons.collections4.CollectionUtils.containsAll(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6714,!(org.apache.commons.collections4.CollectionUtils.containsAll(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6715,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6716,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6718,null,6717,org.apache.commons.collections4.CollectionUtils.containsAll(odds, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6719,!(org.apache.commons.collections4.CollectionUtils.containsAll(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6721,null,6720,org.apache.commons.collections4.CollectionUtils.containsAll(empty, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6723,null,6722,org.apache.commons.collections4.CollectionUtils.containsAll(odds, multiples));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6725,null,6724,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAll_literalMutation2108() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAll_literalMutation2108");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("foo");
        odds.add("3");
        final Collection<java.lang.String> multiples = new ArrayList<java.lang.String>(3);
        multiples.add("1");
        multiples.add("3");
        multiples.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6703,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6705,null,6704,org.apache.commons.collections4.CollectionUtils.containsAll(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6706,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6708,null,6707,org.apache.commons.collections4.CollectionUtils.containsAll(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6710,null,6709,org.apache.commons.collections4.CollectionUtils.containsAll(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6712,null,6711,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6713,!(org.apache.commons.collections4.CollectionUtils.containsAll(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6714,!(org.apache.commons.collections4.CollectionUtils.containsAll(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6715,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6716,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6718,null,6717,org.apache.commons.collections4.CollectionUtils.containsAll(odds, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6719,!(org.apache.commons.collections4.CollectionUtils.containsAll(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6721,null,6720,org.apache.commons.collections4.CollectionUtils.containsAll(empty, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6723,null,6722,org.apache.commons.collections4.CollectionUtils.containsAll(odds, multiples));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6725,null,6724,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAll_literalMutation2109() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAll_literalMutation2109");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("foo");
        final Collection<java.lang.String> multiples = new ArrayList<java.lang.String>(3);
        multiples.add("1");
        multiples.add("3");
        multiples.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6703,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6705,null,6704,org.apache.commons.collections4.CollectionUtils.containsAll(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6706,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6708,null,6707,org.apache.commons.collections4.CollectionUtils.containsAll(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6710,null,6709,org.apache.commons.collections4.CollectionUtils.containsAll(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6712,null,6711,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6713,!(org.apache.commons.collections4.CollectionUtils.containsAll(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6714,!(org.apache.commons.collections4.CollectionUtils.containsAll(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6715,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6716,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6718,null,6717,org.apache.commons.collections4.CollectionUtils.containsAll(odds, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6719,!(org.apache.commons.collections4.CollectionUtils.containsAll(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6721,null,6720,org.apache.commons.collections4.CollectionUtils.containsAll(empty, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6723,null,6722,org.apache.commons.collections4.CollectionUtils.containsAll(odds, multiples));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6725,null,6724,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAll_literalMutation2110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAll_literalMutation2110");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        final Collection<java.lang.String> multiples = new ArrayList<java.lang.String>(2);
        multiples.add("1");
        multiples.add("3");
        multiples.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6703,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6705,null,6704,org.apache.commons.collections4.CollectionUtils.containsAll(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6706,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6708,null,6707,org.apache.commons.collections4.CollectionUtils.containsAll(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6710,null,6709,org.apache.commons.collections4.CollectionUtils.containsAll(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6712,null,6711,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6713,!(org.apache.commons.collections4.CollectionUtils.containsAll(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6714,!(org.apache.commons.collections4.CollectionUtils.containsAll(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6715,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6716,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6718,null,6717,org.apache.commons.collections4.CollectionUtils.containsAll(odds, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6719,!(org.apache.commons.collections4.CollectionUtils.containsAll(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6721,null,6720,org.apache.commons.collections4.CollectionUtils.containsAll(empty, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6723,null,6722,org.apache.commons.collections4.CollectionUtils.containsAll(odds, multiples));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6725,null,6724,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAll_literalMutation2111() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAll_literalMutation2111");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        final Collection<java.lang.String> multiples = new ArrayList<java.lang.String>(3);
        multiples.add("foo");
        multiples.add("3");
        multiples.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6703,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6705,null,6704,org.apache.commons.collections4.CollectionUtils.containsAll(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6706,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6708,null,6707,org.apache.commons.collections4.CollectionUtils.containsAll(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6710,null,6709,org.apache.commons.collections4.CollectionUtils.containsAll(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6712,null,6711,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6713,!(org.apache.commons.collections4.CollectionUtils.containsAll(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6714,!(org.apache.commons.collections4.CollectionUtils.containsAll(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6715,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6716,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6718,null,6717,org.apache.commons.collections4.CollectionUtils.containsAll(odds, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6719,!(org.apache.commons.collections4.CollectionUtils.containsAll(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6721,null,6720,org.apache.commons.collections4.CollectionUtils.containsAll(empty, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6723,null,6722,org.apache.commons.collections4.CollectionUtils.containsAll(odds, multiples));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6725,null,6724,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAll_literalMutation2112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAll_literalMutation2112");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        final Collection<java.lang.String> multiples = new ArrayList<java.lang.String>(3);
        multiples.add("1");
        multiples.add("foo");
        multiples.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6703,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6705,null,6704,org.apache.commons.collections4.CollectionUtils.containsAll(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6706,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6708,null,6707,org.apache.commons.collections4.CollectionUtils.containsAll(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6710,null,6709,org.apache.commons.collections4.CollectionUtils.containsAll(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6712,null,6711,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6713,!(org.apache.commons.collections4.CollectionUtils.containsAll(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6714,!(org.apache.commons.collections4.CollectionUtils.containsAll(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6715,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6716,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6718,null,6717,org.apache.commons.collections4.CollectionUtils.containsAll(odds, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6719,!(org.apache.commons.collections4.CollectionUtils.containsAll(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6721,null,6720,org.apache.commons.collections4.CollectionUtils.containsAll(empty, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6723,null,6722,org.apache.commons.collections4.CollectionUtils.containsAll(odds, multiples));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6725,null,6724,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAll_literalMutation2113() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAll_literalMutation2113");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        final Collection<java.lang.String> multiples = new ArrayList<java.lang.String>(3);
        multiples.add("1");
        multiples.add("3");
        multiples.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6703,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6705,null,6704,org.apache.commons.collections4.CollectionUtils.containsAll(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6706,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6708,null,6707,org.apache.commons.collections4.CollectionUtils.containsAll(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6710,null,6709,org.apache.commons.collections4.CollectionUtils.containsAll(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6712,null,6711,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6713,!(org.apache.commons.collections4.CollectionUtils.containsAll(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6714,!(org.apache.commons.collections4.CollectionUtils.containsAll(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6715,!(org.apache.commons.collections4.CollectionUtils.containsAll(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6716,!(org.apache.commons.collections4.CollectionUtils.containsAll(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6718,null,6717,org.apache.commons.collections4.CollectionUtils.containsAll(odds, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6719,!(org.apache.commons.collections4.CollectionUtils.containsAll(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6721,null,6720,org.apache.commons.collections4.CollectionUtils.containsAll(empty, empty));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6723,null,6722,org.apache.commons.collections4.CollectionUtils.containsAll(odds, multiples));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6725,null,6724,org.apache.commons.collections4.CollectionUtils.containsAll(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAny() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAny");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(1);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6727,null,6726,org.apache.commons.collections4.CollectionUtils.containsAny(one, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6729,null,6728,org.apache.commons.collections4.CollectionUtils.containsAny(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6731,null,6730,org.apache.commons.collections4.CollectionUtils.containsAny(three, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6733,null,6732,org.apache.commons.collections4.CollectionUtils.containsAny(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6735,null,6734,org.apache.commons.collections4.CollectionUtils.containsAny(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6737,null,6736,org.apache.commons.collections4.CollectionUtils.containsAny(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6738,!(org.apache.commons.collections4.CollectionUtils.containsAny(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6739,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6740,!(org.apache.commons.collections4.CollectionUtils.containsAny(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6741,!(org.apache.commons.collections4.CollectionUtils.containsAny(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6742,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, empty)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6743,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6744,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, empty)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAny_literalMutation2115() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAny_literalMutation2115");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(0);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6727,null,6726,org.apache.commons.collections4.CollectionUtils.containsAny(one, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6729,null,6728,org.apache.commons.collections4.CollectionUtils.containsAny(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6731,null,6730,org.apache.commons.collections4.CollectionUtils.containsAny(three, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6733,null,6732,org.apache.commons.collections4.CollectionUtils.containsAny(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6735,null,6734,org.apache.commons.collections4.CollectionUtils.containsAny(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6737,null,6736,org.apache.commons.collections4.CollectionUtils.containsAny(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6738,!(org.apache.commons.collections4.CollectionUtils.containsAny(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6739,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6740,!(org.apache.commons.collections4.CollectionUtils.containsAny(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6741,!(org.apache.commons.collections4.CollectionUtils.containsAny(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6742,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, empty)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6743,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6744,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, empty)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAny_literalMutation2116() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAny_literalMutation2116");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("foo");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6727,null,6726,org.apache.commons.collections4.CollectionUtils.containsAny(one, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6729,null,6728,org.apache.commons.collections4.CollectionUtils.containsAny(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6731,null,6730,org.apache.commons.collections4.CollectionUtils.containsAny(three, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6733,null,6732,org.apache.commons.collections4.CollectionUtils.containsAny(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6735,null,6734,org.apache.commons.collections4.CollectionUtils.containsAny(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6737,null,6736,org.apache.commons.collections4.CollectionUtils.containsAny(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6738,!(org.apache.commons.collections4.CollectionUtils.containsAny(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6739,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6740,!(org.apache.commons.collections4.CollectionUtils.containsAny(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6741,!(org.apache.commons.collections4.CollectionUtils.containsAny(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6742,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, empty)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6743,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6744,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, empty)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAny_literalMutation2117() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAny_literalMutation2117");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(0);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6727,null,6726,org.apache.commons.collections4.CollectionUtils.containsAny(one, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6729,null,6728,org.apache.commons.collections4.CollectionUtils.containsAny(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6731,null,6730,org.apache.commons.collections4.CollectionUtils.containsAny(three, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6733,null,6732,org.apache.commons.collections4.CollectionUtils.containsAny(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6735,null,6734,org.apache.commons.collections4.CollectionUtils.containsAny(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6737,null,6736,org.apache.commons.collections4.CollectionUtils.containsAny(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6738,!(org.apache.commons.collections4.CollectionUtils.containsAny(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6739,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6740,!(org.apache.commons.collections4.CollectionUtils.containsAny(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6741,!(org.apache.commons.collections4.CollectionUtils.containsAny(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6742,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, empty)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6743,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6744,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, empty)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAny_literalMutation2118() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAny_literalMutation2118");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("foo");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6727,null,6726,org.apache.commons.collections4.CollectionUtils.containsAny(one, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6729,null,6728,org.apache.commons.collections4.CollectionUtils.containsAny(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6731,null,6730,org.apache.commons.collections4.CollectionUtils.containsAny(three, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6733,null,6732,org.apache.commons.collections4.CollectionUtils.containsAny(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6735,null,6734,org.apache.commons.collections4.CollectionUtils.containsAny(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6737,null,6736,org.apache.commons.collections4.CollectionUtils.containsAny(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6738,!(org.apache.commons.collections4.CollectionUtils.containsAny(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6739,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6740,!(org.apache.commons.collections4.CollectionUtils.containsAny(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6741,!(org.apache.commons.collections4.CollectionUtils.containsAny(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6742,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, empty)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6743,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6744,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, empty)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAny_literalMutation2119() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAny_literalMutation2119");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(2);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6727,null,6726,org.apache.commons.collections4.CollectionUtils.containsAny(one, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6729,null,6728,org.apache.commons.collections4.CollectionUtils.containsAny(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6731,null,6730,org.apache.commons.collections4.CollectionUtils.containsAny(three, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6733,null,6732,org.apache.commons.collections4.CollectionUtils.containsAny(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6735,null,6734,org.apache.commons.collections4.CollectionUtils.containsAny(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6737,null,6736,org.apache.commons.collections4.CollectionUtils.containsAny(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6738,!(org.apache.commons.collections4.CollectionUtils.containsAny(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6739,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6740,!(org.apache.commons.collections4.CollectionUtils.containsAny(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6741,!(org.apache.commons.collections4.CollectionUtils.containsAny(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6742,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, empty)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6743,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6744,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, empty)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAny_literalMutation2120() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAny_literalMutation2120");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("foo");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6727,null,6726,org.apache.commons.collections4.CollectionUtils.containsAny(one, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6729,null,6728,org.apache.commons.collections4.CollectionUtils.containsAny(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6731,null,6730,org.apache.commons.collections4.CollectionUtils.containsAny(three, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6733,null,6732,org.apache.commons.collections4.CollectionUtils.containsAny(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6735,null,6734,org.apache.commons.collections4.CollectionUtils.containsAny(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6737,null,6736,org.apache.commons.collections4.CollectionUtils.containsAny(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6738,!(org.apache.commons.collections4.CollectionUtils.containsAny(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6739,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6740,!(org.apache.commons.collections4.CollectionUtils.containsAny(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6741,!(org.apache.commons.collections4.CollectionUtils.containsAny(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6742,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, empty)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6743,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6744,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, empty)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAny_literalMutation2121() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAny_literalMutation2121");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(3);
        odds.add("1");
        odds.add("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6727,null,6726,org.apache.commons.collections4.CollectionUtils.containsAny(one, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6729,null,6728,org.apache.commons.collections4.CollectionUtils.containsAny(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6731,null,6730,org.apache.commons.collections4.CollectionUtils.containsAny(three, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6733,null,6732,org.apache.commons.collections4.CollectionUtils.containsAny(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6735,null,6734,org.apache.commons.collections4.CollectionUtils.containsAny(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6737,null,6736,org.apache.commons.collections4.CollectionUtils.containsAny(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6738,!(org.apache.commons.collections4.CollectionUtils.containsAny(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6739,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6740,!(org.apache.commons.collections4.CollectionUtils.containsAny(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6741,!(org.apache.commons.collections4.CollectionUtils.containsAny(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6742,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, empty)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6743,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6744,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, empty)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAny_literalMutation2122() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAny_literalMutation2122");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("foo");
        odds.add("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6727,null,6726,org.apache.commons.collections4.CollectionUtils.containsAny(one, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6729,null,6728,org.apache.commons.collections4.CollectionUtils.containsAny(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6731,null,6730,org.apache.commons.collections4.CollectionUtils.containsAny(three, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6733,null,6732,org.apache.commons.collections4.CollectionUtils.containsAny(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6735,null,6734,org.apache.commons.collections4.CollectionUtils.containsAny(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6737,null,6736,org.apache.commons.collections4.CollectionUtils.containsAny(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6738,!(org.apache.commons.collections4.CollectionUtils.containsAny(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6739,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6740,!(org.apache.commons.collections4.CollectionUtils.containsAny(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6741,!(org.apache.commons.collections4.CollectionUtils.containsAny(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6742,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, empty)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6743,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6744,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, empty)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void containsAny_literalMutation2123() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "containsAny_literalMutation2123");
        final Collection<java.lang.String> empty = new ArrayList<java.lang.String>(0);
        final Collection<java.lang.String> one = new ArrayList<java.lang.String>(1);
        one.add("1");
        final Collection<java.lang.String> two = new ArrayList<java.lang.String>(1);
        two.add("2");
        final Collection<java.lang.String> three = new ArrayList<java.lang.String>(1);
        three.add("3");
        final Collection<java.lang.String> odds = new ArrayList<java.lang.String>(2);
        odds.add("1");
        odds.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6727,null,6726,org.apache.commons.collections4.CollectionUtils.containsAny(one, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6729,null,6728,org.apache.commons.collections4.CollectionUtils.containsAny(odds, one));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6731,null,6730,org.apache.commons.collections4.CollectionUtils.containsAny(three, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6733,null,6732,org.apache.commons.collections4.CollectionUtils.containsAny(odds, three));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6735,null,6734,org.apache.commons.collections4.CollectionUtils.containsAny(two, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6737,null,6736,org.apache.commons.collections4.CollectionUtils.containsAny(odds, odds));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6738,!(org.apache.commons.collections4.CollectionUtils.containsAny(two, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6739,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, two)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6740,!(org.apache.commons.collections4.CollectionUtils.containsAny(one, three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6741,!(org.apache.commons.collections4.CollectionUtils.containsAny(three, one)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6742,!(org.apache.commons.collections4.CollectionUtils.containsAny(odds, empty)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6743,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, odds)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6744,!(org.apache.commons.collections4.CollectionUtils.containsAny(empty, empty)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void union() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "union");
        final Collection<java.lang.Integer> col = org.apache.commons.collections4.CollectionUtils.union(iterableA, iterableC);
        final Map<java.lang.Integer, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(col);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7302,null,7301,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7304,freq,7303,freq.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7306,null,7305,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7308,freq,7307,freq.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7310,null,7309,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7312,freq,7311,freq.get(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7314,null,7313,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7316,freq,7315,freq.get(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7318,null,7317,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7320,freq,7319,freq.get(5));
        final Collection<java.lang.Number> col2 = org.apache.commons.collections4.CollectionUtils.union(collectionC2, iterableA);
        final Map<java.lang.Number, java.lang.Integer> freq2 = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(col2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7322,null,7321,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7324,freq2,7323,freq2.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7326,null,7325,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7328,freq2,7327,freq2.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7330,null,7329,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7332,freq2,7331,freq2.get(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7334,null,7333,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7336,freq2,7335,freq2.get(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7338,null,7337,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7340,freq2,7339,freq2.get(5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void disjunction() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disjunction");
        final Collection<java.lang.Integer> col = org.apache.commons.collections4.CollectionUtils.disjunction(iterableA, iterableC);
        final Map<java.lang.Integer, java.lang.Integer> freq = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(col);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6754,null,6753,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6756,freq,6755,freq.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6758,null,6757,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6760,freq,6759,freq.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6762,freq,6761,freq.get(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6764,null,6763,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6766,freq,6765,freq.get(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6768,null,6767,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6770,freq,6769,freq.get(5));
        final Collection<java.lang.Number> col2 = org.apache.commons.collections4.CollectionUtils.disjunction(collectionC2, collectionA);
        final Map<java.lang.Number, java.lang.Integer> freq2 = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(col2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6772,null,6771,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6774,freq2,6773,freq2.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6776,null,6775,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6778,freq2,6777,freq2.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6780,freq2,6779,freq2.get(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6782,null,6781,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6784,freq2,6783,freq2.get(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6786,null,6785,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6788,freq2,6787,freq2.get(5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDisjunctionAsUnionMinusIntersection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDisjunctionAsUnionMinusIntersection");
        final Collection<java.lang.Number> dis = org.apache.commons.collections4.CollectionUtils.<Number>disjunction(collectionA, collectionC);
        final Collection<java.lang.Number> un = org.apache.commons.collections4.CollectionUtils.<Number>union(collectionA, collectionC);
        final Collection<java.lang.Number> inter = org.apache.commons.collections4.CollectionUtils.<Number>intersection(collectionA, collectionC);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7012,null,7011,org.apache.commons.collections4.CollectionUtils.isEqualCollection(dis, org.apache.commons.collections4.CollectionUtils.subtract(un, inter)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testDisjunctionAsSymmetricDifference() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDisjunctionAsSymmetricDifference");
        final Collection<java.lang.Number> dis = org.apache.commons.collections4.CollectionUtils.<Number>disjunction(collectionA, collectionC);
        final Collection<java.lang.Number> amb = org.apache.commons.collections4.CollectionUtils.<Number>subtract(collectionA, collectionC);
        final Collection<java.lang.Number> bma = org.apache.commons.collections4.CollectionUtils.<Number>subtract(collectionC, collectionA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7010,null,7009,org.apache.commons.collections4.CollectionUtils.isEqualCollection(dis, org.apache.commons.collections4.CollectionUtils.union(amb, bma)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSubtractWithPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractWithPredicate");
        final Predicate<java.lang.Number> predicate = new Predicate<java.lang.Number>() {
            public boolean evaluate(final Number n) {
                return (n.longValue()) > 3L;
            }
        };
        final Collection<java.lang.Number> col = org.apache.commons.collections4.CollectionUtils.subtract(iterableA, collectionC, predicate);
        final Map<java.lang.Number, java.lang.Integer> freq2 = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(col);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7257,null,7256,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7259,freq2,7258,freq2.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7261,null,7260,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7263,freq2,7262,freq2.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7265,null,7264,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7267,freq2,7266,freq2.get(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7269,null,7268,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7271,freq2,7270,freq2.get(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7273,freq2,7272,freq2.get(5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSubtract() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract");
        final Predicate<java.lang.Number> predicate = new Predicate<java.lang.Number>() {
            public boolean evaluate(final Number n) {
                return (n.longValue()) > 2L;
            }
        };
        final Collection<java.lang.Number> col = org.apache.commons.collections4.CollectionUtils.subtract(iterableA, collectionC, predicate);
        final Map<java.lang.Number, java.lang.Integer> freq2 = org.apache.commons.collections4.CollectionUtils.getCardinalityMap(col);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7257,null,7256,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7259,freq2,7258,freq2.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7261,null,7260,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7263,freq2,7262,freq2.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7265,null,7264,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7267,freq2,7266,freq2.get(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7269,null,7268,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7271,freq2,7270,freq2.get(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7273,freq2,7272,freq2.get(5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsSubCollectionOfSelf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsSubCollectionOfSelf");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7118,null,7117,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7120,null,7119,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionB, collectionB));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsSubCollection2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsSubCollection2");
        final Collection<java.lang.Integer> c = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7081,null,7080,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7082,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7084,null,7083,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7085,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7087,null,7086,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7088,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7090,null,7089,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7091,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7093,null,7092,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7094,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7096,null,7095,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7097,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7099,null,7098,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7100,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7102,null,7101,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7103,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7105,null,7104,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7106,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7108,null,7107,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7109,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7111,null,7110,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7113,null,7112,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        c.add(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7114,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7116,null,7115,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsSubCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsSubCollection");
        final Collection<java.lang.Integer> c = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7081,null,7080,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7082,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7084,null,7083,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7085,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7087,null,7086,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7088,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7090,null,7089,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7091,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7093,null,7092,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7094,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7096,null,7095,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7097,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7099,null,7098,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7100,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7102,null,7101,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7103,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7105,null,7104,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7106,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7108,null,7107,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7109,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7111,null,7110,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7113,null,7112,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        c.add(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7114,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7116,null,7115,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsSubCollection2_literalMutation2266() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsSubCollection2_literalMutation2266");
        final Collection<java.lang.Integer> c = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7081,null,7080,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7082,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7084,null,7083,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7085,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7087,null,7086,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7088,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7090,null,7089,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7091,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7093,null,7092,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7094,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7096,null,7095,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7097,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7099,null,7098,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7100,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7102,null,7101,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7103,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7105,null,7104,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7106,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7108,null,7107,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7109,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7111,null,7110,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7113,null,7112,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        c.add(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7114,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7116,null,7115,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsSubCollection2_literalMutation2267() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsSubCollection2_literalMutation2267");
        final Collection<java.lang.Integer> c = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7081,null,7080,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7082,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7084,null,7083,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7085,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7087,null,7086,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7088,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7090,null,7089,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7091,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7093,null,7092,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7094,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7096,null,7095,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7097,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7099,null,7098,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7100,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7102,null,7101,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7103,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7105,null,7104,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7106,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7108,null,7107,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7109,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7111,null,7110,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7113,null,7112,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        c.add(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7114,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7116,null,7115,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsSubCollection2_literalMutation2268() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsSubCollection2_literalMutation2268");
        final Collection<java.lang.Integer> c = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7081,null,7080,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7082,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7084,null,7083,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7085,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7087,null,7086,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7088,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7090,null,7089,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7091,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7093,null,7092,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7094,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7096,null,7095,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7097,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7099,null,7098,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7100,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7102,null,7101,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7103,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7105,null,7104,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7106,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7108,null,7107,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7109,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7111,null,7110,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7113,null,7112,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        c.add(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7114,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7116,null,7115,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsSubCollection2_literalMutation2269() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsSubCollection2_literalMutation2269");
        final Collection<java.lang.Integer> c = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7081,null,7080,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7082,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7084,null,7083,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7085,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7087,null,7086,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7088,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7090,null,7089,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7091,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7093,null,7092,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7094,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7096,null,7095,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7097,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7099,null,7098,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7100,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7102,null,7101,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7103,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7105,null,7104,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7106,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7108,null,7107,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7109,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7111,null,7110,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7113,null,7112,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        c.add(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7114,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7116,null,7115,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsSubCollection2_literalMutation2270() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsSubCollection2_literalMutation2270");
        final Collection<java.lang.Integer> c = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7081,null,7080,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7082,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7084,null,7083,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7085,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7087,null,7086,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7088,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7090,null,7089,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7091,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7093,null,7092,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7094,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7096,null,7095,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7097,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7099,null,7098,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7100,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7102,null,7101,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7103,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7105,null,7104,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7106,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7108,null,7107,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7109,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7111,null,7110,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7113,null,7112,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        c.add(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7114,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7116,null,7115,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsSubCollection2_literalMutation2271() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsSubCollection2_literalMutation2271");
        final Collection<java.lang.Integer> c = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7081,null,7080,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7082,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7084,null,7083,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7085,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7087,null,7086,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7088,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7090,null,7089,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7091,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7093,null,7092,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7094,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7096,null,7095,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7097,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7099,null,7098,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7100,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7102,null,7101,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7103,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7105,null,7104,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7106,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7108,null,7107,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7109,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7111,null,7110,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7113,null,7112,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        c.add(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7114,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7116,null,7115,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsSubCollection2_literalMutation2272() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsSubCollection2_literalMutation2272");
        final Collection<java.lang.Integer> c = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7081,null,7080,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7082,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7084,null,7083,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7085,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7087,null,7086,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7088,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7090,null,7089,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7091,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7093,null,7092,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7094,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7096,null,7095,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7097,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7099,null,7098,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7100,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7102,null,7101,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7103,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7105,null,7104,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7106,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7108,null,7107,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7109,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7111,null,7110,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7113,null,7112,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        c.add(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7114,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7116,null,7115,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsSubCollection2_literalMutation2273() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsSubCollection2_literalMutation2273");
        final Collection<java.lang.Integer> c = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7081,null,7080,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7082,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7084,null,7083,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7085,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7087,null,7086,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7088,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7090,null,7089,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7091,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7093,null,7092,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7094,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7096,null,7095,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7097,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7099,null,7098,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7100,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7102,null,7101,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7103,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7105,null,7104,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7106,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7108,null,7107,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7109,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7111,null,7110,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7113,null,7112,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        c.add(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7114,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7116,null,7115,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsSubCollection2_literalMutation2274() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsSubCollection2_literalMutation2274");
        final Collection<java.lang.Integer> c = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7081,null,7080,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7082,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7084,null,7083,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7085,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7087,null,7086,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7088,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7090,null,7089,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7091,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7093,null,7092,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7094,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7096,null,7095,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7097,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7099,null,7098,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7100,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7102,null,7101,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7103,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7105,null,7104,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7106,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7108,null,7107,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7109,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7111,null,7110,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7113,null,7112,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        c.add(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7114,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7116,null,7115,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsSubCollection2_literalMutation2275() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsSubCollection2_literalMutation2275");
        final Collection<java.lang.Integer> c = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7081,null,7080,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7082,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7084,null,7083,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7085,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7087,null,7086,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7088,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7090,null,7089,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7091,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7093,null,7092,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7094,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7096,null,7095,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7097,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7099,null,7098,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7100,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7102,null,7101,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7103,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7105,null,7104,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7106,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7108,null,7107,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7109,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c)));
        c.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7111,null,7110,org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7113,null,7112,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        c.add(6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7114,!(org.apache.commons.collections4.CollectionUtils.isSubCollection(c, collectionA)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7116,null,7115,org.apache.commons.collections4.CollectionUtils.isSubCollection(collectionA, c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollectionToSelf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollectionToSelf");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7056,null,7055,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7058,null,7057,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionB, collectionB));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollectionReturnsFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollectionReturnsFalse");
        final List<java.lang.Integer> b = new ArrayList<java.lang.Integer>(collectionA);
        b.remove(0);
        b.add(5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7052,null,7051,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7054,null,7053,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollectionReturnsFalse_literalMutation2257() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollectionReturnsFalse_literalMutation2257");
        final List<java.lang.Integer> b = new ArrayList<java.lang.Integer>(collectionA);
        b.remove(1);
        b.add(6);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7052,null,7051,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7054,null,7053,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, collectionA));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollection");
        final Collection<java.lang.String> a = new ArrayList<java.lang.String>();
        final Collection<java.lang.String> b = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7020,null,7019,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7022,null,7021,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7023,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7024,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7026,null,7025,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7028,null,7027,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7029,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7030,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7032,null,7031,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7034,null,7033,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7035,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7036,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7038,null,7037,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7040,null,7039,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollection2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollection2");
        final Collection<java.lang.String> a = new ArrayList<java.lang.String>();
        final Collection<java.lang.String> b = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7020,null,7019,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7022,null,7021,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7023,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7024,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7026,null,7025,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7028,null,7027,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7029,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7030,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7032,null,7031,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7034,null,7033,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7035,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7036,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7038,null,7037,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7040,null,7039,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollection2_literalMutation2241() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollection2_literalMutation2241");
        final Collection<java.lang.String> a = new ArrayList<java.lang.String>();
        final Collection<java.lang.String> b = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7020,null,7019,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7022,null,7021,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7023,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7024,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7026,null,7025,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7028,null,7027,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7029,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7030,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7032,null,7031,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7034,null,7033,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7035,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7036,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7038,null,7037,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7040,null,7039,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollection2_literalMutation2242() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollection2_literalMutation2242");
        final Collection<java.lang.String> a = new ArrayList<java.lang.String>();
        final Collection<java.lang.String> b = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7020,null,7019,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7022,null,7021,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7023,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7024,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7026,null,7025,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7028,null,7027,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7029,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7030,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7032,null,7031,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7034,null,7033,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7035,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7036,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7038,null,7037,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7040,null,7039,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollection2_literalMutation2243() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollection2_literalMutation2243");
        final Collection<java.lang.String> a = new ArrayList<java.lang.String>();
        final Collection<java.lang.String> b = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7020,null,7019,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7022,null,7021,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7023,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7024,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7026,null,7025,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7028,null,7027,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7029,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7030,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7032,null,7031,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7034,null,7033,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7035,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7036,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7038,null,7037,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7040,null,7039,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollection2_literalMutation2244() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollection2_literalMutation2244");
        final Collection<java.lang.String> a = new ArrayList<java.lang.String>();
        final Collection<java.lang.String> b = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7020,null,7019,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7022,null,7021,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7023,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7024,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7026,null,7025,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7028,null,7027,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7029,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7030,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7032,null,7031,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7034,null,7033,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        a.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7035,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7036,!(org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a)));
        b.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7038,null,7037,org.apache.commons.collections4.CollectionUtils.isEqualCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7040,null,7039,org.apache.commons.collections4.CollectionUtils.isEqualCollection(b, a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollectionEquator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollectionEquator");
        final Collection<java.lang.Integer> collB = org.apache.commons.collections4.CollectionUtils.collect(collectionB, TRANSFORM_TO_INTEGER);
        final Equator<java.lang.Integer> e = new Equator<java.lang.Integer>() {
            public boolean equate(final Integer o1, final Integer o2) {
                if ((((o1.intValue()) % 3) == 0) ^ (((o2.intValue()) % 2) == 0)) {
                    return false;
                } else {
                    return true;
                }
            }

            public int hash(final Integer o) {
                return ((o.intValue()) % 2) == 0 ? Integer.valueOf(0).hashCode() : Integer.valueOf(1).hashCode();
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7042,null,7041,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionA, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7044,null,7043,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7046,null,7045,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collB, collectionA, e));
        final Equator<java.lang.Number> defaultEquator = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7048,null,7047,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7050,null,7049,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollectionEquator_literalMutation2246() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollectionEquator_literalMutation2246");
        final Collection<java.lang.Integer> collB = org.apache.commons.collections4.CollectionUtils.collect(collectionB, TRANSFORM_TO_INTEGER);
        final Equator<java.lang.Integer> e = new Equator<java.lang.Integer>() {
            public boolean equate(final Integer o1, final Integer o2) {
                if ((((o1.intValue()) % 2) == 1) ^ (((o2.intValue()) % 2) == 0)) {
                    return false;
                } else {
                    return true;
                }
            }

            public int hash(final Integer o) {
                return ((o.intValue()) % 2) == 0 ? Integer.valueOf(0).hashCode() : Integer.valueOf(1).hashCode();
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7042,null,7041,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionA, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7044,null,7043,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7046,null,7045,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collB, collectionA, e));
        final Equator<java.lang.Number> defaultEquator = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7048,null,7047,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7050,null,7049,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollectionEquator_literalMutation2247() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollectionEquator_literalMutation2247");
        final Collection<java.lang.Integer> collB = org.apache.commons.collections4.CollectionUtils.collect(collectionB, TRANSFORM_TO_INTEGER);
        final Equator<java.lang.Integer> e = new Equator<java.lang.Integer>() {
            public boolean equate(final Integer o1, final Integer o2) {
                if ((((o1.intValue()) % 2) == 0) ^ (((o2.intValue()) % 3) == 0)) {
                    return false;
                } else {
                    return true;
                }
            }

            public int hash(final Integer o) {
                return ((o.intValue()) % 2) == 0 ? Integer.valueOf(0).hashCode() : Integer.valueOf(1).hashCode();
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7042,null,7041,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionA, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7044,null,7043,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7046,null,7045,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collB, collectionA, e));
        final Equator<java.lang.Number> defaultEquator = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7048,null,7047,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7050,null,7049,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollectionEquator_literalMutation2248() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollectionEquator_literalMutation2248");
        final Collection<java.lang.Integer> collB = org.apache.commons.collections4.CollectionUtils.collect(collectionB, TRANSFORM_TO_INTEGER);
        final Equator<java.lang.Integer> e = new Equator<java.lang.Integer>() {
            public boolean equate(final Integer o1, final Integer o2) {
                if ((((o1.intValue()) % 2) == 0) ^ (((o2.intValue()) % 2) == 1)) {
                    return false;
                } else {
                    return true;
                }
            }

            public int hash(final Integer o) {
                return ((o.intValue()) % 2) == 0 ? Integer.valueOf(0).hashCode() : Integer.valueOf(1).hashCode();
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7042,null,7041,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionA, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7044,null,7043,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7046,null,7045,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collB, collectionA, e));
        final Equator<java.lang.Number> defaultEquator = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7048,null,7047,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7050,null,7049,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollectionEquator_literalMutation2249() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollectionEquator_literalMutation2249");
        final Collection<java.lang.Integer> collB = org.apache.commons.collections4.CollectionUtils.collect(collectionB, TRANSFORM_TO_INTEGER);
        final Equator<java.lang.Integer> e = new Equator<java.lang.Integer>() {
            public boolean equate(final Integer o1, final Integer o2) {
                if ((((o1.intValue()) % 2) == 0) ^ (((o2.intValue()) % 2) == 0)) {
                    return false;
                } else {
                    return true;
                }
            }

            public int hash(final Integer o) {
                return ((o.intValue()) % 2) == 0 ? Integer.valueOf(0).hashCode() : Integer.valueOf(1).hashCode();
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7042,null,7041,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionA, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7044,null,7043,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7046,null,7045,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collB, collectionA, e));
        final Equator<java.lang.Number> defaultEquator = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7048,null,7047,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7050,null,7049,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollectionEquator_literalMutation2250() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollectionEquator_literalMutation2250");
        final Collection<java.lang.Integer> collB = org.apache.commons.collections4.CollectionUtils.collect(collectionB, TRANSFORM_TO_INTEGER);
        final Equator<java.lang.Integer> e = new Equator<java.lang.Integer>() {
            public boolean equate(final Integer o1, final Integer o2) {
                if ((((o1.intValue()) % 2) == 0) ^ (((o2.intValue()) % 2) == 0)) {
                    return false;
                } else {
                    return false;
                }
            }

            public int hash(final Integer o) {
                return ((o.intValue()) % 2) == 0 ? Integer.valueOf(0).hashCode() : Integer.valueOf(1).hashCode();
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7042,null,7041,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionA, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7044,null,7043,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7046,null,7045,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collB, collectionA, e));
        final Equator<java.lang.Number> defaultEquator = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7048,null,7047,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7050,null,7049,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollectionEquator_literalMutation2251() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollectionEquator_literalMutation2251");
        final Collection<java.lang.Integer> collB = org.apache.commons.collections4.CollectionUtils.collect(collectionB, TRANSFORM_TO_INTEGER);
        final Equator<java.lang.Integer> e = new Equator<java.lang.Integer>() {
            public boolean equate(final Integer o1, final Integer o2) {
                if ((((o1.intValue()) % 2) == 0) ^ (((o2.intValue()) % 2) == 0)) {
                    return false;
                } else {
                    return true;
                }
            }

            public int hash(final Integer o) {
                return ((o.intValue()) % 3) == 0 ? Integer.valueOf(0).hashCode() : Integer.valueOf(1).hashCode();
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7042,null,7041,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionA, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7044,null,7043,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7046,null,7045,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collB, collectionA, e));
        final Equator<java.lang.Number> defaultEquator = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7048,null,7047,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7050,null,7049,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollectionEquator_literalMutation2252() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollectionEquator_literalMutation2252");
        final Collection<java.lang.Integer> collB = org.apache.commons.collections4.CollectionUtils.collect(collectionB, TRANSFORM_TO_INTEGER);
        final Equator<java.lang.Integer> e = new Equator<java.lang.Integer>() {
            public boolean equate(final Integer o1, final Integer o2) {
                if ((((o1.intValue()) % 2) == 0) ^ (((o2.intValue()) % 2) == 0)) {
                    return false;
                } else {
                    return true;
                }
            }

            public int hash(final Integer o) {
                return ((o.intValue()) % 2) == -1 ? Integer.valueOf(0).hashCode() : Integer.valueOf(1).hashCode();
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7042,null,7041,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionA, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7044,null,7043,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7046,null,7045,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collB, collectionA, e));
        final Equator<java.lang.Number> defaultEquator = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7048,null,7047,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7050,null,7049,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollectionEquator_literalMutation2253() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollectionEquator_literalMutation2253");
        final Collection<java.lang.Integer> collB = org.apache.commons.collections4.CollectionUtils.collect(collectionB, TRANSFORM_TO_INTEGER);
        final Equator<java.lang.Integer> e = new Equator<java.lang.Integer>() {
            public boolean equate(final Integer o1, final Integer o2) {
                if ((((o1.intValue()) % 2) == 0) ^ (((o2.intValue()) % 2) == 0)) {
                    return false;
                } else {
                    return true;
                }
            }

            public int hash(final Integer o) {
                return ((o.intValue()) % 2) == 0 ? Integer.valueOf(-1).hashCode() : Integer.valueOf(1).hashCode();
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7042,null,7041,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionA, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7044,null,7043,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7046,null,7045,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collB, collectionA, e));
        final Equator<java.lang.Number> defaultEquator = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7048,null,7047,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7050,null,7049,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEqualCollectionEquator_literalMutation2254() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollectionEquator_literalMutation2254");
        final Collection<java.lang.Integer> collB = org.apache.commons.collections4.CollectionUtils.collect(collectionB, TRANSFORM_TO_INTEGER);
        final Equator<java.lang.Integer> e = new Equator<java.lang.Integer>() {
            public boolean equate(final Integer o1, final Integer o2) {
                if ((((o1.intValue()) % 2) == 0) ^ (((o2.intValue()) % 2) == 0)) {
                    return false;
                } else {
                    return true;
                }
            }

            public int hash(final Integer o) {
                return ((o.intValue()) % 2) == 0 ? Integer.valueOf(0).hashCode() : Integer.valueOf(0).hashCode();
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7042,null,7041,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionA, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7044,null,7043,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, e));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7046,null,7045,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collB, collectionA, e));
        final Equator<java.lang.Number> defaultEquator = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7048,null,7047,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7050,null,7049,org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collB, defaultEquator));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsEqualCollectionNullEquator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEqualCollectionNullEquator");
        org.apache.commons.collections4.CollectionUtils.isEqualCollection(collectionA, collectionA, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsProperSubCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsProperSubCollection");
        final Collection<java.lang.String> a = new ArrayList<java.lang.String>();
        final Collection<java.lang.String> b = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7065,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b)));
        b.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7067,null,7066,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7068,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7069,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7070,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, a)));
        a.add("1");
        a.add("2");
        b.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7071,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7072,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b)));
        a.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7074,null,7073,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7076,null,7075,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(org.apache.commons.collections4.CollectionUtils.intersection(collectionA, collectionC), collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7078,null,7077,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(org.apache.commons.collections4.CollectionUtils.subtract(a, b), a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7079,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, org.apache.commons.collections4.CollectionUtils.subtract(a, b))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsProperSubCollection_literalMutation2261() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsProperSubCollection_literalMutation2261");
        final Collection<java.lang.String> a = new ArrayList<java.lang.String>();
        final Collection<java.lang.String> b = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7065,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b)));
        b.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7067,null,7066,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7068,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7069,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7070,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, a)));
        a.add("foo");
        a.add("2");
        b.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7071,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7072,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b)));
        a.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7074,null,7073,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7076,null,7075,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(org.apache.commons.collections4.CollectionUtils.intersection(collectionA, collectionC), collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7078,null,7077,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(org.apache.commons.collections4.CollectionUtils.subtract(a, b), a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7079,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, org.apache.commons.collections4.CollectionUtils.subtract(a, b))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsProperSubCollection_literalMutation2262() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsProperSubCollection_literalMutation2262");
        final Collection<java.lang.String> a = new ArrayList<java.lang.String>();
        final Collection<java.lang.String> b = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7065,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b)));
        b.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7067,null,7066,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7068,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7069,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7070,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, a)));
        a.add("1");
        a.add("foo");
        b.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7071,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7072,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b)));
        a.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7074,null,7073,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7076,null,7075,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(org.apache.commons.collections4.CollectionUtils.intersection(collectionA, collectionC), collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7078,null,7077,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(org.apache.commons.collections4.CollectionUtils.subtract(a, b), a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7079,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, org.apache.commons.collections4.CollectionUtils.subtract(a, b))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsProperSubCollection_literalMutation2263() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsProperSubCollection_literalMutation2263");
        final Collection<java.lang.String> a = new ArrayList<java.lang.String>();
        final Collection<java.lang.String> b = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7065,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b)));
        b.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7067,null,7066,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7068,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7069,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7070,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, a)));
        a.add("1");
        a.add("2");
        b.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7071,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7072,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b)));
        a.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7074,null,7073,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7076,null,7075,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(org.apache.commons.collections4.CollectionUtils.intersection(collectionA, collectionC), collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7078,null,7077,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(org.apache.commons.collections4.CollectionUtils.subtract(a, b), a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7079,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, org.apache.commons.collections4.CollectionUtils.subtract(a, b))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsProperSubCollection_literalMutation2264() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsProperSubCollection_literalMutation2264");
        final Collection<java.lang.String> a = new ArrayList<java.lang.String>();
        final Collection<java.lang.String> b = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7065,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b)));
        b.add("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7067,null,7066,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7068,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7069,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, b)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7070,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, a)));
        a.add("1");
        a.add("2");
        b.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7071,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7072,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, b)));
        a.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7074,null,7073,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(b, a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7076,null,7075,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(org.apache.commons.collections4.CollectionUtils.intersection(collectionA, collectionC), collectionA));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7078,null,7077,org.apache.commons.collections4.CollectionUtils.isProperSubCollection(org.apache.commons.collections4.CollectionUtils.subtract(a, b), a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7079,!(org.apache.commons.collections4.CollectionUtils.isProperSubCollection(a, org.apache.commons.collections4.CollectionUtils.subtract(a, b))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void find() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "find");
        Predicate<java.lang.Number> testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(((Number)(3)));
        Integer test = org.apache.commons.collections4.CollectionUtils.find(collectionA, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6851,test,6850,test.equals(4));
        testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(((Number)(45)));
        test = org.apache.commons.collections4.CollectionUtils.find(collectionA, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6852,(test == null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6854,null,6853,org.apache.commons.collections4.CollectionUtils.find(null, testPredicate));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6856,null,6855,org.apache.commons.collections4.CollectionUtils.find(collectionA, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void find_literalMutation2144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "find_literalMutation2144");
        Predicate<java.lang.Number> testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(((Number)(4)));
        Integer test = org.apache.commons.collections4.CollectionUtils.find(collectionA, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6851,test,6850,test.equals(4));
        testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(((Number)(44)));
        test = org.apache.commons.collections4.CollectionUtils.find(collectionA, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6852,(test == null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6854,null,6853,org.apache.commons.collections4.CollectionUtils.find(null, testPredicate));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6856,null,6855,org.apache.commons.collections4.CollectionUtils.find(collectionA, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "foo" , "rawtypes" })
    @Test
    public void forAllDoCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllDoCollection");
        final Closure<java.util.List<? extends java.lang.Number>> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("clear");
        final Collection<java.util.List<? extends java.lang.Number>> col = new ArrayList<java.util.List<? extends java.lang.Number>>();
        col.add(collectionA);
        col.add(collectionB);
        Closure<java.util.List<? extends java.lang.Number>> resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6879,testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6880,resultClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6881,((collectionA.isEmpty()) && (collectionB.isEmpty())));
        resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(col, ((Closure<java.util.List<? extends java.lang.Number>>)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6882,resultClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6883,((collectionA.isEmpty()) && (collectionB.isEmpty())));
        resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(((Collection)(null)), testClosure);
        col.add(null);
        org.apache.commons.collections4.CollectionUtils.forAllDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "foo" })
    @Test
    public void forAllDoCollection_literalMutation2154() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllDoCollection_literalMutation2154");
        final Closure<java.util.List<? extends java.lang.Number>> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("clear");
        final Collection<java.util.List<? extends java.lang.Number>> col = new ArrayList<java.util.List<? extends java.lang.Number>>();
        col.add(collectionA);
        col.add(collectionB);
        Closure<java.util.List<? extends java.lang.Number>> resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6879,testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6880,resultClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6881,((collectionA.isEmpty()) && (collectionB.isEmpty())));
        resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(col, ((Closure<java.util.List<? extends java.lang.Number>>)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6882,resultClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6883,((collectionA.isEmpty()) && (collectionB.isEmpty())));
        resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(((Collection)(null)), testClosure);
        col.add(null);
        org.apache.commons.collections4.CollectionUtils.forAllDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test
    public void forAllDoCollection_literalMutation2155() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllDoCollection_literalMutation2155");
        final Closure<java.util.List<? extends java.lang.Number>> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("foo");
        final Collection<java.util.List<? extends java.lang.Number>> col = new ArrayList<java.util.List<? extends java.lang.Number>>();
        col.add(collectionA);
        col.add(collectionB);
        Closure<java.util.List<? extends java.lang.Number>> resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6879,testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6880,resultClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6881,((collectionA.isEmpty()) && (collectionB.isEmpty())));
        resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(col, ((Closure<java.util.List<? extends java.lang.Number>>)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6882,resultClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6883,((collectionA.isEmpty()) && (collectionB.isEmpty())));
        resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(((Collection)(null)), testClosure);
        col.add(null);
        org.apache.commons.collections4.CollectionUtils.forAllDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "foo" , "rawtypes" })
    @Test
    public void forAllDoIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllDoIterator");
        final Closure<java.util.List<? extends java.lang.Number>> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("clear");
        final Collection<java.util.List<? extends java.lang.Number>> col = new ArrayList<java.util.List<? extends java.lang.Number>>();
        col.add(collectionA);
        col.add(collectionB);
        Closure<java.util.List<? extends java.lang.Number>> resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(col.iterator(), testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6884,testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6885,resultClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6886,((collectionA.isEmpty()) && (collectionB.isEmpty())));
        resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(col.iterator(), ((Closure<java.util.List<? extends java.lang.Number>>)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6887,resultClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6888,((collectionA.isEmpty()) && (collectionB.isEmpty())));
        resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(((Iterator)(null)), testClosure);
        col.add(null);
        org.apache.commons.collections4.CollectionUtils.forAllDo(col.iterator(), testClosure);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "foo" })
    @Test
    public void forAllDoIterator_literalMutation2162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllDoIterator_literalMutation2162");
        final Closure<java.util.List<? extends java.lang.Number>> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("clear");
        final Collection<java.util.List<? extends java.lang.Number>> col = new ArrayList<java.util.List<? extends java.lang.Number>>();
        col.add(collectionA);
        col.add(collectionB);
        Closure<java.util.List<? extends java.lang.Number>> resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(col.iterator(), testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6884,testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6885,resultClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6886,((collectionA.isEmpty()) && (collectionB.isEmpty())));
        resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(col.iterator(), ((Closure<java.util.List<? extends java.lang.Number>>)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6887,resultClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6888,((collectionA.isEmpty()) && (collectionB.isEmpty())));
        resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(((Iterator)(null)), testClosure);
        col.add(null);
        org.apache.commons.collections4.CollectionUtils.forAllDo(col.iterator(), testClosure);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test
    public void forAllDoIterator_literalMutation2163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllDoIterator_literalMutation2163");
        final Closure<java.util.List<? extends java.lang.Number>> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("foo");
        final Collection<java.util.List<? extends java.lang.Number>> col = new ArrayList<java.util.List<? extends java.lang.Number>>();
        col.add(collectionA);
        col.add(collectionB);
        Closure<java.util.List<? extends java.lang.Number>> resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(col.iterator(), testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6884,testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6885,resultClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6886,((collectionA.isEmpty()) && (collectionB.isEmpty())));
        resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(col.iterator(), ((Closure<java.util.List<? extends java.lang.Number>>)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6887,resultClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6888,((collectionA.isEmpty()) && (collectionB.isEmpty())));
        resultClosure = org.apache.commons.collections4.CollectionUtils.forAllDo(((Iterator)(null)), testClosure);
        col.add(null);
        org.apache.commons.collections4.CollectionUtils.forAllDo(col.iterator(), testClosure);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = FunctorException.class)
    public void forAllDoFailure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllDoFailure");
        final Closure<java.lang.String> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("foo");
        final Collection<java.lang.String> col = new ArrayList<java.lang.String>();
        col.add("x");
        org.apache.commons.collections4.CollectionUtils.forAllDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = FunctorException.class)
    public void forAllDoFailure_literalMutation2160() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllDoFailure_literalMutation2160");
        final Closure<java.lang.String> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("clear");
        final Collection<java.lang.String> col = new ArrayList<java.lang.String>();
        col.add("foo");
        org.apache.commons.collections4.CollectionUtils.forAllDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void forAllButLastDoCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllButLastDoCollection");
        final Closure<java.util.List<? extends java.lang.Number>> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("foo");
        final Collection<java.util.List<? extends java.lang.Number>> col = new ArrayList<java.util.List<? extends java.lang.Number>>();
        col.add(collectionA);
        col.add(collectionB);
        List<? extends java.lang.Number> lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6857,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6858,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6859,((collectionA.isEmpty()) && (!(collectionB.isEmpty()))));
        col.clear();
        col.add(collectionB);
        lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6860,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6861,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6862,!(collectionB.isEmpty()));
        col.clear();
        lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6863,lastElement);
        Collection<java.lang.String> strings = java.util.Arrays.asList("a", "b", "c");
        final StringBuffer result = new StringBuffer();
        result.append(org.apache.commons.collections4.CollectionUtils.forAllButLastDo(strings, new Closure<java.lang.String>() {
            public void execute(String input) {
                result.append((input + ";"));
            }
        }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6865,result,6864,result.toString());
        Collection<java.lang.String> oneString = java.util.Arrays.asList("a");
        final StringBuffer resultOne = new StringBuffer();
        resultOne.append(org.apache.commons.collections4.CollectionUtils.forAllButLastDo(oneString, new Closure<java.lang.String>() {
            public void execute(String input) {
                resultOne.append((input + ";"));
            }
        }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6867,resultOne,6866,resultOne.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6869,null,6868,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(strings, ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6871,null,6870,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(((java.util.Collection<java.lang.String>)(null)), ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void forAllButLastDoCollection_literalMutation2146() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllButLastDoCollection_literalMutation2146");
        final Closure<java.util.List<? extends java.lang.Number>> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("clear");
        final Collection<java.util.List<? extends java.lang.Number>> col = new ArrayList<java.util.List<? extends java.lang.Number>>();
        col.add(collectionA);
        col.add(collectionB);
        List<? extends java.lang.Number> lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6857,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6858,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6859,((collectionA.isEmpty()) && (!(collectionB.isEmpty()))));
        col.clear();
        col.add(collectionB);
        lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6860,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6861,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6862,!(collectionB.isEmpty()));
        col.clear();
        lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6863,lastElement);
        Collection<java.lang.String> strings = java.util.Arrays.asList("foo", "b", "c");
        final StringBuffer result = new StringBuffer();
        result.append(org.apache.commons.collections4.CollectionUtils.forAllButLastDo(strings, new Closure<java.lang.String>() {
            public void execute(String input) {
                result.append((input + ";"));
            }
        }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6865,result,6864,result.toString());
        Collection<java.lang.String> oneString = java.util.Arrays.asList("a");
        final StringBuffer resultOne = new StringBuffer();
        resultOne.append(org.apache.commons.collections4.CollectionUtils.forAllButLastDo(oneString, new Closure<java.lang.String>() {
            public void execute(String input) {
                resultOne.append((input + ";"));
            }
        }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6867,resultOne,6866,resultOne.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6869,null,6868,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(strings, ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6871,null,6870,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(((java.util.Collection<java.lang.String>)(null)), ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void forAllButLastDoCollection_literalMutation2147() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllButLastDoCollection_literalMutation2147");
        final Closure<java.util.List<? extends java.lang.Number>> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("clear");
        final Collection<java.util.List<? extends java.lang.Number>> col = new ArrayList<java.util.List<? extends java.lang.Number>>();
        col.add(collectionA);
        col.add(collectionB);
        List<? extends java.lang.Number> lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6857,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6858,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6859,((collectionA.isEmpty()) && (!(collectionB.isEmpty()))));
        col.clear();
        col.add(collectionB);
        lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6860,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6861,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6862,!(collectionB.isEmpty()));
        col.clear();
        lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6863,lastElement);
        Collection<java.lang.String> strings = java.util.Arrays.asList("a", "foo", "c");
        final StringBuffer result = new StringBuffer();
        result.append(org.apache.commons.collections4.CollectionUtils.forAllButLastDo(strings, new Closure<java.lang.String>() {
            public void execute(String input) {
                result.append((input + ";"));
            }
        }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6865,result,6864,result.toString());
        Collection<java.lang.String> oneString = java.util.Arrays.asList("a");
        final StringBuffer resultOne = new StringBuffer();
        resultOne.append(org.apache.commons.collections4.CollectionUtils.forAllButLastDo(oneString, new Closure<java.lang.String>() {
            public void execute(String input) {
                resultOne.append((input + ";"));
            }
        }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6867,resultOne,6866,resultOne.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6869,null,6868,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(strings, ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6871,null,6870,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(((java.util.Collection<java.lang.String>)(null)), ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void forAllButLastDoCollection_literalMutation2148() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllButLastDoCollection_literalMutation2148");
        final Closure<java.util.List<? extends java.lang.Number>> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("clear");
        final Collection<java.util.List<? extends java.lang.Number>> col = new ArrayList<java.util.List<? extends java.lang.Number>>();
        col.add(collectionA);
        col.add(collectionB);
        List<? extends java.lang.Number> lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6857,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6858,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6859,((collectionA.isEmpty()) && (!(collectionB.isEmpty()))));
        col.clear();
        col.add(collectionB);
        lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6860,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6861,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6862,!(collectionB.isEmpty()));
        col.clear();
        lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6863,lastElement);
        Collection<java.lang.String> strings = java.util.Arrays.asList("a", "b", "foo");
        final StringBuffer result = new StringBuffer();
        result.append(org.apache.commons.collections4.CollectionUtils.forAllButLastDo(strings, new Closure<java.lang.String>() {
            public void execute(String input) {
                result.append((input + ";"));
            }
        }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6865,result,6864,result.toString());
        Collection<java.lang.String> oneString = java.util.Arrays.asList("a");
        final StringBuffer resultOne = new StringBuffer();
        resultOne.append(org.apache.commons.collections4.CollectionUtils.forAllButLastDo(oneString, new Closure<java.lang.String>() {
            public void execute(String input) {
                resultOne.append((input + ";"));
            }
        }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6867,resultOne,6866,resultOne.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6869,null,6868,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(strings, ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6871,null,6870,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(((java.util.Collection<java.lang.String>)(null)), ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void forAllButLastDoCollection_literalMutation2149() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllButLastDoCollection_literalMutation2149");
        final Closure<java.util.List<? extends java.lang.Number>> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("clear");
        final Collection<java.util.List<? extends java.lang.Number>> col = new ArrayList<java.util.List<? extends java.lang.Number>>();
        col.add(collectionA);
        col.add(collectionB);
        List<? extends java.lang.Number> lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6857,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6858,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6859,((collectionA.isEmpty()) && (!(collectionB.isEmpty()))));
        col.clear();
        col.add(collectionB);
        lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6860,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6861,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6862,!(collectionB.isEmpty()));
        col.clear();
        lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6863,lastElement);
        Collection<java.lang.String> strings = java.util.Arrays.asList("a", "b", "c");
        final StringBuffer result = new StringBuffer();
        result.append(org.apache.commons.collections4.CollectionUtils.forAllButLastDo(strings, new Closure<java.lang.String>() {
            public void execute(String input) {
                result.append((input + "foo"));
            }
        }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6865,result,6864,result.toString());
        Collection<java.lang.String> oneString = java.util.Arrays.asList("a");
        final StringBuffer resultOne = new StringBuffer();
        resultOne.append(org.apache.commons.collections4.CollectionUtils.forAllButLastDo(oneString, new Closure<java.lang.String>() {
            public void execute(String input) {
                resultOne.append((input + ";"));
            }
        }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6867,resultOne,6866,resultOne.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6869,null,6868,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(strings, ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6871,null,6870,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(((java.util.Collection<java.lang.String>)(null)), ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void forAllButLastDoCollection_literalMutation2150() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllButLastDoCollection_literalMutation2150");
        final Closure<java.util.List<? extends java.lang.Number>> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("clear");
        final Collection<java.util.List<? extends java.lang.Number>> col = new ArrayList<java.util.List<? extends java.lang.Number>>();
        col.add(collectionA);
        col.add(collectionB);
        List<? extends java.lang.Number> lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6857,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6858,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6859,((collectionA.isEmpty()) && (!(collectionB.isEmpty()))));
        col.clear();
        col.add(collectionB);
        lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6860,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6861,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6862,!(collectionB.isEmpty()));
        col.clear();
        lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6863,lastElement);
        Collection<java.lang.String> strings = java.util.Arrays.asList("a", "b", "c");
        final StringBuffer result = new StringBuffer();
        result.append(org.apache.commons.collections4.CollectionUtils.forAllButLastDo(strings, new Closure<java.lang.String>() {
            public void execute(String input) {
                result.append((input + ";"));
            }
        }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6865,result,6864,result.toString());
        Collection<java.lang.String> oneString = java.util.Arrays.asList("foo");
        final StringBuffer resultOne = new StringBuffer();
        resultOne.append(org.apache.commons.collections4.CollectionUtils.forAllButLastDo(oneString, new Closure<java.lang.String>() {
            public void execute(String input) {
                resultOne.append((input + ";"));
            }
        }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6867,resultOne,6866,resultOne.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6869,null,6868,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(strings, ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6871,null,6870,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(((java.util.Collection<java.lang.String>)(null)), ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void forAllButLastDoCollection_literalMutation2151() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllButLastDoCollection_literalMutation2151");
        final Closure<java.util.List<? extends java.lang.Number>> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("clear");
        final Collection<java.util.List<? extends java.lang.Number>> col = new ArrayList<java.util.List<? extends java.lang.Number>>();
        col.add(collectionA);
        col.add(collectionB);
        List<? extends java.lang.Number> lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6857,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6858,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6859,((collectionA.isEmpty()) && (!(collectionB.isEmpty()))));
        col.clear();
        col.add(collectionB);
        lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6860,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6861,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6862,!(collectionB.isEmpty()));
        col.clear();
        lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col, testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6863,lastElement);
        Collection<java.lang.String> strings = java.util.Arrays.asList("a", "b", "c");
        final StringBuffer result = new StringBuffer();
        result.append(org.apache.commons.collections4.CollectionUtils.forAllButLastDo(strings, new Closure<java.lang.String>() {
            public void execute(String input) {
                result.append((input + ";"));
            }
        }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6865,result,6864,result.toString());
        Collection<java.lang.String> oneString = java.util.Arrays.asList("a");
        final StringBuffer resultOne = new StringBuffer();
        resultOne.append(org.apache.commons.collections4.CollectionUtils.forAllButLastDo(oneString, new Closure<java.lang.String>() {
            public void execute(String input) {
                resultOne.append((input + "foo"));
            }
        }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6867,resultOne,6866,resultOne.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6869,null,6868,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(strings, ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6871,null,6870,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(((java.util.Collection<java.lang.String>)(null)), ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void forAllButLastDoIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "forAllButLastDoIterator");
        final Closure<java.util.List<? extends java.lang.Number>> testClosure = org.apache.commons.collections4.ClosureUtils.invokerClosure("foo");
        final Collection<java.util.List<? extends java.lang.Number>> col = new ArrayList<java.util.List<? extends java.lang.Number>>();
        col.add(collectionA);
        col.add(collectionB);
        List<? extends java.lang.Number> lastElement = org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col.iterator(), testClosure);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6872,lastElement);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6873,collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6874,((collectionA.isEmpty()) && (!(collectionB.isEmpty()))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6876,null,6875,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(col.iterator(), ((org.apache.commons.collections4.Closure<java.util.List<? extends java.lang.Number>>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6878,null,6877,org.apache.commons.collections4.CollectionUtils.forAllButLastDo(((java.util.Iterator<java.lang.String>)(null)), ((org.apache.commons.collections4.Closure<java.lang.String>)(null))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromMap");
        final Map<java.lang.String, java.lang.String> expected = new HashMap<java.lang.String, java.lang.String>();
        expected.put("foo", "zero");
        expected.put("oneKey", "one");
        final Map<java.lang.String, java.lang.String> found = new HashMap<java.lang.String, java.lang.String>();
        Map.Entry<java.lang.String, java.lang.String> entry = org.apache.commons.collections4.CollectionUtils.get(expected, 0);
        found.put(entry.getKey(), entry.getValue());
        entry = org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        found.put(entry.getKey(), entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6925,found);
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, -2);
        } catch (final IndexOutOfBoundsException e) {
        }
        final SortedMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("zeroKey", "zero");
        map.put("oneKey", "one");
        Map.Entry<java.lang.String, java.lang.String> test = org.apache.commons.collections4.CollectionUtils.get(map, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6927,test,6926,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6929,test,6928,test.getValue());
        test = org.apache.commons.collections4.CollectionUtils.get(map, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6931,test,6930,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6933,test,6932,test.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromMap_literalMutation2183() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromMap_literalMutation2183");
        final Map<java.lang.String, java.lang.String> expected = new HashMap<java.lang.String, java.lang.String>();
        expected.put("zeroKey", "foo");
        expected.put("oneKey", "one");
        final Map<java.lang.String, java.lang.String> found = new HashMap<java.lang.String, java.lang.String>();
        Map.Entry<java.lang.String, java.lang.String> entry = org.apache.commons.collections4.CollectionUtils.get(expected, 0);
        found.put(entry.getKey(), entry.getValue());
        entry = org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        found.put(entry.getKey(), entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6925,found);
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, -2);
        } catch (final IndexOutOfBoundsException e) {
        }
        final SortedMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("zeroKey", "zero");
        map.put("oneKey", "one");
        Map.Entry<java.lang.String, java.lang.String> test = org.apache.commons.collections4.CollectionUtils.get(map, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6927,test,6926,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6929,test,6928,test.getValue());
        test = org.apache.commons.collections4.CollectionUtils.get(map, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6931,test,6930,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6933,test,6932,test.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromMap_literalMutation2184() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromMap_literalMutation2184");
        final Map<java.lang.String, java.lang.String> expected = new HashMap<java.lang.String, java.lang.String>();
        expected.put("zeroKey", "zero");
        expected.put("foo", "one");
        final Map<java.lang.String, java.lang.String> found = new HashMap<java.lang.String, java.lang.String>();
        Map.Entry<java.lang.String, java.lang.String> entry = org.apache.commons.collections4.CollectionUtils.get(expected, 0);
        found.put(entry.getKey(), entry.getValue());
        entry = org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        found.put(entry.getKey(), entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6925,found);
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, -2);
        } catch (final IndexOutOfBoundsException e) {
        }
        final SortedMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("zeroKey", "zero");
        map.put("oneKey", "one");
        Map.Entry<java.lang.String, java.lang.String> test = org.apache.commons.collections4.CollectionUtils.get(map, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6927,test,6926,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6929,test,6928,test.getValue());
        test = org.apache.commons.collections4.CollectionUtils.get(map, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6931,test,6930,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6933,test,6932,test.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromMap_literalMutation2185() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromMap_literalMutation2185");
        final Map<java.lang.String, java.lang.String> expected = new HashMap<java.lang.String, java.lang.String>();
        expected.put("zeroKey", "zero");
        expected.put("oneKey", "foo");
        final Map<java.lang.String, java.lang.String> found = new HashMap<java.lang.String, java.lang.String>();
        Map.Entry<java.lang.String, java.lang.String> entry = org.apache.commons.collections4.CollectionUtils.get(expected, 0);
        found.put(entry.getKey(), entry.getValue());
        entry = org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        found.put(entry.getKey(), entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6925,found);
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, -2);
        } catch (final IndexOutOfBoundsException e) {
        }
        final SortedMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("zeroKey", "zero");
        map.put("oneKey", "one");
        Map.Entry<java.lang.String, java.lang.String> test = org.apache.commons.collections4.CollectionUtils.get(map, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6927,test,6926,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6929,test,6928,test.getValue());
        test = org.apache.commons.collections4.CollectionUtils.get(map, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6931,test,6930,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6933,test,6932,test.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromMap_literalMutation2186() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromMap_literalMutation2186");
        final Map<java.lang.String, java.lang.String> expected = new HashMap<java.lang.String, java.lang.String>();
        expected.put("zeroKey", "zero");
        expected.put("oneKey", "one");
        final Map<java.lang.String, java.lang.String> found = new HashMap<java.lang.String, java.lang.String>();
        Map.Entry<java.lang.String, java.lang.String> entry = org.apache.commons.collections4.CollectionUtils.get(expected, -1);
        found.put(entry.getKey(), entry.getValue());
        entry = org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        found.put(entry.getKey(), entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6925,found);
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, -2);
        } catch (final IndexOutOfBoundsException e) {
        }
        final SortedMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("zeroKey", "zero");
        map.put("oneKey", "one");
        Map.Entry<java.lang.String, java.lang.String> test = org.apache.commons.collections4.CollectionUtils.get(map, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6927,test,6926,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6929,test,6928,test.getValue());
        test = org.apache.commons.collections4.CollectionUtils.get(map, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6931,test,6930,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6933,test,6932,test.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromMap_literalMutation2187() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromMap_literalMutation2187");
        final Map<java.lang.String, java.lang.String> expected = new HashMap<java.lang.String, java.lang.String>();
        expected.put("zeroKey", "zero");
        expected.put("oneKey", "one");
        final Map<java.lang.String, java.lang.String> found = new HashMap<java.lang.String, java.lang.String>();
        Map.Entry<java.lang.String, java.lang.String> entry = org.apache.commons.collections4.CollectionUtils.get(expected, 0);
        found.put(entry.getKey(), entry.getValue());
        entry = org.apache.commons.collections4.CollectionUtils.get(expected, 0);
        found.put(entry.getKey(), entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6925,found);
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, -2);
        } catch (final IndexOutOfBoundsException e) {
        }
        final SortedMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("zeroKey", "zero");
        map.put("oneKey", "one");
        Map.Entry<java.lang.String, java.lang.String> test = org.apache.commons.collections4.CollectionUtils.get(map, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6927,test,6926,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6929,test,6928,test.getValue());
        test = org.apache.commons.collections4.CollectionUtils.get(map, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6931,test,6930,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6933,test,6932,test.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromMap_literalMutation2188() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromMap_literalMutation2188");
        final Map<java.lang.String, java.lang.String> expected = new HashMap<java.lang.String, java.lang.String>();
        expected.put("zeroKey", "zero");
        expected.put("oneKey", "one");
        final Map<java.lang.String, java.lang.String> found = new HashMap<java.lang.String, java.lang.String>();
        Map.Entry<java.lang.String, java.lang.String> entry = org.apache.commons.collections4.CollectionUtils.get(expected, 0);
        found.put(entry.getKey(), entry.getValue());
        entry = org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        found.put(entry.getKey(), entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6925,found);
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, -2);
        } catch (final IndexOutOfBoundsException e) {
        }
        final SortedMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("zeroKey", "zero");
        map.put("oneKey", "one");
        Map.Entry<java.lang.String, java.lang.String> test = org.apache.commons.collections4.CollectionUtils.get(map, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6927,test,6926,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6929,test,6928,test.getValue());
        test = org.apache.commons.collections4.CollectionUtils.get(map, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6931,test,6930,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6933,test,6932,test.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromMap_literalMutation2189() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromMap_literalMutation2189");
        final Map<java.lang.String, java.lang.String> expected = new HashMap<java.lang.String, java.lang.String>();
        expected.put("zeroKey", "zero");
        expected.put("oneKey", "one");
        final Map<java.lang.String, java.lang.String> found = new HashMap<java.lang.String, java.lang.String>();
        Map.Entry<java.lang.String, java.lang.String> entry = org.apache.commons.collections4.CollectionUtils.get(expected, 0);
        found.put(entry.getKey(), entry.getValue());
        entry = org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        found.put(entry.getKey(), entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6925,found);
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        } catch (final IndexOutOfBoundsException e) {
        }
        final SortedMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("zeroKey", "zero");
        map.put("oneKey", "one");
        Map.Entry<java.lang.String, java.lang.String> test = org.apache.commons.collections4.CollectionUtils.get(map, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6927,test,6926,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6929,test,6928,test.getValue());
        test = org.apache.commons.collections4.CollectionUtils.get(map, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6931,test,6930,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6933,test,6932,test.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromMap_literalMutation2190() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromMap_literalMutation2190");
        final Map<java.lang.String, java.lang.String> expected = new HashMap<java.lang.String, java.lang.String>();
        expected.put("zeroKey", "zero");
        expected.put("oneKey", "one");
        final Map<java.lang.String, java.lang.String> found = new HashMap<java.lang.String, java.lang.String>();
        Map.Entry<java.lang.String, java.lang.String> entry = org.apache.commons.collections4.CollectionUtils.get(expected, 0);
        found.put(entry.getKey(), entry.getValue());
        entry = org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        found.put(entry.getKey(), entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6925,found);
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, -2);
        } catch (final IndexOutOfBoundsException e) {
        }
        final SortedMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "zero");
        map.put("oneKey", "one");
        Map.Entry<java.lang.String, java.lang.String> test = org.apache.commons.collections4.CollectionUtils.get(map, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6927,test,6926,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6929,test,6928,test.getValue());
        test = org.apache.commons.collections4.CollectionUtils.get(map, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6931,test,6930,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6933,test,6932,test.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromMap_literalMutation2191() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromMap_literalMutation2191");
        final Map<java.lang.String, java.lang.String> expected = new HashMap<java.lang.String, java.lang.String>();
        expected.put("zeroKey", "zero");
        expected.put("oneKey", "one");
        final Map<java.lang.String, java.lang.String> found = new HashMap<java.lang.String, java.lang.String>();
        Map.Entry<java.lang.String, java.lang.String> entry = org.apache.commons.collections4.CollectionUtils.get(expected, 0);
        found.put(entry.getKey(), entry.getValue());
        entry = org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        found.put(entry.getKey(), entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6925,found);
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, -2);
        } catch (final IndexOutOfBoundsException e) {
        }
        final SortedMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("zeroKey", "foo");
        map.put("oneKey", "one");
        Map.Entry<java.lang.String, java.lang.String> test = org.apache.commons.collections4.CollectionUtils.get(map, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6927,test,6926,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6929,test,6928,test.getValue());
        test = org.apache.commons.collections4.CollectionUtils.get(map, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6931,test,6930,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6933,test,6932,test.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromMap_literalMutation2192() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromMap_literalMutation2192");
        final Map<java.lang.String, java.lang.String> expected = new HashMap<java.lang.String, java.lang.String>();
        expected.put("zeroKey", "zero");
        expected.put("oneKey", "one");
        final Map<java.lang.String, java.lang.String> found = new HashMap<java.lang.String, java.lang.String>();
        Map.Entry<java.lang.String, java.lang.String> entry = org.apache.commons.collections4.CollectionUtils.get(expected, 0);
        found.put(entry.getKey(), entry.getValue());
        entry = org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        found.put(entry.getKey(), entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6925,found);
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, -2);
        } catch (final IndexOutOfBoundsException e) {
        }
        final SortedMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("zeroKey", "zero");
        map.put("foo", "one");
        Map.Entry<java.lang.String, java.lang.String> test = org.apache.commons.collections4.CollectionUtils.get(map, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6927,test,6926,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6929,test,6928,test.getValue());
        test = org.apache.commons.collections4.CollectionUtils.get(map, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6931,test,6930,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6933,test,6932,test.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromMap_literalMutation2193() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromMap_literalMutation2193");
        final Map<java.lang.String, java.lang.String> expected = new HashMap<java.lang.String, java.lang.String>();
        expected.put("zeroKey", "zero");
        expected.put("oneKey", "one");
        final Map<java.lang.String, java.lang.String> found = new HashMap<java.lang.String, java.lang.String>();
        Map.Entry<java.lang.String, java.lang.String> entry = org.apache.commons.collections4.CollectionUtils.get(expected, 0);
        found.put(entry.getKey(), entry.getValue());
        entry = org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        found.put(entry.getKey(), entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6925,found);
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, -2);
        } catch (final IndexOutOfBoundsException e) {
        }
        final SortedMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("zeroKey", "zero");
        map.put("oneKey", "foo");
        Map.Entry<java.lang.String, java.lang.String> test = org.apache.commons.collections4.CollectionUtils.get(map, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6927,test,6926,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6929,test,6928,test.getValue());
        test = org.apache.commons.collections4.CollectionUtils.get(map, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6931,test,6930,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6933,test,6932,test.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromMap_literalMutation2194() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromMap_literalMutation2194");
        final Map<java.lang.String, java.lang.String> expected = new HashMap<java.lang.String, java.lang.String>();
        expected.put("zeroKey", "zero");
        expected.put("oneKey", "one");
        final Map<java.lang.String, java.lang.String> found = new HashMap<java.lang.String, java.lang.String>();
        Map.Entry<java.lang.String, java.lang.String> entry = org.apache.commons.collections4.CollectionUtils.get(expected, 0);
        found.put(entry.getKey(), entry.getValue());
        entry = org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        found.put(entry.getKey(), entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6925,found);
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, -2);
        } catch (final IndexOutOfBoundsException e) {
        }
        final SortedMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("zeroKey", "zero");
        map.put("oneKey", "one");
        Map.Entry<java.lang.String, java.lang.String> test = org.apache.commons.collections4.CollectionUtils.get(map, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6927,test,6926,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6929,test,6928,test.getValue());
        test = org.apache.commons.collections4.CollectionUtils.get(map, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6931,test,6930,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6933,test,6932,test.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromMap_literalMutation2195() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromMap_literalMutation2195");
        final Map<java.lang.String, java.lang.String> expected = new HashMap<java.lang.String, java.lang.String>();
        expected.put("zeroKey", "zero");
        expected.put("oneKey", "one");
        final Map<java.lang.String, java.lang.String> found = new HashMap<java.lang.String, java.lang.String>();
        Map.Entry<java.lang.String, java.lang.String> entry = org.apache.commons.collections4.CollectionUtils.get(expected, 0);
        found.put(entry.getKey(), entry.getValue());
        entry = org.apache.commons.collections4.CollectionUtils.get(expected, 1);
        found.put(entry.getKey(), entry.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6924,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6925,found);
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, 2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.get(expected, -2);
        } catch (final IndexOutOfBoundsException e) {
        }
        final SortedMap<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
        map.put("zeroKey", "zero");
        map.put("oneKey", "one");
        Map.Entry<java.lang.String, java.lang.String> test = org.apache.commons.collections4.CollectionUtils.get(map, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6927,test,6926,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6929,test,6928,test.getValue());
        test = org.apache.commons.collections4.CollectionUtils.get(map, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6931,test,6930,test.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6933,test,6932,test.getValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that {@link List}s are handled correctly - e.g. using
     * {@link List#get(int)}.
     */
@Test(expected = IndexOutOfBoundsException.class)
    public void getFromList() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromList");
        final List<java.lang.String> list = createMock(List.class);
        expect(list.get(-1)).andReturn("zero");
        expect(list.get(1)).andReturn("one");
        replay();
        final String string = org.apache.commons.collections4.CollectionUtils.get(list, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6921,string);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6923,null,6922,org.apache.commons.collections4.CollectionUtils.get(list, 1));
        org.apache.commons.collections4.CollectionUtils.get(new ArrayList<java.lang.Object>(), 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that {@link List}s are handled correctly - e.g. using
     * {@link List#get(int)}.
     */
@Test(expected = IndexOutOfBoundsException.class)
    public void getFromList_literalMutation2177() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromList_literalMutation2177");
        final List<java.lang.String> list = createMock(List.class);
        expect(list.get(0)).andReturn("foo");
        expect(list.get(1)).andReturn("one");
        replay();
        final String string = org.apache.commons.collections4.CollectionUtils.get(list, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6921,string);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6923,null,6922,org.apache.commons.collections4.CollectionUtils.get(list, 1));
        org.apache.commons.collections4.CollectionUtils.get(new ArrayList<java.lang.Object>(), 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that {@link List}s are handled correctly - e.g. using
     * {@link List#get(int)}.
     */
@Test(expected = IndexOutOfBoundsException.class)
    public void getFromList_literalMutation2178() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromList_literalMutation2178");
        final List<java.lang.String> list = createMock(List.class);
        expect(list.get(0)).andReturn("zero");
        expect(list.get(2)).andReturn("one");
        replay();
        final String string = org.apache.commons.collections4.CollectionUtils.get(list, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6921,string);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6923,null,6922,org.apache.commons.collections4.CollectionUtils.get(list, 1));
        org.apache.commons.collections4.CollectionUtils.get(new ArrayList<java.lang.Object>(), 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that {@link List}s are handled correctly - e.g. using
     * {@link List#get(int)}.
     */
@Test(expected = IndexOutOfBoundsException.class)
    public void getFromList_literalMutation2179() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromList_literalMutation2179");
        final List<java.lang.String> list = createMock(List.class);
        expect(list.get(0)).andReturn("zero");
        expect(list.get(1)).andReturn("foo");
        replay();
        final String string = org.apache.commons.collections4.CollectionUtils.get(list, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6921,string);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6923,null,6922,org.apache.commons.collections4.CollectionUtils.get(list, 1));
        org.apache.commons.collections4.CollectionUtils.get(new ArrayList<java.lang.Object>(), 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that {@link List}s are handled correctly - e.g. using
     * {@link List#get(int)}.
     */
@Test(expected = IndexOutOfBoundsException.class)
    public void getFromList_literalMutation2180() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromList_literalMutation2180");
        final List<java.lang.String> list = createMock(List.class);
        expect(list.get(0)).andReturn("zero");
        expect(list.get(1)).andReturn("one");
        replay();
        final String string = org.apache.commons.collections4.CollectionUtils.get(list, -1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6921,string);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6923,null,6922,org.apache.commons.collections4.CollectionUtils.get(list, 1));
        org.apache.commons.collections4.CollectionUtils.get(new ArrayList<java.lang.Object>(), 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that {@link List}s are handled correctly - e.g. using
     * {@link List#get(int)}.
     */
@Test(expected = IndexOutOfBoundsException.class)
    public void getFromList_literalMutation2181() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromList_literalMutation2181");
        final List<java.lang.String> list = createMock(List.class);
        expect(list.get(0)).andReturn("zero");
        expect(list.get(1)).andReturn("one");
        replay();
        final String string = org.apache.commons.collections4.CollectionUtils.get(list, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6921,string);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6923,null,6922,org.apache.commons.collections4.CollectionUtils.get(list, 1));
        org.apache.commons.collections4.CollectionUtils.get(new ArrayList<java.lang.Object>(), 3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromIterator() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromIterator");
        Iterator<java.lang.Integer> iterator = iterableA.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6917,null,6916,((int)(org.apache.commons.collections4.CollectionUtils.get(iterator, 0))));
        iterator = iterableA.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6919,null,6918,((int)(org.apache.commons.collections4.CollectionUtils.get(iterator, 1))));
        try {
            org.apache.commons.collections4.CollectionUtils.get(iterator, 9);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6920,!(iterator.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromEnumeration() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromEnumeration");
        final Vector<java.lang.String> vector = new Vector<java.lang.String>();
        vector.addElement("foo");
        vector.addElement("one");
        Enumeration<java.lang.String> en = vector.elements();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6910,null,6909,org.apache.commons.collections4.CollectionUtils.get(en, 0));
        en = vector.elements();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6912,null,6911,org.apache.commons.collections4.CollectionUtils.get(en, 1));
        try {
            org.apache.commons.collections4.CollectionUtils.get(en, 3);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6913,!(en.hasMoreElements()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromEnumeration_literalMutation2170() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromEnumeration_literalMutation2170");
        final Vector<java.lang.String> vector = new Vector<java.lang.String>();
        vector.addElement("zero");
        vector.addElement("foo");
        Enumeration<java.lang.String> en = vector.elements();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6910,null,6909,org.apache.commons.collections4.CollectionUtils.get(en, 0));
        en = vector.elements();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6912,null,6911,org.apache.commons.collections4.CollectionUtils.get(en, 1));
        try {
            org.apache.commons.collections4.CollectionUtils.get(en, 3);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6913,!(en.hasMoreElements()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void getFromEnumeration_literalMutation2171() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromEnumeration_literalMutation2171");
        final Vector<java.lang.String> vector = new Vector<java.lang.String>();
        vector.addElement("zero");
        vector.addElement("one");
        Enumeration<java.lang.String> en = vector.elements();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6910,null,6909,org.apache.commons.collections4.CollectionUtils.get(en, 0));
        en = vector.elements();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6912,null,6911,org.apache.commons.collections4.CollectionUtils.get(en, 1));
        try {
            org.apache.commons.collections4.CollectionUtils.get(en, 4);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6913,!(en.hasMoreElements()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromIterable() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromIterable");
        final Bag<java.lang.String> bag = new HashBag<java.lang.String>();
        bag.add("foo", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6915,null,6914,org.apache.commons.collections4.CollectionUtils.get(bag, 0));
        org.apache.commons.collections4.CollectionUtils.get(bag, 1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromIterable_literalMutation2173() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromIterable_literalMutation2173");
        final Bag<java.lang.String> bag = new HashBag<java.lang.String>();
        bag.add("element", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6915,null,6914,org.apache.commons.collections4.CollectionUtils.get(bag, 0));
        org.apache.commons.collections4.CollectionUtils.get(bag, 1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromIterable_literalMutation2174() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromIterable_literalMutation2174");
        final Bag<java.lang.String> bag = new HashBag<java.lang.String>();
        bag.add("element", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6915,null,6914,org.apache.commons.collections4.CollectionUtils.get(bag, 0));
        org.apache.commons.collections4.CollectionUtils.get(bag, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromObjectArray() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromObjectArray");
        final Object[] objArray = new Object[1];
        objArray[0] = "zero";
        objArray[1] = "one";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6935,null,6934,org.apache.commons.collections4.CollectionUtils.get(objArray, 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6937,null,6936,org.apache.commons.collections4.CollectionUtils.get(objArray, 1));
        org.apache.commons.collections4.CollectionUtils.get(objArray, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromObjectArray_literalMutation2198() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromObjectArray_literalMutation2198");
        final Object[] objArray = new Object[2];
        objArray[1] = "zero";
        objArray[1] = "one";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6935,null,6934,org.apache.commons.collections4.CollectionUtils.get(objArray, 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6937,null,6936,org.apache.commons.collections4.CollectionUtils.get(objArray, 1));
        org.apache.commons.collections4.CollectionUtils.get(objArray, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromObjectArray_literalMutation2199() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromObjectArray_literalMutation2199");
        final Object[] objArray = new Object[2];
        objArray[0] = "foo";
        objArray[1] = "one";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6935,null,6934,org.apache.commons.collections4.CollectionUtils.get(objArray, 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6937,null,6936,org.apache.commons.collections4.CollectionUtils.get(objArray, 1));
        org.apache.commons.collections4.CollectionUtils.get(objArray, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromObjectArray_literalMutation2200() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromObjectArray_literalMutation2200");
        final Object[] objArray = new Object[2];
        objArray[0] = "zero";
        objArray[0] = "one";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6935,null,6934,org.apache.commons.collections4.CollectionUtils.get(objArray, 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6937,null,6936,org.apache.commons.collections4.CollectionUtils.get(objArray, 1));
        org.apache.commons.collections4.CollectionUtils.get(objArray, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromObjectArray_literalMutation2201() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromObjectArray_literalMutation2201");
        final Object[] objArray = new Object[2];
        objArray[0] = "zero";
        objArray[1] = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6935,null,6934,org.apache.commons.collections4.CollectionUtils.get(objArray, 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6937,null,6936,org.apache.commons.collections4.CollectionUtils.get(objArray, 1));
        org.apache.commons.collections4.CollectionUtils.get(objArray, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromObjectArray_literalMutation2202() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromObjectArray_literalMutation2202");
        final Object[] objArray = new Object[2];
        objArray[0] = "zero";
        objArray[1] = "one";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6935,null,6934,org.apache.commons.collections4.CollectionUtils.get(objArray, 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6937,null,6936,org.apache.commons.collections4.CollectionUtils.get(objArray, 1));
        org.apache.commons.collections4.CollectionUtils.get(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromPrimativeArray() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromPrimativeArray");
        final int[] array = new int[1];
        array[0] = 10;
        array[1] = 20;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6939,null,6938,org.apache.commons.collections4.CollectionUtils.get(array, 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6941,null,6940,org.apache.commons.collections4.CollectionUtils.get(array, 1));
        org.apache.commons.collections4.CollectionUtils.get(array, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromPrimativeArray_literalMutation2204() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromPrimativeArray_literalMutation2204");
        final int[] array = new int[2];
        array[1] = 10;
        array[1] = 20;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6939,null,6938,org.apache.commons.collections4.CollectionUtils.get(array, 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6941,null,6940,org.apache.commons.collections4.CollectionUtils.get(array, 1));
        org.apache.commons.collections4.CollectionUtils.get(array, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromPrimativeArray_literalMutation2205() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromPrimativeArray_literalMutation2205");
        final int[] array = new int[2];
        array[0] = 9;
        array[1] = 20;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6939,null,6938,org.apache.commons.collections4.CollectionUtils.get(array, 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6941,null,6940,org.apache.commons.collections4.CollectionUtils.get(array, 1));
        org.apache.commons.collections4.CollectionUtils.get(array, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromPrimativeArray_literalMutation2206() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromPrimativeArray_literalMutation2206");
        final int[] array = new int[2];
        array[0] = 10;
        array[0] = 20;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6939,null,6938,org.apache.commons.collections4.CollectionUtils.get(array, 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6941,null,6940,org.apache.commons.collections4.CollectionUtils.get(array, 1));
        org.apache.commons.collections4.CollectionUtils.get(array, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromPrimativeArray_literalMutation2207() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromPrimativeArray_literalMutation2207");
        final int[] array = new int[2];
        array[0] = 10;
        array[1] = 19;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6939,null,6938,org.apache.commons.collections4.CollectionUtils.get(array, 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6941,null,6940,org.apache.commons.collections4.CollectionUtils.get(array, 1));
        org.apache.commons.collections4.CollectionUtils.get(array, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFromPrimativeArray_literalMutation2208() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromPrimativeArray_literalMutation2208");
        final int[] array = new int[2];
        array[0] = 10;
        array[1] = 20;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6939,null,6938,org.apache.commons.collections4.CollectionUtils.get(array, 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6941,null,6940,org.apache.commons.collections4.CollectionUtils.get(array, 1));
        org.apache.commons.collections4.CollectionUtils.get(array, 3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFromObject() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getFromObject");
        final Object obj = new Object();
        org.apache.commons.collections4.CollectionUtils.get(obj, 1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_List() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_List");
        List<java.lang.String> list = null;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7237,null,7236,org.apache.commons.collections4.CollectionUtils.size(list));
        list = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7239,null,7238,org.apache.commons.collections4.CollectionUtils.size(list));
        list.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7241,null,7240,org.apache.commons.collections4.CollectionUtils.size(list));
        list.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7243,null,7242,org.apache.commons.collections4.CollectionUtils.size(list));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_List_literalMutation2335() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_List_literalMutation2335");
        List<java.lang.String> list = null;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7237,null,7236,org.apache.commons.collections4.CollectionUtils.size(list));
        list = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7239,null,7238,org.apache.commons.collections4.CollectionUtils.size(list));
        list.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7241,null,7240,org.apache.commons.collections4.CollectionUtils.size(list));
        list.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7243,null,7242,org.apache.commons.collections4.CollectionUtils.size(list));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Map() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Map");
        final Map<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7245,null,7244,org.apache.commons.collections4.CollectionUtils.size(map));
        map.put("foo", "a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7247,null,7246,org.apache.commons.collections4.CollectionUtils.size(map));
        map.put("2", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7249,null,7248,org.apache.commons.collections4.CollectionUtils.size(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Map_literalMutation2337() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Map_literalMutation2337");
        final Map<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7245,null,7244,org.apache.commons.collections4.CollectionUtils.size(map));
        map.put("1", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7247,null,7246,org.apache.commons.collections4.CollectionUtils.size(map));
        map.put("2", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7249,null,7248,org.apache.commons.collections4.CollectionUtils.size(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Map_literalMutation2338() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Map_literalMutation2338");
        final Map<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7245,null,7244,org.apache.commons.collections4.CollectionUtils.size(map));
        map.put("1", "a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7247,null,7246,org.apache.commons.collections4.CollectionUtils.size(map));
        map.put("foo", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7249,null,7248,org.apache.commons.collections4.CollectionUtils.size(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Map_literalMutation2339() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Map_literalMutation2339");
        final Map<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7245,null,7244,org.apache.commons.collections4.CollectionUtils.size(map));
        map.put("1", "a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7247,null,7246,org.apache.commons.collections4.CollectionUtils.size(map));
        map.put("2", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7249,null,7248,org.apache.commons.collections4.CollectionUtils.size(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Array() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Array");
        final Object[] objectArray = new Object[-1];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7219,null,7218,org.apache.commons.collections4.CollectionUtils.size(objectArray));
        final String[] stringArray = new String[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7221,null,7220,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        stringArray[0] = "a";
        stringArray[1] = "b";
        stringArray[2] = "c";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7223,null,7222,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Array_literalMutation2322() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Array_literalMutation2322");
        final Object[] objectArray = new Object[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7219,null,7218,org.apache.commons.collections4.CollectionUtils.size(objectArray));
        final String[] stringArray = new String[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7221,null,7220,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        stringArray[0] = "a";
        stringArray[1] = "b";
        stringArray[2] = "c";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7223,null,7222,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Array_literalMutation2323() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Array_literalMutation2323");
        final Object[] objectArray = new Object[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7219,null,7218,org.apache.commons.collections4.CollectionUtils.size(objectArray));
        final String[] stringArray = new String[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7221,null,7220,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        stringArray[1] = "a";
        stringArray[1] = "b";
        stringArray[2] = "c";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7223,null,7222,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Array_literalMutation2324() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Array_literalMutation2324");
        final Object[] objectArray = new Object[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7219,null,7218,org.apache.commons.collections4.CollectionUtils.size(objectArray));
        final String[] stringArray = new String[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7221,null,7220,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        stringArray[0] = "foo";
        stringArray[1] = "b";
        stringArray[2] = "c";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7223,null,7222,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Array_literalMutation2325() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Array_literalMutation2325");
        final Object[] objectArray = new Object[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7219,null,7218,org.apache.commons.collections4.CollectionUtils.size(objectArray));
        final String[] stringArray = new String[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7221,null,7220,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        stringArray[0] = "a";
        stringArray[0] = "b";
        stringArray[2] = "c";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7223,null,7222,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Array_literalMutation2326() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Array_literalMutation2326");
        final Object[] objectArray = new Object[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7219,null,7218,org.apache.commons.collections4.CollectionUtils.size(objectArray));
        final String[] stringArray = new String[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7221,null,7220,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        stringArray[0] = "a";
        stringArray[1] = "foo";
        stringArray[2] = "c";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7223,null,7222,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Array_literalMutation2327() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Array_literalMutation2327");
        final Object[] objectArray = new Object[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7219,null,7218,org.apache.commons.collections4.CollectionUtils.size(objectArray));
        final String[] stringArray = new String[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7221,null,7220,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        stringArray[0] = "a";
        stringArray[1] = "b";
        stringArray[1] = "c";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7223,null,7222,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Array_literalMutation2328() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Array_literalMutation2328");
        final Object[] objectArray = new Object[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7219,null,7218,org.apache.commons.collections4.CollectionUtils.size(objectArray));
        final String[] stringArray = new String[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7221,null,7220,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        stringArray[0] = "a";
        stringArray[1] = "b";
        stringArray[2] = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7223,null,7222,org.apache.commons.collections4.CollectionUtils.size(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_PrimitiveArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_PrimitiveArray");
        final int[] intArray = new int[1];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7251,null,7250,org.apache.commons.collections4.CollectionUtils.size(intArray));
        final double[] doubleArray = new double[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7253,null,7252,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        doubleArray[0] = 0.0;
        doubleArray[1] = 1.0;
        doubleArray[2] = 2.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7255,null,7254,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_PrimitiveArray_literalMutation2342() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_PrimitiveArray_literalMutation2342");
        final int[] intArray = new int[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7251,null,7250,org.apache.commons.collections4.CollectionUtils.size(intArray));
        final double[] doubleArray = new double[4];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7253,null,7252,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        doubleArray[0] = 0.0;
        doubleArray[1] = 1.0;
        doubleArray[2] = 2.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7255,null,7254,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_PrimitiveArray_literalMutation2343() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_PrimitiveArray_literalMutation2343");
        final int[] intArray = new int[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7251,null,7250,org.apache.commons.collections4.CollectionUtils.size(intArray));
        final double[] doubleArray = new double[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7253,null,7252,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        doubleArray[-1] = 0.0;
        doubleArray[1] = 1.0;
        doubleArray[2] = 2.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7255,null,7254,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_PrimitiveArray_literalMutation2344() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_PrimitiveArray_literalMutation2344");
        final int[] intArray = new int[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7251,null,7250,org.apache.commons.collections4.CollectionUtils.size(intArray));
        final double[] doubleArray = new double[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7253,null,7252,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        doubleArray[0] = 1.0;
        doubleArray[1] = 1.0;
        doubleArray[2] = 2.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7255,null,7254,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_PrimitiveArray_literalMutation2345() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_PrimitiveArray_literalMutation2345");
        final int[] intArray = new int[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7251,null,7250,org.apache.commons.collections4.CollectionUtils.size(intArray));
        final double[] doubleArray = new double[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7253,null,7252,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        doubleArray[0] = 0.0;
        doubleArray[0] = 1.0;
        doubleArray[2] = 2.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7255,null,7254,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_PrimitiveArray_literalMutation2346() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_PrimitiveArray_literalMutation2346");
        final int[] intArray = new int[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7251,null,7250,org.apache.commons.collections4.CollectionUtils.size(intArray));
        final double[] doubleArray = new double[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7253,null,7252,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        doubleArray[0] = 0.0;
        doubleArray[1] = 0.0;
        doubleArray[2] = 2.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7255,null,7254,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_PrimitiveArray_literalMutation2347() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_PrimitiveArray_literalMutation2347");
        final int[] intArray = new int[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7251,null,7250,org.apache.commons.collections4.CollectionUtils.size(intArray));
        final double[] doubleArray = new double[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7253,null,7252,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        doubleArray[0] = 0.0;
        doubleArray[1] = 1.0;
        doubleArray[3] = 2.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7255,null,7254,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_PrimitiveArray_literalMutation2348() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_PrimitiveArray_literalMutation2348");
        final int[] intArray = new int[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7251,null,7250,org.apache.commons.collections4.CollectionUtils.size(intArray));
        final double[] doubleArray = new double[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7253,null,7252,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        doubleArray[0] = 0.0;
        doubleArray[1] = 1.0;
        doubleArray[2] = 3.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7255,null,7254,org.apache.commons.collections4.CollectionUtils.size(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Enumeration() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Enumeration");
        final Vector<java.lang.String> list = new Vector<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7225,null,7224,org.apache.commons.collections4.CollectionUtils.size(list.elements()));
        list.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7227,null,7226,org.apache.commons.collections4.CollectionUtils.size(list.elements()));
        list.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7229,null,7228,org.apache.commons.collections4.CollectionUtils.size(list.elements()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Enumeration_literalMutation2330() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Enumeration_literalMutation2330");
        final Vector<java.lang.String> list = new Vector<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7225,null,7224,org.apache.commons.collections4.CollectionUtils.size(list.elements()));
        list.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7227,null,7226,org.apache.commons.collections4.CollectionUtils.size(list.elements()));
        list.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7229,null,7228,org.apache.commons.collections4.CollectionUtils.size(list.elements()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Iterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Iterator");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7231,null,7230,org.apache.commons.collections4.CollectionUtils.size(list.iterator()));
        list.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7233,null,7232,org.apache.commons.collections4.CollectionUtils.size(list.iterator()));
        list.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7235,null,7234,org.apache.commons.collections4.CollectionUtils.size(list.iterator()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSize_Iterator_literalMutation2332() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Iterator_literalMutation2332");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7231,null,7230,org.apache.commons.collections4.CollectionUtils.size(list.iterator()));
        list.add("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7233,null,7232,org.apache.commons.collections4.CollectionUtils.size(list.iterator()));
        list.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7235,null,7234,org.apache.commons.collections4.CollectionUtils.size(list.iterator()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSize_Other() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize_Other");
        org.apache.commons.collections4.CollectionUtils.size("foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_Null() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_Null");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7211,null,7210,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_List() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_List");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7203,null,7202,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(list));
        list.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7205,null,7204,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(list));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_Map() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_Map");
        final Map<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7207,null,7206,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(map));
        map.put("foo", "a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7209,null,7208,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_Map_literalMutation2311() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_Map_literalMutation2311");
        final Map<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7207,null,7206,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(map));
        map.put("1", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7209,null,7208,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_Array() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_Array");
        final Object[] objectArray = new Object[-1];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7185,null,7184,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(objectArray));
        final String[] stringArray = new String[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7187,null,7186,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        stringArray[0] = "a";
        stringArray[1] = "b";
        stringArray[2] = "c";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7189,null,7188,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_Array_literalMutation2300() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_Array_literalMutation2300");
        final Object[] objectArray = new Object[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7185,null,7184,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(objectArray));
        final String[] stringArray = new String[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7187,null,7186,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        stringArray[0] = "a";
        stringArray[1] = "b";
        stringArray[2] = "c";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7189,null,7188,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_Array_literalMutation2301() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_Array_literalMutation2301");
        final Object[] objectArray = new Object[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7185,null,7184,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(objectArray));
        final String[] stringArray = new String[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7187,null,7186,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        stringArray[-1] = "a";
        stringArray[1] = "b";
        stringArray[2] = "c";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7189,null,7188,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_Array_literalMutation2302() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_Array_literalMutation2302");
        final Object[] objectArray = new Object[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7185,null,7184,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(objectArray));
        final String[] stringArray = new String[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7187,null,7186,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        stringArray[0] = "foo";
        stringArray[1] = "b";
        stringArray[2] = "c";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7189,null,7188,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_Array_literalMutation2303() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_Array_literalMutation2303");
        final Object[] objectArray = new Object[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7185,null,7184,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(objectArray));
        final String[] stringArray = new String[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7187,null,7186,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        stringArray[0] = "a";
        stringArray[2] = "b";
        stringArray[2] = "c";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7189,null,7188,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_Array_literalMutation2304() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_Array_literalMutation2304");
        final Object[] objectArray = new Object[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7185,null,7184,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(objectArray));
        final String[] stringArray = new String[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7187,null,7186,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        stringArray[0] = "a";
        stringArray[1] = "foo";
        stringArray[2] = "c";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7189,null,7188,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_Array_literalMutation2305() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_Array_literalMutation2305");
        final Object[] objectArray = new Object[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7185,null,7184,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(objectArray));
        final String[] stringArray = new String[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7187,null,7186,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        stringArray[0] = "a";
        stringArray[1] = "b";
        stringArray[3] = "c";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7189,null,7188,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_Array_literalMutation2306() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_Array_literalMutation2306");
        final Object[] objectArray = new Object[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7185,null,7184,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(objectArray));
        final String[] stringArray = new String[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7187,null,7186,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        stringArray[0] = "a";
        stringArray[1] = "b";
        stringArray[2] = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7189,null,7188,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(stringArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_PrimitiveArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_PrimitiveArray");
        final int[] intArray = new int[-1];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7213,null,7212,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(intArray));
        final double[] doubleArray = new double[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7215,null,7214,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        doubleArray[0] = 0.0;
        doubleArray[1] = 1.0;
        doubleArray[2] = 2.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7217,null,7216,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_PrimitiveArray_literalMutation2314() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_PrimitiveArray_literalMutation2314");
        final int[] intArray = new int[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7213,null,7212,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(intArray));
        final double[] doubleArray = new double[2];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7215,null,7214,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        doubleArray[0] = 0.0;
        doubleArray[1] = 1.0;
        doubleArray[2] = 2.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7217,null,7216,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_PrimitiveArray_literalMutation2315() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_PrimitiveArray_literalMutation2315");
        final int[] intArray = new int[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7213,null,7212,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(intArray));
        final double[] doubleArray = new double[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7215,null,7214,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        doubleArray[1] = 0.0;
        doubleArray[1] = 1.0;
        doubleArray[2] = 2.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7217,null,7216,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_PrimitiveArray_literalMutation2316() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_PrimitiveArray_literalMutation2316");
        final int[] intArray = new int[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7213,null,7212,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(intArray));
        final double[] doubleArray = new double[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7215,null,7214,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        doubleArray[0] = 1.0;
        doubleArray[1] = 1.0;
        doubleArray[2] = 2.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7217,null,7216,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_PrimitiveArray_literalMutation2317() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_PrimitiveArray_literalMutation2317");
        final int[] intArray = new int[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7213,null,7212,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(intArray));
        final double[] doubleArray = new double[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7215,null,7214,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        doubleArray[0] = 0.0;
        doubleArray[0] = 1.0;
        doubleArray[2] = 2.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7217,null,7216,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_PrimitiveArray_literalMutation2318() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_PrimitiveArray_literalMutation2318");
        final int[] intArray = new int[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7213,null,7212,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(intArray));
        final double[] doubleArray = new double[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7215,null,7214,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        doubleArray[0] = 0.0;
        doubleArray[1] = 0.0;
        doubleArray[2] = 2.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7217,null,7216,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_PrimitiveArray_literalMutation2319() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_PrimitiveArray_literalMutation2319");
        final int[] intArray = new int[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7213,null,7212,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(intArray));
        final double[] doubleArray = new double[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7215,null,7214,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        doubleArray[0] = 0.0;
        doubleArray[1] = 1.0;
        doubleArray[1] = 2.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7217,null,7216,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_PrimitiveArray_literalMutation2320() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_PrimitiveArray_literalMutation2320");
        final int[] intArray = new int[0];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7213,null,7212,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(intArray));
        final double[] doubleArray = new double[3];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7215,null,7214,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        doubleArray[0] = 0.0;
        doubleArray[1] = 1.0;
        doubleArray[2] = 3.5;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7217,null,7216,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(doubleArray));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_Enumeration() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_Enumeration");
        final Vector<java.lang.String> list = new Vector<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7191,null,7190,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(list.elements()));
        list.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7193,null,7192,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(list.elements()));
        final Enumeration<java.lang.String> en = list.elements();
        en.nextElement();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7195,null,7194,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(en));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_Iterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_Iterator");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7197,null,7196,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(list.iterator()));
        list.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7199,null,7198,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(list.iterator()));
        final Iterator<java.lang.String> it = list.iterator();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7201,null,7200,org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(it));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSizeIsEmpty_Other() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSizeIsEmpty_Other");
        try {
            org.apache.commons.collections4.CollectionUtils.sizeIsEmpty("foo");
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEmptyWithEmptyCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmptyWithEmptyCollection");
        final Collection<java.lang.Object> coll = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7014,null,7013,org.apache.commons.collections4.CollectionUtils.isEmpty(coll));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEmptyWithNonEmptyCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmptyWithNonEmptyCollection");
        final Collection<java.lang.String> coll = new ArrayList<java.lang.String>();
        coll.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7016,null,7015,org.apache.commons.collections4.CollectionUtils.isEmpty(coll));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsEmptyWithNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmptyWithNull");
        final Collection<?> coll = null;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7018,null,7017,org.apache.commons.collections4.CollectionUtils.isEmpty(coll));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsNotEmptyWithEmptyCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsNotEmptyWithEmptyCollection");
        final Collection<java.lang.Object> coll = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7060,null,7059,org.apache.commons.collections4.CollectionUtils.isNotEmpty(coll));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsNotEmptyWithNonEmptyCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsNotEmptyWithNonEmptyCollection");
        final Collection<java.lang.String> coll = new ArrayList<java.lang.String>();
        coll.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7062,null,7061,org.apache.commons.collections4.CollectionUtils.isNotEmpty(coll));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsNotEmptyWithNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsNotEmptyWithNull");
        final Collection<?> coll = null;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7064,null,7063,org.apache.commons.collections4.CollectionUtils.isNotEmpty(coll));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static Predicate<java.lang.Number> EQUALS_TWO = new Predicate<java.lang.Number>() {
        public boolean evaluate(final Number input) {
            return (input.intValue()) == 2;
        }
    };

    @Test
    public void filter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "filter");
        final List<java.lang.Integer> ints = new ArrayList<java.lang.Integer>();
        ints.add(0);
        ints.add(2);
        ints.add(3);
        ints.add(3);
        final Iterable<java.lang.Integer> iterable = ints;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6845,null,6844,org.apache.commons.collections4.CollectionUtils.filter(iterable, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6847,ints,6846,ints.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6849,ints,6848,((int)(ints.get(0))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void filter_literalMutation2132() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "filter_literalMutation2132");
        final List<java.lang.Integer> ints = new ArrayList<java.lang.Integer>();
        ints.add(1);
        ints.add(3);
        ints.add(3);
        ints.add(3);
        final Iterable<java.lang.Integer> iterable = ints;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6845,null,6844,org.apache.commons.collections4.CollectionUtils.filter(iterable, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6847,ints,6846,ints.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6849,ints,6848,((int)(ints.get(0))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void filter_literalMutation2133() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "filter_literalMutation2133");
        final List<java.lang.Integer> ints = new ArrayList<java.lang.Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(2);
        ints.add(3);
        final Iterable<java.lang.Integer> iterable = ints;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6845,null,6844,org.apache.commons.collections4.CollectionUtils.filter(iterable, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6847,ints,6846,ints.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6849,ints,6848,((int)(ints.get(0))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void filter_literalMutation2134() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "filter_literalMutation2134");
        final List<java.lang.Integer> ints = new ArrayList<java.lang.Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(2);
        final Iterable<java.lang.Integer> iterable = ints;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6845,null,6844,org.apache.commons.collections4.CollectionUtils.filter(iterable, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6847,ints,6846,ints.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6849,ints,6848,((int)(ints.get(0))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void filterNullParameters() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "filterNullParameters");
        final List<java.lang.Long> longs = java.util.Collections.nCopies(4, 10L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6833,null,6832,org.apache.commons.collections4.CollectionUtils.filter(longs, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6835,longs,6834,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6837,null,6836,org.apache.commons.collections4.CollectionUtils.filter(null, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6839,longs,6838,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6841,null,6840,org.apache.commons.collections4.CollectionUtils.filter(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6843,longs,6842,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void filterNullParameters_literalMutation2141() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "filterNullParameters_literalMutation2141");
        final List<java.lang.Long> longs = java.util.Collections.nCopies(5, 10L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6833,null,6832,org.apache.commons.collections4.CollectionUtils.filter(longs, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6835,longs,6834,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6837,null,6836,org.apache.commons.collections4.CollectionUtils.filter(null, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6839,longs,6838,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6841,null,6840,org.apache.commons.collections4.CollectionUtils.filter(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6843,longs,6842,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void filterNullParameters_literalMutation2142() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "filterNullParameters_literalMutation2142");
        final List<java.lang.Long> longs = java.util.Collections.nCopies(4, 9L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6833,null,6832,org.apache.commons.collections4.CollectionUtils.filter(longs, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6835,longs,6834,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6837,null,6836,org.apache.commons.collections4.CollectionUtils.filter(null, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6839,longs,6838,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6841,null,6840,org.apache.commons.collections4.CollectionUtils.filter(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6843,longs,6842,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void filterInverse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "filterInverse");
        final List<java.lang.Integer> ints = new ArrayList<java.lang.Integer>();
        ints.add(0);
        ints.add(2);
        ints.add(3);
        ints.add(3);
        final Iterable<java.lang.Integer> iterable = ints;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6823,null,6822,org.apache.commons.collections4.CollectionUtils.filterInverse(iterable, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6825,ints,6824,ints.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6827,ints,6826,((int)(ints.get(0))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6829,ints,6828,((int)(ints.get(1))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6831,ints,6830,((int)(ints.get(2))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void filterInverse_literalMutation2136() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "filterInverse_literalMutation2136");
        final List<java.lang.Integer> ints = new ArrayList<java.lang.Integer>();
        ints.add(1);
        ints.add(3);
        ints.add(3);
        ints.add(3);
        final Iterable<java.lang.Integer> iterable = ints;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6823,null,6822,org.apache.commons.collections4.CollectionUtils.filterInverse(iterable, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6825,ints,6824,ints.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6827,ints,6826,((int)(ints.get(0))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6829,ints,6828,((int)(ints.get(1))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6831,ints,6830,((int)(ints.get(2))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void filterInverse_literalMutation2137() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "filterInverse_literalMutation2137");
        final List<java.lang.Integer> ints = new ArrayList<java.lang.Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(4);
        ints.add(3);
        final Iterable<java.lang.Integer> iterable = ints;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6823,null,6822,org.apache.commons.collections4.CollectionUtils.filterInverse(iterable, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6825,ints,6824,ints.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6827,ints,6826,((int)(ints.get(0))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6829,ints,6828,((int)(ints.get(1))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6831,ints,6830,((int)(ints.get(2))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void filterInverse_literalMutation2138() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "filterInverse_literalMutation2138");
        final List<java.lang.Integer> ints = new ArrayList<java.lang.Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        final Iterable<java.lang.Integer> iterable = ints;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6823,null,6822,org.apache.commons.collections4.CollectionUtils.filterInverse(iterable, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6825,ints,6824,ints.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6827,ints,6826,((int)(ints.get(0))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6829,ints,6828,((int)(ints.get(1))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6831,ints,6830,((int)(ints.get(2))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void filterInverseNullParameters() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "filterInverseNullParameters");
        final List<java.lang.Long> longs = java.util.Collections.nCopies(3, 10L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6811,null,6810,org.apache.commons.collections4.CollectionUtils.filterInverse(longs, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6813,longs,6812,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6815,null,6814,org.apache.commons.collections4.CollectionUtils.filterInverse(null, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6817,longs,6816,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6819,null,6818,org.apache.commons.collections4.CollectionUtils.filterInverse(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6821,longs,6820,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void filterInverseNullParameters_literalMutation2140() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "filterInverseNullParameters_literalMutation2140");
        final List<java.lang.Long> longs = java.util.Collections.nCopies(4, 9L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6811,null,6810,org.apache.commons.collections4.CollectionUtils.filterInverse(longs, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6813,longs,6812,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6815,null,6814,org.apache.commons.collections4.CollectionUtils.filterInverse(null, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6817,longs,6816,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6819,null,6818,org.apache.commons.collections4.CollectionUtils.filterInverse(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6821,longs,6820,longs.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void countMatches() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "countMatches");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6746,null,6745,org.apache.commons.collections4.CollectionUtils.countMatches(iterableB, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6748,null,6747,org.apache.commons.collections4.CollectionUtils.countMatches(iterableA, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6750,null,6749,org.apache.commons.collections4.CollectionUtils.countMatches(null, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6752,null,6751,org.apache.commons.collections4.CollectionUtils.countMatches(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void exists() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "exists");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6797,null,6796,org.apache.commons.collections4.CollectionUtils.exists(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6799,null,6798,org.apache.commons.collections4.CollectionUtils.exists(list, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6801,null,6800,org.apache.commons.collections4.CollectionUtils.exists(null, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6803,null,6802,org.apache.commons.collections4.CollectionUtils.exists(list, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        list.add(2);
        list.add(3);
        list.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6805,null,6804,org.apache.commons.collections4.CollectionUtils.exists(list, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        list.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6807,null,6806,org.apache.commons.collections4.CollectionUtils.exists(list, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void exists_literalMutation2125() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "exists_literalMutation2125");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6797,null,6796,org.apache.commons.collections4.CollectionUtils.exists(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6799,null,6798,org.apache.commons.collections4.CollectionUtils.exists(list, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6801,null,6800,org.apache.commons.collections4.CollectionUtils.exists(null, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6803,null,6802,org.apache.commons.collections4.CollectionUtils.exists(list, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        list.add(1);
        list.add(4);
        list.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6805,null,6804,org.apache.commons.collections4.CollectionUtils.exists(list, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        list.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6807,null,6806,org.apache.commons.collections4.CollectionUtils.exists(list, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void exists_literalMutation2126() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "exists_literalMutation2126");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6797,null,6796,org.apache.commons.collections4.CollectionUtils.exists(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6799,null,6798,org.apache.commons.collections4.CollectionUtils.exists(list, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6801,null,6800,org.apache.commons.collections4.CollectionUtils.exists(null, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6803,null,6802,org.apache.commons.collections4.CollectionUtils.exists(list, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        list.add(1);
        list.add(3);
        list.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6805,null,6804,org.apache.commons.collections4.CollectionUtils.exists(list, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        list.add(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6807,null,6806,org.apache.commons.collections4.CollectionUtils.exists(list, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void exists_literalMutation2127() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "exists_literalMutation2127");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6797,null,6796,org.apache.commons.collections4.CollectionUtils.exists(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6799,null,6798,org.apache.commons.collections4.CollectionUtils.exists(list, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6801,null,6800,org.apache.commons.collections4.CollectionUtils.exists(null, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6803,null,6802,org.apache.commons.collections4.CollectionUtils.exists(list, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        list.add(1);
        list.add(3);
        list.add(4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6805,null,6804,org.apache.commons.collections4.CollectionUtils.exists(list, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        list.add(3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6807,null,6806,org.apache.commons.collections4.CollectionUtils.exists(list, org.apache.commons.collections4.CollectionUtilsTest.EQUALS_TWO));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void select() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "select");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        final Collection<java.lang.Integer> output1 = org.apache.commons.collections4.CollectionUtils.select(list, CollectionUtilsTest.EQUALS_TWO);
        final Collection<java.lang.Number> output2 = org.apache.commons.collections4.CollectionUtils.<Number>select(list, CollectionUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, CollectionUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6998,null,6997,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7000,list,6999,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7002,output1,7001,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7004,output2.iterator(),7003,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void select_literalMutation2228() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "select_literalMutation2228");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        final Collection<java.lang.Integer> output1 = org.apache.commons.collections4.CollectionUtils.select(list, CollectionUtilsTest.EQUALS_TWO);
        final Collection<java.lang.Number> output2 = org.apache.commons.collections4.CollectionUtils.<Number>select(list, CollectionUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, CollectionUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6998,null,6997,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7000,list,6999,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7002,output1,7001,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7004,output2.iterator(),7003,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void select_literalMutation2229() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "select_literalMutation2229");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(4);
        final Collection<java.lang.Integer> output1 = org.apache.commons.collections4.CollectionUtils.select(list, CollectionUtilsTest.EQUALS_TWO);
        final Collection<java.lang.Number> output2 = org.apache.commons.collections4.CollectionUtils.<Number>select(list, CollectionUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, CollectionUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6998,null,6997,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7000,list,6999,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7002,output1,7001,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7004,output2.iterator(),7003,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void select_literalMutation2230() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "select_literalMutation2230");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        final Collection<java.lang.Integer> output1 = org.apache.commons.collections4.CollectionUtils.select(list, CollectionUtilsTest.EQUALS_TWO);
        final Collection<java.lang.Number> output2 = org.apache.commons.collections4.CollectionUtils.<Number>select(list, CollectionUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, CollectionUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6998,null,6997,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7000,list,6999,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7002,output1,7001,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7004,output2.iterator(),7003,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void selectRejected() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "selectRejected");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(0L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        final Collection<java.lang.Long> output1 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, CollectionUtilsTest.EQUALS_TWO);
        final Collection<? extends java.lang.Number> output2 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, CollectionUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, CollectionUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6984,null,6983,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6986,null,6985,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6988,list,6987,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6990,output1,6989,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6992,output1,6991,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6994,output1,6993,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6996,output1,6995,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void selectRejected_literalMutation2232() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "selectRejected_literalMutation2232");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(1L);
        list.add(3L);
        list.add(4L);
        final Collection<java.lang.Long> output1 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, CollectionUtilsTest.EQUALS_TWO);
        final Collection<? extends java.lang.Number> output2 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, CollectionUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, CollectionUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6984,null,6983,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6986,null,6985,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6988,list,6987,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6990,output1,6989,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6992,output1,6991,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6994,output1,6993,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6996,output1,6995,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void selectRejected_literalMutation2233() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "selectRejected_literalMutation2233");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(2L);
        list.add(2L);
        list.add(4L);
        final Collection<java.lang.Long> output1 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, CollectionUtilsTest.EQUALS_TWO);
        final Collection<? extends java.lang.Number> output2 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, CollectionUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, CollectionUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6984,null,6983,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6986,null,6985,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6988,list,6987,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6990,output1,6989,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6992,output1,6991,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6994,output1,6993,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6996,output1,6995,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void selectRejected_literalMutation2234() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "selectRejected_literalMutation2234");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(3L);
        final Collection<java.lang.Long> output1 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, CollectionUtilsTest.EQUALS_TWO);
        final Collection<? extends java.lang.Number> output2 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, CollectionUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, CollectionUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6984,null,6983,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6986,null,6985,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6988,list,6987,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6990,output1,6989,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6992,output1,6991,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6994,output1,6993,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6996,output1,6995,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void collect() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "collect");
        final Transformer<java.lang.Number, java.lang.Long> transformer = org.apache.commons.collections4.TransformerUtils.constantTransformer(3L);
        Collection<java.lang.Number> collection = org.apache.commons.collections4.CollectionUtils.<Integer,Number>collect(iterableA, transformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6695,((collection.size()) == (collectionA.size())));
        assertCollectResult(collection);
        ArrayList<java.lang.Number> list;
        list = org.apache.commons.collections4.CollectionUtils.collect(collectionA, transformer, new ArrayList<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6696,((list.size()) == (collectionA.size())));
        assertCollectResult(list);
        Iterator<java.lang.Integer> iterator = null;
        list = org.apache.commons.collections4.CollectionUtils.collect(iterator, transformer, new ArrayList<java.lang.Number>());
        iterator = iterableA.iterator();
        list = org.apache.commons.collections4.CollectionUtils.collect(iterator, transformer, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6697,((collection.size()) == (collectionA.size())));
        assertCollectResult(collection);
        iterator = collectionA.iterator();
        collection = org.apache.commons.collections4.CollectionUtils.<Integer,Number>collect(iterator, transformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6698,((collection.size()) == (collectionA.size())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6699,((collection.contains(2L)) && (!(collection.contains(1)))));
        collection = org.apache.commons.collections4.CollectionUtils.collect(((Iterator<java.lang.Integer>)(null)), ((Transformer<java.lang.Integer, java.lang.Number>)(null)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6700,((collection.size()) == 0));
        final int size = collectionA.size();
        collectionB = org.apache.commons.collections4.CollectionUtils.collect(((Collection<java.lang.Integer>)(null)), transformer, collectionB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6701,(((collectionA.size()) == size) && (collectionA.contains(1))));
        org.apache.commons.collections4.CollectionUtils.collect(collectionB, null, collectionA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6702,(((collectionA.size()) == size) && (collectionA.contains(1))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void assertCollectResult(final Collection<java.lang.Number> collection) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6611,((collectionA.contains(1)) && (!(collectionA.contains(2L)))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6612,((collection.contains(2L)) && (!(collection.contains(1)))));
    }

    Transformer<java.lang.Object, java.lang.Integer> TRANSFORM_TO_INTEGER = new Transformer<java.lang.Object, java.lang.Integer>() {
        public Integer transform(final Object input) {
            return Integer.valueOf(((Long)(input)).intValue());
        }
    };

    @Test
    public void transform1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "transform1");
        List<java.lang.Number> list = new ArrayList<java.lang.Number>();
        list.add(2L);
        list.add(2L);
        list.add(3L);
        org.apache.commons.collections4.CollectionUtils.transform(list, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7284,list,7283,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7286,list,7285,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7288,list,7287,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7290,list,7289,list.get(2));
        list = new ArrayList<java.lang.Number>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        org.apache.commons.collections4.CollectionUtils.transform(null, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7292,list,7291,list.size());
        org.apache.commons.collections4.CollectionUtils.transform(list, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7294,list,7293,list.size());
        org.apache.commons.collections4.CollectionUtils.transform(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7296,list,7295,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void transform1_literalMutation2358() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "transform1_literalMutation2358");
        List<java.lang.Number> list = new ArrayList<java.lang.Number>();
        list.add(1L);
        list.add(1L);
        list.add(3L);
        org.apache.commons.collections4.CollectionUtils.transform(list, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7284,list,7283,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7286,list,7285,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7288,list,7287,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7290,list,7289,list.get(2));
        list = new ArrayList<java.lang.Number>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        org.apache.commons.collections4.CollectionUtils.transform(null, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7292,list,7291,list.size());
        org.apache.commons.collections4.CollectionUtils.transform(list, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7294,list,7293,list.size());
        org.apache.commons.collections4.CollectionUtils.transform(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7296,list,7295,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void transform1_literalMutation2359() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "transform1_literalMutation2359");
        List<java.lang.Number> list = new ArrayList<java.lang.Number>();
        list.add(1L);
        list.add(2L);
        list.add(4L);
        org.apache.commons.collections4.CollectionUtils.transform(list, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7284,list,7283,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7286,list,7285,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7288,list,7287,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7290,list,7289,list.get(2));
        list = new ArrayList<java.lang.Number>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        org.apache.commons.collections4.CollectionUtils.transform(null, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7292,list,7291,list.size());
        org.apache.commons.collections4.CollectionUtils.transform(list, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7294,list,7293,list.size());
        org.apache.commons.collections4.CollectionUtils.transform(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7296,list,7295,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void transform1_literalMutation2360() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "transform1_literalMutation2360");
        List<java.lang.Number> list = new ArrayList<java.lang.Number>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        org.apache.commons.collections4.CollectionUtils.transform(list, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7284,list,7283,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7286,list,7285,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7288,list,7287,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7290,list,7289,list.get(2));
        list = new ArrayList<java.lang.Number>();
        list.add(2L);
        list.add(2L);
        list.add(3L);
        org.apache.commons.collections4.CollectionUtils.transform(null, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7292,list,7291,list.size());
        org.apache.commons.collections4.CollectionUtils.transform(list, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7294,list,7293,list.size());
        org.apache.commons.collections4.CollectionUtils.transform(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7296,list,7295,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void transform1_literalMutation2361() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "transform1_literalMutation2361");
        List<java.lang.Number> list = new ArrayList<java.lang.Number>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        org.apache.commons.collections4.CollectionUtils.transform(list, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7284,list,7283,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7286,list,7285,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7288,list,7287,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7290,list,7289,list.get(2));
        list = new ArrayList<java.lang.Number>();
        list.add(1L);
        list.add(1L);
        list.add(3L);
        org.apache.commons.collections4.CollectionUtils.transform(null, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7292,list,7291,list.size());
        org.apache.commons.collections4.CollectionUtils.transform(list, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7294,list,7293,list.size());
        org.apache.commons.collections4.CollectionUtils.transform(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7296,list,7295,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void transform1_literalMutation2362() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "transform1_literalMutation2362");
        List<java.lang.Number> list = new ArrayList<java.lang.Number>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        org.apache.commons.collections4.CollectionUtils.transform(list, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7284,list,7283,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7286,list,7285,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7288,list,7287,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7290,list,7289,list.get(2));
        list = new ArrayList<java.lang.Number>();
        list.add(1L);
        list.add(2L);
        list.add(4L);
        org.apache.commons.collections4.CollectionUtils.transform(null, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7292,list,7291,list.size());
        org.apache.commons.collections4.CollectionUtils.transform(list, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7294,list,7293,list.size());
        org.apache.commons.collections4.CollectionUtils.transform(null, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7296,list,7295,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void transform2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "transform2");
        final Set<java.lang.Number> set = new HashSet<java.lang.Number>();
        set.add(0L);
        set.add(2L);
        set.add(3L);
        org.apache.commons.collections4.CollectionUtils.transform(set, new Transformer<java.lang.Object, java.lang.Integer>() {
            public Integer transform(final Object input) {
                return 4;
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7298,set,7297,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7300,set.iterator(),7299,set.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void transform2_literalMutation2368() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "transform2_literalMutation2368");
        final Set<java.lang.Number> set = new HashSet<java.lang.Number>();
        set.add(1L);
        set.add(1L);
        set.add(3L);
        org.apache.commons.collections4.CollectionUtils.transform(set, new Transformer<java.lang.Object, java.lang.Integer>() {
            public Integer transform(final Object input) {
                return 4;
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7298,set,7297,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7300,set.iterator(),7299,set.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void transform2_literalMutation2369() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "transform2_literalMutation2369");
        final Set<java.lang.Number> set = new HashSet<java.lang.Number>();
        set.add(1L);
        set.add(2L);
        set.add(4L);
        org.apache.commons.collections4.CollectionUtils.transform(set, new Transformer<java.lang.Object, java.lang.Integer>() {
            public Integer transform(final Object input) {
                return 4;
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7298,set,7297,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7300,set.iterator(),7299,set.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void transform2_literalMutation2370() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "transform2_literalMutation2370");
        final Set<java.lang.Number> set = new HashSet<java.lang.Number>();
        set.add(1L);
        set.add(2L);
        set.add(3L);
        org.apache.commons.collections4.CollectionUtils.transform(set, new Transformer<java.lang.Object, java.lang.Integer>() {
            public Integer transform(final Object input) {
                return 3;
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7298,set,7297,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7300,set.iterator(),7299,set.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void addIgnoreNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addIgnoreNull");
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("foo");
        set.add("2");
        set.add("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6598,null,6597,org.apache.commons.collections4.CollectionUtils.addIgnoreNull(set, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6600,set,6599,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6602,null,6601,org.apache.commons.collections4.CollectionUtils.addIgnoreNull(set, "1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6604,set,6603,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6606,null,6605,org.apache.commons.collections4.CollectionUtils.addIgnoreNull(set, "4"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6608,set,6607,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6610,set,6609,set.contains("4"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void addIgnoreNull_literalMutation2075() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addIgnoreNull_literalMutation2075");
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("1");
        set.add("foo");
        set.add("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6598,null,6597,org.apache.commons.collections4.CollectionUtils.addIgnoreNull(set, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6600,set,6599,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6602,null,6601,org.apache.commons.collections4.CollectionUtils.addIgnoreNull(set, "1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6604,set,6603,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6606,null,6605,org.apache.commons.collections4.CollectionUtils.addIgnoreNull(set, "4"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6608,set,6607,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6610,set,6609,set.contains("4"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void addIgnoreNull_literalMutation2076() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addIgnoreNull_literalMutation2076");
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("1");
        set.add("2");
        set.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6598,null,6597,org.apache.commons.collections4.CollectionUtils.addIgnoreNull(set, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6600,set,6599,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6602,null,6601,org.apache.commons.collections4.CollectionUtils.addIgnoreNull(set, "1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6604,set,6603,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6606,null,6605,org.apache.commons.collections4.CollectionUtils.addIgnoreNull(set, "4"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6608,set,6607,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6610,set,6609,set.contains("4"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void predicatedCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "predicatedCollection");
        final Predicate<java.lang.Object> predicate = org.apache.commons.collections4.PredicateUtils.instanceofPredicate(Integer.class);
        Collection<java.lang.Number> collection = org.apache.commons.collections4.CollectionUtils.predicatedCollection(new ArrayList<java.lang.Number>(), predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6979,(collection instanceof org.apache.commons.collections4.collection.PredicatedCollection));
        try {
            org.apache.commons.collections4.CollectionUtils.predicatedCollection(new ArrayList<java.lang.Number>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.predicatedCollection(null, predicate);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void isFull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "isFull");
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("foo");
        set.add("2");
        set.add("3");
        try {
            org.apache.commons.collections4.CollectionUtils.isFull(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6963,null,6962,org.apache.commons.collections4.CollectionUtils.isFull(set));
        final CircularFifoQueue<java.lang.String> buf = new CircularFifoQueue<java.lang.String>(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6965,null,6964,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        buf.remove("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6967,null,6966,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        buf.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6969,null,6968,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void isFull_literalMutation2214() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "isFull_literalMutation2214");
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("1");
        set.add("foo");
        set.add("3");
        try {
            org.apache.commons.collections4.CollectionUtils.isFull(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6963,null,6962,org.apache.commons.collections4.CollectionUtils.isFull(set));
        final CircularFifoQueue<java.lang.String> buf = new CircularFifoQueue<java.lang.String>(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6965,null,6964,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        buf.remove("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6967,null,6966,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        buf.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6969,null,6968,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void isFull_literalMutation2215() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "isFull_literalMutation2215");
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("1");
        set.add("2");
        set.add("foo");
        try {
            org.apache.commons.collections4.CollectionUtils.isFull(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6963,null,6962,org.apache.commons.collections4.CollectionUtils.isFull(set));
        final CircularFifoQueue<java.lang.String> buf = new CircularFifoQueue<java.lang.String>(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6965,null,6964,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        buf.remove("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6967,null,6966,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        buf.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6969,null,6968,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void isFull_literalMutation2217() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "isFull_literalMutation2217");
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("1");
        set.add("2");
        set.add("3");
        try {
            org.apache.commons.collections4.CollectionUtils.isFull(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6963,null,6962,org.apache.commons.collections4.CollectionUtils.isFull(set));
        final CircularFifoQueue<java.lang.String> buf = new CircularFifoQueue<java.lang.String>(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6965,null,6964,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        buf.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6967,null,6966,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        buf.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6969,null,6968,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void isFull_literalMutation2218() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "isFull_literalMutation2218");
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("1");
        set.add("2");
        set.add("3");
        try {
            org.apache.commons.collections4.CollectionUtils.isFull(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6963,null,6962,org.apache.commons.collections4.CollectionUtils.isFull(set));
        final CircularFifoQueue<java.lang.String> buf = new CircularFifoQueue<java.lang.String>(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6965,null,6964,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        buf.remove("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6967,null,6966,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        buf.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6969,null,6968,org.apache.commons.collections4.CollectionUtils.isFull(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void isEmpty() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "isEmpty");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6959,null,6958,org.apache.commons.collections4.CollectionUtils.isNotEmpty(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6961,null,6960,org.apache.commons.collections4.CollectionUtils.isNotEmpty(collectionA));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void maxSize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "maxSize");
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("foo");
        set.add("2");
        set.add("3");
        try {
            org.apache.commons.collections4.CollectionUtils.maxSize(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6970,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6972,null,6971,org.apache.commons.collections4.CollectionUtils.maxSize(set));
        final Queue<java.lang.String> buf = new CircularFifoQueue<java.lang.String>(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6974,null,6973,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        buf.remove("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6976,null,6975,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        buf.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6978,null,6977,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void maxSize_literalMutation2220() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "maxSize_literalMutation2220");
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("1");
        set.add("foo");
        set.add("3");
        try {
            org.apache.commons.collections4.CollectionUtils.maxSize(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6970,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6972,null,6971,org.apache.commons.collections4.CollectionUtils.maxSize(set));
        final Queue<java.lang.String> buf = new CircularFifoQueue<java.lang.String>(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6974,null,6973,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        buf.remove("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6976,null,6975,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        buf.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6978,null,6977,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void maxSize_literalMutation2221() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "maxSize_literalMutation2221");
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("1");
        set.add("2");
        set.add("foo");
        try {
            org.apache.commons.collections4.CollectionUtils.maxSize(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6970,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6972,null,6971,org.apache.commons.collections4.CollectionUtils.maxSize(set));
        final Queue<java.lang.String> buf = new CircularFifoQueue<java.lang.String>(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6974,null,6973,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        buf.remove("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6976,null,6975,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        buf.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6978,null,6977,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void maxSize_literalMutation2223() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "maxSize_literalMutation2223");
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("1");
        set.add("2");
        set.add("3");
        try {
            org.apache.commons.collections4.CollectionUtils.maxSize(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6970,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6972,null,6971,org.apache.commons.collections4.CollectionUtils.maxSize(set));
        final Queue<java.lang.String> buf = new CircularFifoQueue<java.lang.String>(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6974,null,6973,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        buf.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6976,null,6975,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        buf.add("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6978,null,6977,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void maxSize_literalMutation2224() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "maxSize_literalMutation2224");
        final Set<java.lang.String> set = new HashSet<java.lang.String>();
        set.add("1");
        set.add("2");
        set.add("3");
        try {
            org.apache.commons.collections4.CollectionUtils.maxSize(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6970,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6972,null,6971,org.apache.commons.collections4.CollectionUtils.maxSize(set));
        final Queue<java.lang.String> buf = new CircularFifoQueue<java.lang.String>(set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6974,null,6973,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        buf.remove("2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6976,null,6975,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        buf.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6978,null,6977,org.apache.commons.collections4.CollectionUtils.maxSize(buf));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void intersection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "intersection");
        final Integer elta = new Integer(18);
        final Integer eltb = new Integer(17);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6942,elta);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6943,eltb);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6944,eltb);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6945,elta);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6946,(elta != eltb));
        final Collection<java.lang.Number> cola = new ArrayList<java.lang.Number>();
        final Collection<java.lang.Integer> colb = new ArrayList<java.lang.Integer>();
        cola.add(elta);
        colb.add(eltb);
        final Collection<java.lang.Number> intersection = org.apache.commons.collections4.CollectionUtils.intersection(cola, colb);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6948,intersection,6947,intersection.size());
        final Object eltc = intersection.iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6949,(((eltc == elta) && (eltc != eltb)) || ((eltc != elta) && (eltc == eltb))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6950,elta);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6951,eltc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6952,eltc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6953,elta);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6954,eltb);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6955,eltc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6956,eltc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6957,eltb);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void intersectionUsesMethodEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "intersectionUsesMethodEquals");
        final Integer elta = new Integer(17);
        final Integer eltb = new Integer(18);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6942,elta);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6943,eltb);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6944,eltb);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6945,elta);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6946,(elta != eltb));
        final Collection<java.lang.Number> cola = new ArrayList<java.lang.Number>();
        final Collection<java.lang.Integer> colb = new ArrayList<java.lang.Integer>();
        cola.add(elta);
        colb.add(eltb);
        final Collection<java.lang.Number> intersection = org.apache.commons.collections4.CollectionUtils.intersection(cola, colb);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6948,intersection,6947,intersection.size());
        final Object eltc = intersection.iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6949,(((eltc == elta) && (eltc != eltb)) || ((eltc != elta) && (eltc == eltb))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6950,elta);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6951,eltc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6952,eltc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6953,elta);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6954,eltb);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6955,eltc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6956,eltc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6957,eltb);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRetainAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll");
        final List<java.lang.String> base = new ArrayList<java.lang.String>();
        base.add("A");
        base.add("B");
        base.add("C");
        final List<java.lang.Object> sub = new ArrayList<java.lang.Object>();
        sub.add("A");
        sub.add("C");
        sub.add("X");
        final Collection<java.lang.String> result = org.apache.commons.collections4.CollectionUtils.retainAll(base, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7161,result,7160,result.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7163,result,7162,result.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7165,result,7164,result.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7167,result,7166,result.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7169,base,7168,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7171,base,7170,base.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7173,base,7172,base.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7175,base,7174,base.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7177,sub,7176,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7179,sub,7178,sub.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7181,sub,7180,sub.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7183,sub,7182,sub.contains("X"));
        try {
            org.apache.commons.collections4.CollectionUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRetainAll_literalMutation2291() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_literalMutation2291");
        final List<java.lang.String> base = new ArrayList<java.lang.String>();
        base.add("foo");
        base.add("B");
        base.add("C");
        final List<java.lang.Object> sub = new ArrayList<java.lang.Object>();
        sub.add("A");
        sub.add("C");
        sub.add("X");
        final Collection<java.lang.String> result = org.apache.commons.collections4.CollectionUtils.retainAll(base, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7161,result,7160,result.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7163,result,7162,result.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7165,result,7164,result.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7167,result,7166,result.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7169,base,7168,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7171,base,7170,base.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7173,base,7172,base.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7175,base,7174,base.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7177,sub,7176,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7179,sub,7178,sub.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7181,sub,7180,sub.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7183,sub,7182,sub.contains("X"));
        try {
            org.apache.commons.collections4.CollectionUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRetainAll_literalMutation2292() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_literalMutation2292");
        final List<java.lang.String> base = new ArrayList<java.lang.String>();
        base.add("A");
        base.add("foo");
        base.add("C");
        final List<java.lang.Object> sub = new ArrayList<java.lang.Object>();
        sub.add("A");
        sub.add("C");
        sub.add("X");
        final Collection<java.lang.String> result = org.apache.commons.collections4.CollectionUtils.retainAll(base, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7161,result,7160,result.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7163,result,7162,result.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7165,result,7164,result.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7167,result,7166,result.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7169,base,7168,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7171,base,7170,base.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7173,base,7172,base.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7175,base,7174,base.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7177,sub,7176,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7179,sub,7178,sub.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7181,sub,7180,sub.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7183,sub,7182,sub.contains("X"));
        try {
            org.apache.commons.collections4.CollectionUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRetainAll_literalMutation2293() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_literalMutation2293");
        final List<java.lang.String> base = new ArrayList<java.lang.String>();
        base.add("A");
        base.add("B");
        base.add("foo");
        final List<java.lang.Object> sub = new ArrayList<java.lang.Object>();
        sub.add("A");
        sub.add("C");
        sub.add("X");
        final Collection<java.lang.String> result = org.apache.commons.collections4.CollectionUtils.retainAll(base, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7161,result,7160,result.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7163,result,7162,result.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7165,result,7164,result.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7167,result,7166,result.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7169,base,7168,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7171,base,7170,base.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7173,base,7172,base.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7175,base,7174,base.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7177,sub,7176,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7179,sub,7178,sub.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7181,sub,7180,sub.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7183,sub,7182,sub.contains("X"));
        try {
            org.apache.commons.collections4.CollectionUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRetainAll_literalMutation2294() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_literalMutation2294");
        final List<java.lang.String> base = new ArrayList<java.lang.String>();
        base.add("A");
        base.add("B");
        base.add("C");
        final List<java.lang.Object> sub = new ArrayList<java.lang.Object>();
        sub.add("foo");
        sub.add("C");
        sub.add("X");
        final Collection<java.lang.String> result = org.apache.commons.collections4.CollectionUtils.retainAll(base, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7161,result,7160,result.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7163,result,7162,result.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7165,result,7164,result.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7167,result,7166,result.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7169,base,7168,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7171,base,7170,base.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7173,base,7172,base.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7175,base,7174,base.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7177,sub,7176,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7179,sub,7178,sub.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7181,sub,7180,sub.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7183,sub,7182,sub.contains("X"));
        try {
            org.apache.commons.collections4.CollectionUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRetainAll_literalMutation2295() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_literalMutation2295");
        final List<java.lang.String> base = new ArrayList<java.lang.String>();
        base.add("A");
        base.add("B");
        base.add("C");
        final List<java.lang.Object> sub = new ArrayList<java.lang.Object>();
        sub.add("A");
        sub.add("foo");
        sub.add("X");
        final Collection<java.lang.String> result = org.apache.commons.collections4.CollectionUtils.retainAll(base, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7161,result,7160,result.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7163,result,7162,result.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7165,result,7164,result.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7167,result,7166,result.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7169,base,7168,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7171,base,7170,base.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7173,base,7172,base.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7175,base,7174,base.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7177,sub,7176,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7179,sub,7178,sub.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7181,sub,7180,sub.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7183,sub,7182,sub.contains("X"));
        try {
            org.apache.commons.collections4.CollectionUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRetainAll_literalMutation2296() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_literalMutation2296");
        final List<java.lang.String> base = new ArrayList<java.lang.String>();
        base.add("A");
        base.add("B");
        base.add("C");
        final List<java.lang.Object> sub = new ArrayList<java.lang.Object>();
        sub.add("A");
        sub.add("C");
        sub.add("foo");
        final Collection<java.lang.String> result = org.apache.commons.collections4.CollectionUtils.retainAll(base, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7161,result,7160,result.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7163,result,7162,result.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7165,result,7164,result.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7167,result,7166,result.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7169,base,7168,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7171,base,7170,base.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7173,base,7172,base.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7175,base,7174,base.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7177,sub,7176,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7179,sub,7178,sub.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7181,sub,7180,sub.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7183,sub,7182,sub.contains("X"));
        try {
            org.apache.commons.collections4.CollectionUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRemoveAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll");
        final List<java.lang.String> base = new ArrayList<java.lang.String>();
        base.add("A");
        base.add("B");
        base.add("C");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add("A");
        sub.add("C");
        sub.add("X");
        final Collection<java.lang.String> result = org.apache.commons.collections4.CollectionUtils.removeAll(base, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7137,result,7136,result.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7139,result,7138,result.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7141,result,7140,result.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7143,result,7142,result.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7145,base,7144,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7147,base,7146,base.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7149,base,7148,base.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7151,base,7150,base.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7153,sub,7152,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7155,sub,7154,sub.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7157,sub,7156,sub.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7159,sub,7158,sub.contains("X"));
        try {
            org.apache.commons.collections4.CollectionUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRemoveAll_literalMutation2283() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_literalMutation2283");
        final List<java.lang.String> base = new ArrayList<java.lang.String>();
        base.add("foo");
        base.add("B");
        base.add("C");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add("A");
        sub.add("C");
        sub.add("X");
        final Collection<java.lang.String> result = org.apache.commons.collections4.CollectionUtils.removeAll(base, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7137,result,7136,result.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7139,result,7138,result.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7141,result,7140,result.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7143,result,7142,result.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7145,base,7144,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7147,base,7146,base.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7149,base,7148,base.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7151,base,7150,base.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7153,sub,7152,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7155,sub,7154,sub.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7157,sub,7156,sub.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7159,sub,7158,sub.contains("X"));
        try {
            org.apache.commons.collections4.CollectionUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRemoveAll_literalMutation2284() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_literalMutation2284");
        final List<java.lang.String> base = new ArrayList<java.lang.String>();
        base.add("A");
        base.add("foo");
        base.add("C");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add("A");
        sub.add("C");
        sub.add("X");
        final Collection<java.lang.String> result = org.apache.commons.collections4.CollectionUtils.removeAll(base, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7137,result,7136,result.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7139,result,7138,result.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7141,result,7140,result.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7143,result,7142,result.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7145,base,7144,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7147,base,7146,base.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7149,base,7148,base.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7151,base,7150,base.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7153,sub,7152,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7155,sub,7154,sub.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7157,sub,7156,sub.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7159,sub,7158,sub.contains("X"));
        try {
            org.apache.commons.collections4.CollectionUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRemoveAll_literalMutation2285() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_literalMutation2285");
        final List<java.lang.String> base = new ArrayList<java.lang.String>();
        base.add("A");
        base.add("B");
        base.add("foo");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add("A");
        sub.add("C");
        sub.add("X");
        final Collection<java.lang.String> result = org.apache.commons.collections4.CollectionUtils.removeAll(base, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7137,result,7136,result.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7139,result,7138,result.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7141,result,7140,result.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7143,result,7142,result.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7145,base,7144,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7147,base,7146,base.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7149,base,7148,base.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7151,base,7150,base.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7153,sub,7152,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7155,sub,7154,sub.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7157,sub,7156,sub.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7159,sub,7158,sub.contains("X"));
        try {
            org.apache.commons.collections4.CollectionUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRemoveAll_literalMutation2286() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_literalMutation2286");
        final List<java.lang.String> base = new ArrayList<java.lang.String>();
        base.add("A");
        base.add("B");
        base.add("C");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add("foo");
        sub.add("C");
        sub.add("X");
        final Collection<java.lang.String> result = org.apache.commons.collections4.CollectionUtils.removeAll(base, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7137,result,7136,result.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7139,result,7138,result.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7141,result,7140,result.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7143,result,7142,result.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7145,base,7144,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7147,base,7146,base.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7149,base,7148,base.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7151,base,7150,base.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7153,sub,7152,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7155,sub,7154,sub.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7157,sub,7156,sub.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7159,sub,7158,sub.contains("X"));
        try {
            org.apache.commons.collections4.CollectionUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRemoveAll_literalMutation2287() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_literalMutation2287");
        final List<java.lang.String> base = new ArrayList<java.lang.String>();
        base.add("A");
        base.add("B");
        base.add("C");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add("A");
        sub.add("foo");
        sub.add("X");
        final Collection<java.lang.String> result = org.apache.commons.collections4.CollectionUtils.removeAll(base, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7137,result,7136,result.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7139,result,7138,result.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7141,result,7140,result.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7143,result,7142,result.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7145,base,7144,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7147,base,7146,base.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7149,base,7148,base.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7151,base,7150,base.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7153,sub,7152,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7155,sub,7154,sub.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7157,sub,7156,sub.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7159,sub,7158,sub.contains("X"));
        try {
            org.apache.commons.collections4.CollectionUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testRemoveAll_literalMutation2288() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_literalMutation2288");
        final List<java.lang.String> base = new ArrayList<java.lang.String>();
        base.add("A");
        base.add("B");
        base.add("C");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add("A");
        sub.add("C");
        sub.add("foo");
        final Collection<java.lang.String> result = org.apache.commons.collections4.CollectionUtils.removeAll(base, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7137,result,7136,result.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7139,result,7138,result.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7141,result,7140,result.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7143,result,7142,result.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7145,base,7144,base.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7147,base,7146,base.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7149,base,7148,base.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7151,base,7150,base.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7153,sub,7152,sub.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7155,sub,7154,sub.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7157,sub,7156,sub.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7159,sub,7158,sub.contains("X"));
        try {
            org.apache.commons.collections4.CollectionUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTransformedCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedCollection");
        final Transformer<java.lang.Object, java.lang.Object> transformer = org.apache.commons.collections4.TransformerUtils.nopTransformer();
        Collection<java.lang.Object> collection = org.apache.commons.collections4.CollectionUtils.transformingCollection(new ArrayList<java.lang.Object>(), transformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7275,(collection instanceof org.apache.commons.collections4.collection.TransformedCollection));
        try {
            org.apache.commons.collections4.CollectionUtils.transformingCollection(new ArrayList<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.CollectionUtils.transformingCollection(null, transformer);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTransformedCollection_2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedCollection_2");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add("foo");
        list.add("2");
        list.add("3");
        final Collection<java.lang.Object> result = org.apache.commons.collections4.CollectionUtils.transformingCollection(list, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7277,result,7276,result.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7279,result,7278,result.contains("2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7281,result,7280,result.contains("3"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTransformedCollection_2_literalMutation2354() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedCollection_2_literalMutation2354");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add("1");
        list.add("foo");
        list.add("3");
        final Collection<java.lang.Object> result = org.apache.commons.collections4.CollectionUtils.transformingCollection(list, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7277,result,7276,result.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7279,result,7278,result.contains("2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7281,result,7280,result.contains("3"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testTransformedCollection_2_literalMutation2355() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedCollection_2_literalMutation2355");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add("1");
        list.add("2");
        list.add("foo");
        final Collection<java.lang.Object> result = org.apache.commons.collections4.CollectionUtils.transformingCollection(list, TRANSFORM_TO_INTEGER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7277,result,7276,result.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7279,result,7278,result.contains("2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7281,result,7280,result.contains("3"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSynchronizedCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSynchronizedCollection");
        Collection<java.lang.Object> col = org.apache.commons.collections4.CollectionUtils.synchronizedCollection(new ArrayList<java.lang.Object>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7274,(col instanceof org.apache.commons.collections4.collection.SynchronizedCollection));
        try {
            org.apache.commons.collections4.CollectionUtils.synchronizedCollection(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnmodifiableCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableCollection");
        Collection<java.lang.Object> col = org.apache.commons.collections4.CollectionUtils.unmodifiableCollection(new ArrayList<java.lang.Object>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7282,(col instanceof org.apache.commons.collections4.collection.UnmodifiableCollection));
        try {
            org.apache.commons.collections4.CollectionUtils.unmodifiableCollection(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void emptyCollection() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "emptyCollection");
        final Collection<java.lang.Number> coll = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6789,org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6790,coll);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void emptyIfNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "emptyIfNull");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6792,org.apache.commons.collections4.CollectionUtils.emptyIfNull(null),6791,org.apache.commons.collections4.CollectionUtils.emptyIfNull(null).isEmpty());
        final Collection<java.lang.Object> collection = new ArrayList<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6793,collection);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6795,null,6794,org.apache.commons.collections4.CollectionUtils.emptyIfNull(collection));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 0L);
        next(iterator, 2L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(3L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2059() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2059");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 1L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(3L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2060() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2060");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 2L);
        next(iterator, 4L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(3L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2061() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2061");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 2L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(true);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(3L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2062() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2062");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 2L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(3L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2063() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2063");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 2L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(3L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2064() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2064");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 2L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(3L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2065() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2065");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 2L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(3L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2066() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2066");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 2L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(4L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2067() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2067");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 2L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(3L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2068() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2068");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 2L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(3L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(false);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2069() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2069");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 2L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(3L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 2L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2070() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2070");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 2L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(3L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(true);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2071() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2071");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 2L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(3L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(0L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2072() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2072");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 2L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(3L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(false);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.
     * Specifically, it uses mocks to ensure that if the passed in
     * {@link Iterable} is a {@link Collection} then
     * {@link Collection#addAll(Collection)} is called instead of iterating.
     */
@Test
    public void addAllForIterable_literalMutation2073() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForIterable_literalMutation2073");
        final Collection<java.lang.Integer> inputCollection = createMock(Collection.class);
        final Iterable<java.lang.Integer> inputIterable = inputCollection;
        final Iterable<java.lang.Long> iterable = createMock(Iterable.class);
        final Iterator<java.lang.Long> iterator = createMock(Iterator.class);
        final Collection<java.lang.Number> c = createMock(Collection.class);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        next(iterator, 2L);
        next(iterator, 3L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(true);
        expect(c.add(2L)).andReturn(true);
        expect(c.add(3L)).andReturn(true);
        expect(c.addAll(inputCollection)).andReturn(true);
        expect(iterable.iterator()).andReturn(iterator);
        next(iterator, 1L);
        expect(iterator.hasNext()).andReturn(false);
        expect(c.add(1L)).andReturn(false);
        expect(c.addAll(inputCollection)).andReturn(true);
        replay();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6590,null,6589,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6592,null,6591,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6594,null,6593,org.apache.commons.collections4.CollectionUtils.addAll(c, iterable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6596,null,6595,org.apache.commons.collections4.CollectionUtils.addAll(c, inputIterable));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void addAllForEnumeration() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForEnumeration");
        final Hashtable<java.lang.Integer, java.lang.Integer> h = new Hashtable<java.lang.Integer, java.lang.Integer>();
        h.put(6, 5);
        final Enumeration<? extends java.lang.Integer> enumeration = h.keys();
        org.apache.commons.collections4.CollectionUtils.addAll(collectionA, enumeration);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6588,collectionA,6587,collectionA.contains(5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void addAllForEnumeration_literalMutation2057() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForEnumeration_literalMutation2057");
        final Hashtable<java.lang.Integer, java.lang.Integer> h = new Hashtable<java.lang.Integer, java.lang.Integer>();
        h.put(5, 4);
        final Enumeration<? extends java.lang.Integer> enumeration = h.keys();
        org.apache.commons.collections4.CollectionUtils.addAll(collectionA, enumeration);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6588,collectionA,6587,collectionA.contains(5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void addAllForElements() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "addAllForElements");
        org.apache.commons.collections4.CollectionUtils.addAll(collectionA, new Integer[]{ 6 });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6586,collectionA,6585,collectionA.contains(5));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getNegative() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getNegative");
        org.apache.commons.collections4.CollectionUtils.get(((Object)(collectionA)), 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getPositiveOutOfBounds() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "getPositiveOutOfBounds");
        org.apache.commons.collections4.CollectionUtils.get(((Object)(collectionA.iterator())), 29);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void get1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "get1");
        org.apache.commons.collections4.CollectionUtils.get(((Object)(null)), 0);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void get() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "get");
        org.apache.commons.collections4.CollectionUtils.get(((Object)(null)), -1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void reverse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "reverse");
        org.apache.commons.collections4.CollectionUtils.reverseArray(new Object[]{  });
        final Integer[] a = collectionA.toArray(new Integer[collectionA.size()]);
        org.apache.commons.collections4.CollectionUtils.reverseArray(a);
        java.util.Collections.reverse(collectionA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6980,collectionA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6982,null,6981,java.util.Arrays.asList(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void extractSingleton() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "extractSingleton");
        ArrayList<java.lang.String> coll = null;
        try {
            org.apache.commons.collections4.CollectionUtils.extractSingleton(coll);
        } catch (final IllegalArgumentException e) {
        }
        coll = new ArrayList<java.lang.String>();
        try {
            org.apache.commons.collections4.CollectionUtils.extractSingleton(coll);
        } catch (final IllegalArgumentException e) {
        }
        coll.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6809,null,6808,org.apache.commons.collections4.CollectionUtils.extractSingleton(coll));
        coll.add("bar");
        try {
            org.apache.commons.collections4.CollectionUtils.extractSingleton(coll);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void extractSingleton_literalMutation2130() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "extractSingleton_literalMutation2130");
        ArrayList<java.lang.String> coll = null;
        try {
            org.apache.commons.collections4.CollectionUtils.extractSingleton(coll);
        } catch (final IllegalArgumentException e) {
        }
        coll = new ArrayList<java.lang.String>();
        try {
            org.apache.commons.collections4.CollectionUtils.extractSingleton(coll);
        } catch (final IllegalArgumentException e) {
        }
        coll.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6809,null,6808,org.apache.commons.collections4.CollectionUtils.extractSingleton(coll));
        coll.add("foo");
        try {
            org.apache.commons.collections4.CollectionUtils.extractSingleton(coll);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Records the next object returned for a mock iterator
     */
private <T>void next(final Iterator<T> iterator, final T t) {
        expect(iterator.hasNext()).andReturn(true);
        expect(iterator.next()).andReturn(t);
    }

    @Test(expected = IllegalArgumentException.class)
    public void collateException1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "collateException1");
        org.apache.commons.collections4.CollectionUtils.collate(collectionA, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void collateException2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "collateException2");
        org.apache.commons.collections4.CollectionUtils.collate(collectionA, collectionC, null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCollate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollate");
        List<java.lang.Integer> result1 = org.apache.commons.collections4.CollectionUtils.collate(collectionD, collectionE, true);
        List<java.lang.Integer> result2 = org.apache.commons.collections4.CollectionUtils.collate(collectionE, collectionD, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7005,result1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7006,result2);
        Set<java.lang.Integer> combinedSet = new HashSet<java.lang.Integer>();
        combinedSet.addAll(collectionD);
        combinedSet.addAll(collectionE);
        List<java.lang.Integer> combinedList = new ArrayList<java.lang.Integer>(combinedSet);
        java.util.Collections.sort(combinedList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7007,combinedList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7008,result2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCollateIgnoreDuplicates() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollateIgnoreDuplicates");
        List<java.lang.Integer> result1 = org.apache.commons.collections4.CollectionUtils.collate(collectionD, collectionE, false);
        List<java.lang.Integer> result2 = org.apache.commons.collections4.CollectionUtils.collate(collectionE, collectionD, false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7005,result1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7006,result2);
        Set<java.lang.Integer> combinedSet = new HashSet<java.lang.Integer>();
        combinedSet.addAll(collectionD);
        combinedSet.addAll(collectionE);
        List<java.lang.Integer> combinedList = new ArrayList<java.lang.Integer>(combinedSet);
        java.util.Collections.sort(combinedList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7007,combinedList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7008,result2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = NullPointerException.class)
    public void testPermutationsWithNullCollection() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPermutationsWithNullCollection");
        org.apache.commons.collections4.CollectionUtils.permutations(null);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testPermutations() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPermutations");
        List<java.lang.Integer> sample = collectionA.subList(-1, 5);
        Collection<java.util.List<java.lang.Integer>> permutations = org.apache.commons.collections4.CollectionUtils.permutations(sample);
        int collSize = sample.size();
        int factorial = 1;
        for (int i = 1 ; i <= collSize ; i++) {
            factorial *= i;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7133,factorial);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7135,permutations,7134,permutations.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testPermutations_literalMutation2279() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPermutations_literalMutation2279");
        List<java.lang.Integer> sample = collectionA.subList(0, 4);
        Collection<java.util.List<java.lang.Integer>> permutations = org.apache.commons.collections4.CollectionUtils.permutations(sample);
        int collSize = sample.size();
        int factorial = 1;
        for (int i = 1 ; i <= collSize ; i++) {
            factorial *= i;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7133,factorial);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7135,permutations,7134,permutations.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testPermutations_literalMutation2280() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPermutations_literalMutation2280");
        List<java.lang.Integer> sample = collectionA.subList(0, 5);
        Collection<java.util.List<java.lang.Integer>> permutations = org.apache.commons.collections4.CollectionUtils.permutations(sample);
        int collSize = sample.size();
        int factorial = 0;
        for (int i = 1 ; i <= collSize ; i++) {
            factorial *= i;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7133,factorial);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7135,permutations,7134,permutations.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testPermutations_literalMutation2281() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPermutations_literalMutation2281");
        List<java.lang.Integer> sample = collectionA.subList(0, 5);
        Collection<java.util.List<java.lang.Integer>> permutations = org.apache.commons.collections4.CollectionUtils.permutations(sample);
        int collSize = sample.size();
        int factorial = 1;
        for (int i = 0 ; i <= collSize ; i++) {
            factorial *= i;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7133,factorial);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7135,permutations,7134,permutations.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testMatchesAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatchesAll");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7122,null,7121,org.apache.commons.collections4.CollectionUtils.matchesAll(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7124,null,7123,org.apache.commons.collections4.CollectionUtils.matchesAll(collectionA, null));
        Predicate<java.lang.Integer> lessThanFive = new Predicate<java.lang.Integer>() {
            public boolean evaluate(Integer object) {
                return object < 6;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7126,null,7125,org.apache.commons.collections4.CollectionUtils.matchesAll(collectionA, lessThanFive));
        Predicate<java.lang.Integer> lessThanFour = new Predicate<java.lang.Integer>() {
            public boolean evaluate(Integer object) {
                return object < 4;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7128,null,7127,org.apache.commons.collections4.CollectionUtils.matchesAll(collectionA, lessThanFour));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7130,null,7129,org.apache.commons.collections4.CollectionUtils.matchesAll(null, lessThanFour));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7132,null,7131,org.apache.commons.collections4.CollectionUtils.matchesAll(emptyCollection, lessThanFour));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testMatchesAll_literalMutation2277() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMatchesAll_literalMutation2277");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7122,null,7121,org.apache.commons.collections4.CollectionUtils.matchesAll(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7124,null,7123,org.apache.commons.collections4.CollectionUtils.matchesAll(collectionA, null));
        Predicate<java.lang.Integer> lessThanFive = new Predicate<java.lang.Integer>() {
            public boolean evaluate(Integer object) {
                return object < 5;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7126,null,7125,org.apache.commons.collections4.CollectionUtils.matchesAll(collectionA, lessThanFive));
        Predicate<java.lang.Integer> lessThanFour = new Predicate<java.lang.Integer>() {
            public boolean evaluate(Integer object) {
                return object < 3;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7128,null,7127,org.apache.commons.collections4.CollectionUtils.matchesAll(collectionA, lessThanFour));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7130,null,7129,org.apache.commons.collections4.CollectionUtils.matchesAll(null, lessThanFour));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7132,null,7131,org.apache.commons.collections4.CollectionUtils.matchesAll(emptyCollection, lessThanFour));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

