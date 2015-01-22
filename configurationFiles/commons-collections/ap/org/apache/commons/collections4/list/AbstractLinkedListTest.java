package org.apache.commons.collections4.list;


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
        list.addNodeAfter(list.getNode(-1, false), ((E)("value2")));
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
        list.addNodeAfter(list.getNode(1, false), ((E)("value3")));
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
        list.addNodeAfter(list.getNode(1, false), ((E)("value5")));
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
        list.addNodeAfter(list.getNode(2, true), ((E)("value5")));
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
        list.removeNode(list.getNode(1, false));
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
        list.removeNode(list.getNode(0, false));
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
        list.removeNode(list.getNode(1, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,list,2049,list.getFirst());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2052,list,2051,list.getLast());
        checkNodes();
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
            list.getNode(-1, false);
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
            list.getNode(0, true);
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
        list.removeNode(list.getNode(2, false));
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
            list.getNode(0, false);
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
            list.getNode(-1, true);
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

