package org.apache.commons.collections4.map;

import org.apache.commons.collections4.list.AbstractListTest;
import java.util.ArrayList;
import org.apache.commons.collections4.BulkTest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import junit.framework.Test;
import java.util.TreeMap;

/** 
 * Extension of {@link AbstractOrderedMapTest} for exercising the {@link ListOrderedMap}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class ListOrderedMapTest<K, V> extends AbstractOrderedMapTest<K, V> {
    public ListOrderedMapTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return BulkTest.makeSuite(ListOrderedMapTest.class);
    }

    @Override
    public ListOrderedMap<K, V> makeObject() {
        return ListOrderedMap.listOrderedMap(new HashMap<K, V>());
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public ListOrderedMap<K, V> makeFullMap() {
        return ((ListOrderedMap<K, V>)(super.makeFullMap()));
    }

    public void testGetByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.get(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,it,959,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,lom,961,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetByIndex_literalMutation283() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_literalMutation283");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.get(1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.get(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,it,959,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,lom,961,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetByIndex_literalMutation284() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_literalMutation284");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.get(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,it,959,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,lom,961,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetByIndex_literalMutation285() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_literalMutation285");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.get(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,it,959,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,lom,961,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetByIndex_literalMutation286() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_literalMutation286");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.get(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = -1;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,it,959,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,lom,961,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetValueByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.getValue(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,it,963,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,lom,965,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetValueByIndex_literalMutation287() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_literalMutation287");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.getValue(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,it,963,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,lom,965,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetValueByIndex_literalMutation288() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_literalMutation288");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.getValue(2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.getValue(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,it,963,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,lom,965,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetValueByIndex_literalMutation289() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_literalMutation289");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.getValue(2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.getValue(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,it,963,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,lom,965,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetValueByIndex_literalMutation290() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_literalMutation290");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.getValue(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.getValue(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = -1;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,it,963,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),966,lom,965,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexOf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),967,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),969,lom,968,lom.indexOf(getOtherKeys()));
        resetFull();
        lom = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),970,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),972,lom,971,lom.indexOf(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexOf_literalMutation291() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_literalMutation291");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),967,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),969,lom,968,lom.indexOf(getOtherKeys()));
        resetFull();
        lom = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 1 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),970,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),972,lom,971,lom.indexOf(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSetValueByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValueByIndex");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.setValue(0, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(-1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.setValue(-1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(lom.size(), ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        for (int i = 0 ; i < (lom.size()) ; i++) {
            final V value = lom.getValue(i);
            final Object input = Integer.valueOf(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1087,lom,1086,lom.setValue(i, ((V)(input))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,input);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,lom,1089,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSetValueByIndex_literalMutation366() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValueByIndex_literalMutation366");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.setValue(1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(-1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.setValue(-1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(lom.size(), ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        for (int i = 0 ; i < (lom.size()) ; i++) {
            final V value = lom.getValue(i);
            final Object input = Integer.valueOf(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1087,lom,1086,lom.setValue(i, ((V)(input))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,input);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,lom,1089,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSetValueByIndex_literalMutation367() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValueByIndex_literalMutation367");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.setValue(0, ((V)("foo")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(-1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.setValue(-1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(lom.size(), ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        for (int i = 0 ; i < (lom.size()) ; i++) {
            final V value = lom.getValue(i);
            final Object input = Integer.valueOf(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1087,lom,1086,lom.setValue(i, ((V)(input))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,input);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,lom,1089,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSetValueByIndex_literalMutation368() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValueByIndex_literalMutation368");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.setValue(0, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(0, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.setValue(-1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(lom.size(), ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        for (int i = 0 ; i < (lom.size()) ; i++) {
            final V value = lom.getValue(i);
            final Object input = Integer.valueOf(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1087,lom,1086,lom.setValue(i, ((V)(input))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,input);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,lom,1089,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSetValueByIndex_literalMutation369() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValueByIndex_literalMutation369");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.setValue(0, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(-1, ((V)("foo")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.setValue(-1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(lom.size(), ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        for (int i = 0 ; i < (lom.size()) ; i++) {
            final V value = lom.getValue(i);
            final Object input = Integer.valueOf(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1087,lom,1086,lom.setValue(i, ((V)(input))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,input);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,lom,1089,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSetValueByIndex_literalMutation370() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValueByIndex_literalMutation370");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.setValue(0, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(-1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.setValue(2, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(lom.size(), ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        for (int i = 0 ; i < (lom.size()) ; i++) {
            final V value = lom.getValue(i);
            final Object input = Integer.valueOf(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1087,lom,1086,lom.setValue(i, ((V)(input))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,input);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,lom,1089,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSetValueByIndex_literalMutation371() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValueByIndex_literalMutation371");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.setValue(0, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(-1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.setValue(-1, ((V)("foo")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(lom.size(), ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        for (int i = 0 ; i < (lom.size()) ; i++) {
            final V value = lom.getValue(i);
            final Object input = Integer.valueOf(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1087,lom,1086,lom.setValue(i, ((V)(input))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,input);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,lom,1089,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSetValueByIndex_literalMutation372() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValueByIndex_literalMutation372");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.setValue(0, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(-1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.setValue(-1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(lom.size(), ((V)("foo")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        for (int i = 0 ; i < (lom.size()) ; i++) {
            final V value = lom.getValue(i);
            final Object input = Integer.valueOf(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1087,lom,1086,lom.setValue(i, ((V)(input))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,input);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,lom,1089,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSetValueByIndex_literalMutation373() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetValueByIndex_literalMutation373");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.setValue(0, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(-1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.setValue(-1, ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.setValue(lom.size(), ((V)("")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        for (int i = 1 ; i < (lom.size()) ; i++) {
            final V value = lom.getValue(i);
            final Object input = Integer.valueOf(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1087,lom,1086,lom.setValue(i, ((V)(input))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1088,input);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1090,lom,1089,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.remove(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lom.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1081,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1083,lom,1082,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1085,lom,1084,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveByIndex_literalMutation361() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_literalMutation361");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.remove(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lom.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1081,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1083,lom,1082,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1085,lom,1084,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveByIndex_literalMutation362() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_literalMutation362");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.remove(2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.remove(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lom.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1081,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1083,lom,1082,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1085,lom,1084,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveByIndex_literalMutation363() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_literalMutation363");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.remove(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lom.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1081,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1083,lom,1082,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1085,lom,1084,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveByIndex_literalMutation364() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_literalMutation364");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        lom = getMap();
        try {
            lom.remove(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.remove(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 1 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lom.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1081,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1083,lom,1082,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1085,lom,1084,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation311() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation311");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(2, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation312() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation312");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("foo")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation313() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation313");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("foo")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation314() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation314");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(2, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation315() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation315");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("foo")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation316() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation316");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("foo")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation317() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation317");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation318() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation318");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("foo")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation319() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation319");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation320() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation320");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("foo")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation321() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation321");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation322() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation322");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(1, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation323() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation323");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("foo")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation324() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation324");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation325() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation325");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(2, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation326() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation326");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("foo")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation327() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation327");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation328() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation328");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(1, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation329() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation329");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("foo")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation330() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation330");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation331() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation331");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = -1 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation332() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation332");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(0);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation333() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation333");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(2);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation334() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation334");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(3);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation335() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation335");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(4);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation336() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation336");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("foo")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation337() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation337");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("foo")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation338() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation338");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("foo")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation339() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation339");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(-1, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation340() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation340");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation341() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation341");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("foo")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation342() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation342");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("foo")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation343() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation343");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("foo")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation344() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation344");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation345() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation345");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation346() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation346");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("foo")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation347() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation347");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("foo")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation348() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation348");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("foo")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation349() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation349");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation350() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation350");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation351() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation351");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("foo")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation352() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation352");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("foo")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation353() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation353");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("foo")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation354() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation354");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation355() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation355");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation356() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation356");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("foo")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation357() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation357");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("foo")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation358() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation358");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("foo")));
        lom.put(3, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation359() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation359");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(4, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPut_intObjectObject_literalMutation360() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPut_intObjectObject_literalMutation360");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.put(1, ((K)("testInsert1")), ((V)("testInsert1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.put(-1, ((K)("testInsert-1")), ((V)("testInsert-1v")));
        } catch (final IndexOutOfBoundsException ex) {
        }
        lom.put(0, ((K)("testInsert1")), ((V)("testInsert1v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),994,lom,993,lom.getValue(0));
        lom.put(((K)("testInsertPut")), ((V)("testInsertPutv")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),996,lom,995,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,lom,997,lom.getValue(1));
        lom.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1000,lom,999,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1002,lom,1001,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1004,lom,1003,lom.getValue(2));
        lom.put(3, ((K)("testInsert3")), ((V)("testInsert3v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1006,lom,1005,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1008,lom,1007,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1010,lom,1009,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1012,lom,1011,lom.getValue(3));
        resetFull();
        lom = getMap();
        final ListOrderedMap<K, V> lom2 = new ListOrderedMap<K, V>();
        lom2.putAll(lom);
        lom2.put(0, ((K)("testInsert0")), ((V)("testInsert0v")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1014,lom2,1013,lom2.getValue(0));
        for (int i = 0 ; i < (lom.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1016,lom2,1015,lom2.getValue((i + 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1018,lom,1017,lom.getValue(i));
        }
        final Integer i1 = Integer.valueOf(1);
        final Integer i1b = Integer.valueOf(1);
        final Integer i2 = Integer.valueOf(2);
        final Integer i3 = Integer.valueOf(3);
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1020,lom,1019,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1022,lom.map,1021,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1024,lom.keyList(),1023,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1026,lom,1025,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1027,i1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1029,lom,1028,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(0, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1031,lom,1030,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1033,lom.map,1032,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1035,lom.keyList(),1034,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1037,lom,1036,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1039,lom,1038,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1041,lom,1040,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1042,i1b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1044,lom,1043,lom.get(0));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(1, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1046,lom,1045,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1048,lom.map,1047,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1050,lom.keyList(),1049,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1052,lom,1051,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1054,lom,1053,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1056,lom,1055,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(2, ((K)(i1b)), ((V)("One")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1058,lom,1057,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1060,lom.map,1059,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1062,lom.keyList(),1061,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1064,lom,1063,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1066,lom,1065,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1068,lom,1067,lom.getValue(2));
        resetEmpty();
        lom = getMap();
        lom.put(((K)(i1)), ((V)("1")));
        lom.put(((K)(i2)), ((V)("2")));
        lom.put(((K)(i3)), ((V)("3")));
        lom.put(3, ((K)(i1b)), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1070,lom,1069,lom.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1072,lom.map,1071,lom.map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1074,lom.keyList(),1073,lom.keyList().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1076,lom,1075,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1078,lom,1077,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1080,lom,1079,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAllWithIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndex");
        resetEmpty();
        @SuppressWarnings(value = "unchecked")
        final ListOrderedMap<java.lang.String, java.lang.String> lom = ((ListOrderedMap<java.lang.String, java.lang.String>)(map));
        lom.put("testInsert0", "testInsert0v");
        lom.put("testInsert1", "testInsert1v");
        lom.put("testInsert2", "testInsert2v");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,lom,977,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,lom,979,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,lom,981,lom.getValue(2));
        final Map<java.lang.String, java.lang.String> values = new ListOrderedMap<java.lang.String, java.lang.String>();
        values.put("NewInsert0", "NewInsert0v");
        values.put("NewInsert1", "NewInsert1v");
        lom.putAll(1, values);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,lom,983,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,lom,985,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,lom,987,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,lom,989,lom.getValue(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,lom,991,lom.getValue(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAllWithIndex_literalMutation293() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndex_literalMutation293");
        resetEmpty();
        @SuppressWarnings(value = "unchecked")
        final ListOrderedMap<java.lang.String, java.lang.String> lom = ((ListOrderedMap<java.lang.String, java.lang.String>)(map));
        lom.put("foo", "testInsert0v");
        lom.put("testInsert1", "testInsert1v");
        lom.put("testInsert2", "testInsert2v");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,lom,977,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,lom,979,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,lom,981,lom.getValue(2));
        final Map<java.lang.String, java.lang.String> values = new ListOrderedMap<java.lang.String, java.lang.String>();
        values.put("NewInsert0", "NewInsert0v");
        values.put("NewInsert1", "NewInsert1v");
        lom.putAll(1, values);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,lom,983,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,lom,985,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,lom,987,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,lom,989,lom.getValue(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,lom,991,lom.getValue(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAllWithIndex_literalMutation294() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndex_literalMutation294");
        resetEmpty();
        @SuppressWarnings(value = "unchecked")
        final ListOrderedMap<java.lang.String, java.lang.String> lom = ((ListOrderedMap<java.lang.String, java.lang.String>)(map));
        lom.put("testInsert0", "foo");
        lom.put("testInsert1", "testInsert1v");
        lom.put("testInsert2", "testInsert2v");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,lom,977,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,lom,979,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,lom,981,lom.getValue(2));
        final Map<java.lang.String, java.lang.String> values = new ListOrderedMap<java.lang.String, java.lang.String>();
        values.put("NewInsert0", "NewInsert0v");
        values.put("NewInsert1", "NewInsert1v");
        lom.putAll(1, values);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,lom,983,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,lom,985,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,lom,987,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,lom,989,lom.getValue(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,lom,991,lom.getValue(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAllWithIndex_literalMutation295() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndex_literalMutation295");
        resetEmpty();
        @SuppressWarnings(value = "unchecked")
        final ListOrderedMap<java.lang.String, java.lang.String> lom = ((ListOrderedMap<java.lang.String, java.lang.String>)(map));
        lom.put("testInsert0", "testInsert0v");
        lom.put("foo", "testInsert1v");
        lom.put("testInsert2", "testInsert2v");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,lom,977,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,lom,979,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,lom,981,lom.getValue(2));
        final Map<java.lang.String, java.lang.String> values = new ListOrderedMap<java.lang.String, java.lang.String>();
        values.put("NewInsert0", "NewInsert0v");
        values.put("NewInsert1", "NewInsert1v");
        lom.putAll(1, values);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,lom,983,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,lom,985,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,lom,987,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,lom,989,lom.getValue(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,lom,991,lom.getValue(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAllWithIndex_literalMutation296() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndex_literalMutation296");
        resetEmpty();
        @SuppressWarnings(value = "unchecked")
        final ListOrderedMap<java.lang.String, java.lang.String> lom = ((ListOrderedMap<java.lang.String, java.lang.String>)(map));
        lom.put("testInsert0", "testInsert0v");
        lom.put("testInsert1", "foo");
        lom.put("testInsert2", "testInsert2v");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,lom,977,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,lom,979,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,lom,981,lom.getValue(2));
        final Map<java.lang.String, java.lang.String> values = new ListOrderedMap<java.lang.String, java.lang.String>();
        values.put("NewInsert0", "NewInsert0v");
        values.put("NewInsert1", "NewInsert1v");
        lom.putAll(1, values);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,lom,983,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,lom,985,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,lom,987,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,lom,989,lom.getValue(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,lom,991,lom.getValue(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAllWithIndex_literalMutation297() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndex_literalMutation297");
        resetEmpty();
        @SuppressWarnings(value = "unchecked")
        final ListOrderedMap<java.lang.String, java.lang.String> lom = ((ListOrderedMap<java.lang.String, java.lang.String>)(map));
        lom.put("testInsert0", "testInsert0v");
        lom.put("testInsert1", "testInsert1v");
        lom.put("foo", "testInsert2v");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,lom,977,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,lom,979,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,lom,981,lom.getValue(2));
        final Map<java.lang.String, java.lang.String> values = new ListOrderedMap<java.lang.String, java.lang.String>();
        values.put("NewInsert0", "NewInsert0v");
        values.put("NewInsert1", "NewInsert1v");
        lom.putAll(1, values);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,lom,983,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,lom,985,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,lom,987,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,lom,989,lom.getValue(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,lom,991,lom.getValue(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAllWithIndex_literalMutation298() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndex_literalMutation298");
        resetEmpty();
        @SuppressWarnings(value = "unchecked")
        final ListOrderedMap<java.lang.String, java.lang.String> lom = ((ListOrderedMap<java.lang.String, java.lang.String>)(map));
        lom.put("testInsert0", "testInsert0v");
        lom.put("testInsert1", "testInsert1v");
        lom.put("testInsert2", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,lom,977,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,lom,979,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,lom,981,lom.getValue(2));
        final Map<java.lang.String, java.lang.String> values = new ListOrderedMap<java.lang.String, java.lang.String>();
        values.put("NewInsert0", "NewInsert0v");
        values.put("NewInsert1", "NewInsert1v");
        lom.putAll(1, values);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,lom,983,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,lom,985,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,lom,987,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,lom,989,lom.getValue(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,lom,991,lom.getValue(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAllWithIndex_literalMutation299() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndex_literalMutation299");
        resetEmpty();
        @SuppressWarnings(value = "unchecked")
        final ListOrderedMap<java.lang.String, java.lang.String> lom = ((ListOrderedMap<java.lang.String, java.lang.String>)(map));
        lom.put("testInsert0", "testInsert0v");
        lom.put("testInsert1", "testInsert1v");
        lom.put("testInsert2", "testInsert2v");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,lom,977,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,lom,979,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,lom,981,lom.getValue(2));
        final Map<java.lang.String, java.lang.String> values = new ListOrderedMap<java.lang.String, java.lang.String>();
        values.put("foo", "NewInsert0v");
        values.put("NewInsert1", "NewInsert1v");
        lom.putAll(1, values);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,lom,983,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,lom,985,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,lom,987,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,lom,989,lom.getValue(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,lom,991,lom.getValue(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAllWithIndex_literalMutation300() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndex_literalMutation300");
        resetEmpty();
        @SuppressWarnings(value = "unchecked")
        final ListOrderedMap<java.lang.String, java.lang.String> lom = ((ListOrderedMap<java.lang.String, java.lang.String>)(map));
        lom.put("testInsert0", "testInsert0v");
        lom.put("testInsert1", "testInsert1v");
        lom.put("testInsert2", "testInsert2v");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,lom,977,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,lom,979,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,lom,981,lom.getValue(2));
        final Map<java.lang.String, java.lang.String> values = new ListOrderedMap<java.lang.String, java.lang.String>();
        values.put("NewInsert0", "foo");
        values.put("NewInsert1", "NewInsert1v");
        lom.putAll(1, values);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,lom,983,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,lom,985,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,lom,987,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,lom,989,lom.getValue(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,lom,991,lom.getValue(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAllWithIndex_literalMutation301() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndex_literalMutation301");
        resetEmpty();
        @SuppressWarnings(value = "unchecked")
        final ListOrderedMap<java.lang.String, java.lang.String> lom = ((ListOrderedMap<java.lang.String, java.lang.String>)(map));
        lom.put("testInsert0", "testInsert0v");
        lom.put("testInsert1", "testInsert1v");
        lom.put("testInsert2", "testInsert2v");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,lom,977,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,lom,979,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,lom,981,lom.getValue(2));
        final Map<java.lang.String, java.lang.String> values = new ListOrderedMap<java.lang.String, java.lang.String>();
        values.put("NewInsert0", "NewInsert0v");
        values.put("foo", "NewInsert1v");
        lom.putAll(1, values);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,lom,983,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,lom,985,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,lom,987,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,lom,989,lom.getValue(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,lom,991,lom.getValue(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAllWithIndex_literalMutation302() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndex_literalMutation302");
        resetEmpty();
        @SuppressWarnings(value = "unchecked")
        final ListOrderedMap<java.lang.String, java.lang.String> lom = ((ListOrderedMap<java.lang.String, java.lang.String>)(map));
        lom.put("testInsert0", "testInsert0v");
        lom.put("testInsert1", "testInsert1v");
        lom.put("testInsert2", "testInsert2v");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,lom,977,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,lom,979,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,lom,981,lom.getValue(2));
        final Map<java.lang.String, java.lang.String> values = new ListOrderedMap<java.lang.String, java.lang.String>();
        values.put("NewInsert0", "NewInsert0v");
        values.put("NewInsert1", "foo");
        lom.putAll(1, values);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,lom,983,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,lom,985,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,lom,987,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,lom,989,lom.getValue(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,lom,991,lom.getValue(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutAllWithIndex_literalMutation303() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndex_literalMutation303");
        resetEmpty();
        @SuppressWarnings(value = "unchecked")
        final ListOrderedMap<java.lang.String, java.lang.String> lom = ((ListOrderedMap<java.lang.String, java.lang.String>)(map));
        lom.put("testInsert0", "testInsert0v");
        lom.put("testInsert1", "testInsert1v");
        lom.put("testInsert2", "testInsert2v");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),978,lom,977,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),980,lom,979,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),982,lom,981,lom.getValue(2));
        final Map<java.lang.String, java.lang.String> values = new ListOrderedMap<java.lang.String, java.lang.String>();
        values.put("NewInsert0", "NewInsert0v");
        values.put("NewInsert1", "NewInsert1v");
        lom.putAll(2, values);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),984,lom,983,lom.getValue(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),986,lom,985,lom.getValue(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),988,lom,987,lom.getValue(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),990,lom,989,lom.getValue(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),992,lom,991,lom.getValue(4));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAllWithIndexBug441() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndexBug441");
        resetEmpty();
        final ListOrderedMap<K, V> lom = getMap();
        final int size = 5;
        for (int i = 0 ; i < size ; i++) {
            lom.put(((K)(Integer.valueOf(i))), ((V)(java.lang.Boolean.TRUE)));
        }
        final Map<K, V> map = new TreeMap<K, V>();
        for (int i = 0 ; i < size ; i++) {
            map.put(((K)(Integer.valueOf(i))), ((V)(java.lang.Boolean.FALSE)));
        }
        lom.putAll(3, map);
        final List<K> orderedList = lom.asList();
        for (int i = 0 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),974,null,973,java.lang.Integer.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,orderedList,975,orderedList.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAllWithIndexBug441_literalMutation305() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndexBug441_literalMutation305");
        resetEmpty();
        final ListOrderedMap<K, V> lom = getMap();
        final int size = 6;
        for (int i = 0 ; i < size ; i++) {
            lom.put(((K)(Integer.valueOf(i))), ((V)(java.lang.Boolean.TRUE)));
        }
        final Map<K, V> map = new TreeMap<K, V>();
        for (int i = 0 ; i < size ; i++) {
            map.put(((K)(Integer.valueOf(i))), ((V)(java.lang.Boolean.FALSE)));
        }
        lom.putAll(3, map);
        final List<K> orderedList = lom.asList();
        for (int i = 0 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),974,null,973,java.lang.Integer.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,orderedList,975,orderedList.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAllWithIndexBug441_literalMutation306() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndexBug441_literalMutation306");
        resetEmpty();
        final ListOrderedMap<K, V> lom = getMap();
        final int size = 5;
        for (int i = 1 ; i < size ; i++) {
            lom.put(((K)(Integer.valueOf(i))), ((V)(java.lang.Boolean.TRUE)));
        }
        final Map<K, V> map = new TreeMap<K, V>();
        for (int i = 0 ; i < size ; i++) {
            map.put(((K)(Integer.valueOf(i))), ((V)(java.lang.Boolean.FALSE)));
        }
        lom.putAll(3, map);
        final List<K> orderedList = lom.asList();
        for (int i = 0 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),974,null,973,java.lang.Integer.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,orderedList,975,orderedList.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAllWithIndexBug441_literalMutation307() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndexBug441_literalMutation307");
        resetEmpty();
        final ListOrderedMap<K, V> lom = getMap();
        final int size = 5;
        for (int i = 0 ; i < size ; i++) {
            lom.put(((K)(Integer.valueOf(i))), ((V)(java.lang.Boolean.TRUE)));
        }
        final Map<K, V> map = new TreeMap<K, V>();
        for (int i = 1 ; i < size ; i++) {
            map.put(((K)(Integer.valueOf(i))), ((V)(java.lang.Boolean.FALSE)));
        }
        lom.putAll(3, map);
        final List<K> orderedList = lom.asList();
        for (int i = 0 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),974,null,973,java.lang.Integer.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,orderedList,975,orderedList.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAllWithIndexBug441_literalMutation308() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndexBug441_literalMutation308");
        resetEmpty();
        final ListOrderedMap<K, V> lom = getMap();
        final int size = 5;
        for (int i = 0 ; i < size ; i++) {
            lom.put(((K)(Integer.valueOf(i))), ((V)(java.lang.Boolean.TRUE)));
        }
        final Map<K, V> map = new TreeMap<K, V>();
        for (int i = 0 ; i < size ; i++) {
            map.put(((K)(Integer.valueOf(i))), ((V)(java.lang.Boolean.FALSE)));
        }
        lom.putAll(4, map);
        final List<K> orderedList = lom.asList();
        for (int i = 0 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),974,null,973,java.lang.Integer.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,orderedList,975,orderedList.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPutAllWithIndexBug441_literalMutation309() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutAllWithIndexBug441_literalMutation309");
        resetEmpty();
        final ListOrderedMap<K, V> lom = getMap();
        final int size = 5;
        for (int i = 0 ; i < size ; i++) {
            lom.put(((K)(Integer.valueOf(i))), ((V)(java.lang.Boolean.TRUE)));
        }
        final Map<K, V> map = new TreeMap<K, V>();
        for (int i = 0 ; i < size ; i++) {
            map.put(((K)(Integer.valueOf(i))), ((V)(java.lang.Boolean.FALSE)));
        }
        lom.putAll(3, map);
        final List<K> orderedList = lom.asList();
        for (int i = -1 ; i < size ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),974,null,973,java.lang.Integer.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),976,orderedList,975,orderedList.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testValueList_getByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValueList_getByIndex");
        resetFull();
        final ListOrderedMap<K, V> lom = getMap();
        for (int i = -1 ; i < (lom.size()) ; i++) {
            final V expected = lom.getValue(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1091,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1093,lom.valueList(),1092,lom.valueList().get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testValueList_setByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValueList_setByIndex");
        resetFull();
        final ListOrderedMap<K, V> lom = getMap();
        for (int i = 0 ; i < (lom.size()) ; i++) {
            final Object input = Integer.valueOf(i);
            final V expected = lom.getValue(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1097,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1099,lom.valueList(),1098,lom.valueList().set(i, ((V)(input))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1100,input);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1102,lom,1101,lom.getValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1103,input);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1105,lom.valueList(),1104,lom.valueList().get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testValueList_setByIndex_literalMutation378() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValueList_setByIndex_literalMutation378");
        resetFull();
        final ListOrderedMap<K, V> lom = getMap();
        for (int i = 1 ; i < (lom.size()) ; i++) {
            final Object input = Integer.valueOf(i);
            final V expected = lom.getValue(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1097,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1099,lom.valueList(),1098,lom.valueList().set(i, ((V)(input))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1100,input);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1102,lom,1101,lom.getValue(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1103,input);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1105,lom.valueList(),1104,lom.valueList().get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testValueList_removeByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValueList_removeByIndex");
        resetFull();
        final ListOrderedMap<K, V> lom = getMap();
        while ((lom.size()) > 2) {
            final V expected = lom.getValue(1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1094,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1096,lom.valueList(),1095,lom.valueList().remove(1));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testValueList_removeByIndex_literalMutation376() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValueList_removeByIndex_literalMutation376");
        resetFull();
        final ListOrderedMap<K, V> lom = getMap();
        while ((lom.size()) > 1) {
            final V expected = lom.getValue(0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1094,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1096,lom.valueList(),1095,lom.valueList().remove(1));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCOLLECTIONS_474_nullValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCOLLECTIONS_474_nullValues");
        Object key1 = new Object();
        Object key2 = new Object();
        HashMap<java.lang.Object, java.lang.Object> hmap = new HashMap<java.lang.Object, java.lang.Object>();
        hmap.put(key1, null);
        hmap.put(key2, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,hmap,955,hmap.size());
        ListOrderedMap<java.lang.Object, java.lang.Object> listMap = new ListOrderedMap<java.lang.Object, java.lang.Object>();
        listMap.put(key1, null);
        listMap.put(key2, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,listMap,957,listMap.size());
        listMap.putAll(1, hmap);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCOLLECTIONS_474_nonNullValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCOLLECTIONS_474_nonNullValues");
        Object key1 = new Object();
        Object key2 = new Object();
        HashMap<java.lang.Object, java.lang.Object> hmap = new HashMap<java.lang.Object, java.lang.Object>();
        hmap.put(key1, "foo");
        hmap.put(key2, "2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,hmap,951,hmap.size());
        ListOrderedMap<java.lang.Object, java.lang.Object> listMap = new ListOrderedMap<java.lang.Object, java.lang.Object>();
        listMap.put(key1, "3");
        listMap.put(key2, "4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,listMap,953,listMap.size());
        listMap.putAll(2, hmap);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCOLLECTIONS_474_nonNullValues_literalMutation274() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCOLLECTIONS_474_nonNullValues_literalMutation274");
        Object key1 = new Object();
        Object key2 = new Object();
        HashMap<java.lang.Object, java.lang.Object> hmap = new HashMap<java.lang.Object, java.lang.Object>();
        hmap.put(key1, "1");
        hmap.put(key2, "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,hmap,951,hmap.size());
        ListOrderedMap<java.lang.Object, java.lang.Object> listMap = new ListOrderedMap<java.lang.Object, java.lang.Object>();
        listMap.put(key1, "3");
        listMap.put(key2, "4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,listMap,953,listMap.size());
        listMap.putAll(2, hmap);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCOLLECTIONS_474_nonNullValues_literalMutation275() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCOLLECTIONS_474_nonNullValues_literalMutation275");
        Object key1 = new Object();
        Object key2 = new Object();
        HashMap<java.lang.Object, java.lang.Object> hmap = new HashMap<java.lang.Object, java.lang.Object>();
        hmap.put(key1, "1");
        hmap.put(key2, "2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,hmap,951,hmap.size());
        ListOrderedMap<java.lang.Object, java.lang.Object> listMap = new ListOrderedMap<java.lang.Object, java.lang.Object>();
        listMap.put(key1, "foo");
        listMap.put(key2, "4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,listMap,953,listMap.size());
        listMap.putAll(2, hmap);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCOLLECTIONS_474_nonNullValues_literalMutation276() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCOLLECTIONS_474_nonNullValues_literalMutation276");
        Object key1 = new Object();
        Object key2 = new Object();
        HashMap<java.lang.Object, java.lang.Object> hmap = new HashMap<java.lang.Object, java.lang.Object>();
        hmap.put(key1, "1");
        hmap.put(key2, "2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,hmap,951,hmap.size());
        ListOrderedMap<java.lang.Object, java.lang.Object> listMap = new ListOrderedMap<java.lang.Object, java.lang.Object>();
        listMap.put(key1, "3");
        listMap.put(key2, "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,listMap,953,listMap.size());
        listMap.putAll(2, hmap);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCOLLECTIONS_474_nonNullValues_literalMutation277() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCOLLECTIONS_474_nonNullValues_literalMutation277");
        Object key1 = new Object();
        Object key2 = new Object();
        HashMap<java.lang.Object, java.lang.Object> hmap = new HashMap<java.lang.Object, java.lang.Object>();
        hmap.put(key1, "1");
        hmap.put(key2, "2");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),952,hmap,951,hmap.size());
        ListOrderedMap<java.lang.Object, java.lang.Object> listMap = new ListOrderedMap<java.lang.Object, java.lang.Object>();
        listMap.put(key1, "3");
        listMap.put(key2, "4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,listMap,953,listMap.size());
        listMap.putAll(3, hmap);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public BulkTest bulkTestKeyListView() {
        return new TestKeyListView();
    }

    public BulkTest bulkTestValueListView() {
        return new TestValueListView();
    }

    public class TestKeyListView extends AbstractListTest<K> {
        TestKeyListView() {
            super("TestKeyListView");
        }

        @Override
        public List<K> makeObject() {
            return org.apache.commons.collections4.map.ListOrderedMapTest.this.makeObject().keyList();
        }

        @Override
        public List<K> makeFullCollection() {
            return org.apache.commons.collections4.map.ListOrderedMapTest.this.makeFullMap().keyList();
        }

        @Override
        public K[] getFullElements() {
            return org.apache.commons.collections4.map.ListOrderedMapTest.this.getSampleKeys();
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
            return org.apache.commons.collections4.map.ListOrderedMapTest.this.isAllowNullKey();
        }

        @Override
        public boolean isTestSerialization() {
            return false;
        }
    }

    public class TestValueListView extends AbstractListTest<V> {
        TestValueListView() {
            super("TestValueListView");
        }

        @Override
        public List<V> makeObject() {
            return org.apache.commons.collections4.map.ListOrderedMapTest.this.makeObject().valueList();
        }

        @Override
        public List<V> makeFullCollection() {
            return org.apache.commons.collections4.map.ListOrderedMapTest.this.makeFullMap().valueList();
        }

        @Override
        public V[] getFullElements() {
            return org.apache.commons.collections4.map.ListOrderedMapTest.this.getSampleValues();
        }

        @Override
        public boolean isAddSupported() {
            return false;
        }

        @Override
        public boolean isRemoveSupported() {
            return true;
        }

        @Override
        public boolean isSetSupported() {
            return true;
        }

        @Override
        public boolean isNullSupported() {
            return org.apache.commons.collections4.map.ListOrderedMapTest.this.isAllowNullKey();
        }

        @Override
        public boolean isTestSerialization() {
            return false;
        }
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public ListOrderedMap<K, V> getMap() {
        return ((ListOrderedMap<K, V>)(super.getMap()));
    }
}

