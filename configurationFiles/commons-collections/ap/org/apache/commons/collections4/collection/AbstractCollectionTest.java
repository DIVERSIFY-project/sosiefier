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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4670,confirmedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4672,getCollection(),4671,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4674,getConfirmed(),4673,getConfirmed().isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4676,getCollection(),4675,getCollection().isEmpty());
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
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4677,(((((("Collection should not contain a value that the " + "confirmed collection does not have: ") + o) + "\nTest: ") + (getCollection())) + "\nReal: ") + (getConfirmed())));
            } 
        }
        for (int i = 0 ; i < confirmedSize ; i++) {
            if (!(matched[i])) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4678,(((("Collection should contain all values that are in the confirmed collection" + "\nTest: ") + (getCollection())) + "\nReal: ") + (getConfirmed())));
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
     * Tests {@link Collection#addAll(Collection)}.
     */
public void testCollectionAddAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionAddAll");
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
            getCollection().add(getFullNonNullElements()[-1]);
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
public void testCollectionClear() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionClear");
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
        for (int i = 1 ; i < (elements.length) ; i++) {
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
        for (int i = -1 ; i < (elements.length) ; i++) {
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
        final int min = (getFullElements().length) < 2 ? 1 : 2;
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
        final int min = (getFullElements().length) < 2 ? 0 : 1;
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
        final int max = (getFullElements().length) == 0 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
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
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 6;
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
public void testCollectionIsEmpty() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionIsEmpty");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4588,getCollection(),4587,getCollection().isEmpty());
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4590,getCollection(),4589,getCollection().isEmpty());
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
        final int min = (getFullElements().length) < 1 ? 0 : 2;
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
        final int min = (getFullElements().length) < 2 ? 1 : 2;
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
        final int max = (getFullElements().length) == 2 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
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
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 6 ? (getFullElements().length) - 1 : 5;
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
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 0 : 5;
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
        final int max = (getFullElements().length) == 1 ? 1 : (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 4;
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
public void testCollectionRetainAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionRetainAll");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> elements = java.util.Arrays.asList(getFullElements());
        final List<E> other = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4617,getCollection(),4616,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,getCollection(),4618,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4620,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,getCollection(),4622,getCollection().size());
        if ((getFullElements().length) > 2) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,elements.subList(min, max),4626,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4630,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4617,getCollection(),4616,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,getCollection(),4618,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4620,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,getCollection(),4622,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 3 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,elements.subList(min, max),4626,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4630,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4617,getCollection(),4616,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,getCollection(),4618,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4620,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,getCollection(),4622,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 1 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,elements.subList(min, max),4626,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4630,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4617,getCollection(),4616,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,getCollection(),4618,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4620,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,getCollection(),4622,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 3;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,elements.subList(min, max),4626,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4630,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4617,getCollection(),4616,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,getCollection(),4618,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4620,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,getCollection(),4622,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 4 ? (getFullElements().length) - 1 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,elements.subList(min, max),4626,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4630,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4617,getCollection(),4616,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,getCollection(),4618,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4620,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,getCollection(),4622,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 0 : 5;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,elements.subList(min, max),4626,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4630,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4614,!(getCollection().retainAll(java.util.Collections.EMPTY_SET)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4615,!(getCollection().retainAll(elements)));
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4617,getCollection(),4616,getCollection().retainAll(java.util.Collections.EMPTY_SET));
        getConfirmed().retainAll(java.util.Collections.EMPTY_SET);
        verify();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4619,getCollection(),4618,getCollection().retainAll(other));
        getConfirmed().retainAll(other);
        verify();
        resetFull();
        int size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4620,!(getCollection().retainAll(elements)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4621,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4623,getCollection(),4622,getCollection().size());
        if ((getFullElements().length) > 1) {
            resetFull();
            size = getCollection().size();
            final int min = (getFullElements().length) < 2 ? 0 : 2;
            final int max = (getFullElements().length) <= 5 ? (getFullElements().length) - 1 : 6;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4625,getCollection(),4624,getCollection().retainAll(elements.subList(min, max)));
            getConfirmed().retainAll(elements.subList(min, max));
            verify();
            for (E element : getCollection()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4627,elements.subList(min, max),4626,elements.subList(min, max).contains(element));
            }
        } 
        resetFull();
        final HashSet<E> set = new HashSet<E>(elements);
        size = getCollection().size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4628,("Collection shouldn\'t change from retainAll without " + "duplicate elements"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4629,!(getCollection().retainAll(set)));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4630,("Collection size didn\'t change from nonduplicate " + "retainAll"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4631,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4633,getCollection(),4632,getCollection().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#size()}.
     */
public void testCollectionSize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionSize");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4635,getCollection(),4634,getCollection().size());
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4636,((getCollection().size()) > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray()}.
     */
public void testCollectionToArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4652,getCollection().toArray().length);
        resetFull();
        final Object[] array = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,array.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,getCollection(),4654,getCollection().size());
        final Object[] confirmedArray = getConfirmed().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4656,("length of array from confirmed collection should " + "match the length of the collection\'s array"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,confirmedArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4658,array.length);
        final boolean[] matched = new boolean[array.length];
        for (int i = 1 ; i < (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,getCollection(),4659,getCollection().contains(array[i]));
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
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4661,((("element " + i) + " in returned array should be found ") + "in the confirmed collection\'s array"));
            } 
        }
        for (final boolean element : matched) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4662,("Collection should return all its elements in " + "toArray"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,element);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray()}.
     */
public void testCollectionToArray_literalMutation1280() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray_literalMutation1280");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4652,getCollection().toArray().length);
        resetFull();
        final Object[] array = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,array.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,getCollection(),4654,getCollection().size());
        final Object[] confirmedArray = getConfirmed().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4656,("length of array from confirmed collection should " + "match the length of the collection\'s array"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,confirmedArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4658,array.length);
        final boolean[] matched = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,getCollection(),4659,getCollection().contains(array[i]));
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
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4661,((("element " + i) + " in returned array should be found ") + "in the confirmed collection\'s array"));
            } 
        }
        for (final boolean element : matched) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4662,("Collection should return all its elements in " + "toArray"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,element);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray()}.
     */
public void testCollectionToArray_literalMutation1281() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray_literalMutation1281");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4652,getCollection().toArray().length);
        resetFull();
        final Object[] array = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,array.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,getCollection(),4654,getCollection().size());
        final Object[] confirmedArray = getConfirmed().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4656,("length of array from confirmed collection should " + "match the length of the collection\'s array"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,confirmedArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4658,array.length);
        final boolean[] matched = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,getCollection(),4659,getCollection().contains(array[i]));
            boolean match = false;
            for (int j = 1 ; j < (array.length) ; j++) {
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
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4661,((("element " + i) + " in returned array should be found ") + "in the confirmed collection\'s array"));
            } 
        }
        for (final boolean element : matched) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4662,("Collection should return all its elements in " + "toArray"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,element);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray()}.
     */
public void testCollectionToArray_literalMutation1283() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray_literalMutation1283");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4652,getCollection().toArray().length);
        resetFull();
        final Object[] array = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,array.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,getCollection(),4654,getCollection().size());
        final Object[] confirmedArray = getConfirmed().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4656,("length of array from confirmed collection should " + "match the length of the collection\'s array"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,confirmedArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4658,array.length);
        final boolean[] matched = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,getCollection(),4659,getCollection().contains(array[i]));
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
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4661,((("element " + i) + " in returned array should be found ") + "in the confirmed collection\'s array"));
            } 
        }
        for (final boolean element : matched) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4662,("Collection should return all its elements in " + "toArray"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,element);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Collection#toArray()}.
     */
public void testCollectionToArray_literalMutation1284() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToArray_literalMutation1284");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4652,getCollection().toArray().length);
        resetFull();
        final Object[] array = getCollection().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4653,array.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4655,getCollection(),4654,getCollection().size());
        final Object[] confirmedArray = getConfirmed().toArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4656,("length of array from confirmed collection should " + "match the length of the collection\'s array"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4657,confirmedArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4658,array.length);
        final boolean[] matched = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4660,getCollection(),4659,getCollection().contains(array[i]));
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
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4661,((("element " + i) + " in returned array should be found ") + "in the confirmed collection\'s array"));
            } 
        }
        for (final boolean element : matched) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4662,("Collection should return all its elements in " + "toArray"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4663,element);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,a[0]);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,null,4640,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4643,null,4642,java.util.Arrays.asList(a));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,a,4644,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,array,4646,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(getCollection().toArray()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,a[0]);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,null,4640,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4643,null,4642,java.util.Arrays.asList(a));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,a,4644,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,array,4646,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(getCollection().toArray()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,a[0]);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,null,4640,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4643,null,4642,java.util.Arrays.asList(a));
        final HashSet<java.lang.Class<?>> classes = new HashSet<java.lang.Class<?>>();
        for (final Object element : array) {
            classes.add((element == null ? null : element.getClass()));
        }
        if ((classes.size()) > 2) {
            return ;
        } 
        Class<?> cl = classes.iterator().next();
        if (Map.Entry.class.isAssignableFrom(cl)) {
            cl = Map.Entry.class;
        } 
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 0)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,a,4644,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,array,4646,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(getCollection().toArray()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4637,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4638,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4639,a[0]);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4641,null,4640,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4643,null,4642,java.util.Arrays.asList(a));
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
        a = ((Object[])(java.lang.reflect.Array.newInstance(cl, 1)));
        array = getCollection().toArray(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4645,a,4644,a.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4647,array,4646,array.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4649,null,4648,java.util.Arrays.asList(array));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4651,null,4650,java.util.Arrays.asList(getCollection().toArray()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests <code>toString</code> on a collection.
     */
public void testCollectionToString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionToString");
        resetEmpty();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4664,((getCollection().toString()) != null));
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4665,((getCollection().toString()) != null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If isRemoveSupported() returns false, tests to see that remove
     * operations raise an UnsupportedOperationException.
     */
public void testUnsupportedRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedRemove");
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
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(3, 5);
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
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(1, 5);
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
            final List<E> sublist = java.util.Arrays.asList(getFullElements()).subList(2, 6);
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
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4666,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4667,dest);
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
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4668,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4669,dest);
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

