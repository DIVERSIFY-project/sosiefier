package org.apache.commons.collections4;

import org.apache.commons.collections4.list.AbstractListTest;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/** 
 * Tests base {@link java.util.LinkedList} methods and contracts.
 * <p/>
 * To use, simply extend this class, and implement
 * the {@link #makeObject()} method.
 * <p/>
 * If your {@link LinkedList} fails one of these tests by design,
 * you may still use this base set of cases.  Simply override the
 * test case (method) your {@link List} fails.
 * 
 * @version $Id$
 */
public abstract class AbstractLinkedListTest<T> extends AbstractListTest<T> {
    public AbstractLinkedListTest(final String testName) {
        super(testName);
    }

    @Override
    public abstract LinkedList<T> makeObject();

    /** 
     * Returns the {@link #collection} field cast to a {@link LinkedList}.
     * 
     * @return the collection field as a List
     */
@Override
    public LinkedList<T> getCollection() {
        return ((LinkedList<T>)(super.getCollection()));
    }

    /** 
     * Returns the {@link #confirmed} field cast to a {@link LinkedList}.
     * 
     * @return the confirmed field as a List
     */
protected LinkedList<T> getConfirmedLinkedList() {
        return ((LinkedList<T>)(getConfirmed()));
    }

    /** 
     * Tests {@link LinkedList#addFirst(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    public void testLinkedListAddFirst() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addFirst(o);
        getConfirmedLinkedList().addFirst(o);
        verify();
        resetFull();
        getCollection().addFirst(o);
        getConfirmedLinkedList().addFirst(o);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#addFirst(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    public void testLinkedListAddFirst_literalMutation1944() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_literalMutation1944");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("foo"));
        resetEmpty();
        getCollection().addFirst(o);
        getConfirmedLinkedList().addFirst(o);
        verify();
        resetFull();
        getCollection().addFirst(o);
        getConfirmedLinkedList().addFirst(o);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#addLast(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    public void testLinkedListAddLast() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addLast(o);
        getConfirmedLinkedList().addLast(o);
        verify();
        resetFull();
        getCollection().addLast(o);
        getConfirmedLinkedList().addLast(o);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#addLast(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    public void testLinkedListAddLast_literalMutation1946() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_literalMutation1946");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("foo"));
        resetEmpty();
        getCollection().addLast(o);
        getConfirmedLinkedList().addLast(o);
        verify();
        resetFull();
        getCollection().addLast(o);
        getConfirmedLinkedList().addLast(o);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getFirst()}.
     */
public void testLinkedListGetFirst() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetFirst");
        resetEmpty();
        try {
            getCollection().getFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6407,("getFirst() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object first = getCollection().getFirst();
        final Object confirmedFirst = getConfirmedLinkedList().getFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6408,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6409,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getLast()}.
     */
public void testLinkedListGetLast() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetLast");
        resetEmpty();
        try {
            getCollection().getLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6410,("getLast() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object last = getCollection().getLast();
        final Object confirmedLast = getConfirmedLinkedList().getLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6411,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6412,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeFirst()}.
     */
public void testLinkedListRemoveFirst() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveFirst");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6413,("removeFirst() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object first = getCollection().removeFirst();
        final Object confirmedFirst = getConfirmedLinkedList().removeFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6414,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6415,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeLast()}.
     */
public void testLinkedListRemoveLast() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveLast");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6416,("removeLast() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object last = getCollection().removeLast();
        final Object confirmedLast = getConfirmedLinkedList().removeLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6417,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6418,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Returns an empty {@link LinkedList}.
     */
@Override
    public Collection<T> makeConfirmedCollection() {
        return new LinkedList<T>();
    }

    /** 
     * Returns a full {@link LinkedList}.
     */
@Override
    public Collection<T> makeConfirmedFullCollection() {
        final List<T> list = new LinkedList<T>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return list;
    }
}

