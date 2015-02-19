package org.apache.commons.collections4.trie;

import org.apache.commons.collections4.map.AbstractOrderedMapTest;
import org.apache.commons.collections4.OrderedMap;
import junit.framework.Test;

/** 
 * JUnit test of the OrderedMap interface of a PatriciaTrie.
 * 
 * @version $Id$
 * @since 4.0
 */
public class PatriciaTrie2Test<V> extends AbstractOrderedMapTest<java.lang.String, V> {
    public PatriciaTrie2Test(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(PatriciaTrie2Test.class);
    }

    @Override
    public OrderedMap<java.lang.String, V> makeObject() {
        return new PatriciaTrie<V>();
    }

    @Override
    public boolean isAllowNullKey() {
        return false;
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

