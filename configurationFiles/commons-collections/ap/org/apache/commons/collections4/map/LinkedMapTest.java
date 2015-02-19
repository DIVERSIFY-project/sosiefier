package org.apache.commons.collections4.map;

import org.apache.commons.collections4.list.AbstractListTest;
import java.util.ArrayList;
import org.apache.commons.collections4.BulkTest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.ResettableIterator;
import junit.framework.Test;

/** 
 * JUnit tests.
 * 
 * @version $Id$
 */
public class LinkedMapTest<K, V> extends AbstractOrderedMapTest<K, V> {
    public LinkedMapTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return BulkTest.makeSuite(LinkedMapTest.class);
    }

    @Override
    public LinkedMap<K, V> makeObject() {
        return new LinkedMap<K, V>();
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public LinkedMap<K, V> makeFullMap() {
        return ((LinkedMap<K, V>)(super.makeFullMap()));
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testReset_add342() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_add342");
        resetEmpty();
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        ((ResettableIterator<K>)(ordered.mapIterator())).reset();
        resetFull();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(ordered.keySet());
        final ResettableIterator<K> it = ((ResettableIterator<K>)(ordered.mapIterator()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,list,920,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,it,922,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,list,924,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,list,928,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,it,930,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testReset_add343() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_add343");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        ((ResettableIterator<K>)(ordered.mapIterator())).reset();
        ((ResettableIterator<K>)(ordered.mapIterator())).reset();
        resetFull();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(ordered.keySet());
        final ResettableIterator<K> it = ((ResettableIterator<K>)(ordered.mapIterator()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,list,920,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,it,922,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,list,924,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,list,928,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,it,930,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testReset_add344() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_add344");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        ((ResettableIterator<K>)(ordered.mapIterator())).reset();
        resetFull();
        resetFull();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(ordered.keySet());
        final ResettableIterator<K> it = ((ResettableIterator<K>)(ordered.mapIterator()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,list,920,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,it,922,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,list,924,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,list,928,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,it,930,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testReset_add345() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_add345");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        ((ResettableIterator<K>)(ordered.mapIterator())).reset();
        resetFull();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(ordered.keySet());
        final ResettableIterator<K> it = ((ResettableIterator<K>)(ordered.mapIterator()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,list,920,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,it,922,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,list,924,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        it.reset();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,list,928,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,it,930,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testReset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        ((ResettableIterator<K>)(ordered.mapIterator())).reset();
        resetFull();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(ordered.keySet());
        final ResettableIterator<K> it = ((ResettableIterator<K>)(ordered.mapIterator()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,list,920,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,it,922,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,list,924,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,list,928,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,it,930,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testReset_remove277() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_remove277");
        OrderedMap<K, V> ordered = getMap();
        ((ResettableIterator<K>)(ordered.mapIterator())).reset();
        resetFull();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(ordered.keySet());
        final ResettableIterator<K> it = ((ResettableIterator<K>)(ordered.mapIterator()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,list,920,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,it,922,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,list,924,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,list,928,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,it,930,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testReset_remove278() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_remove278");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        resetFull();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(ordered.keySet());
        final ResettableIterator<K> it = ((ResettableIterator<K>)(ordered.mapIterator()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,list,920,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,it,922,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,list,924,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,list,928,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,it,930,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testReset_remove279() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_remove279");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        ((ResettableIterator<K>)(ordered.mapIterator())).reset();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(ordered.keySet());
        final ResettableIterator<K> it = ((ResettableIterator<K>)(ordered.mapIterator()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,list,920,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,it,922,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,list,924,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,list,928,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,it,930,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testReset_remove280() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_remove280");
        resetEmpty();
        OrderedMap<K, V> ordered = getMap();
        resetFull();
        ordered = getMap();
        final List<K> list = new ArrayList<K>(ordered.keySet());
        final ResettableIterator<K> it = ((ResettableIterator<K>)(ordered.mapIterator()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,list,920,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,it,922,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,list,924,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,list,928,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,it,930,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testInsertionOrder_add328() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_add328");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        resetEmpty();
        map.put(keys[0], values[0]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testInsertionOrder_add329() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_add329");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[0], values[0]);
        map.put(keys[0], values[0]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testInsertionOrder_add330() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_add330");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[0], values[0]);
        map.put(keys[1], values[1]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testInsertionOrder_add331() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_add331");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[0], values[0]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testInsertionOrder_add332() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_add332");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[0], values[0]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testInsertionOrder_add333() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_add333");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[0], values[0]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInsertionOrder() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[-1], values[0]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInsertionOrder_literalMutation246() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_literalMutation246");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[0], values[-1]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInsertionOrder_literalMutation247() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_literalMutation247");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[0], values[0]);
        map.put(keys[2], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInsertionOrder_literalMutation248() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_literalMutation248");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[0], values[0]);
        map.put(keys[1], values[0]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInsertionOrder_literalMutation249() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_literalMutation249");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[0], values[0]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[2], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInsertionOrder_literalMutation250() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_literalMutation250");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[0], values[0]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[0]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInsertionOrder_literalMutation251() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_literalMutation251");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[0], values[0]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[0], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInsertionOrder_literalMutation252() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_literalMutation252");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[0], values[0]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInsertionOrder_literalMutation253() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_literalMutation253");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[0], values[0]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[1], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInsertionOrder_literalMutation254() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_literalMutation254");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[0], values[0]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[4]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testInsertionOrder_remove268() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_remove268");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        map.put(keys[0], values[0]);
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testInsertionOrder_remove269() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_remove269");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testInsertionOrder_remove270() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_remove270");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testInsertionOrder_remove271() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_remove271");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testInsertionOrder_remove272() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_remove272");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testInsertionOrder_remove273() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInsertionOrder_remove273");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final K[] keys = getSampleKeys();
        final V[] values = getSampleValues();
        Iterator<K> keyIter;
        Iterator<V> valueIter;
        resetEmpty();
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),867,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),869,keyIter,868,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),870,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),872,keyIter,871,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),873,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),875,valueIter,874,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),876,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),878,valueIter,877,valueIter.next());
        map.put(keys[1], values[1]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),879,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),881,keyIter,880,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),882,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),884,keyIter,883,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),885,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),887,valueIter,886,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),888,values[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),890,valueIter,889,valueIter.next());
        map.put(keys[1], values[2]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),891,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),893,keyIter,892,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),894,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),896,keyIter,895,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),897,values[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),899,valueIter,898,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),900,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),902,valueIter,901,valueIter.next());
        map.put(keys[0], values[3]);
        keyIter = map.keySet().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),903,keys[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),905,keyIter,904,keyIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),906,keys[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),908,keyIter,907,keyIter.next());
        valueIter = map.values().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,values[3]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,valueIter,910,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),912,values[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),914,valueIter,913,valueIter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_add312() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_add312");
        resetEmpty();
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),853,it,852,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,lm,854,lm.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_add313() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_add313");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.get(0);
            lm.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),853,it,852,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,lm,854,lm.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_add314() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_add314");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(-1);
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),853,it,852,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,lm,854,lm.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_add315() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_add315");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        resetFull();
        lm = getMap();
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),853,it,852,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,lm,854,lm.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_add316() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_add316");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.get(-1);
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),853,it,852,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,lm,854,lm.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_add317() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_add317");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(lm.size());
            lm.get(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),853,it,852,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,lm,854,lm.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.get(1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),853,it,852,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,lm,854,lm.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetByIndex_literalMutation236() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_literalMutation236");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),853,it,852,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,lm,854,lm.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetByIndex_literalMutation237() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_literalMutation237");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.get(2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),853,it,852,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,lm,854,lm.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetByIndex_literalMutation238() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_literalMutation238");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 1;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),853,it,852,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,lm,854,lm.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_remove262() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_remove262");
        LinkedMap<K, V> lm = getMap();
        try {
            lm.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),853,it,852,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,lm,854,lm.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_remove263() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_remove263");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        lm = getMap();
        try {
            lm.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.get(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),853,it,852,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),855,lm,854,lm.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_add318() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_add318");
        resetEmpty();
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,it,856,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,lm,858,lm.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_add319() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_add319");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.getValue(0);
            lm.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,it,856,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,lm,858,lm.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_add320() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_add320");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(-1);
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,it,856,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,lm,858,lm.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_add321() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_add321");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        resetFull();
        lm = getMap();
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,it,856,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,lm,858,lm.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_add322() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_add322");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.getValue(-1);
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,it,856,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,lm,858,lm.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_add323() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_add323");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(lm.size());
            lm.getValue(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,it,856,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,lm,858,lm.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_add324() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_add324");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,it,856,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,lm,858,lm.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetValueByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,it,856,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,lm,858,lm.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetValueByIndex_literalMutation240() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_literalMutation240");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,it,856,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,lm,858,lm.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetValueByIndex_literalMutation241() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_literalMutation241");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.getValue(2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,it,856,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,lm,858,lm.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetValueByIndex_literalMutation242() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_literalMutation242");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = -1;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,it,856,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,lm,858,lm.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_remove264() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_remove264");
        LinkedMap<K, V> lm = getMap();
        try {
            lm.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,it,856,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,lm,858,lm.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_remove265() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_remove265");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        lm = getMap();
        try {
            lm.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.getValue(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),857,it,856,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),859,lm,858,lm.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIndexOf_add325() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_add325");
        resetEmpty();
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),860,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),862,lm,861,lm.indexOf(getOtherKeys()));
        resetFull();
        lm = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),865,lm,864,lm.indexOf(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIndexOf_add326() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_add326");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),860,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),862,lm,861,lm.indexOf(getOtherKeys()));
        resetFull();
        resetFull();
        lm = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),865,lm,864,lm.indexOf(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIndexOf_add327() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_add327");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),860,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),862,lm,861,lm.indexOf(getOtherKeys()));
        resetFull();
        lm = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),865,lm,864,lm.indexOf(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexOf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),860,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),862,lm,861,lm.indexOf(getOtherKeys()));
        resetFull();
        lm = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = -1 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),865,lm,864,lm.indexOf(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIndexOf_remove266() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_remove266");
        LinkedMap<K, V> lm = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),860,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),862,lm,861,lm.indexOf(getOtherKeys()));
        resetFull();
        lm = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),865,lm,864,lm.indexOf(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIndexOf_remove267() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_remove267");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),860,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),862,lm,861,lm.indexOf(getOtherKeys()));
        lm = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),863,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),865,lm,864,lm.indexOf(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add334() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add334");
        resetEmpty();
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add335() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add335");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(0);
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add336() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add336");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(-1);
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add337() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add337");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        resetFull();
        lm = getMap();
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add338() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add338");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.remove(-1);
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add339() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add339");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add340() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add340");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add341() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add341");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            list.remove(i);
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveByIndex_literalMutation256() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_literalMutation256");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveByIndex_literalMutation257() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_literalMutation257");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.remove(2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveByIndex_literalMutation258() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_literalMutation258");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = -1 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_remove274() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_remove274");
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_remove275() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_remove275");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        lm = getMap();
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_remove276() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_remove276");
        resetEmpty();
        LinkedMap<K, V> lm = getMap();
        try {
            lm.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lm = getMap();
        try {
            lm.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lm.remove(lm.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lm.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lm.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lm,916,lm.remove(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,lm,918,lm.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public BulkTest bulkTestListView() {
        return new TestListView();
    }

    public class TestListView extends AbstractListTest<K> {
        TestListView() {
            super("TestListView");
        }

        @Override
        public List<K> makeObject() {
            return org.apache.commons.collections4.map.LinkedMapTest.this.makeObject().asList();
        }

        @Override
        public List<K> makeFullCollection() {
            return org.apache.commons.collections4.map.LinkedMapTest.this.makeFullMap().asList();
        }

        @Override
        public K[] getFullElements() {
            return org.apache.commons.collections4.map.LinkedMapTest.this.getSampleKeys();
        }

        @Override
        public boolean isAddSupported() {
            return false;
        }

        @Override
        public boolean isRemoveSupported() {
            return false;
        }

        @Override
        public boolean isSetSupported() {
            return false;
        }

        @Override
        public boolean isNullSupported() {
            return org.apache.commons.collections4.map.LinkedMapTest.this.isAllowNullKey();
        }

        @Override
        public boolean isTestSerialization() {
            return false;
        }
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone");
        final LinkedMap<K, V> map = new LinkedMap<K, V>(10);
        map.put(((K)("1")), ((V)("1")));
        final Map<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,map,844,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,cloned,846,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,map,848,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,cloned,850,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testClone_add311() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_add311");
        final LinkedMap<K, V> map = new LinkedMap<K, V>(10);
        map.put(((K)("1")), ((V)("1")));
        map.put(((K)("1")), ((V)("1")));
        final Map<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,map,844,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,cloned,846,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,map,848,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,cloned,850,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone_literalMutation231() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_literalMutation231");
        final LinkedMap<K, V> map = new LinkedMap<K, V>(10);
        map.put(((K)("1")), ((V)("1")));
        final Map<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,map,844,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,cloned,846,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,map,848,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,cloned,850,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone_literalMutation232() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_literalMutation232");
        final LinkedMap<K, V> map = new LinkedMap<K, V>(11);
        map.put(((K)("1")), ((V)("1")));
        final Map<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,map,844,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,cloned,846,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,map,848,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,cloned,850,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone_literalMutation233() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_literalMutation233");
        final LinkedMap<K, V> map = new LinkedMap<K, V>(10);
        map.put(((K)("foo")), ((V)("1")));
        final Map<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,map,844,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,cloned,846,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,map,848,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,cloned,850,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone_literalMutation234() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_literalMutation234");
        final LinkedMap<K, V> map = new LinkedMap<K, V>(10);
        map.put(((K)("1")), ((V)("foo")));
        final Map<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,map,844,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,cloned,846,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,map,848,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,cloned,850,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testClone_remove261() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone_remove261");
        final LinkedMap<K, V> map = new LinkedMap<K, V>(10);
        final Map<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),845,map,844,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),847,cloned,846,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),849,map,848,map.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),851,cloned,850,cloned.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public LinkedMap<K, V> getMap() {
        return ((LinkedMap<K, V>)(super.getMap()));
    }

    /** 
     * Test for <a href="https://issues.apache.org/jira/browse/COLLECTIONS-323">COLLECTIONS-323</a>.
     */
public void testInitialCapacityZero() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInitialCapacityZero");
        final LinkedMap<java.lang.String, java.lang.String> map = new LinkedMap<java.lang.String, java.lang.String>(0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,map.data.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for <a href="https://issues.apache.org/jira/browse/COLLECTIONS-323">COLLECTIONS-323</a>.
     */
public void testInitialCapacityZero_literalMutation244() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInitialCapacityZero_literalMutation244");
        final LinkedMap<java.lang.String, java.lang.String> map = new LinkedMap<java.lang.String, java.lang.String>(-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),866,map.data.length);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

