package org.apache.commons.collections4.set;

import org.apache.commons.collections4.collection.AbstractCollectionTest;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6078,null,6077,getConfirmed());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6080,null,6079,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6082,getConfirmed(),6081,getConfirmed().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6084,getCollection(),6083,getCollection().hashCode());
        final Collection<E> set = makeConfirmedCollection();
        for (E element : getCollection()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6086,set,6085,set.add(element));
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
    @Test(timeout = 1000)
    public void testSetEquals_add1919() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_add1919");
        resetEmpty();
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetEquals_add1920() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_add1920");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        verify();
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetEquals_add1921() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_add1921");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetEquals_add1922() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_add1922");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetEquals_add1923() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_add1923");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetEquals_add1924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_add1924");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.clear();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetEquals_add1925() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_add1925");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetEquals_literalMutation1796() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_literalMutation1796");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetEquals_remove1489() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_remove1489");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetEquals_remove1490() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_remove1490");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetEquals_remove1491() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_remove1491");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetEquals_remove1492() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_remove1492");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetEquals_remove1493() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_remove1493");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.clear();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetEquals_remove1494() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_remove1494");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#equals(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSetEquals_remove1495() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetEquals_remove1495");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,null,6059,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6062,null,6061,getConfirmed());
        verify();
        final Collection<E> set2 = makeConfirmedCollection();
        set2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,!(getCollection().equals(set2)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,null,6064,getCollection());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,null,6066,getConfirmed());
        verify();
        set2.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6068,!(getCollection().equals(set2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#hashCode()}.
     */
@Test(timeout = 1000)
    public void testSetHashCode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetHashCode");
        resetEmpty();
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6070,getCollection(),6069,getCollection().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6072,getConfirmed(),6071,getConfirmed().hashCode());
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6074,getCollection(),6073,getCollection().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6076,getConfirmed(),6075,getConfirmed().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#hashCode()}.
     */
@Test(timeout = 1000)
    public void testSetHashCode_add1927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetHashCode_add1927");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6070,getCollection(),6069,getCollection().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6072,getConfirmed(),6071,getConfirmed().hashCode());
        resetFull();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6074,getCollection(),6073,getCollection().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6076,getConfirmed(),6075,getConfirmed().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#hashCode()}.
     */
@Test(timeout = 1000)
    public void testSetHashCode_remove1496() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetHashCode_remove1496");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6070,getCollection(),6069,getCollection().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6072,getConfirmed(),6071,getConfirmed().hashCode());
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6074,getCollection(),6073,getCollection().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6076,getConfirmed(),6075,getConfirmed().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Set#hashCode()}.
     */
@Test(timeout = 1000)
    public void testSetHashCode_remove1497() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetHashCode_remove1497");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6070,getCollection(),6069,getCollection().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6072,getConfirmed(),6071,getConfirmed().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6074,getCollection(),6073,getCollection().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6076,getConfirmed(),6075,getConfirmed().hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

