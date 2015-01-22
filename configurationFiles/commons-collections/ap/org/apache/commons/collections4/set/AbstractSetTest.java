package org.apache.commons.collections4.set;

import org.apache.commons.collections4.collection.AbstractCollectionTest;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/** 
 * Abstract test class for {@link Set} methods and contracts.
 * <p/>
 * Since {@link Set} doesn't stipulate much new behavior that isn't already
 * found in {@link Collection}, this class basically just adds tests for
 * {@link Set#equals} and {@link Set#hashCode()} along with an updated
 * {@link #verify()} that ensures elements do not appear more than once in the
 * set.
 * <p/>
 * To use, subclass and override the {@link #makeObject()}
 * method.  You may have to override other protected methods if your
 * set is not modifiable, or if your set restricts what kinds of
 * elements may be added; see {@link AbstractCollectionTest} for more details.
 * 
 * @version $Id$
 * @since 3.0
 */
public abstract class AbstractSetTest<E> extends AbstractCollectionTest<E> {
    /** 
     * JUnit constructor.
     * 
     * @param name name for test
     */
public AbstractSetTest(final String name) {
        super(name);
    }

    /** 
     * Provides additional verifications for sets.
     */
@Override
    public void verify() {
        super.verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,null,6116,getConfirmed());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6119,null,6118,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6121,getConfirmed(),6120,getConfirmed().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,getCollection(),6122,getCollection().hashCode());
        final Collection<E> set = makeConfirmedCollection();
        for (E element : getCollection()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.add(element));
        }
    }

    /** 
     * Set equals method is defined.
     */
@Override
    public boolean isEqualsCheckable() {
        return true;
    }

    /** 
     * Returns an empty Set for use in modification testing.
     * 
     * @return a confirmed empty collection
     */
@Override
    public Collection<E> makeConfirmedCollection() {
        return new HashSet<E>();
    }

    /** 
     * Returns a full Set for use in modification testing.
     * 
     * @return a confirmed full collection
     */
@Override
    public Collection<E> makeConfirmedFullCollection() {
        final Collection<E> set = makeConfirmedCollection();
        set.addAll(java.util.Arrays.asList(getFullElements()));
        return set;
    }

    /** 
     * Makes an empty set.  The returned set should have no elements.
     * 
     * @return an empty set
     */
@Override
    public abstract Set<E> makeObject();

    /** 
     * Makes a full set by first creating an empty set and then adding
     * all the elements returned by {@link #getFullElements()}.
     * <p/>
     * Override if your set does not support the add operation.
     * 
     * @return a full set
     */
@Override
    public Set<E> makeFullCollection() {
        final Set<E> set = makeObject();
        set.addAll(java.util.Arrays.asList(getFullElements()));
        return set;
    }

    /** 
     * Return the {@link AbstractCollectionTest#collection} fixture, but cast as a Set.
     */
@Override
    public Set<E> getCollection() {
        return ((Set<E>)(super.getCollection()));
    }

    /** 
     * Return the {@link AbstractCollectionTest#confirmed} fixture, but cast as a Set.
     */
@Override
    public Set<E> getConfirmed() {
        return ((Set<E>)(super.getConfirmed()));
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6099,null,6098,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6101,null,6100,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6102,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6104,null,6103,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6106,null,6105,getConfirmed());
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6107,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetEquals_literalMutation1796() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_literalMutation1796");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6099,null,6098,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6101,null,6100,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6102,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6104,null,6103,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6106,null,6105,getConfirmed());
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6107,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#hashCode()}.
     */
public void testSetHashCode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetHashCode");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6109,getCollection(),6108,getCollection().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,getConfirmed(),6110,getConfirmed().hashCode());
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6113,getCollection(),6112,getCollection().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,getConfirmed(),6114,getConfirmed().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

