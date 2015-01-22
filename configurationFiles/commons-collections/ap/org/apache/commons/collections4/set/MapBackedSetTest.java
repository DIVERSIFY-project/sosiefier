package org.apache.commons.collections4.set;

import java.util.Set;

/** 
 * JUnit test.
 * 
 * @version $Id$
 * @since 3.1
 */
public class MapBackedSetTest<E> extends AbstractSetTest<E> {
    public MapBackedSetTest(final String testName) {
        super(testName);
    }

    @Override
    public Set<E> makeObject() {
        return org.apache.commons.collections4.set.MapBackedSet.mapBackedSet(new org.apache.commons.collections4.map.HashedMap<E, java.lang.Object>());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

