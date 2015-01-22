package org.apache.commons.collections4.queue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.collections4.Predicate;
import java.util.Queue;

/** 
 * Extension of {@link PredicatedCollectionTest} for exercising the
 * {@link PredicatedQueue} implementation.
 * 
 * @version $Id$
 * @since 4.0
 */
public class PredicatedQueueTest<E> extends AbstractQueueTest<E> {
    public PredicatedQueueTest(final String testName) {
        super(testName);
    }

    protected Predicate<E> truePredicate = org.apache.commons.collections4.functors.TruePredicate.<E>truePredicate();

    protected Queue<E> decorateCollection(final Queue<E> queue, final Predicate<E> predicate) {
        return org.apache.commons.collections4.queue.PredicatedQueue.predicatedQueue(queue, predicate);
    }

    @Override
    public Queue<E> makeObject() {
        return decorateCollection(new LinkedList<E>(), truePredicate);
    }

    @Override
    public Queue<E> makeFullCollection() {
        final Queue<E> queue = new LinkedList<E>();
        queue.addAll(java.util.Arrays.asList(getFullElements()));
        return decorateCollection(queue, truePredicate);
    }

    @Override
    public Collection<E> makeConfirmedCollection() {
        return new LinkedList<E>();
    }

    @Override
    public Collection<E> makeConfirmedFullCollection() {
        final List<E> list = new LinkedList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return list;
    }

    protected Predicate<E> testPredicate = new Predicate<E>() {
        public boolean evaluate(final E o) {
            return o instanceof String;
        }
    };

    public Queue<E> makeTestQueue() {
        return decorateCollection(new LinkedList<E>(), testPredicate);
    }

    @SuppressWarnings(value = "unchecked")
    public void testGet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGet");
        final Queue<E> queue = makeTestQueue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,queue,6062,queue.peek());
        queue.add(((E)("one")));
        queue.add(((E)("two")));
        queue.add(((E)("three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,queue,6064,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGet_literalMutation1772() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGet_literalMutation1772");
        final Queue<E> queue = makeTestQueue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,queue,6062,queue.peek());
        queue.add(((E)("foo")));
        queue.add(((E)("two")));
        queue.add(((E)("three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,queue,6064,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGet_literalMutation1773() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGet_literalMutation1773");
        final Queue<E> queue = makeTestQueue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,queue,6062,queue.peek());
        queue.add(((E)("one")));
        queue.add(((E)("foo")));
        queue.add(((E)("three")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,queue,6064,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testGet_literalMutation1774() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGet_literalMutation1774");
        final Queue<E> queue = makeTestQueue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6063,queue,6062,queue.peek());
        queue.add(((E)("one")));
        queue.add(((E)("two")));
        queue.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6065,queue,6064,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove");
        final Queue<E> queue = makeTestQueue();
        queue.add(((E)("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,queue,6066,queue.poll());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6069,queue,6068,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove_literalMutation1775() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_literalMutation1775");
        final Queue<E> queue = makeTestQueue();
        queue.add(((E)("one")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,queue,6066,queue.poll());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6069,queue,6068,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemove_literalMutation1776() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_literalMutation1776");
        final Queue<E> queue = makeTestQueue();
        queue.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6067,queue,6066,queue.poll());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6069,queue,6068,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

