package org.apache.commons.collections4.list;

import org.junit.Test;

/** 
 * Test case for {@link AbstractLinkedList}.
 * 
 * @version $Id$
 */
public abstract class AbstractLinkedListTest<E> extends AbstractListTest<E> {
    public AbstractLinkedListTest(final String testName) {
        super(testName);
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_add625() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_add625");
        resetEmpty();
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_add626() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_add626");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_add627() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_add627");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_add628() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_add628");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_add629() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_add629");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_add630() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_add630");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_add631() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_add631");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_add632() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_add632");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_add633() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_add633");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_add634() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_add634");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveFirst() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveFirst_literalMutation707() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_literalMutation707");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "foo" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveFirst_literalMutation708() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_literalMutation708");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "foo" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveFirst_literalMutation709() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_literalMutation709");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("foo")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveFirst_literalMutation710() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_literalMutation710");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("foo")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_remove498() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_remove498");
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_remove499() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_remove499");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_remove500() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_remove500");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_remove501() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_remove501");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_remove502() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_remove502");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_remove503() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_remove503");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_remove504() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_remove504");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        checkNodes();
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_remove505() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_remove505");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveFirst_remove506() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFirst_remove506");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeFirst();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,list,2025,list.removeFirst());
        list.addLast(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,list,2027,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,list,2029,list.removeFirst());
        checkNodes();
        list.addLast(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,list,2031,list.removeFirst());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveLast_add635() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_add635");
        resetEmpty();
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveLast_add636() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_add636");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveLast_add637() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_add637");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveLast_add638() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_add638");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        list.addFirst(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveLast_add639() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_add639");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        checkNodes();
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveLast_add640() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_add640");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveLast_add641() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_add641");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveLast() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveLast_literalMutation712() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_literalMutation712");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "foo" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveLast_literalMutation713() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_literalMutation713");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "foo" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveLast_literalMutation714() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_literalMutation714");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("foo")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveLast_literalMutation715() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_literalMutation715");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("foo")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveLast_remove507() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_remove507");
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveLast_remove508() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_remove508");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveLast_remove509() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_remove509");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveLast_remove510() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_remove510");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveLast_remove511() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_remove511");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveLast_remove512() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveLast_remove512");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isRemoveSupported())) {
            try {
                list.removeLast();
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2034,list,2033,list.removeLast());
        list.addFirst(((E)("value3")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2036,list,2035,list.removeLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,list,2037,list.removeLast());
        list.addFirst(((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2040,list,2039,list.removeFirst());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_add602() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_add602");
        resetEmpty();
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_add603() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_add603");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_add604() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_add604");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_add605() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_add605");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_add606() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_add606");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_add607() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_add607");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_add608() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_add608");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_add609() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_add609");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_add610() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_add610");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_add611() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_add611");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_add612() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_add612");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_add613() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_add613");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddNodeAfter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddNodeAfter_literalMutation679() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_literalMutation679");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("foo")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddNodeAfter_literalMutation680() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_literalMutation680");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(1, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddNodeAfter_literalMutation681() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_literalMutation681");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, true), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddNodeAfter_literalMutation682() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_literalMutation682");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddNodeAfter_literalMutation683() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_literalMutation683");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(-1, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddNodeAfter_literalMutation684() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_literalMutation684");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, true), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddNodeAfter_literalMutation685() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_literalMutation685");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("foo")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddNodeAfter_literalMutation686() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_literalMutation686");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(-1, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddNodeAfter_literalMutation687() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_literalMutation687");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, true), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddNodeAfter_literalMutation688() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_literalMutation688");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("foo")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddNodeAfter_literalMutation689() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_literalMutation689");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(3, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddNodeAfter_literalMutation690() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_literalMutation690");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddNodeAfter_literalMutation691() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_literalMutation691");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("foo")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_remove480() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_remove480");
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_remove481() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_remove481");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_remove482() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_remove482");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_remove483() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_remove483");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_remove484() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_remove484");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_remove485() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_remove485");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_remove486() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_remove486");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_remove487() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_remove487");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_remove488() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_remove488");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_remove489() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_remove489");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        checkNodes();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testAddNodeAfter_remove490() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddNodeAfter_remove490");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        if (!(isAddSupported())) {
            try {
                list.addFirst(null);
            } catch (final UnsupportedOperationException ex) {
            }
        } 
        list.addFirst(((E)("value1")));
        list.addNodeAfter(list.getNode(0, false), ((E)("value2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,list,2001,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2004,list,2003,list.getLast());
        list.removeFirst();
        list.addNodeAfter(list.getNode(0, false), ((E)("value3")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2006,list,2005,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2008,list,2007,list.getLast());
        list.addNodeAfter(list.getNode(0, false), ((E)("value4")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,list,2009,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,list,2011,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,list,2013,list.get(1));
        list.addNodeAfter(list.getNode(2, false), ((E)("value5")));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,list,2015,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,list,2017,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,list,2019,list.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,list,2021,list.getLast());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_add642() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_add642");
        resetEmpty();
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_add643() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_add643");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_add644() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_add644");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_add645() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_add645");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_add646() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_add646");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_add647() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_add647");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_add648() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_add648");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_add649() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_add649");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_add650() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_add650");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_add651() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_add651");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_add652() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_add652");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveNode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveNode_literalMutation717() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_literalMutation717");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "foo" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveNode_literalMutation718() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_literalMutation718");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "foo" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveNode_literalMutation719() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_literalMutation719");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(-1, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveNode_literalMutation720() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_literalMutation720");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, true));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveNode_literalMutation721() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_literalMutation721");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("foo")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveNode_literalMutation722() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_literalMutation722");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("foo")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveNode_literalMutation723() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_literalMutation723");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(2, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveNode_literalMutation724() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_literalMutation724");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveNode_literalMutation725() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_literalMutation725");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(2, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveNode_literalMutation726() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_literalMutation726");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_remove513() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_remove513");
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_remove514() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_remove514");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_remove515() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_remove515");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_remove516() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_remove516");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_remove517() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_remove517");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_remove518() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_remove518");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_remove519() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_remove519");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_remove520() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_remove520");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_remove521() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_remove521");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_remove522() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_remove522");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveNode_remove523() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveNode_remove523");
        resetEmpty();
        if ((!(isAddSupported())) || (!(isRemoveSupported()))) {
            return ;
        } 
        final AbstractLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.removeNode(list.getNode(0, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2042,list,2041,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,list,2043,list.getLast());
        list.addFirst(((E)("value1")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,list,2045,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,list,2047,list.getLast());
        checkNodes();
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_add614() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_add614");
        resetEmpty();
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_add615() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_add615");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_add616() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_add616");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_add617() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_add617");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_add618() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_add618");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_add619() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_add619");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_add620() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_add620");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_add621() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_add621");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_add622() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_add622");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_add623() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_add623");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_add624() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_add624");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetNode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetNode_literalMutation693() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_literalMutation693");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetNode_literalMutation694() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_literalMutation694");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetNode_literalMutation695() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_literalMutation695");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "foo" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetNode_literalMutation696() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_literalMutation696");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "foo" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetNode_literalMutation697() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_literalMutation697");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("foo")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetNode_literalMutation698() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_literalMutation698");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetNode_literalMutation699() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_literalMutation699");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, true));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetNode_literalMutation700() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_literalMutation700");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(3, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetNode_literalMutation701() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_literalMutation701");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetNode_literalMutation702() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_literalMutation702");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetNode_literalMutation703() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_literalMutation703");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetNode_literalMutation704() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_literalMutation704");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(2, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGetNode_literalMutation705() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_literalMutation705");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_remove491() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_remove491");
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_remove492() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_remove492");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_remove493() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_remove493");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_remove494() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_remove494");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_remove495() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_remove495");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_remove496() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_remove496");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        checkNodes();
        list.addFirst(((E)("value0")));
        checkNodes();
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testGetNode_remove497() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetNode_remove497");
        resetEmpty();
        final AbstractLinkedList<E> list = getCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,list.getNode(0, true).previous);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,list.getNode(0, true).next);
        try {
            list.getNode(0, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "value1" , "value2" }))));
        list.addFirst(((E)("value0")));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        checkNodes();
        try {
            list.getNode(2, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(-1, false);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            list.getNode(3, true);
        } catch (final IndexOutOfBoundsException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    protected void checkNodes() {
        final AbstractLinkedList<E> list = getCollection();
        for (int i = 0 ; i < (list.size) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,list.getNode(i, false).next);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1997,list,1996,list.getNode((i + 1), true));
            if (i < ((list.size) - 1)) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,list.getNode((i + 1), false).previous);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,list,1999,list.getNode(i, false));
            } 
        }
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public AbstractLinkedList<E> getCollection() {
        return ((AbstractLinkedList<E>)(super.getCollection()));
    }
}

