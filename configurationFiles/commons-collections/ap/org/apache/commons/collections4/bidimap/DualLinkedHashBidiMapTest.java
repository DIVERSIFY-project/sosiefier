package org.apache.commons.collections4.bidimap;

import junit.framework.Test;

/** 
 * JUnit tests.
 * 
 * @version $Id$
 */
public class DualLinkedHashBidiMapTest<K, V> extends AbstractBidiMapTest<K, V> {
    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(DualLinkedHashBidiMapTest.class);
    }

    public DualLinkedHashBidiMapTest(final String testName) {
        super(testName);
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public DualLinkedHashBidiMap<K, V> makeObject() {
        return new DualLinkedHashBidiMap<K, V>();
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    /** 
     * Override to prevent infinite recursion of tests.
     */
@Override
    public String[] ignoredTests() {
        return new String[]{ "DualLinkedHashBidiMapTest.bulkTestInverseMap.bulkTestInverseMap" };
    }
}

