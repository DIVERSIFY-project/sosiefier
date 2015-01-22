package org.apache.commons.collections4.set;

import org.apache.commons.collections4.BulkTest;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/** 
 * Abstract test class for {@link SortedSet} methods and contracts.
 * <p/>
 * To use, subclass and override the {@link #makeObject()}
 * method.  You may have to override other protected methods if your
 * set is not modifiable, or if your set restricts what kinds of
 * elements may be added; see {@link AbstractSetTest} for more details.
 * 
 * @version $Id$
 * @since 3.0
 */
public abstract class AbstractSortedSetTest<E> extends AbstractSetTest<E> {
    /** 
     * JUnit constructor.
     * 
     * @param name name for test
     */
public AbstractSortedSetTest(final String name) {
        super(name);
    }

    /** 
     * Verification extension, will check the order of elements,
     * the sets should already be verified equal.
     */
@Override
    public void verify() {
        super.verify();
        final Iterator<E> colliter = getCollection().iterator();
        final Iterator<E> confiter = getConfirmed().iterator();
        E first = null;
        E last = null;
        while (colliter.hasNext()) {
            if (first == null) {
                first = colliter.next();
                last = first;
            } else {
                last = colliter.next();
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,last);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,confiter,6127,confiter.next());
        }
        if ((getCollection().size()) > 0) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,first);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,getCollection(),6130,getCollection().first());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6132,last);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,getCollection(),6133,getCollection().last());
        } 
    }

    /** 
     * Overridden because SortedSets don't allow null elements (normally).
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
    public abstract SortedSet<E> makeObject();

    /** 
     * {@inheritDoc}
     */
@Override
    public SortedSet<E> makeFullCollection() {
        return ((SortedSet<E>)(super.makeFullCollection()));
    }

    /** 
     * Returns an empty {@link TreeSet} for use in modification testing.
     * 
     * @return a confirmed empty collection
     */
@Override
    public SortedSet<E> makeConfirmedCollection() {
        return new TreeSet<E>();
    }

    /** 
     * Override to return comparable objects.
     */
@Override
    @SuppressWarnings(value = "unchecked")
    public E[] getFullNonNullElements() {
        final Object[] elements = new Object[30];
        for (int i = 0 ; i < 30 ; i++) {
            elements[i] = java.lang.Integer.valueOf(((i + i) + 1));
        }
        return ((E[])(elements));
    }

    /** 
     * Override to return comparable objects.
     */
@Override
    @SuppressWarnings(value = "unchecked")
    public E[] getOtherNonNullElements() {
        final Object[] elements = new Object[30];
        for (int i = 0 ; i < 30 ; i++) {
            elements[i] = java.lang.Integer.valueOf(((i + i) + 2));
        }
        return ((E[])(elements));
    }

    /** 
     * Bulk test {@link SortedSet#subSet(Object, Object)}.  This method runs through all of
     * the tests in {@link AbstractSortedSetTest}.
     * After modification operations, {@link #verify()} is invoked to ensure
     * that the set and the other collection views are still valid.
     * 
     * @return a {@link AbstractSetTest} instance for testing a subset.
     */
public BulkTest bulkTestSortedSetSubSet() {
        final int length = getFullElements().length;
        final int lobound = length / 3;
        final int hibound = lobound * 2;
        return new TestSortedSetSubSet(lobound , hibound);
    }

    /** 
     * Bulk test {@link SortedSet#headSet(Object)}.  This method runs through all of
     * the tests in {@link AbstractSortedSetTest}.
     * After modification operations, {@link #verify()} is invoked to ensure
     * that the set and the other collection views are still valid.
     * 
     * @return a {@link AbstractSetTest} instance for testing a headset.
     */
public BulkTest bulkTestSortedSetHeadSet() {
        final int length = getFullElements().length;
        final int lobound = length / 3;
        final int hibound = lobound * 2;
        return new TestSortedSetSubSet(hibound , true);
    }

    /** 
     * Bulk test {@link SortedSet#tailSet(Object)}.  This method runs through all of
     * the tests in {@link AbstractSortedSetTest}.
     * After modification operations, {@link #verify()} is invoked to ensure
     * that the set and the other collection views are still valid.
     * 
     * @return a {@link AbstractSetTest} instance for testing a tailset.
     */
public BulkTest bulkTestSortedSetTailSet() {
        final int length = getFullElements().length;
        final int lobound = length / 3;
        return new TestSortedSetSubSet(lobound , false);
    }

    public class TestSortedSetSubSet extends AbstractSortedSetTest<E> {
        private int m_Type;

        private int m_LowBound;

        private int m_HighBound;

        private E[] m_FullElements;

        private E[] m_OtherElements;

        @SuppressWarnings(value = "unchecked")
        public TestSortedSetSubSet(final int bound ,final boolean head) {
            super("TestSortedSetSubSet");
            if (head) {
                m_Type = TYPE_HEADSET;
                m_HighBound = bound;
                m_FullElements = ((E[])(new Object[bound]));
                java.lang.System.arraycopy(org.apache.commons.collections4.set.AbstractSortedSetTest.this.getFullElements(), 0, m_FullElements, 0, bound);
                m_OtherElements = ((E[])(new Object[bound - 1]));
                java.lang.System.arraycopy(org.apache.commons.collections4.set.AbstractSortedSetTest.this.getOtherElements(), 0, m_OtherElements, 0, (bound - 1));
            } else {
                m_Type = TYPE_TAILSET;
                m_LowBound = bound;
                final Object[] allelements = org.apache.commons.collections4.set.AbstractSortedSetTest.this.getFullElements();
                m_FullElements = ((E[])(new Object[(allelements.length) - bound]));
                java.lang.System.arraycopy(allelements, bound, m_FullElements, 0, ((allelements.length) - bound));
                m_OtherElements = ((E[])(new Object[((allelements.length) - bound) - 1]));
                java.lang.System.arraycopy(org.apache.commons.collections4.set.AbstractSortedSetTest.this.getOtherElements(), bound, m_OtherElements, 0, (((allelements.length) - bound) - 1));
            }
        }

        @SuppressWarnings(value = "unchecked")
        public TestSortedSetSubSet(final int lobound ,final int hibound) {
            super("TestSortedSetSubSet");
            m_Type = TYPE_SUBSET;
            m_LowBound = lobound;
            m_HighBound = hibound;
            final int length = hibound - lobound;
            m_FullElements = ((E[])(new Object[length]));
            java.lang.System.arraycopy(org.apache.commons.collections4.set.AbstractSortedSetTest.this.getFullElements(), lobound, m_FullElements, 0, length);
            m_OtherElements = ((E[])(new Object[length - 1]));
            java.lang.System.arraycopy(org.apache.commons.collections4.set.AbstractSortedSetTest.this.getOtherElements(), lobound, m_OtherElements, 0, (length - 1));
        }

        @Override
        public boolean isNullSupported() {
            return org.apache.commons.collections4.set.AbstractSortedSetTest.this.isNullSupported();
        }

        @Override
        public boolean isAddSupported() {
            return org.apache.commons.collections4.set.AbstractSortedSetTest.this.isAddSupported();
        }

        @Override
        public boolean isRemoveSupported() {
            return org.apache.commons.collections4.set.AbstractSortedSetTest.this.isRemoveSupported();
        }

        @Override
        public boolean isFailFastSupported() {
            return org.apache.commons.collections4.set.AbstractSortedSetTest.this.isFailFastSupported();
        }

        @Override
        public E[] getFullElements() {
            return m_FullElements;
        }

        @Override
        public E[] getOtherElements() {
            return m_OtherElements;
        }

        private SortedSet<E> getSubSet(final SortedSet<E> set) {
            final E[] elements = org.apache.commons.collections4.set.AbstractSortedSetTest.this.getFullElements();
            switch (m_Type) {
                case TYPE_SUBSET :
                    return set.subSet(elements[m_LowBound], elements[m_HighBound]);
                case TYPE_HEADSET :
                    return set.headSet(elements[m_HighBound]);
                case TYPE_TAILSET :
                    return set.tailSet(elements[m_LowBound]);
                default :
                    return null;
            }
        }

        @Override
        public SortedSet<E> makeObject() {
            return getSubSet(org.apache.commons.collections4.set.AbstractSortedSetTest.this.makeObject());
        }

        @Override
        public SortedSet<E> makeFullCollection() {
            return getSubSet(org.apache.commons.collections4.set.AbstractSortedSetTest.this.makeFullCollection());
        }

        @Override
        public boolean isTestSerialization() {
            return false;
        }

        @Override
        public BulkTest bulkTestSortedSetSubSet() {
            return null;
        }

        @Override
        public BulkTest bulkTestSortedSetHeadSet() {
            return null;
        }

        @Override
        public BulkTest bulkTestSortedSetTailSet() {
            return null;
        }

        static final int TYPE_SUBSET = 0;

        static final int TYPE_TAILSET = 1;

        static final int TYPE_HEADSET = 2;
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public SortedSet<E> getCollection() {
        return ((SortedSet<E>)(super.getCollection()));
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public SortedSet<E> getConfirmed() {
        return ((SortedSet<E>)(super.getConfirmed()));
    }
}

