package org.apache.commons.collections4.collection;

import org.apache.commons.collections4.AbstractObjectTest;
import java.util.ArrayList;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Test;

/** 
 * Abstract test class for {@link java.util.Collection} methods and contracts.
 * <p/>
 * You should create a concrete subclass of this class to test any custom
 * {@link Collection} implementation.  At minimum, you'll have to
 * implement the @{@link #makeObject()}, {@link #makeConfirmedCollection()}
 * and {@link #makeConfirmedFullCollection()} methods.
 * You might want to override some of the additional public methods as well:
 * <p/>
 * <b>Element Population Methods</b>
 * <p/>
 * Override these if your collection restricts what kind of elements are
 * allowed (for instance, if <code>null</code> is not permitted):
 * <ul>
 * <li>{@link #getFullElements()}
 * <li>{@link #getOtherElements()}
 * </ul>
 * <p/>
 * <b>Supported Operation Methods</b>
 * <p/>
 * Override these if your collection doesn't support certain operations:
 * <ul>
 * <li>{@link #isAddSupported()}
 * <li>{@link #isRemoveSupported()}
 * <li>{@link #areEqualElementsDistinguishable()}
 * <li>{@link #isNullSupported()}
 * <li>{@link #isFailFastSupported()}
 * </ul>
 * <p/>
 * <b>Fixture Methods</b>
 * <p/>
 * Fixtures are used to verify that the the operation results in correct state
 * for the collection.  Basically, the operation is performed against your
 * collection implementation, and an identical operation is performed against a
 * <i>confirmed</i> collection implementation.  A confirmed collection
 * implementation is something like <code>java.util.ArrayList</code>, which is
 * known to conform exactly to its collection interface's contract.  After the
 * operation takes place on both your collection implementation and the
 * confirmed collection implementation, the two collections are compared to see
 * if their state is identical.  The comparison is usually much more involved
 * than a simple <code>equals</code> test.  This verification is used to ensure
 * proper modifications are made along with ensuring that the collection does
 * not change when read-only modifications are made.
 * <p/>
 * The {@link #collection} field holds an instance of your collection
 * implementation; the {@link #confirmed} field holds an instance of the
 * confirmed collection implementation.  The {@link #resetEmpty()} and
 * {@link #resetFull()} methods set these fields to empty or full collections,
 * so that tests can proceed from a known state.
 * <p/>
 * After a modification operation to both {@link #collection} and
 * {@link #confirmed}, the {@link #verify()} method is invoked to compare
 * the results.  You may want to override {@link #verify()} to perform
 * additional verifications.  For instance, when testing the collection
 * views of a map, {@link org.apache.commons.collections4.map.AbstractMapTest AbstractTestMap}
 * would override {@link #verify()} to make
 * sure the map is changed after the collection view is changed.
 * <p/>
 * If you're extending this class directly, you will have to provide
 * implementations for the following:
 * <ul>
 * <li>{@link #makeConfirmedCollection()}
 * <li>{@link #makeConfirmedFullCollection()}
 * </ul>
 * <p/>
 * Those methods should provide a confirmed collection implementation
 * that's compatible with your collection implementation.
 * <p/>
 * If you're extending {@link org.apache.commons.collections4.list.AbstractListTest AbstractListTest},
 * {@link org.apache.commons.collections4.set.AbstractSetTest AbstractTestSet},
 * or {@link org.apache.commons.collections4.bag.AbstractBagTest AbstractBagTest},
 * you probably don't have to worry about the
 * above methods, because those three classes already override the methods
 * to provide standard JDK confirmed collections.<P>
 * <p/>
 * <b>Other notes</b>
 * <p/>
 * If your {@link Collection} fails one of these tests by design,
 * you may still use this base set of cases.  Simply override the
 * test case (method) your {@link Collection} fails.
 * 
 * @version $Id$
 */
public abstract class AbstractCollectionTest<E> extends AbstractObjectTest {
    /** 
     * A collection instance that will be used for testing.
     */
private Collection<E> collection;

    /** 
     * Confirmed collection.  This is an instance of a collection that is
     * confirmed to conform exactly to the java.util.Collection contract.
     * Modification operations are tested by performing a mod on your
     * collection, performing the exact same mod on an equivalent confirmed
     * collection, and then calling verify() to make sure your collection
     * still matches the confirmed collection.
     */
private Collection<E> confirmed;

    /** 
     * JUnit constructor.
     * 
     * @param testName the test class name
     */
public AbstractCollectionTest(final String testName) {
        super(testName);
    }

    /** 
     * Specifies whether equal elements in the collection are, in fact,
     * distinguishable with information not readily available.  That is, if a
     * particular value is to be removed from the collection, then there is
     * one and only one value that can be removed, even if there are other
     * elements which are equal to it.
     * <p/>
     * <P>In most collection cases, elements are not distinguishable (equal is
     * equal), thus this method defaults to return false.  In some cases,
     * however, they are.  For example, the collection returned from the map's
     * values() collection view are backed by the map, so while there may be
     * two values that are equal, their associated keys are not.  Since the
     * keys are distinguishable, the values are.
     * <p/>
     * <P>This flag is used to skip some verifications for iterator.remove()
     * where it is impossible to perform an equivalent modification on the
     * confirmed collection because it is not possible to determine which
     * value in the confirmed collection to actually remove.  Tests that
     * override the default (i.e. where equal elements are distinguishable),
     * should provide additional tests on iterator.remove() to make sure the
     * proper elements are removed when remove() is called on the iterator.
     */
public boolean areEqualElementsDistinguishable() {
        return false;
    }

    /** 
     * Returns true if the collections produced by
     * {@link #makeObject()} and {@link #makeFullCollection()}
     * support the <code>add</code> and <code>addAll</code>
     * operations.<P>
     * Default implementation returns true.  Override if your collection
     * class does not support add or addAll.
     */
public boolean isAddSupported() {
        return true;
    }

    /** 
     * Returns true if the collections produced by
     * {@link #makeObject()} and {@link #makeFullCollection()}
     * support the <code>remove</code>, <code>removeAll</code>,
     * <code>retainAll</code>, <code>clear</code> and
     * <code>iterator().remove()</code> methods.
     * Default implementation returns true.  Override if your collection
     * class does not support removal operations.
     */
public boolean isRemoveSupported() {
        return true;
    }

    /** 
     * Returns true to indicate that the collection supports holding null.
     * The default implementation returns true;
     */
public boolean isNullSupported() {
        return true;
    }

    /** 
     * Returns true to indicate that the collection supports fail fast iterators.
     * The default implementation returns true;
     */
public boolean isFailFastSupported() {
        return false;
    }

    /** 
     * Returns true to indicate that the collection supports equals() comparisons.
     * This implementation returns false;
     */
@Override
    public boolean isEqualsCheckable() {
        return false;
    }

    /** 
     * Verifies that {@link #collection} and {@link #confirmed} have
     * identical state.
     */
public void verify() {
        final int confirmedSize = getConfirmed().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4678,confirmedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4680,getCollection(),4679,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4682,getConfirmed(),4681,getConfirmed().isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4684,getCollection(),4683,getCollection().isEmpty());
        final Object[] confirmedValues = new Object[confirmedSize];
        Iterator<E> iter;
        iter = getConfirmed().iterator();
        int pos = 0;
        while (iter.hasNext()) {
            confirmedValues[pos++] = iter.next();
        }
        final boolean[] matched = new boolean[confirmedSize];
        iter = getCollection().iterator();
        while (iter.hasNext()) {
            final Object o = iter.next();
            boolean match = false;
            for (int i = 0 ; i < confirmedSize ; i++) {
                if (matched[i]) {
                    continue;
                } 
                if ((o == (confirmedValues[i])) || ((o != null) && (o.equals(confirmedValues[i])))) {
                    matched[i] = true;
                    match = true;
                    break;
                } 
            }
            if (!match) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4685,(((((("Collection should not contain a value that the " + "confirmed collection does not have: ") + o) + "\nTest: ") + (getCollection())) + "\nReal: ") + (getConfirmed())));
            } 
        }
        for (int i = 0 ; i < confirmedSize ; i++) {
            if (!(matched[i])) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4686,(((("Collection should contain all values that are in the confirmed collection" + "\nTest: ") + (getCollection())) + "\nReal: ") + (getConfirmed())));
            } 
        }
    }

    /** 
     * Resets the {@link #collection} and {@link #confirmed} fields to empty
     * collections.  Invoke this method before performing a modification
     * test.
     */
public void resetEmpty() {
        setCollection(makeObject());
        setConfirmed(makeConfirmedCollection());
    }

    /** 
     * Resets the {@link #collection} and {@link #confirmed} fields to full
     * collections.  Invoke this method before performing a modification
     * test.
     */
public void resetFull() {
        setCollection(makeFullCollection());
        setConfirmed(makeConfirmedFullCollection());
    }

    /** 
     * Returns a confirmed empty collection.
     * For instance, an {@link java.util.ArrayList} for lists or a
     * {@link java.util.HashSet} for sets.
     * 
     * @return a confirmed empty collection
     */
public abstract Collection<E> makeConfirmedCollection();

    /** 
     * Returns a confirmed full collection.
     * For instance, an {@link java.util.ArrayList} for lists or a
     * {@link java.util.HashSet} for sets.  The returned collection
     * should contain the elements returned by {@link #getFullElements()}.
     * 
     * @return a confirmed full collection
     */
public abstract Collection<E> makeConfirmedFullCollection();

    /** 
     * Return a new, empty {@link Collection} to be used for testing.
     */
@Override
    public abstract Collection<E> makeObject();

    /** 
     * Returns a full collection to be used for testing.  The collection
     * returned by this method should contain every element returned by
     * {@link #getFullElements()}.  The default implementation, in fact,
     * simply invokes <code>addAll</code> on an empty collection with
     * the results of {@link #getFullElements()}.  Override this default
     * if your collection doesn't support addAll.
     */
public Collection<E> makeFullCollection() {
        final Collection<E> c = makeObject();
        c.addAll(java.util.Arrays.asList(getFullElements()));
        return c;
    }

    /** 
     * Creates a new Map Entry that is independent of the first and the map.
     */
public Map.Entry<E, E> cloneMapEntry(final Map.Entry<E, E> entry) {
        final HashMap<E, E> map = new HashMap<E, E>();
        map.put(entry.getKey(), entry.getValue());
        return map.entrySet().iterator().next();
    }

    /** 
     * Returns an array of objects that are contained in a collection
     * produced by {@link #makeFullCollection()}.  Every element in the
     * returned array <I>must</I> be an element in a full collection.<P>
     * The default implementation returns a heterogenous array of
     * objects with some duplicates. null is added if allowed.
     * Override if you require specific testing elements.  Note that if you
     * override {@link #makeFullCollection()}, you <I>must</I> override
     * this method to reflect the contents of a full collection.
     */
@SuppressWarnings(value = "unchecked")
    public E[] getFullElements() {
        if (isNullSupported()) {
            final ArrayList<E> list = new ArrayList<E>();
            list.addAll(java.util.Arrays.asList(getFullNonNullElements()));
            list.add(4, null);
            return ((E[])(list.toArray()));
        } 
        return getFullNonNullElements().clone();
    }

    /** 
     * Returns an array of elements that are <I>not</I> contained in a
     * full collection.  Every element in the returned array must
     * not exist in a collection returned by {@link #makeFullCollection()}.
     * The default implementation returns a heterogenous array of elements
     * without null.  Note that some of the tests add these elements
     * to an empty or full collection, so if your collection restricts
     * certain kinds of elements, you should override this method.
     */
public E[] getOtherElements() {
        return getOtherNonNullElements();
    }

    /** 
     * Returns a list of elements suitable for return by
     * {@link #getFullElements()}.  The array returned by this method
     * does not include null, but does include a variety of objects
     * of different types.  Override getFullElements to return
     * the results of this method if your collection does not support
     * the null element.
     */
@SuppressWarnings(value = "unchecked")
    public E[] getFullNonNullElements() {
        return ((E[])(new Object[]{ new String("") , new String("One") , java.lang.Integer.valueOf(2) , "Three" , java.lang.Integer.valueOf(4) , "One" , new Double(5) , new Float(6) , "Seven" , "Eight" , new String("Nine") , java.lang.Integer.valueOf(10) , new Short(((short)(11))) , new Long(12) , "Thirteen" , "14" , "15" , new Byte(((byte)(16))) }));
    }

    /** 
     * Returns the default list of objects returned by
     * {@link #getOtherElements()}.  Includes many objects
     * of different types.
     */
@SuppressWarnings(value = "unchecked")
    public E[] getOtherNonNullElements() {
        return ((E[])(new Object[]{ java.lang.Integer.valueOf(0) , new Float(0) , new Double(0) , "Zero" , new Short(((short)(0))) , new Byte(((byte)(0))) , new Long(0) , new Character(' ') , "0" }));
    }

    /** 
     * Returns a list of string elements suitable for return by
     * {@link #getFullElements()}.  Override getFullElements to return
     * the results of this method if your collection does not support
     * heterogenous elements or the null element.
     */
public Object[] getFullNonNullStringElements() {
        return new Object[]{ "If" , "the" , "dull" , "substance" , "of" , "my" , "flesh" , "were" , "thought" , "Injurious" , "distance" , "could" , "not" , "stop" , "my" , "way" };
    }

    /** 
     * Returns a list of string elements suitable for return by
     * {@link #getOtherElements()}.  Override getOtherElements to return
     * the results of this method if your collection does not support
     * heterogenous elements or the null element.
     */
public Object[] getOtherNonNullStringElements() {
        return new Object[]{ "For" , "then" , "despite" , "space" , "I" , "would" , "be" , "brought" , "From" , "limits" , "far" , "remote" , "where" , "thou" , "dost" , "stay" };
    }

    /** 
     * Tests {@link Collection#add(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionAdd_add1291() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAdd_add1291");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            resetEmpty();
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4557,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4559,getCollection(),4558,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4560,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4562,getCollection(),4561,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4564,getCollection(),4563,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#add(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionAdd_add1292() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAdd_add1292");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4557,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4559,getCollection(),4558,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4560,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4562,getCollection(),4561,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4564,getCollection(),4563,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#add(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionAdd_add1293() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAdd_add1293");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4557,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4559,getCollection(),4558,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4560,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4562,getCollection(),4561,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4564,getCollection(),4563,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#add(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionAdd_add1294() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAdd_add1294");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4557,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4559,getCollection(),4558,getCollection().size());
        }
        resetEmpty();
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4560,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4562,getCollection(),4561,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4564,getCollection(),4563,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#add(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionAdd_add1295() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAdd_add1295");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4557,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4559,getCollection(),4558,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4560,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4562,getCollection(),4561,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4564,getCollection(),4563,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#add(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionAdd_add1296() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAdd_add1296");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4557,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4559,getCollection(),4558,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4560,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4562,getCollection(),4561,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4564,getCollection(),4563,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#add(Object)}.
     */
public void testCollectionAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAdd");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4557,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4559,getCollection(),4558,getCollection().size());
        }
        resetEmpty();
        int size = -1;
        for (final E element : elements) {
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4560,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4562,getCollection(),4561,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4564,getCollection(),4563,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#add(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionAdd_remove957() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAdd_remove957");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4557,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4559,getCollection(),4558,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4560,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4562,getCollection(),4561,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4564,getCollection(),4563,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#add(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionAdd_remove958() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAdd_remove958");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4557,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4559,getCollection(),4558,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4560,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4562,getCollection(),4561,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4564,getCollection(),4563,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#add(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionAdd_remove959() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAdd_remove959");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4557,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4559,getCollection(),4558,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4560,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4562,getCollection(),4561,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4564,getCollection(),4563,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#add(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionAdd_remove960() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAdd_remove960");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4557,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4559,getCollection(),4558,getCollection().size());
        }
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4560,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4562,getCollection(),4561,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4564,getCollection(),4563,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#add(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionAdd_remove961() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAdd_remove961");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4557,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4559,getCollection(),4558,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4560,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4562,getCollection(),4561,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4564,getCollection(),4563,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#add(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionAdd_remove962() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAdd_remove962");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4557,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4559,getCollection(),4558,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().add(element);
            getConfirmed().add(element);
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4560,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4562,getCollection(),4561,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4564,getCollection(),4563,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_add1298() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_add1298");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_add1299() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_add1299");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_add1300() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_add1300");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_add1301() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_add1301");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_add1302() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_add1302");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_add1303() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_add1303");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_add1304() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_add1304");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_add1305() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_add1305");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_remove963() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_remove963");
        if (!(isAddSupported())) {
            return ;
        } 
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_remove964() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_remove964");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_remove965() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_remove965");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_remove966() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_remove966");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_remove967() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_remove967");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_remove968() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_remove968");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_remove969() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_remove969");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_remove970() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_remove970");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#addAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionAddAll_remove971() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll_remove971");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        E[] elements = getFullElements();
        boolean r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4544,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4546,getCollection(),4545,getCollection().contains(element));
        }
        resetFull();
        int size = getCollection().size();
        elements = getOtherElements();
        r = getCollection().addAll(java.util.Arrays.asList(elements));
        getConfirmed().addAll(java.util.Arrays.asList(elements));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4547,r);
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4549,getCollection(),4548,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4550,(size + (elements.length)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4552,getCollection(),4551,getCollection().size());
        resetFull();
        size = getCollection().size();
        r = getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        getConfirmed().addAll(java.util.Arrays.asList(getFullElements()));
        verify();
        if (r) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4553,(size < (getCollection().size())));
        } else {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4554,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4556,getCollection(),4555,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_add1431() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_add1431");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_add1432() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_add1432");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_add1433() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_add1433");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_add1434() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_add1434");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_add1435() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_add1435");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_add1436() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_add1436");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_add1437() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_add1437");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_add1438() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_add1438");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_add1439() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_add1439");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_add1440() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_add1440");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
public void testUnsupportedAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[-1]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
public void testUnsupportedAdd_literalMutation1297() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_literalMutation1297");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[1]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_remove1072() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_remove1072");
        if (isAddSupported()) {
            return ;
        } 
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_remove1073() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_remove1073");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_remove1074() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_remove1074");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_remove1075() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_remove1075");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_remove1076() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_remove1076");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isAddSupported()} returns false, tests that add operations
     * raise <code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedAdd_remove1077() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedAdd_remove1077");
        if (isAddSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        try {
            getCollection().addAll(java.util.Arrays.asList(getFullElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            getCollection().add(getFullNonNullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Collection#clear()}.
     */
@Test(timeout = 1000)
    public void testCollectionClear() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        resetEmpty();
        getCollection().clear();
        verify();
        resetFull();
        getCollection().clear();
        getConfirmed().clear();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Collection#clear()}.
     */
@Test(timeout = 1000)
    public void testCollectionClear_add1307() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear_add1307");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        getCollection().clear();
        getCollection().clear();
        verify();
        resetFull();
        getCollection().clear();
        getConfirmed().clear();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Collection#clear()}.
     */
@Test(timeout = 1000)
    public void testCollectionClear_add1308() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear_add1308");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        getCollection().clear();
        verify();
        verify();
        resetFull();
        getCollection().clear();
        getConfirmed().clear();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Collection#clear()}.
     */
@Test(timeout = 1000)
    public void testCollectionClear_add1309() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear_add1309");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        getCollection().clear();
        verify();
        resetFull();
        resetFull();
        getCollection().clear();
        getConfirmed().clear();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Collection#clear()}.
     */
@Test(timeout = 1000)
    public void testCollectionClear_add1310() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear_add1310");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        getCollection().clear();
        verify();
        resetFull();
        getCollection().clear();
        getCollection().clear();
        getConfirmed().clear();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Collection#clear()}.
     */
@Test(timeout = 1000)
    public void testCollectionClear_add1311() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear_add1311");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        getCollection().clear();
        verify();
        resetFull();
        getCollection().clear();
        getConfirmed().clear();
        getConfirmed().clear();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Collection#clear()}.
     */
@Test(timeout = 1000)
    public void testCollectionClear_add1312() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear_add1312");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        getCollection().clear();
        verify();
        resetFull();
        getCollection().clear();
        getConfirmed().clear();
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Collection#clear()}.
     */
@Test(timeout = 1000)
    public void testCollectionClear_remove972() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear_remove972");
        if (!(isRemoveSupported())) {
            return ;
        } 
        getCollection().clear();
        verify();
        resetFull();
        getCollection().clear();
        getConfirmed().clear();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Collection#clear()}.
     */
@Test(timeout = 1000)
    public void testCollectionClear_remove973() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear_remove973");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        verify();
        resetFull();
        getCollection().clear();
        getConfirmed().clear();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Collection#clear()}.
     */
@Test(timeout = 1000)
    public void testCollectionClear_remove974() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear_remove974");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        getCollection().clear();
        resetFull();
        getCollection().clear();
        getConfirmed().clear();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Collection#clear()}.
     */
@Test(timeout = 1000)
    public void testCollectionClear_remove975() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear_remove975");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        getCollection().clear();
        verify();
        getCollection().clear();
        getConfirmed().clear();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Collection#clear()}.
     */
@Test(timeout = 1000)
    public void testCollectionClear_remove976() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear_remove976");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        verify();
        resetFull();
        getCollection().clear();
        getConfirmed().clear();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Collection#clear()}.
     */
@Test(timeout = 1000)
    public void testCollectionClear_remove977() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear_remove977");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        verify();
        resetFull();
        getCollection().clear();
        getConfirmed().clear();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link Collection#clear()}.
     */
@Test(timeout = 1000)
    public void testCollectionClear_remove978() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear_remove978");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        getCollection().clear();
        resetFull();
        getCollection().clear();
        getConfirmed().clear();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionContains_add1313() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains_add1313");
        Object[] elements;
        resetEmpty();
        resetEmpty();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        verify();
        elements = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        resetFull();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionContains_add1314() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains_add1314");
        Object[] elements;
        resetEmpty();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        verify();
        verify();
        elements = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        resetFull();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionContains_add1315() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains_add1315");
        Object[] elements;
        resetEmpty();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        verify();
        elements = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        verify();
        resetFull();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionContains_add1316() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains_add1316");
        Object[] elements;
        resetEmpty();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        verify();
        elements = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        resetFull();
        resetFull();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionContains_add1317() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains_add1317");
        Object[] elements;
        resetEmpty();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        verify();
        elements = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        resetFull();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        verify();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionContains_add1318() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains_add1318");
        Object[] elements;
        resetEmpty();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        verify();
        elements = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        resetFull();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        resetFull();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
public void testCollectionContains() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains");
        Object[] elements;
        resetEmpty();
        elements = getFullElements();
        for (int i = -1 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        verify();
        elements = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        resetFull();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
public void testCollectionContains_literalMutation1244() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains_literalMutation1244");
        Object[] elements;
        resetEmpty();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        verify();
        elements = getOtherElements();
        for (int i = 1 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        resetFull();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
public void testCollectionContains_literalMutation1245() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains_literalMutation1245");
        Object[] elements;
        resetEmpty();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        verify();
        elements = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        resetFull();
        elements = getFullElements();
        for (int i = 1 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionContains_remove979() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains_remove979");
        Object[] elements;
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        verify();
        elements = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        resetFull();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionContains_remove980() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains_remove980");
        Object[] elements;
        resetEmpty();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        elements = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        resetFull();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionContains_remove981() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains_remove981");
        Object[] elements;
        resetEmpty();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        elements = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        resetFull();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionContains_remove982() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains_remove982");
        Object[] elements;
        resetEmpty();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        verify();
        elements = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionContains_remove983() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains_remove983");
        Object[] elements;
        resetEmpty();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        elements = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        resetFull();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#contains(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionContains_remove984() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContains_remove984");
        Object[] elements;
        resetEmpty();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4579,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4580,!(getCollection().contains(elements[i])));
        }
        verify();
        elements = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4581,(("Empty collection shouldn\'t contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4582,!(getCollection().contains(elements[i])));
        }
        verify();
        elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4583,(("Full collection should contain element[" + i) + "]"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4585,getCollection(),4584,getCollection().contains(elements[i]));
        }
        verify();
        resetFull();
        elements = getOtherElements();
        for (Object element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4586,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_add1319() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_add1319");
        resetEmpty();
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_add1320() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_add1320");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_add1321() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_add1321");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_add1322() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_add1322");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_add1323() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_add1323");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_add1324() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_add1324");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_add1325() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_add1325");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_add1326() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_add1326");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_add1327() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_add1327");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_add1328() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_add1328");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_add1329() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_add1329");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
public void testCollectionContainsAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 1 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
public void testCollectionContainsAll_literalMutation1247() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_literalMutation1247");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? -1 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
public void testCollectionContainsAll_literalMutation1248() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_literalMutation1248");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 3;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
public void testCollectionContainsAll_literalMutation1249() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_literalMutation1249");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 2 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
public void testCollectionContainsAll_literalMutation1250() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_literalMutation1250");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 0 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
public void testCollectionContainsAll_literalMutation1251() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_literalMutation1251");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 4 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
public void testCollectionContainsAll_literalMutation1252() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_literalMutation1252");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 0 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
public void testCollectionContainsAll_literalMutation1253() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_literalMutation1253");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 4;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_remove985() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_remove985");
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_remove986() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_remove986");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_remove987() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_remove987");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_remove988() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_remove988");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_remove989() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_remove989");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_remove990() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_remove990");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_remove991() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_remove991");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_remove992() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_remove992");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_remove993() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_remove993");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_remove994() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_remove994");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#containsAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionContainsAll_remove995() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionContainsAll_remove995");
        resetEmpty();
        Collection<E> col = new HashSet<E>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4565,("Every Collection should contain all elements of an " + "empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4567,getCollection(),4566,getCollection().containsAll(col));
        col.addAll(java.util.Arrays.asList(getOtherElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4568,("Empty Collection shouldn\'t contain all elements of " + "a non-empty Collection."));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4569,!(getCollection().containsAll(col)));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4570,!(getCollection().containsAll(col)));
        col.clear();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4572,getCollection(),4571,getCollection().containsAll(col));
        verify();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        col = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4574,getCollection(),4573,getCollection().containsAll(col));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4576,getCollection(),4575,getCollection().containsAll(getCollection()));
        verify();
        col = new ArrayList<E>();
        col.addAll(java.util.Arrays.asList(getFullElements()));
        col.addAll(java.util.Arrays.asList(getFullElements()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4578,getCollection(),4577,getCollection().containsAll(col));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#isEmpty()}.
     */
@Test(timeout = 1000)
    public void testCollectionIsEmpty() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIsEmpty");
        resetEmpty();
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4588,getCollection(),4587,getCollection().isEmpty());
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4590,getCollection(),4589,getCollection().isEmpty());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#isEmpty()}.
     */
@Test(timeout = 1000)
    public void testCollectionIsEmpty_add1331() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIsEmpty_add1331");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4588,getCollection(),4587,getCollection().isEmpty());
        verify();
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4590,getCollection(),4589,getCollection().isEmpty());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#isEmpty()}.
     */
@Test(timeout = 1000)
    public void testCollectionIsEmpty_add1332() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIsEmpty_add1332");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4588,getCollection(),4587,getCollection().isEmpty());
        verify();
        resetFull();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4590,getCollection(),4589,getCollection().isEmpty());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#isEmpty()}.
     */
@Test(timeout = 1000)
    public void testCollectionIsEmpty_add1333() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIsEmpty_add1333");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4588,getCollection(),4587,getCollection().isEmpty());
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4590,getCollection(),4589,getCollection().isEmpty());
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#isEmpty()}.
     */
@Test(timeout = 1000)
    public void testCollectionIsEmpty_remove996() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIsEmpty_remove996");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4588,getCollection(),4587,getCollection().isEmpty());
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4590,getCollection(),4589,getCollection().isEmpty());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#isEmpty()}.
     */
@Test(timeout = 1000)
    public void testCollectionIsEmpty_remove997() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIsEmpty_remove997");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4588,getCollection(),4587,getCollection().isEmpty());
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4590,getCollection(),4589,getCollection().isEmpty());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#isEmpty()}.
     */
@Test(timeout = 1000)
    public void testCollectionIsEmpty_remove998() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIsEmpty_remove998");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4588,getCollection(),4587,getCollection().isEmpty());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4590,getCollection(),4589,getCollection().isEmpty());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#isEmpty()}.
     */
@Test(timeout = 1000)
    public void testCollectionIsEmpty_remove999() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIsEmpty_remove999");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4588,getCollection(),4587,getCollection().isEmpty());
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4590,getCollection(),4589,getCollection().isEmpty());
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
@Test(timeout = 1000)
    public void testCollectionIterator_add1334() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator_add1334");
        resetEmpty();
        resetEmpty();
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
            list.add(next);
        }
        try {
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
@Test(timeout = 1000)
    public void testCollectionIterator_add1335() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator_add1335");
        resetEmpty();
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
            list.add(next);
        }
        try {
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
@Test(timeout = 1000)
    public void testCollectionIterator_add1336() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator_add1336");
        resetEmpty();
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        verify();
        resetFull();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
            list.add(next);
        }
        try {
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
@Test(timeout = 1000)
    public void testCollectionIterator_add1337() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator_add1337");
        resetEmpty();
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        resetFull();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
            list.add(next);
        }
        try {
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
@Test(timeout = 1000)
    public void testCollectionIterator_add1338() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator_add1338");
        resetEmpty();
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
            list.add(next);
        }
        try {
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
@Test(timeout = 1000)
    public void testCollectionIterator_add1339() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator_add1339");
        resetEmpty();
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
            list.add(next);
            list.add(next);
        }
        try {
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
@Test(timeout = 1000)
    public void testCollectionIterator_add1340() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator_add1340");
        resetEmpty();
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
            list.add(next);
        }
        try {
            it1.next();
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
@Test(timeout = 1000)
    public void testCollectionIterator_add1341() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator_add1341");
        resetEmpty();
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
            list.add(next);
        }
        try {
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
public void testCollectionIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator");
        resetEmpty();
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        it1 = getCollection().iterator();
        for (int i = -1 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
            list.add(next);
        }
        try {
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
public void testCollectionIterator_literalMutation1255() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator_literalMutation1255");
        resetEmpty();
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = -1 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
            list.add(next);
        }
        try {
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
@Test(timeout = 1000)
    public void testCollectionIterator_remove1000() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator_remove1000");
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
            list.add(next);
        }
        try {
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
@Test(timeout = 1000)
    public void testCollectionIterator_remove1001() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator_remove1001");
        resetEmpty();
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
            list.add(next);
        }
        try {
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
@Test(timeout = 1000)
    public void testCollectionIterator_remove1002() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator_remove1002");
        resetEmpty();
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
            list.add(next);
        }
        try {
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
@Test(timeout = 1000)
    public void testCollectionIterator_remove1003() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator_remove1003");
        resetEmpty();
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
        }
        try {
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only functionality of {@link Collection#iterator()}.
     */
@Test(timeout = 1000)
    public void testCollectionIterator_remove1004() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIterator_remove1004");
        resetEmpty();
        Iterator<E> it1 = getCollection().iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4597,it1,4596,it1.hasNext());
        try {
            it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4598,("Iterator at end of Collection should throw " + "NoSuchElementException when next is called."));
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4600,it1,4599,it1.hasNext());
            it1.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4601,!(it1.hasNext()));
        final ArrayList<E> list = new ArrayList<E>();
        it1 = getCollection().iterator();
        for (int i = 0 ; i < (getCollection().size()) ; i++) {
            final E next = it1.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4603,getCollection(),4602,getCollection().contains(next));
            list.add(next);
        }
        try {
            it1.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_add1364() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_add1364");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_add1365() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_add1365");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_add1366() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_add1366");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_add1367() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_add1367");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_add1368() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_add1368");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_add1369() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_add1369");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_add1370() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_add1370");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_add1371() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_add1371");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_add1372() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_add1372");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_add1373() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_add1373");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_add1374() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_add1374");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_add1375() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_add1375");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_add1376() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_add1376");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_add1377() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_add1377");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    public void testCollectionIteratorRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_remove1013() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_remove1013");
        if (!(isRemoveSupported())) {
            return ;
        } 
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_remove1014() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_remove1014");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_remove1015() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_remove1015");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_remove1016() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_remove1016");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_remove1017() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_remove1017");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests removals from {@link Collection#iterator()}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCollectionIteratorRemove_remove1018() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorRemove_remove1018");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().iterator().remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        try {
            final Iterator<E> iter = getCollection().iterator();
            iter.hasNext();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        verify();
        resetFull();
        int size = getCollection().size();
        Iterator<E> iter = getCollection().iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o instanceof Map.Entry) {
                o = cloneMapEntry(((Map.Entry<E, E>)(o)));
            } 
            iter.remove();
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(o);
                verify();
            } 
            size--;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4591,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4593,getCollection(),4592,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4595,getCollection(),4594,getCollection().isEmpty());
        resetFull();
        iter = getCollection().iterator();
        iter.next();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#remove(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemove_add1378() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove_add1378");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        resetEmpty();
        final E[] elements = getFullElements();
        for (E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().remove(element)));
            verify();
        }
        final E[] other = getOtherElements();
        resetFull();
        for (E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().remove(element)));
            verify();
        }
        final int size = getCollection().size();
        for (final E element : elements) {
            resetFull();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,("Collection should remove extant element: " + element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,getCollection(),4617,getCollection().remove(element));
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(element);
                verify();
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(size - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,getCollection(),4620,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#remove(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemove_add1379() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove_add1379");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final E[] elements = getFullElements();
        for (E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().remove(element)));
            verify();
            verify();
        }
        final E[] other = getOtherElements();
        resetFull();
        for (E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().remove(element)));
            verify();
        }
        final int size = getCollection().size();
        for (final E element : elements) {
            resetFull();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,("Collection should remove extant element: " + element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,getCollection(),4617,getCollection().remove(element));
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(element);
                verify();
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(size - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,getCollection(),4620,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#remove(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemove_add1380() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove_add1380");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final E[] elements = getFullElements();
        for (E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().remove(element)));
            verify();
        }
        final E[] other = getOtherElements();
        resetFull();
        resetFull();
        for (E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().remove(element)));
            verify();
        }
        final int size = getCollection().size();
        for (final E element : elements) {
            resetFull();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,("Collection should remove extant element: " + element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,getCollection(),4617,getCollection().remove(element));
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(element);
                verify();
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(size - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,getCollection(),4620,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#remove(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemove_add1381() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove_add1381");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final E[] elements = getFullElements();
        for (E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().remove(element)));
            verify();
        }
        final E[] other = getOtherElements();
        resetFull();
        for (E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().remove(element)));
            verify();
            verify();
        }
        final int size = getCollection().size();
        for (final E element : elements) {
            resetFull();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,("Collection should remove extant element: " + element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,getCollection(),4617,getCollection().remove(element));
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(element);
                verify();
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(size - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,getCollection(),4620,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#remove(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemove_add1382() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove_add1382");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final E[] elements = getFullElements();
        for (E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().remove(element)));
            verify();
        }
        final E[] other = getOtherElements();
        resetFull();
        for (E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().remove(element)));
            verify();
        }
        final int size = getCollection().size();
        for (final E element : elements) {
            resetFull();
            resetFull();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,("Collection should remove extant element: " + element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,getCollection(),4617,getCollection().remove(element));
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(element);
                verify();
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(size - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,getCollection(),4620,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#remove(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemove_add1383() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove_add1383");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final E[] elements = getFullElements();
        for (E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().remove(element)));
            verify();
        }
        final E[] other = getOtherElements();
        resetFull();
        for (E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().remove(element)));
            verify();
        }
        final int size = getCollection().size();
        for (final E element : elements) {
            resetFull();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,("Collection should remove extant element: " + element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,getCollection(),4617,getCollection().remove(element));
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(element);
                getConfirmed().remove(element);
                verify();
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(size - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,getCollection(),4620,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#remove(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemove_add1384() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove_add1384");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final E[] elements = getFullElements();
        for (E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().remove(element)));
            verify();
        }
        final E[] other = getOtherElements();
        resetFull();
        for (E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().remove(element)));
            verify();
        }
        final int size = getCollection().size();
        for (final E element : elements) {
            resetFull();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,("Collection should remove extant element: " + element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,getCollection(),4617,getCollection().remove(element));
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(element);
                verify();
                verify();
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(size - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,getCollection(),4620,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#remove(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemove_remove1019() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove_remove1019");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().remove(element)));
            verify();
        }
        final E[] other = getOtherElements();
        resetFull();
        for (E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().remove(element)));
            verify();
        }
        final int size = getCollection().size();
        for (final E element : elements) {
            resetFull();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,("Collection should remove extant element: " + element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,getCollection(),4617,getCollection().remove(element));
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(element);
                verify();
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(size - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,getCollection(),4620,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#remove(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemove_remove1020() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove_remove1020");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final E[] elements = getFullElements();
        for (E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().remove(element)));
        }
        final E[] other = getOtherElements();
        resetFull();
        for (E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().remove(element)));
            verify();
        }
        final int size = getCollection().size();
        for (final E element : elements) {
            resetFull();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,("Collection should remove extant element: " + element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,getCollection(),4617,getCollection().remove(element));
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(element);
                verify();
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(size - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,getCollection(),4620,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#remove(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemove_remove1021() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove_remove1021");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final E[] elements = getFullElements();
        for (E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().remove(element)));
            verify();
        }
        final E[] other = getOtherElements();
        for (E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().remove(element)));
            verify();
        }
        final int size = getCollection().size();
        for (final E element : elements) {
            resetFull();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,("Collection should remove extant element: " + element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,getCollection(),4617,getCollection().remove(element));
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(element);
                verify();
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(size - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,getCollection(),4620,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#remove(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemove_remove1022() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove_remove1022");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final E[] elements = getFullElements();
        for (E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().remove(element)));
            verify();
        }
        final E[] other = getOtherElements();
        resetFull();
        for (E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().remove(element)));
        }
        final int size = getCollection().size();
        for (final E element : elements) {
            resetFull();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,("Collection should remove extant element: " + element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,getCollection(),4617,getCollection().remove(element));
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(element);
                verify();
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(size - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,getCollection(),4620,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#remove(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemove_remove1023() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove_remove1023");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final E[] elements = getFullElements();
        for (E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().remove(element)));
            verify();
        }
        final E[] other = getOtherElements();
        resetFull();
        for (E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().remove(element)));
            verify();
        }
        final int size = getCollection().size();
        for (final E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,("Collection should remove extant element: " + element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,getCollection(),4617,getCollection().remove(element));
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(element);
                verify();
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(size - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,getCollection(),4620,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#remove(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemove_remove1024() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove_remove1024");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final E[] elements = getFullElements();
        for (E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().remove(element)));
            verify();
        }
        final E[] other = getOtherElements();
        resetFull();
        for (E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().remove(element)));
            verify();
        }
        final int size = getCollection().size();
        for (final E element : elements) {
            resetFull();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,("Collection should remove extant element: " + element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,getCollection(),4617,getCollection().remove(element));
            if (!(areEqualElementsDistinguishable())) {
                verify();
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(size - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,getCollection(),4620,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#remove(Object)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemove_remove1025() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove_remove1025");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final E[] elements = getFullElements();
        for (E element : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().remove(element)));
            verify();
        }
        final E[] other = getOtherElements();
        resetFull();
        for (E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().remove(element)));
            verify();
        }
        final int size = getCollection().size();
        for (final E element : elements) {
            resetFull();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4616,("Collection should remove extant element: " + element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4618,getCollection(),4617,getCollection().remove(element));
            if (!(areEqualElementsDistinguishable())) {
                getConfirmed().remove(element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,(size - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,getCollection(),4620,getCollection().size());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_add1385() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_add1385");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_add1386() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_add1386");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_add1387() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_add1387");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_add1388() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_add1388");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_add1389() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_add1389");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_add1390() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_add1390");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_add1391() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_add1391");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_add1392() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_add1392");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_add1393() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_add1393");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_add1394() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_add1394");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_add1395() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_add1395");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
public void testCollectionRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemove");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 3 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
public void testCollectionRemoveAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? -1 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
public void testCollectionRemoveAll_literalMutation1266() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_literalMutation1266");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 1;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
public void testCollectionRemoveAll_literalMutation1267() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_literalMutation1267");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 0 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
public void testCollectionRemoveAll_literalMutation1268() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_literalMutation1268");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 0 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
public void testCollectionRemoveAll_literalMutation1269() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_literalMutation1269");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 4 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
public void testCollectionRemoveAll_literalMutation1270() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_literalMutation1270");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 2 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
public void testCollectionRemoveAll_literalMutation1271() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_literalMutation1271");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 6;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_remove1026() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_remove1026");
        if (!(isRemoveSupported())) {
            return ;
        } 
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_remove1027() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_remove1027");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_remove1028() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_remove1028");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_remove1029() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_remove1029");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_remove1030() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_remove1030");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_remove1031() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_remove1031");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_remove1032() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_remove1032");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_remove1033() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_remove1033");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_remove1034() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_remove1034");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_remove1035() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_remove1035");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#removeAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRemoveAll_remove1036() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRemoveAll_remove1036");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4604,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4605,!(getCollection().removeAll(new java.util.ArrayList<E>(getCollection()))));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4606,!(getCollection().removeAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4607,!(getCollection().removeAll(java.util.Arrays.asList(getOtherElements()))));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4609,getCollection(),4608,getCollection().removeAll(new java.util.HashSet<E>(getCollection())));
        getConfirmed().removeAll(new HashSet<E>(getConfirmed()));
        verify();
        resetFull();
        final int size = getCollection().size();
        final int min = (getFullElements().length) < 2 ? 0 : 2;
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
        final Collection<E> all = java.util.Arrays.asList(getFullElements()).subList(min, max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4611,getCollection(),4610,getCollection().removeAll(all));
        getConfirmed().removeAll(all);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4612,((getCollection().size()) < size));
        for (E element : all) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4613,!(getCollection().contains(element)));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1396() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1396");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1397() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1397");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1398() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1398");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1399() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1399");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1400() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1400");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1401() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1401");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1402() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1402");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1403() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1403");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1404() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1404");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1405() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1405");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1406() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1406");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1407() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1407");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1408() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1408");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1409() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1409");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1410() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1410");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_add1411() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_add1411");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
public void testCollectionRetainAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 2) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
public void testCollectionRetainAll_literalMutation1273() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_literalMutation1273");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 1 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
public void testCollectionRetainAll_literalMutation1274() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_literalMutation1274");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? -1 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
public void testCollectionRetainAll_literalMutation1275() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_literalMutation1275");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 3;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
public void testCollectionRetainAll_literalMutation1276() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_literalMutation1276");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 4 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
public void testCollectionRetainAll_literalMutation1277() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_literalMutation1277");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 2 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
public void testCollectionRetainAll_literalMutation1278() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_literalMutation1278");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 4;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1037() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1037");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1038() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1038");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1039() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1039");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1040() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1040");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1041() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1041");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1042() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1042");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1043() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1043");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1044() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1044");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1045() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1045");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1046() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1046");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1047() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1047");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1048() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1048");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1049() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1049");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1050() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1050");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1051() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1051");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#retainAll(Collection)}.
     */
@Test(timeout = 1000)
    public void testCollectionRetainAll_remove1052() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll_remove1052");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4622,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,getCollection(),4626,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,getCollection(),4630,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,elements.subList(min, max),4634,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,getCollection(),4640,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#size()}.
     */
@Test(timeout = 1000)
    public void testCollectionSize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionSize");
        resetEmpty();
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4643,getCollection(),4642,getCollection().size());
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4644,((getCollection().size()) > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#size()}.
     */
@Test(timeout = 1000)
    public void testCollectionSize_add1413() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionSize_add1413");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4643,getCollection(),4642,getCollection().size());
        resetFull();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4644,((getCollection().size()) > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#size()}.
     */
@Test(timeout = 1000)
    public void testCollectionSize_remove1053() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionSize_remove1053");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4643,getCollection(),4642,getCollection().size());
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4644,((getCollection().size()) > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#size()}.
     */
@Test(timeout = 1000)
    public void testCollectionSize_remove1054() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionSize_remove1054");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4643,getCollection(),4642,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4644,((getCollection().size()) > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray()}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray_add1414() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray_add1414");
        resetEmpty();
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,getCollection().toArray().length);
        resetFull();
        final Object[] array = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4661,array.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,getCollection(),4662,getCollection().size());
        final Object[] confirmedArray = getConfirmed().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4664,("length of array from confirmed collection should " + "match the length of the collection\'s array"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4665,confirmedArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4666,array.length);
        final boolean[] matched = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4668,getCollection(),4667,getCollection().contains(array[i]));
            boolean match = false;
            for (int j = 0 ; j < (array.length) ; j++) {
                if (matched[j]) {
                    continue;
                } 
                if (((array[i]) == (confirmedArray[j])) || (((array[i]) != null) && (array[i].equals(confirmedArray[j])))) {
                    matched[j] = true;
                    match = true;
                    break;
                } 
            }
            if (!match) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4669,((("element " + i) + " in returned array should be found ") + "in the confirmed collection\'s array"));
            } 
        }
        for (final boolean element : matched) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4670,("Collection should return all its elements in " + "toArray"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4671,element);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray()}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray_add1415() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray_add1415");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,getCollection().toArray().length);
        resetFull();
        resetFull();
        final Object[] array = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4661,array.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,getCollection(),4662,getCollection().size());
        final Object[] confirmedArray = getConfirmed().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4664,("length of array from confirmed collection should " + "match the length of the collection\'s array"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4665,confirmedArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4666,array.length);
        final boolean[] matched = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4668,getCollection(),4667,getCollection().contains(array[i]));
            boolean match = false;
            for (int j = 0 ; j < (array.length) ; j++) {
                if (matched[j]) {
                    continue;
                } 
                if (((array[i]) == (confirmedArray[j])) || (((array[i]) != null) && (array[i].equals(confirmedArray[j])))) {
                    matched[j] = true;
                    match = true;
                    break;
                } 
            }
            if (!match) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4669,((("element " + i) + " in returned array should be found ") + "in the confirmed collection\'s array"));
            } 
        }
        for (final boolean element : matched) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4670,("Collection should return all its elements in " + "toArray"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4671,element);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray()}.
     */
public void testCollectionToArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,getCollection().toArray().length);
        resetFull();
        final Object[] array = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4661,array.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,getCollection(),4662,getCollection().size());
        final Object[] confirmedArray = getConfirmed().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4664,("length of array from confirmed collection should " + "match the length of the collection\'s array"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4665,confirmedArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4666,array.length);
        final boolean[] matched = new boolean[array.length];
        for (int i = 1 ; i < (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4668,getCollection(),4667,getCollection().contains(array[i]));
            boolean match = false;
            for (int j = 0 ; j < (array.length) ; j++) {
                if (matched[j]) {
                    continue;
                } 
                if (((array[i]) == (confirmedArray[j])) || (((array[i]) != null) && (array[i].equals(confirmedArray[j])))) {
                    matched[j] = true;
                    match = true;
                    break;
                } 
            }
            if (!match) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4669,((("element " + i) + " in returned array should be found ") + "in the confirmed collection\'s array"));
            } 
        }
        for (final boolean element : matched) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4670,("Collection should return all its elements in " + "toArray"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4671,element);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray()}.
     */
public void testCollectionToArray_literalMutation1280() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray_literalMutation1280");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,getCollection().toArray().length);
        resetFull();
        final Object[] array = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4661,array.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,getCollection(),4662,getCollection().size());
        final Object[] confirmedArray = getConfirmed().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4664,("length of array from confirmed collection should " + "match the length of the collection\'s array"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4665,confirmedArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4666,array.length);
        final boolean[] matched = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4668,getCollection(),4667,getCollection().contains(array[i]));
            boolean match = true;
            for (int j = 0 ; j < (array.length) ; j++) {
                if (matched[j]) {
                    continue;
                } 
                if (((array[i]) == (confirmedArray[j])) || (((array[i]) != null) && (array[i].equals(confirmedArray[j])))) {
                    matched[j] = true;
                    match = true;
                    break;
                } 
            }
            if (!match) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4669,((("element " + i) + " in returned array should be found ") + "in the confirmed collection\'s array"));
            } 
        }
        for (final boolean element : matched) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4670,("Collection should return all its elements in " + "toArray"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4671,element);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray()}.
     */
public void testCollectionToArray_literalMutation1281() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray_literalMutation1281");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,getCollection().toArray().length);
        resetFull();
        final Object[] array = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4661,array.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,getCollection(),4662,getCollection().size());
        final Object[] confirmedArray = getConfirmed().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4664,("length of array from confirmed collection should " + "match the length of the collection\'s array"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4665,confirmedArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4666,array.length);
        final boolean[] matched = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4668,getCollection(),4667,getCollection().contains(array[i]));
            boolean match = false;
            for (int j = -1 ; j < (array.length) ; j++) {
                if (matched[j]) {
                    continue;
                } 
                if (((array[i]) == (confirmedArray[j])) || (((array[i]) != null) && (array[i].equals(confirmedArray[j])))) {
                    matched[j] = true;
                    match = true;
                    break;
                } 
            }
            if (!match) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4669,((("element " + i) + " in returned array should be found ") + "in the confirmed collection\'s array"));
            } 
        }
        for (final boolean element : matched) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4670,("Collection should return all its elements in " + "toArray"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4671,element);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray()}.
     */
public void testCollectionToArray_literalMutation1283() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray_literalMutation1283");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,getCollection().toArray().length);
        resetFull();
        final Object[] array = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4661,array.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,getCollection(),4662,getCollection().size());
        final Object[] confirmedArray = getConfirmed().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4664,("length of array from confirmed collection should " + "match the length of the collection\'s array"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4665,confirmedArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4666,array.length);
        final boolean[] matched = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4668,getCollection(),4667,getCollection().contains(array[i]));
            boolean match = false;
            for (int j = 0 ; j < (array.length) ; j++) {
                if (matched[j]) {
                    continue;
                } 
                if (((array[i]) == (confirmedArray[j])) || (((array[i]) != null) && (array[i].equals(confirmedArray[j])))) {
                    matched[j] = false;
                    match = true;
                    break;
                } 
            }
            if (!match) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4669,((("element " + i) + " in returned array should be found ") + "in the confirmed collection\'s array"));
            } 
        }
        for (final boolean element : matched) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4670,("Collection should return all its elements in " + "toArray"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4671,element);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray()}.
     */
public void testCollectionToArray_literalMutation1284() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray_literalMutation1284");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,getCollection().toArray().length);
        resetFull();
        final Object[] array = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4661,array.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,getCollection(),4662,getCollection().size());
        final Object[] confirmedArray = getConfirmed().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4664,("length of array from confirmed collection should " + "match the length of the collection\'s array"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4665,confirmedArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4666,array.length);
        final boolean[] matched = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4668,getCollection(),4667,getCollection().contains(array[i]));
            boolean match = false;
            for (int j = 0 ; j < (array.length) ; j++) {
                if (matched[j]) {
                    continue;
                } 
                if (((array[i]) == (confirmedArray[j])) || (((array[i]) != null) && (array[i].equals(confirmedArray[j])))) {
                    matched[j] = true;
                    match = false;
                    break;
                } 
            }
            if (!match) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4669,((("element " + i) + " in returned array should be found ") + "in the confirmed collection\'s array"));
            } 
        }
        for (final boolean element : matched) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4670,("Collection should return all its elements in " + "toArray"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4671,element);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray()}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray_remove1055() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray_remove1055");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,getCollection().toArray().length);
        resetFull();
        final Object[] array = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4661,array.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,getCollection(),4662,getCollection().size());
        final Object[] confirmedArray = getConfirmed().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4664,("length of array from confirmed collection should " + "match the length of the collection\'s array"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4665,confirmedArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4666,array.length);
        final boolean[] matched = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4668,getCollection(),4667,getCollection().contains(array[i]));
            boolean match = false;
            for (int j = 0 ; j < (array.length) ; j++) {
                if (matched[j]) {
                    continue;
                } 
                if (((array[i]) == (confirmedArray[j])) || (((array[i]) != null) && (array[i].equals(confirmedArray[j])))) {
                    matched[j] = true;
                    match = true;
                    break;
                } 
            }
            if (!match) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4669,((("element " + i) + " in returned array should be found ") + "in the confirmed collection\'s array"));
            } 
        }
        for (final boolean element : matched) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4670,("Collection should return all its elements in " + "toArray"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4671,element);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray()}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray_remove1056() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray_remove1056");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,getCollection().toArray().length);
        final Object[] array = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4661,array.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,getCollection(),4662,getCollection().size());
        final Object[] confirmedArray = getConfirmed().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4664,("length of array from confirmed collection should " + "match the length of the collection\'s array"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4665,confirmedArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4666,array.length);
        final boolean[] matched = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4668,getCollection(),4667,getCollection().contains(array[i]));
            boolean match = false;
            for (int j = 0 ; j < (array.length) ; j++) {
                if (matched[j]) {
                    continue;
                } 
                if (((array[i]) == (confirmedArray[j])) || (((array[i]) != null) && (array[i].equals(confirmedArray[j])))) {
                    matched[j] = true;
                    match = true;
                    break;
                } 
            }
            if (!match) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4669,((("element " + i) + " in returned array should be found ") + "in the confirmed collection\'s array"));
            } 
        }
        for (final boolean element : matched) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4670,("Collection should return all its elements in " + "toArray"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4671,element);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
public void testCollectionToArray2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray2_add1416() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_add1416");
        resetEmpty();
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray2_add1417() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_add1417");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        verify();
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray2_add1418() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_add1418");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        resetFull();
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray2_add1419() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_add1419");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray2_add1420() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_add1420");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray2_add1421() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_add1421");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray2_add1422() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_add1422");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
public void testCollectionToArray2_literalMutation1287() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_literalMutation1287");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[-1]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
public void testCollectionToArray2_literalMutation1289() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_literalMutation1289");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[1]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
public void testCollectionToArray2_literalMutation1292() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_literalMutation1292");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 0) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
public void testCollectionToArray2_literalMutation1293() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_literalMutation1293");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, -1)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray2_remove1057() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_remove1057");
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray2_remove1058() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_remove1058");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray2_remove1059() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_remove1059");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray2_remove1060() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_remove1060");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray2_remove1061() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_remove1061");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray2_remove1062() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_remove1062");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        verify();
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray(Object[])}.
     */
@Test(timeout = 1000)
    public void testCollectionToArray2_remove1063() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray2_remove1063");
        resetEmpty();
        Object[] a = new Object[]{ new Object() , null , null };
        Object[] array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4646,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,a[0]);
        resetFull();
        try {
            array = getCollection().toArray(new java.lang.Void[0]);
        } catch (final ArrayStoreException e) {
        }
        verify();
        try {
            array = getCollection().toArray(null);
        } catch (final NullPointerException e) {
        }
        verify();
        array = getCollection().toArray(new Object[0]);
        a = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 1) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,a,4652,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,array,4654,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,null,4656,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4659,null,4658,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>toString</code> on a collection.
     */
@Test(timeout = 1000)
    public void testCollectionToString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToString");
        resetEmpty();
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4672,((getCollection().toString()) != null));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4673,((getCollection().toString()) != null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>toString</code> on a collection.
     */
@Test(timeout = 1000)
    public void testCollectionToString_add1424() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToString_add1424");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4672,((getCollection().toString()) != null));
        resetFull();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4673,((getCollection().toString()) != null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>toString</code> on a collection.
     */
@Test(timeout = 1000)
    public void testCollectionToString_remove1064() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToString_remove1064");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4672,((getCollection().toString()) != null));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4673,((getCollection().toString()) != null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>toString</code> on a collection.
     */
@Test(timeout = 1000)
    public void testCollectionToString_remove1065() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToString_remove1065");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4672,((getCollection().toString()) != null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4673,((getCollection().toString()) != null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1442() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1442");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1443() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1443");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        verify();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1444() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1444");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().remove(null);
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1445() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1445");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1446() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1446");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1447() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1447");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1448() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1448");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1449() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1449");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1450() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1450");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1451() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1451");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1452() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1452");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_add1453() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_add1453");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_remove1078() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_remove1078");
        if (isRemoveSupported()) {
            return ;
        } 
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_remove1079() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_remove1079");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_remove1080() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_remove1080");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_remove1081() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_remove1081");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_remove1082() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_remove1082");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_remove1083() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_remove1083");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedRemove_remove1084() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove_remove1084");
        if (isRemoveSupported()) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().clear();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            getCollection().remove(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().removeAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        try {
            getCollection().retainAll(null);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        resetFull();
        try {
            final Iterator<E> iterator = getCollection().iterator();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1342() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1342");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1343() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1343");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1344() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1344");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1345() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1345");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1346() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1346");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1347() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1347");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1348() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1348");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1349() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1349");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1350() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1350");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1351() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1351");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1352() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1352");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1353() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1353");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1354() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1354");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1355() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1355");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1356() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1356");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1357() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1357");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1358() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1358");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1359() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1359");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1360() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1360");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1361() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1361");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1362() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1362");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_add1363() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_add1363");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
public void testCollectionIteratorFailFast() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[-1];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
public void testCollectionIteratorFailFast_literalMutation1257() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_literalMutation1257");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[-1]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
public void testCollectionIteratorFailFast_literalMutation1258() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_literalMutation1258");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(1, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
public void testCollectionIteratorFailFast_literalMutation1259() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_literalMutation1259");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 4);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
public void testCollectionIteratorFailFast_literalMutation1260() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_literalMutation1260");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(3, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
public void testCollectionIteratorFailFast_literalMutation1261() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_literalMutation1261");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 4);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_remove1005() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_remove1005");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_remove1006() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_remove1006");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_remove1007() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_remove1007");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_remove1008() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_remove1008");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_remove1009() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_remove1009");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_remove1010() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_remove1010");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_remove1011() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_remove1011");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the collection's iterator is fail-fast.
     */
@Test(timeout = 1000)
    public void testCollectionIteratorFailFast_remove1012() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIteratorFailFast_remove1012");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (isAddSupported()) {
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                final E o = getOtherElements()[0];
                getCollection().add(o);
                getConfirmed().add(o);
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
            resetFull();
            try {
                final Iterator<E> iter = getCollection().iterator();
                getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
                getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
                iter.next();
            } catch (final ConcurrentModificationException e) {
            }
            verify();
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().clear();
            iter.next();
        } catch (final ConcurrentModificationException e) {
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            getCollection().remove(getFullElements()[0]);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().removeAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        resetFull();
        try {
            final Iterator<E> iter = getCollection().iterator();
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 5);
            getCollection().retainAll(sublist);
            iter.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public void testSerializeDeserializeThenCompare() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare");
        Object obj = makeObject();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4675,dest);
            } 
        } 
        obj = makeFullCollection();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4676,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,dest);
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeDeserializeThenCompare_add1425() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare_add1425");
        Object obj = makeObject();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4675,dest);
            } 
        } 
        obj = makeFullCollection();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4676,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,dest);
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeDeserializeThenCompare_add1426() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare_add1426");
        Object obj = makeObject();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4675,dest);
            } 
        } 
        obj = makeFullCollection();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4676,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,dest);
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeDeserializeThenCompare_add1427() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare_add1427");
        Object obj = makeObject();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4675,dest);
            } 
        } 
        obj = makeFullCollection();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4676,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,dest);
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeDeserializeThenCompare_add1428() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare_add1428");
        Object obj = makeObject();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4675,dest);
            } 
        } 
        obj = makeFullCollection();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4676,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,dest);
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeDeserializeThenCompare_add1429() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare_add1429");
        Object obj = makeObject();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4675,dest);
            } 
        } 
        obj = makeFullCollection();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4676,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,dest);
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeDeserializeThenCompare_add1430() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare_add1430");
        Object obj = makeObject();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4675,dest);
            } 
        } 
        obj = makeFullCollection();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4676,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,dest);
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeDeserializeThenCompare_remove1066() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare_remove1066");
        Object obj = makeObject();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4675,dest);
            } 
        } 
        obj = makeFullCollection();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4676,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,dest);
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeDeserializeThenCompare_remove1067() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare_remove1067");
        Object obj = makeObject();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4675,dest);
            } 
        } 
        obj = makeFullCollection();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4676,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,dest);
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeDeserializeThenCompare_remove1068() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare_remove1068");
        Object obj = makeObject();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4675,dest);
            } 
        } 
        obj = makeFullCollection();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4676,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,dest);
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeDeserializeThenCompare_remove1069() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare_remove1069");
        Object obj = makeObject();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4675,dest);
            } 
        } 
        obj = makeFullCollection();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4676,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,dest);
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeDeserializeThenCompare_remove1070() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare_remove1070");
        Object obj = makeObject();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4675,dest);
            } 
        } 
        obj = makeFullCollection();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4676,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,dest);
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeDeserializeThenCompare_remove1071() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare_remove1071");
        Object obj = makeObject();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4675,dest);
            } 
        } 
        obj = makeFullCollection();
        if ((obj instanceof java.io.Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4676,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,dest);
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public Collection<E> getCollection() {
        return collection;
    }

    /** 
     * Set the collection.
     * 
     * @param collection the Collection<E> to set
     */
public void setCollection(final Collection<E> collection) {
        this.collection = collection;
    }

    public Collection<E> getConfirmed() {
        return confirmed;
    }

    /** 
     * Set the confirmed.
     * 
     * @param confirmed the Collection<E> to set
     */
public void setConfirmed(final Collection<E> confirmed) {
        this.confirmed = confirmed;
    }

    /** 
     * Handle the optional exceptions declared by {@link Collection#contains(Object)}
     * 
     * @param coll
     * @param element
     */
protected static void assertNotCollectionContains(final Collection<?> coll, final Object element) {
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4537,coll,4536,coll.contains(element));
        } catch (final ClassCastException e) {
        } catch (final NullPointerException e) {
        }
    }

    /** 
     * Handle the optional exceptions declared by {@link Collection#containsAll(Collection)}
     * 
     * @param coll
     * @param sub
     */
protected static void assertNotCollectionContainsAll(final Collection<?> coll, final Collection<?> sub) {
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4539,coll,4538,coll.containsAll(sub));
        } catch (final ClassCastException cce) {
        } catch (final NullPointerException e) {
        }
    }

    /** 
     * Handle optional exceptions of {@link Collection#remove(Object)}
     * 
     * @param coll
     * @param element
     */
protected static void assertNotRemoveFromCollection(final Collection<?> coll, final Object element) {
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4543,coll,4542,coll.remove(element));
        } catch (final ClassCastException cce) {
        } catch (final NullPointerException e) {
        }
    }

    /** 
     * Handle optional exceptions of {@link Collection#removeAll(Collection)}
     * 
     * @param coll
     * @param sub
     */
protected static void assertNotRemoveAllFromCollection(final Collection<?> coll, final Collection<?> sub) {
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4541,coll,4540,coll.removeAll(sub));
        } catch (final ClassCastException cce) {
        } catch (final NullPointerException e) {
        }
    }
}

