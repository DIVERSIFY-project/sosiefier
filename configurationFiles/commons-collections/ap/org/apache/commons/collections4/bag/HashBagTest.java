package org.apache.commons.collections4.bag;

import org.apache.commons.collections4.Bag;
import junit.framework.Test;

/** 
 * Extension of {@link AbstractBagTest} for exercising the {@link HashBag}
 * implementation.
 * 
 * @version $Id$
 */
public class HashBagTest<T> extends AbstractBagTest<T> {
    public HashBagTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(HashBagTest.class);
    }

    @Override
    public Bag<T> makeObject() {
        return new HashBag<T>();
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

