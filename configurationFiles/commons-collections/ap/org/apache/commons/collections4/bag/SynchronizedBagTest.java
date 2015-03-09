package org.apache.commons.collections4.bag;

import org.apache.commons.collections4.Bag;
import junit.framework.Test;

/** 
 * Extension of {@link AbstractBagTest} for exercising the {@link SynchronizedBag}
 * implementation.
 * 
 * @version $Id$
 * @since 4.0
 */
public class SynchronizedBagTest<T> extends AbstractBagTest<T> {
    public SynchronizedBagTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(SynchronizedBagTest.class);
    }

    @Override
    public Bag<T> makeObject() {
        return org.apache.commons.collections4.bag.SynchronizedBag.synchronizedBag(new org.apache.commons.collections4.bag.HashBag<T>());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

