package org.apache.commons.collections4.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    public void testOrdering() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1826() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1826");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = -1 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1827() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1827");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 9 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1828() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1828");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = -1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1829() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1829");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 9 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1830() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1830");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 3) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1831() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1831");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1832() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1832");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 11 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1833() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1833");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 3) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1834() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1834");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = -1 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1835() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1835");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 9 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1836() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1836");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 2 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1837() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1837");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 11 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1838() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1838");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 1) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1839() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1839");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1840() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1840");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 9 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1841() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1841");
        final ListOrderedSet<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6241,null,6240,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6243,it,6242,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6245,set,6244,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6247,null,6246,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6249,it,6248,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6251,set,6250,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6253,null,6252,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 1) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6255,null,6254,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6257,it,6256,it.next());
        }
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6197,set,6196,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6198,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6200,set,6199,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6201,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6203,set,6202,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,view,6207,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6209,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6211,view,6210,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,view,6213,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6215,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6217,view,6216,view.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6219,set,6218,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6221,set,6220,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6223,set,6222,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.TWO));
        set.remove(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6225,set,6224,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,set,6227,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6229,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6231,set,6230,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6233,view,6232,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6236,view,6235,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6237,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6239,view,6238,view.get(1));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6197,set,6196,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6198,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6200,set,6199,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6201,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6203,set,6202,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6204,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6206,set,6205,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6208,view,6207,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6209,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6211,view,6210,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6212,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6214,view,6213,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6215,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6217,view,6216,view.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6219,set,6218,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6221,set,6220,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6223,set,6222,set.indexOf(org.apache.commons.collections4.set.ListOrderedSet2Test.TWO));
        set.remove(0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6225,set,6224,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,set,6227,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6229,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6231,set,6230,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6233,view,6232,view.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6236,view,6235,view.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6237,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6239,view,6238,view.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testListAddIndexed() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6157,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,set,6158,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6168,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,set,6169,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,set,6171,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,set,6174,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,set,6177,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6179,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6181,set,6180,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6183,set,6182,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6193,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,set,6194,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testListAddIndexed_literalMutation1818() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_literalMutation1818");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6157,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,set,6158,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6168,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,set,6169,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,set,6171,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,set,6174,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,set,6177,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6179,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6181,set,6180,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6183,set,6182,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6193,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,set,6194,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testListAddIndexed_literalMutation1819() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_literalMutation1819");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6157,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,set,6158,set.get(2));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6168,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,set,6169,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,set,6171,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,set,6174,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,set,6177,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6179,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6181,set,6180,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6183,set,6182,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6193,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,set,6194,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testListAddIndexed_literalMutation1820() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_literalMutation1820");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6157,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,set,6158,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6168,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,set,6169,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(-1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,set,6171,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,set,6174,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,set,6177,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6179,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6181,set,6180,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6183,set,6182,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6193,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,set,6194,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testListAddIndexed_literalMutation1821() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_literalMutation1821");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6157,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,set,6158,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6168,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,set,6169,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,set,6171,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,set,6174,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,set,6177,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6179,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6181,set,6180,set.get(2));
        list.add(-1, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(1, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6183,set,6182,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6193,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,set,6194,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testListAddIndexed_literalMutation1822() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListAddIndexed_literalMutation1822");
        final ListOrderedSet<E> set = makeObject();
        set.add(((E)(ZERO)));
        set.add(((E)(TWO)));
        set.add(1, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6150,set,6149,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6151,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6153,set,6152,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6154,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6156,set,6155,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6157,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6159,set,6158,set.get(2));
        set.add(0, ((E)(ONE)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6161,set,6160,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6162,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6164,set,6163,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6165,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6167,set,6166,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6168,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6170,set,6169,set.get(2));
        final List<E> list = new ArrayList<E>();
        list.add(((E)(ZERO)));
        list.add(((E)(TWO)));
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6172,set,6171,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6173,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6175,set,6174,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6176,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6178,set,6177,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6179,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6181,set,6180,set.get(2));
        list.add(0, ((E)(THREE)));
        set.remove(TWO);
        set.addAll(0, list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6183,set,6182,set.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6184,org.apache.commons.collections4.set.ListOrderedSet2Test.ZERO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6186,set,6185,set.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6187,org.apache.commons.collections4.set.ListOrderedSet2Test.THREE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6189,set,6188,set.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6190,org.apache.commons.collections4.set.ListOrderedSet2Test.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6192,set,6191,set.get(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6193,org.apache.commons.collections4.set.ListOrderedSet2Test.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6195,set,6194,set.get(3));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

