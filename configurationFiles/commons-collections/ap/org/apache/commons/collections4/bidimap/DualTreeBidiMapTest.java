package org.apache.commons.collections4.bidimap;

import org.apache.commons.collections4.BulkTest;
import junit.framework.Test;

/** 
 * JUnit tests.
 * 
 * @version $Id$
 */
public class DualTreeBidiMapTest<K extends java.lang.Comparable<K>, V extends Comparable<V>> extends AbstractSortedBidiMapTest<K, V> {
    public static Test suite() {
        return BulkTest.makeSuite(DualTreeBidiMapTest.class);
    }

    public DualTreeBidiMapTest(final String testName) {
        super(testName);
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public DualTreeBidiMap<K, V> makeObject() {
        return new DualTreeBidiMap<K, V>();
    }

    /** 
     * Override to prevent infinite recursion of tests.
     */
@Override
    public String[] ignoredTests() {
        final String recursiveTest = "DualTreeBidiMapTest.bulkTestInverseMap.bulkTestInverseMap";
        if (BulkTest.IBMJDK16) {
            final String preSub = "DualTreeBidiMapTest.bulkTestSubMap.";
            final String preTail = "DualTreeBidiMapTest.bulkTestTailMap.";
            return new String[]{ recursiveTest , preSub + "bulkTestMapEntrySet.testCollectionIteratorRemove" , preSub + "bulkTestMapValues.testCollectionIteratorRemove" , preTail + "testMapRemove" , preTail + "bulkTestMapEntrySet.testCollectionIteratorRemove" , preTail + "bulkTestMapEntrySet.testCollectionRemoveAll" , preTail + "bulkTestMapKeySet.testCollectionIteratorRemove" , preTail + "bulkTestMapKeySet.testCollectionRemoveAll" , preTail + "bulkTestMapValues.testCollectionClear" , preTail + "bulkTestMapValues.testCollectionRemoveAll" , preTail + "bulkTestMapValues.testCollectionRetainAll" };
        } else {
            return new String[]{ recursiveTest };
        }
    }
}

