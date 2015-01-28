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
import org.junit.Test;

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
@Test(timeout = 1000)
    public void testListAddByIndexBoundsChecking_add657() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking_add657");
        if (!(isAddSupported())) {
            return ;
        } 
        List<E> list;
        final E element = getOtherElements()[0];
        try {
            list = makeObject();
            list.add(Integer.MIN_VALUE, element);
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
@Test(timeout = 1000)
    public void testListAddByIndexBoundsChecking_add658() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking_add658");
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
@Test(timeout = 1000)
    public void testListAddByIndexBoundsChecking_add659() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking_add659");
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
            list.add(1, element);
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
@Test(timeout = 1000)
    public void testListAddByIndexBoundsChecking_add660() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking_add660");
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
            list.add(1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeObject();
            list.add(Integer.MAX_VALUE, element);
            list.add(Integer.MAX_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
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
            list.add(0, element);
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
@Test(timeout = 1000)
    public void testListAddByIndexBoundsChecking2_add661() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking2_add661");
        if (!(isAddSupported())) {
            return ;
        } 
        List<E> list;
        final E element = getOtherElements()[0];
        try {
            list = makeFullCollection();
            list.add(Integer.MIN_VALUE, element);
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
@Test(timeout = 1000)
    public void testListAddByIndexBoundsChecking2_add662() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking2_add662");
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
@Test(timeout = 1000)
    public void testListAddByIndexBoundsChecking2_add663() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking2_add663");
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
            list.add(((list.size()) + 1), element);
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
@Test(timeout = 1000)
    public void testListAddByIndexBoundsChecking2_add664() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndexBoundsChecking2_add664");
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
            list.add(((list.size()) + 1), element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list = makeFullCollection();
            list.add(Integer.MAX_VALUE, element);
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
        final E element = getOtherElements()[1];
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
            list.add(2, element);
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
@Test(timeout = 1000)
    public void testListAddByIndex_add653() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndex_add653");
        if (!(isAddSupported())) {
            return ;
        } 
        final E element = getOtherElements()[0];
        final int max = getFullElements().length;
        for (int i = 0 ; i <= max ; i++) {
            resetFull();
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
@Test(timeout = 1000)
    public void testListAddByIndex_add654() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndex_add654");
        if (!(isAddSupported())) {
            return ;
        } 
        final E element = getOtherElements()[0];
        final int max = getFullElements().length;
        for (int i = 0 ; i <= max ; i++) {
            resetFull();
            getCollection().add(i, element);
            getCollection().add(i, element);
            getConfirmed().add(i, element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#add(int, Object)}.
     */
@Test(timeout = 1000)
    public void testListAddByIndex_add655() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndex_add655");
        if (!(isAddSupported())) {
            return ;
        } 
        final E element = getOtherElements()[0];
        final int max = getFullElements().length;
        for (int i = 0 ; i <= max ; i++) {
            resetFull();
            getCollection().add(i, element);
            getConfirmed().add(i, element);
            getConfirmed().add(i, element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#add(int, Object)}.
     */
@Test(timeout = 1000)
    public void testListAddByIndex_add656() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndex_add656");
        if (!(isAddSupported())) {
            return ;
        } 
        final E element = getOtherElements()[0];
        final int max = getFullElements().length;
        for (int i = 0 ; i <= max ; i++) {
            resetFull();
            getCollection().add(i, element);
            getConfirmed().add(i, element);
            verify();
            verify();
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
        for (int i = -1 ; i <= max ; i++) {
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
@Test(timeout = 1000)
    public void testListAddByIndex_remove524() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndex_remove524");
        if (!(isAddSupported())) {
            return ;
        } 
        final E element = getOtherElements()[0];
        final int max = getFullElements().length;
        for (int i = 0 ; i <= max ; i++) {
            getCollection().add(i, element);
            getConfirmed().add(i, element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#add(int, Object)}.
     */
@Test(timeout = 1000)
    public void testListAddByIndex_remove525() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndex_remove525");
        if (!(isAddSupported())) {
            return ;
        } 
        final E element = getOtherElements()[0];
        final int max = getFullElements().length;
        for (int i = 0 ; i <= max ; i++) {
            resetFull();
            getConfirmed().add(i, element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#add(int, Object)}.
     */
@Test(timeout = 1000)
    public void testListAddByIndex_remove526() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndex_remove526");
        if (!(isAddSupported())) {
            return ;
        } 
        final E element = getOtherElements()[0];
        final int max = getFullElements().length;
        for (int i = 0 ; i <= max ; i++) {
            resetFull();
            getConfirmed().add(i, element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#add(int, Object)}.
     */
@Test(timeout = 1000)
    public void testListAddByIndex_remove527() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddByIndex_remove527");
        if (!(isAddSupported())) {
            return ;
        } 
        final E element = getOtherElements()[0];
        final int max = getFullElements().length;
        for (int i = 0 ; i <= max ; i++) {
            resetFull();
            getCollection().add(i, element);
            getConfirmed().add(i, element);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#equals(Object)}.
     */
@Test(timeout = 1000)
    public void testListEquals_add665() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add665");
        resetEmpty();
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
@Test(timeout = 1000)
    public void testListEquals_add666() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add666");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
        verify();
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
@Test(timeout = 1000)
    public void testListEquals_add667() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add667");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2114,list,2113,list.equals(list));
        verify();
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
@Test(timeout = 1000)
    public void testListEquals_add668() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add668");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2114,list,2113,list.equals(list));
        verify();
        List<E> list2 = java.util.Arrays.asList(getFullElements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,list,2115,list.equals(list2));
        verify();
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
@Test(timeout = 1000)
    public void testListEquals_add669() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add669");
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
@Test(timeout = 1000)
    public void testListEquals_add670() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add670");
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
@Test(timeout = 1000)
    public void testListEquals_add671() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add671");
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
@Test(timeout = 1000)
    public void testListEquals_add672() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add672");
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
@Test(timeout = 1000)
    public void testListEquals_add673() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add673");
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
@Test(timeout = 1000)
    public void testListEquals_add674() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add674");
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
        verify();
        list2 = java.util.Arrays.asList(getFullElements());
        if (((list2.size()) < 2) && (isAddSupported())) {
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
@Test(timeout = 1000)
    public void testListEquals_add675() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add675");
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
@Test(timeout = 1000)
    public void testListEquals_add676() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add676");
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
@Test(timeout = 1000)
    public void testListEquals_add677() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add677");
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
@Test(timeout = 1000)
    public void testListEquals_add678() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add678");
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
        if ((list2.size()) > 1) {
            java.util.Collections.reverse(list2);
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
@Test(timeout = 1000)
    public void testListEquals_add679() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add679");
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
        if ((list2.size()) > 1) {
            java.util.Collections.reverse(list2);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,list,2127,list.equals(list2));
            verify();
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
@Test(timeout = 1000)
    public void testListEquals_add680() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add680");
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
        if ((list2.size()) > 1) {
            java.util.Collections.reverse(list2);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,list,2127,list.equals(list2));
            verify();
        } 
        resetFull();
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
@Test(timeout = 1000)
    public void testListEquals_add681() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add681");
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
        if ((list2.size()) > 1) {
            java.util.Collections.reverse(list2);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,list,2127,list.equals(list2));
            verify();
        } 
        resetFull();
        list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2130,list,2129,list.equals(""));
        verify();
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
@Test(timeout = 1000)
    public void testListEquals_add682() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add682");
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
@Test(timeout = 1000)
    public void testListEquals_add683() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_add683");
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
        verify();
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
        if ((list2.size()) > 2) {
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
@Test(timeout = 1000)
    public void testListEquals_remove528() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove528");
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
@Test(timeout = 1000)
    public void testListEquals_remove529() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove529");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
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
@Test(timeout = 1000)
    public void testListEquals_remove530() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove530");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
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
@Test(timeout = 1000)
    public void testListEquals_remove531() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove531");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
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
@Test(timeout = 1000)
    public void testListEquals_remove532() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove532");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
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
@Test(timeout = 1000)
    public void testListEquals_remove533() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove533");
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
@Test(timeout = 1000)
    public void testListEquals_remove534() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove534");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
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
@Test(timeout = 1000)
    public void testListEquals_remove535() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove535");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
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
@Test(timeout = 1000)
    public void testListEquals_remove536() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove536");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
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
@Test(timeout = 1000)
    public void testListEquals_remove537() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove537");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
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
@Test(timeout = 1000)
    public void testListEquals_remove538() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove538");
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
@Test(timeout = 1000)
    public void testListEquals_remove539() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove539");
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
@Test(timeout = 1000)
    public void testListEquals_remove540() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove540");
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
@Test(timeout = 1000)
    public void testListEquals_remove541() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove541");
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
        if ((list2.size()) > 1) {
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
@Test(timeout = 1000)
    public void testListEquals_remove542() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove542");
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
        if ((list2.size()) > 1) {
            java.util.Collections.reverse(list2);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2128,list,2127,list.equals(list2));
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
@Test(timeout = 1000)
    public void testListEquals_remove543() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove543");
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
@Test(timeout = 1000)
    public void testListEquals_remove544() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove544");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
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
@Test(timeout = 1000)
    public void testListEquals_remove545() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove545");
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
@Test(timeout = 1000)
    public void testListEquals_remove546() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListEquals_remove546");
        resetEmpty();
        List<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2112,list,2111,list.equals(getConfirmed()));
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
     * Tests {@link List#hashCode()}.
     */
@Test(timeout = 1000)
    public void testListHashCode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListHashCode");
        resetEmpty();
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
     * Tests {@link List#hashCode()}.
     */
@Test(timeout = 1000)
    public void testListHashCode_add696() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListHashCode_add696");
        resetEmpty();
        int hash1 = getCollection().hashCode();
        int hash2 = getConfirmed().hashCode();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2136,hash1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,hash2);
        verify();
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
     * Tests {@link List#hashCode()}.
     */
@Test(timeout = 1000)
    public void testListHashCode_add697() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListHashCode_add697");
        resetEmpty();
        int hash1 = getCollection().hashCode();
        int hash2 = getConfirmed().hashCode();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2136,hash1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,hash2);
        verify();
        resetFull();
        resetFull();
        hash1 = getCollection().hashCode();
        hash2 = getConfirmed().hashCode();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2138,hash1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,hash2);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#hashCode()}.
     */
@Test(timeout = 1000)
    public void testListHashCode_add698() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListHashCode_add698");
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
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#hashCode()}.
     */
@Test(timeout = 1000)
    public void testListHashCode_remove549() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListHashCode_remove549");
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
     * Tests {@link List#hashCode()}.
     */
@Test(timeout = 1000)
    public void testListHashCode_remove550() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListHashCode_remove550");
        resetEmpty();
        int hash1 = getCollection().hashCode();
        int hash2 = getConfirmed().hashCode();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2136,hash1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,hash2);
        resetFull();
        hash1 = getCollection().hashCode();
        hash2 = getConfirmed().hashCode();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2138,hash1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,hash2);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#hashCode()}.
     */
@Test(timeout = 1000)
    public void testListHashCode_remove551() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListHashCode_remove551");
        resetEmpty();
        int hash1 = getCollection().hashCode();
        int hash2 = getConfirmed().hashCode();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2136,hash1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,hash2);
        verify();
        hash1 = getCollection().hashCode();
        hash2 = getConfirmed().hashCode();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2138,hash1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,hash2);
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#hashCode()}.
     */
@Test(timeout = 1000)
    public void testListHashCode_remove552() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListHashCode_remove552");
        resetEmpty();
        int hash1 = getCollection().hashCode();
        int hash2 = getConfirmed().hashCode();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2136,hash1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,hash2);
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
@Test(timeout = 1000)
    public void testListGetByIndex_add684() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndex_add684");
        resetFull();
        resetFull();
        final List<E> list = getCollection();
        final E[] elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,list,2134,list.get(i));
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#get(int)}.
     */
@Test(timeout = 1000)
    public void testListGetByIndex_add685() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndex_add685");
        resetFull();
        final List<E> list = getCollection();
        final E[] elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,list,2134,list.get(i));
            verify();
            verify();
        }
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
        for (int i = -1 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,list,2134,list.get(i));
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#get(int)}.
     */
@Test(timeout = 1000)
    public void testListGetByIndex_remove547() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndex_remove547");
        final List<E> list = getCollection();
        final E[] elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,list,2134,list.get(i));
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#get(int)}.
     */
@Test(timeout = 1000)
    public void testListGetByIndex_remove548() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndex_remove548");
        resetFull();
        final List<E> list = getCollection();
        final E[] elements = getFullElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,list,2134,list.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#get(int)} on an
     * empty list.
     */
@Test(timeout = 1000)
    public void testListGetByIndexBoundsChecking_add686() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndexBoundsChecking_add686");
        final List<E> list = makeObject();
        try {
            list.get(Integer.MIN_VALUE);
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
@Test(timeout = 1000)
    public void testListGetByIndexBoundsChecking_add687() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndexBoundsChecking_add687");
        final List<E> list = makeObject();
        try {
            list.get(Integer.MIN_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(-1);
            list.get(-1);
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
@Test(timeout = 1000)
    public void testListGetByIndexBoundsChecking_add688() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndexBoundsChecking_add688");
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
@Test(timeout = 1000)
    public void testListGetByIndexBoundsChecking_add689() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndexBoundsChecking_add689");
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
            list.get(1);
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
@Test(timeout = 1000)
    public void testListGetByIndexBoundsChecking_add690() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndexBoundsChecking_add690");
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
            list.get(1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(Integer.MAX_VALUE);
            list.get(Integer.MAX_VALUE);
        } catch (final IndexOutOfBoundsException e) {
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
            list.get(2);
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
@Test(timeout = 1000)
    public void testListGetByIndexBoundsChecking2_add691() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndexBoundsChecking2_add691");
        final List<E> list = makeFullCollection();
        try {
            list.get(Integer.MIN_VALUE);
            list.get(Integer.MIN_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(-1);
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
     * Tests bounds checking for {@link List#get(int)} on a
     * full list.
     */
@Test(timeout = 1000)
    public void testListGetByIndexBoundsChecking2_add692() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndexBoundsChecking2_add692");
        final List<E> list = makeFullCollection();
        try {
            list.get(Integer.MIN_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(-1);
            list.get(-1);
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
     * Tests bounds checking for {@link List#get(int)} on a
     * full list.
     */
@Test(timeout = 1000)
    public void testListGetByIndexBoundsChecking2_add693() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndexBoundsChecking2_add693");
        final List<E> list = makeFullCollection();
        try {
            list.get(Integer.MIN_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(-1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(getFullElements().length);
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
     * Tests bounds checking for {@link List#get(int)} on a
     * full list.
     */
@Test(timeout = 1000)
    public void testListGetByIndexBoundsChecking2_add694() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListGetByIndexBoundsChecking2_add694");
        final List<E> list = makeFullCollection();
        try {
            list.get(Integer.MIN_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(-1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(getFullElements().length);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.get(Integer.MAX_VALUE);
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
@Test(timeout = 1000)
    public void testListIndexOf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIndexOf");
        resetFull();
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
     * Tests {@link List#indexOf}.
     */
@Test(timeout = 1000)
    public void testListIndexOf_add700() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIndexOf_add700");
        resetFull();
        final List<E> list1 = getCollection();
        final List<E> list2 = getConfirmed();
        for (E element : list2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2141,list1,2140,list1.indexOf(element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,list2,2142,list2.indexOf(element));
            verify();
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
     * Tests {@link List#indexOf}.
     */
@Test(timeout = 1000)
    public void testListIndexOf_add701() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIndexOf_add701");
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
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#indexOf}.
     */
@Test(timeout = 1000)
    public void testListIndexOf_remove553() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIndexOf_remove553");
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
     * Tests {@link List#indexOf}.
     */
@Test(timeout = 1000)
    public void testListIndexOf_remove554() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIndexOf_remove554");
        resetFull();
        final List<E> list1 = getCollection();
        final List<E> list2 = getConfirmed();
        for (E element : list2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2141,list1,2140,list1.indexOf(element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,list2,2142,list2.indexOf(element));
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
     * Tests {@link List#indexOf}.
     */
@Test(timeout = 1000)
    public void testListIndexOf_remove555() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIndexOf_remove555");
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
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#lastIndexOf}.
     */
@Test(timeout = 1000)
    public void testListLastIndexOf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListLastIndexOf");
        resetFull();
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
     * Tests {@link List#lastIndexOf}.
     */
@Test(timeout = 1000)
    public void testListLastIndexOf_add719() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListLastIndexOf_add719");
        resetFull();
        final List<E> list1 = getCollection();
        final List<E> list2 = getConfirmed();
        final Iterator<E> iterator = list2.iterator();
        while (iterator.hasNext()) {
            final E element = iterator.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2148,list1,2147,list1.lastIndexOf(element));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2150,list2,2149,list2.lastIndexOf(element));
            verify();
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
     * Tests {@link List#lastIndexOf}.
     */
@Test(timeout = 1000)
    public void testListLastIndexOf_add720() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListLastIndexOf_add720");
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
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#lastIndexOf}.
     */
@Test(timeout = 1000)
    public void testListLastIndexOf_remove568() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListLastIndexOf_remove568");
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
     * Tests {@link List#lastIndexOf}.
     */
@Test(timeout = 1000)
    public void testListLastIndexOf_remove569() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListLastIndexOf_remove569");
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
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#set(int, Object)} on an
     * empty list.
     */
@Test(timeout = 1000)
    public void testListSetByIndexBoundsChecking_add755() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking_add755");
        if (!(isSetSupported())) {
            return ;
        } 
        final List<E> list = makeObject();
        final E element = getOtherElements()[0];
        try {
            list.set(Integer.MIN_VALUE, element);
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
@Test(timeout = 1000)
    public void testListSetByIndexBoundsChecking_add756() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking_add756");
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
@Test(timeout = 1000)
    public void testListSetByIndexBoundsChecking_add757() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking_add757");
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
@Test(timeout = 1000)
    public void testListSetByIndexBoundsChecking_add758() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking_add758");
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
            list.set(1, element);
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
@Test(timeout = 1000)
    public void testListSetByIndexBoundsChecking_add759() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking_add759");
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
            list.set(1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(Integer.MAX_VALUE, element);
            list.set(Integer.MAX_VALUE, element);
        } catch (final IndexOutOfBoundsException e) {
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
            list.set(2, element);
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
            list.set(-1, element);
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
@Test(timeout = 1000)
    public void testListSetByIndexBoundsChecking2_add760() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking2_add760");
        if (!(isSetSupported())) {
            return ;
        } 
        final List<E> list = makeFullCollection();
        final E element = getOtherElements()[0];
        try {
            list.set(Integer.MIN_VALUE, element);
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
@Test(timeout = 1000)
    public void testListSetByIndexBoundsChecking2_add761() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking2_add761");
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
            list.set(-1, element);
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
@Test(timeout = 1000)
    public void testListSetByIndexBoundsChecking2_add762() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking2_add762");
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
            list.set(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(getFullElements().length, element);
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
@Test(timeout = 1000)
    public void testListSetByIndexBoundsChecking2_add763() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndexBoundsChecking2_add763");
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
            list.set(-1, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(getFullElements().length, element);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.set(Integer.MAX_VALUE, element);
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
@Test(timeout = 1000)
    public void testListSetByIndex_add752() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndex_add752");
        if (!(isSetSupported())) {
            return ;
        } 
        resetFull();
        resetFull();
        final E[] elements = getFullElements();
        final E[] other = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
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
     * Test {@link List#set(int, Object)}.
     */
@Test(timeout = 1000)
    public void testListSetByIndex_add753() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndex_add753");
        if (!(isSetSupported())) {
            return ;
        } 
        resetFull();
        final E[] elements = getFullElements();
        final E[] other = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            final E n = other[(i % (other.length))];
            final E v = getCollection().set(i, n);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2257,v);
            getConfirmed().set(i, n);
            getConfirmed().set(i, n);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link List#set(int, Object)}.
     */
@Test(timeout = 1000)
    public void testListSetByIndex_add754() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndex_add754");
        if (!(isSetSupported())) {
            return ;
        } 
        resetFull();
        final E[] elements = getFullElements();
        final E[] other = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            final E n = other[(i % (other.length))];
            final E v = getCollection().set(i, n);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2257,v);
            getConfirmed().set(i, n);
            verify();
            verify();
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
     * Test {@link List#set(int, Object)}.
     */
@Test(timeout = 1000)
    public void testListSetByIndex_remove590() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndex_remove590");
        if (!(isSetSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        final E[] other = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
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
     * Test {@link List#set(int, Object)}.
     */
@Test(timeout = 1000)
    public void testListSetByIndex_remove591() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndex_remove591");
        if (!(isSetSupported())) {
            return ;
        } 
        resetFull();
        final E[] elements = getFullElements();
        final E[] other = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            final E n = other[(i % (other.length))];
            final E v = getCollection().set(i, n);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2257,v);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link List#set(int, Object)}.
     */
@Test(timeout = 1000)
    public void testListSetByIndex_remove592() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSetByIndex_remove592");
        if (!(isSetSupported())) {
            return ;
        } 
        resetFull();
        final E[] elements = getFullElements();
        final E[] other = getOtherElements();
        for (int i = 0 ; i < (elements.length) ; i++) {
            final E n = other[(i % (other.length))];
            final E v = getCollection().set(i, n);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2257,v);
            getConfirmed().set(i, n);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isSetSupported()} returns false, tests that set operation
     * raises <Code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedSet_add791() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedSet_add791");
        if (isSetSupported()) {
            return ;
        } 
        resetFull();
        resetFull();
        try {
            getCollection().set(0, getFullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isSetSupported()} returns false, tests that set operation
     * raises <Code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedSet_add792() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedSet_add792");
        if (isSetSupported()) {
            return ;
        } 
        resetFull();
        try {
            getCollection().set(0, getFullElements()[0]);
            getCollection().set(0, getFullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isSetSupported()} returns false, tests that set operation
     * raises <Code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedSet_add793() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedSet_add793");
        if (isSetSupported()) {
            return ;
        } 
        resetFull();
        try {
            getCollection().set(0, getFullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        verify();
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
            getCollection().set(1, getFullElements()[0]);
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
            getCollection().set(0, getFullElements()[1]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isSetSupported()} returns false, tests that set operation
     * raises <Code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedSet_remove620() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedSet_remove620");
        if (isSetSupported()) {
            return ;
        } 
        try {
            getCollection().set(0, getFullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * If {@link #isSetSupported()} returns false, tests that set operation
     * raises <Code>UnsupportedOperationException.
     */
@Test(timeout = 1000)
    public void testUnsupportedSet_remove621() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnsupportedSet_remove621");
        if (isSetSupported()) {
            return ;
        } 
        resetFull();
        try {
            getCollection().set(0, getFullElements()[0]);
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests bounds checking for {@link List#remove(int)} on an
     * empty list.
     */
@Test(timeout = 1000)
    public void testListRemoveByIndexBoundsChecking_add743() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndexBoundsChecking_add743");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final List<E> list = makeObject();
        try {
            list.remove(Integer.MIN_VALUE);
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
@Test(timeout = 1000)
    public void testListRemoveByIndexBoundsChecking_add744() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndexBoundsChecking_add744");
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
            list.remove(-1);
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
@Test(timeout = 1000)
    public void testListRemoveByIndexBoundsChecking_add745() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndexBoundsChecking_add745");
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
@Test(timeout = 1000)
    public void testListRemoveByIndexBoundsChecking_add746() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndexBoundsChecking_add746");
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
            list.remove(1);
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
@Test(timeout = 1000)
    public void testListRemoveByIndexBoundsChecking_add747() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndexBoundsChecking_add747");
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
            list.remove(1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(Integer.MAX_VALUE);
            list.remove(Integer.MAX_VALUE);
        } catch (final IndexOutOfBoundsException e) {
        }
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
            list.remove(0);
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
            list.remove(1);
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
            list.remove(2);
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
@Test(timeout = 1000)
    public void testListRemoveByIndexBoundsChecking2_add748() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndexBoundsChecking2_add748");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final List<E> list = makeFullCollection();
        try {
            list.remove(Integer.MIN_VALUE);
            list.remove(Integer.MIN_VALUE);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2250,("List.remove should throw IndexOutOfBoundsException " + "[Integer.MIN_VALUE]"));
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(-1);
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
     * Tests bounds checking for {@link List#remove(int)} on a
     * full list.
     */
@Test(timeout = 1000)
    public void testListRemoveByIndexBoundsChecking2_add749() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndexBoundsChecking2_add749");
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
            list.remove(-1);
            list.remove(-1);
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
     * Tests bounds checking for {@link List#remove(int)} on a
     * full list.
     */
@Test(timeout = 1000)
    public void testListRemoveByIndexBoundsChecking2_add750() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndexBoundsChecking2_add750");
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
            list.remove(-1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(getFullElements().length);
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
     * Tests bounds checking for {@link List#remove(int)} on a
     * full list.
     */
@Test(timeout = 1000)
    public void testListRemoveByIndexBoundsChecking2_add751() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndexBoundsChecking2_add751");
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
            list.remove(-1);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(getFullElements().length);
        } catch (final IndexOutOfBoundsException e) {
        }
        try {
            list.remove(Integer.MAX_VALUE);
            list.remove(Integer.MAX_VALUE);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2251,("List.remove should throw IndexOutOfBoundsException " + "[Integer.MAX_VALUE]"));
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
@Test(timeout = 1000)
    public void testListRemoveByIndex_add741() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndex_add741");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            resetFull();
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
     * Tests {@link List#remove(int)}.
     */
@Test(timeout = 1000)
    public void testListRemoveByIndex_add742() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndex_add742");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            resetFull();
            final E o1 = getCollection().remove(i);
            final E o2 = getConfirmed().remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2253,o2);
            verify();
            verify();
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
        for (int i = -1 ; i < max ; i++) {
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
     * Tests {@link List#remove(int)}.
     */
@Test(timeout = 1000)
    public void testListRemoveByIndex_remove588() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndex_remove588");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E o1 = getCollection().remove(i);
            final E o2 = getConfirmed().remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2253,o2);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link List#remove(int)}.
     */
@Test(timeout = 1000)
    public void testListRemoveByIndex_remove589() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListRemoveByIndex_remove589");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            resetFull();
            final E o1 = getCollection().remove(i);
            final E o2 = getConfirmed().remove(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2253,o2);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator()}.
     */
@Test(timeout = 1000)
    public void testListListIterator_add721() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIterator_add721");
        resetFull();
        resetFull();
        forwardTest(getCollection().listIterator(), 0);
        backwardTest(getCollection().listIterator(), 0);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator()}.
     */
@Test(timeout = 1000)
    public void testListListIterator_add722() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIterator_add722");
        resetFull();
        forwardTest(getCollection().listIterator(), 0);
        forwardTest(getCollection().listIterator(), 0);
        backwardTest(getCollection().listIterator(), 0);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator()}.
     */
@Test(timeout = 1000)
    public void testListListIterator_add723() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIterator_add723");
        resetFull();
        forwardTest(getCollection().listIterator(), 0);
        backwardTest(getCollection().listIterator(), 0);
        backwardTest(getCollection().listIterator(), 0);
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
        backwardTest(getCollection().listIterator(), -1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator()}.
     */
@Test(timeout = 1000)
    public void testListListIterator_remove570() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIterator_remove570");
        forwardTest(getCollection().listIterator(), 0);
        backwardTest(getCollection().listIterator(), 0);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator()}.
     */
@Test(timeout = 1000)
    public void testListListIterator_remove571() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIterator_remove571");
        resetFull();
        backwardTest(getCollection().listIterator(), 0);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator()}.
     */
@Test(timeout = 1000)
    public void testListListIterator_remove572() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIterator_remove572");
        resetFull();
        forwardTest(getCollection().listIterator(), 0);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator(int)}.
     */
@Test(timeout = 1000)
    public void testListListIteratorByIndex_add724() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_add724");
        resetFull();
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
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
            backwardTest(getCollection().listIterator(i), i);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator(int)}.
     */
@Test(timeout = 1000)
    public void testListListIteratorByIndex_add725() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_add725");
        resetFull();
        try {
            getCollection().listIterator(-1);
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
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
            backwardTest(getCollection().listIterator(i), i);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator(int)}.
     */
@Test(timeout = 1000)
    public void testListListIteratorByIndex_add726() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_add726");
        resetFull();
        try {
            getCollection().listIterator(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
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
@Test(timeout = 1000)
    public void testListListIteratorByIndex_add727() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_add727");
        resetFull();
        try {
            getCollection().listIterator(-1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        resetFull();
        try {
            getCollection().listIterator(((getCollection().size()) + 1));
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
@Test(timeout = 1000)
    public void testListListIteratorByIndex_add728() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_add728");
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
@Test(timeout = 1000)
    public void testListListIteratorByIndex_add729() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_add729");
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
@Test(timeout = 1000)
    public void testListListIteratorByIndex_add730() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_add730");
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
@Test(timeout = 1000)
    public void testListListIteratorByIndex_add731() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_add731");
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
        resetFull();
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
            backwardTest(getCollection().listIterator(i), i);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator(int)}.
     */
@Test(timeout = 1000)
    public void testListListIteratorByIndex_add732() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_add732");
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
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
            backwardTest(getCollection().listIterator(i), i);
            backwardTest(getCollection().listIterator(i), i);
        }
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
            getCollection().listIterator(((getCollection().size()) + 2));
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
        for (int i = -1 ; i <= (getConfirmed().size()) ; i++) {
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
        for (int i = 1 ; i <= (getConfirmed().size()) ; i++) {
            backwardTest(getCollection().listIterator(i), i);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator(int)}.
     */
@Test(timeout = 1000)
    public void testListListIteratorByIndex_remove573() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_remove573");
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
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
            backwardTest(getCollection().listIterator(i), i);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator(int)}.
     */
@Test(timeout = 1000)
    public void testListListIteratorByIndex_remove574() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_remove574");
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
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
            backwardTest(getCollection().listIterator(i), i);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator(int)}.
     */
@Test(timeout = 1000)
    public void testListListIteratorByIndex_remove575() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_remove575");
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
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
            backwardTest(getCollection().listIterator(i), i);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator(int)}.
     */
@Test(timeout = 1000)
    public void testListListIteratorByIndex_remove576() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_remove576");
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
@Test(timeout = 1000)
    public void testListListIteratorByIndex_remove577() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_remove577");
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
@Test(timeout = 1000)
    public void testListListIteratorByIndex_remove578() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_remove578");
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
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
            backwardTest(getCollection().listIterator(i), i);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the read-only bits of {@link List#listIterator(int)}.
     */
@Test(timeout = 1000)
    public void testListListIteratorByIndex_remove579() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorByIndex_remove579");
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
        for (int i = 0 ; i <= (getConfirmed().size()) ; i++) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests remove on list iterator is correct.
     */
@Test(timeout = 1000)
    public void testListListIteratorPreviousRemoveNext_add737() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorPreviousRemoveNext_add737");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        resetFull();
        if ((getCollection().size()) < 4) {
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
@Test(timeout = 1000)
    public void testListListIteratorPreviousRemoveNext_add738() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorPreviousRemoveNext_add738");
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
public void testListListIteratorPreviousRemoveNext() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorPreviousRemoveNext");
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
@Test(timeout = 1000)
    public void testListListIteratorPreviousRemoveNext_remove584() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorPreviousRemoveNext_remove584");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if ((getCollection().size()) < 4) {
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
@Test(timeout = 1000)
    public void testListListIteratorPreviousRemoveNext_remove585() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorPreviousRemoveNext_remove585");
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
@Test(timeout = 1000)
    public void testListListIteratorPreviousRemovePrevious_add739() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorPreviousRemovePrevious_add739");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        resetFull();
        if ((getCollection().size()) < 4) {
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
@Test(timeout = 1000)
    public void testListListIteratorPreviousRemovePrevious_add740() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorPreviousRemovePrevious_add740");
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
public void testListListIteratorPreviousRemovePrevious() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorPreviousRemovePrevious");
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
@Test(timeout = 1000)
    public void testListListIteratorPreviousRemovePrevious_remove586() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorPreviousRemovePrevious_remove586");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if ((getCollection().size()) < 4) {
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
@Test(timeout = 1000)
    public void testListListIteratorPreviousRemovePrevious_remove587() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorPreviousRemovePrevious_remove587");
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
@Test(timeout = 1000)
    public void testListListIteratorNextRemoveNext_add733() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorNextRemoveNext_add733");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
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
@Test(timeout = 1000)
    public void testListListIteratorNextRemoveNext_add734() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorNextRemoveNext_add734");
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
        final E three = getCollection().get(3);
        it.remove();
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
public void testListListIteratorNextRemoveNext() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorNextRemoveNext");
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
@Test(timeout = 1000)
    public void testListListIteratorNextRemoveNext_remove580() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorNextRemoveNext_remove580");
        if (!(isRemoveSupported())) {
            return ;
        } 
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
@Test(timeout = 1000)
    public void testListListIteratorNextRemoveNext_remove581() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorNextRemoveNext_remove581");
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
        final E three = getCollection().get(3);
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
@Test(timeout = 1000)
    public void testListListIteratorNextRemovePrevious_add735() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorNextRemovePrevious_add735");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        resetFull();
        if ((getCollection().size()) < 4) {
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
     * Tests remove on list iterator is correct.
     */
@Test(timeout = 1000)
    public void testListListIteratorNextRemovePrevious_add736() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorNextRemovePrevious_add736");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2177,zero);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2179,getCollection(),2178,getCollection().get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2180,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2182,getCollection(),2181,getCollection().get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2183,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2185,getCollection(),2184,getCollection().get(2));
        it.remove();
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
     * Tests remove on list iterator is correct.
     */
public void testListListIteratorNextRemovePrevious() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorNextRemovePrevious");
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
     * Tests remove on list iterator is correct.
     */
@Test(timeout = 1000)
    public void testListListIteratorNextRemovePrevious_remove582() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorNextRemovePrevious_remove582");
        if (!(isRemoveSupported())) {
            return ;
        } 
        if ((getCollection().size()) < 4) {
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
     * Tests remove on list iterator is correct.
     */
@Test(timeout = 1000)
    public void testListListIteratorNextRemovePrevious_remove583() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListListIteratorNextRemovePrevious_remove583");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2177,zero);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2179,getCollection(),2178,getCollection().get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2180,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2182,getCollection(),2181,getCollection().get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2183,two);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2185,getCollection(),2184,getCollection().get(2));
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
@Test(timeout = 1000)
    public void testListIteratorAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd");
        if (!(isAddSupported())) {
            return ;
        } 
        resetEmpty();
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
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_add703() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_add703");
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
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_add704() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_add704");
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
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_add705() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_add705");
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
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_add706() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_add706");
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
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_add707() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_add707");
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
            iter1.next();
            iter2.next();
            iter1.add(element);
            iter2.add(element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_add708() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_add708");
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
            iter2.next();
            iter1.add(element);
            iter2.add(element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_add709() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_add709");
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
            iter1.add(element);
            iter2.add(element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_add710() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_add710");
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
            iter2.add(element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_add711() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_add711");
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
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_remove556() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_remove556");
        if (!(isAddSupported())) {
            return ;
        } 
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
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_remove557() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_remove557");
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
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_remove558() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_remove558");
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
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_remove559() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_remove559");
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
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_remove560() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_remove560");
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
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_remove561() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_remove561");
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
            iter2.add(element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_remove562() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_remove562");
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
            iter2.add(element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#add(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorAdd_remove563() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorAdd_remove563");
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
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#set(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet");
        if (!(isSetSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        resetFull();
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

    /** 
     * Tests the {@link ListIterator#set(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorSet_add713() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_add713");
        if (!(isSetSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        resetFull();
        final ListIterator<E> iter1 = getCollection().listIterator();
        final ListIterator<E> iter2 = getConfirmed().listIterator();
        for (final E element : elements) {
            iter1.next();
            iter1.next();
            iter2.next();
            iter1.set(element);
            iter2.set(element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#set(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorSet_add714() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_add714");
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
            iter2.next();
            iter1.set(element);
            iter2.set(element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#set(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorSet_add715() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_add715");
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
            iter1.set(element);
            iter2.set(element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#set(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorSet_add716() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_add716");
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
            iter2.set(element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#set(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorSet_add717() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_add717");
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
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#set(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorSet_remove564() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_remove564");
        if (!(isSetSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
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

    /** 
     * Tests the {@link ListIterator#set(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorSet_remove565() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_remove565");
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
            iter2.set(element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#set(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorSet_remove566() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_remove566");
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
            iter2.set(element);
            verify();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link ListIterator#set(Object)} method of the list
     * iterator.
     */
@Test(timeout = 1000)
    public void testListIteratorSet_remove567() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_remove567");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_add764() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_add764");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
        resetFull();
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
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are added to the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_add765() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_add765");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_add766() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_add766");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_add767() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_add767");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_add768() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_add768");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_add769() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_add769");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_add770() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_add770");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_add771() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_add771");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_add772() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_add772");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_add773() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_add773");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_add774() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_add774");
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
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are added to the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_add775() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_add775");
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
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
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
        getCollection().add(getOtherElements()[-1]);
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
        sub = getCollection().subList(2, size);
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
        getCollection().add(-1, getOtherElements()[0]);
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
        getCollection().add(0, getOtherElements()[1]);
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
     * if elements are added to the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_remove593() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_remove593");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
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
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are added to the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_remove594() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_remove594");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_remove595() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_remove595");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_remove596() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_remove596");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
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
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are added to the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_remove597() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_remove597");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_remove598() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_remove598");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_remove599() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_remove599");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
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
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are added to the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_remove600() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_remove600");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_remove601() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_remove601");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_remove602() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_remove602");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isAddSupported())) {
            return ;
        } 
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
        getCollection().addAll(0, java.util.Arrays.asList(getOtherElements()));
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are added to the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_remove603() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_remove603");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnAdd_remove604() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnAdd_remove604");
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
     * if elements are removed from the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add776() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add776");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
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
        sub = getCollection().subList(1, size);
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add777() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add777");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add778() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add778");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add779() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add779");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add780() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add780");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add781() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add781");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add782() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add782");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add783() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add783");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add784() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add784");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add785() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add785");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add786() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add786");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add787() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add787");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add788() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add788");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add789() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add789");
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
        sub = getCollection().subList(1, size);
        getCollection().clear();
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_add790() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_add790");
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
        sub = getCollection().subList(1, size);
        getCollection().clear();
        failFastAll(sub);
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
        sub = getCollection().subList(2, size);
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
        sub = getCollection().subList(0, size);
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove605() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove605");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
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
        sub = getCollection().subList(1, size);
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove606() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove606");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove607() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove607");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove608() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove608");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
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
        sub = getCollection().subList(1, size);
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove609() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove609");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetFull();
        final int size = getCollection().size();
        List<E> sub = getCollection().subList(1, size);
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove610() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove610");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove611() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove611");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
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
        sub = getCollection().subList(1, size);
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove612() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove612");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove613() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove613");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove614() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove614");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
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
        sub = getCollection().subList(1, size);
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove615() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove615");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove616() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove616");
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
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove617() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove617");
        if (!(isFailFastSupported())) {
            return ;
        } 
        if (!(isRemoveSupported())) {
            return ;
        } 
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
        sub = getCollection().subList(1, size);
        getCollection().clear();
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove618() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove618");
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
        sub = getCollection().subList(1, size);
        failFastAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}
     * if elements are removed from the original list.
     */
@Test(timeout = 1000)
    public void testListSubListFailFastOnRemove_remove619() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListSubListFailFastOnRemove_remove619");
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

