package org.apache.commons.collections4.bidimap;

import org.apache.commons.collections4.BulkTest;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.commons.collections4.comparators.ReverseComparator;
import java.io.Serializable;
import org.apache.commons.collections4.SortedBidiMap;
import junit.framework.Test;
import java.util.TreeMap;

/** 
 * JUnit tests.
 * 
 * @version $Id$
 */
@SuppressWarnings(value = "boxing")
public class DualTreeBidiMap2Test<K extends java.lang.Comparable<K>, V extends Comparable<V>> extends AbstractSortedBidiMapTest<K, V> {
    public static Test suite() {
        return BulkTest.makeSuite(DualTreeBidiMap2Test.class);
    }

    public DualTreeBidiMap2Test(final String testName) {
        super(testName);
    }

    @Override
    public DualTreeBidiMap<K, V> makeObject() {
        return new DualTreeBidiMap<K, V>(new ReverseComparator<K>(org.apache.commons.collections4.comparators.ComparableComparator.<K>comparableComparator()) , new ReverseComparator<V>(org.apache.commons.collections4.comparators.ComparableComparator.<V>comparableComparator()));
    }

    @Override
    public TreeMap<K, V> makeConfirmedMap() {
        return new TreeMap<K, V>(new ReverseComparator<K>(org.apache.commons.collections4.comparators.ComparableComparator.<K>comparableComparator()));
    }

    public void testComparator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> dtbm = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , null);
        dtbm.put("foo", 0);
        dtbm.put("one", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5576,dtbm,5575,dtbm.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5578,dtbm,5577,dtbm.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComparator2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator2");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> dtbm = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , null);
        dtbm.put("two", -1);
        dtbm.put("one", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5576,dtbm,5575,dtbm.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5578,dtbm,5577,dtbm.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComparator2_literalMutation1418() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator2_literalMutation1418");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> dtbm = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , null);
        dtbm.put("two", 0);
        dtbm.put("foo", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5576,dtbm,5575,dtbm.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5578,dtbm,5577,dtbm.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComparator2_literalMutation1419() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator2_literalMutation1419");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> dtbm = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , null);
        dtbm.put("two", 0);
        dtbm.put("one", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5576,dtbm,5575,dtbm.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5578,dtbm,5577,dtbm.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeDeserializeCheckComparator() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeCheckComparator");
        final SortedBidiMap<?, ?> obj = makeObject();
        if ((obj instanceof Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            final SortedBidiMap<?, ?> bidi = ((SortedBidiMap<?, ?>)(dest));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5580,obj,5579,obj.comparator());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5582,bidi,5581,bidi.comparator());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,((bidi.comparator()) instanceof org.apache.commons.collections4.comparators.ReverseComparator));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class IntegerComparator implements Serializable , Comparator<java.lang.Integer> {
        private static final long serialVersionUID = 1L;

        public int compare(final Integer o1, final Integer o2) {
            return o1.compareTo(o2);
        }
    }

    public void testCollections364() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections364");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> original = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , new IntegerComparator());
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        @SuppressWarnings(value = "unchecked")
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> deserialised = ((DualTreeBidiMap<java.lang.String, java.lang.Integer>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5564,original,5563,original.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5566,deserialised,5565,deserialised.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5568,original.comparator(),5567,original.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5570,deserialised.comparator(),5569,deserialised.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5572,original.valueComparator(),5571,original.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5574,deserialised.valueComparator(),5573,deserialised.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSortOrder() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder");
        final SortedBidiMap<K, V> sm = makeFullMap();
        List<K> newSortedKeys = getAsList(getSampleKeys());
        java.util.Collections.sort(newSortedKeys, new ReverseComparator<K>(org.apache.commons.collections4.comparators.ComparableComparator.<K>comparableComparator()));
        newSortedKeys = java.util.Collections.unmodifiableList(newSortedKeys);
        final Iterator<K> mapIter = sm.keySet().iterator();
        final Iterator<K> expectedIter = newSortedKeys.iterator();
        while (expectedIter.hasNext()) {
            final K expectedKey = expectedIter.next();
            final K mapKey = mapIter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5584,expectedKey);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,mapKey);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5586,expectedKey);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,mapKey);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4.Test2";
    }

    /** 
     * Override to prevent infinite recursion of tests.
     */
@Override
    public String[] ignoredTests() {
        String recursiveTest = "DualTreeBidiMap2Test.bulkTestInverseMap.bulkTestInverseMap";
        if (BulkTest.IBMJDK16) {
            final String preSub = "DualTreeBidiMap2Test.bulkTestSubMap.";
            final String preTail = "DualTreeBidiMap2Test.bulkTestTailMap.";
            return new String[]{ recursiveTest , preSub + "bulkTestMapEntrySet.testCollectionIteratorRemove" , preSub + "bulkTestMapValues.testCollectionIteratorRemove" , preTail + "testMapRemove" , preTail + "bulkTestMapEntrySet.testCollectionIteratorRemove" , preTail + "bulkTestMapEntrySet.testCollectionRemoveAll" , preTail + "bulkTestMapKeySet.testCollectionIteratorRemove" , preTail + "bulkTestMapKeySet.testCollectionRemoveAll" , preTail + "bulkTestMapValues.testCollectionClear" , preTail + "bulkTestMapValues.testCollectionRemoveAll" , preTail + "bulkTestMapValues.testCollectionRetainAll" };
        } else {
            return new String[]{ recursiveTest };
        }
    }
}

