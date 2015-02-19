package org.apache.commons.collections4.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;

/** 
 * Extension of {@link AbstractSetTest} for exercising the {@link ListOrderedSet}
 * implementation.
 * 
 * @version $Id$
 * @since 3.1
 */
public class ListOrderedSet2Test<E> extends AbstractSetTest<E> {
    private static final Integer ZERO = Integer.valueOf(0);

    private static final Integer ONE = Integer.valueOf(1);

    private static final Integer TWO = Integer.valueOf(2);

    private static final Integer THREE = Integer.valueOf(3);

    public ListOrderedSet2Test(final String testName) {
        super(testName);
    }

    @Override
    public ListOrderedSet<E> makeObject() {
        return new ListOrderedSet<E>();
    }

    @SuppressWarnings(value = "unchecked")
    protected ListOrderedSet<E> setupSet() {
        final ListOrderedSet<E> set = makeObject();
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        return set;
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testOrdering_add1964() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_add1964");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1826() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1826");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 1 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1827() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1827");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 9 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1828() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1828");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1829() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1829");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 9 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1830() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1830");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 3) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1831() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1831");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1832() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1832");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 9 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1833() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1833");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 1) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1834() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1834");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 1 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1835() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1835");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 9 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1836() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1836");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 2 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1837() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1837");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 11 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1838() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1838");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 3) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1839() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1839");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1840() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1840");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 9 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1841() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1841");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 1) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testOrdering_remove1530() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_remove1530");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6202,null,6201,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,it,6203,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,null,6207,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6210,it,6209,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,set,6211,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,null,6213,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6216,null,6215,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6218,it,6217,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddRemove_add1960() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddRemove_add1960");
        final ListOrderedSet<E> set = makeObject();
        final List<E> view = set.asList();
        set.add(((E)(ZERO)));
        set.add(((E)(ZERO)));
        set.add(((E)(ONE)));
        set.add(((E)(TWO)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6158,set,6157,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6169,view,6168,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,view,6171,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,view,6174,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,view,6177,view.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6180,set,6179,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6182,set,6181,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,set,6183,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.TWO));
        set.remove(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6194,view,6193,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6197,view,6196,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6198,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6200,view,6199,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddRemove_add1961() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddRemove_add1961");
        final ListOrderedSet<E> set = makeObject();
        final List<E> view = set.asList();
        set.add(((E)(ZERO)));
        set.add(((E)(ONE)));
        set.add(((E)(ONE)));
        set.add(((E)(TWO)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6158,set,6157,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6169,view,6168,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,view,6171,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,view,6174,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,view,6177,view.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6180,set,6179,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6182,set,6181,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,set,6183,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.TWO));
        set.remove(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6194,view,6193,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6197,view,6196,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6198,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6200,view,6199,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddRemove_add1962() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddRemove_add1962");
        final ListOrderedSet<E> set = makeObject();
        final List<E> view = set.asList();
        set.add(((E)(ZERO)));
        set.add(((E)(ONE)));
        set.add(((E)(TWO)));
        set.add(((E)(TWO)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6158,set,6157,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6169,view,6168,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,view,6171,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,view,6174,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,view,6177,view.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6180,set,6179,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6182,set,6181,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,set,6183,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.TWO));
        set.remove(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6194,view,6193,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6197,view,6196,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6198,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6200,view,6199,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddRemove_add1963() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddRemove_add1963");
        final ListOrderedSet<E> set = makeObject();
        final List<E> view = set.asList();
        set.add(((E)(ZERO)));
        set.add(((E)(ONE)));
        set.add(((E)(TWO)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6158,set,6157,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6169,view,6168,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,view,6171,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,view,6174,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,view,6177,view.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6180,set,6179,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6182,set,6181,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,set,6183,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.TWO));
        set.remove(1);
        set.remove(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6194,view,6193,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6197,view,6196,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6198,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6200,view,6199,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testListAddRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddRemove");
        final ListOrderedSet<E> set = makeObject();
        final List<E> view = set.asList();
        set.add(((E)(ZERO)));
        set.add(((E)(ONE)));
        set.add(((E)(TWO)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6158,set,6157,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6169,view,6168,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,view,6171,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,view,6174,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,view,6177,view.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6180,set,6179,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6182,set,6181,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,set,6183,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.TWO));
        set.remove(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6194,view,6193,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6197,view,6196,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6198,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6200,view,6199,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testListAddRemove_literalMutation1824() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddRemove_literalMutation1824");
        final ListOrderedSet<E> set = makeObject();
        final List<E> view = set.asList();
        set.add(((E)(ZERO)));
        set.add(((E)(ONE)));
        set.add(((E)(TWO)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6158,set,6157,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6169,view,6168,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,view,6171,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,view,6174,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,view,6177,view.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6180,set,6179,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6182,set,6181,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,set,6183,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.TWO));
        set.remove(0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6194,view,6193,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6197,view,6196,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6198,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6200,view,6199,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddRemove_remove1526() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddRemove_remove1526");
        final ListOrderedSet<E> set = makeObject();
        final List<E> view = set.asList();
        set.add(((E)(ONE)));
        set.add(((E)(TWO)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6158,set,6157,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6169,view,6168,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,view,6171,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,view,6174,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,view,6177,view.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6180,set,6179,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6182,set,6181,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,set,6183,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.TWO));
        set.remove(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6194,view,6193,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6197,view,6196,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6198,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6200,view,6199,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddRemove_remove1527() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddRemove_remove1527");
        final ListOrderedSet<E> set = makeObject();
        final List<E> view = set.asList();
        set.add(((E)(ONE)));
        set.add(((E)(TWO)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6158,set,6157,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6169,view,6168,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,view,6171,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,view,6174,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,view,6177,view.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6180,set,6179,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6182,set,6181,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,set,6183,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.TWO));
        set.remove(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6194,view,6193,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6197,view,6196,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6198,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6200,view,6199,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddRemove_remove1528() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddRemove_remove1528");
        final ListOrderedSet<E> set = makeObject();
        final List<E> view = set.asList();
        set.add(((E)(ONE)));
        set.add(((E)(TWO)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6158,set,6157,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6169,view,6168,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,view,6171,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,view,6174,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,view,6177,view.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6180,set,6179,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6182,set,6181,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,set,6183,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.TWO));
        set.remove(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6194,view,6193,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6197,view,6196,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6198,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6200,view,6199,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddRemove_remove1529() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddRemove_remove1529");
        final ListOrderedSet<E> set = makeObject();
        final List<E> view = set.asList();
        set.add(((E)(ZERO)));
        set.add(((E)(ONE)));
        set.add(((E)(TWO)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6158,set,6157,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6169,view,6168,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,view,6171,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,view,6174,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,view,6177,view.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6180,set,6179,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6182,set,6181,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,set,6183,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6194,view,6193,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6197,view,6196,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6198,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6200,view,6199,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_add1950() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_add1950");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_add1951() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_add1951");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_add1952() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_add1952");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_add1953() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_add1953");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_add1954() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_add1954");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_add1955() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_add1955");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_add1956() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_add1956");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_add1957() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_add1957");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_add1958() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_add1958");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_add1959() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_add1959");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testListAddIndexed() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testListAddIndexed_literalMutation1818() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_literalMutation1818");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(2, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testListAddIndexed_literalMutation1819() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_literalMutation1819");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(-1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testListAddIndexed_literalMutation1820() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_literalMutation1820");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testListAddIndexed_literalMutation1821() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_literalMutation1821");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(1, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testListAddIndexed_literalMutation1822() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_literalMutation1822");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(2, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_remove1516() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_remove1516");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_remove1517() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_remove1517");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_remove1518() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_remove1518");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_remove1519() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_remove1519");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_remove1520() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_remove1520");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_remove1521() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_remove1521");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_remove1522() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_remove1522");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_remove1523() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_remove1523");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_remove1524() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_remove1524");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListAddIndexed_remove1525() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_remove1525");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6111,set,6110,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6112,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6114,set,6113,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6115,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6117,set,6116,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6118,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6120,set,6119,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6122,set,6121,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6123,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6125,set,6124,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6126,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6128,set,6127,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6129,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6131,set,6130,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6133,set,6132,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6134,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6137,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6139,set,6138,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,set,6141,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,set,6143,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6145,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6147,set,6146,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

