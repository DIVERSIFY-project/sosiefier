package org.apache.commons.collections4;

import java.util.EmptyStackException;
import junit.framework.Test;

/** 
 * Tests ArrayStack.
 * 
 * @version $Id$
 */
@SuppressWarnings(value = "deprecation")
public class ArrayStackTest<E> extends AbstractArrayListTest<E> {
    public ArrayStackTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(ArrayStackTest.class);
    }

    @Override
    public ArrayStack<E> makeObject() {
        return new ArrayStack<E>();
    }

    public void testNewStack() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStack");
        final ArrayStack<E> stack = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6449,stack,6448,stack.empty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6451,stack,6450,stack.size());
        try {
            stack.peek();
        } catch (final EmptyStackException e) {
        }
        try {
            stack.pop();
        } catch (final EmptyStackException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPushPeekPop() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPushPeekPop");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("First Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6452,!(stack.empty()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6454,stack,6453,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6456,stack,6455,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,stack,6457,stack.size());
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,stack,6459,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,stack,6461,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6464,stack,6463,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,stack,6465,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,stack,6467,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6470,stack,6469,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6472,stack,6471,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6474,stack,6473,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPushPeekPop_literalMutation1957() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPushPeekPop_literalMutation1957");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6452,!(stack.empty()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6454,stack,6453,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6456,stack,6455,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,stack,6457,stack.size());
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,stack,6459,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,stack,6461,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6464,stack,6463,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,stack,6465,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,stack,6467,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6470,stack,6469,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6472,stack,6471,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6474,stack,6473,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPushPeekPop_literalMutation1958() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPushPeekPop_literalMutation1958");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("First Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6452,!(stack.empty()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6454,stack,6453,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6456,stack,6455,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6458,stack,6457,stack.size());
        stack.push(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6460,stack,6459,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6462,stack,6461,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6464,stack,6463,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6466,stack,6465,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6468,stack,6467,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6470,stack,6469,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6472,stack,6471,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6474,stack,6473,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public void testSearch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("First Item")));
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6476,stack,6475,stack.search("Second Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6478,stack,6477,stack.search("First Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6479,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6481,stack,6480,stack.search("Missing Item"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1959() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1959");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("First Item")));
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6476,stack,6475,stack.search("Second Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6478,stack,6477,stack.search("First Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6479,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6481,stack,6480,stack.search("Missing Item"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1960() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1960");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("foo")));
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6476,stack,6475,stack.search("Second Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6478,stack,6477,stack.search("First Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6479,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6481,stack,6480,stack.search("Missing Item"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1961() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1961");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("First Item")));
        stack.push(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6476,stack,6475,stack.search("Second Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6478,stack,6477,stack.search("First Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6479,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6481,stack,6480,stack.search("Missing Item"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

