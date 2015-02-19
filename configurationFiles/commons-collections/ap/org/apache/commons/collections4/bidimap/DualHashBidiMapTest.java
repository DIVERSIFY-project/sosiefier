package org.apache.commons.collections4.bidimap;

import junit.framework.Test;

/** 
 * JUnit tests.
 * 
 * @version $Id$
 */
public class DualHashBidiMapTest<K, V> extends AbstractBidiMapTest<K, V> {
    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(DualHashBidiMapTest.class);
    }

    public DualHashBidiMapTest(final String testName) {
        super(testName);
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public DualHashBidiMap<K, V> makeObject() {
        return new DualHashBidiMap<K, V>();
    }

    /** 
     * Override to prevent infinite recursion of tests.
     */
@Override
    public String[] ignoredTests() {
        return new String[]{ "DualHashBidiMapTest.bulkTestInverseMap.bulkTestInverseMap" };
    }
}

