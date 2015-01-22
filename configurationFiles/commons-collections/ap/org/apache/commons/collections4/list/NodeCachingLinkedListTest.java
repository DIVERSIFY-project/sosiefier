package org.apache.commons.collections4.list;

import java.util.LinkedList;
import junit.framework.Test;

/** 
 * Test class for NodeCachingLinkedList, a performance optimised LinkedList.
 * 
 * @version $Id$
 */
public class NodeCachingLinkedListTest<E> extends AbstractLinkedListTest<E> {
    public NodeCachingLinkedListTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(NodeCachingLinkedListTest.class);
    }

    @Override
    public NodeCachingLinkedList<E> makeObject() {
        return new NodeCachingLinkedList<E>();
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation809() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation809");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "foo" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation810() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation810");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "foo" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation811() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation811");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "foo" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation812() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation812");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "foo" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation813() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation813");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(1);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation814() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation814");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "foo" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation815() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation815");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "foo" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation816() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation816");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "foo" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation817() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation817");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "foo" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation818() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation818");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(1, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation819() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation819");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation820() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation820");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(-1, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation821() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation821");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, true));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation822() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation822");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(1, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation823() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation823");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, true));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation824() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation824");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "foo" , "2" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation825() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation825");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "foo" , "3" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation826() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation826");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "foo" , "4" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testShrinkCache_literalMutation827() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShrinkCache_literalMutation827");
        if ((!(isRemoveSupported())) || (!(isAddSupported()))) {
            return ;
        } 
        resetEmpty();
        final NodeCachingLinkedList<E> list = getCollection();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        list.removeAllNodes();
        list.setMaximumCacheSize(2);
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "4" }))));
        checkNodes();
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        list.removeNode(list.getNode(0, false));
        checkNodes();
        list.addAll(java.util.Arrays.asList(((E[])(new String[]{ "1" , "2" , "3" , "foo" }))));
        checkNodes();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public static void compareSpeed() {
        final NodeCachingLinkedList<java.lang.Object> ncll = new NodeCachingLinkedList<java.lang.Object>();
        final LinkedList<java.lang.Object> ll = new LinkedList<java.lang.Object>();
        final Object o1 = new Object();
        final Object o2 = new Object();
        final int loopCount = 4000000;
        long startTime;
        long endTime;
        System.out.println("Testing relative execution time of commonly-used methods...");
        startTime = System.currentTimeMillis();
        for (int x = loopCount ; x > 0 ; x--) {
            ll.addFirst(o1);
            ll.addLast(o2);
            ll.removeFirst();
            ll.removeLast();
            ll.add(o1);
            ll.remove(0);
            ll.addFirst(o1);
            ll.addLast(o2);
            ll.removeFirst();
            ll.removeLast();
            ll.add(o1);
            ll.remove(0);
            ll.addFirst(o1);
            ll.addLast(o2);
            ll.removeFirst();
            ll.removeLast();
            ll.add(o1);
            ll.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println((("Time with LinkedList: " + (endTime - startTime)) + " ms"));
        startTime = System.currentTimeMillis();
        for (int x = loopCount ; x > 0 ; x--) {
            ncll.addFirst(o1);
            ncll.addLast(o2);
            ncll.removeFirst();
            ncll.removeLast();
            ncll.add(o1);
            ncll.remove(0);
            ncll.addFirst(o1);
            ncll.addLast(o2);
            ncll.removeFirst();
            ncll.removeLast();
            ncll.add(o1);
            ncll.remove(0);
            ncll.addFirst(o1);
            ncll.addLast(o2);
            ncll.removeFirst();
            ncll.removeLast();
            ncll.add(o1);
            ncll.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println((("Time with NodeCachingLinkedList: " + (endTime - startTime)) + " ms"));
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public NodeCachingLinkedList<E> getCollection() {
        return ((NodeCachingLinkedList<E>)(super.getCollection()));
    }
}

