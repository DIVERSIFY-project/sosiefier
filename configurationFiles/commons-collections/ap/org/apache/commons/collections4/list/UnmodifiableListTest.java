package org.apache.commons.collections4.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
public void testUnmodifiable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable");
        setupList();
        verifyUnmodifiable(list);
        verifyUnmodifiable(list.subList(1, 2));
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
public void testUnmodifiableIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableIterator");
        setupList();
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

