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

    public void testGetByIndex_literalMutation260() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetByIndex_literalMutation260");
        resetEmpty();
        ListOrderedMap<K, V> lom = getMap();
        try {
            lom.get(-1);
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
            lom.get(2);
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
            lom.get(0);
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
        int i = 1;
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

    public void testGetValueByIndex_literalMutation264() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetValueByIndex_literalMutation264");
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
        for (int i = 1 ; i < (list.size()) ; i++) {
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
            lom.remove(2);
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
        for (int i = 1 ; i < (list.size()) ; i++) {
            final Object key = list.get(i);
            final Object value = lom.get(key);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),946,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),948,lom,947,lom.remove(i));
            list.remove(i);
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

