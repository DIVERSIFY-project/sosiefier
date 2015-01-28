package org.apache.commons.collections4.map;

import org.apache.commons.collections4.list.AbstractListTest;
import java.util.ArrayList;
import org.apache.commons.collections4.BulkTest;
import java.util.List;
import org.apache.commons.collections4.MapIterator;
import junit.framework.Test;

/** 
 * Extension of {@link AbstractOrderedMapTest} for exercising the {@link ListOrderedMap}
 * implementation.
 * 
 * @version $Id$
 * @since 3.1
 */
public class ListOrderedMap2Test<K, V> extends AbstractOrderedMapTest<K, V> {
    public ListOrderedMap2Test(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return BulkTest.makeSuite(ListOrderedMap2Test.class);
    }

    @Override
    public ListOrderedMap<K, V> makeObject() {
        return new ListOrderedMap<K, V>();
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lom,934,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_add346() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_add346");
        resetEmpty();
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lom,934,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_add347() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_add347");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.get(0);
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lom,934,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_add348() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_add348");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.get(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.get(-1);
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lom,934,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_add349() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_add349");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lom,934,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_add350() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_add350");
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
            lom.get(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.get(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lom,934,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_add351() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_add351");
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
            lom.get(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lom,934,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetByIndex_literalMutation260() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_literalMutation260");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lom,934,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetByIndex_literalMutation261() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_literalMutation261");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lom,934,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetByIndex_literalMutation262() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_literalMutation262");
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
            lom.get(2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.get(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lom,934,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetByIndex_literalMutation263() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_literalMutation263");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lom,934,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_remove281() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_remove281");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lom,934,lom.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetByIndex_remove282() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_remove282");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lom,934,lom.get(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,it,936,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lom,938,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_add352() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_add352");
        resetEmpty();
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,it,936,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lom,938,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_add353() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_add353");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.getValue(0);
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,it,936,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lom,938,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_add354() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_add354");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.getValue(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.getValue(-1);
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,it,936,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lom,938,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_add355() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_add355");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,it,936,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lom,938,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_add356() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_add356");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,it,936,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lom,938,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_add357() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_add357");
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
            lom.getValue(lom.size());
        } catch (final IndexOutOfBoundsException ex) {
        }
        int i = 0;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,it,936,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lom,938,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_add358() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_add358");
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
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,it,936,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lom,938,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetValueByIndex_literalMutation264() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_literalMutation264");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.getValue(1);
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,it,936,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lom,938,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetValueByIndex_literalMutation265() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_literalMutation265");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,it,936,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lom,938,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetValueByIndex_literalMutation266() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_literalMutation266");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,it,936,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lom,938,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetValueByIndex_literalMutation267() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_literalMutation267");
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
        int i = 1;
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; i++) {
            it.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,it,936,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lom,938,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_remove283() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_remove283");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,it,936,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lom,938,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testGetValueByIndex_remove284() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_remove284");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,it,936,it.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lom,938,lom.getValue(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexOf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),940,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),942,lom,941,lom.indexOf(getOtherKeys()));
        resetFull();
        lom = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lom,944,lom.indexOf(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIndexOf_add359() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_add359");
        resetEmpty();
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),940,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),942,lom,941,lom.indexOf(getOtherKeys()));
        resetFull();
        lom = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lom,944,lom.indexOf(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIndexOf_add360() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_add360");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),940,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),942,lom,941,lom.indexOf(getOtherKeys()));
        resetFull();
        resetFull();
        lom = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lom,944,lom.indexOf(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIndexOf_add361() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_add361");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),940,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),942,lom,941,lom.indexOf(getOtherKeys()));
        resetFull();
        lom = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lom,944,lom.indexOf(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexOf_literalMutation268() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_literalMutation268");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),940,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),942,lom,941,lom.indexOf(getOtherKeys()));
        resetFull();
        lom = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = -1 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lom,944,lom.indexOf(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIndexOf_remove285() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_remove285");
        ListOrderedMap<K, V> lom = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),940,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),942,lom,941,lom.indexOf(getOtherKeys()));
        resetFull();
        lom = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lom,944,lom.indexOf(list.get(i)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIndexOf_remove286() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_remove286");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),940,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),942,lom,941,lom.indexOf(getOtherKeys()));
        lom = getMap();
        final List<K> list = new ArrayList<K>();
        for (final MapIterator<K, V> it = lom.mapIterator() ; it.hasNext() ; ) {
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lom,944,lom.indexOf(list.get(i)));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add362() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add362");
        resetEmpty();
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add363() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add363");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.remove(0);
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add364() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add364");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.remove(-1);
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add365() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add365");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add366() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add366");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add367() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add367");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add368() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add368");
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
            list.add(it.next());
        }
        for (int i = 0 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lom.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_add369() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_add369");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveByIndex_literalMutation269() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_literalMutation269");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveByIndex_literalMutation270() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_literalMutation270");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.remove(0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            lom.remove(0);
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveByIndex_literalMutation271() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_literalMutation271");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveByIndex_literalMutation272() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_literalMutation272");
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
        for (int i = -1 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lom.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_remove287() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_remove287");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_remove288() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_remove288");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveByIndex_remove289() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveByIndex_remove289");
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),950,lom,949,lom.containsKey(key));
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
            return org.apache.commons.collections4.map.ListOrderedMap2Test.this.makeObject().asList();
        }

        @Override
        public List<K> makeFullCollection() {
            return org.apache.commons.collections4.map.ListOrderedMap2Test.this.makeFullMap().asList();
        }

        @Override
        public K[] getFullElements() {
            return org.apache.commons.collections4.map.ListOrderedMap2Test.this.getSampleKeys();
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
            return org.apache.commons.collections4.map.ListOrderedMap2Test.this.isAllowNullKey();
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

