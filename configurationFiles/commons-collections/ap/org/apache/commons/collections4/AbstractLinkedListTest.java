package org.apache.commons.collections4;

import org.apache.commons.collections4.list.AbstractListTest;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.Test;

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
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_add2003() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_add2003");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
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
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_add2004() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_add2004");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addFirst(o);
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
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_add2005() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_add2005");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addFirst(o);
        getConfirmedLinkedList().addFirst(o);
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
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_add2006() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_add2006");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addFirst(o);
        getConfirmedLinkedList().addFirst(o);
        verify();
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
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_add2007() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_add2007");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addFirst(o);
        getConfirmedLinkedList().addFirst(o);
        verify();
        resetFull();
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
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_add2008() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_add2008");
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
        getCollection().addFirst(o);
        getConfirmedLinkedList().addFirst(o);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#addFirst(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_add2009() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_add2009");
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
        getConfirmedLinkedList().addFirst(o);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#addFirst(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_add2010() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_add2010");
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
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
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
     * Tests {@link LinkedList#addFirst(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_remove1561() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_remove1561");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
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
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_remove1562() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_remove1562");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
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
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_remove1563() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_remove1563");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
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
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_remove1564() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_remove1564");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addFirst(o);
        getConfirmedLinkedList().addFirst(o);
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
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_remove1565() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_remove1565");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addFirst(o);
        getConfirmedLinkedList().addFirst(o);
        verify();
        getCollection().addFirst(o);
        getConfirmedLinkedList().addFirst(o);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#addFirst(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_remove1566() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_remove1566");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
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
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_remove1567() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_remove1567");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
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
    @Test(timeout = 1000)
    public void testLinkedListAddFirst_remove1568() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddFirst_remove1568");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addFirst(o);
        getConfirmedLinkedList().addFirst(o);
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
    @Test(timeout = 1000)
    public void testLinkedListAddLast_add2011() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_add2011");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
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
    @Test(timeout = 1000)
    public void testLinkedListAddLast_add2012() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_add2012");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addLast(o);
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
    @Test(timeout = 1000)
    public void testLinkedListAddLast_add2013() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_add2013");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addLast(o);
        getConfirmedLinkedList().addLast(o);
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
    @Test(timeout = 1000)
    public void testLinkedListAddLast_add2014() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_add2014");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addLast(o);
        getConfirmedLinkedList().addLast(o);
        verify();
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
    @Test(timeout = 1000)
    public void testLinkedListAddLast_add2015() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_add2015");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addLast(o);
        getConfirmedLinkedList().addLast(o);
        verify();
        resetFull();
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
    @Test(timeout = 1000)
    public void testLinkedListAddLast_add2016() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_add2016");
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
        getCollection().addLast(o);
        getConfirmedLinkedList().addLast(o);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#addLast(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLinkedListAddLast_add2017() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_add2017");
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
        getConfirmedLinkedList().addLast(o);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#addLast(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLinkedListAddLast_add2018() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_add2018");
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
     * Tests {@link LinkedList#addLast(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLinkedListAddLast_remove1569() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_remove1569");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
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
    @Test(timeout = 1000)
    public void testLinkedListAddLast_remove1570() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_remove1570");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
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
    @Test(timeout = 1000)
    public void testLinkedListAddLast_remove1571() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_remove1571");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
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
    @Test(timeout = 1000)
    public void testLinkedListAddLast_remove1572() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_remove1572");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addLast(o);
        getConfirmedLinkedList().addLast(o);
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
    @Test(timeout = 1000)
    public void testLinkedListAddLast_remove1573() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_remove1573");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addLast(o);
        getConfirmedLinkedList().addLast(o);
        verify();
        getCollection().addLast(o);
        getConfirmedLinkedList().addLast(o);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#addLast(Object)}.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testLinkedListAddLast_remove1574() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_remove1574");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
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
    @Test(timeout = 1000)
    public void testLinkedListAddLast_remove1575() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_remove1575");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
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
    @Test(timeout = 1000)
    public void testLinkedListAddLast_remove1576() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListAddLast_remove1576");
        if (!(isAddSupported())) {
            return ;
        } 
        final T o = ((T)("hello"));
        resetEmpty();
        getCollection().addLast(o);
        getConfirmedLinkedList().addLast(o);
        resetFull();
        getCollection().addLast(o);
        getConfirmedLinkedList().addLast(o);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetFirst() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetFirst");
        resetEmpty();
        resetEmpty();
        try {
            getCollection().getFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6368,("getFirst() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object first = getCollection().getFirst();
        final Object confirmedFirst = getConfirmedLinkedList().getFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetFirst_add2020() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetFirst_add2020");
        resetEmpty();
        try {
            getCollection().getFirst();
            getCollection().getFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6368,("getFirst() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object first = getCollection().getFirst();
        final Object confirmedFirst = getConfirmedLinkedList().getFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetFirst_add2021() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetFirst_add2021");
        resetEmpty();
        try {
            getCollection().getFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6368,("getFirst() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        verify();
        resetFull();
        final Object first = getCollection().getFirst();
        final Object confirmedFirst = getConfirmedLinkedList().getFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetFirst_add2022() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetFirst_add2022");
        resetEmpty();
        try {
            getCollection().getFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6368,("getFirst() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        resetFull();
        final Object first = getCollection().getFirst();
        final Object confirmedFirst = getConfirmedLinkedList().getFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetFirst_add2023() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetFirst_add2023");
        resetEmpty();
        try {
            getCollection().getFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6368,("getFirst() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object first = getCollection().getFirst();
        final Object confirmedFirst = getConfirmedLinkedList().getFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,first);
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetFirst_remove1577() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetFirst_remove1577");
        try {
            getCollection().getFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6368,("getFirst() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object first = getCollection().getFirst();
        final Object confirmedFirst = getConfirmedLinkedList().getFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetFirst_remove1578() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetFirst_remove1578");
        resetEmpty();
        try {
            getCollection().getFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6368,("getFirst() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        final Object first = getCollection().getFirst();
        final Object confirmedFirst = getConfirmedLinkedList().getFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetFirst_remove1579() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetFirst_remove1579");
        resetEmpty();
        try {
            getCollection().getFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6368,("getFirst() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        final Object first = getCollection().getFirst();
        final Object confirmedFirst = getConfirmedLinkedList().getFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetFirst_remove1580() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetFirst_remove1580");
        resetEmpty();
        try {
            getCollection().getFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6368,("getFirst() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        final Object first = getCollection().getFirst();
        final Object confirmedFirst = getConfirmedLinkedList().getFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6369,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6370,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetLast() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetLast");
        resetEmpty();
        resetEmpty();
        try {
            getCollection().getLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6371,("getLast() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object last = getCollection().getLast();
        final Object confirmedLast = getConfirmedLinkedList().getLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6373,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetLast_add2025() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetLast_add2025");
        resetEmpty();
        try {
            getCollection().getLast();
            getCollection().getLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6371,("getLast() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object last = getCollection().getLast();
        final Object confirmedLast = getConfirmedLinkedList().getLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6373,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetLast_add2026() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetLast_add2026");
        resetEmpty();
        try {
            getCollection().getLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6371,("getLast() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        verify();
        resetFull();
        final Object last = getCollection().getLast();
        final Object confirmedLast = getConfirmedLinkedList().getLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6373,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetLast_add2027() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetLast_add2027");
        resetEmpty();
        try {
            getCollection().getLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6371,("getLast() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        resetFull();
        final Object last = getCollection().getLast();
        final Object confirmedLast = getConfirmedLinkedList().getLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6373,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetLast_add2028() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetLast_add2028");
        resetEmpty();
        try {
            getCollection().getLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6371,("getLast() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object last = getCollection().getLast();
        final Object confirmedLast = getConfirmedLinkedList().getLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6373,last);
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetLast_remove1581() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetLast_remove1581");
        try {
            getCollection().getLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6371,("getLast() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object last = getCollection().getLast();
        final Object confirmedLast = getConfirmedLinkedList().getLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6373,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetLast_remove1582() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetLast_remove1582");
        resetEmpty();
        try {
            getCollection().getLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6371,("getLast() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        final Object last = getCollection().getLast();
        final Object confirmedLast = getConfirmedLinkedList().getLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6373,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetLast_remove1583() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetLast_remove1583");
        resetEmpty();
        try {
            getCollection().getLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6371,("getLast() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        final Object last = getCollection().getLast();
        final Object confirmedLast = getConfirmedLinkedList().getLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6373,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#getLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListGetLast_remove1584() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListGetLast_remove1584");
        resetEmpty();
        try {
            getCollection().getLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6371,("getLast() should throw a NoSuchElementException for an " + "empty list."));
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        final Object last = getCollection().getLast();
        final Object confirmedLast = getConfirmedLinkedList().getLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6372,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6373,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveFirst() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveFirst");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        resetEmpty();
        try {
            getCollection().removeFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,("removeFirst() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object first = getCollection().removeFirst();
        final Object confirmedFirst = getConfirmedLinkedList().removeFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6376,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveFirst_add2030() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveFirst_add2030");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeFirst();
            getCollection().removeFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,("removeFirst() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object first = getCollection().removeFirst();
        final Object confirmedFirst = getConfirmedLinkedList().removeFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6376,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveFirst_add2031() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveFirst_add2031");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,("removeFirst() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        verify();
        resetFull();
        final Object first = getCollection().removeFirst();
        final Object confirmedFirst = getConfirmedLinkedList().removeFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6376,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveFirst_add2032() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveFirst_add2032");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,("removeFirst() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        resetFull();
        final Object first = getCollection().removeFirst();
        final Object confirmedFirst = getConfirmedLinkedList().removeFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6376,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveFirst_add2033() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveFirst_add2033");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,("removeFirst() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object first = getCollection().removeFirst();
        final Object confirmedFirst = getConfirmedLinkedList().removeFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6376,first);
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveFirst_remove1585() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveFirst_remove1585");
        if (!(isRemoveSupported())) {
            return ;
        } 
        try {
            getCollection().removeFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,("removeFirst() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object first = getCollection().removeFirst();
        final Object confirmedFirst = getConfirmedLinkedList().removeFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6376,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveFirst_remove1586() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveFirst_remove1586");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,("removeFirst() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        final Object first = getCollection().removeFirst();
        final Object confirmedFirst = getConfirmedLinkedList().removeFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6376,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveFirst_remove1587() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveFirst_remove1587");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,("removeFirst() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        final Object first = getCollection().removeFirst();
        final Object confirmedFirst = getConfirmedLinkedList().removeFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6376,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeFirst()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveFirst_remove1588() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveFirst_remove1588");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeFirst();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6374,("removeFirst() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        final Object first = getCollection().removeFirst();
        final Object confirmedFirst = getConfirmedLinkedList().removeFirst();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6375,confirmedFirst);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6376,first);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveLast() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveLast");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        resetEmpty();
        try {
            getCollection().removeLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,("removeLast() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object last = getCollection().removeLast();
        final Object confirmedLast = getConfirmedLinkedList().removeLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6378,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveLast_add2035() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveLast_add2035");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeLast();
            getCollection().removeLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,("removeLast() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object last = getCollection().removeLast();
        final Object confirmedLast = getConfirmedLinkedList().removeLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6378,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveLast_add2036() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveLast_add2036");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,("removeLast() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        verify();
        resetFull();
        final Object last = getCollection().removeLast();
        final Object confirmedLast = getConfirmedLinkedList().removeLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6378,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveLast_add2037() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveLast_add2037");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,("removeLast() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        resetFull();
        final Object last = getCollection().removeLast();
        final Object confirmedLast = getConfirmedLinkedList().removeLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6378,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveLast_add2038() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveLast_add2038");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,("removeLast() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object last = getCollection().removeLast();
        final Object confirmedLast = getConfirmedLinkedList().removeLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6378,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,last);
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveLast_remove1589() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveLast_remove1589");
        if (!(isRemoveSupported())) {
            return ;
        } 
        try {
            getCollection().removeLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,("removeLast() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        resetFull();
        final Object last = getCollection().removeLast();
        final Object confirmedLast = getConfirmedLinkedList().removeLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6378,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveLast_remove1590() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveLast_remove1590");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,("removeLast() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        final Object last = getCollection().removeLast();
        final Object confirmedLast = getConfirmedLinkedList().removeLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6378,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveLast_remove1591() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveLast_remove1591");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,("removeLast() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        verify();
        final Object last = getCollection().removeLast();
        final Object confirmedLast = getConfirmedLinkedList().removeLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6378,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,last);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link LinkedList#removeLast()}.
     */
@Test(timeout = 1000)
    public void testLinkedListRemoveLast_remove1592() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLinkedListRemoveLast_remove1592");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().removeLast();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6377,("removeLast() should throw a NoSuchElementException for " + "an empty list."));
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        final Object last = getCollection().removeLast();
        final Object confirmedLast = getConfirmedLinkedList().removeLast();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6378,confirmedLast);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6379,last);
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

