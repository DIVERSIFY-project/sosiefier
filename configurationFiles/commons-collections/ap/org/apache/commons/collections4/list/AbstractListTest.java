package org.apache.commons.collections4.list;

import java.util.AbstractCollection;
import org.apache.commons.collections4.collection.AbstractCollectionTest;
import org.apache.commons.collections4.iterators.AbstractListIteratorTest;
import java.util.ArrayList;
import org.apache.commons.collections4.BulkTest;
import java.util.Collection;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;

/** 
 * Abstract test class for {@link java.util.List} methods and contracts.
 * <p/>
 * To use, simply extend this class, and implement
 * the {@link #makeObject} method.
 * <p/>
 * If your {@link List} fails one of these tests by design,
 * you may still use this base set of cases.  Simply override the
 * test case (method) your {@link List} fails or override one of the
 * protected methods from AbstractCollectionTest.
 * 
 * @version $Id$
 */
public abstract class AbstractListTest<E> extends AbstractCollectionTest<E> {
    /** 
     * JUnit constructor.
     * 
     * @param testName the test class name
     */
public AbstractListTest(final String testName) {
        super(testName);
    }

    /** 
     * Returns true if the collections produced by
     * {@link #makeObject()} and {@link #makeFullCollection()}
     * support the <code>set operation.<p>
     * Default implementation returns true.  Override if your collection
     * class does not support set.
     */
public boolean isSetSupported() {
        return true;
    }

    /** 
     * Verifies that the test list implementation matches the confirmed list
     * implementation.
     */
@Override
    @SuppressWarnings(value = "unchecked")
    public void verify() {
        super.verify();
        final List<E> list1 = getCollection();
        final List<E> list2 = getConfirmed();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2258,list1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2259,list2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,list2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2261,list1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2263,list1,2262,list1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2265,list2,2264,list2.hashCode());
        int i = 0;
        final Iterator<E> iterator1 = list1.iterator();
        final Iterator<E> iterator2 = list2.iterator();
        final E[] array = ((E[])(list1.toArray()));
        while (iterator2.hasNext()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2267,iterator1,2266,iterator1.hasNext());
            final Object o1 = iterator1.next();
            Object o2 = iterator2.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2268,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2269,o2);
            o2 = list1.get(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2270,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2271,o2);
            o2 = array[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2272,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2273,o2);
            i++;
        }
    }

    /** 
     * List equals method is defined.
     */
@Override
    public boolean isEqualsCheckable() {
        return true;
    }

    /** 
     * Returns an empty {@link ArrayList}.
     */
@Override
    public Collection<E> makeConfirmedCollection() {
        final ArrayList<E> list = new ArrayList<E>();
        return list;
    }

    /** 
     * Returns a full {@link ArrayList}.
     */
@Override
    public Collection<E> makeConfirmedFullCollection() {
        final ArrayList<E> list = new ArrayList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return list;
    }

    /** 
     * Returns {@link #makeObject()}.
     * 
     * @return an empty list to be used for testing
     */
@Override
    public abstract List<E> makeObject();

    /** 
     * {@inheritDoc}
     */
@Override
    public List<E> makeFullCollection() {
        final List<E> list = makeObject();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return list;
    }

    /** 
     * Returns the {@link #collection} field cast to a {@link List}.
     * 
     * @return the collection field as a List
     */
@Override
    public List<E> getCollection() {
        return ((List<E>)(super.getCollection()));
    }

    /** 
     * Returns the {@link #confirmed} field cast to a {@link List}.
     * 
     * @return the confirmed field as a List
     */
@Override
    public List<E> getConfirmed() {
        return ((List<E>)(super.getConfirmed()));
    }

    /** 
     * Tests bounds checking for {@link List#add(int, Object)} on an
     * empty list.
     */
public void testListAddByIndexBoundsChecking() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking");
        if (!(isAddSupported())) {
            return ;
        } 
        List<E> list;
        final E element = getOtherElements()[-1];
        try {
            list = makeObject();
            list.add(Integer.MIN_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeObject();
            list.add(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeObject();
            list.add(1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeObject();
            list.add(Integer.MAX_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#add(int, Object)} on an
     * empty list.
     */
public void testListAddByIndexBoundsChecking_literalMutation739() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking_literalMutation739");
        if (!(isAddSupported())) {
            return ;
        } 
        List<E> list;
        final E element = getOtherElements()[0];
        try {
            list = makeObject();
            list.add(Integer.MIN_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeObject();
            list.add(2, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeObject();
            list.add(1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeObject();
            list.add(Integer.MAX_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#add(int, Object)} on an
     * empty list.
     */
public void testListAddByIndexBoundsChecking_literalMutation740() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking_literalMutation740");
        if (!(isAddSupported())) {
            return ;
        } 
        List<E> list;
        final E element = getOtherElements()[0];
        try {
            list = makeObject();
            list.add(Integer.MIN_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeObject();
            list.add(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeObject();
            list.add(0, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeObject();
            list.add(Integer.MAX_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#add(int, Object)} on a
     * full list.
     */
public void testListAddByIndexBoundsChecking2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking2");
        if (!(isAddSupported())) {
            return ;
        } 
        List<E> list;
        final E element = getOtherElements()[-1];
        try {
            list = makeFullCollection();
            list.add(Integer.MIN_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeFullCollection();
            list.add(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeFullCollection();
            list.add(((list.size()) + 1), element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeFullCollection();
            list.add(Integer.MAX_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#add(int, Object)} on a
     * full list.
     */
public void testListAddByIndexBoundsChecking2_literalMutation742() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking2_literalMutation742");
        if (!(isAddSupported())) {
            return ;
        } 
        List<E> list;
        final E element = getOtherElements()[0];
        try {
            list = makeFullCollection();
            list.add(Integer.MIN_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeFullCollection();
            list.add(0, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeFullCollection();
            list.add(((list.size()) + 1), element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeFullCollection();
            list.add(Integer.MAX_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#add(int, Object)} on a
     * full list.
     */
public void testListAddByIndexBoundsChecking2_literalMutation743() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking2_literalMutation743");
        if (!(isAddSupported())) {
            return ;
        } 
        List<E> list;
        final E element = getOtherElements()[0];
        try {
            list = makeFullCollection();
            list.add(Integer.MIN_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeFullCollection();
            list.add(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeFullCollection();
            list.add(((list.size()) + 0), element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeFullCollection();
            list.add(Integer.MAX_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#add(int, Object)}.
     */
public void testListAddByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndex");
        if (!(isAddSupported())) {
            return ;
        } 
        final E element = getOtherElements()[-1];
        final int max = getFullElements().length;
        for (int i = 0 ; i <= max ; i++) {
            resetFull();
            getCollection().add(i, element);
            getConfirmed().add(i, element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#add(int, Object)}.
     */
public void testListAddByIndex_literalMutation737() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndex_literalMutation737");
        if (!(isAddSupported())) {
            return ;
        } 
        final E element = getOtherElements()[0];
        final int max = getFullElements().length;
        for (int i = 1 ; i <= max ; i++) {
            resetFull();
            getCollection().add(i, element);
            getConfirmed().add(i, element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#equals(Object)}.
     */
public void testListEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2114,list,2113,list.equals(list));
        verify();
        List<E> list2 = java.util.Arrays.asList(getFullElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,list,2115,list.equals(list2));
        verify();
        list2 = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,list,2117,list.equals(list2));
        verify();
        resetFull();
        list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2120,list,2119,list.equals(getConfirmed()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,list,2121,list.equals(list));
        verify();
        list2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,list,2123,list.equals(list2));
        verify();
        list2 = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,list,2125,list.equals(list2));
        verify();
        list2 = java.util.Arrays.asList(getFullElements());
        if (((list2.size()) < 1) && (isAddSupported())) {
            list.addAll(java.util.Arrays.asList(getOtherElements()));
            getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
            list2 = new ArrayList<E>(list2);
            list2.addAll(java.util.Arrays.asList(getOtherElements()));
        } 
        if ((list2.size()) > 1) {
            java.util.Collections.reverse(list2);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,list,2127,list.equals(list2));
            verify();
        } 
        resetFull();
        list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2130,list,2129,list.equals(""));
        verify();
        final List<E> listForC = java.util.Arrays.asList(getFullElements());
        final Collection<E> c = new AbstractCollection<E>() {
            @Override
            public int size() {
                return listForC.size();
            }

            @Override
            public Iterator<E> iterator() {
                return listForC.iterator();
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2132,list,2131,list.equals(c));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#equals(Object)}.
     */
public void testListEquals_literalMutation745() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_literalMutation745");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2114,list,2113,list.equals(list));
        verify();
        List<E> list2 = java.util.Arrays.asList(getFullElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,list,2115,list.equals(list2));
        verify();
        list2 = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,list,2117,list.equals(list2));
        verify();
        resetFull();
        list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2120,list,2119,list.equals(getConfirmed()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,list,2121,list.equals(list));
        verify();
        list2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,list,2123,list.equals(list2));
        verify();
        list2 = java.util.Arrays.asList(getOtherElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,list,2125,list.equals(list2));
        verify();
        list2 = java.util.Arrays.asList(getFullElements());
        if (((list2.size()) < 2) && (isAddSupported())) {
            list.addAll(java.util.Arrays.asList(getOtherElements()));
            getConfirmed().addAll(java.util.Arrays.asList(getOtherElements()));
            list2 = new ArrayList<E>(list2);
            list2.addAll(java.util.Arrays.asList(getOtherElements()));
        } 
        if ((list2.size()) > 0) {
            java.util.Collections.reverse(list2);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,list,2127,list.equals(list2));
            verify();
        } 
        resetFull();
        list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2130,list,2129,list.equals(""));
        verify();
        final List<E> listForC = java.util.Arrays.asList(getFullElements());
        final Collection<E> c = new AbstractCollection<E>() {
            @Override
            public int size() {
                return listForC.size();
            }

            @Override
            public Iterator<E> iterator() {
                return listForC.iterator();
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2132,list,2131,list.equals(c));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#hashCode()}.
     */
public void testListHashCode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListHashCode");
        resetEmpty();
        int hash1 = getCollection().hashCode();
        int hash2 = getConfirmed().hashCode();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2136,hash1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,hash2);
        verify();
        resetFull();
        hash1 = getCollection().hashCode();
        hash2 = getConfirmed().hashCode();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2138,hash1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,hash2);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#get(int)}.
     */
public void testListGetByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndex");
        resetFull();
        final List<E> list = getCollection();
        final E[] elements = getFullElements();
        for (int i = 1 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,list,2134,list.get(i));
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#get(int)} on an
     * empty list.
     */
public void testListGetByIndexBoundsChecking() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndexBoundsChecking");
        final List<E> list = makeObject();
        try {
            list.get(Integer.MIN_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(Integer.MAX_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#get(int)} on an
     * empty list.
     */
public void testListGetByIndexBoundsChecking_literalMutation748() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndexBoundsChecking_literalMutation748");
        final List<E> list = makeObject();
        try {
            list.get(Integer.MIN_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(-1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(Integer.MAX_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#get(int)} on an
     * empty list.
     */
public void testListGetByIndexBoundsChecking_literalMutation749() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndexBoundsChecking_literalMutation749");
        final List<E> list = makeObject();
        try {
            list.get(Integer.MIN_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(-1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(Integer.MAX_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#get(int)} on a
     * full list.
     */
public void testListGetByIndexBoundsChecking2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndexBoundsChecking2");
        final List<E> list = makeFullCollection();
        try {
            list.get(Integer.MIN_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(getFullElements().length);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(Integer.MAX_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#indexOf}.
     */
public void testListIndexOf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIndexOf");
        resetFull();
        final List<E> list1 = getCollection();
        final List<E> list2 = getConfirmed();
        for (E element : list2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2141,list1,2140,list1.indexOf(element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,list2,2142,list2.indexOf(element));
            verify();
        }
        final E[] other = getOtherElements();
        for (final E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2144,-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,list1,2145,list1.indexOf(element));
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#lastIndexOf}.
     */
public void testListLastIndexOf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListLastIndexOf");
        resetFull();
        final List<E> list1 = getCollection();
        final List<E> list2 = getConfirmed();
        final Iterator<E> iterator = list2.iterator();
        while (iterator.hasNext()) {
            final E element = iterator.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2148,list1,2147,list1.lastIndexOf(element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2150,list2,2149,list2.lastIndexOf(element));
            verify();
        }
        final E[] other = getOtherElements();
        for (final E element : other) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2151,("lastIndexOf should return -1 for nonexistent " + "element"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2152,-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2154,list1,2153,list1.lastIndexOf(element));
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#set(int, Object)} on an
     * empty list.
     */
public void testListSetByIndexBoundsChecking() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking");
        if (!(isSetSupported())) {
            return ;
        } 
        final List<E> list = makeObject();
        final E element = getOtherElements()[-1];
        try {
            list.set(Integer.MIN_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(0, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(Integer.MAX_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#set(int, Object)} on an
     * empty list.
     */
public void testListSetByIndexBoundsChecking_literalMutation769() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking_literalMutation769");
        if (!(isSetSupported())) {
            return ;
        } 
        final List<E> list = makeObject();
        final E element = getOtherElements()[0];
        try {
            list.set(Integer.MIN_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(0, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(0, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(Integer.MAX_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#set(int, Object)} on an
     * empty list.
     */
public void testListSetByIndexBoundsChecking_literalMutation770() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking_literalMutation770");
        if (!(isSetSupported())) {
            return ;
        } 
        final List<E> list = makeObject();
        final E element = getOtherElements()[0];
        try {
            list.set(Integer.MIN_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(Integer.MAX_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#set(int, Object)} on an
     * empty list.
     */
public void testListSetByIndexBoundsChecking_literalMutation771() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking_literalMutation771");
        if (!(isSetSupported())) {
            return ;
        } 
        final List<E> list = makeObject();
        final E element = getOtherElements()[0];
        try {
            list.set(Integer.MIN_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(0, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(2, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(Integer.MAX_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#set(int, Object)} on a
     * full list.
     */
public void testListSetByIndexBoundsChecking2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking2");
        if (!(isSetSupported())) {
            return ;
        } 
        final List<E> list = makeFullCollection();
        final E element = getOtherElements()[-1];
        try {
            list.set(Integer.MIN_VALUE, element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2254,("List.set should throw IndexOutOfBoundsException " + "[Integer.MIN_VALUE]"));
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(getFullElements().length, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(Integer.MAX_VALUE, element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2255,("List.set should throw IndexOutOfBoundsException " + "[Integer.MAX_VALUE]"));
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#set(int, Object)} on a
     * full list.
     */
public void testListSetByIndexBoundsChecking2_literalMutation773() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking2_literalMutation773");
        if (!(isSetSupported())) {
            return ;
        } 
        final List<E> list = makeFullCollection();
        final E element = getOtherElements()[0];
        try {
            list.set(Integer.MIN_VALUE, element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2254,("List.set should throw IndexOutOfBoundsException " + "[Integer.MIN_VALUE]"));
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(0, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(getFullElements().length, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(Integer.MAX_VALUE, element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2255,("List.set should throw IndexOutOfBoundsException " + "[Integer.MAX_VALUE]"));
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link List#set(int, Object)}.
     */
public void testListSetByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndex");
        if (!(isSetSupported())) {
            return ;
        } 
        resetFull();
        final E[] elements = getFullElements();
        final E[] other = getOtherElements();
        for (int i = -1 ; i < (elements.length) ; i++) {
            final E n = other[(i % (other.length))];
            final E v = getCollection().set(i, n);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2257,v);
            getConfirmed().set(i, n);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isSetSupported()} returns false, tests that set operation
     * raises <Code>UnsupportedOperationException.
     */
public void testUnsupportedSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedSet");
        if (isSetSupported()) {
            return ;
        } 
        resetFull();
        try {
            getCollection().set(-1, getFullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isSetSupported()} returns false, tests that set operation
     * raises <Code>UnsupportedOperationException.
     */
public void testUnsupportedSet_literalMutation790() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedSet_literalMutation790");
        if (isSetSupported()) {
            return ;
        } 
        resetFull();
        try {
            getCollection().set(0, getFullElements()[-1]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#remove(int)} on an
     * empty list.
     */
public void testListRemoveByIndexBoundsChecking() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndexBoundsChecking");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final List<E> list = makeObject();
        try {
            list.remove(Integer.MIN_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(2);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(Integer.MAX_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#remove(int)} on an
     * empty list.
     */
public void testListRemoveByIndexBoundsChecking_literalMutation764() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndexBoundsChecking_literalMutation764");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final List<E> list = makeObject();
        try {
            list.remove(Integer.MIN_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(-1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(-1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(Integer.MAX_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#remove(int)} on an
     * empty list.
     */
public void testListRemoveByIndexBoundsChecking_literalMutation765() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndexBoundsChecking_literalMutation765");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final List<E> list = makeObject();
        try {
            list.remove(Integer.MIN_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(-1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(Integer.MAX_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#remove(int)} on a
     * full list.
     */
public void testListRemoveByIndexBoundsChecking2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndexBoundsChecking2");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final List<E> list = makeFullCollection();
        try {
            list.remove(Integer.MIN_VALUE);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2250,("List.remove should throw IndexOutOfBoundsException " + "[Integer.MIN_VALUE]"));
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(0);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(getFullElements().length);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(Integer.MAX_VALUE);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2251,("List.remove should throw IndexOutOfBoundsException " + "[Integer.MAX_VALUE]"));
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#remove(int)}.
     */
public void testListRemoveByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndex");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 1 ; i < max ; i++) {
            resetFull();
            final E o1 = getCollection().remove(i);
            final E o2 = getConfirmed().remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2253,o2);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator()}.
     */
public void testListListIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIterator");
        resetFull();
        forwardTest(getCollection().listIterator(), 1);
        backwardTest(getCollection().listIterator(), 0);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator()}.
     */
public void testListListIterator_literalMutation752() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIterator_literalMutation752");
        resetFull();
        forwardTest(getCollection().listIterator(), 0);
        backwardTest(getCollection().listIterator(), 1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator(int)}.
     */
public void testListListIteratorByIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex");
        resetFull();
        try {
            getCollection().listIterator(2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        try {
            getCollection().listIterator(((getCollection().size()) + 1));
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
            forwardTest(getCollection().listIterator(i), i);
            backwardTest(getCollection().listIterator(i), i);
        }
        resetFull();
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
            backwardTest(getCollection().listIterator(i), i);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator(int)}.
     */
public void testListListIteratorByIndex_literalMutation754() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_literalMutation754");
        resetFull();
        try {
            getCollection().listIterator(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        try {
            getCollection().listIterator(((getCollection().size()) + 0));
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
            forwardTest(getCollection().listIterator(i), i);
            backwardTest(getCollection().listIterator(i), i);
        }
        resetFull();
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
            backwardTest(getCollection().listIterator(i), i);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator(int)}.
     */
public void testListListIteratorByIndex_literalMutation755() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_literalMutation755");
        resetFull();
        try {
            getCollection().listIterator(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        try {
            getCollection().listIterator(((getCollection().size()) + 1));
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        for (int i = 1 ; i <= (getConfirmed().size()) ; i++) {
            forwardTest(getCollection().listIterator(i), i);
            backwardTest(getCollection().listIterator(i), i);
        }
        resetFull();
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
            backwardTest(getCollection().listIterator(i), i);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator(int)}.
     */
public void testListListIteratorByIndex_literalMutation756() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_literalMutation756");
        resetFull();
        try {
            getCollection().listIterator(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        try {
            getCollection().listIterator(((getCollection().size()) + 1));
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
            forwardTest(getCollection().listIterator(i), i);
            backwardTest(getCollection().listIterator(i), i);
        }
        resetFull();
        for (int i = -1 ; i <= (getConfirmed().size()) ; i++) {
            backwardTest(getCollection().listIterator(i), i);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests remove on list iterator is correct.
     */
public void testListListIteratorPreviousRemoveNext() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorPreviousRemoveNext");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        if ((getCollection().size()) < 3) {
            return ;
        } 
        final ListIterator<E> it = getCollection().listIterator();
        final E zero = it.next();
        final E one = it.next();
        final E two = it.next();
        final E two2 = it.previous();
        final E one2 = it.previous();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2198,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2199,one2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2200,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2201,two2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2202,zero);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2204,getCollection(),2203,getCollection().get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2205,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2207,getCollection(),2206,getCollection().get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2208,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2210,getCollection(),2209,getCollection().get(2));
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2211,zero);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2213,getCollection(),2212,getCollection().get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2214,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2216,getCollection(),2215,getCollection().get(1));
        final E two3 = it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2217,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2218,two3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2219,((getCollection().size()) > 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2221,it,2220,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2223,it,2222,it.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests remove on list iterator is correct.
     */
public void testListListIteratorPreviousRemovePrevious() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorPreviousRemovePrevious");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        if ((getCollection().size()) < 5) {
            return ;
        } 
        final ListIterator<E> it = getCollection().listIterator();
        final E zero = it.next();
        final E one = it.next();
        final E two = it.next();
        final E two2 = it.previous();
        final E one2 = it.previous();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2224,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2225,one2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2226,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,two2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2228,zero);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2230,getCollection(),2229,getCollection().get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,getCollection(),2232,getCollection().get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2234,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2236,getCollection(),2235,getCollection().get(2));
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,zero);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,getCollection(),2238,getCollection().get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2242,getCollection(),2241,getCollection().get(1));
        final E zero3 = it.previous();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,zero);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,zero3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,it,2245,it.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,((getCollection().size()) > 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2249,it,2248,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests remove on list iterator is correct.
     */
public void testListListIteratorNextRemoveNext() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorNextRemoveNext");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        if ((getCollection().size()) < 3) {
            return ;
        } 
        final ListIterator<E> it = getCollection().listIterator();
        final E zero = it.next();
        final E one = it.next();
        final E two = it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2155,zero);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2157,getCollection(),2156,getCollection().get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2158,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2160,getCollection(),2159,getCollection().get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2161,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2163,getCollection(),2162,getCollection().get(2));
        final E three = getCollection().get(3);
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2164,zero);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2166,getCollection(),2165,getCollection().get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2167,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2169,getCollection(),2168,getCollection().get(1));
        final E three2 = it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2170,three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2171,three2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2172,((getCollection().size()) > 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2174,it,2173,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2176,it,2175,it.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests remove on list iterator is correct.
     */
public void testListListIteratorNextRemoveNext_literalMutation758() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorNextRemoveNext_literalMutation758");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        if ((getCollection().size()) < 4) {
            return ;
        } 
        final ListIterator<E> it = getCollection().listIterator();
        final E zero = it.next();
        final E one = it.next();
        final E two = it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2155,zero);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2157,getCollection(),2156,getCollection().get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2158,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2160,getCollection(),2159,getCollection().get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2161,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2163,getCollection(),2162,getCollection().get(2));
        final E three = getCollection().get(4);
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2164,zero);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2166,getCollection(),2165,getCollection().get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2167,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2169,getCollection(),2168,getCollection().get(1));
        final E three2 = it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2170,three);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2171,three2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2172,((getCollection().size()) > 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2174,it,2173,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2176,it,2175,it.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests remove on list iterator is correct.
     */
public void testListListIteratorNextRemovePrevious() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorNextRemovePrevious");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        if ((getCollection().size()) < 5) {
            return ;
        } 
        final ListIterator<E> it = getCollection().listIterator();
        final E zero = it.next();
        final E one = it.next();
        final E two = it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2177,zero);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2179,getCollection(),2178,getCollection().get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2180,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2182,getCollection(),2181,getCollection().get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2183,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2185,getCollection(),2184,getCollection().get(2));
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2186,zero);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2188,getCollection(),2187,getCollection().get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2189,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2191,getCollection(),2190,getCollection().get(1));
        final E one2 = it.previous();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,one2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,it,2194,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2197,it,2196,it.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Traverses to the end of the given iterator.
     * 
     * @param iter the iterator to traverse
     * @param i    the starting index
     */
private void forwardTest(final ListIterator<E> iter, int i) {
        final List<E> list = getCollection();
        final int max = getFullElements().length;
        while (i < max) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2074,iter,2073,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2075,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2077,iter,2076,iter.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2078,(i - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2080,iter,2079,iter.previousIndex());
            final Object o = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2082,list,2081,list.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2083,o);
            i++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2085,max);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2087,iter,2086,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2088,(max - 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2090,iter,2089,iter.previousIndex());
        try {
            iter.next();
        } catch (final NoSuchElementException e) {
        }
    }

    /** 
     * Traverses to the beginning of the given iterator.
     * 
     * @param iter the iterator to traverse
     * @param i    the starting index
     */
private void backwardTest(final ListIterator<E> iter, int i) {
        final List<E> list = getCollection();
        while (i > 0) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2053,("Iterator should have previous, i:" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2055,iter,2054,iter.hasPrevious());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2056,("Iterator.nextIndex should work, i:" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2057,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2059,iter,2058,iter.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2060,("Iterator.previousIndex should work, i:" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2061,(i - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2063,iter,2062,iter.previousIndex());
            final E o = iter.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2065,list,2064,list.get((i - 1)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2066,o);
            i--;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2067,!(iter.hasPrevious()));
        final int nextIndex = iter.nextIndex();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2068,nextIndex);
        final int prevIndex = iter.previousIndex();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2069,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2070,prevIndex);
        try {
            iter.previous();
        } catch (final NoSuchElementException e) {
        }
    }

    /** 
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
public void testListIteratorAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
        final List<E> list1 = getCollection();
        final List<E> list2 = getConfirmed();
        final E[] elements = getFullElements();
        ListIterator<E> iter1 = list1.listIterator();
        ListIterator<E> iter2 = list2.listIterator();
        for (final E element : elements) {
            iter1.add(element);
            iter2.add(element);
            verify();
        }
        resetFull();
        iter1 = getCollection().listIterator();
        iter2 = getConfirmed().listIterator();
        for (final E element : elements) {
            iter1.next();
            iter2.next();
            iter1.add(element);
            iter2.add(element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#set(Object)} method of the list
     * iterator.
     */
public void testListIteratorSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet");
        if (!(isSetSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        resetFull();
        final ListIterator<E> iter1 = getCollection().listIterator();
        final ListIterator<E> iter2 = getConfirmed().listIterator();
        for (final E element : elements) {
            iter1.next();
            iter2.next();
            iter1.set(element);
            iter2.set(element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEmptyListSerialization() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListSerialization");
        final List<E> list = makeObject();
        if (!((list instanceof java.io.Serializable) && (isTestSerialization()))) {
            return ;
        } 
        final byte[] objekt = writeExternalFormToBytes(((java.io.Serializable)(list)));
        final List<E> list2 = ((List<E>)(readExternalFormFromBytes(objekt)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2096,list,2095,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2098,list2,2097,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFullListSerialization() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullListSerialization");
        final List<E> list = makeFullCollection();
        final int size = getFullElements().length;
        if (!((list instanceof java.io.Serializable) && (isTestSerialization()))) {
            return ;
        } 
        final byte[] objekt = writeExternalFormToBytes(((java.io.Serializable)(list)));
        final List<E> list2 = ((List<E>)(readExternalFormFromBytes(objekt)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2105,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2107,list,2106,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2108,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,list2,2109,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare the current serialized form of the List
     * against the canonical version in SVN.
     */
@SuppressWarnings(value = "unchecked")
    public void testEmptyListCompatibility() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListCompatibility");
        final List<E> list = makeObject();
        if (((list instanceof java.io.Serializable) && (!(skipSerializedCanonicalTests()))) && (isTestSerialization())) {
            final List<E> list2 = ((List<E>)(readExternalFormFromDisk(getCanonicalEmptyCollectionName(list))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2092,list2,2091,list2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2093,list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2094,list2);
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare the current serialized form of the List
     * against the canonical version in SVN.
     */
@SuppressWarnings(value = "unchecked")
    public void testFullListCompatibility() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullListCompatibility");
        final List<E> list = makeFullCollection();
        if (((list instanceof java.io.Serializable) && (!(skipSerializedCanonicalTests()))) && (isTestSerialization())) {
            final List<E> list2 = ((List<E>)(readExternalFormFromDisk(getCanonicalFullCollectionName(list))));
            if ((list2.size()) == 4) {
                return ;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,list,2099,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2102,list2,2101,list2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2103,list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2104,list2);
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare the current serialized form of the List
     * against the canonical version in SVN.
     */
@SuppressWarnings(value = "unchecked")
    public void testFullListCompatibility_literalMutation733() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullListCompatibility_literalMutation733");
        final List<E> list = makeFullCollection();
        if (((list instanceof java.io.Serializable) && (!(skipSerializedCanonicalTests()))) && (isTestSerialization())) {
            final List<E> list2 = ((List<E>)(readExternalFormFromDisk(getCanonicalFullCollectionName(list))));
            if ((list2.size()) == 3) {
                return ;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,list,2099,list.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2102,list2,2101,list2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2103,list);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2104,list2);
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Returns a {@link BulkTest} for testing {@link List#subList(int, int)}.
     * The returned bulk test will run through every <code>TestList</code>
     * method, <i>including</i> another <code>bulkTestSubList</code>.
     * Sublists are tested until the size of the sublist is less than 10.
     * Each sublist is 6 elements smaller than its parent list.
     * (By default this means that two rounds of sublists will be tested).
     * The verify() method is overloaded to test that the original list is
     * modified when the sublist is.
     */
public BulkTest bulkTestSubList() {
        if (((getFullElements().length) - 6) < 10) {
            return null;
        } 
        return new BulkTestSubList<E>(this);
    }

    public static class BulkTestSubList<E> extends AbstractListTest<E> {
        private final AbstractListTest<E> outer;

        public BulkTestSubList(final AbstractListTest<E> outer) {
            super("");
            this.outer = outer;
        }

        @Override
        @SuppressWarnings(value = "unchecked")
        public E[] getFullElements() {
            final List<E> l = java.util.Arrays.asList(outer.getFullElements());
            return ((E[])(l.subList(3, ((l.size()) - 3)).toArray()));
        }

        @Override
        public E[] getOtherElements() {
            return outer.getOtherElements();
        }

        @Override
        public boolean isAddSupported() {
            return outer.isAddSupported();
        }

        @Override
        public boolean isSetSupported() {
            return outer.isSetSupported();
        }

        @Override
        public boolean isRemoveSupported() {
            return outer.isRemoveSupported();
        }

        @Override
        public List<E> makeObject() {
            return outer.makeFullCollection().subList(4, 4);
        }

        @Override
        public List<E> makeFullCollection() {
            final int size = getFullElements().length;
            return outer.makeFullCollection().subList(3, (size - 3));
        }

        @Override
        public void resetEmpty() {
            outer.resetFull();
            setCollection(outer.getCollection().subList(4, 4));
            setConfirmed(outer.getConfirmed().subList(4, 4));
        }

        @Override
        public void resetFull() {
            outer.resetFull();
            final int size = outer.getConfirmed().size();
            setCollection(outer.getCollection().subList(3, (size - 3)));
            setConfirmed(outer.getConfirmed().subList(3, (size - 3)));
        }

        @Override
        public void verify() {
            super.verify();
            outer.verify();
        }

        @Override
        public boolean isTestSerialization() {
            return false;
        }
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are added to the original list.
     */
public void testListSubListFailFastOnAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(2, size);
        getCollection().add(getOtherElements()[0]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().add(0, getOtherElements()[0]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are added to the original list.
     */
public void testListSubListFailFastOnAdd_literalMutation775() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_literalMutation775");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
        getCollection().add(getOtherElements()[1]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().add(0, getOtherElements()[0]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are added to the original list.
     */
public void testListSubListFailFastOnAdd_literalMutation776() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_literalMutation776");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
        getCollection().add(getOtherElements()[0]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(0, size);
        getCollection().add(0, getOtherElements()[0]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are added to the original list.
     */
public void testListSubListFailFastOnAdd_literalMutation777() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_literalMutation777");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
        getCollection().add(getOtherElements()[0]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().add(1, getOtherElements()[0]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are added to the original list.
     */
public void testListSubListFailFastOnAdd_literalMutation778() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_literalMutation778");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
        getCollection().add(getOtherElements()[0]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().add(0, getOtherElements()[-1]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are added to the original list.
     */
public void testListSubListFailFastOnAdd_literalMutation779() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_literalMutation779");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
        getCollection().add(getOtherElements()[0]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().add(0, getOtherElements()[0]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(2, size);
        getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are added to the original list.
     */
public void testListSubListFailFastOnAdd_literalMutation780() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_literalMutation780");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
        getCollection().add(getOtherElements()[0]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().add(0, getOtherElements()[0]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(0, size);
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are added to the original list.
     */
public void testListSubListFailFastOnAdd_literalMutation781() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_literalMutation781");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
        getCollection().add(getOtherElements()[0]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().add(0, getOtherElements()[0]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().addAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().addAll(-1, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
public void testListSubListFailFastOnRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(0, size);
        getCollection().remove(0);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().remove(getFullElements()[2]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().removeAll(java.util.Arrays.asList(getFullElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().retainAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
public void testListSubListFailFastOnRemove_literalMutation783() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_literalMutation783");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
        getCollection().remove(-1);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().remove(getFullElements()[2]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().removeAll(java.util.Arrays.asList(getFullElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().retainAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
public void testListSubListFailFastOnRemove_literalMutation784() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_literalMutation784");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
        getCollection().remove(0);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(2, size);
        getCollection().remove(getFullElements()[2]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().removeAll(java.util.Arrays.asList(getFullElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().retainAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
public void testListSubListFailFastOnRemove_literalMutation785() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_literalMutation785");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
        getCollection().remove(0);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().remove(getFullElements()[1]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().removeAll(java.util.Arrays.asList(getFullElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().retainAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
public void testListSubListFailFastOnRemove_literalMutation786() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_literalMutation786");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
        getCollection().remove(0);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().remove(getFullElements()[2]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(0, size);
        getCollection().removeAll(java.util.Arrays.asList(getFullElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().retainAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
public void testListSubListFailFastOnRemove_literalMutation787() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_literalMutation787");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
        getCollection().remove(0);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().remove(getFullElements()[2]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().removeAll(java.util.Arrays.asList(getFullElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(2, size);
        getCollection().retainAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
public void testListSubListFailFastOnRemove_literalMutation788() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_literalMutation788");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
        getCollection().remove(0);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().remove(getFullElements()[2]);
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().removeAll(java.util.Arrays.asList(getFullElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(1, size);
        getCollection().retainAll(java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        resetFull();
        sub = getCollection().subList(2, size);
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Invokes all the methods on the given sublist to make sure they raise
     * a {@link java.util.ConcurrentModificationException ConcurrentModificationException}.
     */
protected void failFastAll(final List<E> list) {
        final Method[] methods = List.class.getMethods();
        for (final Method method : methods) {
            failFastMethod(list, method);
        }
    }

    /** 
     * Invokes the given method on the given sublist to make sure it raises
     * a {@link java.util.ConcurrentModificationException ConcurrentModificationException}.
     * <p/>
     * Unless the method happens to be the equals() method, in which case
     * the test is skipped.  There seems to be a bug in
     * java.util.AbstractList.subList(int,int).equals(Object) -- it never
     * raises a ConcurrentModificationException.
     * 
     * @param list the sublist to test
     * @param m    the method to invoke
     */
protected void failFastMethod(final List<E> list, final Method m) {
        if (m.getName().equals("equals")) {
            return ;
        } 
        final E element = getOtherElements()[0];
        final Collection<E> c = java.util.Collections.singleton(element);
        final Class<?>[] types = m.getParameterTypes();
        final Object[] params = new Object[types.length];
        for (int i = 0 ; i < (params.length) ; i++) {
            if ((types[i]) == (Integer.TYPE)) {
                params[i] = Integer.valueOf(0);
            } else {
                if ((types[i]) == (Collection.class)) {
                    params[i] = c;
                } else {
                    if ((types[i]) == (Object.class)) {
                        params[i] = element;
                    } else {
                        if ((types[i]) == (Object[].class)) {
                            params[i] = new Object[0];
                        } 
                    }
                }
            }
        }
        try {
            m.invoke(list, params);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2071,((m.getName()) + " should raise ConcurrentModification"));
        } catch (final IllegalAccessException e) {
        } catch (final InvocationTargetException e) {
            final Throwable t = e.getTargetException();
            if (t instanceof java.util.ConcurrentModificationException) {
                return ;
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2072,(((m.getName()) + " raised unexpected ") + e));
            }
        }
    }

    public BulkTest bulkTestListIterator() {
        return new TestListIterator();
    }

    public class TestListIterator extends AbstractListIteratorTest<E> {
        public TestListIterator() {
            super("TestListIterator");
        }

        @Override
        public E addSetValue() {
            return org.apache.commons.collections4.list.AbstractListTest.this.getOtherElements()[0];
        }

        @Override
        public boolean supportsRemove() {
            return org.apache.commons.collections4.list.AbstractListTest.this.isRemoveSupported();
        }

        @Override
        public boolean supportsAdd() {
            return org.apache.commons.collections4.list.AbstractListTest.this.isAddSupported();
        }

        @Override
        public boolean supportsSet() {
            return org.apache.commons.collections4.list.AbstractListTest.this.isSetSupported();
        }

        @Override
        public ListIterator<E> makeEmptyIterator() {
            resetEmpty();
            return org.apache.commons.collections4.list.AbstractListTest.this.getCollection().listIterator();
        }

        @Override
        public ListIterator<E> makeObject() {
            resetFull();
            return org.apache.commons.collections4.list.AbstractListTest.this.getCollection().listIterator();
        }
    }
}

