package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Collection;

/** 
 * Extension of {@link AbstractCollectionTest} for exercising the
 * {@link SynchronizedCollection} implementation.
 * 
 * @version $Id$
 * @since 3.1
 */
public class SynchronizedCollectionTest<E> extends AbstractCollectionTest<E> {
    public SynchronizedCollectionTest(final String testName) {
        super(testName);
    }

    @Override
    public Collection<E> makeObject() {
        return org.apache.commons.collections4.collection.SynchronizedCollection.synchronizedCollection(new ArrayList<E>());
    }

    @Override
    public Collection<E> makeConfirmedCollection() {
        return new ArrayList<E>();
    }

    @Override
    public Collection<E> makeConfirmedFullCollection() {
        final ArrayList<E> list = new ArrayList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return list;
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

