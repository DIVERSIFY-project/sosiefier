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

    @org.junit.Test(timeout = 1000)
    public void testNewStack() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStack");
        final ArrayStack<E> stack = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6410,stack,6409,stack.empty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6412,stack,6411,stack.size());
        try {
            stack.peek();
            stack.peek();
        } catch (final EmptyStackException e) {
        }
        try {
            stack.pop();
        } catch (final EmptyStackException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testNewStack_add2043() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewStack_add2043");
        final ArrayStack<E> stack = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6410,stack,6409,stack.empty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6412,stack,6411,stack.size());
        try {
            stack.peek();
        } catch (final EmptyStackException e) {
        }
        try {
            stack.pop();
            stack.pop();
        } catch (final EmptyStackException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testPushPeekPop_add2044() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPushPeekPop_add2044");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("First Item")));
        stack.push(((E)("First Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6413,!(stack.empty()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6415,stack,6414,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6417,stack,6416,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6419,stack,6418,stack.size());
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6421,stack,6420,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6423,stack,6422,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6425,stack,6424,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6427,stack,6426,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6429,stack,6428,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6431,stack,6430,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6433,stack,6432,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6435,stack,6434,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testPushPeekPop_add2045() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPushPeekPop_add2045");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("First Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6413,!(stack.empty()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6415,stack,6414,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6417,stack,6416,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6419,stack,6418,stack.size());
        stack.push(((E)("Second Item")));
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6421,stack,6420,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6423,stack,6422,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6425,stack,6424,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6427,stack,6426,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6429,stack,6428,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6431,stack,6430,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6433,stack,6432,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6435,stack,6434,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPushPeekPop() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPushPeekPop");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("First Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6413,!(stack.empty()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6415,stack,6414,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6417,stack,6416,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6419,stack,6418,stack.size());
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6421,stack,6420,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6423,stack,6422,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6425,stack,6424,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6427,stack,6426,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6429,stack,6428,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6431,stack,6430,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6433,stack,6432,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6435,stack,6434,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPushPeekPop_literalMutation1957() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPushPeekPop_literalMutation1957");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6413,!(stack.empty()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6415,stack,6414,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6417,stack,6416,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6419,stack,6418,stack.size());
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6421,stack,6420,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6423,stack,6422,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6425,stack,6424,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6427,stack,6426,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6429,stack,6428,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6431,stack,6430,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6433,stack,6432,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6435,stack,6434,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testPushPeekPop_literalMutation1958() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPushPeekPop_literalMutation1958");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("First Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6413,!(stack.empty()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6415,stack,6414,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6417,stack,6416,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6419,stack,6418,stack.size());
        stack.push(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6421,stack,6420,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6423,stack,6422,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6425,stack,6424,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6427,stack,6426,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6429,stack,6428,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6431,stack,6430,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6433,stack,6432,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6435,stack,6434,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testPushPeekPop_remove1596() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPushPeekPop_remove1596");
        final ArrayStack<E> stack = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6413,!(stack.empty()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6415,stack,6414,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6417,stack,6416,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6419,stack,6418,stack.size());
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6421,stack,6420,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6423,stack,6422,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6425,stack,6424,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6427,stack,6426,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6429,stack,6428,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6431,stack,6430,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6433,stack,6432,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6435,stack,6434,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testPushPeekPop_remove1597() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPushPeekPop_remove1597");
        final ArrayStack<E> stack = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6413,!(stack.empty()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6415,stack,6414,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6417,stack,6416,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6419,stack,6418,stack.size());
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6421,stack,6420,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6423,stack,6422,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6425,stack,6424,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6427,stack,6426,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6429,stack,6428,((java.lang.String)(stack.peek())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6431,stack,6430,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6433,stack,6432,((java.lang.String)(stack.pop())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6435,stack,6434,stack.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public void testSearch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("First Item")));
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6437,stack,6436,stack.search("Second Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6439,stack,6438,stack.search("First Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6440,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6442,stack,6441,stack.search("Missing Item"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testSearch_add2046() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_add2046");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("First Item")));
        stack.push(((E)("First Item")));
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6437,stack,6436,stack.search("Second Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6439,stack,6438,stack.search("First Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6440,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6442,stack,6441,stack.search("Missing Item"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testSearch_add2047() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_add2047");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("First Item")));
        stack.push(((E)("Second Item")));
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6437,stack,6436,stack.search("Second Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6439,stack,6438,stack.search("First Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6440,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6442,stack,6441,stack.search("Missing Item"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1959() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1959");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("First Item")));
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6437,stack,6436,stack.search("Second Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6439,stack,6438,stack.search("First Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6440,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6442,stack,6441,stack.search("Missing Item"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1960() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1960");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("foo")));
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6437,stack,6436,stack.search("Second Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6439,stack,6438,stack.search("First Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6440,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6442,stack,6441,stack.search("Missing Item"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1961() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1961");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("First Item")));
        stack.push(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6437,stack,6436,stack.search("Second Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6439,stack,6438,stack.search("First Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6440,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6442,stack,6441,stack.search("Missing Item"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testSearch_remove1598() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_remove1598");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6437,stack,6436,stack.search("Second Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6439,stack,6438,stack.search("First Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6440,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6442,stack,6441,stack.search("Missing Item"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testSearch_remove1599() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_remove1599");
        final ArrayStack<E> stack = makeObject();
        stack.push(((E)("Second Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6437,stack,6436,stack.search("Second Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6439,stack,6438,stack.search("First Item"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6440,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6442,stack,6441,stack.search("Missing Item"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

