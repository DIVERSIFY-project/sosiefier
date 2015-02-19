package org.apache.commons.collections4.bag;

import java.util.Iterator;
import org.apache.commons.collections4.SortedBag;

/** 
 * Abstract test class for
 * {@link org.apache.commons.collections4.SortedBag SortedBag}
 * methods and contracts.
 * 
 * @version $Id$
 * @since 3.0
 */
public abstract class AbstractSortedBagTest<T> extends AbstractBagTest<T> {
    public AbstractSortedBagTest(final String testName) {
        super(testName);
    }

    /** 
     * Verification extension, will check the order of elements,
     * the sets should already be verified equal.
     */
@Override
    public void verify() {
        super.verify();
        final Iterator<T> colliter = getCollection().iterator();
        final Iterator<T> confiter = getConfirmed().iterator();
        T first = null;
        T last = null;
        while (colliter.hasNext()) {
            if (first == null) {
                first = colliter.next();
                last = first;
            } else {
                last = colliter.next();
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5779,last);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5781,confiter,5780,confiter.next());
        }
        if ((getCollection().size()) > 0) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5782,first);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5784,getCollection(),5783,getCollection().first());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5785,last);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5787,getCollection(),5786,getCollection().last());
        } 
    }

    /** 
     * Overridden because SortedBags don't allow null elements (normally).
     * 
     * @return false
     */
@Override
    public boolean isNullSupported() {
        return false;
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public abstract SortedBag<T> makeObject();

    /** 
     * {@inheritDoc}
     */
@Override
    public SortedBag<T> makeFullCollection() {
        return ((SortedBag<T>)(super.makeFullCollection()));
    }

    /** 
     * Returns an empty {@link TreeBag} for use in modification testing.
     * 
     * @return a confirmed empty collection
     */
@Override
    public SortedBag<T> makeConfirmedCollection() {
        return new TreeBag<T>();
    }

    @Override
    public void resetEmpty() {
        setCollection(org.apache.commons.collections4.bag.CollectionSortedBag.collectionSortedBag(makeObject()));
        setConfirmed(makeConfirmedCollection());
    }

    @Override
    public void resetFull() {
        setCollection(org.apache.commons.collections4.bag.CollectionSortedBag.collectionSortedBag(makeFullCollection()));
        setConfirmed(makeConfirmedFullCollection());
    }

    /** 
     * Override to return comparable objects.
     */
@Override
    @SuppressWarnings(value = "unchecked")
    public T[] getFullNonNullElements() {
        final Object[] elements = new Object[30];
        for (int i = 0 ; i < 30 ; i++) {
            elements[i] = java.lang.Integer.valueOf(((i + i) + 1));
        }
        return ((T[])(elements));
    }

    /** 
     * Override to return comparable objects.
     */
@Override
    @SuppressWarnings(value = "unchecked")
    public T[] getOtherNonNullElements() {
        final Object[] elements = new Object[30];
        for (int i = 0 ; i < 30 ; i++) {
            elements[i] = java.lang.Integer.valueOf(((i + i) + 2));
        }
        return ((T[])(elements));
    }

    /** 
     * Returns the {@link #collection} field cast to a {@link SortedBag}.
     * 
     * @return the collection field as a SortedBag
     */
@Override
    public SortedBag<T> getCollection() {
        return ((SortedBag<T>)(super.getCollection()));
    }
}

