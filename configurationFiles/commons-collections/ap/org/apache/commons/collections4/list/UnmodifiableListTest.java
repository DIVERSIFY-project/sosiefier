package org.apache.commons.collections4.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;

/** 
 * Extension of {@link AbstractListTest} for exercising the
 * {@link UnmodifiableList} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class UnmodifiableListTest<E> extends AbstractListTest<E> {
    public UnmodifiableListTest(final String testName) {
        super(testName);
    }

    @Override
    public UnmodifiableList<E> makeObject() {
        return new UnmodifiableList<E>(new ArrayList<E>());
    }

    @Override
    public UnmodifiableList<E> makeFullCollection() {
        final ArrayList<E> list = new ArrayList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return new UnmodifiableList<E>(list);
    }

    @Override
    public boolean isSetSupported() {
        return false;
    }

    @Override
    public boolean isAddSupported() {
        return false;
    }

    @Override
    public boolean isRemoveSupported() {
        return false;
    }

    protected UnmodifiableList<E> list;

    protected ArrayList<E> array;

    @SuppressWarnings(value = "unchecked")
    protected void setupList() {
        list = makeFullCollection();
        array = new ArrayList<E>();
        array.add(((E)(java.lang.Integer.valueOf(1))));
    }

    /** 
     * Verify that base list and sublists are not modifiable
     */
@Test(timeout = 1000)
    public void testUnmodifiable_add844() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable_add844");
        setupList();
        setupList();
        verifyUnmodifiable(list);
        verifyUnmodifiable(list.subList(0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that base list and sublists are not modifiable
     */
@Test(timeout = 1000)
    public void testUnmodifiable_add845() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable_add845");
        setupList();
        verifyUnmodifiable(list);
        verifyUnmodifiable(list);
        verifyUnmodifiable(list.subList(0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that base list and sublists are not modifiable
     */
@Test(timeout = 1000)
    public void testUnmodifiable_add846() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable_add846");
        setupList();
        verifyUnmodifiable(list);
        verifyUnmodifiable(list.subList(0, 2));
        verifyUnmodifiable(list.subList(0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that base list and sublists are not modifiable
     */
public void testUnmodifiable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable");
        setupList();
        verifyUnmodifiable(list);
        verifyUnmodifiable(list.subList(-1, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that base list and sublists are not modifiable
     */
public void testUnmodifiable_literalMutation873() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable_literalMutation873");
        setupList();
        verifyUnmodifiable(list);
        verifyUnmodifiable(list.subList(0, 3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that base list and sublists are not modifiable
     */
@Test(timeout = 1000)
    public void testUnmodifiable_remove663() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable_remove663");
        verifyUnmodifiable(list);
        verifyUnmodifiable(list.subList(0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that base list and sublists are not modifiable
     */
@Test(timeout = 1000)
    public void testUnmodifiable_remove664() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable_remove664");
        setupList();
        verifyUnmodifiable(list.subList(0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that base list and sublists are not modifiable
     */
@Test(timeout = 1000)
    public void testUnmodifiable_remove665() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable_remove665");
        setupList();
        verifyUnmodifiable(list.subList(0, 2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final List<E> list = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2387,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2389,null,2388,org.apache.commons.collections4.list.UnmodifiableList.unmodifiableList(list));
        try {
            UnmodifiableList.unmodifiableList(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecorateFactory_add843() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory_add843");
        final List<E> list = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2387,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2389,null,2388,org.apache.commons.collections4.list.UnmodifiableList.unmodifiableList(list));
        try {
            UnmodifiableList.unmodifiableList(null);
            UnmodifiableList.unmodifiableList(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    protected void verifyUnmodifiable(final List<E> list) {
        try {
            list.add(0, ((E)(java.lang.Integer.valueOf(0))));
        } catch (final UnsupportedOperationException e) {
        }
        try {
            list.add(((E)(java.lang.Integer.valueOf(0))));
        } catch (final UnsupportedOperationException e) {
        }
        try {
            list.addAll(0, array);
        } catch (final UnsupportedOperationException e) {
        }
        try {
            list.addAll(array);
        } catch (final UnsupportedOperationException e) {
        }
        try {
            list.clear();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            list.remove(0);
        } catch (final UnsupportedOperationException e) {
        }
        try {
            list.remove(java.lang.Integer.valueOf(0));
        } catch (final UnsupportedOperationException e) {
        }
        try {
            list.removeAll(array);
        } catch (final UnsupportedOperationException e) {
        }
        try {
            list.retainAll(array);
        } catch (final UnsupportedOperationException e) {
        }
        try {
            list.set(0, ((E)(java.lang.Integer.valueOf(0))));
        } catch (final UnsupportedOperationException e) {
        }
    }

    /** 
     * Verify that iterator is not modifiable
     */
@Test(timeout = 1000)
    public void testUnmodifiableIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableIterator");
        setupList();
        setupList();
        final Iterator<E> iterator = list.iterator();
        try {
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that iterator is not modifiable
     */
@Test(timeout = 1000)
    public void testUnmodifiableIterator_add848() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableIterator_add848");
        setupList();
        final Iterator<E> iterator = list.iterator();
        try {
            iterator.next();
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that iterator is not modifiable
     */
@Test(timeout = 1000)
    public void testUnmodifiableIterator_add849() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableIterator_add849");
        setupList();
        final Iterator<E> iterator = list.iterator();
        try {
            iterator.next();
            iterator.remove();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that iterator is not modifiable
     */
@Test(timeout = 1000)
    public void testUnmodifiableIterator_remove666() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableIterator_remove666");
        final Iterator<E> iterator = list.iterator();
        try {
            iterator.next();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

