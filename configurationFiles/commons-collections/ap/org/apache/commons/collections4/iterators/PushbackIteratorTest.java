package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;

/** 
 * Tests the PushbackIterator.
 * 
 * @version $Id$
 */
public class PushbackIteratorTest<E> extends AbstractIteratorTest<E> {
    private String[] testArray = new String[]{ "a" , "b" , "c" };

    private List<E> testList;

    public PushbackIteratorTest(final String testName) {
        super(testName);
    }

    /** 
     * {@inheritDoc}
     */
@SuppressWarnings(value = "unchecked")
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        testList = new ArrayList<E>(java.util.Arrays.asList(((E[])(testArray))));
    }

    @Override
    public Iterator<E> makeEmptyIterator() {
        return PushbackIterator.pushbackIterator(java.util.Collections.<E>emptyList().iterator());
    }

    @Override
    public PushbackIterator<E> makeObject() {
        return PushbackIterator.pushbackIterator(testList.iterator());
    }

    @Override
    public boolean supportsRemove() {
        return false;
    }

    @Test
    public void testNormalIteration() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNormalIteration");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4185,iter,4184,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4187,iter,4186,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4189,iter,4188,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4191,iter,4190,iter.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testImmediatePushback_add1184() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testImmediatePushback_add1184");
        PushbackIterator<E> iter = makeObject();
        iter.pushback(((E)("x")));
        iter.pushback(((E)("x")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4173,iter,4172,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4175,iter,4174,iter.next());
        validate(iter, "b", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testImmediatePushback_add1185() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testImmediatePushback_add1185");
        PushbackIterator<E> iter = makeObject();
        iter.pushback(((E)("x")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4173,iter,4172,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4175,iter,4174,iter.next());
        validate(iter, "b", "c");
        validate(iter, "b", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    @SuppressWarnings(value = "unchecked")
    public void testImmediatePushback() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testImmediatePushback");
        PushbackIterator<E> iter = makeObject();
        iter.pushback(((E)("x")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4173,iter,4172,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4175,iter,4174,iter.next());
        validate(iter, "b", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    @SuppressWarnings(value = "unchecked")
    public void testImmediatePushback_literalMutation1143() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testImmediatePushback_literalMutation1143");
        PushbackIterator<E> iter = makeObject();
        iter.pushback(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4173,iter,4172,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4175,iter,4174,iter.next());
        validate(iter, "b", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    @SuppressWarnings(value = "unchecked")
    public void testImmediatePushback_literalMutation1144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testImmediatePushback_literalMutation1144");
        PushbackIterator<E> iter = makeObject();
        iter.pushback(((E)("x")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4173,iter,4172,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4175,iter,4174,iter.next());
        validate(iter, "foo", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    @SuppressWarnings(value = "unchecked")
    public void testImmediatePushback_literalMutation1145() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testImmediatePushback_literalMutation1145");
        PushbackIterator<E> iter = makeObject();
        iter.pushback(((E)("x")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4173,iter,4172,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4175,iter,4174,iter.next());
        validate(iter, "b", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testImmediatePushback_remove875() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testImmediatePushback_remove875");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4173,iter,4172,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4175,iter,4174,iter.next());
        validate(iter, "b", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testImmediatePushback_remove876() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testImmediatePushback_remove876");
        PushbackIterator<E> iter = makeObject();
        iter.pushback(((E)("x")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4173,iter,4172,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4175,iter,4174,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testDelayedPushback_add1182() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelayedPushback_add1182");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4167,iter,4166,iter.next());
        iter.pushback(((E)("x")));
        iter.pushback(((E)("x")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4169,iter,4168,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4171,iter,4170,iter.next());
        validate(iter, "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testDelayedPushback_add1183() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelayedPushback_add1183");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4167,iter,4166,iter.next());
        iter.pushback(((E)("x")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4169,iter,4168,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4171,iter,4170,iter.next());
        validate(iter, "c");
        validate(iter, "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    @SuppressWarnings(value = "unchecked")
    public void testDelayedPushback() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelayedPushback");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4167,iter,4166,iter.next());
        iter.pushback(((E)("x")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4169,iter,4168,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4171,iter,4170,iter.next());
        validate(iter, "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    @SuppressWarnings(value = "unchecked")
    public void testDelayedPushback_literalMutation1140() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelayedPushback_literalMutation1140");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4167,iter,4166,iter.next());
        iter.pushback(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4169,iter,4168,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4171,iter,4170,iter.next());
        validate(iter, "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    @SuppressWarnings(value = "unchecked")
    public void testDelayedPushback_literalMutation1141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelayedPushback_literalMutation1141");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4167,iter,4166,iter.next());
        iter.pushback(((E)("x")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4169,iter,4168,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4171,iter,4170,iter.next());
        validate(iter, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testDelayedPushback_remove873() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelayedPushback_remove873");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4167,iter,4166,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4169,iter,4168,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4171,iter,4170,iter.next());
        validate(iter, "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testDelayedPushback_remove874() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDelayedPushback_remove874");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4167,iter,4166,iter.next());
        iter.pushback(((E)("x")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4169,iter,4168,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4171,iter,4170,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testMultiplePushback_add1186() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiplePushback_add1186");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4177,iter,4176,iter.next());
        iter.pushback(((E)("x")));
        iter.pushback(((E)("x")));
        iter.pushback(((E)("y")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4179,iter,4178,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4181,iter,4180,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4183,iter,4182,iter.next());
        validate(iter, "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testMultiplePushback_add1187() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiplePushback_add1187");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4177,iter,4176,iter.next());
        iter.pushback(((E)("x")));
        iter.pushback(((E)("y")));
        iter.pushback(((E)("y")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4179,iter,4178,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4181,iter,4180,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4183,iter,4182,iter.next());
        validate(iter, "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testMultiplePushback_add1188() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiplePushback_add1188");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4177,iter,4176,iter.next());
        iter.pushback(((E)("x")));
        iter.pushback(((E)("y")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4179,iter,4178,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4181,iter,4180,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4183,iter,4182,iter.next());
        validate(iter, "c");
        validate(iter, "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    @SuppressWarnings(value = "unchecked")
    public void testMultiplePushback() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiplePushback");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4177,iter,4176,iter.next());
        iter.pushback(((E)("x")));
        iter.pushback(((E)("y")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4179,iter,4178,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4181,iter,4180,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4183,iter,4182,iter.next());
        validate(iter, "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    @SuppressWarnings(value = "unchecked")
    public void testMultiplePushback_literalMutation1147() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiplePushback_literalMutation1147");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4177,iter,4176,iter.next());
        iter.pushback(((E)("foo")));
        iter.pushback(((E)("y")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4179,iter,4178,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4181,iter,4180,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4183,iter,4182,iter.next());
        validate(iter, "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    @SuppressWarnings(value = "unchecked")
    public void testMultiplePushback_literalMutation1148() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiplePushback_literalMutation1148");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4177,iter,4176,iter.next());
        iter.pushback(((E)("x")));
        iter.pushback(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4179,iter,4178,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4181,iter,4180,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4183,iter,4182,iter.next());
        validate(iter, "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    @SuppressWarnings(value = "unchecked")
    public void testMultiplePushback_literalMutation1149() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiplePushback_literalMutation1149");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4177,iter,4176,iter.next());
        iter.pushback(((E)("x")));
        iter.pushback(((E)("y")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4179,iter,4178,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4181,iter,4180,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4183,iter,4182,iter.next());
        validate(iter, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testMultiplePushback_remove877() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiplePushback_remove877");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4177,iter,4176,iter.next());
        iter.pushback(((E)("y")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4179,iter,4178,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4181,iter,4180,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4183,iter,4182,iter.next());
        validate(iter, "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testMultiplePushback_remove878() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiplePushback_remove878");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4177,iter,4176,iter.next());
        iter.pushback(((E)("y")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4179,iter,4178,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4181,iter,4180,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4183,iter,4182,iter.next());
        validate(iter, "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testMultiplePushback_remove879() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiplePushback_remove879");
        PushbackIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4177,iter,4176,iter.next());
        iter.pushback(((E)("x")));
        iter.pushback(((E)("y")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4179,iter,4178,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4181,iter,4180,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4183,iter,4182,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void validate(Iterator<E> iter, Object... items) {
        for (final Object x : items) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4193,iter,4192,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4194,x);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4196,iter,4195,iter.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4198,iter,4197,iter.hasNext());
    }
}

